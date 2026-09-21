

# Metadata


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logHistory** | **List&lt;List&lt;Object&gt;&gt;** | Progress messages the run recorded, oldest first, empty until the run logs anything. Each entry is a [timestamp, message] pair. |  |
|**status** | [**StatusEnum**](#StatusEnum) | Run status. UNINITIALISED means this agent has never been triggered for the analysis, so it is safe to start one. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



