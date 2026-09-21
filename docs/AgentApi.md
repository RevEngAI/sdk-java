# AgentApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet**](AgentApi.md#checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities/status | Check the status of a capabilities analysis workflow |
| [**checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet**](AgentApi.md#checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/protocols/status | Check the status of a protocols discovery workflow |
| [**checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet**](AgentApi.md#checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/remediation/status | Check the status of a remediation analysis workflow |
| [**checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet**](AgentApi.md#checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis/status | Check the status of a report analysis workflow |
| [**checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet**](AgentApi.md#checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/secrets/status | Check the status of a secrets discovery workflow |
| [**checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet**](AgentApi.md#checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/triage/status | Check the status of a triage analysis workflow |
| [**createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost**](AgentApi.md#createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost) | **POST** /v2/analyses/{analysis_id}/agent/capabilities | Queues a capabilities analysis workflow process |
| [**createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost**](AgentApi.md#createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost) | **POST** /v2/analyses/{analysis_id}/agent/protocols | Queues a protocols discovery workflow process |
| [**createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost**](AgentApi.md#createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost) | **POST** /v2/analyses/{analysis_id}/agent/remediation | Queues a remediation analysis workflow process |
| [**createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost**](AgentApi.md#createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost) | **POST** /v2/analyses/{analysis_id}/agent/report-analysis | Queues a combined report analysis workflow process |
| [**createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost**](AgentApi.md#createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost) | **POST** /v2/analyses/{analysis_id}/agent/secrets | Queues a secrets discovery workflow process |
| [**createTriageTaskV2AnalysesAnalysisIdAgentTriagePost**](AgentApi.md#createTriageTaskV2AnalysesAnalysisIdAgentTriagePost) | **POST** /v2/analyses/{analysis_id}/agent/triage | Queues a triage analysis workflow process |
| [**getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet**](AgentApi.md#getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities | Get Capabilities Result |
| [**getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet**](AgentApi.md#getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet) | **GET** /v2/analyses/{analysis_id}/agent/protocols | Get Protocols Result |
| [**getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet**](AgentApi.md#getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet) | **GET** /v2/analyses/{analysis_id}/agent/remediation | Get Remediation Result |
| [**getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet**](AgentApi.md#getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis | Get Report Analysis Result |
| [**getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet**](AgentApi.md#getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet) | **GET** /v2/analyses/{analysis_id}/agent/secrets | Get Secrets Result |
| [**getTriageResultV2AnalysesAnalysisIdAgentTriageGet**](AgentApi.md#getTriageResultV2AnalysesAnalysisIdAgentTriageGet) | **GET** /v2/analyses/{analysis_id}/agent/triage | Get Triage Result |
| [**v3CancelRenameUnnamedFunctions**](AgentApi.md#v3CancelRenameUnnamedFunctions) | **POST** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions/cancel | Cancel the rename-unnamed-functions agent. |
| [**v3CancelSecurityScanOperation**](AgentApi.md#v3CancelSecurityScanOperation) | **POST** /v3/operations/security-scan/{analysis_id}:cancel | Cancel a security-scan operation. |
| [**v3GetBinaryAgentFeedback**](AgentApi.md#v3GetBinaryAgentFeedback) | **GET** /v3/analyses/{analysis_id}/agents/{agent}/feedback | Get the caller&#39;s feedback on an agent&#39;s output. |
| [**v3GetCapabilitiesOperation**](AgentApi.md#v3GetCapabilitiesOperation) | **GET** /v3/operations/capabilities/{analysis_id} | Get a capabilities operation. |
| [**v3GetCryptoExplainOperation**](AgentApi.md#v3GetCryptoExplainOperation) | **GET** /v3/operations/crypto-explain/{function_id} | Get a crypto-explain operation. |
| [**v3GetCryptoScanOperation**](AgentApi.md#v3GetCryptoScanOperation) | **GET** /v3/operations/crypto-scan/{analysis_id} | Get a crypto-scan operation. |
| [**v3GetExecutionExplainOperation**](AgentApi.md#v3GetExecutionExplainOperation) | **GET** /v3/operations/execution-explain/{function_id} | Get an execution-explain operation. |
| [**v3GetExecutionScanOperation**](AgentApi.md#v3GetExecutionScanOperation) | **GET** /v3/operations/execution-scan/{analysis_id} | Get an execution-scan operation. |
| [**v3GetFilesystemAnalyseOperation**](AgentApi.md#v3GetFilesystemAnalyseOperation) | **GET** /v3/operations/filesystem-analyse/{function_id} | Get a filesystem-analyse operation. |
| [**v3GetFilesystemScanOperation**](AgentApi.md#v3GetFilesystemScanOperation) | **GET** /v3/operations/filesystem-scan/{analysis_id} | Get a filesystem-scan operation. |
| [**v3GetNetworkingExplainOperation**](AgentApi.md#v3GetNetworkingExplainOperation) | **GET** /v3/operations/networking-explain/{function_id} | Get a networking-explain operation. |
| [**v3GetNetworkingScanOperation**](AgentApi.md#v3GetNetworkingScanOperation) | **GET** /v3/operations/networking-scan/{analysis_id} | Get a networking-scan operation. |
| [**v3GetProtocolsOperation**](AgentApi.md#v3GetProtocolsOperation) | **GET** /v3/operations/protocols/{analysis_id} | Get a protocols operation. |
| [**v3GetRemediationOperation**](AgentApi.md#v3GetRemediationOperation) | **GET** /v3/operations/remediation/{analysis_id} | Get a remediation operation. |
| [**v3GetRenameUnnamedFunctionsResult**](AgentApi.md#v3GetRenameUnnamedFunctionsResult) | **GET** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions | Get rename-unnamed-functions agent result. |
| [**v3GetRenameUnnamedFunctionsStatus**](AgentApi.md#v3GetRenameUnnamedFunctionsStatus) | **GET** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions/status | Get rename-unnamed-functions agent status. |
| [**v3GetReportAnalysisOperation**](AgentApi.md#v3GetReportAnalysisOperation) | **GET** /v3/operations/report-analysis/{analysis_id} | Get a report-analysis operation. |
| [**v3GetSecretsOperation**](AgentApi.md#v3GetSecretsOperation) | **GET** /v3/operations/secrets/{analysis_id} | Get a secrets operation. |
| [**v3GetSecurityScanOperation**](AgentApi.md#v3GetSecurityScanOperation) | **GET** /v3/operations/security-scan/{analysis_id} | Get a security-scan operation. |
| [**v3GetTriageOperation**](AgentApi.md#v3GetTriageOperation) | **GET** /v3/operations/triage/{analysis_id} | Get a triage operation. |
| [**v3RunCapabilities**](AgentApi.md#v3RunCapabilities) | **POST** /v3/analyses/{analysis_id}/capabilities:run | Run the capabilities agent. |
| [**v3RunCryptoExplain**](AgentApi.md#v3RunCryptoExplain) | **POST** /v3/functions/{function_id}/crypto-explain:run | Run the crypto-explain agent. |
| [**v3RunCryptoScan**](AgentApi.md#v3RunCryptoScan) | **POST** /v3/analyses/{analysis_id}/crypto-scan:run | Run the crypto-scan agent. |
| [**v3RunExecutionExplain**](AgentApi.md#v3RunExecutionExplain) | **POST** /v3/functions/{function_id}/execution-explain:run | Run the execution-explain agent. |
| [**v3RunExecutionScan**](AgentApi.md#v3RunExecutionScan) | **POST** /v3/analyses/{analysis_id}/execution-scan:run | Run the execution-scan agent. |
| [**v3RunFilesystemAnalyse**](AgentApi.md#v3RunFilesystemAnalyse) | **POST** /v3/functions/{function_id}/filesystem-analyse:run | Run the filesystem-analyse agent. |
| [**v3RunFilesystemScan**](AgentApi.md#v3RunFilesystemScan) | **POST** /v3/analyses/{analysis_id}/filesystem-scan:run | Run the filesystem-scan agent. |
| [**v3RunNetworkingExplain**](AgentApi.md#v3RunNetworkingExplain) | **POST** /v3/functions/{function_id}/networking-explain:run | Run the networking-explain agent. |
| [**v3RunNetworkingScan**](AgentApi.md#v3RunNetworkingScan) | **POST** /v3/analyses/{analysis_id}/networking-scan:run | Run the networking-scan agent. |
| [**v3RunProtocols**](AgentApi.md#v3RunProtocols) | **POST** /v3/analyses/{analysis_id}/protocols:run | Run the protocols agent. |
| [**v3RunRemediation**](AgentApi.md#v3RunRemediation) | **POST** /v3/analyses/{analysis_id}/remediation:run | Run the remediation agent. |
| [**v3RunReportAnalysis**](AgentApi.md#v3RunReportAnalysis) | **POST** /v3/analyses/{analysis_id}/report-analysis:run | Run the report-analysis agent. |
| [**v3RunSecrets**](AgentApi.md#v3RunSecrets) | **POST** /v3/analyses/{analysis_id}/secrets:run | Run the secrets agent. |
| [**v3RunSecurityScan**](AgentApi.md#v3RunSecurityScan) | **POST** /v3/analyses/{analysis_id}/security-scan:run | Run the security-scan agent. |
| [**v3RunTriage**](AgentApi.md#v3RunTriage) | **POST** /v3/analyses/{analysis_id}/triage:run | Run the triage agent. |
| [**v3TriggerRenameUnnamedFunctions**](AgentApi.md#v3TriggerRenameUnnamedFunctions) | **POST** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions | Run the rename-unnamed-functions agent. |
| [**v3UpsertBinaryAgentFeedback**](AgentApi.md#v3UpsertBinaryAgentFeedback) | **PUT** /v3/analyses/{analysis_id}/agents/{agent}/feedback | Record feedback on an agent&#39;s output. |


<a id="checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet"></a>
# **checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet**
> TaskStatusResponse checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet(analysisId)

Check the status of a capabilities analysis workflow

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      TaskStatusResponse result = apiInstance.checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet"></a>
# **checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet**
> TaskStatusResponse checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet(analysisId)

Check the status of a protocols discovery workflow

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      TaskStatusResponse result = apiInstance.checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#checkProtocolsTaskStatusV2AnalysesAnalysisIdAgentProtocolsStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet"></a>
# **checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet**
> TaskStatusResponse checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet(analysisId)

Check the status of a remediation analysis workflow

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      TaskStatusResponse result = apiInstance.checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet"></a>
# **checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet**
> TaskStatusResponse checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet(analysisId)

Check the status of a report analysis workflow

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      TaskStatusResponse result = apiInstance.checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet"></a>
# **checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet**
> TaskStatusResponse checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet(analysisId)

Check the status of a secrets discovery workflow

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      TaskStatusResponse result = apiInstance.checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#checkSecretsTaskStatusV2AnalysesAnalysisIdAgentSecretsStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet"></a>
# **checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet**
> TaskStatusResponse checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet(analysisId)

Check the status of a triage analysis workflow

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      TaskStatusResponse result = apiInstance.checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**TaskStatusResponse**](TaskStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost"></a>
# **createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost**
> BaseResponseQueuedWorkflowTaskResponse createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost(analysisId)

Queues a capabilities analysis workflow process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseQueuedWorkflowTaskResponse result = apiInstance.createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseQueuedWorkflowTaskResponse**](BaseResponseQueuedWorkflowTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost"></a>
# **createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost**
> BaseResponseQueuedWorkflowTaskResponse createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost(analysisId)

Queues a protocols discovery workflow process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseQueuedWorkflowTaskResponse result = apiInstance.createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createProtocolsTaskV2AnalysesAnalysisIdAgentProtocolsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseQueuedWorkflowTaskResponse**](BaseResponseQueuedWorkflowTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost"></a>
# **createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost**
> BaseResponseQueuedWorkflowTaskResponse createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost(analysisId)

Queues a remediation analysis workflow process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseQueuedWorkflowTaskResponse result = apiInstance.createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseQueuedWorkflowTaskResponse**](BaseResponseQueuedWorkflowTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost"></a>
# **createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost**
> QueuedWorkflowTaskResponse createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost(analysisId)

Queues a combined report analysis workflow process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      QueuedWorkflowTaskResponse result = apiInstance.createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**QueuedWorkflowTaskResponse**](QueuedWorkflowTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **409** | Task already completed or queued |  -  |

<a id="createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost"></a>
# **createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost**
> BaseResponseQueuedWorkflowTaskResponse createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost(analysisId)

Queues a secrets discovery workflow process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseQueuedWorkflowTaskResponse result = apiInstance.createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createSecretsTaskV2AnalysesAnalysisIdAgentSecretsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseQueuedWorkflowTaskResponse**](BaseResponseQueuedWorkflowTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="createTriageTaskV2AnalysesAnalysisIdAgentTriagePost"></a>
# **createTriageTaskV2AnalysesAnalysisIdAgentTriagePost**
> BaseResponseQueuedWorkflowTaskResponse createTriageTaskV2AnalysesAnalysisIdAgentTriagePost(analysisId)

Queues a triage analysis workflow process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseQueuedWorkflowTaskResponse result = apiInstance.createTriageTaskV2AnalysesAnalysisIdAgentTriagePost(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#createTriageTaskV2AnalysesAnalysisIdAgentTriagePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseQueuedWorkflowTaskResponse**](BaseResponseQueuedWorkflowTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet"></a>
# **getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet**
> BaseResponseCapabilitiesAgentResponse getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet(analysisId)

Get Capabilities Result

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseCapabilitiesAgentResponse result = apiInstance.getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseCapabilitiesAgentResponse**](BaseResponseCapabilitiesAgentResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet"></a>
# **getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet**
> BaseResponseProtocolsAgentResponse getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet(analysisId)

Get Protocols Result

Returns the protocols report, including metadata, findings, and evidence.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseProtocolsAgentResponse result = apiInstance.getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getProtocolsResultV2AnalysesAnalysisIdAgentProtocolsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseProtocolsAgentResponse**](BaseResponseProtocolsAgentResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet"></a>
# **getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet**
> BaseResponseRemediationAgentResponse getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet(analysisId)

Get Remediation Result

Returns: - A list of generated YARA rules - A list of generated Snort rules - A list of generated STIX rules

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseRemediationAgentResponse result = apiInstance.getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseRemediationAgentResponse**](BaseResponseRemediationAgentResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet"></a>
# **getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet**
> BaseResponseReportAnalysisResponse getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet(analysisId)

Get Report Analysis Result

Returns: - A summary of the analysis - The software type of the binary - An attack flow summary - List of IOCs - List of MITRE executable techniques - A YARA rule

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseReportAnalysisResponse result = apiInstance.getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseReportAnalysisResponse**](BaseResponseReportAnalysisResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet"></a>
# **getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet**
> BaseResponseSecretsAgentResponse getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet(analysisId)

Get Secrets Result

Returns the secrets report, including metadata, findings, and evidence.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseSecretsAgentResponse result = apiInstance.getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getSecretsResultV2AnalysesAnalysisIdAgentSecretsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseSecretsAgentResponse**](BaseResponseSecretsAgentResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getTriageResultV2AnalysesAnalysisIdAgentTriageGet"></a>
# **getTriageResultV2AnalysesAnalysisIdAgentTriageGet**
> BaseResponseTriageReportResponse getTriageResultV2AnalysesAnalysisIdAgentTriageGet(analysisId)

Get Triage Result

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseTriageReportResponse result = apiInstance.getTriageResultV2AnalysesAnalysisIdAgentTriageGet(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#getTriageResultV2AnalysesAnalysisIdAgentTriageGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseTriageReportResponse**](BaseResponseTriageReportResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="v3CancelRenameUnnamedFunctions"></a>
# **v3CancelRenameUnnamedFunctions**
> v3CancelRenameUnnamedFunctions(analysisId)

Cancel the rename-unnamed-functions agent.

Requests cancellation of the currently running rename-unnamed-functions run for the analysis. Returns 404 if no run is in progress.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NO_ACTIVE_RUN&#x60;](/errors/NO_ACTIVE_RUN) — No Active Run

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      apiInstance.v3CancelRenameUnnamedFunctions(analysisId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3CancelRenameUnnamedFunctions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CancelSecurityScanOperation"></a>
# **v3CancelSecurityScanOperation**
> v3CancelSecurityScanOperation(analysisId)

Cancel a security-scan operation.

Requests cancellation of the currently running security-scan run for the analysis. Returns 404 if no run is in progress.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NO_ACTIVE_RUN&#x60;](/errors/NO_ACTIVE_RUN) — No Active Run

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      apiInstance.v3CancelSecurityScanOperation(analysisId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3CancelSecurityScanOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetBinaryAgentFeedback"></a>
# **v3GetBinaryAgentFeedback**
> FeedbackOutputBody v3GetBinaryAgentFeedback(analysisId, agent)

Get the caller&#39;s feedback on an agent&#39;s output.

Returns the sentiment the caller recorded for one agent on this analysis, or a null sentiment when they have not recorded any.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    String agent = "triage"; // String | Which agent's output the feedback is about
    try {
      FeedbackOutputBody result = apiInstance.v3GetBinaryAgentFeedback(analysisId, agent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetBinaryAgentFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **agent** | **String**| Which agent&#39;s output the feedback is about | [enum: triage, capabilities, report-analysis, remediation, protocols, secrets] |

### Return type

[**FeedbackOutputBody**](FeedbackOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetCapabilitiesOperation"></a>
# **v3GetCapabilitiesOperation**
> OperationMetadataCapabilitiesResult v3GetCapabilitiesOperation(analysisId)

Get a capabilities operation.

Polls a capabilities run. &#x60;metadata.status&#x60; tracks the run and &#x60;metadata.log_history&#x60; carries its progress messages; &#x60;response&#x60; is set once the run has completed.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataCapabilitiesResult result = apiInstance.v3GetCapabilitiesOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetCapabilitiesOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataCapabilitiesResult**](OperationMetadataCapabilitiesResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetCryptoExplainOperation"></a>
# **v3GetCryptoExplainOperation**
> OperationCryptoExplainMetadataCryptoExplainResult v3GetCryptoExplainOperation(functionId)

Get a crypto-explain operation.

Returns the current state of the crypto-explain run for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      OperationCryptoExplainMetadataCryptoExplainResult result = apiInstance.v3GetCryptoExplainOperation(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetCryptoExplainOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |

### Return type

[**OperationCryptoExplainMetadataCryptoExplainResult**](OperationCryptoExplainMetadataCryptoExplainResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetCryptoScanOperation"></a>
# **v3GetCryptoScanOperation**
> OperationCryptoScanMetadataCryptoScanResult v3GetCryptoScanOperation(analysisId)

Get a crypto-scan operation.

Returns the current state of the crypto-scan run for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationCryptoScanMetadataCryptoScanResult result = apiInstance.v3GetCryptoScanOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetCryptoScanOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationCryptoScanMetadataCryptoScanResult**](OperationCryptoScanMetadataCryptoScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetExecutionExplainOperation"></a>
# **v3GetExecutionExplainOperation**
> OperationExecutionExplainMetadataExecutionExplainResult v3GetExecutionExplainOperation(functionId)

Get an execution-explain operation.

Returns the current state of the execution-explain run for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      OperationExecutionExplainMetadataExecutionExplainResult result = apiInstance.v3GetExecutionExplainOperation(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetExecutionExplainOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |

### Return type

[**OperationExecutionExplainMetadataExecutionExplainResult**](OperationExecutionExplainMetadataExecutionExplainResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetExecutionScanOperation"></a>
# **v3GetExecutionScanOperation**
> OperationExecutionScanMetadataExecutionScanResult v3GetExecutionScanOperation(analysisId)

Get an execution-scan operation.

Returns the current state of the execution-scan run for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationExecutionScanMetadataExecutionScanResult result = apiInstance.v3GetExecutionScanOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetExecutionScanOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationExecutionScanMetadataExecutionScanResult**](OperationExecutionScanMetadataExecutionScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetFilesystemAnalyseOperation"></a>
# **v3GetFilesystemAnalyseOperation**
> OperationFilesystemAnalyseMetadataFilesystemAnalyseResult v3GetFilesystemAnalyseOperation(functionId)

Get a filesystem-analyse operation.

Returns the current state of the filesystem-analyse run for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      OperationFilesystemAnalyseMetadataFilesystemAnalyseResult result = apiInstance.v3GetFilesystemAnalyseOperation(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetFilesystemAnalyseOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |

### Return type

[**OperationFilesystemAnalyseMetadataFilesystemAnalyseResult**](OperationFilesystemAnalyseMetadataFilesystemAnalyseResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetFilesystemScanOperation"></a>
# **v3GetFilesystemScanOperation**
> OperationFilesystemScanMetadataFilesystemScanResult v3GetFilesystemScanOperation(analysisId)

Get a filesystem-scan operation.

Returns the current state of the filesystem-scan run for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationFilesystemScanMetadataFilesystemScanResult result = apiInstance.v3GetFilesystemScanOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetFilesystemScanOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationFilesystemScanMetadataFilesystemScanResult**](OperationFilesystemScanMetadataFilesystemScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetNetworkingExplainOperation"></a>
# **v3GetNetworkingExplainOperation**
> OperationNetworkingExplainMetadataNetworkingExplainResult v3GetNetworkingExplainOperation(functionId)

Get a networking-explain operation.

Returns the current state of the networking-explain run for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      OperationNetworkingExplainMetadataNetworkingExplainResult result = apiInstance.v3GetNetworkingExplainOperation(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetNetworkingExplainOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |

### Return type

[**OperationNetworkingExplainMetadataNetworkingExplainResult**](OperationNetworkingExplainMetadataNetworkingExplainResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetNetworkingScanOperation"></a>
# **v3GetNetworkingScanOperation**
> OperationNetworkingScanMetadataNetworkingScanResult v3GetNetworkingScanOperation(analysisId)

Get a networking-scan operation.

Returns the current state of the networking-scan run for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationNetworkingScanMetadataNetworkingScanResult result = apiInstance.v3GetNetworkingScanOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetNetworkingScanOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationNetworkingScanMetadataNetworkingScanResult**](OperationNetworkingScanMetadataNetworkingScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetProtocolsOperation"></a>
# **v3GetProtocolsOperation**
> OperationMetadataReportResult v3GetProtocolsOperation(analysisId)

Get a protocols operation.

Polls a protocols run. &#x60;metadata.status&#x60; tracks the run and &#x60;metadata.log_history&#x60; carries its progress messages; &#x60;response.report&#x60; is set once the run has completed and carries the findings document as the agent produced it.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataReportResult result = apiInstance.v3GetProtocolsOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetProtocolsOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataReportResult**](OperationMetadataReportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetRemediationOperation"></a>
# **v3GetRemediationOperation**
> OperationMetadataRemediationResult v3GetRemediationOperation(analysisId)

Get a remediation operation.

Polls a remediation run. &#x60;metadata.status&#x60; tracks the run and &#x60;metadata.log_history&#x60; carries its progress messages; &#x60;response&#x60; is set once the run has completed.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataRemediationResult result = apiInstance.v3GetRemediationOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetRemediationOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataRemediationResult**](OperationMetadataRemediationResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetRenameUnnamedFunctionsResult"></a>
# **v3GetRenameUnnamedFunctionsResult**
> RenameUnnamedFunctionsResult v3GetRenameUnnamedFunctionsResult(analysisId)

Get rename-unnamed-functions agent result.

Returns the summary of the most recent completed rename-unnamed-functions run. Returns 409 while a run is still in progress and 404 when the agent has never produced a result for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      RenameUnnamedFunctionsResult result = apiInstance.v3GetRenameUnnamedFunctionsResult(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetRenameUnnamedFunctionsResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**RenameUnnamedFunctionsResult**](RenameUnnamedFunctionsResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetRenameUnnamedFunctionsStatus"></a>
# **v3GetRenameUnnamedFunctionsStatus**
> StatusBody v3GetRenameUnnamedFunctionsStatus(analysisId)

Get rename-unnamed-functions agent status.

Returns the status of the most recent rename-unnamed-functions run for the analysis. &#x60;UNINITIALISED&#x60; means the agent has never been triggered, so it is safe to start one.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      StatusBody result = apiInstance.v3GetRenameUnnamedFunctionsStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetRenameUnnamedFunctionsStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**StatusBody**](StatusBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetReportAnalysisOperation"></a>
# **v3GetReportAnalysisOperation**
> OperationMetadataThreatReportResult v3GetReportAnalysisOperation(analysisId)

Get a report-analysis operation.

Polls a report-analysis run. &#x60;metadata.status&#x60; tracks the run and &#x60;metadata.log_history&#x60; carries its progress messages; &#x60;response&#x60; is set once the run has completed.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataThreatReportResult result = apiInstance.v3GetReportAnalysisOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetReportAnalysisOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataThreatReportResult**](OperationMetadataThreatReportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetSecretsOperation"></a>
# **v3GetSecretsOperation**
> OperationMetadataReportResult v3GetSecretsOperation(analysisId)

Get a secrets operation.

Polls a secrets run. &#x60;metadata.status&#x60; tracks the run and &#x60;metadata.log_history&#x60; carries its progress messages; &#x60;response.report&#x60; is set once the run has completed and carries the findings document as the agent produced it.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataReportResult result = apiInstance.v3GetSecretsOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetSecretsOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataReportResult**](OperationMetadataReportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetSecurityScanOperation"></a>
# **v3GetSecurityScanOperation**
> OperationSecurityScanMetadataSecurityScanResult v3GetSecurityScanOperation(analysisId)

Get a security-scan operation.

Returns the current state of the security-scan run for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationSecurityScanMetadataSecurityScanResult result = apiInstance.v3GetSecurityScanOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetSecurityScanOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationSecurityScanMetadataSecurityScanResult**](OperationSecurityScanMetadataSecurityScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetTriageOperation"></a>
# **v3GetTriageOperation**
> OperationMetadataTriageResult v3GetTriageOperation(analysisId)

Get a triage operation.

Polls a triage run. &#x60;metadata.status&#x60; tracks the run and &#x60;metadata.log_history&#x60; carries its progress messages; &#x60;response&#x60; is set once the run has completed.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataTriageResult result = apiInstance.v3GetTriageOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3GetTriageOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataTriageResult**](OperationMetadataTriageResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunCapabilities"></a>
# **v3RunCapabilities**
> OperationMetadataCapabilitiesResult v3RunCapabilities(analysisId)

Run the capabilities agent.

Starts the capabilities agent, which attributes behavioural capabilities to individual functions, and returns the operation to poll for its outcome. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataCapabilitiesResult result = apiInstance.v3RunCapabilities(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunCapabilities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataCapabilitiesResult**](OperationMetadataCapabilitiesResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunCryptoExplain"></a>
# **v3RunCryptoExplain**
> OperationCryptoExplainMetadataCryptoExplainResult v3RunCryptoExplain(functionId)

Run the crypto-explain agent.

Starts an agent that explains the cryptography the function implements, and returns the operation to poll for its outcome. Requires credits. Returns 409 while a run is already in progress for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      OperationCryptoExplainMetadataCryptoExplainResult result = apiInstance.v3RunCryptoExplain(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunCryptoExplain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |

### Return type

[**OperationCryptoExplainMetadataCryptoExplainResult**](OperationCryptoExplainMetadataCryptoExplainResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunCryptoScan"></a>
# **v3RunCryptoScan**
> OperationCryptoScanMetadataCryptoScanResult v3RunCryptoScan(analysisId, triggerCryptoScanInputBody)

Run the crypto-scan agent.

Starts an agent that name-matches the analysis&#39; functions and their callees against known crypto-library APIs, and returns the operation to poll for its outcome. Purely name-based — never triggers AI decompilation, so it costs no credits and runs in seconds. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    TriggerCryptoScanInputBody triggerCryptoScanInputBody = new TriggerCryptoScanInputBody(); // TriggerCryptoScanInputBody | 
    try {
      OperationCryptoScanMetadataCryptoScanResult result = apiInstance.v3RunCryptoScan(analysisId, triggerCryptoScanInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunCryptoScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **triggerCryptoScanInputBody** | [**TriggerCryptoScanInputBody**](TriggerCryptoScanInputBody.md)|  | |

### Return type

[**OperationCryptoScanMetadataCryptoScanResult**](OperationCryptoScanMetadataCryptoScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunExecutionExplain"></a>
# **v3RunExecutionExplain**
> OperationExecutionExplainMetadataExecutionExplainResult v3RunExecutionExplain(functionId, triggerExecutionExplainInputBody)

Run the execution-explain agent.

Starts an agent that explains the code execution the function performs, and returns the operation to poll for its outcome. Requires credits. Returns 409 while a run is already in progress for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    TriggerExecutionExplainInputBody triggerExecutionExplainInputBody = new TriggerExecutionExplainInputBody(); // TriggerExecutionExplainInputBody | 
    try {
      OperationExecutionExplainMetadataExecutionExplainResult result = apiInstance.v3RunExecutionExplain(functionId, triggerExecutionExplainInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunExecutionExplain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |
| **triggerExecutionExplainInputBody** | [**TriggerExecutionExplainInputBody**](TriggerExecutionExplainInputBody.md)|  | |

### Return type

[**OperationExecutionExplainMetadataExecutionExplainResult**](OperationExecutionExplainMetadataExecutionExplainResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunExecutionScan"></a>
# **v3RunExecutionScan**
> OperationExecutionScanMetadataExecutionScanResult v3RunExecutionScan(analysisId, triggerExecutionScanInputBody)

Run the execution-scan agent.

Starts an agent that name-matches the analysis&#39; functions and their callees against known code-execution APIs, and returns the operation to poll for its outcome. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    TriggerExecutionScanInputBody triggerExecutionScanInputBody = new TriggerExecutionScanInputBody(); // TriggerExecutionScanInputBody | 
    try {
      OperationExecutionScanMetadataExecutionScanResult result = apiInstance.v3RunExecutionScan(analysisId, triggerExecutionScanInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunExecutionScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **triggerExecutionScanInputBody** | [**TriggerExecutionScanInputBody**](TriggerExecutionScanInputBody.md)|  | |

### Return type

[**OperationExecutionScanMetadataExecutionScanResult**](OperationExecutionScanMetadataExecutionScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunFilesystemAnalyse"></a>
# **v3RunFilesystemAnalyse**
> OperationFilesystemAnalyseMetadataFilesystemAnalyseResult v3RunFilesystemAnalyse(functionId, triggerFilesystemAnalyseInputBody)

Run the filesystem-analyse agent.

Starts an agent that explains the filesystem/system access the function performs, and returns the operation to poll for its outcome. Requires credits. Returns 409 while a run is already in progress for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    TriggerFilesystemAnalyseInputBody triggerFilesystemAnalyseInputBody = new TriggerFilesystemAnalyseInputBody(); // TriggerFilesystemAnalyseInputBody | 
    try {
      OperationFilesystemAnalyseMetadataFilesystemAnalyseResult result = apiInstance.v3RunFilesystemAnalyse(functionId, triggerFilesystemAnalyseInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunFilesystemAnalyse");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |
| **triggerFilesystemAnalyseInputBody** | [**TriggerFilesystemAnalyseInputBody**](TriggerFilesystemAnalyseInputBody.md)|  | |

### Return type

[**OperationFilesystemAnalyseMetadataFilesystemAnalyseResult**](OperationFilesystemAnalyseMetadataFilesystemAnalyseResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunFilesystemScan"></a>
# **v3RunFilesystemScan**
> OperationFilesystemScanMetadataFilesystemScanResult v3RunFilesystemScan(analysisId, triggerFilesystemScanInputBody)

Run the filesystem-scan agent.

Starts an agent that name-matches the analysis&#39; functions and their callees against known filesystem/system APIs, and returns the operation to poll for its outcome.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    TriggerFilesystemScanInputBody triggerFilesystemScanInputBody = new TriggerFilesystemScanInputBody(); // TriggerFilesystemScanInputBody | 
    try {
      OperationFilesystemScanMetadataFilesystemScanResult result = apiInstance.v3RunFilesystemScan(analysisId, triggerFilesystemScanInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunFilesystemScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **triggerFilesystemScanInputBody** | [**TriggerFilesystemScanInputBody**](TriggerFilesystemScanInputBody.md)|  | |

### Return type

[**OperationFilesystemScanMetadataFilesystemScanResult**](OperationFilesystemScanMetadataFilesystemScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunNetworkingExplain"></a>
# **v3RunNetworkingExplain**
> OperationNetworkingExplainMetadataNetworkingExplainResult v3RunNetworkingExplain(functionId, triggerNetworkingExplainInputBody)

Run the networking-explain agent.

Starts an agent that explains the network communication a function performs, and returns the operation to poll for its outcome. Requires credits. Returns 409 while a run is already in progress for this function.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    TriggerNetworkingExplainInputBody triggerNetworkingExplainInputBody = new TriggerNetworkingExplainInputBody(); // TriggerNetworkingExplainInputBody | 
    try {
      OperationNetworkingExplainMetadataNetworkingExplainResult result = apiInstance.v3RunNetworkingExplain(functionId, triggerNetworkingExplainInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunNetworkingExplain");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **functionId** | **Long**| Function ID | |
| **triggerNetworkingExplainInputBody** | [**TriggerNetworkingExplainInputBody**](TriggerNetworkingExplainInputBody.md)|  | |

### Return type

[**OperationNetworkingExplainMetadataNetworkingExplainResult**](OperationNetworkingExplainMetadataNetworkingExplainResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunNetworkingScan"></a>
# **v3RunNetworkingScan**
> OperationNetworkingScanMetadataNetworkingScanResult v3RunNetworkingScan(analysisId, triggerNetworkingScanInputBody)

Run the networking-scan agent.

Starts an agent that name-matches the analysis&#39; functions and their callees against known networking APIs, and returns the operation to poll for its outcome.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    TriggerNetworkingScanInputBody triggerNetworkingScanInputBody = new TriggerNetworkingScanInputBody(); // TriggerNetworkingScanInputBody | 
    try {
      OperationNetworkingScanMetadataNetworkingScanResult result = apiInstance.v3RunNetworkingScan(analysisId, triggerNetworkingScanInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunNetworkingScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **triggerNetworkingScanInputBody** | [**TriggerNetworkingScanInputBody**](TriggerNetworkingScanInputBody.md)|  | |

### Return type

[**OperationNetworkingScanMetadataNetworkingScanResult**](OperationNetworkingScanMetadataNetworkingScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunProtocols"></a>
# **v3RunProtocols**
> OperationMetadataReportResult v3RunProtocols(analysisId)

Run the protocols agent.

Starts the protocols agent, which identifies the network and data protocols the binary implements, and returns the operation to poll for its outcome. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataReportResult result = apiInstance.v3RunProtocols(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunProtocols");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataReportResult**](OperationMetadataReportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunRemediation"></a>
# **v3RunRemediation**
> OperationMetadataRemediationResult v3RunRemediation(analysisId)

Run the remediation agent.

Starts the remediation agent, which generates YARA, Snort and STIX detection rules for the binary, and returns the operation to poll for its outcome. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataRemediationResult result = apiInstance.v3RunRemediation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunRemediation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataRemediationResult**](OperationMetadataRemediationResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunReportAnalysis"></a>
# **v3RunReportAnalysis**
> OperationMetadataThreatReportResult v3RunReportAnalysis(analysisId)

Run the report-analysis agent.

Starts the report-analysis agent, which produces a combined threat report — summary, software type, attack flow, indicators of compromise, MITRE ATT&amp;CK techniques and a YARA rule — and returns the operation to poll for its outcome. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataThreatReportResult result = apiInstance.v3RunReportAnalysis(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunReportAnalysis");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataThreatReportResult**](OperationMetadataThreatReportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunSecrets"></a>
# **v3RunSecrets**
> OperationMetadataReportResult v3RunSecrets(analysisId)

Run the secrets agent.

Starts the secrets agent, which finds credentials and other hardcoded secrets in the binary, and returns the operation to poll for its outcome. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataReportResult result = apiInstance.v3RunSecrets(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunSecrets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataReportResult**](OperationMetadataReportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunSecurityScan"></a>
# **v3RunSecurityScan**
> OperationSecurityScanMetadataSecurityScanResult v3RunSecurityScan(analysisId, triggerSecurityScanInputBody)

Run the security-scan agent.

Starts an agent that decompiles the analysis&#39; functions and runs a security scan over the decompiled source, and returns the operation to poll for its outcome. Each function costs an AI decompilation, so a whole-analysis run can be expensive — use &#x60;max_functions_to_scan&#x60; to bound it. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    TriggerSecurityScanInputBody triggerSecurityScanInputBody = new TriggerSecurityScanInputBody(); // TriggerSecurityScanInputBody | 
    try {
      OperationSecurityScanMetadataSecurityScanResult result = apiInstance.v3RunSecurityScan(analysisId, triggerSecurityScanInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunSecurityScan");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **triggerSecurityScanInputBody** | [**TriggerSecurityScanInputBody**](TriggerSecurityScanInputBody.md)|  | |

### Return type

[**OperationSecurityScanMetadataSecurityScanResult**](OperationSecurityScanMetadataSecurityScanResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3RunTriage"></a>
# **v3RunTriage**
> OperationMetadataTriageResult v3RunTriage(analysisId)

Run the triage agent.

Starts the triage agent, which scores the binary and each of its functions for maliciousness, and returns the operation to poll for its outcome. Unlike the other binary agents this one is not gated on subscription tier. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      OperationMetadataTriageResult result = apiInstance.v3RunTriage(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3RunTriage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |

### Return type

[**OperationMetadataTriageResult**](OperationMetadataTriageResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3TriggerRenameUnnamedFunctions"></a>
# **v3TriggerRenameUnnamedFunctions**
> StatusBody v3TriggerRenameUnnamedFunctions(analysisId, triggerRenameUnnamedFunctionsInputBody)

Run the rename-unnamed-functions agent.

Starts an agent that renames the analysis&#39; unnamed functions from their AI decompilations. Each function costs an AI decompilation, so a whole-analysis run can be expensive — use &#x60;limit&#x60; to bound it. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    TriggerRenameUnnamedFunctionsInputBody triggerRenameUnnamedFunctionsInputBody = new TriggerRenameUnnamedFunctionsInputBody(); // TriggerRenameUnnamedFunctionsInputBody | 
    try {
      StatusBody result = apiInstance.v3TriggerRenameUnnamedFunctions(analysisId, triggerRenameUnnamedFunctionsInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3TriggerRenameUnnamedFunctions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **triggerRenameUnnamedFunctionsInputBody** | [**TriggerRenameUnnamedFunctionsInputBody**](TriggerRenameUnnamedFunctionsInputBody.md)|  | |

### Return type

[**StatusBody**](StatusBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3UpsertBinaryAgentFeedback"></a>
# **v3UpsertBinaryAgentFeedback**
> v3UpsertBinaryAgentFeedback(analysisId, agent, submitFeedbackInputBody)

Record feedback on an agent&#39;s output.

Records how useful the caller found one agent&#39;s output for this analysis. Replaces any sentiment they recorded previously.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AgentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgentApi apiInstance = new AgentApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    String agent = "triage"; // String | Which agent's output the feedback is about
    SubmitFeedbackInputBody submitFeedbackInputBody = new SubmitFeedbackInputBody(); // SubmitFeedbackInputBody | 
    try {
      apiInstance.v3UpsertBinaryAgentFeedback(analysisId, agent, submitFeedbackInputBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentApi#v3UpsertBinaryAgentFeedback");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **analysisId** | **Long**| Analysis ID | |
| **agent** | **String**| Which agent&#39;s output the feedback is about | [enum: triage, capabilities, report-analysis, remediation, protocols, secrets] |
| **submitFeedbackInputBody** | [**SubmitFeedbackInputBody**](SubmitFeedbackInputBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

