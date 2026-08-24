

# AnalysisBasicInfoOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) | PUBLIC, PRIVATE, or TEAM |  |
|**baseAddress** | **Long** | Base address of the binary, null when unknown |  |
|**binaryId** | **Long** | Binary ID |  |
|**binaryName** | **String** | Binary filename |  |
|**binarySize** | **Long** | Binary size in bytes |  |
|**binaryUuid** | **String** | UUID of the binary, omitted when not set |  |
|**creation** | **OffsetDateTime** | When the binary was uploaded |  |
|**debug** | **Boolean** | True when the binary was analysed with debug symbols |  |
|**detectedArchitecture** | **String** | Detected instruction-set architecture; empty when unavailable |  |
|**detectedBinaryFormat** | **String** | Detected binary container format; empty when unavailable |  |
|**detectedBinaryType** | **String** | Detected operating-system platform; empty when unavailable |  |
|**functionCount** | **Long** | Number of functions in the binary |  |
|**isAdvanced** | **Boolean** | True when the analysis was run in advanced mode |  |
|**isOwner** | **Boolean** | True when the caller is the analysis owner |  |
|**isSystem** | **Boolean** | True when the analysis is owned by a system user |  |
|**modelId** | **Long** | Model ID |  |
|**modelName** | **String** | Model used for analysis |  |
|**ownerUsername** | **String** | Username of the analysis owner |  |
|**sequencerVersion** | **String** | Sequencer version, omitted when not set |  [optional] |
|**sha256Hash** | **String** | SHA-256 hash of the binary |  |
|**suppliedArchitecture** | **String** | User-supplied instruction-set architecture; \&quot;AUTO\&quot; when not overridden |  |
|**suppliedBinaryFormat** | **String** | User-supplied binary container format; \&quot;AUTO\&quot; when not overridden |  |
|**suppliedBinaryType** | **String** | User-supplied operating-system platform; \&quot;AUTO\&quot; when not overridden |  |
|**teamId** | **Long** | Team ID of the analysis |  |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



