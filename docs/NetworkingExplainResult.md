

# NetworkingExplainResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cancelled** | **Boolean** | Whether the run was cancelled |  |
|**dataReceived** | **String** | Description of the data received |  [optional] |
|**dataSent** | **String** | Description of the data sent |  [optional] |
|**dataUsage** | **String** | How the sent or received data is used |  [optional] |
|**endpoints** | **List&lt;String&gt;** | Concrete remote endpoints identified -- IPs, hostnames, or URLs |  [optional] |
|**functionId** | **Long** | ID of the explained function |  |
|**functionName** | **String** | Name of the explained function |  [optional] |
|**functionsInvolved** | **List&lt;NetworkingExplainedFunction&gt;** | Other functions involved in the network communication |  [optional] |
|**protocol** | **String** | Protocol used for the communication |  [optional] |
|**purpose** | **String** | Purpose of the network communication |  [optional] |
|**summary** | **String** | Explanation of the network communication the function performs |  [optional] |



