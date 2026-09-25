

# Token


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**source** | [**SourceEnum**](#SourceEnum) | Who chose this override. Response only; ignored in a request. |  [optional] |
|**value** | **String** | Name the token resolves to. An empty string in a request removes the override. |  |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| USER | &quot;user&quot; |
| LLM | &quot;llm&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



