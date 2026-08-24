

# AnalysisLogEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**level** | [**LevelEnum**](#LevelEnum) | Severity |  |
|**source** | **String** | Component that emitted the line |  |
|**text** | **String** | Log line text |  |
|**timestamp** | **OffsetDateTime** | When the line was emitted (UTC) |  |



## Enum: LevelEnum

| Name | Value |
|---- | -----|
| INFO | &quot;INFO&quot; |
| WARN | &quot;WARN&quot; |
| ERROR | &quot;ERROR&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



