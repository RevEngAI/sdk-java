

# AppApiRestV2AgentSchemaCapability


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**functionVaddr** | **String** | Vaddr of the function containing the capability |  |
|**description** | **String** | Description of the capability |  |
|**capability** | **String** | Name of the capability |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the capability |  |
|**functionName** | **String** | Name of the function containing the capability |  |
|**functionId** | **Integer** | ID of the function containing the capability |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXECUTE | &quot;Execute&quot; |
| CRYPTO | &quot;Crypto&quot; |
| NETWORK | &quot;Network&quot; |
| FILES | &quot;Files&quot; |
| MEMORY | &quot;Memory&quot; |
| STRING | &quot;String&quot; |
| ENVIRONMENT | &quot;Environment&quot; |
| FILE_HEADER | &quot;File Header&quot; |
| OTHER | &quot;Other&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



