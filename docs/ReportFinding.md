

# ReportFinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidence** | [**List&lt;ReportFindingEvidenceInner&gt;**](ReportFindingEvidenceInner.md) | The evidence for or against the finding. |  |
|**propertyId** | **String** | Identifier of the property the finding asserts. |  |
|**reachability** | [**ReachabilityEnum**](#ReachabilityEnum) | Whether the code behind the finding is reachable from an entry point. |  |



## Enum: ReachabilityEnum

| Name | Value |
|---- | -----|
| UNDETERMINED | &quot;undetermined&quot; |
| REACHABLE | &quot;reachable&quot; |
| UNREACHABLE | &quot;unreachable&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



