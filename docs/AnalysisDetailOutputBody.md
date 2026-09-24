

# AnalysisDetailOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**access** | **AnalysisAccessBody** |  |  |
|**analysisId** | **Long** |  |  |
|**analysisScope** | [**AnalysisScopeEnum**](#AnalysisScopeEnum) |  |  |
|**architecture** | **String** |  |  |
|**autoRunAgents** | **AutoRunAgentsBody** |  |  |
|**binaryDynamic** | **Boolean** |  |  |
|**binaryFormat** | **String** |  |  |
|**binaryName** | **String** |  |  |
|**binarySize** | **Long** |  |  |
|**binaryType** | **String** |  |  |
|**creation** | **String** |  |  |
|**dashboardUrl** | **String** | URL to view this analysis in the dashboard |  |
|**debug** | **Boolean** |  |  |
|**modelName** | **String** |  |  |
|**requestedConfig** | **RequestedConfigBody** | Snapshot of the configuration the analysis was submitted with |  |
|**sha256Hash** | **String** |  |  |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



