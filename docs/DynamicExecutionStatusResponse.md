

# DynamicExecutionStatusResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorMessage** | **String** | Error detail, set when status is ERROR |  [optional] |
|**logs** | **AnalysisLogs** | Sandbox status log messages captured during the run. Contains a single \&quot;No logs available\&quot; message when none have been captured yet. |  |
|**status** | **String** | Task status: UNINITIALISED, PENDING, RUNNING, COMPLETED, or ERROR |  |



