

# ReAnalysisForm

Form Model for receiving the analysis request

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | **List&lt;String&gt;** | Tags associated with the analysis |  [optional] |
|**commandLineArgs** | **String** | Command line arguments for dynamic execution |  [optional] |
|**priority** | **Integer** | Priority of the analysis |  [optional] |
|**essential** | **Boolean** | Only runs essential parts of the analysis, skips tags etc. |  [optional] |
|**modelName** | **String** | Model name allows reprocessing using a different model |  [optional] |
|**noCache** | **Boolean** | When enabled, skips using cached data within the processing. |  [optional] |



