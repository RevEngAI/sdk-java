

# FunctionMatchingRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**modelId** | **Integer** | ID of the model used for function matching, used to determine the embedding model |  |
|**functionIds** | **List&lt;Long&gt;** | ID&#39;s of functions to find matches for, must be at least one function ID |  |
|**minSimilarity** | **BigDecimal** | Minimum similarity expected for a match as a percentage, default is 90 |  [optional] |
|**filters** | [**FunctionMatchingFilters**](FunctionMatchingFilters.md) |  |  [optional] |
|**resultsPerFunction** | **Integer** | Maximum number of matches to return per function, default is 1, max is 50 |  [optional] |
|**page** | **Integer** | Page number for paginated results, default is 1 (first page) |  [optional] |
|**pageSize** | **Integer** | Number of functions to return per page, default is 0 (all functions), max is 1000 |  [optional] |



