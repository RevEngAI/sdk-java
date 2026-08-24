

# ListFunctionSignaturesOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataTypes** | [**List&lt;AnalysisDataTypesGroup&gt;**](AnalysisDataTypesGroup.md) | The types the returned signatures name, grouped by analysis and ordered by analysis_id. Returned only when include_data_types is true. |  [optional] |
|**items** | [**List&lt;BatchFunctionSignatureEntry&gt;**](BatchFunctionSignatureEntry.md) | One entry per distinct requested function ID, in request order. A repeated ID yields one entry. |  |



