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
    <version>3.124.0</version>
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
    implementation "ai.reveng:sdk:3.124.0"
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
*AnalysesCoreApi* | [**addUserStringToAnalysis**](docs/AnalysesCoreApi.md#addUserStringToAnalysis) | **POST** /v3/analyses/{analysis_id}/user-provided-strings | Add a user-provided string to an analysis.
*AnalysesCoreApi* | [**getAnalysisBasicInfo**](docs/AnalysesCoreApi.md#getAnalysisBasicInfo) | **GET** /v3/analyses/{analysis_id}/basic | Get basic analysis information
*AnalysesCoreApi* | [**getAnalysisBytes**](docs/AnalysesCoreApi.md#getAnalysisBytes) | **GET** /v3/analyses/{analysis_id}/bytes | Get the bytes of a binary
*AnalysesCoreApi* | [**getAnalysisFunctionMatches**](docs/AnalysesCoreApi.md#getAnalysisFunctionMatches) | **GET** /v3/analyses/{analysis_id}/functions/matches | Get function-matching results for an analysis
*AnalysesCoreApi* | [**getAnalysisFunctionMatchingStatus**](docs/AnalysesCoreApi.md#getAnalysisFunctionMatchingStatus) | **GET** /v3/analyses/{analysis_id}/functions/matches/status | Get function-matching status for an analysis
*AnalysesCoreApi* | [**getDynamicExecutionReport**](docs/AnalysesCoreApi.md#getDynamicExecutionReport) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/report | Get dynamic execution report
*AnalysesCoreApi* | [**getDynamicExecutionStatus**](docs/AnalysesCoreApi.md#getDynamicExecutionStatus) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/status | Get dynamic execution status
*AnalysesCoreApi* | [**startAnalysisFunctionMatching**](docs/AnalysesCoreApi.md#startAnalysisFunctionMatching) | **POST** /v3/analyses/{analysis_id}/functions/matches | Start function matching for an analysis
*AnalysesCoreApi* | [**v3GetAnalysisAutoUnstripStatus**](docs/AnalysesCoreApi.md#v3GetAnalysisAutoUnstripStatus) | **GET** /v3/analyses/{analysis_id}/auto-unstrip/status | Get the auto-unstrip status for an analysis.
*AnalysesCoreApi* | [**v3GetAnalysisStrings**](docs/AnalysesCoreApi.md#v3GetAnalysisStrings) | **GET** /v3/analyses/{analysis_id}/functions/strings | List strings for an analysis.
*AnalysesCoreApi* | [**v3GetAnalysisStringsStatus**](docs/AnalysesCoreApi.md#v3GetAnalysisStringsStatus) | **GET** /v3/analyses/{analysis_id}/functions/strings/status | Get the string-extraction status for an analysis.
*AnalysesCoreApi* | [**v3ListAnalyses**](docs/AnalysesCoreApi.md#v3ListAnalyses) | **GET** /v3/analyses | List analyses
*AnalysesCoreApi* | [**v3ListExampleAnalyses**](docs/AnalysesCoreApi.md#v3ListExampleAnalyses) | **GET** /v3/analyses/examples | List example analyses
*BinariesApi* | [**getBinaryAdditionalDetails**](docs/BinariesApi.md#getBinaryAdditionalDetails) | **GET** /v3/binaries/{binary_id}/additional-details | Get additional details for a binary.
*BinariesApi* | [**getBinaryAdditionalDetailsStatus**](docs/BinariesApi.md#getBinaryAdditionalDetailsStatus) | **GET** /v3/binaries/{binary_id}/additional-details/status | Get the additional-details extraction status for a binary.
*CollectionsApi* | [**v3CreateCollection**](docs/CollectionsApi.md#v3CreateCollection) | **POST** /v3/collections | Create a collection.
*CollectionsApi* | [**v3DeleteCollection**](docs/CollectionsApi.md#v3DeleteCollection) | **DELETE** /v3/collections/{collection_id} | Delete a collection.
*CollectionsApi* | [**v3GetCollection**](docs/CollectionsApi.md#v3GetCollection) | **GET** /v3/collections/{collection_id} | Get a collection.
*CollectionsApi* | [**v3ListCollections**](docs/CollectionsApi.md#v3ListCollections) | **GET** /v3/collections | List collections.
*CollectionsApi* | [**v3PatchCollection**](docs/CollectionsApi.md#v3PatchCollection) | **PATCH** /v3/collections/{collection_id} | Update a collection.
*CollectionsApi* | [**v3PatchCollectionBinaries**](docs/CollectionsApi.md#v3PatchCollectionBinaries) | **PATCH** /v3/collections/{collection_id}/binaries | Replace the binaries in a collection.
*CollectionsApi* | [**v3PatchCollectionTags**](docs/CollectionsApi.md#v3PatchCollectionTags) | **PATCH** /v3/collections/{collection_id}/tags | Replace the tags on a collection.
*ConversationsApi* | [**cancelRun**](docs/ConversationsApi.md#cancelRun) | **POST** /v2/conversations/{id}/cancel | Cancel an active run
*ConversationsApi* | [**confirmTool**](docs/ConversationsApi.md#confirmTool) | **POST** /v2/conversations/{id}/confirm | Approve or reject a pending tool confirmation
*ConversationsApi* | [**createConversation**](docs/ConversationsApi.md#createConversation) | **POST** /v2/conversations | Create a new conversation
*ConversationsApi* | [**getConversation**](docs/ConversationsApi.md#getConversation) | **GET** /v2/conversations/{id} | Get a conversation with its events
*ConversationsApi* | [**listConversations**](docs/ConversationsApi.md#listConversations) | **GET** /v2/conversations | List conversations for the authenticated user
*ConversationsApi* | [**sendMessage**](docs/ConversationsApi.md#sendMessage) | **POST** /v2/conversations/{id}/messages | Send a message and start an agentic run
*ConversationsApi* | [**streamEvents**](docs/ConversationsApi.md#streamEvents) | **GET** /v2/conversations/{id}/events | Stream conversation events (SSE)
*FunctionsAiDecompilationApi* | [**createAiDecompilation**](docs/FunctionsAiDecompilationApi.md#createAiDecompilation) | **POST** /v3/functions/{function_id}/ai-decompilation | Start AI decompilation
*FunctionsAiDecompilationApi* | [**deleteAiDecompilationInlineComment**](docs/FunctionsAiDecompilationApi.md#deleteAiDecompilationInlineComment) | **DELETE** /v3/functions/{function_id}/ai-decompilation/inline-comments/{line} | Delete a single inline comment
*FunctionsAiDecompilationApi* | [**getAiDecompilation**](docs/FunctionsAiDecompilationApi.md#getAiDecompilation) | **GET** /v3/functions/{function_id}/ai-decompilation | Get AI decompilation result
*FunctionsAiDecompilationApi* | [**getAiDecompilationInlineComments**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationInlineComments) | **GET** /v3/functions/{function_id}/ai-decompilation/inline-comments | Get AI decompilation inline comments
*FunctionsAiDecompilationApi* | [**getAiDecompilationInlineCommentsStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationInlineCommentsStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/inline-comments/status | Get inline comments generation workflow status
*FunctionsAiDecompilationApi* | [**getAiDecompilationStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/status | Get AI decompilation workflow status
*FunctionsAiDecompilationApi* | [**getAiDecompilationSummary**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationSummary) | **GET** /v3/functions/{function_id}/ai-decompilation/summary | Get AI decompilation summary
*FunctionsAiDecompilationApi* | [**getAiDecompilationSummaryStatus**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationSummaryStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/summary/status | Get summary generation workflow status
*FunctionsAiDecompilationApi* | [**getAiDecompilationTokenised**](docs/FunctionsAiDecompilationApi.md#getAiDecompilationTokenised) | **GET** /v3/functions/{function_id}/ai-decompilation/tokenised | Get tokenised AI decompilation with function mapping
*FunctionsAiDecompilationApi* | [**patchAiDecompilationInlineComment**](docs/FunctionsAiDecompilationApi.md#patchAiDecompilationInlineComment) | **PATCH** /v3/functions/{function_id}/ai-decompilation/inline-comments | Update a single inline comment
*FunctionsAiDecompilationApi* | [**regenerateAiDecompilationInlineComments**](docs/FunctionsAiDecompilationApi.md#regenerateAiDecompilationInlineComments) | **POST** /v3/functions/{function_id}/ai-decompilation/inline-comments | Regenerate AI decompilation inline comments
*FunctionsAiDecompilationApi* | [**regenerateAiDecompilationSummary**](docs/FunctionsAiDecompilationApi.md#regenerateAiDecompilationSummary) | **POST** /v3/functions/{function_id}/ai-decompilation/summary | Regenerate AI decompilation summary
*FunctionsAiDecompilationApi* | [**streamAiDecompilation**](docs/FunctionsAiDecompilationApi.md#streamAiDecompilation) | **GET** /v3/functions/{function_id}/ai-decompilation/events | Stream live AI decompilation output (SSE)
*FunctionsAiDecompilationApi* | [**upsertAiDecompilationOverrides**](docs/FunctionsAiDecompilationApi.md#upsertAiDecompilationOverrides) | **PATCH** /v3/functions/{function_id}/ai-decompilation/overrides | Upsert variable/function name overrides
*FunctionsCoreApi* | [**addFunctionCallee**](docs/FunctionsCoreApi.md#addFunctionCallee) | **POST** /v3/functions/{function_id}/callees | Add a callee to a function
*FunctionsCoreApi* | [**addUserStringToFunction**](docs/FunctionsCoreApi.md#addUserStringToFunction) | **POST** /v3/functions/{function_id}/user-provided-strings | Add a user-provided string to a function.
*FunctionsCoreApi* | [**getFunctionBlocks**](docs/FunctionsCoreApi.md#getFunctionBlocks) | **GET** /v3/functions/{function_id}/blocks | Get function disassembly
*FunctionsCoreApi* | [**getFunctionCalleesCallers**](docs/FunctionsCoreApi.md#getFunctionCalleesCallers) | **GET** /v3/functions/{function_id}/callees-callers | Get callees and callers for a function
*FunctionsCoreApi* | [**getFunctionCapabilities**](docs/FunctionsCoreApi.md#getFunctionCapabilities) | **GET** /v3/functions/{function_id}/capabilities | Get capabilities for a function
*FunctionsCoreApi* | [**getFunctionDetails**](docs/FunctionsCoreApi.md#getFunctionDetails) | **GET** /v3/functions/{function_id} | Get function details
*FunctionsCoreApi* | [**getFunctionIndirectCallSites**](docs/FunctionsCoreApi.md#getFunctionIndirectCallSites) | **GET** /v3/functions/{function_id}/indirect-call-sites | Get indirect call sites for a function
*FunctionsCoreApi* | [**getFunctionStrings**](docs/FunctionsCoreApi.md#getFunctionStrings) | **GET** /v3/functions/{function_id}/strings | List strings for a function.
*FunctionsCoreApi* | [**getFunctionsCalleesCallers**](docs/FunctionsCoreApi.md#getFunctionsCalleesCallers) | **GET** /v3/functions/callees-callers | Get callees and callers for many functions
*FunctionsCoreApi* | [**getFunctionsMatches**](docs/FunctionsCoreApi.md#getFunctionsMatches) | **GET** /v3/functions/matches | Get function-matching results for an explicit set of functions
*FunctionsCoreApi* | [**getFunctionsMatchingStatus**](docs/FunctionsCoreApi.md#getFunctionsMatchingStatus) | **GET** /v3/functions/matches/status | Get function-matching status for an explicit set of functions
*FunctionsCoreApi* | [**getImportedFunction**](docs/FunctionsCoreApi.md#getImportedFunction) | **GET** /v3/analyses/{analysis_id}/imported-functions/{imported_function_id} | Get an imported function with its callers
*FunctionsCoreApi* | [**listAnalysisFunctions**](docs/FunctionsCoreApi.md#listAnalysisFunctions) | **GET** /v3/analyses/{analysis_id}/functions | List functions in an analysis
*FunctionsCoreApi* | [**listImportedFunctions**](docs/FunctionsCoreApi.md#listImportedFunctions) | **GET** /v3/analyses/{analysis_id}/imported-functions | List imported functions in an analysis
*FunctionsCoreApi* | [**startFunctionsMatching**](docs/FunctionsCoreApi.md#startFunctionsMatching) | **POST** /v3/functions/matches | Start function matching for an explicit set of functions
*FunctionsCoreApi* | [**v3CanonicalizeFunctionNames**](docs/FunctionsCoreApi.md#v3CanonicalizeFunctionNames) | **POST** /v3/functions/canonical-names | Canonicalize a batch of function names
*FunctionsDataTypesApi* | [**batchUpdateFunctionDataTypes**](docs/FunctionsDataTypesApi.md#batchUpdateFunctionDataTypes) | **PUT** /v3/analyses/{analysis_id}/functions/data-types | Batch update function data types
*FunctionsDataTypesApi* | [**getFunctionDataTypes**](docs/FunctionsDataTypesApi.md#getFunctionDataTypes) | **GET** /v3/analyses/{analysis_id}/functions/{function_id}/data-types | Get data types for a single function
*FunctionsDataTypesApi* | [**listAnalysisFunctionsDataTypes**](docs/FunctionsDataTypesApi.md#listAnalysisFunctionsDataTypes) | **GET** /v3/analyses/{analysis_id}/functions/data-types | List data types for all functions in an analysis
*FunctionsDataTypesApi* | [**listFunctionsDataTypes**](docs/FunctionsDataTypesApi.md#listFunctionsDataTypes) | **GET** /v3/functions/data-types | Get data types for many functions
*FunctionsDataTypesApi* | [**updateFunctionDataTypes**](docs/FunctionsDataTypesApi.md#updateFunctionDataTypes) | **PUT** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Update function data types
*FunctionsRenamingHistoryApi* | [**batchRenameFunctions**](docs/FunctionsRenamingHistoryApi.md#batchRenameFunctions) | **POST** /v3/functions/rename | Batch rename functions
*FunctionsRenamingHistoryApi* | [**getFunctionHistory**](docs/FunctionsRenamingHistoryApi.md#getFunctionHistory) | **GET** /v3/functions/{function_id}/history | Get function name history
*FunctionsRenamingHistoryApi* | [**renameFunction**](docs/FunctionsRenamingHistoryApi.md#renameFunction) | **POST** /v3/functions/{function_id}/rename | Rename a function
*FunctionsRenamingHistoryApi* | [**revertFunctionName**](docs/FunctionsRenamingHistoryApi.md#revertFunctionName) | **POST** /v3/functions/{function_id}/history/{history_id}/revert | Revert function name
*IamUsersApi* | [**getMe**](docs/IamUsersApi.md#getMe) | **GET** /v2/iam/me | Get current user
*IamUsersApi* | [**getMyPermissions**](docs/IamUsersApi.md#getMyPermissions) | **GET** /v2/iam/me/permissions | Get current user permissions
*ReportsApi* | [**createPdfReport**](docs/ReportsApi.md#createPdfReport) | **POST** /v3/analyses/{analysis_id}/pdf | Start PDF report generation
*ReportsApi* | [**downloadPdfReport**](docs/ReportsApi.md#downloadPdfReport) | **GET** /v3/analyses/{analysis_id}/pdf | Download generated PDF report
*ReportsApi* | [**getPdfReportStatus**](docs/ReportsApi.md#getPdfReportStatus) | **GET** /v3/analyses/{analysis_id}/pdf/status | Get PDF report workflow status


## Documentation for Models

 - [AIDecompFunctionMapping](docs/AIDecompFunctionMapping.md)
 - [AIDecompInverseFunctionMapItem](docs/AIDecompInverseFunctionMapItem.md)
 - [AIDecompInverseStringMapItem](docs/AIDecompInverseStringMapItem.md)
 - [APIError](docs/APIError.md)
 - [AddCalleeInputBody](docs/AddCalleeInputBody.md)
 - [AddIssuerDomainInputBody](docs/AddIssuerDomainInputBody.md)
 - [AddOwnerInputBody](docs/AddOwnerInputBody.md)
 - [AddTeamMemberInputBody](docs/AddTeamMemberInputBody.md)
 - [AddUserStringInputBody](docs/AddUserStringInputBody.md)
 - [AddUserStringToFunctionInputBody](docs/AddUserStringToFunctionInputBody.md)
 - [AnalysisBasicInfoOutputBody](docs/AnalysisBasicInfoOutputBody.md)
 - [AnalysisFunctionEntry](docs/AnalysisFunctionEntry.md)
 - [AnalysisLogMessage](docs/AnalysisLogMessage.md)
 - [AnalysisLogs](docs/AnalysisLogs.md)
 - [AnalysisRecordBody](docs/AnalysisRecordBody.md)
 - [AnalysisReport](docs/AnalysisReport.md)
 - [AnalysisStringFunction](docs/AnalysisStringFunction.md)
 - [AnalysisStringItem](docs/AnalysisStringItem.md)
 - [AnalysisTagBody](docs/AnalysisTagBody.md)
 - [ApiCall](docs/ApiCall.md)
 - [ArchiveContentEntry](docs/ArchiveContentEntry.md)
 - [Artifact](docs/Artifact.md)
 - [AttemptFailedEvent](docs/AttemptFailedEvent.md)
 - [AttemptStartedEvent](docs/AttemptStartedEvent.md)
 - [AutoUnstripStatusOutputBody](docs/AutoUnstripStatusOutputBody.md)
 - [BatchBinaryMatchResult](docs/BatchBinaryMatchResult.md)
 - [BatchMatchingOutputBody](docs/BatchMatchingOutputBody.md)
 - [BatchRenameInputBody](docs/BatchRenameInputBody.md)
 - [BatchRenameItem](docs/BatchRenameItem.md)
 - [BatchRenameOutputBody](docs/BatchRenameOutputBody.md)
 - [BatchUpdateDataTypesInputBody](docs/BatchUpdateDataTypesInputBody.md)
 - [BatchUpdateDataTypesItem](docs/BatchUpdateDataTypesItem.md)
 - [BatchUpdateDataTypesOutputBody](docs/BatchUpdateDataTypesOutputBody.md)
 - [BatchUpdateDataTypesResult](docs/BatchUpdateDataTypesResult.md)
 - [Binary](docs/Binary.md)
 - [BulkCreateUserResult](docs/BulkCreateUserResult.md)
 - [BulkCreateUsersOutputBody](docs/BulkCreateUsersOutputBody.md)
 - [CallEdge](docs/CallEdge.md)
 - [CallEdgesOutputBody](docs/CallEdgesOutputBody.md)
 - [CanonicalName](docs/CanonicalName.md)
 - [CanonicalizeNamesInputBody](docs/CanonicalizeNamesInputBody.md)
 - [CanonicalizeNamesOutputBody](docs/CanonicalizeNamesOutputBody.md)
 - [CapabilitiesOutputBody](docs/CapabilitiesOutputBody.md)
 - [CapabilityEntry](docs/CapabilityEntry.md)
 - [CollectionListItemBody](docs/CollectionListItemBody.md)
 - [CommentsData](docs/CommentsData.md)
 - [ConfirmToolInputBody](docs/ConfirmToolInputBody.md)
 - [Connection](docs/Connection.md)
 - [ConsoleOutputEntry](docs/ConsoleOutputEntry.md)
 - [Conversation](docs/Conversation.md)
 - [ConversationContext](docs/ConversationContext.md)
 - [ConversationWithEvents](docs/ConversationWithEvents.md)
 - [CreateAIDecompOutputBody](docs/CreateAIDecompOutputBody.md)
 - [CreateCheckoutSessionInputBody](docs/CreateCheckoutSessionInputBody.md)
 - [CreateCollectionInputBody](docs/CreateCollectionInputBody.md)
 - [CreateCollectionOutputBody](docs/CreateCollectionOutputBody.md)
 - [CreateConversationRequest](docs/CreateConversationRequest.md)
 - [CreateGroupInputBody](docs/CreateGroupInputBody.md)
 - [CreateIdentityInputBody](docs/CreateIdentityInputBody.md)
 - [CreateIssuerInputBody](docs/CreateIssuerInputBody.md)
 - [CreateOrganisationInputBody](docs/CreateOrganisationInputBody.md)
 - [CreatePortalSessionInputBody](docs/CreatePortalSessionInputBody.md)
 - [CreateTeamInputBody](docs/CreateTeamInputBody.md)
 - [CreateUserInputBody](docs/CreateUserInputBody.md)
 - [DataTypesEntry](docs/DataTypesEntry.md)
 - [DecompFailedEvent](docs/DecompFailedEvent.md)
 - [DecompFinishedEvent](docs/DecompFinishedEvent.md)
 - [DecompilationData](docs/DecompilationData.md)
 - [DisassemblyOutputBody](docs/DisassemblyOutputBody.md)
 - [DnsQuery](docs/DnsQuery.md)
 - [DrakvufFileMetadata](docs/DrakvufFileMetadata.md)
 - [DynamicExecutionStatusResponse](docs/DynamicExecutionStatusResponse.md)
 - [ErrorBody](docs/ErrorBody.md)
 - [Event](docs/Event.md)
 - [EventAttemptFailed](docs/EventAttemptFailed.md)
 - [EventAttemptStarted](docs/EventAttemptStarted.md)
 - [EventCONTEXTCOMPACTED](docs/EventCONTEXTCOMPACTED.md)
 - [EventDecompFailed](docs/EventDecompFailed.md)
 - [EventDecompFinished](docs/EventDecompFinished.md)
 - [EventProse](docs/EventProse.md)
 - [EventRUNCANCELLED](docs/EventRUNCANCELLED.md)
 - [EventRUNERROR](docs/EventRUNERROR.md)
 - [EventRUNFINISHED](docs/EventRUNFINISHED.md)
 - [EventRUNSTARTED](docs/EventRUNSTARTED.md)
 - [EventRenameApplied](docs/EventRenameApplied.md)
 - [EventSTEPFINISHED](docs/EventSTEPFINISHED.md)
 - [EventSTEPSTARTED](docs/EventSTEPSTARTED.md)
 - [EventSourceDelta](docs/EventSourceDelta.md)
 - [EventSourceReset](docs/EventSourceReset.md)
 - [EventTEXTMESSAGECONTENT](docs/EventTEXTMESSAGECONTENT.md)
 - [EventTEXTMESSAGEEND](docs/EventTEXTMESSAGEEND.md)
 - [EventTEXTMESSAGESTART](docs/EventTEXTMESSAGESTART.md)
 - [EventTITLEUPDATED](docs/EventTITLEUPDATED.md)
 - [EventTOOLCALLARGSDELTA](docs/EventTOOLCALLARGSDELTA.md)
 - [EventTOOLCALLEND](docs/EventTOOLCALLEND.md)
 - [EventTOOLCALLPROGRESS](docs/EventTOOLCALLPROGRESS.md)
 - [EventTOOLCALLRESULT](docs/EventTOOLCALLRESULT.md)
 - [EventTOOLCALLSTART](docs/EventTOOLCALLSTART.md)
 - [EventTOOLCONFIRMATIONREQUIRED](docs/EventTOOLCONFIRMATIONREQUIRED.md)
 - [EventWarning](docs/EventWarning.md)
 - [Example](docs/Example.md)
 - [ExtractedURL](docs/ExtractedURL.md)
 - [FileActivityEntry](docs/FileActivityEntry.md)
 - [FormFile](docs/FormFile.md)
 - [FunctionArgument](docs/FunctionArgument.md)
 - [FunctionCallEdges](docs/FunctionCallEdges.md)
 - [FunctionDependency](docs/FunctionDependency.md)
 - [FunctionDetailsOutputBody](docs/FunctionDetailsOutputBody.md)
 - [FunctionHeader](docs/FunctionHeader.md)
 - [FunctionInfo](docs/FunctionInfo.md)
 - [FunctionMatch](docs/FunctionMatch.md)
 - [FunctionStackVariable](docs/FunctionStackVariable.md)
 - [FunctionStringItem](docs/FunctionStringItem.md)
 - [FunctionType](docs/FunctionType.md)
 - [GeneratePDFOutputBody](docs/GeneratePDFOutputBody.md)
 - [GetAdditionalDetailsOutputBody](docs/GetAdditionalDetailsOutputBody.md)
 - [GetAdditionalDetailsStatusOutputBody](docs/GetAdditionalDetailsStatusOutputBody.md)
 - [GetAnalysisStringsStatusOutputBody](docs/GetAnalysisStringsStatusOutputBody.md)
 - [GetCollectionOutputBody](docs/GetCollectionOutputBody.md)
 - [GetMatchesOutputBody](docs/GetMatchesOutputBody.md)
 - [GetMatchesStatusOutputBody](docs/GetMatchesStatusOutputBody.md)
 - [GetProductsOutputBody](docs/GetProductsOutputBody.md)
 - [GetSubscriptionOutputBody](docs/GetSubscriptionOutputBody.md)
 - [HistoryEntry](docs/HistoryEntry.md)
 - [HttpRequest](docs/HttpRequest.md)
 - [ImportedFunctionCallerEntry](docs/ImportedFunctionCallerEntry.md)
 - [ImportedFunctionDetailOutputBody](docs/ImportedFunctionDetailOutputBody.md)
 - [ImportedFunctionEntry](docs/ImportedFunctionEntry.md)
 - [IndirectCallSite](docs/IndirectCallSite.md)
 - [IndirectCallSitesOutputBody](docs/IndirectCallSitesOutputBody.md)
 - [InlineComment](docs/InlineComment.md)
 - [InviteUserInputBody](docs/InviteUserInputBody.md)
 - [IssuerAllowedDomain](docs/IssuerAllowedDomain.md)
 - [ListAnalysesOutputBody](docs/ListAnalysesOutputBody.md)
 - [ListAnalysisFunctionsDataTypesOutputBody](docs/ListAnalysisFunctionsDataTypesOutputBody.md)
 - [ListAnalysisFunctionsOutputBody](docs/ListAnalysisFunctionsOutputBody.md)
 - [ListAnalysisStringsOutputBody](docs/ListAnalysisStringsOutputBody.md)
 - [ListArchiveContentsOutputBody](docs/ListArchiveContentsOutputBody.md)
 - [ListCollectionsOutputBody](docs/ListCollectionsOutputBody.md)
 - [ListExampleAnalysesOutputBody](docs/ListExampleAnalysesOutputBody.md)
 - [ListFunctionStringsOutputBody](docs/ListFunctionStringsOutputBody.md)
 - [ListFunctionsDataTypesOutputBody](docs/ListFunctionsDataTypesOutputBody.md)
 - [ListImportedFunctionsOutputBody](docs/ListImportedFunctionsOutputBody.md)
 - [ListTeamsOutputBody](docs/ListTeamsOutputBody.md)
 - [ListUsersOutputBody](docs/ListUsersOutputBody.md)
 - [LocationOutputBody](docs/LocationOutputBody.md)
 - [MatchFilters](docs/MatchFilters.md)
 - [MatchedFunction](docs/MatchedFunction.md)
 - [MemdumpEntry](docs/MemdumpEntry.md)
 - [MessageBody](docs/MessageBody.md)
 - [ModuleLoadEntry](docs/ModuleLoadEntry.md)
 - [MutexEntry](docs/MutexEntry.md)
 - [NameConfidence](docs/NameConfidence.md)
 - [NetworkActivity](docs/NetworkActivity.md)
 - [OIDCCallbackInputBody](docs/OIDCCallbackInputBody.md)
 - [Organisation](docs/Organisation.md)
 - [OrganisationGroup](docs/OrganisationGroup.md)
 - [OrganisationIssuer](docs/OrganisationIssuer.md)
 - [OrganisationOwner](docs/OrganisationOwner.md)
 - [PasswordResetInputBody](docs/PasswordResetInputBody.md)
 - [PatchCollectionBinariesInputBody](docs/PatchCollectionBinariesInputBody.md)
 - [PatchCollectionBinariesOutputBody](docs/PatchCollectionBinariesOutputBody.md)
 - [PatchCollectionInputBody](docs/PatchCollectionInputBody.md)
 - [PatchCollectionOutputBody](docs/PatchCollectionOutputBody.md)
 - [PatchCollectionTagsInputBody](docs/PatchCollectionTagsInputBody.md)
 - [PatchCollectionTagsOutputBody](docs/PatchCollectionTagsOutputBody.md)
 - [PatchCommentBody](docs/PatchCommentBody.md)
 - [PcapBodyInfo](docs/PcapBodyInfo.md)
 - [Permissions](docs/Permissions.md)
 - [PriceOutput](docs/PriceOutput.md)
 - [PriceSummary](docs/PriceSummary.md)
 - [ProcessActivityEntry](docs/ProcessActivityEntry.md)
 - [ProcessMemdumps](docs/ProcessMemdumps.md)
 - [ProcessNode](docs/ProcessNode.md)
 - [ProcessTree](docs/ProcessTree.md)
 - [ProductOutput](docs/ProductOutput.md)
 - [ProductSummary](docs/ProductSummary.md)
 - [ProgressMessage](docs/ProgressMessage.md)
 - [ProseEvent](docs/ProseEvent.md)
 - [RefreshBody](docs/RefreshBody.md)
 - [RegenerateOutputBody](docs/RegenerateOutputBody.md)
 - [RegisterUserInputBody](docs/RegisterUserInputBody.md)
 - [RegistryOperation](docs/RegistryOperation.md)
 - [RenameAppliedEvent](docs/RenameAppliedEvent.md)
 - [RenameInputBody](docs/RenameInputBody.md)
 - [RenameOutputBody](docs/RenameOutputBody.md)
 - [ReplacementValue](docs/ReplacementValue.md)
 - [ReportEvent](docs/ReportEvent.md)
 - [ReportInfo](docs/ReportInfo.md)
 - [ReportOptions](docs/ReportOptions.md)
 - [RevokeBody](docs/RevokeBody.md)
 - [SSOProvider](docs/SSOProvider.md)
 - [SSOProvidersOutputBody](docs/SSOProvidersOutputBody.md)
 - [ScheduledTaskEntry](docs/ScheduledTaskEntry.md)
 - [SendMessageRequest](docs/SendMessageRequest.md)
 - [ServerSentEventsInner](docs/ServerSentEventsInner.md)
 - [ServerSentEventsInner1](docs/ServerSentEventsInner1.md)
 - [ServiceEntry](docs/ServiceEntry.md)
 - [SessionOutputBody](docs/SessionOutputBody.md)
 - [SourceDeltaEvent](docs/SourceDeltaEvent.md)
 - [SourceResetEvent](docs/SourceResetEvent.md)
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
 - [SseEventToolCallProgressData](docs/SseEventToolCallProgressData.md)
 - [SseEventToolCallResultData](docs/SseEventToolCallResultData.md)
 - [SseEventToolCallStartData](docs/SseEventToolCallStartData.md)
 - [SseEventToolConfirmationRequiredData](docs/SseEventToolConfirmationRequiredData.md)
 - [StartBatchMatchingInputBody](docs/StartBatchMatchingInputBody.md)
 - [StartMatchingForAnalysisInputBody](docs/StartMatchingForAnalysisInputBody.md)
 - [StartMatchingForFunctionsInputBody](docs/StartMatchingForFunctionsInputBody.md)
 - [StartMatchingOutputBody](docs/StartMatchingOutputBody.md)
 - [StartupInfo](docs/StartupInfo.md)
 - [StatusResponse](docs/StatusResponse.md)
 - [SummaryData](docs/SummaryData.md)
 - [TcpCarvedFile](docs/TcpCarvedFile.md)
 - [Team](docs/Team.md)
 - [TeamMember](docs/TeamMember.md)
 - [TokenInputBody](docs/TokenInputBody.md)
 - [TokenResponse](docs/TokenResponse.md)
 - [TokenisedData](docs/TokenisedData.md)
 - [TriggerDynamicExecutionInputBody](docs/TriggerDynamicExecutionInputBody.md)
 - [Ttp](docs/Ttp.md)
 - [UpdateDataTypesInputBody](docs/UpdateDataTypesInputBody.md)
 - [UpdateDataTypesOutputBody](docs/UpdateDataTypesOutputBody.md)
 - [UpdateIssuerInputBody](docs/UpdateIssuerInputBody.md)
 - [UpdateOrganisationInputBody](docs/UpdateOrganisationInputBody.md)
 - [UpdatePasswordInputBody](docs/UpdatePasswordInputBody.md)
 - [UpdateProfileInputBody](docs/UpdateProfileInputBody.md)
 - [UpdateTeamInputBody](docs/UpdateTeamInputBody.md)
 - [UpdateUserCreditsInputBody](docs/UpdateUserCreditsInputBody.md)
 - [UpdateUserInputBody](docs/UpdateUserInputBody.md)
 - [UpdateUserPasswordInputBody](docs/UpdateUserPasswordInputBody.md)
 - [UpsertOverridesData](docs/UpsertOverridesData.md)
 - [UpsertOverridesInputBody](docs/UpsertOverridesInputBody.md)
 - [User](docs/User.md)
 - [UserCredits](docs/UserCredits.md)
 - [UserIdentity](docs/UserIdentity.md)
 - [UserProfile](docs/UserProfile.md)
 - [WarningEvent](docs/WarningEvent.md)
 - [WorkflowProgress](docs/WorkflowProgress.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.
