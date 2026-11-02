

# AgentRunUpdateData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**agent** | **AgentRunUpdateAgent** |  |  |
|**analysisId** | **Long** | The earliest-added analysis of the file in the investigation that the conversation&#39;s starter may see. |  |
|**binaryName** | **String** |  |  |
|**card** | **AgentRunUpdateCard** | A summary of the agent&#39;s result. Absent until the run is done, and when its result cannot be summarised. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**error** | **String** | Why the run failed. Null unless it failed with a reason. |  |
|**investigationId** | **Long** |  |  |
|**taskId** | **String** |  |  |
|**updatedAt** | **OffsetDateTime** |  |  |



