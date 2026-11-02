

# RollupBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activity** | **List&lt;Long&gt;** | Files added and findings recorded in each of the last 24 hours, oldest first. |  |
|**agentStatus** | [**AgentStatusEnum**](#AgentStatusEnum) | State of the agents as a whole: queued while every run is pending, running while any is pending or running, complete otherwise. Null when no agent has run. |  |
|**agents** | **List&lt;AgentBody&gt;** | Agents run on the investigation&#39;s files that you may see, each with its state across the files. Empty until an agent has run. |  |
|**fileCount** | **Long** | Files in the investigation that you are permitted to see. |  |
|**findings** | **FindingCountsBody** |  |  |
|**findingsSeverity** | [**FindingsSeverityEnum**](#FindingsSeverityEnum) | The highest severity among the findings, independent of the investigation&#39;s own severity. Null when there are no findings. |  |
|**firstFileName** | **String** | Name of the first file added that you are permitted to see. Null when there is none. |  |
|**lastActivityAt** | **OffsetDateTime** | The latest of an edit to the investigation, a file being added and a finding being recorded. |  |



## Enum: AgentStatusEnum

| Name | Value |
|---- | -----|
| QUEUED | &quot;QUEUED&quot; |
| AGENTS_RUNNING | &quot;AGENTS_RUNNING&quot; |
| COMPLETE | &quot;COMPLETE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: FindingsSeverityEnum

| Name | Value |
|---- | -----|
| CRITICAL | &quot;CRITICAL&quot; |
| HIGH | &quot;HIGH&quot; |
| MEDIUM | &quot;MEDIUM&quot; |
| LOW | &quot;LOW&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



