# FunctionsDataTypesApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateFunctionDataTypesForAnalysis**](FunctionsDataTypesApi.md#generateFunctionDataTypesForAnalysis) | **POST** /v2/analyses/{analysis_id}/functions/data_types | Generate Function Data Types |
| [**generateFunctionDataTypesForFunctions**](FunctionsDataTypesApi.md#generateFunctionDataTypesForFunctions) | **POST** /v2/functions/data_types | Generate Function Data Types for an arbitrary list of functions |
| [**getFunctionDataTypes**](FunctionsDataTypesApi.md#getFunctionDataTypes) | **GET** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Get Function Data Types |
| [**listFunctionDataTypesForAnalysis**](FunctionsDataTypesApi.md#listFunctionDataTypesForAnalysis) | **GET** /v2/analyses/{analysis_id}/functions/data_types | List Function Data Types |
| [**listFunctionDataTypesForFunctions**](FunctionsDataTypesApi.md#listFunctionDataTypesForFunctions) | **GET** /v2/functions/data_types | List Function Data Types |
| [**updateFunctionDataTypes**](FunctionsDataTypesApi.md#updateFunctionDataTypes) | **PUT** /v2/analyses/{analysis_id}/functions/{function_id}/data_types | Update Function Data Types |


<a id="generateFunctionDataTypesForAnalysis"></a>
# **generateFunctionDataTypesForAnalysis**
> BaseResponseGenerateFunctionDataTypes generateFunctionDataTypesForAnalysis(analysisId, functionDataTypesParams, apiKey)

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
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseGenerateFunctionDataTypes result = apiInstance.generateFunctionDataTypesForAnalysis(analysisId, functionDataTypesParams, apiKey);
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
| **apiKey** | **String**|  | [optional] |

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
> BaseResponseGenerationStatusList generateFunctionDataTypesForFunctions(functionDataTypesParams, apiKey)

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
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseGenerationStatusList result = apiInstance.generateFunctionDataTypesForFunctions(functionDataTypesParams, apiKey);
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
| **apiKey** | **String**|  | [optional] |

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
> BaseResponseFunctionDataTypes getFunctionDataTypes(analysisId, functionId, apiKey)

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
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseFunctionDataTypes result = apiInstance.getFunctionDataTypes(analysisId, functionId, apiKey);
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
| **apiKey** | **String**|  | [optional] |

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

<a id="listFunctionDataTypesForAnalysis"></a>
# **listFunctionDataTypesForAnalysis**
> BaseResponseFunctionDataTypesList listFunctionDataTypesForAnalysis(analysisId, functionIds, apiKey)

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
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseFunctionDataTypesList result = apiInstance.listFunctionDataTypesForAnalysis(analysisId, functionIds, apiKey);
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
| **apiKey** | **String**|  | [optional] |

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
> BaseResponseFunctionDataTypesList listFunctionDataTypesForFunctions(functionIds, apiKey)

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
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseFunctionDataTypesList result = apiInstance.listFunctionDataTypesForFunctions(functionIds, apiKey);
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
| **apiKey** | **String**|  | [optional] |

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

<a id="updateFunctionDataTypes"></a>
# **updateFunctionDataTypes**
> BaseResponseFunctionDataTypes updateFunctionDataTypes(analysisId, functionId, updateFunctionDataTypes, apiKey)

Update Function Data Types

Updates the function data types for a given function

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
    UpdateFunctionDataTypes updateFunctionDataTypes = new UpdateFunctionDataTypes(); // UpdateFunctionDataTypes | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseFunctionDataTypes result = apiInstance.updateFunctionDataTypes(analysisId, functionId, updateFunctionDataTypes, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDataTypesApi#updateFunctionDataTypes");
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
| **updateFunctionDataTypes** | [**UpdateFunctionDataTypes**](UpdateFunctionDataTypes.md)|  | |
| **apiKey** | **String**|  | [optional] |

### Return type

[**BaseResponseFunctionDataTypes**](BaseResponseFunctionDataTypes.md)

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

