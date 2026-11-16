

# DynamicExecutionRunConfig


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**archiveEntryPath** | **String** | Relative path of the archive entry executed. Empty when no archive was used. |  |
|**archiveSha256Hash** | **String** | SHA-256 of the archive sent to the sandbox instead of the analysed binary. Empty when no archive was used. |  |
|**commandLineArgs** | **String** | Command-line arguments passed to the sample. Empty when none were given. |  |
|**hasArchivePassword** | **Boolean** | Whether a password was given for the archive. The password itself is never returned. |  |
|**startMethod** | [**StartMethodEnum**](#StartMethodEnum) | How the sandbox launched the sample. Null when the sandbox&#39;s standard behaviour was used. |  |
|**timeoutSeconds** | **Long** | Maximum sandbox execution time in seconds |  |
|**url** | **String** | URL opened in the sandbox&#39;s browser instead of a sample. Empty for a sample run. |  |



## Enum: StartMethodEnum

| Name | Value |
|---- | -----|
| STANDARD_USER_PROCESS | &quot;standard_user_process&quot; |
| ADMINISTRATOR_PROCESS | &quot;administrator_process&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



