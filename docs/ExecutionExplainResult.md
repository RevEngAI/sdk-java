

# ExecutionExplainResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancelled** | **Boolean** | Whether the run was cancelled |  |
|**codeOrigin** | **String** | Where the executed code originates from |  [optional] |
|**executedTargets** | **List&lt;String&gt;** | Concrete targets that end up executed -- process names, module paths, or shellcode buffers |  [optional] |
|**functionId** | **Long** | ID of the explained function |  |
|**functionName** | **String** | Name of the explained function |  [optional] |
|**functionsInvolved** | **List&lt;ExecutionExplainedFunction&gt;** | Other functions involved in the code execution |  [optional] |
|**purpose** | **String** | Purpose of the code execution |  [optional] |
|**summary** | **String** | Explanation of the code execution the function performs |  [optional] |
|**trigger** | **String** | What triggers the execution |  [optional] |
|**whatExecutes** | **String** | What code ends up executing |  [optional] |



