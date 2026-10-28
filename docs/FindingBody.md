

# FindingBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**details** | **Map&lt;String, Object&gt;** | Fields specific to the finding type. An IOC has kind and value, a capability has name, a vulnerability has optional cve, cwe and location, and a cross-file flow has steps. |  |
|**findingId** | **Long** |  |  |
|**findingType** | [**FindingTypeEnum**](#FindingTypeEnum) |  |  |
|**investigationId** | **Long** |  |  |
|**severity** | [**SeverityEnum**](#SeverityEnum) |  |  |
|**source** | **String** | The agent or tool that produced the finding. |  |
|**summary** | **String** |  |  |
|**title** | **String** |  |  |



## Enum: FindingTypeEnum

| Name | Value |
|---- | -----|
| IOC | &quot;IOC&quot; |
| CAPABILITY | &quot;CAPABILITY&quot; |
| VULNERABILITY | &quot;VULNERABILITY&quot; |
| CROSS_FILE_FLOW | &quot;CROSS_FILE_FLOW&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SeverityEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;CRITICAL&quot; |
| HIGH | &quot;HIGH&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| LOW | &quot;LOW&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



