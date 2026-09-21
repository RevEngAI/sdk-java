

# StartBatchMatchingInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaryIds** | **List&lt;Long&gt;** | Binary IDs to match the analysis against, one workflow per binary. |  |
|**debugTypes** | **List&lt;String&gt;** | Restrict matches to candidates with these debug source types. Defaults to [\&quot;SYSTEM\&quot;]. |  [optional] |
|**minSimilarity** | **Double** | Similarity floor as a percentage. Defaults to 90. |  [optional] |
|**noCache** | **Boolean** | By default a completed matching run is reused per binary (that binary reports status&#x3D;COMPLETED, no new run). Set true to force fresh runs for every binary. |  [optional] |
|**resultsPerFunction** | **Long** | Max matches returned per source function. Defaults to 1. |  [optional] |



