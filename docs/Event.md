

# Event


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationUuid** | **String** |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**data** | [**EventData**](EventData.md) |  |  |
|**eventId** | **Long** |  |  |
|**role** | **Integer** |  |  |
|**tokensUsed** | **Long** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | The event type, which decides the shape of data: 1 RUN_STARTED, 2 RUN_FINISHED, 3 RUN_ERROR, 4 STEP_STARTED, 5 STEP_FINISHED, 6 TEXT_MESSAGE_START, 7 TEXT_MESSAGE_CONTENT, 8 TEXT_MESSAGE_END, 9 TOOL_CALL_START, 10 TOOL_CALL_ARGS_DELTA, 11 TOOL_CALL_END, 12 TOOL_CALL_RESULT, 13 TITLE_UPDATED, 14 RUN_CANCELLED, 15 CONTEXT_COMPACTED, 16 TOOL_CONFIRMATION_REQUIRED, 19 TOOL_CALL_PROGRESS, 20 AGENT_RUN_UPDATE. |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_19 | 19 |
| NUMBER_20 | 20 |
| NUMBER_unknown_default_open_api | 11184809 |



