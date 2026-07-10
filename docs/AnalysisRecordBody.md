

# AnalysisRecordBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Long** | Analysis ID |  |
|**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) | Scope of the analysis |  |
|**baseAddress** | **Long** | Binary base address |  |
|**binaryId** | **Long** | Binary ID |  |
|**binaryName** | **String** | Binary filename |  |
|**binarySize** | **Long** | Binary size in bytes |  |
|**creation** | **OffsetDateTime** | When the analysis was created |  |
|**functionBoundariesHash** | **String** | Hash of the binary&#39;s provided function boundaries |  |
|**isOwner** | **Boolean** | True when the caller owns the analysis |  |
|**modelId** | **Long** | Model ID |  |
|**modelName** | **String** | Model name |  |
|**sha256Hash** | **String** | SHA-256 hash of the binary |  |
|**status** | **String** | Analysis status |  |
|**tags** | [**List&lt;AnalysisTagBody&gt;**](AnalysisTagBody.md) | Tags associated with the binary |  |
|**username** | **String** | Username of the analysis owner |  |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



