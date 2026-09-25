

# CryptoFinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Function&#39;s virtual address, hex-encoded |  |
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Distinct crypto categories evidenced by this function |  |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | High when a direct name match was found, medium when the function only calls into crypto APIs |  |
|**cryptoCalls** | **List&lt;CryptoCall&gt;** | Matches against names this function calls |  [optional] |
|**directMatches** | **List&lt;CryptoDirectMatch&gt;** | Matches against the function&#39;s own name |  [optional] |
|**evidenceCount** | **Long** | Total number of direct matches and crypto calls |  |
|**functionId** | **Long** | ID of the function the finding was reported in |  |
|**functionName** | **String** | Name of the function the finding was reported in |  |
|**functionSize** | **Long** | Size of the function in bytes |  |
|**libraries** | [**List&lt;LibrariesEnum&gt;**](#List&lt;LibrariesEnum&gt;) | Distinct crypto libraries evidenced by this function |  |
|**verification** | **CryptoVerification** | LLM verdict checking this finding against its decompilation. Present only when the run verified this finding. |  [optional] |



## Enum: List&lt;CategoriesEnum&gt;

| Name | Value |
|---- | -----|
| SYMMETRIC | &quot;symmetric&quot; |
| ASYMMETRIC | &quot;asymmetric&quot; |
| HASHING | &quot;hashing&quot; |
| MAC | &quot;mac&quot; |
| KDF | &quot;kdf&quot; |
| RNG | &quot;rng&quot; |
| GENERIC | &quot;generic&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;LibrariesEnum&gt;

| Name | Value |
|---- | -----|
| OPENSSL | &quot;openssl&quot; |
| MBEDTLS | &quot;mbedtls&quot; |
| WOLFSSL | &quot;wolfssl&quot; |
| LIBSODIUM | &quot;libsodium&quot; |
| LIBGCRYPT | &quot;libgcrypt&quot; |
| WINDOWS_CRYPTO_API | &quot;windows_crypto_api&quot; |
| CRYPTOPP | &quot;cryptopp&quot; |
| CPP_CRYPTO | &quot;cpp-crypto&quot; |
| GENERIC | &quot;generic&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



