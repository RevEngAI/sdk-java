

# ResultBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaries** | [**List&lt;ExtractedBinary&gt;**](ExtractedBinary.md) | Child binaries recovered from the extraction. |  |
|**extractionDepth** | **Long** | Number of nested-archive extraction passes taken. |  |
|**filenameToExtractionFailure** | **Map&lt;String, String&gt;** | Per-file extraction failures, keyed by filename. |  |
|**skippedFiles** | **Long** | Files skipped because they were not recognised as binaries. |  |



