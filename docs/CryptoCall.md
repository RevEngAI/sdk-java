

# CryptoCall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calleeName** | **String** | Name of the called function |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Crypto category of the match |  |
|**how** | [**HowEnum**](#HowEnum) | Detection tier that produced the match |  |
|**library** | [**LibraryEnum**](#LibraryEnum) | Crypto library the match belongs to |  |
|**matchedName** | **String** | Name or token that matched |  |



## Enum: CategoryEnum

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



## Enum: HowEnum

| Name | Value |
|---- | -----|
| LIBRARY_API | &quot;library-api&quot; |
| CPP_CLASS_TOKEN | &quot;cpp-class-token&quot; |
| GENERIC_KEYWORD | &quot;generic-keyword&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: LibraryEnum

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



