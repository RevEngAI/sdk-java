

# ActivityBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actions** | [**ActionsEnum**](#ActionsEnum) | The kind of action taken |  |
|**activityScope** | [**ActivityScopeEnum**](#ActivityScopeEnum) | Who can see this activity entry |  |
|**createdAt** | **OffsetDateTime** | When the action happened |  |
|**message** | **String** | Human-readable description of the action |  |
|**sources** | [**SourcesEnum**](#SourcesEnum) | The resource kind the action applied to |  |
|**username** | **String** | The user who performed the action |  |



## Enum: ActionsEnum

| Name | Value |
|---- | -----|
| UPLOADED | &quot;UPLOADED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CREATED | &quot;CREATED&quot; |
| REGISTERED | &quot;REGISTERED&quot; |
| REPUTATION | &quot;REPUTATION&quot; |
| LEADERBOARD | &quot;LEADERBOARD&quot; |
| EDITED | &quot;EDITED&quot; |
| DELETED | &quot;DELETED&quot; |
| ERROR | &quot;ERROR&quot; |
| RENAME | &quot;RENAME&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ActivityScopeEnum

| Name | Value |
|---- | -----|
| PUBLIC | &quot;PUBLIC&quot; |
| PRIVATE | &quot;PRIVATE&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SourcesEnum

| Name | Value |
|---- | -----|
| USERS | &quot;USERS&quot; |
| ANALYSES | &quot;ANALYSES&quot; |
| MATCHES | &quot;MATCHES&quot; |
| COLLECTIONS | &quot;COLLECTIONS&quot; |
| HISTORY | &quot;HISTORY&quot; |
| FILES | &quot;FILES&quot; |
| FUNCTION | &quot;FUNCTION&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



