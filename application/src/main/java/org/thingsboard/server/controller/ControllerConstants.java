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

public class ControllerConstants {


    protected static final String NEW_LINE = "\n\n";
    protected static final int DEFAULT_PAGE_SIZE = 1000;
    protected static final String ENTITY_TYPE = "entityType";
    protected static final String CUSTOMER_ID = "customerId";
    protected static final String TENANT_ID = "tenantId";
    protected static final String DEVICE_ID = "deviceId";
    protected static final String RPC_ID = "rpcId";
    protected static final String ENTITY_ID = "entityId";
    protected static final String PAGE_DATA_PARAMETERS = "You can specify parameters to filter the results. " +
            "The result is wrapped with PageData object that allows you to iterate over result set using pagination. " +
            "See the 'Model' tab of the Response Class for more details. ";
    protected static final String DASHBOARD_ID_PARAM_DESCRIPTION = "A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String RPC_ID_PARAM_DESCRIPTION = "A string value representing the rpc id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String DEVICE_ID_PARAM_DESCRIPTION = "A string value representing the device id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String DEVICE_PROFILE_ID_PARAM_DESCRIPTION = "A string value representing the device profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String TENANT_PROFILE_ID_PARAM_DESCRIPTION = "A string value representing the tenant profile id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String TENANT_ID_PARAM_DESCRIPTION = "A string value representing the tenant id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String EDGE_ID_PARAM_DESCRIPTION = "A string value representing the edge id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String CUSTOMER_ID_PARAM_DESCRIPTION = "A string value representing the customer id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String USER_ID_PARAM_DESCRIPTION = "A string value representing the user id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String ASSET_ID_PARAM_DESCRIPTION = "A string value representing the asset id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String ALARM_ID_PARAM_DESCRIPTION = "A string value representing the alarm id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String ENTITY_ID_PARAM_DESCRIPTION = "A string value representing the entity id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String OTA_PACKAGE_ID_PARAM_DESCRIPTION = "A string value representing the ota package id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String ENTITY_TYPE_PARAM_DESCRIPTION = "A string value representing the entity type. For example, 'DEVICE'";
    protected static final String RULE_CHAIN_ID_PARAM_DESCRIPTION = "A string value representing the rule chain id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String WIDGET_BUNDLE_ID_PARAM_DESCRIPTION = "A string value representing the widget bundle id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String WIDGET_TYPE_ID_PARAM_DESCRIPTION = "A string value representing the widget type id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String RESOURCE_ID_PARAM_DESCRIPTION = "A string value representing the resource id. For example, '784f394c-42b6-435a-983c-b7beff2784f9'";
    protected static final String SYSTEM_AUTHORITY_PARAGRAPH = "\n\nAvailable for users with 'SYS_ADMIN' authority.";
    protected static final String SYSTEM_OR_TENANT_AUTHORITY_PARAGRAPH = "\n\nAvailable for users with 'SYS_ADMIN' or 'TENANT_ADMIN' authority.";
    protected static final String TENANT_AUTHORITY_PARAGRAPH = "\n\nAvailable for users with 'TENANT_ADMIN' authority.";
    protected static final String TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH = "\n\nAvailable for users with 'TENANT_ADMIN' or 'CUSTOMER_USER' authority.";
    protected static final String CUSTOMER_AUTHORITY_PARAGRAPH = "\n\nAvailable for users with 'CUSTOMER_USER' authority.";
    protected static final String AVAILABLE_FOR_ANY_AUTHORIZED_USER = "\n\nAvailable for any authorized user. ";
    protected static final String PAGE_SIZE_DESCRIPTION = "Maximum amount of entities in a one page";
    protected static final String PAGE_NUMBER_DESCRIPTION = "Sequence number of page starting from 0";
    protected static final String DEVICE_TYPE_DESCRIPTION = "Device type as the name of the device profile";
    protected static final String ASSET_TYPE_DESCRIPTION = "Asset type";
    protected static final String EDGE_TYPE_DESCRIPTION = "A string value representing the edge type. For example, 'default'";
    protected static final String RULE_CHAIN_TYPE_DESCRIPTION = "Rule chain type (CORE or EDGE)";
    protected static final String ASSET_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the asset name.";
    protected static final String DASHBOARD_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the dashboard title.";
    protected static final String WIDGET_BUNDLE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the widget bundle title.";
    protected static final String RPC_TEXT_SEARCH_DESCRIPTION = "Not implemented. Leave empty.";
    protected static final String DEVICE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the device name.";
    protected static final String USER_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the user email.";
    protected static final String TENANT_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the tenant name.";
    protected static final String TENANT_PROFILE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the tenant profile name.";
    protected static final String RULE_CHAIN_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the rule chain name.";
    protected static final String DEVICE_PROFILE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the device profile name.";
    protected static final String CUSTOMER_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the customer title.";
    protected static final String EDGE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the edge name.";
    protected static final String EVENT_TEXT_SEARCH_DESCRIPTION = "The value is not used in searching.";
    protected static final String AUDIT_LOG_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on one of the next properties: entityType, entityName, userName, actionType, actionStatus.";
    protected static final String SORT_PROPERTY_DESCRIPTION = "Property of entity to sort by";
    protected static final String DASHBOARD_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, title";
    protected static final String CUSTOMER_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, title, email, country, city";
    protected static final String RPC_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, expirationTime, request, response";
    protected static final String DEVICE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, name, deviceProfileName, label, customerTitle";
    protected static final String USER_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, firstName, lastName, email";
    protected static final String TENANT_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, title, email, country, state, city, address, address2, zip, phone, email";
    protected static final String TENANT_PROFILE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, name, description, isDefault";
    protected static final String TENANT_PROFILE_INFO_SORT_PROPERTY_ALLOWABLE_VALUES = "id, name";
    protected static final String TENANT_INFO_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, tenantProfileName, title, email, country, state, city, address, address2, zip, phone, email";
    protected static final String DEVICE_PROFILE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, name, type, transportType, description, isDefault";
    protected static final String ASSET_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, name, type, label, customerTitle";
    protected static final String ALARM_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, startTs, endTs, type, ackTs, clearTs, severity, status";
    protected static final String EVENT_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, id";
    protected static final String EDGE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, name, type, label, customerTitle";
    protected static final String RULE_CHAIN_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, name, root";
    protected static final String WIDGET_BUNDLE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, title, tenantId";
    protected static final String AUDIT_LOG_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, entityType, entityName, userName, actionType, actionStatus";
    protected static final String SORT_ORDER_DESCRIPTION = "Sort order. ASC (ASCENDING) or DESC (DESCENDING)";
    protected static final String SORT_ORDER_ALLOWABLE_VALUES = "ASC, DESC";
    protected static final String RPC_STATUS_ALLOWABLE_VALUES = "QUEUED, SENT, DELIVERED, SUCCESSFUL, TIMEOUT, EXPIRED, FAILED";
    protected static final String RULE_CHAIN_TYPES_ALLOWABLE_VALUES = "CORE, EDGE";
    protected static final String TRANSPORT_TYPE_ALLOWABLE_VALUES = "DEFAULT, MQTT, COAP, LWM2M, SNMP";
    protected static final String DEVICE_INFO_DESCRIPTION = "Device Info is an extension of the default Device object that contains information about the assigned customer name and device profile name. ";
    protected static final String ASSET_INFO_DESCRIPTION = "Asset Info is an extension of the default Asset object that contains information about the assigned customer name. ";
    protected static final String ALARM_INFO_DESCRIPTION = "Alarm Info is an extension of the default Alarm object that also contains name of the alarm originator.";
    protected static final String RELATION_INFO_DESCRIPTION = "Relation Info is an extension of the default Relation object that contains information about the 'from' and 'to' entity names. ";
    protected static final String EDGE_INFO_DESCRIPTION = "Edge Info is an extension of the default Edge object that contains information about the assigned customer name. ";
    protected static final String DEVICE_PROFILE_INFO_DESCRIPTION = "Device Profile Info is a lightweight object that includes main information about Device Profile excluding the heavyweight configuration object. ";
    protected static final String QUEUE_SERVICE_TYPE_DESCRIPTION = "Service type (implemented only for the TB-RULE-ENGINE)";
    protected static final String QUEUE_SERVICE_TYPE_ALLOWABLE_VALUES = "TB-RULE-ENGINE, TB-CORE, TB-TRANSPORT, JS-EXECUTOR";
    protected static final String OTA_PACKAGE_INFO_DESCRIPTION = "OTA Package Info is a lightweight object that includes main information about the OTA Package excluding the heavyweight data. ";
    protected static final String OTA_PACKAGE_DESCRIPTION = "OTA Package is a heavyweight object that includes main information about the OTA Package and also data. ";
    protected static final String OTA_PACKAGE_CHECKSUM_ALGORITHM_ALLOWABLE_VALUES = "MD5, SHA256, SHA384, SHA512, CRC32, MURMUR3_32, MURMUR3_128";
    protected static final String OTA_PACKAGE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the ota package title.";
    protected static final String OTA_PACKAGE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, type, title, version, tag, url, fileName, dataSize, checksum";
    protected static final String RESOURCE_INFO_DESCRIPTION = "Resource Info is a lightweight object that includes main information about the Resource excluding the heavyweight data. ";
    protected static final String RESOURCE_DESCRIPTION = "Resource is a heavyweight object that includes main information about the Resource and also data. ";

