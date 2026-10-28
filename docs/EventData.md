

# EventData

The payload of the event type in type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**conversationUuid** | **String** |  |  [optional] |
|**definitionName** | **String** |  |  [optional] |
|**inputTokens** | **Integer** |  |  [optional] |
|**outputTokens** | **Integer** |  |  [optional] |
|**totalTokens** | **Integer** |  |  [optional] |
|**error** | **String** | Why the run failed. Null unless it failed with a reason. |  |
|**stepIndex** | **Integer** |  |  [optional] |
|**finishReason** | **String** |  |  [optional] |
|**messageId** | **String** |  |  [optional] |
|**delta** | **String** |  |  [optional] |
|**toolArgs** | **String** |  |  [optional] |
|**toolCallId** | **String** |  |  [optional] |
|**toolName** | **String** |  |  [optional] |
|**isError** | **Boolean** |  |  [optional] |
|**result** | **String** |  |  [optional] |
|**updated** | **List&lt;EntityUpdate&gt;** |  |  [optional] |
|**title** | **String** |  |  [optional] |
|**messagesAfter** | **Integer** |  |  [optional] |
|**messagesBefore** | **Integer** |  |  [optional] |
|**removedTurns** | **Integer** |  |  [optional] |
|**strategy** | **String** |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**agent** | **AgentRunUpdateAgent** |  |  |
|**analysisId** | **Long** | The earliest-added analysis of the file in the investigation that the conversation&#39;s starter may see. |  |
|**binaryName** | **String** |  |  |
|**card** | **AgentRunUpdateCard** | A summary of the agent&#39;s result. Absent until the run is done, and when its result cannot be summarised. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**investigationId** | **Long** |  |  |
|**taskId** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



