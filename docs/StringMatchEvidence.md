

# StringMatchEvidence

String matches without demonstrated semantic use.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | **EvidenceEffect** |  |  |
|**strength** | [**StrengthEnum**](#StrengthEnum) |  |  [optional] |
|**strings** | [**List&lt;StringMatch&gt;**](StringMatch.md) |  |  |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| STRING_MATCH | &quot;string_match&quot; |
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



