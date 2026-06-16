

# AutoUnstripResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**progress** | **Integer** | Progress of the auto-unstrip operation, represented as a percentage |  [optional] |
|**status** | **String** | Status of the function matching operation |  [optional] |
|**totalTime** | **Integer** | Total time taken for the auto-unstrip operation in seconds |  [optional] |
|**matches** | [**List&lt;MatchedFunctionSuggestion&gt;**](MatchedFunctionSuggestion.md) | Map of function IDs to their matching results with best match information |  [optional] |
|**applied** | **Boolean** | Indicates whether the matched function names were applied to the target binary |  [optional] |
|**errorMessage** | **String** | Error message if the operation failed |  [optional] |



