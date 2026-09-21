

# SecurityScanMetadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logHistory** | **List&lt;List&lt;Object&gt;&gt;** | Progress messages the run recorded, oldest first. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Run status. UNINITIALISED means the agent has never been triggered for this analysis. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



