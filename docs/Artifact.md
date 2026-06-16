

# Artifact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**direction** | **String** |  |  [optional] |
|**dumpAddr** | **String** |  |  [optional] |
|**dumpPid** | **Long** |  |  [optional] |
|**fileType** | **String** |  |  [optional] |
|**host** | **String** |  |  [optional] |
|**isPe** | **Boolean** |  |  |
|**mimeType** | **String** |  |  [optional] |
|**name** | **String** |  |  |
|**networkSource** | **String** |  |  [optional] |
|**originalFilename** | **String** |  |  [optional] |
|**path** | **String** |  |  |
|**processSeqid** | **Long** |  |  [optional] |
|**reason** | [**ReasonEnum**](#ReasonEnum) |  |  |
|**responseStatus** | **Long** |  |  [optional] |
|**sha256** | **String** |  |  [optional] |
|**size** | **Long** |  |  |
|**source** | **String** |  |  |
|**uri** | **String** |  |  [optional] |
|**wasMapped** | **Boolean** |  |  [optional] |
|**yaraHits** | **List&lt;String&gt;** |  |  [optional] |



## Enum: ReasonEnum

| Name | Value |
|---- | -----|
| WRITTEN_BY_TARGET_PROCESS | &quot;written_by_target_process&quot; |
| BINARY_DETECTED | &quot;binary_detected&quot; |
| SHELLCODE_DETECTED | &quot;shellcode_detected&quot; |
| FILE_TYPE_DETECTED | &quot;file_type_detected&quot; |
| YARA_MATCH | &quot;yara_match&quot; |
| NETWORK_REQUEST | &quot;network_request&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



