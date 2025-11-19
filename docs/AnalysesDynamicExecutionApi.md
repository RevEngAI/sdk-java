# AnalysesDynamicExecutionApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDynamicExecutionStatus**](AnalysesDynamicExecutionApi.md#getDynamicExecutionStatus) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/status | Get the status of a dynamic execution task |
| [**getNetworkOverview**](AnalysesDynamicExecutionApi.md#getNetworkOverview) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/network-overview | Get the dynamic execution results for network overview |
| [**getProcessDump**](AnalysesDynamicExecutionApi.md#getProcessDump) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-dumps/{dump_name} | Get the dynamic execution results for a specific process dump |
| [**getProcessDumps**](AnalysesDynamicExecutionApi.md#getProcessDumps) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-dumps | Get the dynamic execution results for process dumps |
| [**getProcessRegistry**](AnalysesDynamicExecutionApi.md#getProcessRegistry) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-registry | Get the dynamic execution results for process registry |
| [**getProcessTree**](AnalysesDynamicExecutionApi.md#getProcessTree) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/process-tree | Get the dynamic execution results for process tree |
| [**getTtps**](AnalysesDynamicExecutionApi.md#getTtps) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/ttps | Get the dynamic execution results for ttps |


<a id="getDynamicExecutionStatus"></a>
# **getDynamicExecutionStatus**
> BaseResponseDynamicExecutionStatus getDynamicExecutionStatus(analysisId, apiKey)

Get the status of a dynamic execution task

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseDynamicExecutionStatus result = apiInstance.getDynamicExecutionStatus(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getDynamicExecutionStatus");
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
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseDynamicExecutionStatus**](BaseResponseDynamicExecutionStatus.md)

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

<a id="getNetworkOverview"></a>
# **getNetworkOverview**
> BaseResponseNetworkOverviewResponse getNetworkOverview(analysisId, apiKey)

Get the dynamic execution results for network overview

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseNetworkOverviewResponse result = apiInstance.getNetworkOverview(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getNetworkOverview");
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
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseNetworkOverviewResponse**](BaseResponseNetworkOverviewResponse.md)

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

<a id="getProcessDump"></a>
# **getProcessDump**
> Object getProcessDump(analysisId, dumpName, apiKey)

Get the dynamic execution results for a specific process dump

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String dumpName = "dumpName_example"; // String | 
    String apiKey = "apiKey_example"; // String | 
    try {
      Object result = apiInstance.getProcessDump(analysisId, dumpName, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getProcessDump");
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
| **dumpName** | **String**|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

**Object**

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

<a id="getProcessDumps"></a>
# **getProcessDumps**
> BaseResponseProcessDumps getProcessDumps(analysisId, apiKey)

Get the dynamic execution results for process dumps

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseProcessDumps result = apiInstance.getProcessDumps(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getProcessDumps");
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
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseProcessDumps**](BaseResponseProcessDumps.md)

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

<a id="getProcessRegistry"></a>
# **getProcessRegistry**
> BaseResponseProcessRegistry getProcessRegistry(analysisId, apiKey)

Get the dynamic execution results for process registry

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseProcessRegistry result = apiInstance.getProcessRegistry(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getProcessRegistry");
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
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseProcessRegistry**](BaseResponseProcessRegistry.md)

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

<a id="getProcessTree"></a>
# **getProcessTree**
> BaseResponseProcessTree getProcessTree(analysisId, apiKey)

Get the dynamic execution results for process tree

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseProcessTree result = apiInstance.getProcessTree(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getProcessTree");
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
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseProcessTree**](BaseResponseProcessTree.md)

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

<a id="getTtps"></a>
# **getTtps**
> BaseResponseTTPS getTtps(analysisId, apiKey)

Get the dynamic execution results for ttps

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesDynamicExecutionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesDynamicExecutionApi apiInstance = new AnalysesDynamicExecutionApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseTTPS result = apiInstance.getTtps(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesDynamicExecutionApi#getTtps");
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
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseTTPS**](BaseResponseTTPS.md)

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

