

# IssuerAllowedDomain


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**challengeToken** | **String** | DNS TXT challenge token. Add a TXT record at _reveng-verification.&lt;domain&gt; with this value. |  [optional] |
|**createdAt** | **OffsetDateTime** |  |  |
|**domain** | **String** | Email domain (e.g. acme.com) |  |
|**issuerAllowedDomainId** | **Long** |  |  |
|**organisationIssuerId** | **Long** |  |  |
|**verificationStatus** | **String** | Domain ownership verification status: PENDING, VERIFIED, or FAILED |  |



