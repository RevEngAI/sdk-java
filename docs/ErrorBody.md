

# ErrorBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | Stable, machine-readable error code. Versioned and documented. |  |
|**detail** | **String** | Additional context where helpful (quota numbers, validation specifics, etc.). |  [optional] |
|**docUrl** | **String** | Link to documentation explaining this error and resolution steps. |  [optional] |
|**message** | **String** | Human-readable summary. Never contains internals. Suitable for direct display. |  |
|**traceId** | **String** | Correlation ID from the request. Quote this in support requests. |  |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| ACCESS_DENIED | &quot;ACCESS_DENIED&quot; |
| ALREADY_EXISTS | &quot;ALREADY_EXISTS&quot; |
| ANALYSIS_NOT_READY | &quot;ANALYSIS_NOT_READY&quot; |
| BAD_REQUEST | &quot;BAD_REQUEST&quot; |
| CONFLICT | &quot;CONFLICT&quot; |
| CONVERSATION_NOT_FOUND | &quot;CONVERSATION_NOT_FOUND&quot; |
| DOMAIN_ALREADY_CLAIMED | &quot;DOMAIN_ALREADY_CLAIMED&quot; |
| DOMAIN_VERIFICATION_PENDING | &quot;DOMAIN_VERIFICATION_PENDING&quot; |
| DYNAMIC_EXECUTION_INCOMPLETE | &quot;DYNAMIC_EXECUTION_INCOMPLETE&quot; |
| EMAIL_NOT_VERIFIED | &quot;EMAIL_NOT_VERIFIED&quot; |
| EXTERNAL_USER | &quot;EXTERNAL_USER&quot; |
| FORBIDDEN | &quot;FORBIDDEN&quot; |
| GATEWAY_TIMEOUT | &quot;GATEWAY_TIMEOUT&quot; |
| INSUFFICIENT_CREDITS | &quot;INSUFFICIENT_CREDITS&quot; |
| INTERNAL_ERROR | &quot;INTERNAL_ERROR&quot; |
| INTERNAL_ISSUER | &quot;INTERNAL_ISSUER&quot; |
| INVALID_CONVERSATION_ID | &quot;INVALID_CONVERSATION_ID&quot; |
| INVALID_CREDENTIALS | &quot;INVALID_CREDENTIALS&quot; |
| INVALID_RESET_CODE | &quot;INVALID_RESET_CODE&quot; |
| LAST_ORG_OWNER | &quot;LAST_ORG_OWNER&quot; |
| LINKED_TO_ORG | &quot;LINKED_TO_ORG&quot; |
| METHOD_NOT_ALLOWED | &quot;METHOD_NOT_ALLOWED&quot; |
| NOT_ACCEPTABLE | &quot;NOT_ACCEPTABLE&quot; |
| NOT_FOUND | &quot;NOT_FOUND&quot; |
| NO_ACTIVE_RUN | &quot;NO_ACTIVE_RUN&quot; |
| NO_PENDING_CONFIRMATION | &quot;NO_PENDING_CONFIRMATION&quot; |
| OIDC_DISCOVERY_FAILED | &quot;OIDC_DISCOVERY_FAILED&quot; |
| PASSWORD_RESET_REQUIRED | &quot;PASSWORD_RESET_REQUIRED&quot; |
| PAYMENT_REQUIRED | &quot;PAYMENT_REQUIRED&quot; |
| REPORT_RENDER_FAILED | &quot;REPORT_RENDER_FAILED&quot; |
| REQUEST_ENTITY_TOO_LARGE | &quot;REQUEST_ENTITY_TOO_LARGE&quot; |
| RUN_ALREADY_ACTIVE | &quot;RUN_ALREADY_ACTIVE&quot; |
| SELF_DELETION_NOT_ALLOWED | &quot;SELF_DELETION_NOT_ALLOWED&quot; |
| SERVICE_UNAVAILABLE | &quot;SERVICE_UNAVAILABLE&quot; |
| TOKEN_EXPIRED | &quot;TOKEN_EXPIRED&quot; |
| TOKEN_REUSED | &quot;TOKEN_REUSED&quot; |
| TOO_MANY_REQUESTS | &quot;TOO_MANY_REQUESTS&quot; |
| UNAUTHORIZED | &quot;UNAUTHORIZED&quot; |
| UNSUPPORTED_MEDIA_TYPE | &quot;UNSUPPORTED_MEDIA_TYPE&quot; |
| VALIDATION_FAILED | &quot;VALIDATION_FAILED&quot; |
| VERIFICATION_EXPIRED | &quot;VERIFICATION_EXPIRED&quot; |
| VERIFICATION_NOT_FOUND | &quot;VERIFICATION_NOT_FOUND&quot; |



