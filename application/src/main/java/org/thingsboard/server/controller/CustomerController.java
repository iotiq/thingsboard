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

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
import org.thingsboard.server.common.data.Customer;
import org.thingsboard.server.common.data.EntityType;
import org.thingsboard.server.common.data.audit.ActionType;
import org.thingsboard.server.common.data.edge.EdgeEventActionType;
import org.thingsboard.server.common.data.exception.ThingsboardException;
import org.thingsboard.server.common.data.id.CustomerId;
import org.thingsboard.server.common.data.id.EdgeId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.page.PageData;
import org.thingsboard.server.common.data.page.PageLink;
import org.thingsboard.server.common.data.plugin.ComponentLifecycleEvent;
import org.thingsboard.server.queue.util.TbCoreComponent;
import org.thingsboard.server.service.security.permission.Operation;
import org.thingsboard.server.service.security.permission.Resource;

import java.util.List;

import static org.thingsboard.server.controller.ControllerConstants.CUSTOMER_ID;
import static org.thingsboard.server.controller.ControllerConstants.CUSTOMER_ID_PARAM_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.CUSTOMER_SORT_PROPERTY_ALLOWABLE_VALUES;
import static org.thingsboard.server.controller.ControllerConstants.CUSTOMER_TEXT_SEARCH_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.HOME_DASHBOARD;
import static org.thingsboard.server.controller.ControllerConstants.PAGE_DATA_PARAMETERS;
import static org.thingsboard.server.controller.ControllerConstants.PAGE_NUMBER_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.PAGE_SIZE_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.SORT_ORDER_ALLOWABLE_VALUES;
import static org.thingsboard.server.controller.ControllerConstants.SORT_ORDER_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.SORT_PROPERTY_DESCRIPTION;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_AUTHORITY_PARAGRAPH;
import static org.thingsboard.server.controller.ControllerConstants.TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH;

@RestController
@TbCoreComponent
@RequestMapping("/api")
public class CustomerController extends BaseController {

    public static final String IS_PUBLIC = "isPublic";
    public static final String CUSTOMER_SECURITY_CHECK = "If the user has the authority of 'Tenant Administrator', the server checks that the customer is owned by the same tenant. " +
            "If the user has the authority of 'Customer User', the server checks that the user belongs to the customer.";

    @ApiOperation(value = "Get Customer (getCustomerById)",
            notes = "Get the Customer object based on the provided Customer Id. "
                    + CUSTOMER_SECURITY_CHECK + TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAnyAuthority('TENANT_ADMIN', 'CUSTOMER_USER')")
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.GET)
    @ResponseBody
    public Customer getCustomerById(
            @ApiParam(value = CUSTOMER_ID_PARAM_DESCRIPTION)
            @PathVariable(CUSTOMER_ID) String strCustomerId) throws ThingsboardException {
        checkParameter(CUSTOMER_ID, strCustomerId);
        try {
            CustomerId customerId = new CustomerId(toUUID(strCustomerId));
            Customer customer = checkCustomerId(customerId, Operation.READ);
            if (!customer.getAdditionalInfo().isNull()) {
                processDashboardIdFromAdditionalInfo((ObjectNode) customer.getAdditionalInfo(), HOME_DASHBOARD);
            }
            return customer;
        } catch (Exception e) {
            throw handleException(e);
        }
    }


