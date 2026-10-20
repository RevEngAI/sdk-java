

# FunctionGlobalVariable


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dType** | **String** | Name of the assigned data type. |  [optional] |
|**dataTypeId** | **Long** | Analysis data type, when one is assigned. |  [optional] |
|**decompLines** | **List&lt;Integer&gt;** | 1-indexed lines of the function&#39;s AI decompilation that reference the global. |  |
|**functionCount** | **Long** | How many functions&#39; AI decompilations reference the global. |  |
|**indirectTarget** | **Long** | Address a pointer slot resolves to. |  [optional] |
|**isBss** | **Boolean** | Whether the address falls in a zero-initialised section. |  |
|**name** | **String** | Recovered name, absent when nothing named the address. |  [optional] |
|**nameSource** | [**NameSourceEnum**](#NameSourceEnum) | What named it. |  [optional] |
|**refCount** | **Long** | How many times the function&#39;s AI decompilation references the global. |  |
|**size** | **Long** | Size in bytes, when known. |  [optional] |
|**sourceFunctionId** | **Long** | Function a constructed static was initialised in. |  [optional] |
|**totalRefCount** | **Long** | How many times those AI decompilations reference the global, summed across functions. |  |
|**typeSource** | [**TypeSourceEnum**](#TypeSourceEnum) | What typed it. |  [optional] |
|**vaddr** | **Long** | Virtual address the global lives at. |  |
|**value** | **String** | Decoded initial value, rendered for display. |  [optional] |
|**valueConfidence** | **String** | How much to trust the decoded value. |  [optional] |
|**valueKind** | [**ValueKindEnum**](#ValueKindEnum) | How the value was interpreted. |  [optional] |
|**valueSource** | [**ValueSourceEnum**](#ValueSourceEnum) | What produced the value. |  [optional] |



## Enum: NameSourceEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| RESOLVER | &quot;RESOLVER&quot; |
| DEBUG | &quot;DEBUG&quot; |
| CONSTRUCTOR | &quot;CONSTRUCTOR&quot; |
| VALUE | &quot;VALUE&quot; |
| AI_DECOMP | &quot;AI_DECOMP&quot; |
| AI_AGENT | &quot;AI_AGENT&quot; |
| USER | &quot;USER&quot; |
| ACCESS | &quot;ACCESS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TypeSourceEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| RESOLVER | &quot;RESOLVER&quot; |
| DEBUG | &quot;DEBUG&quot; |
| CONSTRUCTOR | &quot;CONSTRUCTOR&quot; |
| VALUE | &quot;VALUE&quot; |
| AI_DECOMP | &quot;AI_DECOMP&quot; |
| AI_AGENT | &quot;AI_AGENT&quot; |
| USER | &quot;USER&quot; |
| ACCESS | &quot;ACCESS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ValueKindEnum

| Name | Value |
|---- | -----|
| BSS | &quot;BSS&quot; |
| STRING | &quot;STRING&quot; |
| SHORT_STRING | &quot;SHORT_STRING&quot; |
| FLOAT | &quot;FLOAT&quot; |
| POINTER | &quot;POINTER&quot; |
| DYNAMIC_INIT | &quot;DYNAMIC_INIT&quot; |
| HEX | &quot;HEX&quot; |
| INT | &quot;INT&quot; |
| BOOL | &quot;BOOL&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ValueSourceEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| RESOLVER | &quot;RESOLVER&quot; |
| DEBUG | &quot;DEBUG&quot; |
| CONSTRUCTOR | &quot;CONSTRUCTOR&quot; |
| VALUE | &quot;VALUE&quot; |
| AI_DECOMP | &quot;AI_DECOMP&quot; |
| AI_AGENT | &quot;AI_AGENT&quot; |
| USER | &quot;USER&quot; |
| ACCESS | &quot;ACCESS&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



