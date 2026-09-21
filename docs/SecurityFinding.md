

# SecurityFinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**checkId** | **String** | Semgrep rule ID that matched |  [optional] |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | Semgrep&#39;s confidence in the finding |  [optional] |
|**cwe** | **List&lt;String&gt;** | CWE identifiers associated with the finding |  [optional] |
|**endLine** | **Long** | Line the finding ends on |  [optional] |
|**functionId** | **Long** | ID of the function the finding was reported in |  [optional] |
|**functionName** | **String** | Name of the function the finding was reported in |  [optional] |
|**impact** | [**ImpactEnum**](#ImpactEnum) | Estimated impact of the finding |  [optional] |
|**message** | **String** | Human-readable description of the finding |  [optional] |
|**severity** | [**SeverityEnum**](#SeverityEnum) | Severity of the finding |  [optional] |
|**snippetLines** | **List&lt;String&gt;** | Source lines making up the reported snippet |  [optional] |
|**snippetStartLine** | **Long** | Line the reported snippet starts on |  [optional] |
|**startLine** | **Long** | Line the finding starts on |  [optional] |



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ImpactEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| LOW | &quot;LOW&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| HIGH | &quot;HIGH&quot; |
| CRITICAL | &quot;CRITICAL&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



