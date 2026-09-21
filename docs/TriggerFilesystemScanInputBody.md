

# TriggerFilesystemScanInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Restrict findings to these categories. Omit to scan the default filesystem-modifying set. |  [optional] |
|**directOnly** | **Boolean** | Only report functions whose own name matches a known filesystem API; skips the calls-into-filesystem pass, avoiding a bulk call-graph fetch. |  [optional] |
|**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Restrict findings to these sources. Omit to scan every source. |  [optional] |



## Enum: List&lt;CategoriesEnum&gt;

| Name | Value |
|---- | -----|
| DIR_READ | &quot;dir-read&quot; |
| DIR_WRITE | &quot;dir-write&quot; |
| ENVIRONMENT | &quot;environment&quot; |
| FILE_DELETE | &quot;file-delete&quot; |
| FILE_OPEN | &quot;file-open&quot; |
| FILE_PERMS | &quot;file-perms&quot; |
| FILE_READ | &quot;file-read&quot; |
| FILE_STAT | &quot;file-stat&quot; |
| FILE_WRITE | &quot;file-write&quot; |
| MODULE | &quot;module&quot; |
| PATH_WRITE | &quot;path-write&quot; |
| PROCESS | &quot;process&quot; |
| REGISTRY_READ | &quot;registry-read&quot; |
| REGISTRY_WRITE | &quot;registry-write&quot; |
| SERVICE | &quot;service&quot; |
| SYSTEM | &quot;system&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: List&lt;SourcesEnum&gt;

| Name | Value |
|---- | -----|
| BOOST | &quot;boost&quot; |
| CPP | &quot;cpp&quot; |
| CPP_STDLIB | &quot;cpp-stdlib&quot; |
| GENERIC | &quot;generic&quot; |
| LIBC | &quot;libc&quot; |
| QT | &quot;qt&quot; |
| WINDOWS | &quot;windows&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



