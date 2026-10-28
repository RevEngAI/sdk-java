

# CreateScanResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | A URL to the JSON Schema for this object. |  [optional] [readonly] |
|**result** | **ScanResult** | Inline result for a synchronous scan |  [optional] |
|**runMode** | [**RunModeEnum**](#RunModeEnum) |  |  |
|**scanId** | **Long** |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**workflowId** | **String** |  |  [optional] |



## Enum: RunModeEnum

| Name | Value |
|---- | -----|
| SYNC | &quot;sync&quot; |
| ASYNC | &quot;async&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



