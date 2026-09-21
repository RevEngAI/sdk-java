

# HardcodedSecretEvidence

A hard-coded secret identified in the binary's data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | [**EffectEnum**](#EffectEnum) |  |  [optional] |
|**strength** | **EvidenceStrength** |  |  |
|**ruleId** | **String** |  |  |
|**description** | **String** |  |  |
|**secretKind** | **RuleKind** |  |  |
|**secret** | **String** |  |  |
|**entropy** | **BigDecimal** |  |  |
|**size** | **Integer** |  |  |
|**references** | **List&lt;Integer&gt;** |  |  |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| HARDCODED_SECRET | &quot;hardcoded_secret&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| DETERMINISTIC_DERIVATION | &quot;deterministic_derivation&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| SUPPORTS | &quot;supports&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



