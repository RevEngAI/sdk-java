

# CreateScanInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**$schema** | **URI** | A URL to the JSON Schema for this object. |  [optional] [readonly] |
|**binaryIds** | **List&lt;Long&gt;** | IDs of ingested binaries to scan instead of a dataset |  [optional] |
|**bypassCache** | **Boolean** | When true, ignore and do not populate the shared result cache |  [optional] |
|**collectionId** | **Long** | Scan with a rule collection instead of rules |  [optional] |
|**dataset** | **String** | Named dataset to scan. Provide this or targets (shas/binary_ids), not both. |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) | Force the run mode; auto routes by dataset size |  [optional] |
|**omitStrings** | **Boolean** | When true, per-pattern offsets are omitted |  [optional] |
|**perFileTimeoutMs** | **Long** | Override the per-file scan timeout (ms); 0 &#x3D; default |  [optional] |
|**rules** | **List&lt;ScanRuleInput&gt;** | Rules to scan with (inline and/or library references). Provide this or collection_id, not both. |  [optional] |
|**shas** | **List&lt;String&gt;** | Content sha256 hashes of ingested binaries to scan instead of a dataset |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| AUTO | &quot;auto&quot; |
| SYNC | &quot;sync&quot; |
| ASYNC | &quot;async&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



