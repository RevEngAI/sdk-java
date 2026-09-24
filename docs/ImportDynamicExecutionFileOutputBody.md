

# ImportDynamicExecutionFileOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**canExtract** | **Boolean** | Whether the firmware/extraction flow can accept this file. |  |
|**canSandbox** | **Boolean** | Whether the file can be extracted and run in the Windows sandbox. |  |
|**isArchive** | **Boolean** | Whether the detected format is a container/compression archive. |  |
|**mime** | **String** | The MIME type detected from the file&#39;s contents. |  |
|**sha256Hash** | **String** | SHA-256 hash the file is stored under; the storage key for every subsequent reference to it. |  |
|**size** | **Long** | Size of the file in bytes. |  |



