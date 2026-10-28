

# GrantAccessInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permission** | [**PermissionEnum**](#PermissionEnum) | The level of access to grant |  |
|**teamId** | **Long** | The team to share with. Exactly one of user_id and team_id is required |  [optional] |
|**userId** | **Long** | The user to share with. Exactly one of user_id and team_id is required |  [optional] |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| VIEW | &quot;VIEW&quot; |
| EDIT | &quot;EDIT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



