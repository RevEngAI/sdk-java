

# RequeueAnalysisRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commandLineArgs** | **String** | Command-line arguments passed to the sample when enable_dynamic_execution is set |  [optional] |
|**enableDynamicExecution** | **Boolean** | Run the new Analysis with dynamic execution (sandbox) enabled |  [optional] |
|**generateCapabilities** | **Boolean** | Regenerate capabilities for the new Analysis instead of copying the original Binary&#39;s existing ones |  [optional] |
|**noCache** | **Boolean** |  |  [optional] |
|**scrapeTags** | **Boolean** | Re-scrape third-party tags for the new Analysis instead of copying the original Binary&#39;s existing ones |  [optional] |
|**tags** | **List&lt;String&gt;** | Additional Tags to apply to the requeued Binary, on top of any carried over because generate_capabilities/scrape_tags are false |  [optional] |



