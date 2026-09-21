

# UploadOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisRequirements** | **List&lt;AnalysisRequirement&gt;** | Ways to unblock POST /v3/analyses for this file if it cannot be statically analysed as-is; empty if no requirement applies. |  |
|**canExtract** | **Boolean** | Whether the firmware/extraction flow can accept this file. |  |
|**canSandbox** | **Boolean** | Whether the file can be extracted and run in the Windows sandbox. |  |
|**fileType** | [**FileTypeEnum**](#FileTypeEnum) | The kind of file that was uploaded. |  |
|**filename** | **String** | The filename as given by the caller. |  |
|**isArchive** | **Boolean** | Whether the detected format is a container/compression archive. |  |
|**mime** | **String** | The MIME type detected from the file&#39;s contents, independent of upload_file_type. |  |
|**sha256Hash** | **String** | SHA-256 hash of the uploaded file; the storage key for every subsequent reference to it. |  |



## Enum: FileTypeEnum

| Name | Value |
|---- | -----|
| BINARY | &quot;BINARY&quot; |
| DEBUG | &quot;DEBUG&quot; |
| PACKED | &quot;PACKED&quot; |
| FIRMWARE | &quot;FIRMWARE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



