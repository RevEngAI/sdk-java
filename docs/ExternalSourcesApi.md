# ExternalSourcesApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createExternalTaskMb**](ExternalSourcesApi.md#createExternalTaskMb) | **POST** /v2/analysis/{analysis_id}/external/mb | Pulls data from VirusTotal |
| [**createExternalTaskVt**](ExternalSourcesApi.md#createExternalTaskVt) | **POST** /v2/analysis/{analysis_id}/external/vt | Pulls data from VirusTotal |
| [**getMbData**](ExternalSourcesApi.md#getMbData) | **GET** /v2/analysis/{analysis_id}/external/mb | Get MalwareBazaar data |
| [**getMbTaskStatus**](ExternalSourcesApi.md#getMbTaskStatus) | **GET** /v2/analysis/{analysis_id}/external/mb/status | Check the status of MalwareBazaar data retrieval |
| [**getVtData**](ExternalSourcesApi.md#getVtData) | **GET** /v2/analysis/{analysis_id}/external/vt | Get VirusTotal data |
| [**getVtTaskStatus**](ExternalSourcesApi.md#getVtTaskStatus) | **GET** /v2/analysis/{analysis_id}/external/vt/status | Check the status of VirusTotal data retrieval |


<a id="createExternalTaskMb"></a>
# **createExternalTaskMb**
> BaseResponseStr createExternalTaskMb(analysisId)

Pulls data from VirusTotal

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ExternalSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ExternalSourcesApi apiInstance = new ExternalSourcesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseStr result = apiInstance.createExternalTaskMb(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSourcesApi#createExternalTaskMb");
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

[**BaseResponseStr**](BaseResponseStr.md)

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
| **409** | Request already queued |  -  |

<a id="createExternalTaskVt"></a>
# **createExternalTaskVt**
> BaseResponseStr createExternalTaskVt(analysisId)

Pulls data from VirusTotal

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ExternalSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ExternalSourcesApi apiInstance = new ExternalSourcesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseStr result = apiInstance.createExternalTaskVt(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSourcesApi#createExternalTaskVt");
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

[**BaseResponseStr**](BaseResponseStr.md)

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
| **409** | Request already queued |  -  |

<a id="getMbData"></a>
# **getMbData**
> BaseResponseExternalResponse getMbData(analysisId)

Get MalwareBazaar data

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ExternalSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ExternalSourcesApi apiInstance = new ExternalSourcesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseExternalResponse result = apiInstance.getMbData(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSourcesApi#getMbData");
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

[**BaseResponseExternalResponse**](BaseResponseExternalResponse.md)

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
| **404** | No data retrieved from MalwareBazaar for the given analysis_id |  -  |

<a id="getMbTaskStatus"></a>
# **getMbTaskStatus**
> BaseResponseTaskResponse getMbTaskStatus(analysisId)

Check the status of MalwareBazaar data retrieval

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ExternalSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ExternalSourcesApi apiInstance = new ExternalSourcesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseTaskResponse result = apiInstance.getMbTaskStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSourcesApi#getMbTaskStatus");
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

[**BaseResponseTaskResponse**](BaseResponseTaskResponse.md)

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

<a id="getVtData"></a>
# **getVtData**
> BaseResponseExternalResponse getVtData(analysisId)

Get VirusTotal data

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ExternalSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ExternalSourcesApi apiInstance = new ExternalSourcesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseExternalResponse result = apiInstance.getVtData(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSourcesApi#getVtData");
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

[**BaseResponseExternalResponse**](BaseResponseExternalResponse.md)

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
| **404** | No data retrieved from VirusTotal for the given analysis_id |  -  |

<a id="getVtTaskStatus"></a>
# **getVtTaskStatus**
> BaseResponseTaskResponse getVtTaskStatus(analysisId)

Check the status of VirusTotal data retrieval

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ExternalSourcesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ExternalSourcesApi apiInstance = new ExternalSourcesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseTaskResponse result = apiInstance.getVtTaskStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExternalSourcesApi#getVtTaskStatus");
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

[**BaseResponseTaskResponse**](BaseResponseTaskResponse.md)

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

