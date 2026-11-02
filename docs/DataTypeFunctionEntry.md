

# DataTypeFunctionEntry


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**functionId** | **Long** |  |  |
|**functionName** | **String** | Current name of the function. |  |
|**usageKinds** | [**List&lt;UsageKindsEnum&gt;**](#List&lt;UsageKindsEnum&gt;) | How the function uses the type, each listed once, in alphabetical order: signature (its return type or a parameter type), inline (its AI decompilation names the type in its code), member (its AI decompilation reads a struct or union member of this type, or it references a global variable of this type). |  |



## Enum: List&lt;UsageKindsEnum&gt;

| Name | Value |
|---- | -----|
| SIGNATURE | &quot;signature&quot; |
| INLINE | &quot;inline&quot; |
| MEMBER | &quot;member&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



