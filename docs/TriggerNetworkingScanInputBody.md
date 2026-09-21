

# TriggerNetworkingScanInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Restrict findings to these categories. Omit to scan the default remote-communication set. |  [optional] |
|**directOnly** | **Boolean** | Only report functions whose own name matches a known networking API; skips the calls-into-networking pass, avoiding a bulk call-graph fetch. |  [optional] |
|**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Restrict findings to these sources. Omit to scan every source. |  [optional] |



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



