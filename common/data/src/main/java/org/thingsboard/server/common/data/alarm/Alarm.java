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
package org.thingsboard.server.common.data.alarm;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.thingsboard.server.common.data.BaseData;
import org.thingsboard.server.common.data.HasCustomerId;
import org.thingsboard.server.common.data.HasName;
import org.thingsboard.server.common.data.HasTenantId;
import org.thingsboard.server.common.data.id.AlarmId;
import org.thingsboard.server.common.data.id.CustomerId;
import org.thingsboard.server.common.data.id.EntityId;
import org.thingsboard.server.common.data.id.TenantId;

import java.util.List;

/**
 * Created by ashvayka on 11.05.17.
 */
@ApiModel
@Data
@Builder
@AllArgsConstructor
public class Alarm extends BaseData<AlarmId> implements HasName, HasTenantId, HasCustomerId {

    @ApiModelProperty(position = 3, value = "JSON object with Tenant Id", readOnly = true)
    private TenantId tenantId;

    @ApiModelProperty(position = 4, value = "JSON object with Customer Id", readOnly = true)
    private CustomerId customerId;

    @ApiModelProperty(position = 6, required = true, value = "representing type of the Alarm", example = "High Temperature Alarm")
    private String type;
    @ApiModelProperty(position = 7, required = true, value = "JSON object with alarm originator id")
    private EntityId originator;
    @ApiModelProperty(position = 8, required = true, value = "Alarm severity", example = "CRITICAL")
    private AlarmSeverity severity;
    @ApiModelProperty(position = 9, required = true, value = "Alarm status", example = "CLEARED_UNACK")
    private AlarmStatus status;
    @ApiModelProperty(position = 10, value = "Timestamp of the alarm start time, in milliseconds", example = "1634058704565")
    private long startTs;
    @ApiModelProperty(position = 11, value = "Timestamp of the alarm end time(last time update), in milliseconds", example = "1634111163522")
    private long endTs;
    @ApiModelProperty(position = 12, value = "Timestamp of the alarm acknowledgement, in milliseconds", example = "1634115221948")
    private long ackTs;
    @ApiModelProperty(position = 13, value = "Timestamp of the alarm clearing, in milliseconds", example = "1634114528465")
    private long clearTs;
    @ApiModelProperty(position = 14, value = "JSON object with alarm details")
    private transient JsonNode details;
    @ApiModelProperty(position = 15, value = "Propagation flag to specify if alarm should be propagated to parent entities of alarm originator", example = "true")
    private boolean propagate;
    @ApiModelProperty(position = 16, value = "JSON array of relation types that should be used for propagation. " +
            "By default, 'propagateRelationTypes' array is empty which means that the alarm will be propagated based on any relation type to parent entities. " +
            "This parameter should be used only in case when 'propagate' parameter is set to true, otherwise, 'propagateRelationTypes' array will be ignored.")
    private List<String> propagateRelationTypes;

    public Alarm() {
        super();
    }

    public Alarm(AlarmId id) {
        super(id);
    }

    public Alarm(Alarm alarm) {
        super(alarm.getId());
        this.createdTime = alarm.getCreatedTime();
        this.tenantId = alarm.getTenantId();
        this.customerId = alarm.getCustomerId();
        this.type = alarm.getType();
        this.originator = alarm.getOriginator();
        this.severity = alarm.getSeverity();
        this.status = alarm.getStatus();
        this.startTs = alarm.getStartTs();
        this.endTs = alarm.getEndTs();
        this.ackTs = alarm.getAckTs();
        this.clearTs = alarm.getClearTs();
        this.details = alarm.getDetails();
        this.propagate = alarm.isPropagate();
        this.propagateRelationTypes = alarm.getPropagateRelationTypes();
    }

    @Override
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    @ApiModelProperty(position = 5, required = true, value = "representing type of the Alarm", example = "High Temperature Alarm")
    public String getName() {
        return type;
    }

    @ApiModelProperty(position = 1, value = "JSON object with the alarm Id. " +
            "Specify this field to update the alarm. " +
            "Referencing non-existing alarm Id will cause error. " +
            "Omit this field to create new alarm." )
    @Override
    public AlarmId getId() {
        return super.getId();
    }


    @ApiModelProperty(position = 2, value = "Timestamp of the alarm creation, in milliseconds", example = "1634058704567", readOnly = true)
    @Override
    public long getCreatedTime() {
        return super.getCreatedTime();
    }

}
