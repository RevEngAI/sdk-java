

# StartMatchingForAnalysisInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**MatchFilters**](MatchFilters.md) | Narrow the candidate pool. |  [optional] |
|**minSimilarity** | **Double** | Similarity floor as a percentage. Defaults to 90. |  [optional] |
|**noCache** | **Boolean** | By default a completed matching run for the same request is reused (response status&#x3D;COMPLETED, no new run). Set true to force a fresh run. |  [optional] |
|**resultsPerFunction** | **Long** | Max matches returned per source function. Defaults to 1. |  [optional] |



