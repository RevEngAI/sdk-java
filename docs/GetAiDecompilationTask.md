

# GetAiDecompilationTask


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **AiDecompilationTaskStatus** | The status of the AI decompilation task |  |
|**decompilation** | **String** | The AI decompilation string with values from function mappings already replaced |  |
|**rawDecompilation** | **String** | The unedited AI Decompilation string |  |
|**functionMapping** | [**Map&lt;String, InverseFunctionMapItem&gt;**](InverseFunctionMapItem.md) | Deprecated structure |  |
|**functionMappingFull** | [**FunctionMappingFull**](FunctionMappingFull.md) | The full mapping, useful for swapping out values within raw_decompilation |  |
|**summary** | **String** | The summary comment for the decompilation (deprecated, please use raw_ai_summary instead) |  [optional] |
|**aiSummary** | **String** | The summary comment for the decompilation with values from function mappings already replaced |  [optional] |
|**rawAiSummary** | **String** | The summary comment for the decompilation with no replacements |  [optional] |
|**predictedFunctionName** | **String** | The predicted function name from the AI model |  [optional] |



