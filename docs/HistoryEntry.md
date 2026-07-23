

# HistoryEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**changeMadeBy** | **String** | Username of the user who made the change |  |
|**createdAt** | **OffsetDateTime** | When this name change was recorded |  |
|**functionName** | **String** | Function name at this point in history |  |
|**historyId** | **Long** | History record ID |  |
|**isDebug** | **Boolean** | Whether the function had debug info |  |
|**mangledName** | **String** | Mangled function name |  [optional] |
|**sourceAnalysisId** | **Long** | ID of the analysis the source function belongs to, if any |  [optional] |
|**sourceFunctionId** | **Long** | ID of the source function this name was transferred from, if any |  [optional] |
|**sourceType** | **String** | Source of the rename (USER, SYSTEM, AI_UNSTRIP, etc.) |  |



