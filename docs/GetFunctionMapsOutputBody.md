

# GetFunctionMapsOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**functionMap** | **Map&lt;String, Long&gt;** | Function ID (as a string key) to virtual address, for every function in the analysis&#39;s binary. |  |
|**inverseFunctionMap** | **Map&lt;String, Long&gt;** | Virtual address (as a string key) to function ID — the inverse of function_map. |  |
|**nameMap** | **Map&lt;String, String&gt;** | Virtual address (as a string key) to mangled function name. Empty string for a function with no mangled name. |  |



