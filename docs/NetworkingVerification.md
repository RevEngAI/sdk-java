

# NetworkingVerification


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | LLM&#39;s confidence in the verdict. Absent when verified is null. |  [optional] |
|**reasoning** | **String** | LLM&#39;s explanation for the verdict, or the reason verification could not be completed |  |
|**verified** | **Boolean** | Whether an LLM confirmed the finding against its decompilation; null if verification could not be completed, in which case the finding is kept unverified rather than dropped |  |



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| LOW | &quot;low&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



