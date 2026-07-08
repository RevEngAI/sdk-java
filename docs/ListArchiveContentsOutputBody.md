

# ListArchiveContentsOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**entries** | [**List&lt;ArchiveContentEntry&gt;**](ArchiveContentEntry.md) | Files inside the archive, with paths relative to the archive root |  |
|**hasNext** | **Boolean** | Whether a further page of entries follows this one. |  |
|**page** | **Long** | Page number of this response (1-indexed). |  |
|**pageSize** | **Long** | Number of entries per page. |  |
|**totalCount** | **Long** | Total number of file entries in the archive, ignoring pagination. |  |



