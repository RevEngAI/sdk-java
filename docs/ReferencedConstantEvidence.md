

# ReferencedConstantEvidence

Constants and the instructions that reference them.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | **EvidenceEffect** |  |  |
|**strength** | [**StrengthEnum**](#StrengthEnum) |  |  [optional] |
|**constants** | [**List&lt;ReferencedConstant&gt;**](ReferencedConstant.md) |  |  |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| REFERENCED_CONSTANT | &quot;referenced_constant&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| DETERMINISTIC_DERIVATION | &quot;deterministic_derivation&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StrengthEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;direct&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



