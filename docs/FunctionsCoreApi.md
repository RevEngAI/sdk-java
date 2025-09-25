# FunctionsCoreApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**aiUnstrip**](FunctionsCoreApi.md#aiUnstrip) | **POST** /v2/analyses/{analysis_id}/functions/ai-unstrip | Performs matching and auto-unstrip for an analysis and its functions |
| [**analysisFunctionMatching**](FunctionsCoreApi.md#analysisFunctionMatching) | **POST** /v2/analyses/{analysis_id}/functions/matches | Perform matching for the functions of an analysis |
| [**autoUnstrip**](FunctionsCoreApi.md#autoUnstrip) | **POST** /v2/analyses/{analysis_id}/functions/auto-unstrip | Performs matching and auto-unstrip for an analysis and its functions |
| [**batchFunctionMatching**](FunctionsCoreApi.md#batchFunctionMatching) | **POST** /v2/functions/matches | Perform function matching for an arbitrary batch of functions, binaries or collections |
| [**cancelAiUnstrip**](FunctionsCoreApi.md#cancelAiUnstrip) | **DELETE** /v2/analyses/{analysis_id}/functions/ai-unstrip/cancel | Cancels a running ai-unstrip |
| [**cancelAutoUnstrip**](FunctionsCoreApi.md#cancelAutoUnstrip) | **DELETE** /v2/analyses/{analysis_id}/functions/unstrip/cancel | Cancels a running auto-unstrip |
| [**getAnalysisStrings**](FunctionsCoreApi.md#getAnalysisStrings) | **GET** /v2/analyses/{analysis_id}/functions/strings | Get string information found in the Analysis |
| [**getFunctionBlocks**](FunctionsCoreApi.md#getFunctionBlocks) | **GET** /v2/functions/{function_id}/blocks | Get disassembly blocks related to the function |
| [**getFunctionCalleesCallers**](FunctionsCoreApi.md#getFunctionCalleesCallers) | **GET** /v2/functions/{function_id}/callees_callers | Get list of functions that call or are called by the specified function |
| [**getFunctionCapabilities**](FunctionsCoreApi.md#getFunctionCapabilities) | **GET** /v2/functions/{function_id}/capabilities | Retrieve a functions capabilities |
| [**getFunctionDetails**](FunctionsCoreApi.md#getFunctionDetails) | **GET** /v2/functions/{function_id} | Get function details |
| [**getFunctionStrings**](FunctionsCoreApi.md#getFunctionStrings) | **GET** /v2/functions/{function_id}/strings | Get string information found in the function |
| [**getSimilarFunctions**](FunctionsCoreApi.md#getSimilarFunctions) | **GET** /v2/functions/{function_id}/similar-functions | Get list of similar functions |


<a id="aiUnstrip"></a>
# **aiUnstrip**
> AutoUnstripResponse aiUnstrip(analysisId, aiUnstripRequest, authorization)

Performs matching and auto-unstrip for an analysis and its functions

Takes in the analysis ID, uses the functions ID&#39;s from it and settings to find the nearest function groups for each function that&#39;s within the system

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    AiUnstripRequest aiUnstripRequest = new AiUnstripRequest(); // AiUnstripRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      AutoUnstripResponse result = apiInstance.aiUnstrip(analysisId, aiUnstripRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#aiUnstrip");
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
| **aiUnstripRequest** | [**AiUnstripRequest**](AiUnstripRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**AutoUnstripResponse**](AutoUnstripResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="analysisFunctionMatching"></a>
# **analysisFunctionMatching**
> FunctionMatchingBatchResponse analysisFunctionMatching(analysisId, analysisFunctionMatchingRequest, authorization)

Perform matching for the functions of an analysis

Takes in an analysis id and settings and matches the nearest functions to the ones associated with it. Results can optionally be filtered by collection, binary, debug type or (other) function ids

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    AnalysisFunctionMatchingRequest analysisFunctionMatchingRequest = new AnalysisFunctionMatchingRequest(); // AnalysisFunctionMatchingRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      FunctionMatchingBatchResponse result = apiInstance.analysisFunctionMatching(analysisId, analysisFunctionMatchingRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#analysisFunctionMatching");
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
| **analysisFunctionMatchingRequest** | [**AnalysisFunctionMatchingRequest**](AnalysisFunctionMatchingRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**FunctionMatchingBatchResponse**](FunctionMatchingBatchResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="autoUnstrip"></a>
# **autoUnstrip**
> AutoUnstripResponse autoUnstrip(analysisId, autoUnstripRequest, authorization)

Performs matching and auto-unstrip for an analysis and its functions

Takes in the analysis ID, uses the functions ID&#39;s from it and settings to find the nearest function for each function that&#39;s within the system

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    AutoUnstripRequest autoUnstripRequest = new AutoUnstripRequest(); // AutoUnstripRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      AutoUnstripResponse result = apiInstance.autoUnstrip(analysisId, autoUnstripRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#autoUnstrip");
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
| **autoUnstripRequest** | [**AutoUnstripRequest**](AutoUnstripRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**AutoUnstripResponse**](AutoUnstripResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="batchFunctionMatching"></a>
# **batchFunctionMatching**
> FunctionMatchingBatchResponse batchFunctionMatching(functionMatchingRequest, authorization)

Perform function matching for an arbitrary batch of functions, binaries or collections

Takes in an input of functions ID&#39;s and settings and finds the nearest functions for each function that&#39;s within the system

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    FunctionMatchingRequest functionMatchingRequest = new FunctionMatchingRequest(); // FunctionMatchingRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      FunctionMatchingBatchResponse result = apiInstance.batchFunctionMatching(functionMatchingRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#batchFunctionMatching");
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
| **functionMatchingRequest** | [**FunctionMatchingRequest**](FunctionMatchingRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**FunctionMatchingBatchResponse**](FunctionMatchingBatchResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="cancelAiUnstrip"></a>
# **cancelAiUnstrip**
> AutoUnstripResponse cancelAiUnstrip(analysisId, authorization)

Cancels a running ai-unstrip

Takes in the analysis ID and cancels a running ai-unstrip operation

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      AutoUnstripResponse result = apiInstance.cancelAiUnstrip(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#cancelAiUnstrip");
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

[**AutoUnstripResponse**](AutoUnstripResponse.md)

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

<a id="cancelAutoUnstrip"></a>
# **cancelAutoUnstrip**
> AutoUnstripResponse cancelAutoUnstrip(analysisId, authorization)

Cancels a running auto-unstrip

Takes in the analysis ID and cancels a running auto-unstrip operation

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      AutoUnstripResponse result = apiInstance.cancelAutoUnstrip(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#cancelAutoUnstrip");
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

[**AutoUnstripResponse**](AutoUnstripResponse.md)

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

<a id="getAnalysisStrings"></a>
# **getAnalysisStrings**
> BaseResponseAnalysisStringsResponse getAnalysisStrings(analysisId, page, pageSize, search, functionSearch, authorization)

Get string information found in the Analysis

Get string information found in the analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 100; // Integer | Number of items per page.
    String search = "search_example"; // String | Search is applied to string value
    String functionSearch = "functionSearch_example"; // String | Search is applied to function names
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseAnalysisStringsResponse result = apiInstance.getAnalysisStrings(analysisId, page, pageSize, search, functionSearch, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getAnalysisStrings");
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
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 100] |
| **search** | **String**| Search is applied to string value | [optional] |
| **functionSearch** | **String**| Search is applied to function names | [optional] |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseAnalysisStringsResponse**](BaseResponseAnalysisStringsResponse.md)

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

<a id="getFunctionBlocks"></a>
# **getFunctionBlocks**
> BaseResponseFunctionBlocksResponse getFunctionBlocks(functionId, authorization)

Get disassembly blocks related to the function

Get disassembly blocks related to the function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseFunctionBlocksResponse result = apiInstance.getFunctionBlocks(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionBlocks");
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
| **functionId** | **Integer**|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseFunctionBlocksResponse**](BaseResponseFunctionBlocksResponse.md)

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
| **404** | Not Found |  -  |

<a id="getFunctionCalleesCallers"></a>
# **getFunctionCalleesCallers**
> BaseResponseCalleesCallerFunctionsResponse getFunctionCalleesCallers(functionId, authorization)

Get list of functions that call or are called by the specified function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCalleesCallerFunctionsResponse result = apiInstance.getFunctionCalleesCallers(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionCalleesCallers");
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
| **functionId** | **Integer**|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseCalleesCallerFunctionsResponse**](BaseResponseCalleesCallerFunctionsResponse.md)

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

<a id="getFunctionCapabilities"></a>
# **getFunctionCapabilities**
> BaseResponseFunctionCapabilityResponse getFunctionCapabilities(functionId, authorization)

Retrieve a functions capabilities

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseFunctionCapabilityResponse result = apiInstance.getFunctionCapabilities(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionCapabilities");
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
| **functionId** | **Integer**|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseFunctionCapabilityResponse**](BaseResponseFunctionCapabilityResponse.md)

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
| **404** | Not Found |  -  |

<a id="getFunctionDetails"></a>
# **getFunctionDetails**
> BaseResponseFunctionsDetailResponse getFunctionDetails(functionId, authorization)

Get function details

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseFunctionsDetailResponse result = apiInstance.getFunctionDetails(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionDetails");
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
| **functionId** | **Integer**|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseFunctionsDetailResponse**](BaseResponseFunctionsDetailResponse.md)

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

<a id="getFunctionStrings"></a>
# **getFunctionStrings**
> BaseResponseFunctionStringsResponse getFunctionStrings(functionId, page, pageSize, search, authorization)

Get string information found in the function

Get string information found in the function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer functionId = 56; // Integer | 
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 100; // Integer | Number of items per page.
    String search = "search_example"; // String | Search is applied to string value
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseFunctionStringsResponse result = apiInstance.getFunctionStrings(functionId, page, pageSize, search, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionStrings");
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
| **functionId** | **Integer**|  | |
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 100] |
| **search** | **String**| Search is applied to string value | [optional] |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseFunctionStringsResponse**](BaseResponseFunctionStringsResponse.md)

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

<a id="getSimilarFunctions"></a>
# **getSimilarFunctions**
> BaseResponseListSimilarFunctionsResponse getSimilarFunctions(functionId, limit, distance, collectionIds, debug, debugTypes, binaryIds, authorization)

Get list of similar functions

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Integer functionId = 56; // Integer | 
    Integer limit = 20; // Integer | Number of similar functions to return
    BigDecimal distance = new BigDecimal("1.0"); // BigDecimal | Maximum cosine distance
    List<Integer> collectionIds = Arrays.asList(); // List<Integer> | Collection filtering by IDs
    Boolean debug = false; // Boolean | Only return matching debug functions
    List<String> debugTypes = Arrays.asList(); // List<String> | If limiting results to functions with debug names, which type of debug names to include?
    List<Integer> binaryIds = Arrays.asList(); // List<Integer> | Limit similar functions to specific binaries
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListSimilarFunctionsResponse result = apiInstance.getSimilarFunctions(functionId, limit, distance, collectionIds, debug, debugTypes, binaryIds, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getSimilarFunctions");
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
| **functionId** | **Integer**|  | |
| **limit** | **Integer**| Number of similar functions to return | [optional] [default to 20] |
| **distance** | **BigDecimal**| Maximum cosine distance | [optional] [default to 1.0] |
| **collectionIds** | [**List&lt;Integer&gt;**](Integer.md)| Collection filtering by IDs | [optional] |
| **debug** | **Boolean**| Only return matching debug functions | [optional] [default to false] |
| **debugTypes** | [**List&lt;String&gt;**](String.md)| If limiting results to functions with debug names, which type of debug names to include? | [optional] [enum: USER, SYSTEM, EXTERNAL] |
| **binaryIds** | [**List&lt;Integer&gt;**](Integer.md)| Limit similar functions to specific binaries | [optional] |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseListSimilarFunctionsResponse**](BaseResponseListSimilarFunctionsResponse.md)

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

