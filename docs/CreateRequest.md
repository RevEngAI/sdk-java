

# CreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisConfig** | **Config** |  |  [optional] |
|**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) |  |  [optional] |
|**binaryConfig** | **BinaryConfig** |  |  [optional] |
|**debugHash** | **String** |  |  [optional] |
|**filename** | **String** |  |  |
|**investigationId** | **Long** | Adds the new analysis to this investigation, which you must own. |  [optional] |
|**operations** | **List&lt;RequestedOperation&gt;** | Operations to run automatically once the analysis completes. Each operation&#39;s prerequisites must also be requested. |  [optional] |
|**sha256Hash** | **String** |  |  |
|**symbols** | **Symbols** |  |  [optional] |
|**tags** | **List&lt;String&gt;** |  |  [optional] |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



