

# AccessRuleBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**permission** | [**PermissionEnum**](#PermissionEnum) | VIEW lets the principal read the analysis; EDIT also lets them modify it |  |
|**teamId** | **Long** | The team the rule applies to. Set for a team rule |  [optional] |
|**teamName** | **String** | The team&#39;s name. Set for a team rule |  [optional] |
|**userId** | **Long** | The user the rule applies to. Set for a user rule |  [optional] |
|**username** | **String** | The user&#39;s username. Set for a user rule |  [optional] |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| VIEW | &quot;VIEW&quot; |
| EDIT | &quot;EDIT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



