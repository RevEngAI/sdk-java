

# XrefIntoBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isCall** | **Boolean** | True when the xref is a call instruction |  |
|**isData** | **Boolean** | True when the xref targets data rather than code |  |
|**isScalar** | **Boolean** | True when the xref is a scalar constant |  |
|**isString** | **Boolean** | True when the xref targets a string |  |
|**origStrEncoding** | **String** | String encoding, set only when is_string is true |  [optional] |
|**rawData** | **String** | Raw bytes at the xref target, when captured |  [optional] |
|**segment** | **XrefSegmentBody** | Memory segment the xref target sits in |  [optional] |
|**value** | **String** | The xref&#39;s resolved value, when the sequencer could determine one |  [optional] |
|**xrefFrom** | **Long** | Address the reference originates from |  |



