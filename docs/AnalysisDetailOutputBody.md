

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
|**capabilityCount** | **Long** | Number of capabilities in the latest capabilities agent result. Null when the agent has not produced a result |  |
|**creation** | **String** |  |  |
|**dashboardUrl** | **String** | URL to view this analysis in the dashboard |  |
|**debug** | **Boolean** |  |  |
|**modelName** | **String** |  |  |
|**requestedConfig** | **RequestedConfigBody** | Snapshot of the configuration the analysis was submitted with |  |
|**securityFindingCount** | **Long** | Number of HIGH or CRITICAL findings in the latest security scan. Null when the scan has not produced a result |  |
|**sha256Hash** | **String** |  |  |
|**threatScore** | **Double** | Software threat score from the latest triage result, from 0 to 1. Null when triage has not produced a result |  |



## Enum: AnalysisScopeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



