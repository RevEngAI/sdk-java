

# BatchBinaryMatchResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryId** | **Long** | Target binary |  |
|**errorMessage** | **String** | Error description when status&#x3D;FAILED. |  [optional] |
|**matchedFunctionCount** | **Long** | Number of source functions that received at least one candidate match. Only meaningful when status&#x3D;COMPLETED. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Per-binary workflow status |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



