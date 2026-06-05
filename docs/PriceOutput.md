

# PriceOutput


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currency** | **String** | Lowercase ISO 4217 currency code (e.g. \&quot;usd\&quot;, \&quot;gbp\&quot;). |  |
|**id** | **String** | Price ID. |  |
|**interval** | [**IntervalEnum**](#IntervalEnum) | Billing interval at which the price recurs. |  |
|**unitAmount** | **Long** | Price per billing interval, expressed in the smallest unit of the currency (e.g. cents for USD, pence for GBP). |  |



## Enum: IntervalEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;month&quot; |
| YEAR | &quot;year&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



