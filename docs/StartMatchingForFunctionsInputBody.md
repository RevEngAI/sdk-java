

# StartMatchingForFunctionsInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**MatchFilters**](MatchFilters.md) | Narrow the candidate pool. |  [optional] |
|**functionIds** | **List&lt;Long&gt;** | Source function IDs to match against the rest of the corpus. |  |
|**minSimilarity** | **Double** | Similarity floor as a percentage. Defaults to 90. |  [optional] |
|**noCache** | **Boolean** | By default a completed matching run for the same request is reused (response status&#x3D;COMPLETED, no new run). Set true to force a fresh run. |  [optional] |
|**resultsPerFunction** | **Long** | Max matches returned per source function. Defaults to 1. |  [optional] |
|**useCanonicalNames** | **Boolean** | Collapse near-duplicate candidate names into canonical buckets and return per-name confidences (the response &#39;confidences&#39; array). Adds a canonicalisation step; defaults to false. |  [optional] |



