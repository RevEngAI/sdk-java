

# StartMatchingOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchId** | **String** | Opaque token for this matching run. Pass it to the GET/status endpoints&#39; match_id query parameter to fetch this exact run. |  |
|**messages** | [**List&lt;ProgressMessage&gt;**](ProgressMessage.md) | Log messages emitted during execution |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current workflow status |  |
|**step** | **String** | Name of the current step |  |
|**stepIndex** | **Long** | Zero-based index of the current step |  |
|**stepsTotal** | **Long** | Total number of steps in the workflow |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



