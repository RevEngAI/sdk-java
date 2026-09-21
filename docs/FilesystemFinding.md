

# FilesystemFinding


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**address** | **String** | Function&#39;s virtual address, hex-encoded |  |
|**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Distinct filesystem categories evidenced by this function |  |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | High when a direct name match was found, medium when the function only calls into filesystem APIs |  |
|**directMatches** | **List&lt;FilesystemDirectMatch&gt;** | Matches against the function&#39;s own name |  [optional] |
|**evidenceCount** | **Long** | Total number of direct matches and filesystem calls |  |
|**filesystemCalls** | **List&lt;FilesystemCall&gt;** | Matches against names this function calls |  [optional] |
|**functionId** | **Long** | ID of the function the finding was reported in |  |
|**functionName** | **String** | Name of the function the finding was reported in |  |
|**functionSize** | **Long** | Size of the function in bytes |  |
|**modifies** | **Boolean** | Whether this function evidences modifying the filesystem rather than only observing it |  |
|**sources** | [**List&lt;SourcesEnum&gt;**](#List&lt;SourcesEnum&gt;) | Distinct filesystem sources evidenced by this function |  |



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
| CPP_STDLIB | &quot;cpp-stdlib&quot; |
| GENERIC | &quot;generic&quot; |
| LIBC | &quot;libc&quot; |
| QT | &quot;qt&quot; |
| WINDOWS | &quot;windows&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



