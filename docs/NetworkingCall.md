

# NetworkingCall


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calleeName** | **String** | Name of the called function |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Networking category of the match |  |
|**how** | [**HowEnum**](#HowEnum) | Detection tier that produced the match |  |
|**matchedName** | **String** | Name or token that matched |  |
|**source** | [**SourceEnum**](#SourceEnum) | Networking source the match belongs to |  |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| ACCEPT | &quot;accept&quot; |
| ADDRESS | &quot;address&quot; |
| CONNECT | &quot;connect&quot; |
| DNS | &quot;dns&quot; |
| HTTP | &quot;http&quot; |
| NETINFO | &quot;netinfo&quot; |
| RAW_PACKET | &quot;raw-packet&quot; |
| RECV | &quot;recv&quot; |
| SEND | &quot;send&quot; |
| SOCKET | &quot;socket&quot; |
| TLS | &quot;tls&quot; |
| URL | &quot;url&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: HowEnum

| Name | Value |
|---- | -----|
| API | &quot;api&quot; |
| CPP_CLASS_TOKEN | &quot;cpp-class-token&quot; |
| GENERIC_KEYWORD | &quot;generic-keyword&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: SourceEnum

| Name | Value |
|---- | -----|
| BOOST | &quot;boost&quot; |
| CPP | &quot;cpp&quot; |
| CURL | &quot;curl&quot; |
| GENERIC | &quot;generic&quot; |
| LIBC | &quot;libc&quot; |
| PCAP | &quot;pcap&quot; |
| POCO | &quot;poco&quot; |
| QT | &quot;qt&quot; |
| TLS | &quot;tls&quot; |
| WINDOWS | &quot;windows&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



