# AnalysesSecurityChecksApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createScurityChecksTask**](AnalysesSecurityChecksApi.md#createScurityChecksTask) | **POST** /v2/analyses/{analysis_id}/security-checks | Queues a security check process |
| [**getSecurityChecks**](AnalysesSecurityChecksApi.md#getSecurityChecks) | **GET** /v2/analyses/{analysis_id}/security-checks | Get Security Checks |
| [**getSecurityChecksTaskStatus**](AnalysesSecurityChecksApi.md#getSecurityChecksTaskStatus) | **GET** /v2/analyses/{analysis_id}/security-checks/status | Check the status of a security check process |


<a id="createScurityChecksTask"></a>
# **createScurityChecksTask**
> QueuedSecurityChecksTaskResponse createScurityChecksTask(analysisId, authorization)

Queues a security check process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesSecurityChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesSecurityChecksApi apiInstance = new AnalysesSecurityChecksApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      QueuedSecurityChecksTaskResponse result = apiInstance.createScurityChecksTask(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesSecurityChecksApi#createScurityChecksTask");
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**QueuedSecurityChecksTaskResponse**](QueuedSecurityChecksTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **409** | Security checks already extracted or queued |  -  |

<a id="getSecurityChecks"></a>
# **getSecurityChecks**
> BaseResponseSecurityChecksResponse getSecurityChecks(analysisId, page, pageSize, authorization)

Get Security Checks

Retrieve security checks results with pagination.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesSecurityChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesSecurityChecksApi apiInstance = new AnalysesSecurityChecksApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    Integer page = 56; // Integer | The page number to retrieve.
    Integer pageSize = 56; // Integer | Number of items per page.
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseSecurityChecksResponse result = apiInstance.getSecurityChecks(analysisId, page, pageSize, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesSecurityChecksApi#getSecurityChecks");
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
| **page** | **Integer**| The page number to retrieve. | |
| **pageSize** | **Integer**| Number of items per page. | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseSecurityChecksResponse**](BaseResponseSecurityChecksResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getSecurityChecksTaskStatus"></a>
# **getSecurityChecksTaskStatus**
> CheckSecurityChecksTaskResponse getSecurityChecksTaskStatus(analysisId, authorization)

Check the status of a security check process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesSecurityChecksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesSecurityChecksApi apiInstance = new AnalysesSecurityChecksApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      CheckSecurityChecksTaskResponse result = apiInstance.getSecurityChecksTaskStatus(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesSecurityChecksApi#getSecurityChecksTaskStatus");
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**CheckSecurityChecksTaskResponse**](CheckSecurityChecksTaskResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

