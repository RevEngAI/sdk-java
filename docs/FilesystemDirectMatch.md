

# FilesystemDirectMatch


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**category** | [**CategoryEnum**](#CategoryEnum) | Filesystem category of the match |  |
|**how** | [**HowEnum**](#HowEnum) | Detection tier that produced the match |  |
|**matchedName** | **String** | Name or token that matched |  |
|**source** | [**SourceEnum**](#SourceEnum) | Filesystem source the match belongs to |  |



## Enum: CategoryEnum

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
| CPP_STDLIB | &quot;cpp-stdlib&quot; |
| GENERIC | &quot;generic&quot; |
| LIBC | &quot;libc&quot; |
| QT | &quot;qt&quot; |
| WINDOWS | &quot;windows&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



