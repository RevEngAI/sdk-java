

# FunctionSignatureBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callingConvention** | **String** | Calling convention, when the producer reported one. |  [optional] |
|**createdAt** | **OffsetDateTime** | When this signature was extracted. |  [optional] |
|**dataTypes** | [**List&lt;DataTypeEntry&gt;**](DataTypeEntry.md) | The types the signature names — its parameter types and its return type — ordered by data_type_id. Each entry is identical to the one the data types endpoints serve for that id. Returned only when include_data_types is true. |  [optional] |
|**functionId** | **Long** |  |  |
|**functionName** | **String** | Current name of the function. |  |
|**hasSignature** | **Boolean** | Whether a signature was extracted for this function. False is a normal result: no signature is recorded unless data type extraction ran for the analysis, and thunks and external functions are skipped when it does. |  |
|**parameters** | [**List&lt;SignatureParameterEntry&gt;**](SignatureParameterEntry.md) | Parameters in argument order. Empty with has_signature true means the function is known to take no arguments. |  |
|**returnDataTypeId** | **Long** | Return type, resolvable against the analysis data types list. Absent for an unresolved return type. |  [optional] |
|**sourceFunctionId** | **Long** | The function this signature was copied from, when it was transferred rather than extracted. |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | Where this signature came from. |  [optional] |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| USER | &quot;USER&quot; |
| AUTO_UNSTRIP | &quot;AUTO_UNSTRIP&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



