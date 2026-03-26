

# AnalysisRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Integer** | ID to identify analysis |  |
|**analysisScope** | **String** | Scope of the analysis |  |
|**baseAddress** | **BigInteger** | The base address of the binary |  |
|**binaryId** | **Integer** | ID to identify the binary analyse |  |
|**binaryName** | **String** | The name of the file uploaded |  |
|**binarySize** | **Integer** | The size of the binary |  |
|**creation** | **OffsetDateTime** | The datetime of when the analysis was created |  |
|**dynamicExecutionStatus** | **AppApiRestV2AnalysesEnumsDynamicExecutionStatus** |  |  [optional] |
|**dynamicExecutionTaskId** | **Integer** |  |  [optional] |
|**functionBoundariesHash** | **String** | The hash of the function boundaries |  |
|**isOwner** | **Boolean** | Whether the current user is the owner of a binary |  |
|**modelId** | **Integer** | ID to identify the model used for analysis |  |
|**modelName** | **String** | Name of the model used for analysis |  |
|**sha256Hash** | **String** | The hash of the binary |  |
|**status** | **String** | The current status of analysis |  |
|**tags** | [**List&lt;TagItem&gt;**](TagItem.md) | List of tags associated with the analysis |  [optional] |
|**username** | **String** | The username of the analysis owner |  |



