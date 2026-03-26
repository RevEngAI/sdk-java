

# FunctionListItem


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**debug** | **Boolean** | Whether the function has debug information |  |
|**id** | **Long** | Function id |  |
|**mangledName** | **String** | Mangled name of the function |  |
|**name** | **String** | Name of the function |  |
|**nameSource** | [**NameSourceType**](NameSourceType.md) | The source of the current function name. |  |
|**nameSourceType** | [**NameSourceTypeEnum**](#NameSourceTypeEnum) | The source (process) the function name came from |  |
|**size** | **Integer** | Function size in bytes |  |
|**vaddr** | **Long** | Function virtual address |  |



## Enum: NameSourceTypeEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| USER | &quot;USER&quot; |
| AUTO_UNSTRIP | &quot;AUTO_UNSTRIP&quot; |
| EXTERNAL | &quot;EXTERNAL&quot; |
| AI_UNSTRIP | &quot;AI_UNSTRIP&quot; |



