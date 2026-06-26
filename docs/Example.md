

# Example


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Long** | Analysis ID |  |
|**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) | Scope of the analysis (always PUBLIC for examples) |  |
|**binaryId** | **Long** | Binary ID |  |
|**binaryName** | **String** | Binary filename |  |
|**binarySize** | **Long** | Binary size in bytes |  |
|**creation** | **OffsetDateTime** | When the analysis was created |  |
|**isOwner** | **Boolean** | True when the caller owns the analysis |  |
|**modelId** | **Long** | Model ID |  |
|**sha256Hash** | **String** | SHA-256 hash of the binary |  |
|**status** | **String** | Analysis status |  |
|**tags** | **List&lt;String&gt;** | Tags associated with this binary |  |
|**username** | **String** | Username of the analysis owner |  |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



