

# ExecutionFinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Function&#39;s virtual address, hex-encoded |  |
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Distinct execution categories evidenced by this function |  |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | High when a direct name match was found, medium when the function only calls into execution APIs |  |
|**directMatches** | **List&lt;ExecutionDirectMatch&gt;** | Matches against the function&#39;s own name |  [optional] |
|**evidenceCount** | **Long** | Total number of direct matches and execution calls |  |
|**executes** | **Boolean** | Whether this function evidences executing code rather than only supporting it |  |
|**executionCalls** | **List&lt;ExecutionCall&gt;** | Matches against names this function calls |  [optional] |
|**functionId** | **Long** | ID of the function the finding was reported in |  |
|**functionName** | **String** | Name of the function the finding was reported in |  |
|**functionSize** | **Long** | Size of the function in bytes |  |
|**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Distinct execution sources evidenced by this function |  |
|**verification** | **ExecutionVerification** | LLM verdict checking this finding against its decompilation. Present only when the run verified this finding. |  [optional] |



## Enum: List&lt;CategoriesEnum&gt;

| Name | Value |
|---- | -----|
| DYNAMIC_RESOLVE | &quot;dynamic-resolve&quot; |
| HOOKING | &quot;hooking&quot; |
| INJECTION | &quot;injection&quot; |
| MEMORY_EXEC | &quot;memory-exec&quot; |
| MODULE_LOAD | &quot;module-load&quot; |
| PROCESS_CONTROL | &quot;process-control&quot; |
| PROCESS_CREATE | &quot;process-create&quot; |
| SCRIPT_EXEC | &quot;script-exec&quot; |
| SHELLCODE | &quot;shellcode&quot; |
| THREAD_CREATE | &quot;thread-create&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;SourcesEnum&gt;

| Name | Value |
|---- | -----|
| BOOST | &quot;boost&quot; |
| CPP | &quot;cpp&quot; |
| CPP_STDLIB | &quot;cpp-stdlib&quot; |
| GENERIC | &quot;generic&quot; |
| LIBC | &quot;libc&quot; |
| QT | &quot;qt&quot; |
| SCRIPT_ENGINE | &quot;script-engine&quot; |
| WINDOWS | &quot;windows&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



