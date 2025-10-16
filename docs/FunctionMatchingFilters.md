

# FunctionMatchingFilters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryIds** | **List&lt;Integer&gt;** | ID&#39;s of binaries to limit the search to, if empty, search all scoped binaries |  [optional] |
|**collectionIds** | **List&lt;Integer&gt;** | ID&#39;s of collections to limit the search to, if empty, search all scoped collections |  [optional] |
|**functionIds** | **List&lt;Long&gt;** | ID&#39;s of functions to limit the search to, if empty, search all scoped functions |  [optional] |
|**debugTypes** | [**List&lt;DebugTypesEnum&gt;**](#List&lt;DebugTypesEnum&gt;) | Limit the search to specific debug types, if empty, search all scoped debug &amp; non-debug functions |  [optional] |



## Enum: List&lt;DebugTypesEnum&gt;

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |



