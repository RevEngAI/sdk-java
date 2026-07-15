

# DynamicExecutionStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorMessage** | **String** | Error detail, set when status is FAILED |  [optional] |
|**logs** | [**AnalysisLogs**](AnalysisLogs.md) | Sandbox status log messages captured during the run. Contains a single \&quot;No logs available\&quot; message when none have been captured yet. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Task status |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



