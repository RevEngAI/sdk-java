

# CreateInvestigationInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**caseType** | [**CaseTypeEnum**](#CaseTypeEnum) |  |  |
|**name** | **String** | Investigation name. Must contain a non-whitespace character. |  |
|**scope** | [**ScopeEnum**](#ScopeEnum) | PRIVATE is visible only to you, TEAM to your whole team. Only you can modify it either way. |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | Initial severity. |  |



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



