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
package org.thingsboard.server.common.data;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;
import org.thingsboard.server.common.data.id.DeviceProfileId;
import org.thingsboard.server.common.data.id.OtaPackageId;
import org.thingsboard.server.common.data.id.TenantId;
import org.thingsboard.server.common.data.ota.ChecksumAlgorithm;
import org.thingsboard.server.common.data.ota.OtaPackageType;

@ApiModel
@Slf4j
@Data
@EqualsAndHashCode(callSuper = true)
public class OtaPackageInfo extends SearchTextBasedWithAdditionalInfo<OtaPackageId> implements HasName, HasTenantId {

    private static final long serialVersionUID = 3168391583570815419L;

    @ApiModelProperty(position = 3, value = "JSON object with Tenant Id. Tenant Id of the ota package can't be changed.", readOnly = true)
    private TenantId tenantId;
    @ApiModelProperty(position = 4, value = "JSON object with Device Profile Id. Device Profile Id of the ota package can't be changed.", readOnly = true)
    private DeviceProfileId deviceProfileId;
    @ApiModelProperty(position = 5, value = "OTA Package type.", example = "FIRMWARE", readOnly = true)
    private OtaPackageType type;
    @ApiModelProperty(position = 6, value = "OTA Package title.", example = "fw", readOnly = true)
    private String title;
    @ApiModelProperty(position = 7, value = "OTA Package version.", example = "1.0", readOnly = true)
    private String version;
    @ApiModelProperty(position = 8, value = "OTA Package tag.", example = "fw_1.0", readOnly = true)
    private String tag;
    @ApiModelProperty(position = 9, value = "OTA Package url.", example = "http://thingsboard.org/fw/1", readOnly = true)
    private String url;
    @ApiModelProperty(position = 10, value = "Indicates OTA Package 'has data'. Field is returned from DB ('true' if data exists or url is set).  If OTA Package 'has data' is 'false' we can not assign the OTA Package to the Device or Device Profile.", example = "true", readOnly = true)
    private boolean hasData;
    @ApiModelProperty(position = 11, value = "OTA Package file name.", example = "fw_1.0", readOnly = true)
    private String fileName;
    @ApiModelProperty(position = 12, value = "OTA Package content type.", example = "APPLICATION_OCTET_STREAM", readOnly = true)
    private String contentType;
    @ApiModelProperty(position = 13, value = "OTA Package checksum algorithm.", example = "CRC32", readOnly = true)
    private ChecksumAlgorithm checksumAlgorithm;
    @ApiModelProperty(position = 14, value = "OTA Package checksum.", example = "0xd87f7e0c", readOnly = true)
    private String checksum;
    @ApiModelProperty(position = 15, value = "OTA Package data size.", example = "8", readOnly = true)
    private Long dataSize;

    public OtaPackageInfo() {
        super();
    }

    public OtaPackageInfo(OtaPackageId id) {
        super(id);
    }

    public OtaPackageInfo(OtaPackageInfo otaPackageInfo) {
        super(otaPackageInfo);
        this.tenantId = otaPackageInfo.getTenantId();
        this.deviceProfileId = otaPackageInfo.getDeviceProfileId();
        this.type = otaPackageInfo.getType();
        this.title = otaPackageInfo.getTitle();
        this.version = otaPackageInfo.getVersion();
        this.tag = otaPackageInfo.getTag();
        this.url = otaPackageInfo.getUrl();
        this.hasData = otaPackageInfo.isHasData();
        this.fileName = otaPackageInfo.getFileName();
        this.contentType = otaPackageInfo.getContentType();
        this.checksumAlgorithm = otaPackageInfo.getChecksumAlgorithm();
        this.checksum = otaPackageInfo.getChecksum();
        this.dataSize = otaPackageInfo.getDataSize();
    }

    @ApiModelProperty(position = 1, value = "JSON object with the ota package Id. " +
            "Specify existing ota package Id to update the ota package. " +
            "Referencing non-existing ota package id will cause error. " +
            "Omit this field to create new ota package.")
    @Override
    public OtaPackageId getId() {
        return super.getId();
    }

    @ApiModelProperty(position = 2, value = "Timestamp of the ota package creation, in milliseconds", example = "1609459200000", readOnly = true)
    @Override
    public long getCreatedTime() {
        return super.getCreatedTime();
    }

    @Override
    public String getSearchText() {
        return title;
    }

    @Override
    @JsonIgnore
    public String getName() {
        return title;
    }

    @JsonIgnore
    public boolean hasUrl() {
        return StringUtils.isNotEmpty(url);
    }

    @ApiModelProperty(position = 17, value = "OTA Package description.", example = "Description for the OTA Package fw_1.0")
    @Override
    public JsonNode getAdditionalInfo() {
        return super.getAdditionalInfo();
    }
}
