

# CallEdge


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calleeFunctionId** | **Long** |  |  [optional] |
|**calleeName** | **String** |  |  [optional] |
|**calleeVaddr** | **Long** |  |  |
|**callerFunctionId** | **Long** |  |  |
|**callerName** | **String** |  |  [optional] |
|**callerVaddr** | **Long** | Entry vaddr of the caller function (joined from function_t). |  |
|**importedFunctionId** | **Long** | Imported function ID for an external callee, resolved via the thunk/stub address. |  [optional] |
|**isExternal** | **Boolean** |  |  |
|**source** | [**SourceEnum**](#SourceEnum) | Who found the edge: SYSTEM for the analysis, AI_AGENT for a call AI decompilation recovered that the analysis missed. |  |
|**thunkedVaddr** | **Long** |  |  [optional] |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| SYSTEM | &quot;SYSTEM&quot; |
| AI_AGENT | &quot;AI_AGENT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



