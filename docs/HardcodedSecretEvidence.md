

# HardcodedSecretEvidence


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | What the rule detects. |  |
|**effect** | [**EffectEnum**](#EffectEnum) | Whether the evidence supports or refutes the finding. |  |
|**entropy** | **Double** | Shannon entropy of the secret, in bits per byte. |  |
|**evidenceKind** | [**EvidenceKindEnum**](#EvidenceKindEnum) | Kind of evidence. |  |
|**kind** | [**KindEnum**](#KindEnum) | How the evidence was derived. |  |
|**references** | **List&lt;Long&gt;** | Address of the secret in the binary&#39;s data. |  |
|**ruleId** | **String** | Identifier of the secret-scanning rule that matched. |  |
|**secret** | **String** | The secret as it appears in the binary. |  |
|**secretKind** | [**SecretKindEnum**](#SecretKindEnum) | Category of the secret. |  |
|**size** | **Long** | Size of the secret in bytes. |  |
|**strength** | [**StrengthEnum**](#StrengthEnum) | How directly the evidence bears on the finding. |  |



## Enum: EffectEnum

| Name | Value |
|---- | -----|
| SUPPORTS | &quot;supports&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



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



## Enum: SecretKindEnum

| Name | Value |
|---- | -----|
| CREDENTIALS | &quot;credentials&quot; |
| API_CREDENTIALS | &quot;api-credentials&quot; |
| OAUTH_CREDENTIALS | &quot;oauth-credentials&quot; |
| ENCRYPTION_KEY | &quot;encryption-key&quot; |
| JWT_TOKEN | &quot;jwt-token&quot; |
| WEBHOOK_URL | &quot;webhook-url&quot; |
| PRIVATE_KEY | &quot;private-key&quot; |
| SIGNED_URL | &quot;signed-url&quot; |
| GENERIC | &quot;generic&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: StrengthEnum

| Name | Value |
|---- | -----|
| DIRECT | &quot;direct&quot; |
| INDIRECT | &quot;indirect&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



