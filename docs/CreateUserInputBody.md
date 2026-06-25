

# CreateUserInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**credits** | **Long** | Initial credit balance in credits (1 credit &#x3D; 1000 units); defaults to 10 credits |  [optional] |
|**email** | **String** | Email address |  |
|**firstName** | **String** | First name |  [optional] |
|**lastName** | **String** | Last name |  [optional] |
|**password** | **String** | Initial password |  |
|**role** | [**RoleEnum**](#RoleEnum) | User role (defaults to USER) |  [optional] |
|**tier** | [**TierEnum**](#TierEnum) | User tier (defaults to ENTHUSIAST) |  [optional] |
|**timeZone** | **String** | IANA time zone |  [optional] |
|**username** | **String** | Username |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| ADMIN | &quot;ADMIN&quot; |
| SUPERADMIN | &quot;SUPERADMIN&quot; |
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



