

# ModelInterpretationEvidence

LLM interpretations of observations.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) |  |  [optional] |
|**kind** | [**KindEnum**](#KindEnum) |  |  [optional] |
|**effect** | **EvidenceEffect** |  |  |
|**strength** | **EvidenceStrength** |  |  [optional] |
|**interpretations** | [**List&lt;ModelInterpretation&gt;**](ModelInterpretation.md) |  |  |



## Enum: EvidenceKindEnum

| Name | Value |
|---- | -----|
| MODEL_INTERPRETATION | &quot;model_interpretation&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| MODEL_INTERPRETATION | &quot;model_interpretation&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



