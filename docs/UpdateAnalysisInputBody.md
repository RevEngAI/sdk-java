

# UpdateAnalysisInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) | The analysis&#39; visibility. Changing to a non-PUBLIC scope requires a subscription tier that supports private analyses |  [optional] |
|**binaryName** | **String** | Renames the analysis&#39; binary. Empty or whitespace-only is rejected |  [optional] |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



