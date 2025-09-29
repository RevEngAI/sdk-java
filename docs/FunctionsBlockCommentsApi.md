# FunctionsBlockCommentsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**generateBlockCommentsForBlockInFunction**](FunctionsBlockCommentsApi.md#generateBlockCommentsForBlockInFunction) | **POST** /v2/functions/{function_id}/block-comments/single | Generate block comments for a specific block in a function |
| [**generateBlockCommentsForFunction**](FunctionsBlockCommentsApi.md#generateBlockCommentsForFunction) | **POST** /v2/functions/{function_id}/block-comments | Generate block comments for a function |
| [**generateOverviewCommentForFunction**](FunctionsBlockCommentsApi.md#generateOverviewCommentForFunction) | **POST** /v2/functions/{function_id}/block-comments/overview | Generate overview comment for a function |


<a id="generateBlockCommentsForBlockInFunction"></a>
# **generateBlockCommentsForBlockInFunction**
> BaseResponseBlockCommentsGenerationForFunctionResponse generateBlockCommentsForBlockInFunction(functionId, block)

Generate block comments for a specific block in a function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsBlockCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsBlockCommentsApi apiInstance = new FunctionsBlockCommentsApi(defaultClient);
    Integer functionId = 56; // Integer | 
    Block block = new Block(); // Block | 
    try {
      BaseResponseBlockCommentsGenerationForFunctionResponse result = apiInstance.generateBlockCommentsForBlockInFunction(functionId, block);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsBlockCommentsApi#generateBlockCommentsForBlockInFunction");
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
| **block** | [**Block**](Block.md)|  | |

### Return type

[**BaseResponseBlockCommentsGenerationForFunctionResponse**](BaseResponseBlockCommentsGenerationForFunctionResponse.md)

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

<a id="generateBlockCommentsForFunction"></a>
# **generateBlockCommentsForFunction**
> BaseResponseBlockCommentsGenerationForFunctionResponse generateBlockCommentsForFunction(functionId)

Generate block comments for a function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsBlockCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsBlockCommentsApi apiInstance = new FunctionsBlockCommentsApi(defaultClient);
    Integer functionId = 56; // Integer | 
    try {
      BaseResponseBlockCommentsGenerationForFunctionResponse result = apiInstance.generateBlockCommentsForFunction(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsBlockCommentsApi#generateBlockCommentsForFunction");
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

[**BaseResponseBlockCommentsGenerationForFunctionResponse**](BaseResponseBlockCommentsGenerationForFunctionResponse.md)

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

<a id="generateOverviewCommentForFunction"></a>
# **generateOverviewCommentForFunction**
> BaseResponseBlockCommentsOverviewGenerationResponse generateOverviewCommentForFunction(functionId)

Generate overview comment for a function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsBlockCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsBlockCommentsApi apiInstance = new FunctionsBlockCommentsApi(defaultClient);
    Integer functionId = 56; // Integer | 
    try {
      BaseResponseBlockCommentsOverviewGenerationResponse result = apiInstance.generateOverviewCommentForFunction(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsBlockCommentsApi#generateOverviewCommentForFunction");
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

[**BaseResponseBlockCommentsOverviewGenerationResponse**](BaseResponseBlockCommentsOverviewGenerationResponse.md)

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

