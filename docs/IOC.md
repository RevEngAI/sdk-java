

# IOC


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Type of the IOC |  |
|**value** | **String** | Value of the IOC |  |
|**description** | **String** | Description of the IOC |  |
|**source** | **String** | The source address where the IOC can be found in the binary if possible. |  [optional] |
|**functionId** | **Integer** | Unique identifier of the function containing the IOC |  [optional] |
|**functionName** | **String** | Name of the function containing the IOC |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IP | &quot;ip&quot; |
| DOMAIN | &quot;domain&quot; |
| URL | &quot;url&quot; |
| USERNAMES | &quot;usernames&quot; |
| PASSWORDS | &quot;passwords&quot; |
| FILE_HASH | &quot;file_hash&quot; |
| MUTEX | &quot;mutex&quot; |
| REGISTRY_KEY | &quot;registry_key&quot; |
| FILENAME | &quot;filename&quot; |
| EMAIL | &quot;email&quot; |
| C2_ENDPOINT | &quot;c2_endpoint&quot; |
| USER_AGENT | &quot;user_agent&quot; |
| PEM_KEY | &quot;pem_key&quot; |
| SSH_KEY | &quot;ssh_key&quot; |
| NETWORK_PORT | &quot;network_port&quot; |
| JA3 | &quot;ja3&quot; |
| SSL_CERT_FINGERPRINT | &quot;ssl_cert_fingerprint&quot; |
| HTTP_HEADER | &quot;http_header&quot; |
| SERVICE | &quot;service&quot; |
| SCHEDULED_TASK | &quot;scheduled_task&quot; |
| PE_HEADER | &quot;pe_header&quot; |
| ENTROPY | &quot;entropy&quot; |
| OTHER | &quot;other&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



