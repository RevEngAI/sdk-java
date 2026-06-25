

# UpdateUserInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | Email address |  [optional] |
|**firstName** | **String** | First name |  [optional] |
|**lastName** | **String** | Last name |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | User role (SUPERADMIN only) |  [optional] |
|**tier** | [**TierEnum**](#TierEnum) | User tier (SUPERADMIN only) |  [optional] |
|**timeZone** | **String** | IANA time zone |  [optional] |
|**username** | **String** | Username |  [optional] |



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



