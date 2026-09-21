

# SandboxConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveEntryPath** | **String** |  |  [optional] |
|**archivePassword** | **String** |  |  [optional] |
|**archiveSha256Hash** | **String** |  |  [optional] |
|**commandLineArgs** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**startMethod** | [**StartMethodEnum**](#StartMethodEnum) |  |  [optional] |
|**timeout** | [**TimeoutEnum**](#TimeoutEnum) |  |  [optional] |



## Enum: StartMethodEnum

| Name | Value |
|---- | -----|
| STANDARD_USER_PROCESS | &quot;standard_user_process&quot; |
| ADMINISTRATOR_PROCESS | &quot;administrator_process&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TimeoutEnum

| Name | Value |
|---- | -----|
| NUMBER_120 | 120l |
| NUMBER_180 | 180l |
| NUMBER_300 | 300l |
| NUMBER_600 | 600l |
| NUMBER_unknown_default_open_api | 11184809l |



