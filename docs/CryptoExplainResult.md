

# CryptoExplainResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancelled** | **Boolean** | Whether the run was cancelled |  |
|**error** | **String** | Why no explanation could be produced. Empty when the run succeeded. |  [optional] |
|**functionId** | **Long** | ID of the explained function |  |
|**functionName** | **String** | Name of the explained function |  [optional] |
|**functionsInvolved** | **List&lt;CryptoExplainedFunction&gt;** | Other functions involved in the cryptographic operation |  [optional] |
|**summary** | **String** | Explanation of the cryptography the function performs |  [optional] |