    protected static final String RESOURCE_TEXT_SEARCH_DESCRIPTION = "The case insensitive 'startsWith' filter based on the resource title.";
    protected static final String RESOURCE_SORT_PROPERTY_ALLOWABLE_VALUES = "createdTime, title, resourceType, tenantId";
    protected static final String LWM2M_OBJECT_DESCRIPTION = "LwM2M Object is a object that includes information about the LwM2M model which can be used in transport configuration for the LwM2M device profile. ";
    protected static final String LWM2M_OBJECT_SORT_PROPERTY_ALLOWABLE_VALUES = "id, name";

    protected static final String DEVICE_NAME_DESCRIPTION = "A string value representing the Device name.";
    protected static final String ASSET_NAME_DESCRIPTION = "A string value representing the Asset name.";

    protected static final String EVENT_START_TIME_DESCRIPTION = "Timestamp. Events with creation time before it won't be queried.";
    protected static final String EVENT_END_TIME_DESCRIPTION = "Timestamp. Events with creation time after it won't be queried.";

    protected static final String EDGE_UNASSIGN_ASYNC_FIRST_STEP_DESCRIPTION = "Unassignment works in async way - first, 'unassign' notification event pushed to edge queue on platform. ";
    protected static final String EDGE_UNASSIGN_RECEIVE_STEP_DESCRIPTION = "(Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform)";
    protected static final String EDGE_ASSIGN_ASYNC_FIRST_STEP_DESCRIPTION = "Assignment works in async way - first, notification event pushed to edge service queue on platform. ";
    protected static final String EDGE_ASSIGN_RECEIVE_STEP_DESCRIPTION = "(Edge will receive this instantly, if it's currently connected, or once it's going to be connected to platform)";

    protected static final String MARKDOWN_CODE_BLOCK_START = "```json\n";
    protected static final String MARKDOWN_CODE_BLOCK_END = "\n```";
    protected static final String EVENT_ERROR_FILTER_OBJ = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"eventType\":\"ERROR\",\n" +
            "   \"server\":\"ip-172-31-24-152\",\n" +
            "   \"method\":\"onClusterEventMsg\",\n" +
            "   \"errorStr\":\"Error Message\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;
    protected static final String EVENT_LC_EVENT_FILTER_OBJ = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"eventType\":\"LC_EVENT\",\n" +
            "   \"server\":\"ip-172-31-24-152\",\n" +
            "   \"event\":\"STARTED\",\n" +
            "   \"status\":\"Success\",\n" +
            "   \"errorStr\":\"Error Message\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;
    protected static final String EVENT_STATS_FILTER_OBJ = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"eventType\":\"STATS\",\n" +
            "   \"server\":\"ip-172-31-24-152\",\n" +
            "   \"messagesProcessed\":10,\n" +
            "   \"errorsOccurred\":5\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;
    protected static final String DEBUG_FILTER_OBJ =
            "   \"msgDirectionType\":\"IN\",\n" +
                    "   \"server\":\"ip-172-31-24-152\",\n" +
                    "   \"dataSearch\":\"humidity\",\n" +
                    "   \"metadataSearch\":\"deviceName\",\n" +
                    "   \"entityName\":\"DEVICE\",\n" +
                    "   \"relationType\":\"Success\",\n" +
                    "   \"entityId\":\"de9d54a0-2b7a-11ec-a3cc-23386423d98f\",\n" +
                    "   \"msgType\":\"POST_TELEMETRY_REQUEST\",\n" +
                    "   \"isError\":\"false\",\n" +
                    "   \"errorStr\":\"Error Message\"\n" +
                    "}";
    protected static final String EVENT_DEBUG_RULE_NODE_FILTER_OBJ = MARKDOWN_CODE_BLOCK_START + "{\n" +
            "   \"eventType\":\"DEBUG_RULE_NODE\",\n" + DEBUG_FILTER_OBJ + MARKDOWN_CODE_BLOCK_END;
    protected static final String EVENT_DEBUG_RULE_CHAIN_FILTER_OBJ = MARKDOWN_CODE_BLOCK_START + "{\n" +
            "   \"eventType\":\"DEBUG_RULE_CHAIN\",\n" + DEBUG_FILTER_OBJ + MARKDOWN_CODE_BLOCK_END;

    protected static final String FILTER_VALUE_TYPE = NEW_LINE + "## Value Type and Operations" + NEW_LINE +
            "Provides a hint about the data type of the entity field that is defined in the filter key. " +
            "The value type impacts the list of possible operations that you may use in the corresponding predicate. For example, you may use 'STARTS_WITH' or 'END_WITH', but you can't use 'GREATER_OR_EQUAL' for string values." +
            "The following filter value types and corresponding predicate operations are supported: " + NEW_LINE +
            " * 'STRING' - used to filter any 'String' or 'JSON' values. Operations: EQUAL, NOT_EQUAL, STARTS_WITH, ENDS_WITH, CONTAINS, NOT_CONTAINS; \n" +
            " * 'NUMERIC' - used for 'Long' and 'Double' values. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL; \n" +
            " * 'BOOLEAN' - used for boolean values. Operations: EQUAL, NOT_EQUAL;\n" +
            " * 'DATE_TIME' - similar to numeric, transforms value to milliseconds since epoch. Operations: EQUAL, NOT_EQUAL, GREATER, LESS, GREATER_OR_EQUAL, LESS_OR_EQUAL; \n";

    protected static final String DEVICE_PROFILE_ALARM_SCHEDULE_SPECIFIC_TIME_EXAMPLE = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"schedule\":{\n" +
            "      \"type\":\"SPECIFIC_TIME\",\n" +
            "      \"endsOn\":64800000,\n" +
            "      \"startsOn\":43200000,\n" +
            "      \"timezone\":\"Europe/Kiev\",\n" +
            "      \"daysOfWeek\":[\n" +
            "         1,\n" +
            "         3,\n" +
            "         5\n" +
            "      ]\n" +
            "   }\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;
    protected static final String DEVICE_PROFILE_ALARM_SCHEDULE_CUSTOM_EXAMPLE = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"schedule\":{\n" +
            "      \"type\":\"CUSTOM\",\n" +
            "      \"items\":[\n" +
            "         {\n" +
            "            \"endsOn\":0,\n" +
            "            \"enabled\":false,\n" +
            "            \"startsOn\":0,\n" +
            "            \"dayOfWeek\":1\n" +
            "         },\n" +
            "         {\n" +
            "            \"endsOn\":64800000,\n" +
            "            \"enabled\":true,\n" +
            "            \"startsOn\":43200000,\n" +
            "            \"dayOfWeek\":2\n" +
            "         },\n" +
            "         {\n" +
            "            \"endsOn\":0,\n" +
            "            \"enabled\":false,\n" +
            "            \"startsOn\":0,\n" +
            "            \"dayOfWeek\":3\n" +
            "         },\n" +
            "         {\n" +
            "            \"endsOn\":57600000,\n" +
            "            \"enabled\":true,\n" +
            "            \"startsOn\":36000000,\n" +
            "            \"dayOfWeek\":4\n" +
            "         },\n" +
            "         {\n" +
            "            \"endsOn\":0,\n" +
            "            \"enabled\":false,\n" +
            "            \"startsOn\":0,\n" +
            "            \"dayOfWeek\":5\n" +
            "         },\n" +
            "         {\n" +
            "            \"endsOn\":0,\n" +
            "            \"enabled\":false,\n" +
            "            \"startsOn\":0,\n" +
            "            \"dayOfWeek\":6\n" +
            "         },\n" +
            "         {\n" +
            "            \"endsOn\":0,\n" +
            "            \"enabled\":false,\n" +
            "            \"startsOn\":0,\n" +
            "            \"dayOfWeek\":7\n" +
            "         }\n" +
            "      ],\n" +
            "      \"timezone\":\"Europe/Kiev\"\n" +
            "   }\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;
    protected static final String DEVICE_PROFILE_ALARM_SCHEDULE_ALWAYS_EXAMPLE = MARKDOWN_CODE_BLOCK_START + "\"schedule\": null" + MARKDOWN_CODE_BLOCK_END;

