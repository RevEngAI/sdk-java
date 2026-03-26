

# AutoUnstripRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apply** | **Boolean** | Whether to apply the matched function names to the target binary, default is False |  [optional] |
|**confidenceThreshold** | **BigDecimal** | Confidence threshold for applying function names as a percentage, default is 90 |  [optional] |
|**minGroupSize** | **Integer** | Minimum number of matching functions required to consider for a match, default is 10 |  [optional] |
|**minSimilarity** | **BigDecimal** | Minimum similarity expected for a match as a percentage, default is 90 |  [optional] |
|**noCache** | **Boolean** | If set to true, forces the system to bypass any cached results and perform a fresh computation |  [optional] |
|**statusOnly** | **Boolean** | If set to true, only returns the status of the auto-unstrip operation without the actual results |  [optional] |
|**useCanonicalNames** | **Boolean** | Whether to use canonical function names during matching for auto-unstrip, default is False |  [optional] |



