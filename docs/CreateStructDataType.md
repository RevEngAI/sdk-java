

# CreateStructDataType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**definition** | [**StructDefinition**](StructDefinition.md) |  |  |
|**kind** | [**KindEnum**](#KindEnum) |  |  |
|**name** | **String** | Type name. Unique within the analysis for a given namespace and kind. |  |
|**namespace** | **String** | The scope qualifying the type name. Omit for a type of the binary&#39;s own. |  [optional] |
|**size** | **Long** | Size in bytes. Omit when it is not known. |  [optional] |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| STRUCT | &quot;STRUCT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



