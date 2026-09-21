

# EvidenceInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | [**EffectEnum**](#EffectEnum) |  |  |
|**strength** | **EvidenceStrength** |  |  |
|**callChain** | **List&lt;Integer&gt;** |  |  |
|**constants** | [**List&lt;ReferencedConstant&gt;**](ReferencedConstant.md) |  |  |
|**calls** | [**List&lt;ImportedApiCall&gt;**](ImportedApiCall.md) |  |  |
|**strings** | [**List&lt;SuspiciousString&gt;**](SuspiciousString.md) |  |  |
|**similarities** | [**List&lt;FunctionSimilarity&gt;**](FunctionSimilarity.md) |  |  |
|**apis** | [**List&lt;ImportedApi&gt;**](ImportedApi.md) |  |  |
|**summaries** | [**List&lt;DecompilerSummary&gt;**](DecompilerSummary.md) |  |  |
|**interpretations** | [**List&lt;ModelInterpretation&gt;**](ModelInterpretation.md) |  |  |
|**values** | **List&lt;BytesConstant&gt;** |  |  |
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



