

# SignatureParameterInput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bitLength** | **Long** | Width in bits, when the parameter occupies less than its type&#39;s full size. |  [optional] |
|**dataTypeId** | **Long** | The parameter&#39;s type, which must belong to this analysis. Omit for an unresolved type. |  [optional] |
|**name** | **String** | Parameter name. Omit for an unnamed parameter. |  [optional] |
|**ordinal** | **Long** | Zero-based argument position. Must equal the parameter&#39;s index in the list. |  |
|**storage** | [**SignatureStorageInput**](SignatureStorageInput.md) | Where the parameter is passed. |  [optional] |



