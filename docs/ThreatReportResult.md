

# ThreatReportResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**ioCs** | **List&lt;IOC&gt;** | Indicators of compromise found. An indicator whose source does not resolve to a function is still listed, without function details. |  |
|**attackFlowSummary** | **String** | Markdown summary of the attack flow |  |
|**executableTechniques** | **List&lt;Technique&gt;** | MITRE ATT&amp;CK techniques found. A technique is listed only when both its function and its ATT&amp;CK catalogue entry resolve. |  |
|**numberOfAnalysedFunctions** | **Long** | Functions the agent analysed |  |
|**softwareType** | **String** | Classification of the binary |  |
|**summary** | **String** | Summary of the analysis findings |  |
|**totalNumberOfFunctions** | **Long** | Functions identified in the binary |  |
|**yaraRule** | **String** | YARA rule generated for the binary |  |



