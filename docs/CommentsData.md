

# CommentsData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | A URL to the JSON Schema for this object. |  [optional] [readonly] |
|**inlineComments** | **List&lt;InlineComment&gt;** | Structured inline comments with line numbers |  |
|**taskStatus** | [**TaskStatusEnum**](#TaskStatusEnum) | Task status |  |



## Enum: TaskStatusEnum

| Name | Value |
|---- | -----|
| UNINITIALISED | &quot;UNINITIALISED&quot; |
| PENDING | &quot;PENDING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



