

# TriageFunctionResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the function |  |
|**address** | **Integer** | Address of the function in the binary |  |
|**summary** | **String** | Summary of the function&#39;s behaviour |  |
|**score** | **BigDecimal** | Score indicating the function&#39;s relevance |  |
|**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) | List of capabilities exhibited by the function |  |



## Enum: List&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| PACKING_AND_OBFUSCATION | &quot;packing_and_obfuscation&quot; |
| DEFENSE_EVASION | &quot;defense_evasion&quot; |
| PRIVILEGE_ESCALATION | &quot;privilege_escalation&quot; |
| PERSISTENCE_MECHANISMS | &quot;persistence_mechanisms&quot; |
| DISCOVERY_AND_RECONNAISSANCE | &quot;discovery_and_reconnaissance&quot; |
| CREDENTIAL_AND_DATA_COLLECTION | &quot;credential_and_data_collection&quot; |
| COMMUNICATION_AND_C2 | &quot;communication_and_c2&quot; |
| CRYPTOGRAPHIC_OPERATIONS | &quot;cryptographic_operations&quot; |
| PROCESS_AND_MEMORY_MANIPULATION | &quot;process_and_memory_manipulation&quot; |
| PROCESS_AND_COMMAND_EXECUTION | &quot;process_and_command_execution&quot; |
| FILE_ACTIVITY | &quot;file_activity&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



