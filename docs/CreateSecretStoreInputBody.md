

# CreateSecretStoreInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**apiProvider** | [**ApiProviderEnum**](#ApiProviderEnum) |  |  |
|**key** | **String** | The provider&#39;s API key, encrypted before storage. |  |
|**teamId** | **Long** | Registers a team secret when set; the caller must administer that team. Registers a personal secret when omitted. |  [optional] |



## Enum: ApiProviderEnum

| Name | Value |
|---- | -----|
| VIRUS_TOTAL | &quot;virus_total&quot; |
| MALWARE_BAZAAR | &quot;malware_bazaar&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



