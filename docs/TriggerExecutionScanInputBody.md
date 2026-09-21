

# TriggerExecutionScanInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Restrict findings to these categories. Omit to scan the default executes-code set. |  [optional] |
|**directOnly** | **Boolean** | Only report functions whose own name matches a known execution API; skips the calls-into-execution pass, avoiding a bulk call-graph fetch. |  [optional] |
|**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Restrict findings to these sources. Omit to scan every source. |  [optional] |



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



