

# TokenisedData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entities** | [**List&lt;ResolvedEntity&gt;**](ResolvedEntity.md) | One entry per token in the tokenised source, with the name it resolves to and its hover metadata. |  [optional] |
|**lineAttribution** | **Object** |  |  [optional] |
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



