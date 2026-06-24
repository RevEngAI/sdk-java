

# StartBatchMatchingInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryIds** | **List&lt;Long&gt;** | Binary IDs to match the analysis against, one workflow per binary. |  |
|**debugTypes** | **List&lt;String&gt;** | Restrict matches to candidates with these debug source types. Defaults to [\&quot;SYSTEM\&quot;]. |  [optional] |
|**minSimilarity** | **Double** | Similarity floor as a percentage. Defaults to 90. |  [optional] |
|**resultsPerFunction** | **Long** | Max matches returned per source function. Defaults to 1. |  [optional] |



