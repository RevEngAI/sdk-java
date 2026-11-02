

# SseEventTextMessageContentData

The event envelope, sent as the JSON of the SSE data line. Its type names the event, and its data is that event's payload.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**data** | **TextMessageContentData** | The payload of the event named in type. |  |
|**eventId** | **Long** | The stored event&#39;s ID, the same as the SSE id field. Pass the last one received as last_event_id to resume after a reconnection. |  |
|**sourceRunId** | **String** |  |  [optional] |
|**type** | **String** | The event name, the same as the SSE event field. |  |



