

# DynamicExecutionMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logs** | **AnalysisLogs** | Sandbox status log messages captured during the run. Empty when none have been captured yet. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Run status. UNINITIALISED means this analysis has never had a run triggered. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



