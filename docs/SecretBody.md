

# SecretBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**active** | **Boolean** |  |  |
|**apiProvider** | [**ApiProviderEnum**](#ApiProviderEnum) |  |  |
|**creation** | **OffsetDateTime** |  |  |
|**disabledAt** | **OffsetDateTime** |  |  [optional] |
|**id** | **Long** |  |  |
|**key** | **String** | Masked API key showing only the last 4 characters |  |
|**teamId** | **Long** | Null for a personal secret |  [optional] |
|**userId** | **Long** |  |  |
|**valid** | **Boolean** |  |  |



## Enum: ApiProviderEnum

| Name | Value |
|---- | -----|
| VIRUS_TOTAL | &quot;virus_total&quot; |
| MALWARE_BAZAAR | &quot;malware_bazaar&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



