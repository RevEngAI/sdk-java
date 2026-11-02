

# SpendBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationUuid** | **String** | The conversation of a CHAT spend. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**credits** | **Double** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) | What the credits were spent on: a conversation turn or an agent run started from the investigation. |  |
|**spendId** | **Long** |  |  |
|**taskId** | **String** | The agent run of an AGENT_RUN spend. |  |
|**userId** | **Long** | Who was charged. Zero when that user has been deleted. |  |
|**username** | **String** |  |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| CHAT | &quot;CHAT&quot; |
| AGENT_RUN | &quot;AGENT_RUN&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



