# AgentApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet**](AgentApi.md#checkCapabilitiesTaskStatusV2AnalysesAnalysisIdAgentCapabilitiesStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities/status | Check the status of a capabilities analysis workflow |
| [**checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet**](AgentApi.md#checkReportAnalysisTaskStatusV2AnalysesAnalysisIdAgentReportAnalysisStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis/status | Check the status of a report analysis workflow |
| [**checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet**](AgentApi.md#checkTriageTaskStatusV2AnalysesAnalysisIdAgentTriageStatusGet) | **GET** /v2/analyses/{analysis_id}/agent/triage/status | Check the status of a triage analysis workflow |
| [**createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost**](AgentApi.md#createCapabilitiesTaskV2AnalysesAnalysisIdAgentCapabilitiesPost) | **POST** /v2/analyses/{analysis_id}/agent/capabilities | Queues a capabilities analysis workflow process |
| [**createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost**](AgentApi.md#createReportAnalysisTaskV2AnalysesAnalysisIdAgentReportAnalysisPost) | **POST** /v2/analyses/{analysis_id}/agent/report-analysis | Queues a combined report analysis workflow process |
| [**createTriageTaskV2AnalysesAnalysisIdAgentTriagePost**](AgentApi.md#createTriageTaskV2AnalysesAnalysisIdAgentTriagePost) | **POST** /v2/analyses/{analysis_id}/agent/triage | Queues a triage analysis workflow process |
| [**getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet**](AgentApi.md#getCapabilitiesResultV2AnalysesAnalysisIdAgentCapabilitiesGet) | **GET** /v2/analyses/{analysis_id}/agent/capabilities | Get Capabilities Result |
| [**getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet**](AgentApi.md#getReportAnalysisResultV2AnalysesAnalysisIdAgentReportAnalysisGet) | **GET** /v2/analyses/{analysis_id}/agent/report-analysis | Get Report Analysis Result |
| [**getTriageResultV2AnalysesAnalysisIdAgentTriageGet**](AgentApi.md#getTriageResultV2AnalysesAnalysisIdAgentTriageGet) | **GET** /v2/analyses/{analysis_id}/agent/triage | Get Triage Result |


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

