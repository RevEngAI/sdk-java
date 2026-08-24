# AgentApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet**](AgentApi.md#checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities/status | Check the status of a capabilities analysis workflow |
| [**checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet**](AgentApi.md#checkRemediationTaskStatusV2AnalysesAnalysisIdAgentRemediationStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/remediation/status | Check the status of a remediation analysis workflow |
| [**checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet**](AgentApi.md#checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis/status | Check the status of a report analysis workflow |
| [**checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet**](AgentApi.md#checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/triage/status | Check the status of a triage analysis workflow |
| [**createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost**](AgentApi.md#createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost) | **POST** /v2/analyses/{analysis_id}/agent/capabilities | Queues a capabilities analysis workflow process |
| [**createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost**](AgentApi.md#createRemediationTaskV2AnalysesAnalysisIdAgentRemediationPost) | **POST** /v2/analyses/{analysis_id}/agent/remediation | Queues a remediation analysis workflow process |
| [**createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost**](AgentApi.md#createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost) | **POST** /v2/analyses/{analysis_id}/agent/report-analysis | Queues a combined report analysis workflow process |
| [**createTriageTaskV2AnalysesAnalysisIdAgentTriagePost**](AgentApi.md#createTriageTaskV2AnalysesAnalysisIdAgentTriagePost) | **POST** /v2/analyses/{analysis_id}/agent/triage | Queues a triage analysis workflow process |
| [**getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet**](AgentApi.md#getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities | Get Capabilities Result |
| [**getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet**](AgentApi.md#getRemediationResultV2AnalysesAnalysisIdAgentRemediationGet) | **GET** /v2/analyses/{analysis_id}/agent/remediation | Get Remediation Result |
| [**getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet**](AgentApi.md#getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis | Get Report Analysis Result |
| [**getTriageResultV2AnalysesAnalysisIdAgentTriageGet**](AgentApi.md#getTriageResultV2AnalysesAnalysisIdAgentTriageGet) | **GET** /v2/analyses/{analysis_id}/agent/triage | Get Triage Result |
| [**v3CancelRenameUnnamedFunctions**](AgentApi.md#v3CancelRenameUnnamedFunctions) | **POST** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions/cancel | Cancel the rename-unnamed-functions agent. |
| [**v3GetRenameUnnamedFunctionsResult**](AgentApi.md#v3GetRenameUnnamedFunctionsResult) | **GET** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions | Get rename-unnamed-functions agent result. |
| [**v3GetRenameUnnamedFunctionsStatus**](AgentApi.md#v3GetRenameUnnamedFunctionsStatus) | **GET** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions/status | Get rename-unnamed-functions agent status. |
| [**v3TriggerRenameUnnamedFunctions**](AgentApi.md#v3TriggerRenameUnnamedFunctions) | **POST** /v3/analyses/{analysis_id}/agents/rename-unnamed-functions | Run the rename-unnamed-functions agent. |


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

<a id="v3TriggerRenameUnnamedFunctions"></a>
# **v3TriggerRenameUnnamedFunctions**
> StatusBody v3TriggerRenameUnnamedFunctions(analysisId, triggerRenameUnnamedFunctionsInputBody)

Run the rename-unnamed-functions agent.

Starts an agent that renames the analysis&#39; unnamed functions from their AI decompilations. Each function costs an AI decompilation, so a whole-analysis run can be expensive — use &#x60;limit&#x60; to bound it. Returns 409 while a run is already in progress for this analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

