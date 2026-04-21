

# ReportAnalysisResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**summary** | **String** | A markdown summary of the report |  |
|**softwareType** | [**SoftwareTypeEnum**](#SoftwareTypeEnum) | The type of software being analyzed |  |
|**totalNumberOfFunctions** | **Integer** | The total number of functions identified in the binary |  |
|**numberOfAnalysedFunctions** | **Integer** | The number of functions that were analyzed in the binary |  |
|**attackFlowSummary** | **String** | A summary in markdown format of the attack flow |  |
|**ioCs** | [**List&lt;IOC&gt;**](IOC.md) | A list of IOCs (Indicators of Compromise) found in the analysis |  |
|**executableTechniques** | [**List&lt;MITRETechnique&gt;**](MITRETechnique.md) | A series of MITRE Techniques found |  |
|**yaraRule** | **String** | The YARA rule generated for the binary |  |



## Enum: SoftwareTypeEnum

| Name | Value |
|---- | -----|
| MALICIOUS | &quot;Malicious&quot; |
| BENIGN | &quot;Benign&quot; |
| POTENTIALLY_UNWANTED_APPLICATION_PUA_ | &quot;Potentially Unwanted Application (PUA)&quot; |
| LEGITIMATE | &quot;Legitimate&quot; |
| BACKDOORED_LEGITIMATE_SOFTWARE | &quot;Backdoored Legitimate Software&quot; |



