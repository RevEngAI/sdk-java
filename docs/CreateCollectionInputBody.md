

# CreateCollectionInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaries** | **List&lt;Long&gt;** | Optional binary IDs to link to the collection. |  [optional] |
|**collectionName** | **String** | Collection name. |  |
|**collectionScope** | [**CollectionScopeEnum**](#CollectionScopeEnum) | Visibility scope. |  |
|**description** | **String** | Collection description. |  |
|**tags** | **List&lt;String&gt;** | Optional tags to attach to the collection. |  [optional] |



## Enum: CollectionScopeEnum

| Name | Value |
|---- | -----|
| PRIVATE | &quot;PRIVATE&quot; |
| PUBLIC | &quot;PUBLIC&quot; |
| PROTECTED | &quot;PROTECTED&quot; |
| TEAM | &quot;TEAM&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



