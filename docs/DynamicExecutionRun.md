

# DynamicExecutionRun


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**config** | **DynamicExecutionRunConfig** | Parameters the run was started with |  |
|**createdAt** | **OffsetDateTime** | When the run was started |  |
|**id** | **String** | Run ID |  |
|**status** | [**StatusEnum**](#StatusEnum) | Run status |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



