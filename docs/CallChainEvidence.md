

# CallChainEvidence


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callChain** | **List&lt;Long&gt;** | Addresses along the call chain. |  |
|**effect** | [**EffectEnum**](#EffectEnum) | Whether the evidence supports or refutes the finding. |  |
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) | Kind of evidence. |  |
|**kind** | [**KindEnum**](#KindEnum) | How the evidence was derived. |  |
|**strength** | [**StrengthEnum**](#StrengthEnum) | How directly the evidence bears on the finding. |  |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| SUPPORTS | &quot;supports&quot; |
| REFUTES | &quot;refutes&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| CALL_CHAIN | &quot;call_chain&quot; |
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



