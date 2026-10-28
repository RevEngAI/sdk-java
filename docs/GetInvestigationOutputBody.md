

# GetInvestigationOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisIds** | **List&lt;Long&gt;** | Analyses in the investigation that you are permitted to see. |  |
|**budget** | **BudgetBody** |  |  |
|**caseType** | [**CaseTypeEnum**](#CaseTypeEnum) |  |  |
|**createdAt** | **OffsetDateTime** |  |  |
|**investigationId** | **Long** |  |  |
|**name** | **String** |  |  |
|**ownerId** | **Long** |  |  |
|**ownerUsername** | **String** |  |  |
|**rollup** | **RollupBody** |  |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) |  |  |
|**teamId** | **Long** | Team the investigation belongs to; 0 when its owner had no team |  |
|**updatedAt** | **OffsetDateTime** |  |  |



## Enum: CaseTypeEnum

| Name | Value |
|---- | -----|
| REVERSE_ENGINEERING | &quot;REVERSE_ENGINEERING&quot; |
| MALWARE_ANALYSIS | &quot;MALWARE_ANALYSIS&quot; |
| VULNERABILITY_DISCOVERY | &quot;VULNERABILITY_DISCOVERY&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ScopeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;CRITICAL&quot; |
| HIGH | &quot;HIGH&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| LOW | &quot;LOW&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| ON_HOLD | &quot;ON_HOLD&quot; |
| CLOSED | &quot;CLOSED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



