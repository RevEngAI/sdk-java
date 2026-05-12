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
    <version>3.82.1</version>
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
    implementation "ai.reveng:sdk:3.82.1"
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
*AgentApi* | [**checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet**](docs/AgentApi.md#checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities/status | Check the status of a capabilities analysis workflow
*AgentApi* | [**checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet**](docs/AgentApi.md#checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis/status | Check the status of a report analysis workflow
*AgentApi* | [**checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet**](docs/AgentApi.md#checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/triage/status | Check the status of a triage analysis workflow
*AgentApi* | [**createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost**](docs/AgentApi.md#createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost) | **POST** /v2/analyses/{analysis_id}/agent/capabilities | Queues a capabilities analysis workflow process
*AgentApi* | [**createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost**](docs/AgentApi.md#createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost) | **POST** /v2/analyses/{analysis_id}/agent/report-analysis | Queues a combined report analysis workflow process
*AgentApi* | [**createTriageTaskV2AnalysesAnalysisIdAgentTriagePost**](docs/AgentApi.md#createTriageTaskV2AnalysesAnalysisIdAgentTriagePost) | **POST** /v2/analyses/{analysis_id}/agent/triage | Queues a triage analysis workflow process
*AgentApi* | [**getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet**](docs/AgentApi.md#getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities | Get Capabilities Result
*AgentApi* | [**getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet**](docs/AgentApi.md#getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis | Get Report Analysis Result
*AgentApi* | [**getTriageResultV2AnalysesAnalysisIdAgentTriageGet**](docs/AgentApi.md#getTriageResultV2AnalysesAnalysisIdAgentTriageGet) | **GET** /v2/analyses/{analysis_id}/agent/triage | Get Triage Result
*AnalysesBulkActionsApi* | [**bulkAddAnalysisTags**](docs/AnalysesBulkActionsApi.md#bulkAddAnalysisTags) | **PATCH** /v2/analyses/tags/add | Bulk Add Analysis Tags
*AnalysesBulkActionsApi* | [**bulkDeleteAnalyses**](docs/AnalysesBulkActionsApi.md#bulkDeleteAnalyses) | **PATCH** /v2/analyses/delete | Bulk Delete Analyses
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
*AnalysesCoreApi* | [**getAnalysisQueuePosition**](docs/AnalysesCoreApi.md#getAnalysisQueuePosition) | **GET** /v2/analyses/{analysis_id}/queue-position | Get the queue position of an analysis
*AnalysesCoreApi* | [**getAnalysisStatus**](docs/AnalysesCoreApi.md#getAnalysisStatus) | **GET** /v2/analyses/{analysis_id}/status | Gets the status of an analysis
*AnalysesCoreApi* | [**insertAnalysisLog**](docs/AnalysesCoreApi.md#insertAnalysisLog) | **POST** /v2/analyses/{analysis_id}/logs | Insert a log entry for an analysis
*AnalysesCoreApi* | [**listAnalyses**](docs/AnalysesCoreApi.md#listAnalyses) | **GET** /v2/analyses/list | Gets the most recent analyses
*AnalysesCoreApi* | [**lookupBinaryId**](docs/AnalysesCoreApi.md#lookupBinaryId) | **GET** /v2/analyses/lookup/{binary_id} | Gets the analysis ID from binary ID
*AnalysesCoreApi* | [**putAnalysisStrings**](docs/AnalysesCoreApi.md#putAnalysisStrings) | **PUT** /v2/analyses/{analysis_id}/strings | Add strings to the analysis
*AnalysesCoreApi* | [**requeueAnalysis**](docs/AnalysesCoreApi.md#requeueAnalysis) | **POST** /v2/analyses/{analysis_id}/requeue | Requeue Analysis
*AnalysesCoreApi* | [**updateAnalysis**](docs/AnalysesCoreApi.md#updateAnalysis) | **PATCH** /v2/analyses/{analysis_id} | Update Analysis
*AnalysesCoreApi* | [**updateAnalysisTags**](docs/AnalysesCoreApi.md#updateAnalysisTags) | **PATCH** /v2/analyses/{analysis_id}/tags | Update Analysis Tags
*AnalysesCoreApi* | [**uploadFile**](docs/AnalysesCoreApi.md#uploadFile) | **POST** /v2/upload | Upload File
*AnalysesResultsMetadataApi* | [**getAnalysisFunctionsPaginated**](docs/AnalysesResultsMetadataApi.md#getAnalysisFunctionsPaginated) | **GET** /v2/analyses/{analysis_id}/functions | Get functions from analysis
*AnalysesResultsMetadataApi* | [**getCapabilities**](docs/AnalysesResultsMetadataApi.md#getCapabilities) | **GET** /v2/analyses/{analysis_id}/capabilities | Gets the capabilities from the analysis
*AnalysesResultsMetadataApi* | [**getFunctionsList**](docs/AnalysesResultsMetadataApi.md#getFunctionsList) | **GET** /v2/analyses/{analysis_id}/functions/list | Gets functions from analysis
*AnalysesResultsMetadataApi* | [**getPdf**](docs/AnalysesResultsMetadataApi.md#getPdf) | **GET** /v2/analyses/{analysis_id}/pdf | Gets the PDF found in the analysis
*AnalysesResultsMetadataApi* | [**getSbom**](docs/AnalysesResultsMetadataApi.md#getSbom) | **GET** /v2/analyses/{analysis_id}/sbom | Gets the software-bill-of-materials (SBOM) found in the analysis
*AnalysesResultsMetadataApi* | [**getTags**](docs/AnalysesResultsMetadataApi.md#getTags) | **GET** /v2/analyses/{analysis_id}/tags | Get function tags with maliciousness score
*AnalysesResultsMetadataApi* | [**getVulnerabilities**](docs/AnalysesResultsMetadataApi.md#getVulnerabilities) | **GET** /v2/analyses/{analysis_id}/vulnerabilities | Gets the vulnerabilities found in the analysis
*AnalysesXRefsApi* | [**getXrefByVaddr**](docs/AnalysesXRefsApi.md#getXrefByVaddr) | **GET** /v2/analyses/{analysis_id}/xrefs/{vaddr} | [Beta] Look up xrefs by virtual address
*AuthenticationUsersApi* | [**getRequesterUserInfo**](docs/AuthenticationUsersApi.md#getRequesterUserInfo) | **GET** /v2/users/me | Get the requesters user information
*AuthenticationUsersApi* | [**getUser**](docs/AuthenticationUsersApi.md#getUser) | **GET** /v2/users/{user_id} | Get a user&#39;s public information
*AuthenticationUsersApi* | [**getUserActivity**](docs/AuthenticationUsersApi.md#getUserActivity) | **GET** /v2/users/activity | Get auth user activity
*AuthenticationUsersApi* | [**getUserComments**](docs/AuthenticationUsersApi.md#getUserComments) | **GET** /v2/users/me/comments | Get comments by user
*AuthenticationUsersApi* | [**submitUserFeedback**](docs/AuthenticationUsersApi.md#submitUserFeedback) | **POST** /v2/users/feedback | Submit feedback about the application
*BinariesApi* | [**downloadZippedBinary**](docs/BinariesApi.md#downloadZippedBinary) | **GET** /v2/binaries/{binary_id}/download-zipped | Downloads a zipped binary with password protection
*BinariesApi* | [**getBinaryAdditionalDetails**](docs/BinariesApi.md#getBinaryAdditionalDetails) | **GET** /v2/binaries/{binary_id}/additional-details | Gets the additional details of a binary
*BinariesApi* | [**getBinaryAdditionalDetailsStatus**](docs/BinariesApi.md#getBinaryAdditionalDetailsStatus) | **GET** /v2/binaries/{binary_id}/additional-details/status | Gets the status of the additional details task for a binary
*BinariesApi* | [**getBinaryDetails**](docs/BinariesApi.md#getBinaryDetails) | **GET** /v2/binaries/{binary_id}/details | Gets the details of a binary
*BinariesApi* | [**getBinaryDieInfo**](docs/BinariesApi.md#getBinaryDieInfo) | **GET** /v2/binaries/{binary_id}/die-info | Gets the die info of a binary
*BinariesApi* | [**getBinaryExternals**](docs/BinariesApi.md#getBinaryExternals) | **GET** /v2/binaries/{binary_id}/externals | Gets the external details of a binary
*BinariesApi* | [**getBinaryRelatedStatus**](docs/BinariesApi.md#getBinaryRelatedStatus) | **GET** /v2/binaries/{binary_id}/related/status | Gets the status of the unpack binary task for a binary
*BinariesApi* | [**getRelatedBinaries**](docs/BinariesApi.md#getRelatedBinaries) | **GET** /v2/binaries/{binary_id}/related | Gets the related binaries of a binary.
*CollectionsApi* | [**createCollection**](docs/CollectionsApi.md#createCollection) | **POST** /v2/collections | Creates new collection information
*CollectionsApi* | [**deleteCollection**](docs/CollectionsApi.md#deleteCollection) | **DELETE** /v2/collections/{collection_id} | Deletes a collection
*CollectionsApi* | [**getCollection**](docs/CollectionsApi.md#getCollection) | **GET** /v2/collections/{collection_id} | Returns a collection
*CollectionsApi* | [**listCollections**](docs/CollectionsApi.md#listCollections) | **GET** /v2/collections | Gets basic collections information
*CollectionsApi* | [**updateCollection**](docs/CollectionsApi.md#updateCollection) | **PATCH** /v2/collections/{collection_id} | Updates a collection
*CollectionsApi* | [**updateCollectionBinaries**](docs/CollectionsApi.md#updateCollectionBinaries) | **PATCH** /v2/collections/{collection_id}/binaries | Updates a collection binaries
*CollectionsApi* | [**updateCollectionTags**](docs/CollectionsApi.md#updateCollectionTags) | **PATCH** /v2/collections/{collection_id}/tags | Updates a collection tags
*ConfigApi* | [**getConfig**](docs/ConfigApi.md#getConfig) | **GET** /v2/config | Get Config
*ConversationsApi* | [**cancelRun**](docs/ConversationsApi.md#cancelRun) | **POST** /v2/conversations/{id}/cancel | Cancel an active run
*ConversationsApi* | [**confirmTool**](docs/ConversationsApi.md#confirmTool) | **POST** /v2/conversations/{id}/confirm | Approve or reject a pending tool confirmation
*ConversationsApi* | [**createConversation**](docs/ConversationsApi.md#createConversation) | **POST** /v2/conversations | Create a new conversation
*ConversationsApi* | [**getConversation**](docs/ConversationsApi.md#getConversation) | **GET** /v2/conversations/{id} | Get a conversation with its events
*ConversationsApi* | [**listConversations**](docs/ConversationsApi.md#listConversations) | **GET** /v2/conversations | List conversations for the authenticated user
*ConversationsApi* | [**sendMessage**](docs/ConversationsApi.md#sendMessage) | **POST** /v2/conversations/{id}/messages | Send a message and start an agentic run
*ConversationsApi* | [**streamEvents**](docs/ConversationsApi.md#streamEvents) | **GET** /v2/conversations/{id}/events | Stream conversation events (SSE)
*ExternalSourcesApi* | [**createExternalTaskVt**](docs/ExternalSourcesApi.md#createExternalTaskVt) | **POST** /v2/analysis/{analysis_id}/external/vt | Pulls data from VirusTotal
*ExternalSourcesApi* | [**getVtData**](docs/ExternalSourcesApi.md#getVtData) | **GET** /v2/analysis/{analysis_id}/external/vt | Get VirusTotal data
*ExternalSourcesApi* | [**getVtTaskStatus**](docs/ExternalSourcesApi.md#getVtTaskStatus) | **GET** /v2/analysis/{analysis_id}/external/vt/status | Check the status of VirusTotal data retrieval
*FirmwareApi* | [**getBinariesForFirmwareTask**](docs/FirmwareApi.md#getBinariesForFirmwareTask) | **GET** /v2/firmware/get-binaries/{task_id} | Upload firmware for unpacking
*FirmwareApi* | [**uploadFirmware**](docs/FirmwareApi.md#uploadFirmware) | **POST** /v2/firmware | Upload firmware for unpacking
*FunctionsAiDecompilationApi* | [**createAiDecompilation**](docs/FunctionsAiDecompilationApi.md#createAiDecompilation) | **POST** /v3/functions/{function_id}/ai-decompilation | Start AI decompilation
*FunctionsAiDecompilationApi* | [**createAiDecompilationComment**](docs/FunctionsAiDecompilationApi.md#createAiDecompilationComment) | **POST** /v2/functions/{function_id}/ai-decompilation/comments | Create a comment for this function
*FunctionsAiDecompilationApi* | [**createAiDecompilationTask**](docs/FunctionsAiDecompilationApi.md#createAiDecompilationTask) | **POST** /v2/functions/{function_id}/ai-decompilation | Begins AI Decompilation Process
*FunctionsAiDecompilationApi* | [**deleteAiDecompilationComment**](docs/FunctionsAiDecompilationApi.md#deleteAiDecompilationComment) | **DELETE** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Delete a comment
*FunctionsAiDecompilationApi* | [**getAiDecompilation**](docs/FunctionsAiDecompilationApi.md#getAiDecompilation) | **GET** /v3/functions/{function_id}/ai-decompilation | Get AI decompilation result
*FunctionsAiDecompilationApi* | [**getAiDecompilationComments**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationComments) | **GET** /v2/functions/{function_id}/ai-decompilation/comments | Get comments for this function
*FunctionsAiDecompilationApi* | [**getAiDecompilationInlineComments**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationInlineComments) | **GET** /v3/functions/{function_id}/ai-decompilation/inline-comments | Get AI decompilation inline comments
*FunctionsAiDecompilationApi* | [**getAiDecompilationInlineCommentsStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationInlineCommentsStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/inline-comments/status | Get inline comments generation workflow status
*FunctionsAiDecompilationApi* | [**getAiDecompilationRating**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationRating) | **GET** /v2/functions/{function_id}/ai-decompilation/rating | Get rating for AI decompilation
*FunctionsAiDecompilationApi* | [**getAiDecompilationStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/status | Get AI decompilation workflow status
*FunctionsAiDecompilationApi* | [**getAiDecompilationSummary**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationSummary) | **GET** /v3/functions/{function_id}/ai-decompilation/summary | Get AI decompilation summary
*FunctionsAiDecompilationApi* | [**getAiDecompilationSummaryStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationSummaryStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/summary/status | Get summary generation workflow status
*FunctionsAiDecompilationApi* | [**getAiDecompilationTaskResult**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationTaskResult) | **GET** /v2/functions/{function_id}/ai-decompilation | Polls AI Decompilation Process
*FunctionsAiDecompilationApi* | [**getAiDecompilationTaskStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationTaskStatus) | **GET** /v2/functions/{function_id}/ai-decompilation/status | Check the status of a function ai decompilation
*FunctionsAiDecompilationApi* | [**getAiDecompilationTokenised**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationTokenised) | **GET** /v3/functions/{function_id}/ai-decompilation/tokenised | Get tokenised AI decompilation with function mapping
*FunctionsAiDecompilationApi* | [**regenerateAiDecompilationInlineComments**](docs/FunctionsAiDecompilationApi.md#regenerateAiDecompilationInlineComments) | **POST** /v3/functions/{function_id}/ai-decompilation/inline-comments | Regenerate AI decompilation inline comments
*FunctionsAiDecompilationApi* | [**regenerateAiDecompilationSummary**](docs/FunctionsAiDecompilationApi.md#regenerateAiDecompilationSummary) | **POST** /v3/functions/{function_id}/ai-decompilation/summary | Regenerate AI decompilation summary
*FunctionsAiDecompilationApi* | [**updateAiDecompilationComment**](docs/FunctionsAiDecompilationApi.md#updateAiDecompilationComment) | **PATCH** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Update a comment
*FunctionsAiDecompilationApi* | [**upsertAiDecompilationOverrides**](docs/FunctionsAiDecompilationApi.md#upsertAiDecompilationOverrides) | **PATCH** /v3/functions/{function_id}/ai-decompilation/overrides | Upsert variable/function name overrides
*FunctionsAiDecompilationApi* | [**upsertAiDecompilationRating**](docs/FunctionsAiDecompilationApi.md#upsertAiDecompilationRating) | **PATCH** /v2/functions/{function_id}/ai-decompilation/rating | Upsert rating for AI decompilation
*FunctionsCoreApi* | [**aiUnstrip**](docs/FunctionsCoreApi.md#aiUnstrip) | **POST** /v2/analyses/{analysis_id}/functions/ai-unstrip | Performs matching and auto-unstrip for an analysis and its functions
*FunctionsCoreApi* | [**analysisFunctionMatching**](docs/FunctionsCoreApi.md#analysisFunctionMatching) | **POST** /v2/analyses/{analysis_id}/functions/matches | Perform matching for the functions of an analysis
*FunctionsCoreApi* | [**autoUnstrip**](docs/FunctionsCoreApi.md#autoUnstrip) | **POST** /v2/analyses/{analysis_id}/functions/auto-unstrip | Performs matching and auto-unstrip for an analysis and its functions
*FunctionsCoreApi* | [**batchFunctionMatching**](docs/FunctionsCoreApi.md#batchFunctionMatching) | **POST** /v2/functions/matches | Perform function matching for an arbitrary batch of functions, binaries or collections
*FunctionsCoreApi* | [**cancelAiUnstrip**](docs/FunctionsCoreApi.md#cancelAiUnstrip) | **DELETE** /v2/analyses/{analysis_id}/functions/ai-unstrip/cancel | Cancels a running ai-unstrip
*FunctionsCoreApi* | [**cancelAutoUnstrip**](docs/FunctionsCoreApi.md#cancelAutoUnstrip) | **DELETE** /v2/analyses/{analysis_id}/functions/unstrip/cancel | Cancels a running auto-unstrip
*FunctionsCoreApi* | [**getAnalysisStrings**](docs/FunctionsCoreApi.md#getAnalysisStrings) | **GET** /v2/analyses/{analysis_id}/functions/strings | Get string information found in the Analysis
*FunctionsCoreApi* | [**getAnalysisStringsStatus**](docs/FunctionsCoreApi.md#getAnalysisStringsStatus) | **GET** /v2/analyses/{analysis_id}/functions/strings/status | Get string processing state for the Analysis
*FunctionsCoreApi* | [**getFunctionBlocks**](docs/FunctionsCoreApi.md#getFunctionBlocks) | **GET** /v2/functions/{function_id}/blocks | Get disassembly blocks related to the function
*FunctionsCoreApi* | [**getFunctionCalleesCallers**](docs/FunctionsCoreApi.md#getFunctionCalleesCallers) | **GET** /v2/functions/{function_id}/callees_callers | Get list of functions that call or are called by the specified function
*FunctionsCoreApi* | [**getFunctionCalleesCallersBulk**](docs/FunctionsCoreApi.md#getFunctionCalleesCallersBulk) | **GET** /v2/functions/callees_callers | Get list of functions that call or are called for a list of functions
*FunctionsCoreApi* | [**getFunctionCapabilities**](docs/FunctionsCoreApi.md#getFunctionCapabilities) | **GET** /v2/functions/{function_id}/capabilities | Retrieve a functions capabilities
*FunctionsCoreApi* | [**getFunctionDetails**](docs/FunctionsCoreApi.md#getFunctionDetails) | **GET** /v2/functions/{function_id} | Get function details
*FunctionsCoreApi* | [**getFunctionStrings**](docs/FunctionsCoreApi.md#getFunctionStrings) | **GET** /v2/functions/{function_id}/strings | Get string information found in the function
*FunctionsDataTypesApi* | [**generateFunctionDataTypesForAnalysis**](docs/FunctionsDataTypesApi.md#generateFunctionDataTypesForAnalysis) | **POST** /v2/analyses/{analysis_id}/functions/data_types | Generate Function Data Types
*FunctionsDataTypesApi* | [**generateFunctionDataTypesForFunctions**](docs/FunctionsDataTypesApi.md#generateFunctionDataTypesForFunctions) | **POST** /v2/functions/data_types | Generate Function Data Types for an arbitrary list of functions
*FunctionsDataTypesApi* | [**getFunctionDataTypes**](docs/FunctionsDataTypesApi.md#getFunctionDataTypes) | **GET** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Get Function Data Types
*FunctionsDataTypesApi* | [**listFunctionDataTypesForAnalysis**](docs/FunctionsDataTypesApi.md#listFunctionDataTypesForAnalysis) | **GET** /v2/analyses/{analysis_id}/functions/data_types | List Function Data Types
*FunctionsDataTypesApi* | [**listFunctionDataTypesForFunctions**](docs/FunctionsDataTypesApi.md#listFunctionDataTypesForFunctions) | **GET** /v2/functions/data_types | List Function Data Types
*FunctionsDataTypesApi* | [**updateFunctionDataTypes**](docs/FunctionsDataTypesApi.md#updateFunctionDataTypes) | **PUT** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Update Function Data Types
*FunctionsRenamingHistoryApi* | [**batchRenameFunction**](docs/FunctionsRenamingHistoryApi.md#batchRenameFunction) | **POST** /v2/functions/rename/batch | Batch Rename Functions
*FunctionsRenamingHistoryApi* | [**getFunctionNameHistory**](docs/FunctionsRenamingHistoryApi.md#getFunctionNameHistory) | **GET** /v2/functions/history/{function_id} | Get Function Name History
*FunctionsRenamingHistoryApi* | [**renameFunctionId**](docs/FunctionsRenamingHistoryApi.md#renameFunctionId) | **POST** /v2/functions/rename/{function_id} | Rename Function
*FunctionsRenamingHistoryApi* | [**revertFunctionName**](docs/FunctionsRenamingHistoryApi.md#revertFunctionName) | **POST** /v2/functions/history/{function_id}/{history_id} | Revert the function name
*ModelsApi* | [**getModels**](docs/ModelsApi.md#getModels) | **GET** /v2/models | Gets models
*ReportsApi* | [**createPdfReport**](docs/ReportsApi.md#createPdfReport) | **POST** /v3/analysis/{analysis_id}/pdf | Start PDF report generation
*ReportsApi* | [**downloadPdfReport**](docs/ReportsApi.md#downloadPdfReport) | **GET** /v3/analysis/{analysis_id}/pdf/{task_id} | Download generated PDF report
*ReportsApi* | [**getPdfReportStatus**](docs/ReportsApi.md#getPdfReportStatus) | **GET** /v3/analysis/{analysis_id}/pdf/{task_id}/status | Get PDF report workflow status
*SearchApi* | [**searchBinaries**](docs/SearchApi.md#searchBinaries) | **GET** /v2/search/binaries | Binaries search
*SearchApi* | [**searchCollections**](docs/SearchApi.md#searchCollections) | **GET** /v2/search/collections | Collections search
*SearchApi* | [**searchFunctions**](docs/SearchApi.md#searchFunctions) | **GET** /v2/search/functions | Functions search
*SearchApi* | [**searchTags**](docs/SearchApi.md#searchTags) | **GET** /v2/search/tags | Tags search


## Documentation for Models

 - [APIError](docs/APIError.md)
 - [AdditionalDetailsStatusResponse](docs/AdditionalDetailsStatusResponse.md)
 - [Addr](docs/Addr.md)
 - [AiDecompilationRating](docs/AiDecompilationRating.md)
 - [AiDecompilationTaskStatus](docs/AiDecompilationTaskStatus.md)
 - [AiUnstripRequest](docs/AiUnstripRequest.md)
 - [AnalysisAccessInfo](docs/AnalysisAccessInfo.md)
 - [AnalysisBulkAddTagsRequest](docs/AnalysisBulkAddTagsRequest.md)
 - [AnalysisBulkAddTagsResponse](docs/AnalysisBulkAddTagsResponse.md)
 - [AnalysisBulkAddTagsResponseItem](docs/AnalysisBulkAddTagsResponseItem.md)
 - [AnalysisConfig](docs/AnalysisConfig.md)
 - [AnalysisCreateRequest](docs/AnalysisCreateRequest.md)
 - [AnalysisCreateResponse](docs/AnalysisCreateResponse.md)
 - [AnalysisDetailResponse](docs/AnalysisDetailResponse.md)
 - [AnalysisFunctionMapping](docs/AnalysisFunctionMapping.md)
 - [AnalysisFunctionMatchingRequest](docs/AnalysisFunctionMatchingRequest.md)
 - [AnalysisFunctions](docs/AnalysisFunctions.md)
 - [AnalysisFunctionsList](docs/AnalysisFunctionsList.md)
 - [AnalysisRecord](docs/AnalysisRecord.md)
 - [AnalysisReport](docs/AnalysisReport.md)
 - [AnalysisScope](docs/AnalysisScope.md)
 - [AnalysisStringInput](docs/AnalysisStringInput.md)
 - [AnalysisStringsResponse](docs/AnalysisStringsResponse.md)
 - [AnalysisStringsStatusResponse](docs/AnalysisStringsStatusResponse.md)
 - [AnalysisTags](docs/AnalysisTags.md)
 - [AnalysisUpdateRequest](docs/AnalysisUpdateRequest.md)
 - [AnalysisUpdateTagsRequest](docs/AnalysisUpdateTagsRequest.md)
 - [AnalysisUpdateTagsResponse](docs/AnalysisUpdateTagsResponse.md)
 - [ApiCall](docs/ApiCall.md)
 - [AppApiRestV2AgentSchemaCapability](docs/AppApiRestV2AgentSchemaCapability.md)
 - [AppApiRestV2AnalysesEnumsOrderBy](docs/AppApiRestV2AnalysesEnumsOrderBy.md)
 - [AppApiRestV2CollectionsEnumsOrderBy](docs/AppApiRestV2CollectionsEnumsOrderBy.md)
 - [AppApiRestV2FunctionsResponsesFunction](docs/AppApiRestV2FunctionsResponsesFunction.md)
 - [AppApiRestV2FunctionsTypesFunction](docs/AppApiRestV2FunctionsTypesFunction.md)
 - [AppApiRestV2InfoTypesCapability](docs/AppApiRestV2InfoTypesCapability.md)
 - [Argument](docs/Argument.md)
 - [AutoRunAgents](docs/AutoRunAgents.md)
 - [AutoUnstripRequest](docs/AutoUnstripRequest.md)
 - [AutoUnstripResponse](docs/AutoUnstripResponse.md)
 - [BaseResponse](docs/BaseResponse.md)
 - [BaseResponseAdditionalDetailsStatusResponse](docs/BaseResponseAdditionalDetailsStatusResponse.md)
 - [BaseResponseAnalysisBulkAddTagsResponse](docs/BaseResponseAnalysisBulkAddTagsResponse.md)
 - [BaseResponseAnalysisCreateResponse](docs/BaseResponseAnalysisCreateResponse.md)
 - [BaseResponseAnalysisDetailResponse](docs/BaseResponseAnalysisDetailResponse.md)
 - [BaseResponseAnalysisFunctionMapping](docs/BaseResponseAnalysisFunctionMapping.md)
 - [BaseResponseAnalysisFunctions](docs/BaseResponseAnalysisFunctions.md)
 - [BaseResponseAnalysisFunctionsList](docs/BaseResponseAnalysisFunctionsList.md)
 - [BaseResponseAnalysisStringsResponse](docs/BaseResponseAnalysisStringsResponse.md)
 - [BaseResponseAnalysisStringsStatusResponse](docs/BaseResponseAnalysisStringsStatusResponse.md)
 - [BaseResponseAnalysisTags](docs/BaseResponseAnalysisTags.md)
 - [BaseResponseAnalysisUpdateTagsResponse](docs/BaseResponseAnalysisUpdateTagsResponse.md)
 - [BaseResponseBasic](docs/BaseResponseBasic.md)
 - [BaseResponseBinariesRelatedStatusResponse](docs/BaseResponseBinariesRelatedStatusResponse.md)
 - [BaseResponseBinaryAdditionalResponse](docs/BaseResponseBinaryAdditionalResponse.md)
 - [BaseResponseBinaryDetailsResponse](docs/BaseResponseBinaryDetailsResponse.md)
 - [BaseResponseBinaryExternalsResponse](docs/BaseResponseBinaryExternalsResponse.md)
 - [BaseResponseBinarySearchResponse](docs/BaseResponseBinarySearchResponse.md)
 - [BaseResponseBool](docs/BaseResponseBool.md)
 - [BaseResponseCalleesCallerFunctionsResponse](docs/BaseResponseCalleesCallerFunctionsResponse.md)
 - [BaseResponseCapabilities](docs/BaseResponseCapabilities.md)
 - [BaseResponseCapabilitiesAgentResponse](docs/BaseResponseCapabilitiesAgentResponse.md)
 - [BaseResponseChildBinariesResponse](docs/BaseResponseChildBinariesResponse.md)
 - [BaseResponseCollectionBinariesUpdateResponse](docs/BaseResponseCollectionBinariesUpdateResponse.md)
 - [BaseResponseCollectionResponse](docs/BaseResponseCollectionResponse.md)
 - [BaseResponseCollectionSearchResponse](docs/BaseResponseCollectionSearchResponse.md)
 - [BaseResponseCollectionTagsUpdateResponse](docs/BaseResponseCollectionTagsUpdateResponse.md)
 - [BaseResponseCommentResponse](docs/BaseResponseCommentResponse.md)
 - [BaseResponseConfigResponse](docs/BaseResponseConfigResponse.md)
 - [BaseResponseCreated](docs/BaseResponseCreated.md)
 - [BaseResponseDict](docs/BaseResponseDict.md)
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
 - [BaseResponseGetAiDecompilationTask](docs/BaseResponseGetAiDecompilationTask.md)
 - [BaseResponseGetMeResponse](docs/BaseResponseGetMeResponse.md)
 - [BaseResponseGetPublicUserResponse](docs/BaseResponseGetPublicUserResponse.md)
 - [BaseResponseListCalleesCallerFunctionsResponse](docs/BaseResponseListCalleesCallerFunctionsResponse.md)
 - [BaseResponseListCollectionResults](docs/BaseResponseListCollectionResults.md)
 - [BaseResponseListCommentResponse](docs/BaseResponseListCommentResponse.md)
 - [BaseResponseListDieMatch](docs/BaseResponseListDieMatch.md)
 - [BaseResponseListFunctionNameHistory](docs/BaseResponseListFunctionNameHistory.md)
 - [BaseResponseListSBOM](docs/BaseResponseListSBOM.md)
 - [BaseResponseListUserActivityResponse](docs/BaseResponseListUserActivityResponse.md)
 - [BaseResponseLogs](docs/BaseResponseLogs.md)
 - [BaseResponseModelsResponse](docs/BaseResponseModelsResponse.md)
 - [BaseResponseParams](docs/BaseResponseParams.md)
 - [BaseResponseQueuedWorkflowTaskResponse](docs/BaseResponseQueuedWorkflowTaskResponse.md)
 - [BaseResponseRecent](docs/BaseResponseRecent.md)
 - [BaseResponseReportAnalysisResponse](docs/BaseResponseReportAnalysisResponse.md)
 - [BaseResponseStatus](docs/BaseResponseStatus.md)
 - [BaseResponseStr](docs/BaseResponseStr.md)
 - [BaseResponseTagSearchResponse](docs/BaseResponseTagSearchResponse.md)
 - [BaseResponseTaskResponse](docs/BaseResponseTaskResponse.md)
 - [BaseResponseTaskStatusResponse](docs/BaseResponseTaskStatusResponse.md)
 - [BaseResponseTriageReportResponse](docs/BaseResponseTriageReportResponse.md)
 - [BaseResponseUnionGetAiDecompilationRatingResponseNoneType](docs/BaseResponseUnionGetAiDecompilationRatingResponseNoneType.md)
 - [BaseResponseUploadResponse](docs/BaseResponseUploadResponse.md)
 - [BaseResponseVulnerabilities](docs/BaseResponseVulnerabilities.md)
 - [BaseResponseXrefResponse](docs/BaseResponseXrefResponse.md)
 - [Basic](docs/Basic.md)
 - [BinariesRelatedStatusResponse](docs/BinariesRelatedStatusResponse.md)
 - [BinariesTaskStatus](docs/BinariesTaskStatus.md)
 - [BinaryAdditionalDetailsDataResponse](docs/BinaryAdditionalDetailsDataResponse.md)
 - [BinaryAdditionalResponse](docs/BinaryAdditionalResponse.md)
 - [BinaryConfig](docs/BinaryConfig.md)
 - [BinaryDetailsResponse](docs/BinaryDetailsResponse.md)
 - [BinaryExternalsResponse](docs/BinaryExternalsResponse.md)
 - [BinarySearchResponse](docs/BinarySearchResponse.md)
 - [BinarySearchResult](docs/BinarySearchResult.md)
 - [BinaryTaskStatus](docs/BinaryTaskStatus.md)
 - [BulkDeleteAnalysesRequest](docs/BulkDeleteAnalysesRequest.md)
 - [CalleeFunctionInfo](docs/CalleeFunctionInfo.md)
 - [CalleesCallerFunctionsResponse](docs/CalleesCallerFunctionsResponse.md)
 - [CallerFunctionInfo](docs/CallerFunctionInfo.md)
 - [Capabilities](docs/Capabilities.md)
 - [CapabilitiesAgentResponse](docs/CapabilitiesAgentResponse.md)
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
 - [CommentsData](docs/CommentsData.md)
 - [ConfigResponse](docs/ConfigResponse.md)
 - [ConfirmToolInputBody](docs/ConfirmToolInputBody.md)
 - [Connection](docs/Connection.md)
 - [Context](docs/Context.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationContext](docs/ConversationContext.md)
 - [ConversationWithEvents](docs/ConversationWithEvents.md)
 - [CreateAIDecompOutputBody](docs/CreateAIDecompOutputBody.md)
 - [CreateConversationRequest](docs/CreateConversationRequest.md)
 - [Created](docs/Created.md)
 - [DecompilationCommentContext](docs/DecompilationCommentContext.md)
 - [DecompilationData](docs/DecompilationData.md)
 - [DieMatch](docs/DieMatch.md)
 - [DnsQuery](docs/DnsQuery.md)
 - [DrakvufFileMetadata](docs/DrakvufFileMetadata.md)
 - [DynamicExecutionStatus](docs/DynamicExecutionStatus.md)
 - [DynamicExecutionStatusResponse](docs/DynamicExecutionStatusResponse.md)
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
 - [ErrorBody](docs/ErrorBody.md)
 - [ErrorModel](docs/ErrorModel.md)
 - [Event](docs/Event.md)
 - [EventCONTEXTCOMPACTED](docs/EventCONTEXTCOMPACTED.md)
 - [EventRUNCANCELLED](docs/EventRUNCANCELLED.md)
 - [EventRUNERROR](docs/EventRUNERROR.md)
 - [EventRUNFINISHED](docs/EventRUNFINISHED.md)
 - [EventRUNSTARTED](docs/EventRUNSTARTED.md)
 - [EventSTEPFINISHED](docs/EventSTEPFINISHED.md)
 - [EventSTEPSTARTED](docs/EventSTEPSTARTED.md)
 - [EventTEXTMESSAGECONTENT](docs/EventTEXTMESSAGECONTENT.md)
 - [EventTEXTMESSAGEEND](docs/EventTEXTMESSAGEEND.md)
 - [EventTEXTMESSAGESTART](docs/EventTEXTMESSAGESTART.md)
 - [EventTITLEUPDATED](docs/EventTITLEUPDATED.md)
 - [EventTOOLCALLARGSDELTA](docs/EventTOOLCALLARGSDELTA.md)
 - [EventTOOLCALLEND](docs/EventTOOLCALLEND.md)
 - [EventTOOLCALLRESULT](docs/EventTOOLCALLRESULT.md)
 - [EventTOOLCALLSTART](docs/EventTOOLCALLSTART.md)
 - [EventTOOLCONFIRMATIONREQUIRED](docs/EventTOOLCONFIRMATIONREQUIRED.md)
 - [ExportModel](docs/ExportModel.md)
 - [ExternalResponse](docs/ExternalResponse.md)
 - [ExtractedURL](docs/ExtractedURL.md)
 - [FileActivityEntry](docs/FileActivityEntry.md)
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
 - [FunctionListItem](docs/FunctionListItem.md)
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
 - [GeneratePDFOutputBody](docs/GeneratePDFOutputBody.md)
 - [GenerationStatusList](docs/GenerationStatusList.md)
 - [GetAiDecompilationRatingResponse](docs/GetAiDecompilationRatingResponse.md)
 - [GetAiDecompilationTask](docs/GetAiDecompilationTask.md)
 - [GetMeResponse](docs/GetMeResponse.md)
 - [GetPublicUserResponse](docs/GetPublicUserResponse.md)
 - [GlobalVariable](docs/GlobalVariable.md)
 - [HttpRequest](docs/HttpRequest.md)
 - [IOC](docs/IOC.md)
 - [ISA](docs/ISA.md)
 - [IconModel](docs/IconModel.md)
 - [ImportModel](docs/ImportModel.md)
 - [InlineComment](docs/InlineComment.md)
 - [InsertAnalysisLogRequest](docs/InsertAnalysisLogRequest.md)
 - [InverseFunctionMapItem](docs/InverseFunctionMapItem.md)
 - [InverseStringMapItem](docs/InverseStringMapItem.md)
 - [InverseValue](docs/InverseValue.md)
 - [ListCollectionResults](docs/ListCollectionResults.md)
 - [Logs](docs/Logs.md)
 - [MITRETechnique](docs/MITRETechnique.md)
 - [MatchedFunction](docs/MatchedFunction.md)
 - [MatchedFunctionSuggestion](docs/MatchedFunctionSuggestion.md)
 - [MemdumpEntry](docs/MemdumpEntry.md)
 - [MetaModel](docs/MetaModel.md)
 - [ModelName](docs/ModelName.md)
 - [ModelsResponse](docs/ModelsResponse.md)
 - [ModuleLoadEntry](docs/ModuleLoadEntry.md)
 - [MutexEntry](docs/MutexEntry.md)
 - [NameConfidence](docs/NameConfidence.md)
 - [NameSourceType](docs/NameSourceType.md)
 - [NetworkActivity](docs/NetworkActivity.md)
 - [NumericAddr](docs/NumericAddr.md)
 - [Order](docs/Order.md)
 - [PDBDebugModel](docs/PDBDebugModel.md)
 - [PEModel](docs/PEModel.md)
 - [PaginationModel](docs/PaginationModel.md)
 - [Params](docs/Params.md)
 - [Platform](docs/Platform.md)
 - [ProcessActivityEntry](docs/ProcessActivityEntry.md)
 - [ProcessMemdumps](docs/ProcessMemdumps.md)
 - [ProcessNode](docs/ProcessNode.md)
 - [ProcessTree](docs/ProcessTree.md)
 - [ProgressMessage](docs/ProgressMessage.md)
 - [PutAnalysisStringsRequest](docs/PutAnalysisStringsRequest.md)
 - [QueuePositionResponse](docs/QueuePositionResponse.md)
 - [QueuedWorkflowTaskResponse](docs/QueuedWorkflowTaskResponse.md)
 - [ReAnalysisForm](docs/ReAnalysisForm.md)
 - [Recent](docs/Recent.md)
 - [RegenerateOutputBody](docs/RegenerateOutputBody.md)
 - [RegenerateTarget](docs/RegenerateTarget.md)
 - [RegistryOperation](docs/RegistryOperation.md)
 - [RelativeBinaryResponse](docs/RelativeBinaryResponse.md)
 - [ReplacementValue](docs/ReplacementValue.md)
 - [ReportAnalysisResponse](docs/ReportAnalysisResponse.md)
 - [ReportEvent](docs/ReportEvent.md)
 - [ReportInfo](docs/ReportInfo.md)
 - [ReportOptions](docs/ReportOptions.md)
 - [SBOM](docs/SBOM.md)
 - [SBOMPackage](docs/SBOMPackage.md)
 - [SandboxOptions](docs/SandboxOptions.md)
 - [SandboxStartMethod](docs/SandboxStartMethod.md)
 - [SandboxTimeout](docs/SandboxTimeout.md)
 - [ScheduledTaskEntry](docs/ScheduledTaskEntry.md)
 - [ScrapeThirdPartyConfig](docs/ScrapeThirdPartyConfig.md)
 - [SectionModel](docs/SectionModel.md)
 - [SecurityModel](docs/SecurityModel.md)
 - [SegmentInfo](docs/SegmentInfo.md)
 - [SendMessageRequest](docs/SendMessageRequest.md)
 - [ServiceEntry](docs/ServiceEntry.md)
 - [SingleCodeCertificateModel](docs/SingleCodeCertificateModel.md)
 - [SingleCodeSignatureModel](docs/SingleCodeSignatureModel.md)
 - [SinglePDBEntryModel](docs/SinglePDBEntryModel.md)
 - [SingleSectionModel](docs/SingleSectionModel.md)
 - [SseEventContextCompactedData](docs/SseEventContextCompactedData.md)
 - [SseEventRunCancelledData](docs/SseEventRunCancelledData.md)
 - [SseEventRunErrorData](docs/SseEventRunErrorData.md)
 - [SseEventRunFinishedData](docs/SseEventRunFinishedData.md)
 - [SseEventRunStartedData](docs/SseEventRunStartedData.md)
 - [SseEventStepFinishedData](docs/SseEventStepFinishedData.md)
 - [SseEventStepStartedData](docs/SseEventStepStartedData.md)
 - [SseEventTextMessageContentData](docs/SseEventTextMessageContentData.md)
 - [SseEventTextMessageEndData](docs/SseEventTextMessageEndData.md)
 - [SseEventTextMessageStartData](docs/SseEventTextMessageStartData.md)
 - [SseEventTitleUpdatedData](docs/SseEventTitleUpdatedData.md)
 - [SseEventToolCallArgsDeltaData](docs/SseEventToolCallArgsDeltaData.md)
 - [SseEventToolCallEndData](docs/SseEventToolCallEndData.md)
 - [SseEventToolCallResultData](docs/SseEventToolCallResultData.md)
 - [SseEventToolCallStartData](docs/SseEventToolCallStartData.md)
 - [SseEventToolConfirmationRequiredData](docs/SseEventToolConfirmationRequiredData.md)
 - [StackVariable](docs/StackVariable.md)
 - [StartupInfo](docs/StartupInfo.md)
 - [StatusInput](docs/StatusInput.md)
 - [StatusOutput](docs/StatusOutput.md)
 - [StatusResponse](docs/StatusResponse.md)
 - [StreamEvents200ResponseInner](docs/StreamEvents200ResponseInner.md)
 - [StringFunctions](docs/StringFunctions.md)
 - [StringSource](docs/StringSource.md)
 - [Structure](docs/Structure.md)
 - [StructureMember](docs/StructureMember.md)
 - [SubmitUserFeedbackRequest](docs/SubmitUserFeedbackRequest.md)
 - [SummaryData](docs/SummaryData.md)
 - [Symbols](docs/Symbols.md)
 - [Tag](docs/Tag.md)
 - [TagItem](docs/TagItem.md)
 - [TagResponse](docs/TagResponse.md)
 - [TagSearchResponse](docs/TagSearchResponse.md)
 - [TagSearchResult](docs/TagSearchResult.md)
 - [TaskResponse](docs/TaskResponse.md)
 - [TaskStatus](docs/TaskStatus.md)
 - [TaskStatusResponse](docs/TaskStatusResponse.md)
 - [TimestampModel](docs/TimestampModel.md)
 - [TokenisedData](docs/TokenisedData.md)
 - [TriageFunctionResponse](docs/TriageFunctionResponse.md)
 - [TriageReportResponse](docs/TriageReportResponse.md)
 - [Ttp](docs/Ttp.md)
 - [TypeDefinition](docs/TypeDefinition.md)
 - [UpdateFunctionDataTypes](docs/UpdateFunctionDataTypes.md)
 - [UploadFileType](docs/UploadFileType.md)
 - [UploadResponse](docs/UploadResponse.md)
 - [UpsertAiDecomplationRatingRequest](docs/UpsertAiDecomplationRatingRequest.md)
 - [UpsertOverridesData](docs/UpsertOverridesData.md)
 - [UpsertOverridesInputBody](docs/UpsertOverridesInputBody.md)
 - [UserActivityResponse](docs/UserActivityResponse.md)
 - [Vulnerabilities](docs/Vulnerabilities.md)
 - [Vulnerability](docs/Vulnerability.md)
 - [WorkflowProgress](docs/WorkflowProgress.md)
 - [Workspace](docs/Workspace.md)
 - [XrefFromResponse](docs/XrefFromResponse.md)
 - [XrefResponse](docs/XrefResponse.md)
 - [XrefToResponse](docs/XrefToResponse.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
