

# BatchUpdateDataTypesResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataTypes** | **Object** |  |  [optional] |
|**dataTypesVersion** | **Long** | Version after update (present when status is &#39;updated&#39;) |  [optional] |
|**error** | **String** | Error message (present when status is &#39;error&#39;) |  [optional] |
|**functionId** | **Long** | Function ID |  |
|**status** | [**StatusEnum**](#StatusEnum) | Outcome for this function |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UPDATED | &quot;updated&quot; |
| VERSION_CONFLICT | &quot;version_conflict&quot; |
| ERROR | &quot;error&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



