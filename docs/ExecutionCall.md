

# ExecutionCall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calleeName** | **String** | Name of the called function |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Execution category of the match |  |
|**how** | [**HowEnum**](#HowEnum) | Detection tier that produced the match |  |
|**matchedName** | **String** | Name or token that matched |  |
|**source** | [**SourceEnum**](#SourceEnum) | Execution source the match belongs to |  |



## Enum: CategoryEnum

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



## Enum: HowEnum

| Name | Value |
|---- | -----|
| API | &quot;api&quot; |
| CPP_CLASS_TOKEN | &quot;cpp-class-token&quot; |
| GENERIC_KEYWORD | &quot;generic-keyword&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SourceEnum

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



