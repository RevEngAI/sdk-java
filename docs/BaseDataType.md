

# BaseDataType


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** | When this type was extracted. |  |
|**dataTypeId** | **Long** | Identifies the type within its analysis. 0 is a valid id. |  |
|**hasDefinition** | **Boolean** | Whether this type carries a definition. False for the kinds that never have one and for a type referenced but never defined. |  |
|**kind** | [**KindEnum**](#KindEnum) |  |  |
|**name** | **String** | Type name. |  |
|**namespace** | **String** | The scope qualifying the type name. Empty for a program-defined type. |  |
|**size** | **Long** | Size in bytes, absent when it could not be determined. |  [optional] |
|**sourceFunctionId** | **Long** | The function this type was copied from, when transferred rather than extracted. |  [optional] |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | Where this type came from. |  |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| BASE | &quot;BASE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| USER | &quot;USER&quot; |
| AUTO_UNSTRIP | &quot;AUTO_UNSTRIP&quot; |
| AI_DECOMP | &quot;AI_DECOMP&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



