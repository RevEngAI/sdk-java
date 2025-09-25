

# ELFModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fileType** | **String** |  |  |
|**architecture** | **String** |  |  |
|**endianness** | **String** |  |  |
|**entryPoint** | **Integer** |  |  |
|**entryPointBytes** | **String** |  |  |
|**importHash** | **String** |  |  |
|**exportHash** | **String** |  |  |
|**buildId** | **String** |  |  |
|**security** | [**ELFSecurity**](ELFSecurity.md) |  |  |
|**sections** | [**List&lt;ELFSection&gt;**](ELFSection.md) |  |  |
|**segments** | [**List&lt;ELFSegment&gt;**](ELFSegment.md) |  |  |
|**symbols** | [**List&lt;ELFSymbol&gt;**](ELFSymbol.md) |  |  |
|**dynamicSymbols** | [**List&lt;ELFSymbol&gt;**](ELFSymbol.md) |  |  |
|**relocations** | [**List&lt;ELFRelocation&gt;**](ELFRelocation.md) |  |  |
|**imports** | [**ELFImportModel**](ELFImportModel.md) |  |  |
|**exportedFunctions** | **List&lt;String&gt;** |  |  |
|**dynamicEntries** | [**List&lt;ElfDynamicEntry&gt;**](ElfDynamicEntry.md) |  |  |
|**notes** | **List&lt;Map&lt;String, Object&gt;&gt;** |  |  |
|**debugInfo** | **Map&lt;String, Object&gt;** |  |  |
|**versionInfo** | **Map&lt;String, Object&gt;** |  |  |



