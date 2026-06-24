

# BatchMatchingOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**perBinary** | [**List&lt;BatchBinaryMatchResult&gt;**](BatchBinaryMatchResult.md) | Per-binary status (order matches the request). |  |
|**status** | [**StatusEnum**](#StatusEnum) | Aggregate status across the batch: COMPLETED when every binary is completed, FAILED if any failed, RUNNING/PENDING otherwise. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



