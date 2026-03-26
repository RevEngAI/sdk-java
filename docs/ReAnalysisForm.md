

# ReAnalysisForm

Form Model for receiving the analysis request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commandLineArgs** | **String** | Command line arguments for dynamic execution |  [optional] |
|**essential** | **Boolean** | Only runs essential parts of the analysis, skips tags/sbom/cves etc. |  [optional] |
|**modelName** | **String** |  |  [optional] |
|**noCache** | **Boolean** | When enabled, skips using cached data within the processing. |  [optional] |
|**priority** | **Integer** | Priority of the analysis |  [optional] |
|**tags** | **List&lt;String&gt;** | Tags associated with the analysis |  [optional] |



