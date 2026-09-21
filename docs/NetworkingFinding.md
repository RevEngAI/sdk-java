

# NetworkingFinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Function&#39;s virtual address, hex-encoded |  |
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Distinct networking categories evidenced by this function |  |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | High when a direct name match was found, medium when the function only calls into networking APIs |  |
|**directMatches** | **List&lt;NetworkingDirectMatch&gt;** | Matches against the function&#39;s own name |  [optional] |
|**evidenceCount** | **Long** | Total number of direct matches and network calls |  |
|**functionId** | **Long** | ID of the function the finding was reported in |  |
|**functionName** | **String** | Name of the function the finding was reported in |  |
|**functionSize** | **Long** | Size of the function in bytes |  |
|**networkCalls** | **List&lt;NetworkingCall&gt;** | Matches against names this function calls |  [optional] |
|**remote** | **Boolean** | Whether this function evidences remote communication rather than only supporting it |  |
|**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Distinct networking sources evidenced by this function |  |



## Enum: List&lt;CategoriesEnum&gt;

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



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| HIGH | &quot;high&quot; |
| MEDIUM | &quot;medium&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;SourcesEnum&gt;

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



