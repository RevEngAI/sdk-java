

# AnalysisCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filename** | **String** | The name of the file |  |
|**sha256Hash** | **String** | The sha256 hash of the file |  |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | List of tags to assign to an analysis |  [optional] |
|**analysisScope** | **AnalysisScope** | The scope of the analysis determines who can access it |  [optional] |
|**symbols** | [**Symbols**](Symbols.md) |  |  [optional] |
|**debugHash** | **String** |  |  [optional] |
|**analysisConfig** | [**AnalysisConfig**](AnalysisConfig.md) | The analysis config enables the configuration of optional analysis stages |  [optional] |
|**binaryConfig** | [**BinaryConfig**](BinaryConfig.md) | The binary config can override automatically determined values such as ISA, Platform, File Format, etc |  [optional] |
|**autoRunAgents** | [**AutoRunAgents**](AutoRunAgents.md) |  |  [optional] |



