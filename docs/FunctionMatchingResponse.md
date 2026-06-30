

# FunctionMatchingResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**progress** | **Integer** | Progress of the matching operation, represented as a percentage |  [optional] |
|**status** | **String** | Status of the function matching operation |  [optional] |
|**totalTime** | **Integer** | Total time taken for the matching operation in seconds |  [optional] |
|**errorMessage** | **String** | Optional message providing additional information about the operation |  [optional] |
|**currentPage** | **Integer** | Current page number of the results, if pagination is used |  [optional] |
|**totalPages** | **Integer** | Total number of pages available, if pagination is used |  [optional] |
|**matches** | [**List&lt;V2FunctionMatch&gt;**](V2FunctionMatch.md) | List of function matching results with best match information |  [optional] |
|**numMatches** | **Integer** | Total number of function matches found |  [optional] |
|**numDebugMatches** | **Integer** | Total number of debug function matches found |  [optional] |
|**updatedAt** | **String** | Timestamp of the last time function matching with the same request parameters was performed |  [optional] |



