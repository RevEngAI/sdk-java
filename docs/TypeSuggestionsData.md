

# TypeSuggestionsData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**model** | **String** | Language model that produced the suggestions. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the AI decompilation run that would have produced these suggestions. |  |
|**types** | **List&lt;SuggestedTypeView&gt;** | One entry per suggested type. Empty for a run that produced none, and for a run that predates type suggestion — the two are not distinguished. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



