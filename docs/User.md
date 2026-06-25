

# User


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  [optional] |
|**email** | **String** |  |  |
|**profile** | [**UserProfile**](UserProfile.md) |  |  |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**tier** | [**TierEnum**](#TierEnum) |  |  [optional] |
|**userId** | **Long** |  |  |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| USER | &quot;USER&quot; |
| ADMIN | &quot;ADMIN&quot; |
| SUPERADMIN | &quot;SUPERADMIN&quot; |
| SYSTEM | &quot;SYSTEM&quot; |
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



