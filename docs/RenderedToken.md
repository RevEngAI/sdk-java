

# RenderedToken


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataTypeId** | **Long** | Data type this token names, or for a field the type that declares it. Scoped by the response&#39;s analysis_id. |  [optional] |
|**functionId** | **Long** | Function this token calls or names. Absent when the address reaches no function of this binary. |  [optional] |
|**importedFunctionId** | **Long** | Imported function this token calls. Set instead of function_id for an external call. |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) | What the token names. |  |
|**vaddr** | **Long** | Virtual address the token resolves to. Absent for a token with no address. |  [optional] |
|**value** | **String** | Name the token resolves to. |  |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| OWN_FUNCTION | &quot;own_function&quot; |
| FUNCTION | &quot;function&quot; |
| FUNCPTR | &quot;funcptr&quot; |
| TYPE | &quot;type&quot; |
| FIELD | &quot;field&quot; |
| PARAM | &quot;param&quot; |
| LOCAL | &quot;local&quot; |
| GLOBAL | &quot;global&quot; |
| ENUM | &quot;enum&quot; |
| LABEL | &quot;label&quot; |
| STRING | &quot;string&quot; |
| FLOAT | &quot;float&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



