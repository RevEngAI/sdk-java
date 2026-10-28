

# ConversationBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Long** | The analysis the conversation is about. Null when it is about the whole investigation. |  |
|**conversationUuid** | **String** | Use with the /v2/conversations endpoints to read, stream and send messages. |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**investigationId** | **Long** |  |  |
|**starterId** | **Long** | The user who started the conversation, and the only one who can send messages in it. |  |
|**starterUsername** | **String** |  |  |
|**title** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** | When the conversation was last active: its newest message or event, or a change such as a new title. |  |



