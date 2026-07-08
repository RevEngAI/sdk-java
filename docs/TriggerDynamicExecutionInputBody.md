

# TriggerDynamicExecutionInputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveEntryPath** | **String** | Relative path of the entry inside the archive to execute |  [optional] |
|**archivePassword** | **String** | Password for an encrypted archive |  [optional] |
|**archiveSha256Hash** | **String** | SHA-256 of the archive object to send to the sandbox instead of the analysed binary |  [optional] |
|**commandLineArgs** | **String** | Command-line arguments passed to the sample when the sandbox launches it |  [optional] |
|**startMethod** | [**StartMethodEnum**](#StartMethodEnum) | How the sandbox launches the sample. Defaults to the sandbox&#39;s standard behaviour when omitted. |  [optional] |
|**timeout** | [**TimeoutEnum**](#TimeoutEnum) | Maximum sandbox execution time in seconds |  [optional] |



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



