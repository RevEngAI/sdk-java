

# SignatureParameterEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bitLength** | **Long** | Width in bits, when the parameter occupies less than its type&#39;s full size. |  [optional] |
|**dataTypeId** | **Long** | The parameter&#39;s type, resolvable against the analysis data types list. Absent when the type could not be resolved. |  [optional] |
|**name** | **String** | Parameter name, absent when the producer had none. |  [optional] |
|**ordinal** | **Long** | Zero-based argument position. |  |
|**storage** | [**SignatureStorageEntry**](SignatureStorageEntry.md) | Where the parameter is passed. |  [optional] |