    protected static final String DEVICE_PROFILE_ALARM_CONDITION_REPEATING_EXAMPLE = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"spec\":{\n" +
            "      \"type\":\"REPEATING\",\n" +
            "      \"predicate\":{\n" +
            "         \"userValue\":null,\n" +
            "         \"defaultValue\":5,\n" +
            "         \"dynamicValue\":{\n" +
            "            \"inherit\":true,\n" +
            "            \"sourceType\":\"CURRENT_DEVICE\",\n" +
            "            \"sourceAttribute\":\"tempAttr\"\n" +
            "         }\n" +
            "      }\n" +
            "   }\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;
    protected static final String DEVICE_PROFILE_ALARM_CONDITION_DURATION_EXAMPLE = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"spec\":{\n" +
            "      \"type\":\"DURATION\",\n" +
            "      \"unit\":\"MINUTES\",\n" +
            "      \"predicate\":{\n" +
            "         \"userValue\":null,\n" +
            "         \"defaultValue\":30,\n" +
            "         \"dynamicValue\":null\n" +
            "      }\n" +
            "   }\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;

    protected static final String RELATION_TYPE_PARAM_DESCRIPTION = "A string value representing relation type between entities. For example, 'Contains', 'Manages'. It can be any string value.";
    protected static final String RELATION_TYPE_GROUP_PARAM_DESCRIPTION = "A string value representing relation type group. For example, 'COMMON'";

    public static final String INCORRECT_TENANT_ID = "Incorrect tenantId ";
    protected static final String DEFAULT_DASHBOARD = "defaultDashboardId";
    protected static final String HOME_DASHBOARD = "homeDashboardId";

    protected static final String SINGLE_ENTITY = "\n\n## Single Entity\n\n" +
            "Allows to filter only one entity based on the id. For example, this entity filter selects certain device:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"singleEntity\",\n" +
            "  \"singleEntity\": {\n" +
            "    \"id\": \"d521edb0-2a7a-11ec-94eb-213c95f54092\",\n" +
            "    \"entityType\": \"DEVICE\"\n" +
            "  }\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String ENTITY_LIST = "\n\n## Entity List Filter\n\n" +
            "Allows to filter entities of the same type using their ids. For example, this entity filter selects two devices:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"entityList\",\n" +
            "  \"entityType\": \"DEVICE\",\n" +
            "  \"entityList\": [\n" +
            "    \"e6501f30-2a7a-11ec-94eb-213c95f54092\",\n" +
            "    \"e6657bf0-2a7a-11ec-94eb-213c95f54092\"\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String ENTITY_NAME = "\n\n## Entity Name Filter\n\n" +
            "Allows to filter entities of the same type using the **'starts with'** expression over entity name. " +
            "For example, this entity filter selects all devices which name starts with 'Air Quality':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"entityName\",\n" +
            "  \"entityType\": \"DEVICE\",\n" +
            "  \"entityNameFilter\": \"Air Quality\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String ENTITY_TYPE_FILTER = "\n\n## Entity Type Filter\n\n" +
            "Allows to filter entities based on their type (CUSTOMER, USER, DASHBOARD, ASSET, DEVICE, etc)" +
            "For example, this entity filter selects all tenant customers:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"entityType\",\n" +
            "  \"entityType\": \"CUSTOMER\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String ASSET_TYPE = "\n\n## Asset Type Filter\n\n" +
            "Allows to filter assets based on their type and the **'starts with'** expression over their name. " +
            "For example, this entity filter selects all 'charging station' assets which name starts with 'Tesla':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"assetType\",\n" +
            "  \"assetType\": \"charging station\",\n" +
            "  \"assetNameFilter\": \"Tesla\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String DEVICE_TYPE = "\n\n## Device Type Filter\n\n" +
            "Allows to filter devices based on their type and the **'starts with'** expression over their name. " +
            "For example, this entity filter selects all 'Temperature Sensor' devices which name starts with 'ABC':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"deviceType\",\n" +
            "  \"deviceType\": \"Temperature Sensor\",\n" +
            "  \"deviceNameFilter\": \"ABC\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String EDGE_TYPE = "\n\n## Edge Type Filter\n\n" +
            "Allows to filter edge instances based on their type and the **'starts with'** expression over their name. " +
            "For example, this entity filter selects all 'Factory' edge instances which name starts with 'Nevada':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"edgeType\",\n" +
            "  \"edgeType\": \"Factory\",\n" +
            "  \"edgeNameFilter\": \"Nevada\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String ENTITY_VIEW_TYPE = "\n\n## Entity View Filter\n\n" +
            "Allows to filter entity views based on their type and the **'starts with'** expression over their name. " +
            "For example, this entity filter selects all 'Concrete Mixer' entity views which name starts with 'CAT':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"entityViewType\",\n" +
            "  \"entityViewType\": \"Concrete Mixer\",\n" +
            "  \"entityViewNameFilter\": \"CAT\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String API_USAGE = "\n\n## Api Usage Filter\n\n" +
            "Allows to query for Api Usage based on optional customer id. If the customer id is not set, returns current tenant API usage." +
            "For example, this entity filter selects the 'Api Usage' entity for customer with id 'e6501f30-2a7a-11ec-94eb-213c95f54092':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"apiUsageState\",\n" +
            "  \"customerId\": {\n" +
            "    \"id\": \"d521edb0-2a7a-11ec-94eb-213c95f54092\",\n" +
            "    \"entityType\": \"CUSTOMER\"\n" +
            "  }\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String MAX_LEVEL_DESCRIPTION = "Possible direction values are 'TO' and 'FROM'. The 'maxLevel' defines how many relation levels should the query search 'recursively'. ";
    protected static final String FETCH_LAST_LEVEL_ONLY_DESCRIPTION = "Assuming the 'maxLevel' is > 1, the 'fetchLastLevelOnly' defines either to return all related entities or only entities that are on the last level of relations. ";

    protected static final String RELATIONS_QUERY_FILTER = "\n\n## Relations Query Filter\n\n" +
            "Allows to filter entities that are related to the provided root entity. " +
            MAX_LEVEL_DESCRIPTION +
            FETCH_LAST_LEVEL_ONLY_DESCRIPTION +
            "The 'filter' object allows you to define the relation type and set of acceptable entity types to search for. " +
            "The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only those who match the 'filters'.\n\n" +
            "For example, this entity filter selects all devices and assets which are related to the asset with id 'e51de0c0-2a7a-11ec-94eb-213c95f54092':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"relationsQuery\",\n" +
            "  \"rootEntity\": {\n" +
            "    \"entityType\": \"ASSET\",\n" +
            "    \"id\": \"e51de0c0-2a7a-11ec-94eb-213c95f54092\"\n" +
            "  },\n" +
            "  \"direction\": \"FROM\",\n" +
            "  \"maxLevel\": 1,\n" +
            "  \"fetchLastLevelOnly\": false,\n" +
            "  \"filters\": [\n" +
            "    {\n" +
            "      \"relationType\": \"Contains\",\n" +
            "      \"entityTypes\": [\n" +
            "        \"DEVICE\",\n" +
            "        \"ASSET\"\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";


