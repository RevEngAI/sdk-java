

# AppApiRestV1AnnSchemaANNFunction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**resultPerFunction** | **Integer** |  |  [optional] |
|**distance** | **BigDecimal** |  |  [optional] |
|**functionIdList** | **List&lt;Integer&gt;** | List of function ids to compare |  |
|**speculativeFunctionIds** | **List&lt;Object&gt;** |  |  [optional] |
|**collection** | **List&lt;String&gt;** | Perform a search on functions within a list of collections |  [optional] |
|**collectionSearchList** | **List&lt;Integer&gt;** | Perform a search on functions within a list of collections |  [optional] |
|**debugMode** | **Boolean** |  |  [optional] |
|**debugTypes** | [**List&lt;DebugTypesEnum&gt;**](#List&lt;DebugTypesEnum&gt;) | If limiting results to functions with debug names, which type of debug names to include? |  [optional] |
|**binariesSearchList** | **List&lt;Integer&gt;** | Perform a search on functions within a list of analyses |  [optional] |



## Enum: List&lt;DebugTypesEnum&gt;

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |



