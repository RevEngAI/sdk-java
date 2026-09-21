

# DecompilerSummaryEvidence

Semantic summaries derived from decompiler output.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | **EvidenceEffect** |  |  |
|**strength** | [**StrengthEnum**](#StrengthEnum) |  |  [optional] |
|**summaries** | [**List&lt;DecompilerSummary&gt;**](DecompilerSummary.md) |  |  |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| DECOMPILER_SUMMARY | &quot;decompiler_summary&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| MODEL_INTERPRETATION | &quot;model_interpretation&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StrengthEnum

| Name | Value |
|---- | -----|
| INDIRECT | &quot;indirect&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