    protected static final String ASSET_QUERY_FILTER = "\n\n## Asset Search Query\n\n" +
            "Allows to filter assets that are related to the provided root entity. Filters related assets based on the relation type and set of asset types. " +
            MAX_LEVEL_DESCRIPTION +
            FETCH_LAST_LEVEL_ONLY_DESCRIPTION +
            "The 'relationType' defines the type of the relation to search for. " +
            "The 'assetTypes' defines the type of the asset to search for. " +
            "The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only assets that match 'relationType' and 'assetTypes' conditions.\n\n" +
            "For example, this entity filter selects 'charging station' assets which are related to the asset with id 'e51de0c0-2a7a-11ec-94eb-213c95f54092' using 'Contains' relation:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"assetSearchQuery\",\n" +
            "  \"rootEntity\": {\n" +
            "    \"entityType\": \"ASSET\",\n" +
            "    \"id\": \"e51de0c0-2a7a-11ec-94eb-213c95f54092\"\n" +
            "  },\n" +
            "  \"direction\": \"FROM\",\n" +
            "  \"maxLevel\": 1,\n" +
            "  \"fetchLastLevelOnly\": false,\n" +
            "  \"relationType\": \"Contains\",\n" +
            "  \"assetTypes\": [\n" +
            "    \"charging station\"\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String DEVICE_QUERY_FILTER = "\n\n## Device Search Query\n\n" +
            "Allows to filter devices that are related to the provided root entity. Filters related devices based on the relation type and set of device types. " +
            MAX_LEVEL_DESCRIPTION +
            FETCH_LAST_LEVEL_ONLY_DESCRIPTION +
            "The 'relationType' defines the type of the relation to search for. " +
            "The 'deviceTypes' defines the type of the device to search for. " +
            "The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match 'relationType' and 'deviceTypes' conditions.\n\n" +
            "For example, this entity filter selects 'Charging port' and 'Air Quality Sensor' devices which are related to the asset with id 'e52b0020-2a7a-11ec-94eb-213c95f54092' using 'Contains' relation:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"deviceSearchQuery\",\n" +
            "  \"rootEntity\": {\n" +
            "    \"entityType\": \"ASSET\",\n" +
            "    \"id\": \"e52b0020-2a7a-11ec-94eb-213c95f54092\"\n" +
            "  },\n" +
            "  \"direction\": \"FROM\",\n" +
            "  \"maxLevel\": 2,\n" +
            "  \"fetchLastLevelOnly\": true,\n" +
            "  \"relationType\": \"Contains\",\n" +
            "  \"deviceTypes\": [\n" +
            "    \"Air Quality Sensor\",\n" +
            "    \"Charging port\"\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String EV_QUERY_FILTER = "\n\n## Entity View Query\n\n" +
            "Allows to filter entity views that are related to the provided root entity. Filters related entity views based on the relation type and set of entity view types. " +
            MAX_LEVEL_DESCRIPTION +
            FETCH_LAST_LEVEL_ONLY_DESCRIPTION +
            "The 'relationType' defines the type of the relation to search for. " +
            "The 'entityViewTypes' defines the type of the entity view to search for. " +
            "The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match 'relationType' and 'deviceTypes' conditions.\n\n" +
            "For example, this entity filter selects 'Concrete mixer' entity views which are related to the asset with id 'e52b0020-2a7a-11ec-94eb-213c95f54092' using 'Contains' relation:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"entityViewSearchQuery\",\n" +
            "  \"rootEntity\": {\n" +
            "    \"entityType\": \"ASSET\",\n" +
            "    \"id\": \"e52b0020-2a7a-11ec-94eb-213c95f54092\"\n" +
            "  },\n" +
            "  \"direction\": \"FROM\",\n" +
            "  \"maxLevel\": 1,\n" +
            "  \"fetchLastLevelOnly\": false,\n" +
            "  \"relationType\": \"Contains\",\n" +
            "  \"entityViewTypes\": [\n" +
            "    \"Concrete mixer\"\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String EDGE_QUERY_FILTER = "\n\n## Edge Search Query\n\n" +
            "Allows to filter edge instances that are related to the provided root entity. Filters related edge instances based on the relation type and set of edge types. " +
            MAX_LEVEL_DESCRIPTION +
            FETCH_LAST_LEVEL_ONLY_DESCRIPTION +
            "The 'relationType' defines the type of the relation to search for. " +
            "The 'deviceTypes' defines the type of the device to search for. " +
            "The relation query calculates all related entities, even if they are filtered using different relation types, and then extracts only devices that match 'relationType' and 'deviceTypes' conditions.\n\n" +
            "For example, this entity filter selects 'Factory' edge instances which are related to the asset with id 'e52b0020-2a7a-11ec-94eb-213c95f54092' using 'Contains' relation:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"deviceSearchQuery\",\n" +
            "  \"rootEntity\": {\n" +
            "    \"entityType\": \"ASSET\",\n" +
            "    \"id\": \"e52b0020-2a7a-11ec-94eb-213c95f54092\"\n" +
            "  },\n" +
            "  \"direction\": \"FROM\",\n" +
            "  \"maxLevel\": 2,\n" +
            "  \"fetchLastLevelOnly\": true,\n" +
            "  \"relationType\": \"Contains\",\n" +
            "  \"edgeTypes\": [\n" +
            "    \"Factory\"\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String EMPTY = "\n\n## Entity Type Filter\n\n" +
            "Allows to filter multiple entities of the same type using the **'starts with'** expression over entity name. " +
            "For example, this entity filter selects all devices which name starts with 'Air Quality':\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String ENTITY_FILTERS =
            "\n\n # Entity Filters" +
                    "\nEntity Filter body depends on the 'type' parameter. Let's review available entity filter types. In fact, they do correspond to available dashboard aliases." +
                    SINGLE_ENTITY + ENTITY_LIST + ENTITY_NAME + ENTITY_TYPE_FILTER + ASSET_TYPE + DEVICE_TYPE + EDGE_TYPE + ENTITY_VIEW_TYPE + API_USAGE + RELATIONS_QUERY_FILTER
                    + ASSET_QUERY_FILTER + DEVICE_QUERY_FILTER + EV_QUERY_FILTER + EDGE_QUERY_FILTER;

    protected static final String FILTER_KEY = "\n\n## Filter Key\n\n" +
            "Filter Key defines either entity field, attribute or telemetry. It is a JSON object that consists the key name and type. " +
            "The following filter key types are supported: \n\n" +
            " * 'CLIENT_ATTRIBUTE' - used for client attributes; \n" +
            " * 'SHARED_ATTRIBUTE' - used for shared attributes; \n" +
            " * 'SERVER_ATTRIBUTE' - used for server attributes; \n" +
            " * 'ATTRIBUTE' - used for any of the above; \n" +
            " * 'TIME_SERIES' - used for time-series values; \n" +
            " * 'ENTITY_FIELD' - used for accessing entity fields like 'name', 'label', etc. The list of available fields depends on the entity type; \n" +
            " * 'ALARM_FIELD' - similar to entity field, but is used in alarm queries only; \n" +
            "\n\n Let's review the example:\n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"TIME_SERIES\",\n" +
            "  \"key\": \"temperature\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String FILTER_PREDICATE = "\n\n## Filter Predicate\n\n" +
            "Filter Predicate defines the logical expression to evaluate. The list of available operations depends on the filter value type, see above. " +
            "Platform supports 4 predicate types: 'STRING', 'NUMERIC', 'BOOLEAN' and 'COMPLEX'. The last one allows to combine multiple operations over one filter key." +
            "\n\nSimple predicate example to check 'value < 100': \n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"operation\": \"LESS\",\n" +
            "  \"value\": {\n" +
            "    \"defaultValue\": 100,\n" +
            "    \"dynamicValue\": null\n" +
            "  },\n" +
            "  \"type\": \"NUMERIC\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "\n\nComplex predicate example, to check 'value < 10 or value > 20': \n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"COMPLEX\",\n" +
            "  \"operation\": \"OR\",\n" +
            "  \"predicates\": [\n" +
            "    {\n" +
            "      \"operation\": \"LESS\",\n" +
            "      \"value\": {\n" +
            "        \"defaultValue\": 10,\n" +
            "        \"dynamicValue\": null\n" +
            "      },\n" +
            "      \"type\": \"NUMERIC\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"operation\": \"GREATER\",\n" +
            "      \"value\": {\n" +
            "        \"defaultValue\": 20,\n" +
            "        \"dynamicValue\": null\n" +
            "      },\n" +
            "      \"type\": \"NUMERIC\"\n" +
            "    }\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "\n\nMore complex predicate example, to check 'value < 10 or (value > 50 && value < 60)': \n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"COMPLEX\",\n" +
            "  \"operation\": \"OR\",\n" +
            "  \"predicates\": [\n" +
            "    {\n" +
            "      \"operation\": \"LESS\",\n" +
            "      \"value\": {\n" +
            "        \"defaultValue\": 10,\n" +
            "        \"dynamicValue\": null\n" +
            "      },\n" +
            "      \"type\": \"NUMERIC\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"COMPLEX\",\n" +
            "      \"operation\": \"AND\",\n" +
            "      \"predicates\": [\n" +
            "        {\n" +
            "          \"operation\": \"GREATER\",\n" +
            "          \"value\": {\n" +
            "            \"defaultValue\": 50,\n" +
            "            \"dynamicValue\": null\n" +
            "          },\n" +
            "          \"type\": \"NUMERIC\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"operation\": \"LESS\",\n" +
            "          \"value\": {\n" +
            "            \"defaultValue\": 60,\n" +
            "            \"dynamicValue\": null\n" +
            "          },\n" +
            "          \"type\": \"NUMERIC\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "\n\n You may also want to replace hardcoded values (for example, temperature > 20) with the more dynamic " +
            "expression (for example, temperature > 'value of the tenant attribute with key 'temperatureThreshold'). " +
            "It is possible to use 'dynamicValue' to define attribute of the tenant, customer or user that is performing the API call. " +
            "See example below: \n\n" +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"operation\": \"GREATER\",\n" +
            "  \"value\": {\n" +
            "    \"defaultValue\": 0,\n" +
            "    \"dynamicValue\": {\n" +
            "      \"sourceType\": \"CURRENT_USER\",\n" +
            "      \"sourceAttribute\": \"temperatureThreshold\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"type\": \"NUMERIC\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "\n\n Note that you may use 'CURRENT_USER', 'CURRENT_CUSTOMER' and 'CURRENT_TENANT' as a 'sourceType'. The 'defaultValue' is used when the attribute with such a name is not defined for the chosen source.";

