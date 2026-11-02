

# ResultBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**binaries** | **List&lt;ExtractedBinary&gt;** | Every file recovered from the extraction, binary or not. |  |
|**extractionDepth** | **Long** | Number of nested-archive extraction passes taken. |  |
|**filenameToFailure** | **Map&lt;String, ExtractionFailure&gt;** | Per-file extraction failures, keyed by filename. |  |
|**skippedFiles** | **Long** | Deprecated: always 0, every file is returned. |  |



