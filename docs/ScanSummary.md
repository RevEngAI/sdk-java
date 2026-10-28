

# ScanSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**dataset** | **String** |  |  |
|**error** | **String** |  |  [optional] |
|**filesScanned** | **Long** |  |  |
|**filesTotal** | **Long** |  |  |
|**finishedAt** | **OffsetDateTime** |  |  [optional] |
|**matchesFound** | **Long** |  |  |
|**runMode** | [**RunModeEnum**](#RunModeEnum) |  |  |
|**scanId** | **Long** |  |  |
|**startedAt** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |



## Enum: RunModeEnum

| Name | Value |
|---- | -----|
| SYNC | &quot;sync&quot; |
| ASYNC | &quot;async&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;pending&quot; |
| RUNNING | &quot;running&quot; |
| COMPLETE | &quot;complete&quot; |
| FAILED | &quot;failed&quot; |
| CANCELLED | &quot;cancelled&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