    protected static final String KEY_FILTERS =
            "\n\n # Key Filters" +
                    "\nKey Filter allows you to define complex logical expressions over entity field, attribute or latest time-series value. The filter is defined using 'key', 'valueType' and 'predicate' objects. " +
                    "Single Entity Query may have zero, one or multiple predicates. If multiple filters are defined, they are evaluated using logical 'AND'. " +
                    "The example below checks that temperature of the entity is above 20 degrees:" +
                    "\n\n" + MARKDOWN_CODE_BLOCK_START +
                    "{\n" +
                    "  \"key\": {\n" +
                    "    \"type\": \"TIME_SERIES\",\n" +
                    "    \"key\": \"temperature\"\n" +
                    "  },\n" +
                    "  \"valueType\": \"NUMERIC\",\n" +
                    "  \"predicate\": {\n" +
                    "    \"operation\": \"GREATER\",\n" +
                    "    \"value\": {\n" +
                    "      \"defaultValue\": 20,\n" +
                    "      \"dynamicValue\": null\n" +
                    "    },\n" +
                    "    \"type\": \"NUMERIC\"\n" +
                    "  }\n" +
                    "}" +
                    MARKDOWN_CODE_BLOCK_END +
                    "\n\n Now let's review 'key', 'valueType' and 'predicate' objects in detail."
                    + FILTER_KEY + FILTER_VALUE_TYPE + FILTER_PREDICATE;

    protected static final String ENTITY_COUNT_QUERY_DESCRIPTION =
            "Allows to run complex queries to search the count of platform entities (devices, assets, customers, etc) " +
                    "based on the combination of main entity filter and multiple key filters. Returns the number of entities that match the query definition.\n\n" +
                    "# Query Definition\n\n" +
                    "\n\nMain **entity filter** is mandatory and defines generic search criteria. " +
                    "For example, \"find all devices with profile 'Moisture Sensor'\" or \"Find all devices related to asset 'Building A'\"" +
                    "\n\nOptional **key filters** allow to filter results of the entity filter by complex criteria against " +
                    "main entity fields (name, label, type, etc), attributes and telemetry. " +
                    "For example, \"temperature > 20 or temperature< 10\" or \"name starts with 'T', and attribute 'model' is 'T1000', and timeseries field 'batteryLevel' > 40\"." +
                    "\n\nLet's review the example:" +
                    "\n\n" + MARKDOWN_CODE_BLOCK_START +
                    "{\n" +
                    "  \"entityFilter\": {\n" +
                    "    \"type\": \"entityType\",\n" +
                    "    \"entityType\": \"DEVICE\"\n" +
                    "  },\n" +
                    "  \"keyFilters\": [\n" +
                    "    {\n" +
                    "      \"key\": {\n" +
                    "        \"type\": \"ATTRIBUTE\",\n" +
                    "        \"key\": \"active\"\n" +
                    "      },\n" +
                    "      \"valueType\": \"BOOLEAN\",\n" +
                    "      \"predicate\": {\n" +
                    "        \"operation\": \"EQUAL\",\n" +
                    "        \"value\": {\n" +
                    "          \"defaultValue\": true,\n" +
                    "          \"dynamicValue\": null\n" +
                    "        },\n" +
                    "        \"type\": \"BOOLEAN\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  ]\n" +
                    "}" +
                    MARKDOWN_CODE_BLOCK_END +
                    "\n\n Example mentioned above search all devices which have attribute 'active' set to 'true'. Now let's review available entity filters and key filters syntax:" +
                    ENTITY_FILTERS +
                    KEY_FILTERS +
                    ControllerConstants.TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH;

    protected static final String ENTITY_DATA_QUERY_DESCRIPTION =
            "Allows to run complex queries over platform entities (devices, assets, customers, etc) " +
                    "based on the combination of main entity filter and multiple key filters. " +
                    "Returns the paginated result of the query that contains requested entity fields and latest values of requested attributes and time-series data.\n\n" +
                    "# Query Definition\n\n" +
                    "\n\nMain **entity filter** is mandatory and defines generic search criteria. " +
                    "For example, \"find all devices with profile 'Moisture Sensor'\" or \"Find all devices related to asset 'Building A'\"" +
                    "\n\nOptional **key filters** allow to filter results of the **entity filter** by complex criteria against " +
                    "main entity fields (name, label, type, etc), attributes and telemetry. " +
                    "For example, \"temperature > 20 or temperature< 10\" or \"name starts with 'T', and attribute 'model' is 'T1000', and timeseries field 'batteryLevel' > 40\"." +
                    "\n\nThe **entity fields** and **latest values** contains list of entity fields and latest attribute/telemetry fields to fetch for each entity." +
                    "\n\nThe **page link** contains information about the page to fetch and the sort ordering." +
                    "\n\nLet's review the example:" +
                    "\n\n" + MARKDOWN_CODE_BLOCK_START +
                    "{\n" +
                    "  \"entityFilter\": {\n" +
                    "    \"type\": \"entityType\",\n" +
                    "    \"resolveMultiple\": true,\n" +
                    "    \"entityType\": \"DEVICE\"\n" +
                    "  },\n" +
                    "  \"keyFilters\": [\n" +
                    "    {\n" +
                    "      \"key\": {\n" +
                    "        \"type\": \"TIME_SERIES\",\n" +
                    "        \"key\": \"temperature\"\n" +
                    "      },\n" +
                    "      \"valueType\": \"NUMERIC\",\n" +
                    "      \"predicate\": {\n" +
                    "        \"operation\": \"GREATER\",\n" +
                    "        \"value\": {\n" +
                    "          \"defaultValue\": 0,\n" +
                    "          \"dynamicValue\": {\n" +
                    "            \"sourceType\": \"CURRENT_USER\",\n" +
                    "            \"sourceAttribute\": \"temperatureThreshold\",\n" +
                    "            \"inherit\": false\n" +
                    "          }\n" +
                    "        },\n" +
                    "        \"type\": \"NUMERIC\"\n" +
                    "      }\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"entityFields\": [\n" +
                    "    {\n" +
                    "      \"type\": \"ENTITY_FIELD\",\n" +
                    "      \"key\": \"name\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"type\": \"ENTITY_FIELD\",\n" +
                    "      \"key\": \"label\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"type\": \"ENTITY_FIELD\",\n" +
                    "      \"key\": \"additionalInfo\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"latestValues\": [\n" +
                    "    {\n" +
                    "      \"type\": \"ATTRIBUTE\",\n" +
                    "      \"key\": \"model\"\n" +
                    "    },\n" +
                    "    {\n" +
                    "      \"type\": \"TIME_SERIES\",\n" +
                    "      \"key\": \"temperature\"\n" +
                    "    }\n" +
                    "  ],\n" +
                    "  \"pageLink\": {\n" +
                    "    \"page\": 0,\n" +
                    "    \"pageSize\": 10,\n" +
                    "    \"sortOrder\": {\n" +
                    "      \"key\": {\n" +
                    "        \"key\": \"name\",\n" +
                    "        \"type\": \"ENTITY_FIELD\"\n" +
                    "      },\n" +
                    "      \"direction\": \"ASC\"\n" +
                    "    }\n" +
                    "  }\n" +
                    "}" +
                    MARKDOWN_CODE_BLOCK_END +
                    "\n\n Example mentioned above search all devices which have attribute 'active' set to 'true'. Now let's review available entity filters and key filters syntax:" +
                    ENTITY_FILTERS +
                    KEY_FILTERS +
                    ControllerConstants.TENANT_OR_CUSTOMER_AUTHORITY_PARAGRAPH;


