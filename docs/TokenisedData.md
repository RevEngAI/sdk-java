

# TokenisedData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | A URL to the JSON Schema for this object. |  [optional] [readonly] |
|**functionMapping** | [**FunctionMapping**](FunctionMapping.md) | Complete mapping data for token resolution |  [optional] |
|**predictedFunctionName** | **String** | Predicted function name from the AI model |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Task status |  |
|**tokenisedDecompilation** | **String** | Source code with placeholder tokens |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



