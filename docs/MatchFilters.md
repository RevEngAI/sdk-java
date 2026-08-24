

# MatchFilters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**architectures** | [**List&lt;ArchitecturesEnum&gt;**](#List&lt;ArchitecturesEnum&gt;) | Restrict matches to candidates whose binary was detected as one of these architectures. Word size is part of the value, so there is no separate bits filter. Matches all architectures if omitted. |  [optional] |
|**binaryIds** | **List&lt;Long&gt;** | Restrict the candidate pool to these binary IDs. |  [optional] |
|**collectionIds** | **List&lt;Long&gt;** | Restrict the candidate pool to binaries in these collection IDs. |  [optional] |
|**debug** | **Boolean** | Restrict matches to candidates with auto/system debug symbols. Multi-platform models only; rejected for single-architecture models. |  [optional] |
|**debugTypes** | **List&lt;String&gt;** | Restrict matches to candidates with these debug source types. Accepted: SYSTEM, USER. |  [optional] |
|**functionIds** | **List&lt;Long&gt;** | Restrict the candidate pool to these function IDs. |  [optional] |
|**includeUserDebug** | **Boolean** | When debug is set, also match user-named functions (not only auto/system debug). No effect unless debug is true. |  [optional] |
|**platforms** | [**List&lt;PlatformsEnum&gt;**](#List&lt;PlatformsEnum&gt;) | Restrict matches to candidates whose binary was detected as one of these platforms. Matches all platforms if omitted; a binary whose detection has not run is never matched by a non-empty filter. |  [optional] |
|**userIds** | **List&lt;Long&gt;** | Restrict the candidate pool to functions owned by these user IDs. |  [optional] |



## Enum: List&lt;ArchitecturesEnum&gt;

| Name | Value |
|---- | -----|
| X86_64 | &quot;x86_64&quot; |
| X86_32 | &quot;x86_32&quot; |
| ARM_64 | &quot;arm_64&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;PlatformsEnum&gt;

| Name | Value |
|---- | -----|
| WINDOWS | &quot;windows&quot; |
| LINUX | &quot;linux&quot; |
| ANDROID | &quot;android&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



