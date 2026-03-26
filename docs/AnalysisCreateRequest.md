

# AnalysisCreateRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisConfig** | [**AnalysisConfig**](AnalysisConfig.md) | The analysis config enables the configuration of optional analysis stages |  [optional] |
|**analysisScope** | **AnalysisScope** | The scope of the analysis determines who can access it |  [optional] |
|**autoRunAgents** | [**AutoRunAgents**](AutoRunAgents.md) |  |  [optional] |
|**binaryConfig** | [**BinaryConfig**](BinaryConfig.md) | The binary config can override automatically determined values such as ISA, Platform, File Format, etc |  [optional] |
|**debugHash** | **String** |  |  [optional] |
|**filename** | **String** | The name of the file |  |
|**sha256Hash** | **String** | The name of the file |  |
|**symbols** | [**Symbols**](Symbols.md) |  |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) | List of community tags to assign to an analysis |  [optional] |



