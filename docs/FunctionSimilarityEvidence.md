

# FunctionSimilarityEvidence

Function-similarity results suggestive of a capability.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | **EvidenceEffect** |  |  |
|**strength** | [**StrengthEnum**](#StrengthEnum) |  |  [optional] |
|**similarities** | [**List&lt;FunctionSimilarity&gt;**](FunctionSimilarity.md) |  |  |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| FUNCTION_SIMILARITY | &quot;function_similarity&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| DETERMINISTIC_DERIVATION | &quot;deterministic_derivation&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StrengthEnum

| Name | Value |
|---- | -----|
| INDIRECT | &quot;indirect&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



