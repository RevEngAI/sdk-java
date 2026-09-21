

# TriggerCryptoScanInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Restrict findings to these categories. Omit to scan every category. |  [optional] |
|**directOnly** | **Boolean** | Only report functions whose own name matches a known crypto API; skips the calls-into-crypto pass, avoiding a bulk call-graph fetch. |  [optional] |
|**libraries** | [**List&lt;LibrariesEnum&gt;**](#List&lt;LibrariesEnum&gt;) | Restrict findings to these libraries. Omit to scan every library. |  [optional] |



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



