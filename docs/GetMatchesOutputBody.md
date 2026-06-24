

# GetMatchesOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matches** | [**List&lt;FunctionMatch&gt;**](FunctionMatch.md) | Per-source-function matches. Populated when status&#x3D;COMPLETED; empty otherwise. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current workflow status |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



