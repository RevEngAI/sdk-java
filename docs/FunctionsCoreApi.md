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
| [**getAnalysisStringsStatus**](FunctionsCoreApi.md#getAnalysisStringsStatus) | **GET** /v2/analyses/{analysis_id}/functions/strings/status | Get string processing state for the Analysis |
| [**getFunctionBlocks**](FunctionsCoreApi.md#getFunctionBlocks) | **GET** /v2/functions/{function_id}/blocks | Get disassembly blocks related to the function |
| [**getFunctionCalleesCallers**](FunctionsCoreApi.md#getFunctionCalleesCallers) | **GET** /v2/functions/{function_id}/callees_callers | Get list of functions that call or are called by the specified function |
| [**getFunctionCalleesCallersBulk**](FunctionsCoreApi.md#getFunctionCalleesCallersBulk) | **GET** /v2/functions/callees_callers | Get list of functions that call or are called for a list of functions |
| [**getFunctionCapabilities**](FunctionsCoreApi.md#getFunctionCapabilities) | **GET** /v2/functions/{function_id}/capabilities | Retrieve a functions capabilities |
| [**getFunctionDetails**](FunctionsCoreApi.md#getFunctionDetails) | **GET** /v2/functions/{function_id} | Get function details |
| [**getFunctionStrings**](FunctionsCoreApi.md#getFunctionStrings) | **GET** /v2/functions/{function_id}/strings | Get string information found in the function |


<a id="aiUnstrip"></a>
# **aiUnstrip**
> AutoUnstripResponse aiUnstrip(analysisId, aiUnstripRequest)

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
    try {
      AutoUnstripResponse result = apiInstance.aiUnstrip(analysisId, aiUnstripRequest);
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
> FunctionMatchingResponse analysisFunctionMatching(analysisId, analysisFunctionMatchingRequest)

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
    try {
      FunctionMatchingResponse result = apiInstance.analysisFunctionMatching(analysisId, analysisFunctionMatchingRequest);
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

### Return type

[**FunctionMatchingResponse**](FunctionMatchingResponse.md)

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
> AutoUnstripResponse autoUnstrip(analysisId, autoUnstripRequest)

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
    try {
      AutoUnstripResponse result = apiInstance.autoUnstrip(analysisId, autoUnstripRequest);
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
> FunctionMatchingResponse batchFunctionMatching(functionMatchingRequest)

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
    try {
      FunctionMatchingResponse result = apiInstance.batchFunctionMatching(functionMatchingRequest);
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

### Return type

[**FunctionMatchingResponse**](FunctionMatchingResponse.md)

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
> AutoUnstripResponse cancelAiUnstrip(analysisId)

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
    try {
      AutoUnstripResponse result = apiInstance.cancelAiUnstrip(analysisId);
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
> AutoUnstripResponse cancelAutoUnstrip(analysisId)

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
    try {
      AutoUnstripResponse result = apiInstance.cancelAutoUnstrip(analysisId);
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
> BaseResponseAnalysisStringsResponse getAnalysisStrings(analysisId, page, pageSize, search, functionSearch, orderBy, sortOrder)

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
    String orderBy = "length"; // String | Order by field
    String sortOrder = "ASC"; // String | Sort order for the results
    try {
      BaseResponseAnalysisStringsResponse result = apiInstance.getAnalysisStrings(analysisId, page, pageSize, search, functionSearch, orderBy, sortOrder);
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
| **orderBy** | **String**| Order by field | [optional] [default to value] [enum: length, value] |
| **sortOrder** | **String**| Sort order for the results | [optional] [default to ASC] [enum: ASC, DESC] |

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

<a id="getAnalysisStringsStatus"></a>
# **getAnalysisStringsStatus**
> BaseResponseAnalysisStringsStatusResponse getAnalysisStringsStatus(analysisId)

Get string processing state for the Analysis

Get string processing state for the Analysis

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
    try {
      BaseResponseAnalysisStringsStatusResponse result = apiInstance.getAnalysisStringsStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getAnalysisStringsStatus");
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

[**BaseResponseAnalysisStringsStatusResponse**](BaseResponseAnalysisStringsStatusResponse.md)

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
> BaseResponseFunctionBlocksResponse getFunctionBlocks(functionId)

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
    try {
      BaseResponseFunctionBlocksResponse result = apiInstance.getFunctionBlocks(functionId);
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
> BaseResponseCalleesCallerFunctionsResponse getFunctionCalleesCallers(functionId)

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
    try {
      BaseResponseCalleesCallerFunctionsResponse result = apiInstance.getFunctionCalleesCallers(functionId);
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

<a id="getFunctionCalleesCallersBulk"></a>
# **getFunctionCalleesCallersBulk**
> BaseResponseListCalleesCallerFunctionsResponse getFunctionCalleesCallersBulk(functionIds)

Get list of functions that call or are called for a list of functions

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
    List<Integer> functionIds = Arrays.asList(); // List<Integer> | 
    try {
      BaseResponseListCalleesCallerFunctionsResponse result = apiInstance.getFunctionCalleesCallersBulk(functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionCalleesCallersBulk");
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
| **functionIds** | [**List&lt;Integer&gt;**](Integer.md)|  | |

### Return type

[**BaseResponseListCalleesCallerFunctionsResponse**](BaseResponseListCalleesCallerFunctionsResponse.md)

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
> BaseResponseFunctionCapabilityResponse getFunctionCapabilities(functionId)

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
    try {
      BaseResponseFunctionCapabilityResponse result = apiInstance.getFunctionCapabilities(functionId);
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
> BaseResponseFunctionsDetailResponse getFunctionDetails(functionId)

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
    try {
      BaseResponseFunctionsDetailResponse result = apiInstance.getFunctionDetails(functionId);
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
> BaseResponseFunctionStringsResponse getFunctionStrings(functionId, page, pageSize, search)

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
    try {
      BaseResponseFunctionStringsResponse result = apiInstance.getFunctionStrings(functionId, page, pageSize, search);
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

