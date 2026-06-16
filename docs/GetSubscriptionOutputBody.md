

# GetSubscriptionOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**endsAt** | **OffsetDateTime** | Date access ends (CANCELING only). |  [optional] |
|**price** | [**PriceSummary**](PriceSummary.md) | Current price (ACTIVE / CANCELING / PAYMENT_ISSUE only). |  [optional] |
|**product** | [**ProductSummary**](ProductSummary.md) | Subscribed product (ACTIVE / CANCELING / PAYMENT_ISSUE only). |  [optional] |
|**renewsAt** | **OffsetDateTime** | Next billing date (ACTIVE only). |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Subscription state. |  |
|**tier** | [**TierEnum**](#TierEnum) | User&#39;s effective tier. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;ACTIVE&quot; |
| CANCELING | &quot;CANCELING&quot; |
| PAYMENT_ISSUE | &quot;PAYMENT_ISSUE&quot; |
| NONE | &quot;NONE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TierEnum

| Name | Value |
|---- | -----|
| ENTHUSIAST | &quot;ENTHUSIAST&quot; |
| REVERSER | &quot;REVERSER&quot; |
| BUG_HUNTER | &quot;BUG_HUNTER&quot; |
| MALWARE_ANALYST | &quot;MALWARE_ANALYST&quot; |
| SECURITY_RESEARCHER | &quot;SECURITY_RESEARCHER&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



