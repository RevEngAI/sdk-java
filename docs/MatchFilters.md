

# MatchFilters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**arch** | [**ArchEnum**](#ArchEnum) | Restrict matches to this architecture (multi-platform models only; matches all architectures if omitted). Rejected for single-architecture models. |  [optional] |
|**binaryIds** | **List&lt;Long&gt;** | Restrict the candidate pool to these binary IDs. |  [optional] |
|**bits** | **Long** | Restrict matches to this word size (multi-platform models only). Rejected for single-architecture models. |  [optional] |
|**collectionIds** | **List&lt;Long&gt;** | Restrict the candidate pool to binaries in these collection IDs. |  [optional] |
|**debugTypes** | **List&lt;String&gt;** | Restrict matches to candidates with these debug source types. Accepted: SYSTEM, USER. |  [optional] |
|**functionIds** | **List&lt;Long&gt;** | Restrict the candidate pool to these function IDs. |  [optional] |
|**platform** | [**PlatformEnum**](#PlatformEnum) | Restrict matches to this platform (multi-platform models only; matches all platforms if omitted). Rejected for single-architecture models. |  [optional] |
|**userIds** | **List&lt;Long&gt;** | Restrict the candidate pool to functions owned by these user IDs. |  [optional] |



## Enum: ArchEnum

| Name | Value |
|---- | -----|
| X86 | &quot;x86&quot; |
| ARM | &quot;arm&quot; |
| UNKNOWN | &quot;unknown&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: PlatformEnum

| Name | Value |
|---- | -----|
| LINUX | &quot;linux&quot; |
| WINDOWS | &quot;windows&quot; |
| ANDROID | &quot;android&quot; |
| MACOS | &quot;macos&quot; |
| UNKNOWN | &quot;unknown&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



