

# PatchInvestigationInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseType** | [**CaseTypeEnum**](#CaseTypeEnum) | New case type. Omit to keep the existing one. |  [optional] |
|**name** | **String** | New name. Omit to keep the existing one. |  [optional] |
|**scope** | [**ScopeEnum**](#ScopeEnum) | New scope. Omit to keep the existing one. |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | New severity. Omit to keep the existing one. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | New status. Omit to keep the existing one. |  [optional] |



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



