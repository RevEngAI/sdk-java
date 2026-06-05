

# PriceSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | Lowercase ISO 4217 currency code. |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | Billing interval at which the price recurs. |  |
|**unitAmount** | **Long** | Price per billing interval, in the smallest unit of the currency. |  |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;month&quot; |
| YEAR | &quot;year&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



