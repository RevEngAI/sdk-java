# FunctionsDataTypesApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchUpdateFunctionDataTypes**](FunctionsDataTypesApi.md#batchUpdateFunctionDataTypes) | **PUT** /v3/analyses/{analysis_id}/functions/data-types | Batch update function data types |
| [**generateFunctionDataTypesForAnalysis**](FunctionsDataTypesApi.md#generateFunctionDataTypesForAnalysis) | **POST** /v2/analyses/{analysis_id}/functions/data_types | Generate Function Data Types |
| [**generateFunctionDataTypesForFunctions**](FunctionsDataTypesApi.md#generateFunctionDataTypesForFunctions) | **POST** /v2/functions/data_types | Generate Function Data Types for an arbitrary list of functions |
| [**getFunctionDataTypes**](FunctionsDataTypesApi.md#getFunctionDataTypes) | **GET** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Get Function Data Types |
| [**getFunctionDataTypes_0**](FunctionsDataTypesApi.md#getFunctionDataTypes_0) | **GET** /v3/analyses/{analysis_id}/functions/{function_id}/data-types | Get data types for a single function |
| [**listAnalysisFunctionsDataTypes**](FunctionsDataTypesApi.md#listAnalysisFunctionsDataTypes) | **GET** /v3/analyses/{analysis_id}/functions/data-types | List data types for all functions in an analysis |
| [**listFunctionDataTypesForAnalysis**](FunctionsDataTypesApi.md#listFunctionDataTypesForAnalysis) | **GET** /v2/analyses/{analysis_id}/functions/data_types | List Function Data Types |
| [**listFunctionDataTypesForFunctions**](FunctionsDataTypesApi.md#listFunctionDataTypesForFunctions) | **GET** /v2/functions/data_types | List Function Data Types |
| [**listFunctionsDataTypes**](FunctionsDataTypesApi.md#listFunctionsDataTypes) | **GET** /v3/functions/data-types | Get data types for many functions |


<a id="batchUpdateFunctionDataTypes"></a>
# **batchUpdateFunctionDataTypes**
> BatchUpdateDataTypesOutputBody batchUpdateFunctionDataTypes(analysisId, batchUpdateDataTypesInputBody)

Batch update function data types

Updates data types for multiple functions in one analysis. All function IDs in the body must belong to the analysis. Each item is processed independently and reports its own outcome: a stale &#x60;data_types_version&#x60; yields &#x60;version_conflict&#x60; for that item without affecting the rest of the batch.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    BatchUpdateDataTypesInputBody batchUpdateDataTypesInputBody = new BatchUpdateDataTypesInputBody(); // BatchUpdateDataTypesInputBody | 
    try {
      BatchUpdateDataTypesOutputBody result = apiInstance.batchUpdateFunctionDataTypes(analysisId, batchUpdateDataTypesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#batchUpdateFunctionDataTypes");
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
| **batchUpdateDataTypesInputBody** | [**BatchUpdateDataTypesInputBody**](BatchUpdateDataTypesInputBody.md)|  | |

### Return type

[**BatchUpdateDataTypesOutputBody**](BatchUpdateDataTypesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="generateFunctionDataTypesForAnalysis"></a>
# **generateFunctionDataTypesForAnalysis**
> BaseResponseGenerateFunctionDataTypes generateFunctionDataTypesForAnalysis(analysisId, functionDataTypesParams)

Generate Function Data Types

Submits a request to generate the function data types

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    FunctionDataTypesParams functionDataTypesParams = new FunctionDataTypesParams(); // FunctionDataTypesParams | 
    try {
      BaseResponseGenerateFunctionDataTypes result = apiInstance.generateFunctionDataTypesForAnalysis(analysisId, functionDataTypesParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#generateFunctionDataTypesForAnalysis");
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
| **functionDataTypesParams** | [**FunctionDataTypesParams**](FunctionDataTypesParams.md)|  | |

### Return type

[**BaseResponseGenerateFunctionDataTypes**](BaseResponseGenerateFunctionDataTypes.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="generateFunctionDataTypesForFunctions"></a>
# **generateFunctionDataTypesForFunctions**
> BaseResponseGenerationStatusList generateFunctionDataTypesForFunctions(functionDataTypesParams)

Generate Function Data Types for an arbitrary list of functions

Submits a request to generate the function data types

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    FunctionDataTypesParams functionDataTypesParams = new FunctionDataTypesParams(); // FunctionDataTypesParams | 
    try {
      BaseResponseGenerationStatusList result = apiInstance.generateFunctionDataTypesForFunctions(functionDataTypesParams);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#generateFunctionDataTypesForFunctions");
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
| **functionDataTypesParams** | [**FunctionDataTypesParams**](FunctionDataTypesParams.md)|  | |

### Return type

[**BaseResponseGenerationStatusList**](BaseResponseGenerationStatusList.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getFunctionDataTypes"></a>
# **getFunctionDataTypes**
> BaseResponseFunctionDataTypes getFunctionDataTypes(analysisId, functionId)

Get Function Data Types

Polling endpoint which returns the current status of function generation and once completed the data type information

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    Integer functionId = 56; // Integer | 
    try {
      BaseResponseFunctionDataTypes result = apiInstance.getFunctionDataTypes(analysisId, functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#getFunctionDataTypes");
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
| **functionId** | **Integer**|  | |

### Return type

[**BaseResponseFunctionDataTypes**](BaseResponseFunctionDataTypes.md)

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

<a id="getFunctionDataTypes_0"></a>
# **getFunctionDataTypes_0**
> DataTypesEntry getFunctionDataTypes_0(analysisId, functionId)

Get data types for a single function

Returns the stored data-types blob for one function. The function must belong to the supplied analysis.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long functionId = 56L; // Long | Function ID
    try {
      DataTypesEntry result = apiInstance.getFunctionDataTypes_0(analysisId, functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#getFunctionDataTypes_0");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**DataTypesEntry**](DataTypesEntry.md)

### Authorization

[APIKey](../README.md#APIKey)

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

<a id="listAnalysisFunctionsDataTypes"></a>
# **listAnalysisFunctionsDataTypes**
> ListAnalysisFunctionsDataTypesOutputBody listAnalysisFunctionsDataTypes(analysisId, offset, limit)

List data types for all functions in an analysis

Paginated read of the stored data-types blob for each function in the analysis.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long offset = 56L; // Long | Pagination offset. Defaults to 0.
    Long limit = 56L; // Long | Page size. Defaults to 100.
    try {
      ListAnalysisFunctionsDataTypesOutputBody result = apiInstance.listAnalysisFunctionsDataTypes(analysisId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#listAnalysisFunctionsDataTypes");
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
| **offset** | **Long**| Pagination offset. Defaults to 0. | [optional] |
| **limit** | **Long**| Page size. Defaults to 100. | [optional] |

### Return type

[**ListAnalysisFunctionsDataTypesOutputBody**](ListAnalysisFunctionsDataTypesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

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

<a id="listFunctionDataTypesForAnalysis"></a>
# **listFunctionDataTypesForAnalysis**
> BaseResponseFunctionDataTypesList listFunctionDataTypesForAnalysis(analysisId, functionIds)

List Function Data Types

Returns data types for multiple functions with optional function ID filtering

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    List<Integer> functionIds = Arrays.asList(); // List<Integer> | 
    try {
      BaseResponseFunctionDataTypesList result = apiInstance.listFunctionDataTypesForAnalysis(analysisId, functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#listFunctionDataTypesForAnalysis");
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
| **functionIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |

### Return type

[**BaseResponseFunctionDataTypesList**](BaseResponseFunctionDataTypesList.md)

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

<a id="listFunctionDataTypesForFunctions"></a>
# **listFunctionDataTypesForFunctions**
> BaseResponseFunctionDataTypesList listFunctionDataTypesForFunctions(functionIds)

List Function Data Types

Returns data types for multiple function IDs

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    List<Integer> functionIds = Arrays.asList(); // List<Integer> | 
    try {
      BaseResponseFunctionDataTypesList result = apiInstance.listFunctionDataTypesForFunctions(functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#listFunctionDataTypesForFunctions");
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
| **functionIds** | [**List&lt;Integer&gt;**](Integer.md)|  | [optional] |

### Return type

[**BaseResponseFunctionDataTypesList**](BaseResponseFunctionDataTypesList.md)

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

<a id="listFunctionsDataTypes"></a>
# **listFunctionsDataTypes**
> ListFunctionsDataTypesOutputBody listFunctionsDataTypes(functionIds)

Get data types for many functions

Returns the stored data-types blob for each supplied function ID. Caller must have read access to every function or the request is rejected.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsDataTypesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDataTypesApi apiInstance = new FunctionsDataTypesApi(defaultClient);
    List<Long> functionIds = Arrays.asList(); // List<Long> | Function IDs to fetch data-types for.
    try {
      ListFunctionsDataTypesOutputBody result = apiInstance.listFunctionsDataTypes(functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#listFunctionsDataTypes");
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
| **functionIds** | [**List&lt;Long&gt;**](Long.md)| Function IDs to fetch data-types for. | |

### Return type

[**ListFunctionsDataTypesOutputBody**](ListFunctionsDataTypesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

