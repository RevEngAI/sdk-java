# RevEng.AI Java SDK

This is the Java SDK for the RevEng.AI API.

To use the SDK you will first need to obtain an API key from [https://reveng.ai](https://reveng.ai/register).

## Installation

Once you have the API key you can install the SDK using Maven or Gradle:

### Maven

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>ai.reveng</groupId>
    <artifactId>sdk</artifactId>
    <version>2.52.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle

Add this dependency to your project's build file:

```groovy
repositories {
    mavenCentral()
}

dependencies {
    implementation "ai.reveng:sdk:2.52.0"
}
```

## Usage

The following is an example of how to use the SDK to get the logs of an analysis:

```java
import ai.reveng.invoker.*;
import ai.reveng.invoker.auth.*;
import ai.reveng.model.*;
import ai.reveng.api.AnalysesCoreApi;

public class App {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: APIKey
        ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
        APIKey.setApiKey(System.getenv("API_KEY"));

        AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
        Integer analysisId = 715320; // Integer

        try {
            BaseResponseLogs result = apiInstance.getAnalysisLogs(analysisId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalysesCommentsApi#createAnalysisComment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.reveng.ai*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnalysesCommentsApi* | [**createAnalysisComment**](docs/AnalysesCommentsApi.md#createAnalysisComment) | **POST** /v2/analyses/{analysis_id}/comments | Create a comment for this analysis
*AnalysesCommentsApi* | [**deleteAnalysisComment**](docs/AnalysesCommentsApi.md#deleteAnalysisComment) | **DELETE** /v2/analyses/{analysis_id}/comments/{comment_id} | Delete a comment
*AnalysesCommentsApi* | [**getAnalysisComments**](docs/AnalysesCommentsApi.md#getAnalysisComments) | **GET** /v2/analyses/{analysis_id}/comments | Get comments for this analysis
*AnalysesCommentsApi* | [**updateAnalysisComment**](docs/AnalysesCommentsApi.md#updateAnalysisComment) | **PATCH** /v2/analyses/{analysis_id}/comments/{comment_id} | Update a comment
*AnalysesCoreApi* | [**createAnalysis**](docs/AnalysesCoreApi.md#createAnalysis) | **POST** /v2/analyses | Create Analysis
*AnalysesCoreApi* | [**deleteAnalysis**](docs/AnalysesCoreApi.md#deleteAnalysis) | **DELETE** /v2/analyses/{analysis_id} | Delete Analysis
*AnalysesCoreApi* | [**getAnalysisBasicInfo**](docs/AnalysesCoreApi.md#getAnalysisBasicInfo) | **GET** /v2/analyses/{analysis_id}/basic | Gets basic analysis information
*AnalysesCoreApi* | [**getAnalysisFunctionMap**](docs/AnalysesCoreApi.md#getAnalysisFunctionMap) | **GET** /v2/analyses/{analysis_id}/func_maps | Get Analysis Function Map
*AnalysesCoreApi* | [**getAnalysisLogs**](docs/AnalysesCoreApi.md#getAnalysisLogs) | **GET** /v2/analyses/{analysis_id}/logs | Gets the logs of an analysis
*AnalysesCoreApi* | [**getAnalysisParams**](docs/AnalysesCoreApi.md#getAnalysisParams) | **GET** /v2/analyses/{analysis_id}/params | Gets analysis param information
*AnalysesCoreApi* | [**getAnalysisStatus**](docs/AnalysesCoreApi.md#getAnalysisStatus) | **GET** /v2/analyses/{analysis_id}/status | Gets the status of an analysis
*AnalysesCoreApi* | [**listAnalyses**](docs/AnalysesCoreApi.md#listAnalyses) | **GET** /v2/analyses/list | Gets the most recent analyses
*AnalysesCoreApi* | [**lookupBinaryId**](docs/AnalysesCoreApi.md#lookupBinaryId) | **GET** /v2/analyses/lookup/{binary_id} | Gets the analysis ID from binary ID
*AnalysesCoreApi* | [**requeueAnalysis**](docs/AnalysesCoreApi.md#requeueAnalysis) | **POST** /v2/analyses/{analysis_id}/requeue | Requeue Analysis
*AnalysesCoreApi* | [**updateAnalysis**](docs/AnalysesCoreApi.md#updateAnalysis) | **PATCH** /v2/analyses/{analysis_id} | Update Analysis
*AnalysesCoreApi* | [**updateAnalysisTags**](docs/AnalysesCoreApi.md#updateAnalysisTags) | **PATCH** /v2/analyses/{analysis_id}/tags | Update Analysis Tags
*AnalysesCoreApi* | [**uploadFile**](docs/AnalysesCoreApi.md#uploadFile) | **POST** /v2/upload | Upload File
*AnalysesDynamicExecutionApi* | [**getDynamicExecutionStatus**](docs/AnalysesDynamicExecutionApi.md#getDynamicExecutionStatus) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/status | Get the status of a dynamic execution task
*AnalysesDynamicExecutionApi* | [**getNetworkOverview**](docs/AnalysesDynamicExecutionApi.md#getNetworkOverview) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/network-overview | Get the dynamic execution results for network overview
*AnalysesDynamicExecutionApi* | [**getProcessDump**](docs/AnalysesDynamicExecutionApi.md#getProcessDump) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-dumps/{dump_name} | Get the dynamic execution results for a specific process dump
*AnalysesDynamicExecutionApi* | [**getProcessDumps**](docs/AnalysesDynamicExecutionApi.md#getProcessDumps) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-dumps | Get the dynamic execution results for process dumps
*AnalysesDynamicExecutionApi* | [**getProcessRegistry**](docs/AnalysesDynamicExecutionApi.md#getProcessRegistry) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-registry | Get the dynamic execution results for process registry
*AnalysesDynamicExecutionApi* | [**getProcessTree**](docs/AnalysesDynamicExecutionApi.md#getProcessTree) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-tree | Get the dynamic execution results for process tree
*AnalysesDynamicExecutionApi* | [**getTtps**](docs/AnalysesDynamicExecutionApi.md#getTtps) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/ttps | Get the dynamic execution results for ttps
*AnalysesResultsMetadataApi* | [**getCapabilities**](docs/AnalysesResultsMetadataApi.md#getCapabilities) | **GET** /v2/analyses/{analysis_id}/capabilities | Gets the capabilities from the analysis
*AnalysesResultsMetadataApi* | [**getCommunities**](docs/AnalysesResultsMetadataApi.md#getCommunities) | **GET** /v2/analyses/{analysis_id}/communities | Gets the communities found in the analysis
*AnalysesResultsMetadataApi* | [**getFunctionsList**](docs/AnalysesResultsMetadataApi.md#getFunctionsList) | **GET** /v2/analyses/{analysis_id}/functions/list | Gets functions from analysis
*AnalysesResultsMetadataApi* | [**getPdf**](docs/AnalysesResultsMetadataApi.md#getPdf) | **GET** /v2/analyses/{analysis_id}/pdf | Gets the PDF found in the analysis
*AnalysesResultsMetadataApi* | [**getSbom**](docs/AnalysesResultsMetadataApi.md#getSbom) | **GET** /v2/analyses/{analysis_id}/sbom | Gets the software-bill-of-materials (SBOM) found in the analysis
*AnalysesResultsMetadataApi* | [**getTags**](docs/AnalysesResultsMetadataApi.md#getTags) | **GET** /v2/analyses/{analysis_id}/tags | Get function tags with maliciousness score
*AnalysesResultsMetadataApi* | [**getVulnerabilities**](docs/AnalysesResultsMetadataApi.md#getVulnerabilities) | **GET** /v2/analyses/{analysis_id}/vulnerabilities | Gets the vulnerabilities found in the analysis
*AnalysesSecurityChecksApi* | [**createScurityChecksTask**](docs/AnalysesSecurityChecksApi.md#createScurityChecksTask) | **POST** /v2/analyses/{analysis_id}/security-checks | Queues a security check process
*AnalysesSecurityChecksApi* | [**getSecurityChecks**](docs/AnalysesSecurityChecksApi.md#getSecurityChecks) | **GET** /v2/analyses/{analysis_id}/security-checks | Get Security Checks
*AnalysesSecurityChecksApi* | [**getSecurityChecksTaskStatus**](docs/AnalysesSecurityChecksApi.md#getSecurityChecksTaskStatus) | **GET** /v2/analyses/{analysis_id}/security-checks/status | Check the status of a security check process
*AuthenticationUsersApi* | [**getRequesterUserInfo**](docs/AuthenticationUsersApi.md#getRequesterUserInfo) | **GET** /v2/users/me | Get the requesters user information
*AuthenticationUsersApi* | [**getUser**](docs/AuthenticationUsersApi.md#getUser) | **GET** /v2/users/{user_id} | Get a user&#39;s public information
*AuthenticationUsersApi* | [**getUserActivity**](docs/AuthenticationUsersApi.md#getUserActivity) | **GET** /v2/users/activity | Get auth user activity
*AuthenticationUsersApi* | [**getUserComments**](docs/AuthenticationUsersApi.md#getUserComments) | **GET** /v2/users/me/comments | Get comments by user
*AuthenticationUsersApi* | [**loginUser**](docs/AuthenticationUsersApi.md#loginUser) | **POST** /v2/auth/login | Authenticate a user
*BinariesApi* | [**downloadZippedBinary**](docs/BinariesApi.md#downloadZippedBinary) | **GET** /v2/binaries/{binary_id}/download-zipped | Downloads a zipped binary with password protection
*BinariesApi* | [**getBinaryAdditionalDetails**](docs/BinariesApi.md#getBinaryAdditionalDetails) | **GET** /v2/binaries/{binary_id}/additional-details | Gets the additional details of a binary
*BinariesApi* | [**getBinaryDetails**](docs/BinariesApi.md#getBinaryDetails) | **GET** /v2/binaries/{binary_id}/details | Gets the details of a binary
*BinariesApi* | [**getBinaryDieInfo**](docs/BinariesApi.md#getBinaryDieInfo) | **GET** /v2/binaries/{binary_id}/die-info | Gets the die info of a binary
*BinariesApi* | [**getBinaryExternals**](docs/BinariesApi.md#getBinaryExternals) | **GET** /v2/binaries/{binary_id}/externals | Gets the external details of a binary
*BinariesApi* | [**getRelatedBinaries**](docs/BinariesApi.md#getRelatedBinaries) | **GET** /v2/binaries/{binary_id}/related | Gets the related binaries of a binary.
*CollectionsApi* | [**createCollection**](docs/CollectionsApi.md#createCollection) | **POST** /v2/collections | Creates new collection information
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /v2/collections/{collection_id} | Deletes a collection
*CollectionsApi* | [**getCollection**](docs/CollectionsApi.md#getCollection) | **GET** /v2/collections/{collection_id} | Returns a collection
*CollectionsApi* | [**listCollections**](docs/CollectionsApi.md#listCollections) | **GET** /v2/collections | Gets basic collections information
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PATCH** /v2/collections/{collection_id} | Updates a collection
*CollectionsApi* | [**updateCollectionBinaries**](docs/CollectionsApi.md#updateCollectionBinaries) | **PATCH** /v2/collections/{collection_id}/binaries | Updates a collection binaries
*CollectionsApi* | [**updateCollectionTags**](docs/CollectionsApi.md#updateCollectionTags) | **PATCH** /v2/collections/{collection_id}/tags | Updates a collection tags
*ExternalSourcesApi* | [**createExternalTaskMb**](docs/ExternalSourcesApi.md#createExternalTaskMb) | **POST** /v2/analysis/{analysis_id}/external/mb | Pulls data from VirusTotal
*ExternalSourcesApi* | [**createExternalTaskVt**](docs/ExternalSourcesApi.md#createExternalTaskVt) | **POST** /v2/analysis/{analysis_id}/external/vt | Pulls data from VirusTotal
*ExternalSourcesApi* | [**getMbData**](docs/ExternalSourcesApi.md#getMbData) | **GET** /v2/analysis/{analysis_id}/external/mb | Get MalwareBazaar data
*ExternalSourcesApi* | [**getMbTaskStatus**](docs/ExternalSourcesApi.md#getMbTaskStatus) | **GET** /v2/analysis/{analysis_id}/external/mb/status | Check the status of MalwareBazaar data retrieval
*ExternalSourcesApi* | [**getVtData**](docs/ExternalSourcesApi.md#getVtData) | **GET** /v2/analysis/{analysis_id}/external/vt | Get VirusTotal data
*ExternalSourcesApi* | [**getVtTaskStatus**](docs/ExternalSourcesApi.md#getVtTaskStatus) | **GET** /v2/analysis/{analysis_id}/external/vt/status | Check the status of VirusTotal data retrieval
*FirmwareApi* | [**getBinariesForFirmwareTask**](docs/FirmwareApi.md#getBinariesForFirmwareTask) | **GET** /v2/firmware/get-binaries/{task_id} | Upload firmware for unpacking
*FirmwareApi* | [**uploadFirmware**](docs/FirmwareApi.md#uploadFirmware) | **POST** /v2/firmware | Upload firmware for unpacking
*FunctionsAiDecompilationApi* | [**createAiDecompilationComment**](docs/FunctionsAiDecompilationApi.md#createAiDecompilationComment) | **POST** /v2/functions/{function_id}/ai-decompilation/comments | Create a comment for this function
*FunctionsAiDecompilationApi* | [**createAiDecompilationTask**](docs/FunctionsAiDecompilationApi.md#createAiDecompilationTask) | **POST** /v2/functions/{function_id}/ai-decompilation | Begins AI Decompilation Process
*FunctionsAiDecompilationApi* | [**deleteAiDecompilationComment**](docs/FunctionsAiDecompilationApi.md#deleteAiDecompilationComment) | **DELETE** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Delete a comment
*FunctionsAiDecompilationApi* | [**getAiDecompilationComments**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationComments) | **GET** /v2/functions/{function_id}/ai-decompilation/comments | Get comments for this function
*FunctionsAiDecompilationApi* | [**getAiDecompilationRating**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationRating) | **GET** /v2/functions/{function_id}/ai-decompilation/rating | Get rating for AI decompilation
*FunctionsAiDecompilationApi* | [**getAiDecompilationTaskResult**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationTaskResult) | **GET** /v2/functions/{function_id}/ai-decompilation | Polls AI Decompilation Process
*FunctionsAiDecompilationApi* | [**getAiDecompilationTaskStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationTaskStatus) | **GET** /v2/functions/{function_id}/ai-decompilation/status | Check the status of a function ai decompilation
*FunctionsAiDecompilationApi* | [**updateAiDecompilationComment**](docs/FunctionsAiDecompilationApi.md#updateAiDecompilationComment) | **PATCH** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Update a comment
*FunctionsAiDecompilationApi* | [**upsertAiDecompilationRating**](docs/FunctionsAiDecompilationApi.md#upsertAiDecompilationRating) | **PATCH** /v2/functions/{function_id}/ai-decompilation/rating | Upsert rating for AI decompilation
*FunctionsBlockCommentsApi* | [**generateBlockCommentsForBlockInFunction**](docs/FunctionsBlockCommentsApi.md#generateBlockCommentsForBlockInFunction) | **POST** /v2/functions/{function_id}/block-comments/single | Generate block comments for a specific block in a function
*FunctionsBlockCommentsApi* | [**generateBlockCommentsForFunction**](docs/FunctionsBlockCommentsApi.md#generateBlockCommentsForFunction) | **POST** /v2/functions/{function_id}/block-comments | Generate block comments for a function
*FunctionsBlockCommentsApi* | [**generateOverviewCommentForFunction**](docs/FunctionsBlockCommentsApi.md#generateOverviewCommentForFunction) | **POST** /v2/functions/{function_id}/block-comments/overview | Generate overview comment for a function
*FunctionsCoreApi* | [**aiUnstrip**](docs/FunctionsCoreApi.md#aiUnstrip) | **POST** /v2/analyses/{analysis_id}/functions/ai-unstrip | Performs matching and auto-unstrip for an analysis and its functions
*FunctionsCoreApi* | [**analysisFunctionMatching**](docs/FunctionsCoreApi.md#analysisFunctionMatching) | **POST** /v2/analyses/{analysis_id}/functions/matches | Perform matching for the functions of an analysis
*FunctionsCoreApi* | [**autoUnstrip**](docs/FunctionsCoreApi.md#autoUnstrip) | **POST** /v2/analyses/{analysis_id}/functions/auto-unstrip | Performs matching and auto-unstrip for an analysis and its functions
*FunctionsCoreApi* | [**batchFunctionMatching**](docs/FunctionsCoreApi.md#batchFunctionMatching) | **POST** /v2/functions/matches | Perform function matching for an arbitrary batch of functions, binaries or collections
*FunctionsCoreApi* | [**cancelAiUnstrip**](docs/FunctionsCoreApi.md#cancelAiUnstrip) | **DELETE** /v2/analyses/{analysis_id}/functions/ai-unstrip/cancel | Cancels a running ai-unstrip
*FunctionsCoreApi* | [**cancelAutoUnstrip**](docs/FunctionsCoreApi.md#cancelAutoUnstrip) | **DELETE** /v2/analyses/{analysis_id}/functions/unstrip/cancel | Cancels a running auto-unstrip
*FunctionsCoreApi* | [**getAnalysisStrings**](docs/FunctionsCoreApi.md#getAnalysisStrings) | **GET** /v2/analyses/{analysis_id}/functions/strings | Get string information found in the Analysis
*FunctionsCoreApi* | [**getFunctionBlocks**](docs/FunctionsCoreApi.md#getFunctionBlocks) | **GET** /v2/functions/{function_id}/blocks | Get disassembly blocks related to the function
*FunctionsCoreApi* | [**getFunctionCalleesCallers**](docs/FunctionsCoreApi.md#getFunctionCalleesCallers) | **GET** /v2/functions/{function_id}/callees_callers | Get list of functions that call or are called by the specified function
*FunctionsCoreApi* | [**getFunctionCapabilities**](docs/FunctionsCoreApi.md#getFunctionCapabilities) | **GET** /v2/functions/{function_id}/capabilities | Retrieve a functions capabilities
*FunctionsCoreApi* | [**getFunctionDetails**](docs/FunctionsCoreApi.md#getFunctionDetails) | **GET** /v2/functions/{function_id} | Get function details
*FunctionsCoreApi* | [**getFunctionStrings**](docs/FunctionsCoreApi.md#getFunctionStrings) | **GET** /v2/functions/{function_id}/strings | Get string information found in the function
*FunctionsDataTypesApi* | [**generateFunctionDataTypesForAnalysis**](docs/FunctionsDataTypesApi.md#generateFunctionDataTypesForAnalysis) | **POST** /v2/analyses/{analysis_id}/functions/data_types | Generate Function Data Types
*FunctionsDataTypesApi* | [**generateFunctionDataTypesForFunctions**](docs/FunctionsDataTypesApi.md#generateFunctionDataTypesForFunctions) | **POST** /v2/functions/data_types | Generate Function Data Types for an arbitrary list of functions
*FunctionsDataTypesApi* | [**getFunctionDataTypes**](docs/FunctionsDataTypesApi.md#getFunctionDataTypes) | **GET** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Get Function Data Types
*FunctionsDataTypesApi* | [**listFunctionDataTypesForAnalysis**](docs/FunctionsDataTypesApi.md#listFunctionDataTypesForAnalysis) | **GET** /v2/analyses/{analysis_id}/functions/data_types | List Function Data Types
*FunctionsDataTypesApi* | [**listFunctionDataTypesForFunctions**](docs/FunctionsDataTypesApi.md#listFunctionDataTypesForFunctions) | **GET** /v2/functions/data_types | List Function Data Types
*FunctionsDataTypesApi* | [**updateFunctionDataTypes**](docs/FunctionsDataTypesApi.md#updateFunctionDataTypes) | **PUT** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Update Function Data Types
*FunctionsDecompilationApi* | [**createDecompilationComment**](docs/FunctionsDecompilationApi.md#createDecompilationComment) | **POST** /v2/functions/{function_id}/decompilation/comments | Create a comment for this function
*FunctionsDecompilationApi* | [**deleteDecompilationComment**](docs/FunctionsDecompilationApi.md#deleteDecompilationComment) | **DELETE** /v2/functions/{function_id}/decompilation/comments/{comment_id} | Delete a comment
*FunctionsDecompilationApi* | [**getDecompilationComments**](docs/FunctionsDecompilationApi.md#getDecompilationComments) | **GET** /v2/functions/{function_id}/decompilation/comments | Get comments for this function
*FunctionsDecompilationApi* | [**updateDecompilationComment**](docs/FunctionsDecompilationApi.md#updateDecompilationComment) | **PATCH** /v2/functions/{function_id}/decompilation/comments/{comment_id} | Update a comment
*FunctionsRenamingHistoryApi* | [**batchRenameFunction**](docs/FunctionsRenamingHistoryApi.md#batchRenameFunction) | **POST** /v2/functions/rename/batch | Batch Rename Functions
*FunctionsRenamingHistoryApi* | [**getFunctionNameHistory**](docs/FunctionsRenamingHistoryApi.md#getFunctionNameHistory) | **GET** /v2/functions/history/{function_id} | Get Function Name History
*FunctionsRenamingHistoryApi* | [**renameFunctionId**](docs/FunctionsRenamingHistoryApi.md#renameFunctionId) | **POST** /v2/functions/rename/{function_id} | Rename Function
*FunctionsRenamingHistoryApi* | [**revertFunctionName**](docs/FunctionsRenamingHistoryApi.md#revertFunctionName) | **POST** /v2/functions/history/{function_id}/{history_id} | Revert the function name
*ModelsApi* | [**getModels**](docs/ModelsApi.md#getModels) | **GET** /v2/models | Gets models
*SearchApi* | [**searchBinaries**](docs/SearchApi.md#searchBinaries) | **GET** /v2/search/binaries | Binaries search
*SearchApi* | [**searchCollections**](docs/SearchApi.md#searchCollections) | **GET** /v2/search/collections | Collections search
*SearchApi* | [**searchFunctions**](docs/SearchApi.md#searchFunctions) | **GET** /v2/search/functions | Functions search
*SearchApi* | [**searchTags**](docs/SearchApi.md#searchTags) | **GET** /v2/search/tags | Tags search


## Documentation for Models

 - [Addr](docs/Addr.md)
 - [AiDecompilationRating](docs/AiDecompilationRating.md)
 - [AiUnstripRequest](docs/AiUnstripRequest.md)
 - [AnalysisAccessInfo](docs/AnalysisAccessInfo.md)
 - [AnalysisConfig](docs/AnalysisConfig.md)
 - [AnalysisCreateRequest](docs/AnalysisCreateRequest.md)
 - [AnalysisCreateResponse](docs/AnalysisCreateResponse.md)
 - [AnalysisDetailResponse](docs/AnalysisDetailResponse.md)
 - [AnalysisFunctionMapping](docs/AnalysisFunctionMapping.md)
 - [AnalysisFunctionMatchingRequest](docs/AnalysisFunctionMatchingRequest.md)
 - [AnalysisFunctions](docs/AnalysisFunctions.md)
 - [AnalysisRecord](docs/AnalysisRecord.md)
 - [AnalysisScope](docs/AnalysisScope.md)
 - [AnalysisStringsResponse](docs/AnalysisStringsResponse.md)
 - [AnalysisTags](docs/AnalysisTags.md)
 - [AnalysisUpdateRequest](docs/AnalysisUpdateRequest.md)
 - [AnalysisUpdateTagsRequest](docs/AnalysisUpdateTagsRequest.md)
 - [AnalysisUpdateTagsResponse](docs/AnalysisUpdateTagsResponse.md)
 - [AppApiRestV2AnalysesEnumsDynamicExecutionStatus](docs/AppApiRestV2AnalysesEnumsDynamicExecutionStatus.md)
 - [AppApiRestV2AnalysesEnumsOrderBy](docs/AppApiRestV2AnalysesEnumsOrderBy.md)
 - [AppApiRestV2CollectionsEnumsOrderBy](docs/AppApiRestV2CollectionsEnumsOrderBy.md)
 - [AppApiRestV2FunctionsResponsesFunction](docs/AppApiRestV2FunctionsResponsesFunction.md)
 - [AppApiRestV2FunctionsTypesFunction](docs/AppApiRestV2FunctionsTypesFunction.md)
 - [AppServicesDynamicExecutionSchemasDynamicExecutionStatus](docs/AppServicesDynamicExecutionSchemasDynamicExecutionStatus.md)
 - [Argument](docs/Argument.md)
 - [AutoUnstripRequest](docs/AutoUnstripRequest.md)
 - [AutoUnstripResponse](docs/AutoUnstripResponse.md)
 - [BaseResponse](docs/BaseResponse.md)
 - [BaseResponseAnalysisCreateResponse](docs/BaseResponseAnalysisCreateResponse.md)
 - [BaseResponseAnalysisDetailResponse](docs/BaseResponseAnalysisDetailResponse.md)
 - [BaseResponseAnalysisFunctionMapping](docs/BaseResponseAnalysisFunctionMapping.md)
 - [BaseResponseAnalysisFunctions](docs/BaseResponseAnalysisFunctions.md)
 - [BaseResponseAnalysisStringsResponse](docs/BaseResponseAnalysisStringsResponse.md)
 - [BaseResponseAnalysisTags](docs/BaseResponseAnalysisTags.md)
 - [BaseResponseAnalysisUpdateTagsResponse](docs/BaseResponseAnalysisUpdateTagsResponse.md)
 - [BaseResponseBasic](docs/BaseResponseBasic.md)
 - [BaseResponseBinaryAdditionalResponse](docs/BaseResponseBinaryAdditionalResponse.md)
 - [BaseResponseBinaryDetailsResponse](docs/BaseResponseBinaryDetailsResponse.md)
 - [BaseResponseBinaryExternalsResponse](docs/BaseResponseBinaryExternalsResponse.md)
 - [BaseResponseBinarySearchResponse](docs/BaseResponseBinarySearchResponse.md)
 - [BaseResponseBlockCommentsGenerationForFunctionResponse](docs/BaseResponseBlockCommentsGenerationForFunctionResponse.md)
 - [BaseResponseBlockCommentsOverviewGenerationResponse](docs/BaseResponseBlockCommentsOverviewGenerationResponse.md)
 - [BaseResponseBool](docs/BaseResponseBool.md)
 - [BaseResponseCalleesCallerFunctionsResponse](docs/BaseResponseCalleesCallerFunctionsResponse.md)
 - [BaseResponseCapabilities](docs/BaseResponseCapabilities.md)
 - [BaseResponseCheckSecurityChecksTaskResponse](docs/BaseResponseCheckSecurityChecksTaskResponse.md)
 - [BaseResponseChildBinariesResponse](docs/BaseResponseChildBinariesResponse.md)
 - [BaseResponseCollectionBinariesUpdateResponse](docs/BaseResponseCollectionBinariesUpdateResponse.md)
 - [BaseResponseCollectionResponse](docs/BaseResponseCollectionResponse.md)
 - [BaseResponseCollectionSearchResponse](docs/BaseResponseCollectionSearchResponse.md)
 - [BaseResponseCollectionTagsUpdateResponse](docs/BaseResponseCollectionTagsUpdateResponse.md)
 - [BaseResponseCommentResponse](docs/BaseResponseCommentResponse.md)
 - [BaseResponseCommunities](docs/BaseResponseCommunities.md)
 - [BaseResponseCreated](docs/BaseResponseCreated.md)
 - [BaseResponseDict](docs/BaseResponseDict.md)
 - [BaseResponseDynamicExecutionStatus](docs/BaseResponseDynamicExecutionStatus.md)
 - [BaseResponseExternalResponse](docs/BaseResponseExternalResponse.md)
 - [BaseResponseFunctionBlocksResponse](docs/BaseResponseFunctionBlocksResponse.md)
 - [BaseResponseFunctionCapabilityResponse](docs/BaseResponseFunctionCapabilityResponse.md)
 - [BaseResponseFunctionDataTypes](docs/BaseResponseFunctionDataTypes.md)
 - [BaseResponseFunctionDataTypesList](docs/BaseResponseFunctionDataTypesList.md)
 - [BaseResponseFunctionSearchResponse](docs/BaseResponseFunctionSearchResponse.md)
 - [BaseResponseFunctionStringsResponse](docs/BaseResponseFunctionStringsResponse.md)
 - [BaseResponseFunctionTaskResponse](docs/BaseResponseFunctionTaskResponse.md)
 - [BaseResponseFunctionsDetailResponse](docs/BaseResponseFunctionsDetailResponse.md)
 - [BaseResponseGenerateFunctionDataTypes](docs/BaseResponseGenerateFunctionDataTypes.md)
 - [BaseResponseGenerationStatusList](docs/BaseResponseGenerationStatusList.md)
 - [BaseResponseGetAiDecompilationRatingResponse](docs/BaseResponseGetAiDecompilationRatingResponse.md)
 - [BaseResponseGetAiDecompilationTask](docs/BaseResponseGetAiDecompilationTask.md)
 - [BaseResponseGetPublicUserResponse](docs/BaseResponseGetPublicUserResponse.md)
 - [BaseResponseGetUserResponse](docs/BaseResponseGetUserResponse.md)
 - [BaseResponseListCollectionResults](docs/BaseResponseListCollectionResults.md)
 - [BaseResponseListCommentResponse](docs/BaseResponseListCommentResponse.md)
 - [BaseResponseListDieMatch](docs/BaseResponseListDieMatch.md)
 - [BaseResponseListFunctionNameHistory](docs/BaseResponseListFunctionNameHistory.md)
 - [BaseResponseListSBOM](docs/BaseResponseListSBOM.md)
 - [BaseResponseListUserActivityResponse](docs/BaseResponseListUserActivityResponse.md)
 - [BaseResponseLoginResponse](docs/BaseResponseLoginResponse.md)
 - [BaseResponseLogs](docs/BaseResponseLogs.md)
 - [BaseResponseModelsResponse](docs/BaseResponseModelsResponse.md)
 - [BaseResponseNetworkOverviewResponse](docs/BaseResponseNetworkOverviewResponse.md)
 - [BaseResponseParams](docs/BaseResponseParams.md)
 - [BaseResponseProcessDumps](docs/BaseResponseProcessDumps.md)
 - [BaseResponseProcessRegistry](docs/BaseResponseProcessRegistry.md)
 - [BaseResponseProcessTree](docs/BaseResponseProcessTree.md)
 - [BaseResponseQueuedSecurityChecksTaskResponse](docs/BaseResponseQueuedSecurityChecksTaskResponse.md)
 - [BaseResponseRecent](docs/BaseResponseRecent.md)
 - [BaseResponseSecurityChecksResponse](docs/BaseResponseSecurityChecksResponse.md)
 - [BaseResponseStatus](docs/BaseResponseStatus.md)
 - [BaseResponseStr](docs/BaseResponseStr.md)
 - [BaseResponseTTPS](docs/BaseResponseTTPS.md)
 - [BaseResponseTagSearchResponse](docs/BaseResponseTagSearchResponse.md)
 - [BaseResponseTaskResponse](docs/BaseResponseTaskResponse.md)
 - [BaseResponseUploadResponse](docs/BaseResponseUploadResponse.md)
 - [BaseResponseVulnerabilities](docs/BaseResponseVulnerabilities.md)
 - [Basic](docs/Basic.md)
 - [BinaryAdditionalDetailsDataResponse](docs/BinaryAdditionalDetailsDataResponse.md)
 - [BinaryAdditionalResponse](docs/BinaryAdditionalResponse.md)
 - [BinaryConfig](docs/BinaryConfig.md)
 - [BinaryDetailsResponse](docs/BinaryDetailsResponse.md)
 - [BinaryExternalsResponse](docs/BinaryExternalsResponse.md)
 - [BinarySearchResponse](docs/BinarySearchResponse.md)
 - [BinarySearchResult](docs/BinarySearchResult.md)
 - [BinaryTaskStatus](docs/BinaryTaskStatus.md)
 - [Block](docs/Block.md)
 - [BlockCommentsGenerationForFunctionResponse](docs/BlockCommentsGenerationForFunctionResponse.md)
 - [CalleeFunctionInfo](docs/CalleeFunctionInfo.md)
 - [CalleesCallerFunctionsResponse](docs/CalleesCallerFunctionsResponse.md)
 - [CallerFunctionInfo](docs/CallerFunctionInfo.md)
 - [Capabilities](docs/Capabilities.md)
 - [Capability](docs/Capability.md)
 - [CheckSecurityChecksTaskResponse](docs/CheckSecurityChecksTaskResponse.md)
 - [ChildBinariesResponse](docs/ChildBinariesResponse.md)
 - [CodeSignatureModel](docs/CodeSignatureModel.md)
 - [CollectionBinariesUpdateRequest](docs/CollectionBinariesUpdateRequest.md)
 - [CollectionBinariesUpdateResponse](docs/CollectionBinariesUpdateResponse.md)
 - [CollectionBinaryResponse](docs/CollectionBinaryResponse.md)
 - [CollectionCreateRequest](docs/CollectionCreateRequest.md)
 - [CollectionListItem](docs/CollectionListItem.md)
 - [CollectionResponse](docs/CollectionResponse.md)
 - [CollectionResponseBinariesInner](docs/CollectionResponseBinariesInner.md)
 - [CollectionScope](docs/CollectionScope.md)
 - [CollectionSearchResponse](docs/CollectionSearchResponse.md)
 - [CollectionSearchResult](docs/CollectionSearchResult.md)
 - [CollectionTagsUpdateRequest](docs/CollectionTagsUpdateRequest.md)
 - [CollectionTagsUpdateResponse](docs/CollectionTagsUpdateResponse.md)
 - [CollectionUpdateRequest](docs/CollectionUpdateRequest.md)
 - [CommentBase](docs/CommentBase.md)
 - [CommentResponse](docs/CommentResponse.md)
 - [CommentUpdateRequest](docs/CommentUpdateRequest.md)
 - [Communities](docs/Communities.md)
 - [CommunityMatchPercentages](docs/CommunityMatchPercentages.md)
 - [ConfidenceType](docs/ConfidenceType.md)
 - [Context](docs/Context.md)
 - [Created](docs/Created.md)
 - [DecompilationCommentContext](docs/DecompilationCommentContext.md)
 - [DieMatch](docs/DieMatch.md)
 - [DynamicExecutionStatusInput](docs/DynamicExecutionStatusInput.md)
 - [ELFImportModel](docs/ELFImportModel.md)
 - [ELFModel](docs/ELFModel.md)
 - [ELFRelocation](docs/ELFRelocation.md)
 - [ELFSection](docs/ELFSection.md)
 - [ELFSecurity](docs/ELFSecurity.md)
 - [ELFSegment](docs/ELFSegment.md)
 - [ELFSymbol](docs/ELFSymbol.md)
 - [ElfDynamicEntry](docs/ElfDynamicEntry.md)
 - [EntrypointModel](docs/EntrypointModel.md)
 - [Enumeration](docs/Enumeration.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [ExportModel](docs/ExportModel.md)
 - [ExternalResponse](docs/ExternalResponse.md)
 - [FileFormat](docs/FileFormat.md)
 - [FileHashes](docs/FileHashes.md)
 - [FileMetadata](docs/FileMetadata.md)
 - [Filters](docs/Filters.md)
 - [FunctionBlockDestinationResponse](docs/FunctionBlockDestinationResponse.md)
 - [FunctionBlockResponse](docs/FunctionBlockResponse.md)
 - [FunctionBlocksResponse](docs/FunctionBlocksResponse.md)
 - [FunctionBoundary](docs/FunctionBoundary.md)
 - [FunctionCapabilityResponse](docs/FunctionCapabilityResponse.md)
 - [FunctionCommentCreateRequest](docs/FunctionCommentCreateRequest.md)
 - [FunctionDataTypes](docs/FunctionDataTypes.md)
 - [FunctionDataTypesList](docs/FunctionDataTypesList.md)
 - [FunctionDataTypesListItem](docs/FunctionDataTypesListItem.md)
 - [FunctionDataTypesParams](docs/FunctionDataTypesParams.md)
 - [FunctionDataTypesStatus](docs/FunctionDataTypesStatus.md)
 - [FunctionHeader](docs/FunctionHeader.md)
 - [FunctionInfoInput](docs/FunctionInfoInput.md)
 - [FunctionInfoInputFuncDepsInner](docs/FunctionInfoInputFuncDepsInner.md)
 - [FunctionInfoOutput](docs/FunctionInfoOutput.md)
 - [FunctionLocalVariableResponse](docs/FunctionLocalVariableResponse.md)
 - [FunctionMapping](docs/FunctionMapping.md)
 - [FunctionMappingFull](docs/FunctionMappingFull.md)
 - [FunctionMatch](docs/FunctionMatch.md)
 - [FunctionMatchingFilters](docs/FunctionMatchingFilters.md)
 - [FunctionMatchingRequest](docs/FunctionMatchingRequest.md)
 - [FunctionMatchingResponse](docs/FunctionMatchingResponse.md)
 - [FunctionNameHistory](docs/FunctionNameHistory.md)
 - [FunctionParamResponse](docs/FunctionParamResponse.md)
 - [FunctionRename](docs/FunctionRename.md)
 - [FunctionRenameMap](docs/FunctionRenameMap.md)
 - [FunctionSearchResponse](docs/FunctionSearchResponse.md)
 - [FunctionSearchResult](docs/FunctionSearchResult.md)
 - [FunctionSourceType](docs/FunctionSourceType.md)
 - [FunctionString](docs/FunctionString.md)
 - [FunctionStringsResponse](docs/FunctionStringsResponse.md)
 - [FunctionTaskResponse](docs/FunctionTaskResponse.md)
 - [FunctionTaskStatus](docs/FunctionTaskStatus.md)
 - [FunctionTypeInput](docs/FunctionTypeInput.md)
 - [FunctionTypeOutput](docs/FunctionTypeOutput.md)
 - [FunctionsDetailResponse](docs/FunctionsDetailResponse.md)
 - [FunctionsListRename](docs/FunctionsListRename.md)
 - [GenerateFunctionDataTypes](docs/GenerateFunctionDataTypes.md)
 - [GenerationStatusList](docs/GenerationStatusList.md)
 - [GetAiDecompilationRatingResponse](docs/GetAiDecompilationRatingResponse.md)
 - [GetAiDecompilationTask](docs/GetAiDecompilationTask.md)
 - [GetPublicUserResponse](docs/GetPublicUserResponse.md)
 - [GetUserResponse](docs/GetUserResponse.md)
 - [GlobalVariable](docs/GlobalVariable.md)
 - [ISA](docs/ISA.md)
 - [IconModel](docs/IconModel.md)
 - [ImportModel](docs/ImportModel.md)
 - [InverseFunctionMapItem](docs/InverseFunctionMapItem.md)
 - [InverseStringMapItem](docs/InverseStringMapItem.md)
 - [InverseValue](docs/InverseValue.md)
 - [ListCollectionResults](docs/ListCollectionResults.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [Logs](docs/Logs.md)
 - [MatchedFunction](docs/MatchedFunction.md)
 - [MatchedFunctionSuggestion](docs/MatchedFunctionSuggestion.md)
 - [MetaModel](docs/MetaModel.md)
 - [ModelName](docs/ModelName.md)
 - [ModelsResponse](docs/ModelsResponse.md)
 - [NameConfidence](docs/NameConfidence.md)
 - [NetworkOverviewDns](docs/NetworkOverviewDns.md)
 - [NetworkOverviewDnsAnswer](docs/NetworkOverviewDnsAnswer.md)
 - [NetworkOverviewMetadata](docs/NetworkOverviewMetadata.md)
 - [NetworkOverviewResponse](docs/NetworkOverviewResponse.md)
 - [Order](docs/Order.md)
 - [PDBDebugModel](docs/PDBDebugModel.md)
 - [PEModel](docs/PEModel.md)
 - [PaginationModel](docs/PaginationModel.md)
 - [Params](docs/Params.md)
 - [Platform](docs/Platform.md)
 - [Process](docs/Process.md)
 - [ProcessDump](docs/ProcessDump.md)
 - [ProcessDumpMetadata](docs/ProcessDumpMetadata.md)
 - [ProcessDumps](docs/ProcessDumps.md)
 - [ProcessDumpsData](docs/ProcessDumpsData.md)
 - [ProcessRegistry](docs/ProcessRegistry.md)
 - [ProcessTree](docs/ProcessTree.md)
 - [QueuedSecurityChecksTaskResponse](docs/QueuedSecurityChecksTaskResponse.md)
 - [ReAnalysisForm](docs/ReAnalysisForm.md)
 - [Recent](docs/Recent.md)
 - [Registry](docs/Registry.md)
 - [RelativeBinaryResponse](docs/RelativeBinaryResponse.md)
 - [SBOM](docs/SBOM.md)
 - [SBOMPackage](docs/SBOMPackage.md)
 - [SandboxOptions](docs/SandboxOptions.md)
 - [ScrapeThirdPartyConfig](docs/ScrapeThirdPartyConfig.md)
 - [SectionModel](docs/SectionModel.md)
 - [SecurityChecksResponse](docs/SecurityChecksResponse.md)
 - [SecurityChecksResult](docs/SecurityChecksResult.md)
 - [SecurityModel](docs/SecurityModel.md)
 - [SeverityType](docs/SeverityType.md)
 - [SingleCodeCertificateModel](docs/SingleCodeCertificateModel.md)
 - [SingleCodeSignatureModel](docs/SingleCodeSignatureModel.md)
 - [SinglePDBEntryModel](docs/SinglePDBEntryModel.md)
 - [SingleSectionModel](docs/SingleSectionModel.md)
 - [StackVariable](docs/StackVariable.md)
 - [StatusInput](docs/StatusInput.md)
 - [StatusOutput](docs/StatusOutput.md)
 - [StringFunctions](docs/StringFunctions.md)
 - [Structure](docs/Structure.md)
 - [StructureMember](docs/StructureMember.md)
 - [Symbols](docs/Symbols.md)
 - [TTPS](docs/TTPS.md)
 - [TTPSAttack](docs/TTPSAttack.md)
 - [TTPSData](docs/TTPSData.md)
 - [TTPSElement](docs/TTPSElement.md)
 - [TTPSOccurance](docs/TTPSOccurance.md)
 - [Tag](docs/Tag.md)
 - [TagItem](docs/TagItem.md)
 - [TagResponse](docs/TagResponse.md)
 - [TagSearchResponse](docs/TagSearchResponse.md)
 - [TagSearchResult](docs/TagSearchResult.md)
 - [TaskResponse](docs/TaskResponse.md)
 - [TaskStatus](docs/TaskStatus.md)
 - [TimestampModel](docs/TimestampModel.md)
 - [TypeDefinition](docs/TypeDefinition.md)
 - [UpdateFunctionDataTypes](docs/UpdateFunctionDataTypes.md)
 - [UploadFileType](docs/UploadFileType.md)
 - [UploadResponse](docs/UploadResponse.md)
 - [UpsertAiDecomplationRatingRequest](docs/UpsertAiDecomplationRatingRequest.md)
 - [UserActivityResponse](docs/UserActivityResponse.md)
 - [Vulnerabilities](docs/Vulnerabilities.md)
 - [Vulnerability](docs/Vulnerability.md)
 - [VulnerabilityType](docs/VulnerabilityType.md)
 - [Workspace](docs/Workspace.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
