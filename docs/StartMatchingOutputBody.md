

# StartMatchingOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**matchId** | **String** | Opaque token for this matching run. Pass it to the GET/status endpoints&#39; match_id query parameter to fetch this exact run. |  |
|**messages** | **List&lt;ProgressMessage&gt;** | Log messages emitted during execution |  |
|**percent** | **Long** | Overall completion as a percentage, weighted by step duration |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current workflow status |  |
|**step** | **String** | Name of the current step |  |
|**stepIndex** | **Long** | Zero-based index of the current step |  |
|**stepShare** | **Long** | Percentage points the current step contributes when it completes |  |
|**stepsTotal** | **Long** | Total number of steps in the workflow |  |
|**subStep** | **String** | Phase within the current step, when the step reports one |  [optional] |
|**subStepDone** | **Long** | Items completed in the current phase |  [optional] |
|**subStepTotal** | **Long** | Items the current phase will process, 0 when unknown |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



