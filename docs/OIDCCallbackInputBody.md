

# OIDCCallbackInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | Authorization code from the identity provider |  |
|**codeVerifier** | **String** | PKCE code verifier (the raw secret, not the challenge) |  |
|**issuer** | **String** | OIDC issuer URL (as returned by the SSO providers endpoint) |  |
|**redirectUri** | **String** | Redirect URI used when initiating the authorization request; must match exactly |  |



