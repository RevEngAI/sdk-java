

# FilesystemAnalyseResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancelled** | **Boolean** | Whether the run was cancelled |  |
|**dataDescription** | **String** | Description of the data read or written |  [optional] |
|**dataDestination** | **String** | Where the data ends up |  [optional] |
|**dataOrigin** | **String** | Where the data originates from |  [optional] |
|**functionId** | **Long** | ID of the explained function |  |
|**functionName** | **String** | Name of the explained function |  [optional] |
|**functionsInvolved** | **List&lt;FilesystemExplainedFunction&gt;** | Other functions involved in the filesystem access |  [optional] |
|**summary** | **String** | Explanation of the filesystem access the function performs |  [optional] |
|**targets** | **List&lt;String&gt;** | Concrete filesystem targets identified -- paths, registry keys, or environment variables |  [optional] |



