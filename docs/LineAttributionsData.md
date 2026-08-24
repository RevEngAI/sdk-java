

# LineAttributionsData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**disassemblyLineNumberToAiDecompilationLineNumbers** | **Map&lt;String, List&lt;Long&gt;&gt;** | Each disassembly line number mapped to the AI-decompilation line numbers it fed, e.g. {\&quot;12\&quot;: [3, 4, 6], \&quot;17\&quot;: [4]}. Both sides 0-based; many-to-many in both directions. Empty when no completed run has produced a correspondence, which is ordinary and not an error. |  |