    protected static final String ALARM_DATA_QUERY_DESCRIPTION = "This method description defines how Alarm Data Query extends the Entity Data Query. " +
            "See method 'Find Entity Data by Query' first to get the info about 'Entity Data Query'." +
            "\n\n The platform will first search the entities that match the entity and key filters. Then, the platform will use 'Alarm Page Link' to filter the alarms related to those entities. " +
            "Finally, platform fetch the properties of alarm that are defined in the **'alarmFields'** and combine them with the other entity, attribute and latest time-series fields to return the result. " +
            "\n\n See example of the alarm query below. The query will search first 100 active alarms with type 'Temperature Alarm' or 'Fire Alarm' for any device with current temperature > 0. " +
            "The query will return combination of the entity fields: name of the device, device model and latest temperature reading and alarms fields: createdTime, type, severity and status: " +
            "\n\n" + MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"entityFilter\": {\n" +
            "    \"type\": \"entityType\",\n" +
            "    \"resolveMultiple\": true,\n" +
            "    \"entityType\": \"DEVICE\"\n" +
            "  },\n" +
            "  \"pageLink\": {\n" +
            "    \"page\": 0,\n" +
            "    \"pageSize\": 100,\n" +
            "    \"textSearch\": null,\n" +
            "    \"searchPropagatedAlarms\": false,\n" +
            "    \"statusList\": [\n" +
            "      \"ACTIVE\"\n" +
            "    ],\n" +
            "    \"severityList\": [\n" +
            "      \"CRITICAL\",\n" +
            "      \"MAJOR\"\n" +
            "    ],\n" +
            "    \"typeList\": [\n" +
            "      \"Temperature Alarm\",\n" +
            "      \"Fire Alarm\"\n" +
            "    ],\n" +
            "    \"sortOrder\": {\n" +
            "      \"key\": {\n" +
            "        \"key\": \"createdTime\",\n" +
            "        \"type\": \"ALARM_FIELD\"\n" +
            "      },\n" +
            "      \"direction\": \"DESC\"\n" +
            "    },\n" +
            "    \"timeWindow\": 86400000\n" +
            "  },\n" +
            "  \"keyFilters\": [\n" +
            "    {\n" +
            "      \"key\": {\n" +
            "        \"type\": \"TIME_SERIES\",\n" +
            "        \"key\": \"temperature\"\n" +
            "      },\n" +
            "      \"valueType\": \"NUMERIC\",\n" +
            "      \"predicate\": {\n" +
            "        \"operation\": \"GREATER\",\n" +
            "        \"value\": {\n" +
            "          \"defaultValue\": 0,\n" +
            "          \"dynamicValue\": null\n" +
            "        },\n" +
            "        \"type\": \"NUMERIC\"\n" +
            "      }\n" +
            "    }\n" +
            "  ],\n" +
            "  \"alarmFields\": [\n" +
            "    {\n" +
            "      \"type\": \"ALARM_FIELD\",\n" +
            "      \"key\": \"createdTime\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"ALARM_FIELD\",\n" +
            "      \"key\": \"type\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"ALARM_FIELD\",\n" +
            "      \"key\": \"severity\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"ALARM_FIELD\",\n" +
            "      \"key\": \"status\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"entityFields\": [\n" +
            "    {\n" +
            "      \"type\": \"ENTITY_FIELD\",\n" +
            "      \"key\": \"name\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"latestValues\": [\n" +
            "    {\n" +
            "      \"type\": \"ATTRIBUTE\",\n" +
            "      \"key\": \"model\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"TIME_SERIES\",\n" +
            "      \"key\": \"temperature\"\n" +
            "    }\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END +
            "";

    protected static final String COAP_TRANSPORT_CONFIGURATION_EXAMPLE = MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "   \"type\":\"COAP\",\n" +
            "   \"clientSettings\":{\n" +
            "      \"edrxCycle\":null,\n" +
            "      \"powerMode\":\"DRX\",\n" +
            "      \"psmActivityTimer\":null,\n" +
            "      \"pagingTransmissionWindow\":null\n" +
            "   },\n" +
            "   \"coapDeviceTypeConfiguration\":{\n" +
            "      \"coapDeviceType\":\"DEFAULT\",\n" +
            "      \"transportPayloadTypeConfiguration\":{\n" +
            "         \"transportPayloadType\":\"JSON\"\n" +
            "      }\n" +
            "   }\n" +
            "}"
            + MARKDOWN_CODE_BLOCK_END;

    protected static final String TRANSPORT_CONFIGURATION = "# Transport Configuration" + NEW_LINE +
            "5 transport configuration types are available:\n" +
            " * 'DEFAULT';\n" +
            " * 'MQTT';\n" +
            " * 'LWM2M';\n" +
            " * 'COAP';\n" +
            " * 'SNMP'." + NEW_LINE + "Default type supports basic MQTT, HTTP, CoAP and LwM2M transports. " +
            "Please refer to the [docs](https://thingsboard.io/docs/user-guide/device-profiles/#transport-configuration) for more details about other types.\n" +
            "\nSee another example of COAP transport configuration below:" + NEW_LINE + COAP_TRANSPORT_CONFIGURATION_EXAMPLE;

    protected static final String ALARM_FILTER_KEY = "## Alarm Filter Key" + NEW_LINE +
            "Filter Key defines either entity field, attribute, telemetry or constant. It is a JSON object that consists the key name and type. The following filter key types are supported:\n" +
            " * 'ATTRIBUTE' - used for attributes values;\n" +
            " * 'TIME_SERIES' - used for time-series values;\n" +
            " * 'ENTITY_FIELD' - used for accessing entity fields like 'name', 'label', etc. The list of available fields depends on the entity type;\n" +
            " * 'CONSTANT' - constant value specified." + NEW_LINE + "Let's review the example:" + NEW_LINE +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"TIME_SERIES\",\n" +
            "  \"key\": \"temperature\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END;

    protected static final String DEVICE_PROFILE_FILTER_PREDICATE = NEW_LINE + "## Filter Predicate" + NEW_LINE +
            "Filter Predicate defines the logical expression to evaluate. The list of available operations depends on the filter value type, see above. " +
            "Platform supports 4 predicate types: 'STRING', 'NUMERIC', 'BOOLEAN' and 'COMPLEX'. The last one allows to combine multiple operations over one filter key." + NEW_LINE +
            "Simple predicate example to check 'value < 100': " + NEW_LINE +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"operation\": \"LESS\",\n" +
            "  \"value\": {\n" +
            "    \"userValue\": null,\n" +
            "    \"defaultValue\": 100,\n" +
            "    \"dynamicValue\": null\n" +
            "  },\n" +
            "  \"type\": \"NUMERIC\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END + NEW_LINE +
            "Complex predicate example, to check 'value < 10 or value > 20': " + NEW_LINE +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"COMPLEX\",\n" +
            "  \"operation\": \"OR\",\n" +
            "  \"predicates\": [\n" +
            "    {\n" +
            "      \"operation\": \"LESS\",\n" +
            "      \"value\": {\n" +
            "        \"userValue\": null,\n" +
            "        \"defaultValue\": 10,\n" +
            "        \"dynamicValue\": null\n" +
            "      },\n" +
            "      \"type\": \"NUMERIC\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"operation\": \"GREATER\",\n" +
            "      \"value\": {\n" +
            "        \"userValue\": null,\n" +
            "        \"defaultValue\": 20,\n" +
            "        \"dynamicValue\": null\n" +
            "      },\n" +
            "      \"type\": \"NUMERIC\"\n" +
            "    }\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END + NEW_LINE +
            "More complex predicate example, to check 'value < 10 or (value > 50 && value < 60)': " + NEW_LINE +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"type\": \"COMPLEX\",\n" +
            "  \"operation\": \"OR\",\n" +
            "  \"predicates\": [\n" +
            "    {\n" +
            "      \"operation\": \"LESS\",\n" +
            "      \"value\": {\n" +
            "        \"userValue\": null,\n" +
            "        \"defaultValue\": 10,\n" +
            "        \"dynamicValue\": null\n" +
            "      },\n" +
            "      \"type\": \"NUMERIC\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"type\": \"COMPLEX\",\n" +
            "      \"operation\": \"AND\",\n" +
            "      \"predicates\": [\n" +
            "        {\n" +
            "          \"operation\": \"GREATER\",\n" +
            "          \"value\": {\n" +
            "            \"userValue\": null,\n" +
            "            \"defaultValue\": 50,\n" +
            "            \"dynamicValue\": null\n" +
            "          },\n" +
            "          \"type\": \"NUMERIC\"\n" +
            "        },\n" +
            "        {\n" +
            "          \"operation\": \"LESS\",\n" +
            "          \"value\": {\n" +
            "            \"userValue\": null,\n" +
            "            \"defaultValue\": 60,\n" +
            "            \"dynamicValue\": null\n" +
            "          },\n" +
            "          \"type\": \"NUMERIC\"\n" +
            "        }\n" +
            "      ]\n" +
            "    }\n" +
            "  ]\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END + NEW_LINE +
            "You may also want to replace hardcoded values (for example, temperature > 20) with the more dynamic " +
            "expression (for example, temperature > value of the tenant attribute with key 'temperatureThreshold'). " +
            "It is possible to use 'dynamicValue' to define attribute of the tenant, customer or device. " +
            "See example below:" + NEW_LINE +
            MARKDOWN_CODE_BLOCK_START +
            "{\n" +
            "  \"operation\": \"GREATER\",\n" +
            "  \"value\": {\n" +
            "    \"userValue\": null,\n" +
            "    \"defaultValue\": 0,\n" +
            "    \"dynamicValue\": {\n" +
            "      \"inherit\": false,\n" +
            "      \"sourceType\": \"CURRENT_TENANT\",\n" +
            "      \"sourceAttribute\": \"temperatureThreshold\"\n" +
            "    }\n" +
            "  },\n" +
            "  \"type\": \"NUMERIC\"\n" +
            "}" +
            MARKDOWN_CODE_BLOCK_END + NEW_LINE +
            "Note that you may use 'CURRENT_DEVICE', 'CURRENT_CUSTOMER' and 'CURRENT_TENANT' as a 'sourceType'. The 'defaultValue' is used when the attribute with such a name is not defined for the chosen source. " +
            "The 'sourceAttribute' can be inherited from the owner of the specified 'sourceType' if 'inherit' is set to true.";

