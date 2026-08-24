

# ResolvedEntity


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addrToken** | **String** |  |  |
|**allAddrTokens** | **List&lt;String&gt;** |  |  |
|**bitOffset** | **Long** |  |  |
|**byteOffset** | **Long** |  |  |
|**byteSize** | **Long** |  |  |
|**count** | **Long** |  |  |
|**dataTypeIndex** | **Long** |  |  |
|**fieldStatus** | [**FieldStatusEnum**](#FieldStatusEnum) |  |  [optional] |
|**functionId** | **Long** |  |  [optional] |
|**importedFunctionId** | **Long** |  |  [optional] |
|**kind** | **String** | Search is applied to string value |  |
|**name** | **String** | Search is applied to string value |  |
|**nameSource** | [**NameSourceEnum**](#NameSourceEnum) |  |  |
|**needsNaming** | **Boolean** |  |  |
|**provenance** | **String** | Search is applied to string value |  |
|**resolvedName** | **String** |  |  |
|**suggestedType** | **String** |  |  |
|**suggestionConfidence** | **String** |  |  |
|**token** | **String** | Search is applied to string value |  |
|**typeIndex** | **Long** |  |  |
|**vaddr** | **Long** |  |  |
|**value** | **String** |  |  |
|**valueConfidence** | **String** |  |  |
|**valueType** | **String** |  |  |



## Enum: FieldStatusEnum

| Name | Value |
|---- | -----|
| BACKED | &quot;backed&quot; |
| UNBACKED | &quot;unbacked&quot; |
| UNMATCHED | &quot;unmatched&quot; |
| AMBIGUOUS | &quot;ambiguous&quot; |
| UNKEYED | &quot;unkeyed&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: NameSourceEnum

| Name | Value |
|---- | -----|
| DATABASE | &quot;database&quot; |
| FROZEN | &quot;frozen&quot; |
| DEFAULT | &quot;default&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



