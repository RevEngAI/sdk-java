

# CurrentUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createdAt** | **OffsetDateTime** |  |  |
|**email** | **String** |  |  |
|**isActive** | **Boolean** | Inactive users cannot authenticate |  |
|**profile** | **UserProfile** |  |  |
|**role** | [**RoleEnum**](#RoleEnum) |  |  |
|**signsInWith** | [**SignsInWithEnum**](#SignsInWithEnum) | How the user re-authenticates to delete their account: &#39;password&#39; sends their current password, &#39;sso&#39; signs in again at their identity provider. |  |
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



## Enum: SignsInWithEnum

| Name | Value |
|---- | -----|
| PASSWORD | &quot;password&quot; |
| SSO | &quot;sso&quot; |
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