    protected static final String KEY_FILTERS_DESCRIPTION = "# Key Filters" + NEW_LINE +
            "Key filter objects are created under the **'condition'** array. They allow you to define complex logical expressions over entity field, " +
            "attribute, latest time-series value or constant. The filter is defined using 'key', 'valueType', " +
            "'value' (refers to the value of the 'CONSTANT' alarm filter key type) and 'predicate' objects. Let's review each object:" + NEW_LINE +
            ALARM_FILTER_KEY + FILTER_VALUE_TYPE + NEW_LINE + DEVICE_PROFILE_FILTER_PREDICATE + NEW_LINE;

    protected static final String DEFAULT_DEVICE_PROFILE_DATA_EXAMPLE = MARKDOWN_CODE_BLOCK_START + "{\n" +
            "   \"alarms\":[\n" +
            "   ],\n" +
            "   \"configuration\":{\n" +
            "      \"type\":\"DEFAULT\"\n" +
            "   },\n" +
            "   \"provisionConfiguration\":{\n" +
            "      \"type\":\"DISABLED\",\n" +
            "      \"provisionDeviceSecret\":null\n" +
            "   },\n" +
            "   \"transportConfiguration\":{\n" +
            "      \"type\":\"DEFAULT\"\n" +
            "   }\n" +
            "}" + MARKDOWN_CODE_BLOCK_END;

    protected static final String CUSTOM_DEVICE_PROFILE_DATA_EXAMPLE = MARKDOWN_CODE_BLOCK_START + "{\n" +
            "   \"alarms\":[\n" +
            "      {\n" +
            "         \"id\":\"2492b935-1226-59e9-8615-17d8978a4f93\",\n" +
            "         \"alarmType\":\"Temperature Alarm\",\n" +
            "         \"clearRule\":{\n" +
            "            \"schedule\":null,\n" +
            "            \"condition\":{\n" +
            "               \"spec\":{\n" +
            "                  \"type\":\"SIMPLE\"\n" +
            "               },\n" +
            "               \"condition\":[\n" +
            "                  {\n" +
            "                     \"key\":{\n" +
            "                        \"key\":\"temperature\",\n" +
            "                        \"type\":\"TIME_SERIES\"\n" +
            "                     },\n" +
            "                     \"value\":null,\n" +
            "                     \"predicate\":{\n" +
            "                        \"type\":\"NUMERIC\",\n" +
            "                        \"value\":{\n" +
            "                           \"userValue\":null,\n" +
            "                           \"defaultValue\":30.0,\n" +
            "                           \"dynamicValue\":null\n" +
            "                        },\n" +
            "                        \"operation\":\"LESS\"\n" +
            "                     },\n" +
            "                     \"valueType\":\"NUMERIC\"\n" +
            "                  }\n" +
            "               ]\n" +
            "            },\n" +
            "            \"dashboardId\":null,\n" +
            "            \"alarmDetails\":null\n" +
            "         },\n" +
            "         \"propagate\":false,\n" +
            "         \"createRules\":{\n" +
            "            \"MAJOR\":{\n" +
            "               \"schedule\":{\n" +
            "                  \"type\":\"SPECIFIC_TIME\",\n" +
            "                  \"endsOn\":64800000,\n" +
            "                  \"startsOn\":43200000,\n" +
            "                  \"timezone\":\"Europe/Kiev\",\n" +
            "                  \"daysOfWeek\":[\n" +
            "                     1,\n" +
            "                     3,\n" +
            "                     5\n" +
            "                  ]\n" +
            "               },\n" +
            "               \"condition\":{\n" +
            "                  \"spec\":{\n" +
            "                     \"type\":\"DURATION\",\n" +
            "                     \"unit\":\"MINUTES\",\n" +
            "                     \"predicate\":{\n" +
            "                        \"userValue\":null,\n" +
            "                        \"defaultValue\":30,\n" +
            "                        \"dynamicValue\":null\n" +
            "                     }\n" +
            "                  },\n" +
            "                  \"condition\":[\n" +
            "                     {\n" +
            "                        \"key\":{\n" +
            "                           \"key\":\"temperature\",\n" +
            "                           \"type\":\"TIME_SERIES\"\n" +
            "                        },\n" +
            "                        \"value\":null,\n" +
            "                        \"predicate\":{\n" +
            "                           \"type\":\"COMPLEX\",\n" +
            "                           \"operation\":\"OR\",\n" +
            "                           \"predicates\":[\n" +
            "                              {\n" +
            "                                 \"type\":\"NUMERIC\",\n" +
            "                                 \"value\":{\n" +
            "                                    \"userValue\":null,\n" +
            "                                    \"defaultValue\":50.0,\n" +
            "                                    \"dynamicValue\":null\n" +
            "                                 },\n" +
            "                                 \"operation\":\"LESS_OR_EQUAL\"\n" +
            "                              },\n" +
            "                              {\n" +
            "                                 \"type\":\"NUMERIC\",\n" +
            "                                 \"value\":{\n" +
            "                                    \"userValue\":null,\n" +
            "                                    \"defaultValue\":30.0,\n" +
            "                                    \"dynamicValue\":null\n" +
            "                                 },\n" +
            "                                 \"operation\":\"GREATER\"\n" +
            "                              }\n" +
            "                           ]\n" +
            "                        },\n" +
            "                        \"valueType\":\"NUMERIC\"\n" +
            "                     }\n" +
            "                  ]\n" +
            "               },\n" +
            "               \"dashboardId\":null,\n" +
            "               \"alarmDetails\":null\n" +
            "            },\n" +
            "            \"WARNING\":{\n" +
            "               \"schedule\":{\n" +
            "                  \"type\":\"CUSTOM\",\n" +
            "                  \"items\":[\n" +
            "                     {\n" +
            "                        \"endsOn\":0,\n" +
            "                        \"enabled\":false,\n" +
            "                        \"startsOn\":0,\n" +
            "                        \"dayOfWeek\":1\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"endsOn\":64800000,\n" +
            "                        \"enabled\":true,\n" +
            "                        \"startsOn\":43200000,\n" +
            "                        \"dayOfWeek\":2\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"endsOn\":0,\n" +
            "                        \"enabled\":false,\n" +
            "                        \"startsOn\":0,\n" +
            "                        \"dayOfWeek\":3\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"endsOn\":57600000,\n" +
            "                        \"enabled\":true,\n" +
            "                        \"startsOn\":36000000,\n" +
            "                        \"dayOfWeek\":4\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"endsOn\":0,\n" +
            "                        \"enabled\":false,\n" +
            "                        \"startsOn\":0,\n" +
            "                        \"dayOfWeek\":5\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"endsOn\":0,\n" +
            "                        \"enabled\":false,\n" +
            "                        \"startsOn\":0,\n" +
            "                        \"dayOfWeek\":6\n" +
            "                     },\n" +
            "                     {\n" +
            "                        \"endsOn\":0,\n" +
            "                        \"enabled\":false,\n" +
            "                        \"startsOn\":0,\n" +
            "                        \"dayOfWeek\":7\n" +
            "                     }\n" +
            "                  ],\n" +
            "                  \"timezone\":\"Europe/Kiev\"\n" +
            "               },\n" +
            "               \"condition\":{\n" +
            "                  \"spec\":{\n" +
            "                     \"type\":\"REPEATING\",\n" +
            "                     \"predicate\":{\n" +
            "                        \"userValue\":null,\n" +
            "                        \"defaultValue\":5,\n" +
            "                        \"dynamicValue\":null\n" +
            "                     }\n" +
            "                  },\n" +
            "                  \"condition\":[\n" +
            "                     {\n" +
            "                        \"key\":{\n" +
            "                           \"key\":\"tempConstant\",\n" +
            "                           \"type\":\"CONSTANT\"\n" +
            "                        },\n" +
            "                        \"value\":30,\n" +
            "                        \"predicate\":{\n" +
            "                           \"type\":\"NUMERIC\",\n" +
            "                           \"value\":{\n" +
            "                              \"userValue\":null,\n" +
            "                              \"defaultValue\":0.0,\n" +
            "                              \"dynamicValue\":{\n" +
            "                                 \"inherit\":false,\n" +
            "                                 \"sourceType\":\"CURRENT_DEVICE\",\n" +
            "                                 \"sourceAttribute\":\"tempThreshold\"\n" +
            "                              }\n" +
            "                           },\n" +
            "                           \"operation\":\"EQUAL\"\n" +
            "                        },\n" +
            "                        \"valueType\":\"NUMERIC\"\n" +
            "                     }\n" +
            "                  ]\n" +
            "               },\n" +
            "               \"dashboardId\":null,\n" +
            "               \"alarmDetails\":null\n" +
            "            },\n" +
            "            \"CRITICAL\":{\n" +
            "               \"schedule\":null,\n" +
            "               \"condition\":{\n" +
            "                  \"spec\":{\n" +
            "                     \"type\":\"SIMPLE\"\n" +
            "                  },\n" +
            "                  \"condition\":[\n" +
            "                     {\n" +
            "                        \"key\":{\n" +
            "                           \"key\":\"temperature\",\n" +
            "                           \"type\":\"TIME_SERIES\"\n" +
            "                        },\n" +
            "                        \"value\":null,\n" +
            "                        \"predicate\":{\n" +
            "                           \"type\":\"NUMERIC\",\n" +
            "                           \"value\":{\n" +
            "                              \"userValue\":null,\n" +
            "                              \"defaultValue\":50.0,\n" +
            "                              \"dynamicValue\":null\n" +
            "                           },\n" +
            "                           \"operation\":\"GREATER\"\n" +
            "                        },\n" +
            "                        \"valueType\":\"NUMERIC\"\n" +
            "                     }\n" +
            "                  ]\n" +
            "               },\n" +
            "               \"dashboardId\":null,\n" +
            "               \"alarmDetails\":null\n" +
            "            }\n" +
            "         },\n" +
            "         \"propagateRelationTypes\":null\n" +
            "      }\n" +
            "   ],\n" +
            "   \"configuration\":{\n" +
            "      \"type\":\"DEFAULT\"\n" +
            "   },\n" +
            "   \"provisionConfiguration\":{\n" +
            "      \"type\":\"ALLOW_CREATE_NEW_DEVICES\",\n" +
            "      \"provisionDeviceSecret\":\"vaxb9hzqdbz3oqukvomg\"\n" +
            "   },\n" +
            "   \"transportConfiguration\":{\n" +
            "      \"type\":\"MQTT\",\n" +
            "      \"deviceTelemetryTopic\":\"v1/devices/me/telemetry\",\n" +
            "      \"deviceAttributesTopic\":\"v1/devices/me/attributes\",\n" +
            "      \"transportPayloadTypeConfiguration\":{\n" +
            "         \"transportPayloadType\":\"PROTOBUF\",\n" +
            "         \"deviceTelemetryProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage telemetry;\\n\\nmessage SensorDataReading {\\n\\n  optional double temperature = 1;\\n  optional double humidity = 2;\\n  InnerObject innerObject = 3;\\n\\n  message InnerObject {\\n    optional string key1 = 1;\\n    optional bool key2 = 2;\\n    optional double key3 = 3;\\n    optional int32 key4 = 4;\\n    optional string key5 = 5;\\n  }\\n}\",\n" +
            "         \"deviceAttributesProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage attributes;\\n\\nmessage SensorConfiguration {\\n  optional string firmwareVersion = 1;\\n  optional string serialNumber = 2;\\n}\",\n" +
            "         \"deviceRpcRequestProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage rpc;\\n\\nmessage RpcRequestMsg {\\n  optional string method = 1;\\n  optional int32 requestId = 2;\\n  optional string params = 3;\\n}\",\n" +
            "         \"deviceRpcResponseProtoSchema\":\"syntax =\\\"proto3\\\";\\npackage rpc;\\n\\nmessage RpcResponseMsg {\\n  optional string payload = 1;\\n}\"\n" +
            "      }\n" +
            "   }\n" +
            "}" + MARKDOWN_CODE_BLOCK_END;
    protected static final String DEVICE_PROFILE_DATA_DEFINITION = NEW_LINE + "# Device profile data definition" + NEW_LINE +
            "Device profile data object contains alarm rules configuration, device provision strategy and transport type configuration for device connectivity. Let's review some examples. " +
            "First one is the default device profile data configuration and second one - the custom one. " +
            NEW_LINE + DEFAULT_DEVICE_PROFILE_DATA_EXAMPLE + NEW_LINE + CUSTOM_DEVICE_PROFILE_DATA_EXAMPLE +
            NEW_LINE + "Let's review some specific objects examples related to the device profile configuration:";

