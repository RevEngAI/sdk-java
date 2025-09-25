# FunctionsAiDecompilationApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAiDecompilationComment**](FunctionsAiDecompilationApi.md#createAiDecompilationComment) | **POST** /v2/functions/{function_id}/ai-decompilation/comments | Create a comment for this function |
| [**createAiDecompilationTask**](FunctionsAiDecompilationApi.md#createAiDecompilationTask) | **POST** /v2/functions/{function_id}/ai-decompilation | Begins AI Decompilation Process |
| [**deleteAiDecompilationComment**](FunctionsAiDecompilationApi.md#deleteAiDecompilationComment) | **DELETE** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Delete a comment |
| [**getAiDecompilationComments**](FunctionsAiDecompilationApi.md#getAiDecompilationComments) | **GET** /v2/functions/{function_id}/ai-decompilation/comments | Get comments for this function |
| [**getAiDecompilationRating**](FunctionsAiDecompilationApi.md#getAiDecompilationRating) | **GET** /v2/functions/{function_id}/ai-decompilation/rating | Get rating for AI decompilation |
| [**getAiDecompilationTaskResult**](FunctionsAiDecompilationApi.md#getAiDecompilationTaskResult) | **GET** /v2/functions/{function_id}/ai-decompilation | Polls AI Decompilation Process |
| [**getAiDecompilationTaskStatus**](FunctionsAiDecompilationApi.md#getAiDecompilationTaskStatus) | **GET** /v2/functions/{function_id}/ai-decompilation/status | Check the status of a function ai decompilation |
| [**updateAiDecompilationComment**](FunctionsAiDecompilationApi.md#updateAiDecompilationComment) | **PATCH** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Update a comment |
| [**upsertAiDecompilationRating**](FunctionsAiDecompilationApi.md#upsertAiDecompilationRating) | **PATCH** /v2/functions/{function_id}/ai-decompilation/rating | Upsert rating for AI decompilation |


<a id="createAiDecompilationComment"></a>
# **createAiDecompilationComment**
> BaseResponseCommentResponse createAiDecompilationComment(functionId, functionCommentCreateRequest, authorization)

Create a comment for this function

Creates a comment associated with a specified function).

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    FunctionCommentCreateRequest functionCommentCreateRequest = new FunctionCommentCreateRequest(); // FunctionCommentCreateRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCommentResponse result = apiInstance.createAiDecompilationComment(functionId, functionCommentCreateRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#createAiDecompilationComment");
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
| **functionCommentCreateRequest** | [**FunctionCommentCreateRequest**](FunctionCommentCreateRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseCommentResponse**](BaseResponseCommentResponse.md)

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
| **400** | Bad Request |  -  |

<a id="createAiDecompilationTask"></a>
# **createAiDecompilationTask**
> BaseResponse createAiDecompilationTask(functionId, authorization)

Begins AI Decompilation Process

Begins the AI Decompilation Process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponse result = apiInstance.createAiDecompilationTask(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#createAiDecompilationTask");
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

[**BaseResponse**](BaseResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **403** | Forbidden |  -  |
| **402** | Payment Required |  -  |
| **409** | Conflict |  -  |
| **400** | Bad Request |  -  |

<a id="deleteAiDecompilationComment"></a>
# **deleteAiDecompilationComment**
> BaseResponseBool deleteAiDecompilationComment(commentId, functionId, authorization)

Delete a comment

Deletes an existing comment. Users can only delete their own comments.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer commentId = 56; // Integer | 
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseBool result = apiInstance.deleteAiDecompilationComment(commentId, functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#deleteAiDecompilationComment");
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
| **commentId** | **Integer**|  | |
| **functionId** | **Integer**|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseBool**](BaseResponseBool.md)

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
| **403** | You can only delete your own comments |  -  |
| **400** | Bad Request |  -  |

<a id="getAiDecompilationComments"></a>
# **getAiDecompilationComments**
> BaseResponseListCommentResponse getAiDecompilationComments(functionId, authorization)

Get comments for this function

Retrieves all comments created for a specific function. Only returns comments for resources the requesting user has access to.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListCommentResponse result = apiInstance.getAiDecompilationComments(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationComments");
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

[**BaseResponseListCommentResponse**](BaseResponseListCommentResponse.md)

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

<a id="getAiDecompilationRating"></a>
# **getAiDecompilationRating**
> BaseResponseGetAiDecompilationRatingResponse getAiDecompilationRating(functionId, authorization)

Get rating for AI decompilation

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseGetAiDecompilationRatingResponse result = apiInstance.getAiDecompilationRating(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationRating");
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

[**BaseResponseGetAiDecompilationRatingResponse**](BaseResponseGetAiDecompilationRatingResponse.md)

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

<a id="getAiDecompilationTaskResult"></a>
# **getAiDecompilationTaskResult**
> BaseResponseGetAiDecompilationTask getAiDecompilationTaskResult(functionId, summarise, generateInlineComments, authorization)

Polls AI Decompilation Process

Polls the AI Decompilation Process

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    Boolean summarise = true; // Boolean | Generate a summary for the decompilation
    Boolean generateInlineComments = true; // Boolean | Generate inline comments for the decompilation (only works if summarise is enabled)
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseGetAiDecompilationTask result = apiInstance.getAiDecompilationTaskResult(functionId, summarise, generateInlineComments, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationTaskResult");
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
| **summarise** | **Boolean**| Generate a summary for the decompilation | [optional] [default to true] |
| **generateInlineComments** | **Boolean**| Generate inline comments for the decompilation (only works if summarise is enabled) | [optional] [default to true] |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseGetAiDecompilationTask**](BaseResponseGetAiDecompilationTask.md)

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
| **403** | Forbidden |  -  |

<a id="getAiDecompilationTaskStatus"></a>
# **getAiDecompilationTaskStatus**
> BaseResponseFunctionTaskResponse getAiDecompilationTaskStatus(functionId, authorization)

Check the status of a function ai decompilation

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseFunctionTaskResponse result = apiInstance.getAiDecompilationTaskStatus(functionId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationTaskStatus");
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

[**BaseResponseFunctionTaskResponse**](BaseResponseFunctionTaskResponse.md)

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

<a id="updateAiDecompilationComment"></a>
# **updateAiDecompilationComment**
> BaseResponseCommentResponse updateAiDecompilationComment(commentId, functionId, commentUpdateRequest, authorization)

Update a comment

Updates the content of an existing comment. Users can only update their own comments.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer commentId = 56; // Integer | 
    Integer functionId = 56; // Integer | 
    CommentUpdateRequest commentUpdateRequest = new CommentUpdateRequest(); // CommentUpdateRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCommentResponse result = apiInstance.updateAiDecompilationComment(commentId, functionId, commentUpdateRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#updateAiDecompilationComment");
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
| **commentId** | **Integer**|  | |
| **functionId** | **Integer**|  | |
| **commentUpdateRequest** | [**CommentUpdateRequest**](CommentUpdateRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseCommentResponse**](BaseResponseCommentResponse.md)

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
| **403** | You can only update your own comments |  -  |
| **400** | Bad Request |  -  |

<a id="upsertAiDecompilationRating"></a>
# **upsertAiDecompilationRating**
> BaseResponse upsertAiDecompilationRating(functionId, upsertAiDecomplationRatingRequest, authorization)

Upsert rating for AI decompilation

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsAiDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsAiDecompilationApi apiInstance = new FunctionsAiDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    UpsertAiDecomplationRatingRequest upsertAiDecomplationRatingRequest = new UpsertAiDecomplationRatingRequest(); // UpsertAiDecomplationRatingRequest | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponse result = apiInstance.upsertAiDecompilationRating(functionId, upsertAiDecomplationRatingRequest, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#upsertAiDecompilationRating");
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
| **upsertAiDecomplationRatingRequest** | [**UpsertAiDecomplationRatingRequest**](UpsertAiDecomplationRatingRequest.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponse**](BaseResponse.md)

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

