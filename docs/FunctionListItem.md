

# FunctionListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | Function id |  |
|**name** | **String** | Name of the function |  |
|**nameSourceType** | [**NameSourceTypeEnum**](#NameSourceTypeEnum) | The source (process) the function name came from |  |
|**nameSource** | [**NameSourceType**](NameSourceType.md) | The source of the current function name. |  |
|**mangledName** | **String** | Mangled name of the function |  |
|**vaddr** | **Long** | Function virtual address |  |
|**size** | **Integer** | Function size in bytes |  |
|**debug** | **Boolean** | Whether the function has debug information |  |



## Enum: NameSourceTypeEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| USER | &quot;USER&quot; |
| AUTO_UNSTRIP | &quot;AUTO_UNSTRIP&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| AI_UNSTRIP | &quot;AI_UNSTRIP&quot; |
| AI_AGENT | &quot;AI_AGENT&quot; |