    protected static final String ALARM_SCHEDULE = NEW_LINE + "# Alarm Schedule" + NEW_LINE +
            "Alarm Schedule JSON object represents the time interval during which the alarm rule is active. Note, " +
            NEW_LINE + DEVICE_PROFILE_ALARM_SCHEDULE_ALWAYS_EXAMPLE + NEW_LINE + "means alarm rule is active all the time. " +
            "**'daysOfWeek'** field represents Monday as 1, Tuesday as 2 and so on. **'startsOn'** and **'endsOn'** fields represent hours in millis (e.g. 64800000 = 18:00 or 6pm). " +
            "**'enabled'** flag specifies if item in a custom rule is active for specific day of the week:" + NEW_LINE +
            "## Specific Time Schedule" + NEW_LINE +
            DEVICE_PROFILE_ALARM_SCHEDULE_SPECIFIC_TIME_EXAMPLE + NEW_LINE +
            "## Custom Schedule" +
            NEW_LINE + DEVICE_PROFILE_ALARM_SCHEDULE_CUSTOM_EXAMPLE + NEW_LINE;

    protected static final String ALARM_CONDITION_TYPE = "# Alarm condition type (**'spec'**)" + NEW_LINE +
            "Alarm condition type can be either simple, duration, or repeating. For example, 5 times in a row or during 5 minutes." + NEW_LINE +
            "Note, **'userValue'** field is not used and reserved for future usage, **'dynamicValue'** is used for condition appliance by using the value of the **'sourceAttribute'** " +
            "or else **'defaultValue'** is used (if **'sourceAttribute'** is absent).\n" +
            "\n**'sourceType'** of the **'sourceAttribute'** can be: \n" +
            " * 'CURRENT_DEVICE';\n" +
            " * 'CURRENT_CUSTOMER';\n" +
            " * 'CURRENT_TENANT'." + NEW_LINE +
            "**'sourceAttribute'** can be inherited from the owner if **'inherit'** is set to true (for CURRENT_DEVICE and CURRENT_CUSTOMER)." + NEW_LINE +
            "## Repeating alarm condition" + NEW_LINE +
            DEVICE_PROFILE_ALARM_CONDITION_REPEATING_EXAMPLE + NEW_LINE +
            "## Duration alarm condition" + NEW_LINE +
            DEVICE_PROFILE_ALARM_CONDITION_DURATION_EXAMPLE + NEW_LINE +
            "**'unit'** can be: \n" +
            " * 'SECONDS';\n" +
            " * 'MINUTES';\n" +
            " * 'HOURS';\n" +
            " * 'DAYS'." + NEW_LINE;

    protected static final String PROVISION_CONFIGURATION = "# Provision Configuration" + NEW_LINE +
            "There are 3 types of device provision configuration for the device profile: \n" +
            " * 'DISABLED';\n" +
            " * 'ALLOW_CREATE_NEW_DEVICES';\n" +
            " * 'CHECK_PRE_PROVISIONED_DEVICES'." + NEW_LINE +
            "Please refer to the [docs](https://thingsboard.io/docs/user-guide/device-provisioning/) for more details." + NEW_LINE;

    protected static final String DEVICE_PROFILE_DATA = DEVICE_PROFILE_DATA_DEFINITION + ALARM_SCHEDULE + ALARM_CONDITION_TYPE +
            KEY_FILTERS_DESCRIPTION + PROVISION_CONFIGURATION + TRANSPORT_CONFIGURATION;

    protected static final String DEVICE_PROFILE_ID = "deviceProfileId";

}
