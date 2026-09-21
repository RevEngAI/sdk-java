

# EventSourceDelta


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **SourceDeltaEvent** |  |  |
|**event** | [**EventEnum**](#EventEnum) | The event name. |  |
|**id** | **Integer** | The event ID. |  [optional] |
|**retry** | **Integer** | The retry time in milliseconds. |  [optional] |



## Enum: EventEnum

| Name | Value |
|---- | -----|
| SOURCE_DELTA | &quot;source_delta&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



