/**
 * Copyright © 2016-2021 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.thingsboard.server.common.data.Tenant;
import org.thingsboard.server.common.data.TenantInfo;
import org.thingsboard.server.common.data.exception.ThingsboardException;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.page.PageData;
import org.thingsboard.server.common.data.page.PageLink;
import org.thingsboard.server.common.data.plugin.ComponentLifecycleEvent;
import org.thingsboard.server.dao.tenant.TenantService;
import org.thingsboard.server.queue.util.TbCoreComponent;
import org.thingsboard.server.service.install.InstallScripts;
import org.thingsboard.server.service.security.permission.Operation;
import org.thingsboard.server.service.security.permission.Resource;

import static org.thingsboard.server.controller.ControllerConstants.HOME_DASHBOARD;
import static org.thingsboard.server.controller.ControllerConstants.PAGE_DATA_PARAMETERS;
import static org.thingsboard.server.controller.ControllerConstants.PAGE_NUMBER_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.PAGE_SIZE_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.SORT_ORDER_ALLOWABLE_VALUES;
import static org.thingsboard.server.controller.ControllerConstants.SORT_ORDER_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.SORT_PROPERTY_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.SYSTEM_AUTHORITY_PARAGRAPH;
import static org.thingsboard.server.controller.ControllerConstants.SYSTEM_OR_TENANT_AUTHORITY_PARAGRAPH;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_ID;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_ID_PARAM_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_INFO_SORT_PROPERTY_ALLOWABLE_VALUES;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_SORT_PROPERTY_ALLOWABLE_VALUES;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_TEXT_SEARCH_DESCRIPTION;

@RestController
@TbCoreComponent
@RequestMapping("/api")
@Slf4j
public class TenantController extends BaseController {

    private static final String TENANT_INFO_DESCRIPTION = "The Tenant Info object extends regular Tenant object and includes Tenant Profile name. ";
    @Autowired
    private InstallScripts installScripts;

    @Autowired
    private TenantService tenantService;

    @ApiOperation(value = "Get Tenant (getTenantById)",
            notes = "Fetch the Tenant object based on the provided Tenant Id. " + SYSTEM_OR_TENANT_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAnyAuthority('SYS_ADMIN', 'TENANT_ADMIN')")
    @RequestMapping(value = "/tenant/{tenantId}", method = RequestMethod.GET)
    @ResponseBody
    public Tenant getTenantById(
            @ApiParam(value = TENANT_ID_PARAM_DESCRIPTION)
            @PathVariable(TENANT_ID) String strTenantId) throws ThingsboardException {
        checkParameter(TENANT_ID, strTenantId);
        try {
            TenantId tenantId = new TenantId(toUUID(strTenantId));
            Tenant tenant = checkTenantId(tenantId, Operation.READ);
            if (!tenant.getAdditionalInfo().isNull()) {
                processDashboardIdFromAdditionalInfo((ObjectNode) tenant.getAdditionalInfo(), HOME_DASHBOARD);
            }
            return tenant;
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Get Tenant Info (getTenantInfoById)",
            notes = "Fetch the Tenant Info object based on the provided Tenant Id. " +
                    TENANT_INFO_DESCRIPTION + SYSTEM_OR_TENANT_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAnyAuthority('SYS_ADMIN', 'TENANT_ADMIN')")
    @RequestMapping(value = "/tenant/info/{tenantId}", method = RequestMethod.GET)
    @ResponseBody
    public TenantInfo getTenantInfoById(
            @ApiParam(value = TENANT_ID_PARAM_DESCRIPTION)
            @PathVariable(TENANT_ID) String strTenantId) throws ThingsboardException {
        checkParameter(TENANT_ID, strTenantId);
        try {
            TenantId tenantId = new TenantId(toUUID(strTenantId));
            return checkTenantInfoId(tenantId, Operation.READ);
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Create Or update Tenant (saveTenant)",
            notes = "Create or update the Tenant. When creating tenant, platform generates Tenant Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address). " +
                    "Default Rule Chain and Device profile are also generated for the new tenants automatically. " +
                    "The newly created Tenant Id will be present in the response. " +
                    "Specify existing Tenant Id id to update the Tenant. " +
                    "Referencing non-existing Tenant Id will cause 'Not Found' error." +
                    SYSTEM_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('SYS_ADMIN')")
    @RequestMapping(value = "/tenant", method = RequestMethod.POST)
    @ResponseBody
    public Tenant saveTenant(
            @ApiParam(value = "A JSON value representing the tenant.")
            @RequestBody Tenant tenant) throws ThingsboardException {
        try {
            boolean newTenant = tenant.getId() == null;

            checkEntity(tenant.getId(), tenant, Resource.TENANT);

            tenant = checkNotNull(tenantService.saveTenant(tenant));
            if (newTenant) {
                installScripts.createDefaultRuleChains(tenant.getId());
                installScripts.createDefaultEdgeRuleChains(tenant.getId());
            }
            tenantProfileCache.evict(tenant.getId());
            tbClusterService.onTenantChange(tenant, null);
            tbClusterService.broadcastEntityStateChangeEvent(tenant.getId(), tenant.getId(),
                    newTenant ? ComponentLifecycleEvent.CREATED : ComponentLifecycleEvent.UPDATED);
            return tenant;
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Delete Tenant (deleteTenant)",
            notes = "Deletes the tenant, it's customers, rule chains, devices and all other related entities. Referencing non-existing tenant Id will cause an error." + SYSTEM_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('SYS_ADMIN')")
    @RequestMapping(value = "/tenant/{tenantId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteTenant(
            @ApiParam(value = TENANT_ID_PARAM_DESCRIPTION)
            @PathVariable(TENANT_ID) String strTenantId) throws ThingsboardException {
        checkParameter(TENANT_ID, strTenantId);
        try {
            TenantId tenantId = new TenantId(toUUID(strTenantId));
            Tenant tenant = checkTenantId(tenantId, Operation.DELETE);
            tenantService.deleteTenant(tenantId);
            tenantProfileCache.evict(tenantId);
            tbClusterService.onTenantDelete(tenant, null);
            tbClusterService.broadcastEntityStateChangeEvent(tenantId, tenantId, ComponentLifecycleEvent.DELETED);
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Get Tenants (getTenants)", notes = "Returns a page of tenants registered in the platform. " + PAGE_DATA_PARAMETERS + SYSTEM_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('SYS_ADMIN')")
    @RequestMapping(value = "/tenants", params = {"pageSize", "page"}, method = RequestMethod.GET)
    @ResponseBody
    public PageData<Tenant> getTenants(
            @ApiParam(value = PAGE_SIZE_DESCRIPTION, required = true)
            @RequestParam int pageSize,
            @ApiParam(value = PAGE_NUMBER_DESCRIPTION, required = true)
            @RequestParam int page,
            @ApiParam(value = TENANT_TEXT_SEARCH_DESCRIPTION)
            @RequestParam(required = false) String textSearch,
            @ApiParam(value = SORT_PROPERTY_DESCRIPTION, allowableValues = TENANT_SORT_PROPERTY_ALLOWABLE_VALUES)
            @RequestParam(required = false) String sortProperty,
            @ApiParam(value = SORT_ORDER_DESCRIPTION, allowableValues = SORT_ORDER_ALLOWABLE_VALUES)
            @RequestParam(required = false) String sortOrder) throws ThingsboardException {
        try {
            PageLink pageLink = createPageLink(pageSize, page, textSearch, sortProperty, sortOrder);
            return checkNotNull(tenantService.findTenants(pageLink));
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Get Tenants Info (getTenants)", notes = "Returns a page of tenant info objects registered in the platform. "
            + TENANT_INFO_DESCRIPTION + PAGE_DATA_PARAMETERS + SYSTEM_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('SYS_ADMIN')")
    @RequestMapping(value = "/tenantInfos", params = {"pageSize", "page"}, method = RequestMethod.GET)
    @ResponseBody
    public PageData<TenantInfo> getTenantInfos(
            @ApiParam(value = PAGE_SIZE_DESCRIPTION, required = true)
            @RequestParam int pageSize,
            @ApiParam(value = PAGE_NUMBER_DESCRIPTION, required = true)
            @RequestParam int page,
            @ApiParam(value = TENANT_TEXT_SEARCH_DESCRIPTION)
            @RequestParam(required = false) String textSearch,
            @ApiParam(value = SORT_PROPERTY_DESCRIPTION, allowableValues = TENANT_INFO_SORT_PROPERTY_ALLOWABLE_VALUES)
            @RequestParam(required = false) String sortProperty,
            @ApiParam(value = SORT_ORDER_DESCRIPTION, allowableValues = SORT_ORDER_ALLOWABLE_VALUES)
            @RequestParam(required = false) String sortOrder
    ) throws ThingsboardException {
        try {
            PageLink pageLink = createPageLink(pageSize, page, textSearch, sortProperty, sortOrder);
            return checkNotNull(tenantService.findTenantInfos(pageLink));
        } catch (Exception e) {
            throw handleException(e);
        }
    }

}