    @ApiOperation(value = "Get short Customer info (getShortCustomerInfoById)",
            notes = "Get the short customer object that contains only the title and 'isPublic' flag. "
                    + CUSTOMER_SECURITY_CHECK + TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAnyAuthority('TENANT_ADMIN', 'CUSTOMER_USER')")
    @RequestMapping(value = "/customer/{customerId}/shortInfo", method = RequestMethod.GET)
    @ResponseBody
    public JsonNode getShortCustomerInfoById(
            @ApiParam(value = CUSTOMER_ID_PARAM_DESCRIPTION)
            @PathVariable(CUSTOMER_ID) String strCustomerId) throws ThingsboardException {
        checkParameter(CUSTOMER_ID, strCustomerId);
        try {
            CustomerId customerId = new CustomerId(toUUID(strCustomerId));
            Customer customer = checkCustomerId(customerId, Operation.READ);
            ObjectMapper objectMapper = new ObjectMapper();
            ObjectNode infoObject = objectMapper.createObjectNode();
            infoObject.put("title", customer.getTitle());
            infoObject.put(IS_PUBLIC, customer.isPublic());
            return infoObject;
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Get Customer Title (getCustomerTitleById)",
            notes = "Get the title of the customer. "
                    + CUSTOMER_SECURITY_CHECK + TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAnyAuthority('TENANT_ADMIN', 'CUSTOMER_USER')")
    @RequestMapping(value = "/customer/{customerId}/title", method = RequestMethod.GET, produces = "application/text")
    @ResponseBody
    public String getCustomerTitleById(
            @ApiParam(value = CUSTOMER_ID_PARAM_DESCRIPTION)
            @PathVariable(CUSTOMER_ID) String strCustomerId) throws ThingsboardException {
        checkParameter(CUSTOMER_ID, strCustomerId);
        try {
            CustomerId customerId = new CustomerId(toUUID(strCustomerId));
            Customer customer = checkCustomerId(customerId, Operation.READ);
            return customer.getTitle();
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Create or update Customer (saveCustomer)",
            notes = "Creates or Updates the Customer. When creating customer, platform generates Customer Id as [time-based UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Version_1_(date-time_and_MAC_address) " +
                    "The newly created Customer Id will be present in the response. " +
                    "Specify existing Customer Id to update the Customer. " +
                    "Referencing non-existing Customer Id will cause 'Not Found' error." + TENANT_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('TENANT_ADMIN')")
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    @ResponseBody
    public Customer saveCustomer(@ApiParam(value = "A JSON value representing the customer.") @RequestBody Customer customer) throws ThingsboardException {
        try {
            customer.setTenantId(getCurrentUser().getTenantId());

            checkEntity(customer.getId(), customer, Resource.CUSTOMER);

            Customer savedCustomer = checkNotNull(customerService.saveCustomer(customer));

            logEntityAction(savedCustomer.getId(), savedCustomer,
                    savedCustomer.getId(),
                    customer.getId() == null ? ActionType.ADDED : ActionType.UPDATED, null);

            if (customer.getId() != null) {
                sendEntityNotificationMsg(savedCustomer.getTenantId(), savedCustomer.getId(), EdgeEventActionType.UPDATED);
            }

            return savedCustomer;
        } catch (Exception e) {

            logEntityAction(emptyId(EntityType.CUSTOMER), customer,
                    null, customer.getId() == null ? ActionType.ADDED : ActionType.UPDATED, e);

            throw handleException(e);
        }
    }

    @ApiOperation(value = "Delete Customer (deleteCustomer)",
            notes = "Deletes the Customer and all customer Users. " +
                    "All assigned Dashboards, Assets, Devices, etc. will be unassigned but not deleted. " +
                    "Referencing non-existing Customer Id will cause an error." + TENANT_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('TENANT_ADMIN')")
    @RequestMapping(value = "/customer/{customerId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteCustomer(@ApiParam(value = CUSTOMER_ID_PARAM_DESCRIPTION)
                               @PathVariable(CUSTOMER_ID) String strCustomerId) throws ThingsboardException {
        checkParameter(CUSTOMER_ID, strCustomerId);
        try {
            CustomerId customerId = new CustomerId(toUUID(strCustomerId));
            Customer customer = checkCustomerId(customerId, Operation.DELETE);

            List<EdgeId> relatedEdgeIds = findRelatedEdgeIds(getTenantId(), customerId);

            customerService.deleteCustomer(getTenantId(), customerId);

            logEntityAction(customerId, customer,
                    customer.getId(),
                    ActionType.DELETED, null, strCustomerId);

            sendDeleteNotificationMsg(getTenantId(), customerId, relatedEdgeIds);
            tbClusterService.broadcastEntityStateChangeEvent(getTenantId(), customerId, ComponentLifecycleEvent.DELETED);
        } catch (Exception e) {

            logEntityAction(emptyId(EntityType.CUSTOMER),
                    null,
                    null,
                    ActionType.DELETED, e, strCustomerId);

            throw handleException(e);
        }
    }

    @ApiOperation(value = "Get Tenant Customers (getCustomers)",
            notes = "Returns a page of customers owned by tenant. " +
                    PAGE_DATA_PARAMETERS + TENANT_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('TENANT_ADMIN')")
    @RequestMapping(value = "/customers", params = {"pageSize", "page"}, method = RequestMethod.GET)
    @ResponseBody
    public PageData<Customer> getCustomers(
            @ApiParam(value = PAGE_SIZE_DESCRIPTION, required = true)
            @RequestParam int pageSize,
            @ApiParam(value = PAGE_NUMBER_DESCRIPTION, required = true)
            @RequestParam int page,
            @ApiParam(value = CUSTOMER_TEXT_SEARCH_DESCRIPTION)
            @RequestParam(required = false) String textSearch,
            @ApiParam(value = SORT_PROPERTY_DESCRIPTION, allowableValues = CUSTOMER_SORT_PROPERTY_ALLOWABLE_VALUES)
            @RequestParam(required = false) String sortProperty,
            @ApiParam(value = SORT_ORDER_DESCRIPTION, allowableValues = SORT_ORDER_ALLOWABLE_VALUES)
            @RequestParam(required = false) String sortOrder) throws ThingsboardException {
        try {
            PageLink pageLink = createPageLink(pageSize, page, textSearch, sortProperty, sortOrder);
            TenantId tenantId = getCurrentUser().getTenantId();
            return checkNotNull(customerService.findCustomersByTenantId(tenantId, pageLink));
        } catch (Exception e) {
            throw handleException(e);
        }
    }

    @ApiOperation(value = "Get Tenant Customer by Customer title (getTenantCustomer)",
            notes = "Get the Customer using Customer Title. " + TENANT_AUTHORITY_PARAGRAPH)
    @PreAuthorize("hasAuthority('TENANT_ADMIN')")
    @RequestMapping(value = "/tenant/customers", params = {"customerTitle"}, method = RequestMethod.GET)
    @ResponseBody
    public Customer getTenantCustomer(
            @ApiParam(value = "A string value representing the Customer title.")
            @RequestParam String customerTitle) throws ThingsboardException {
        try {
            TenantId tenantId = getCurrentUser().getTenantId();
            return checkNotNull(customerService.findCustomerByTenantIdAndTitle(tenantId, customerTitle));
        } catch (Exception e) {
            throw handleException(e);
        }
    }
}
