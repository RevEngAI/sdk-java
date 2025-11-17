

# AnalysisRecord


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Integer** | ID to identify analysis |  |
|**analysisScope** | **String** | Scope of the analysis |  |
|**binaryId** | **Integer** | ID to identify the binary analyse |  |
|**modelId** | **Integer** | ID to identify the model used for analysis |  |
|**modelName** | **String** | Name of the model used for analysis |  |
|**status** | **String** | The current status of analysis |  |
|**creation** | **OffsetDateTime** | The current status of analysis |  |
|**isOwner** | **Boolean** | Whether the current user is the owner of a binary |  |
|**binaryName** | **String** | The name of the file uploaded |  |
|**sha256Hash** | **String** | The hash of the binary |  |
|**functionBoundariesHash** | **String** | The hash of the function boundaries |  |
|**binarySize** | **Integer** | The size of the binary |  |
|**username** | **String** | The username of the analysis owner |  |
|**dynamicExecutionStatus** | **AppApiRestV2AnalysesEnumsDynamicExecutionStatus** |  |  [optional] |
|**dynamicExecutionTaskId** | **Integer** |  |  [optional] |
|**baseAddress** | **JavaMathBigInteger** | The base address of the binary |  |



