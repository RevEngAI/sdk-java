# FunctionsDecompilationApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDecompilationComment**](FunctionsDecompilationApi.md#createDecompilationComment) | **POST** /v2/functions/{function_id}/decompilation/comments | Create a comment for this function |
| [**deleteDecompilationComment**](FunctionsDecompilationApi.md#deleteDecompilationComment) | **DELETE** /v2/functions/{function_id}/decompilation/comments/{comment_id} | Delete a comment |
| [**getDecompilationComments**](FunctionsDecompilationApi.md#getDecompilationComments) | **GET** /v2/functions/{function_id}/decompilation/comments | Get comments for this function |
| [**updateDecompilationComment**](FunctionsDecompilationApi.md#updateDecompilationComment) | **PATCH** /v2/functions/{function_id}/decompilation/comments/{comment_id} | Update a comment |


<a id="createDecompilationComment"></a>
# **createDecompilationComment**
> BaseResponseCommentResponse createDecompilationComment(functionId, functionCommentCreateRequest)

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
import ai.reveng.api.FunctionsDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDecompilationApi apiInstance = new FunctionsDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    FunctionCommentCreateRequest functionCommentCreateRequest = new FunctionCommentCreateRequest(); // FunctionCommentCreateRequest | 
    try {
      BaseResponseCommentResponse result = apiInstance.createDecompilationComment(functionId, functionCommentCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDecompilationApi#createDecompilationComment");
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
| **400** | Bad Request |  -  |
| **422** | Invalid request parameters |  -  |

<a id="deleteDecompilationComment"></a>
# **deleteDecompilationComment**
> BaseResponseBool deleteDecompilationComment(commentId, functionId)

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
import ai.reveng.api.FunctionsDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDecompilationApi apiInstance = new FunctionsDecompilationApi(defaultClient);
    Integer commentId = 56; // Integer | 
    Integer functionId = 56; // Integer | 
    try {
      BaseResponseBool result = apiInstance.deleteDecompilationComment(commentId, functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDecompilationApi#deleteDecompilationComment");
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
| **400** | Bad Request |  -  |
| **403** | You can only delete your own comments |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getDecompilationComments"></a>
# **getDecompilationComments**
> BaseResponseListCommentResponse getDecompilationComments(functionId)

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
import ai.reveng.api.FunctionsDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDecompilationApi apiInstance = new FunctionsDecompilationApi(defaultClient);
    Integer functionId = 56; // Integer | 
    try {
      BaseResponseListCommentResponse result = apiInstance.getDecompilationComments(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDecompilationApi#getDecompilationComments");
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

<a id="updateDecompilationComment"></a>
# **updateDecompilationComment**
> BaseResponseCommentResponse updateDecompilationComment(commentId, functionId, commentUpdateRequest)

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
import ai.reveng.api.FunctionsDecompilationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FunctionsDecompilationApi apiInstance = new FunctionsDecompilationApi(defaultClient);
    Integer commentId = 56; // Integer | 
    Integer functionId = 56; // Integer | 
    CommentUpdateRequest commentUpdateRequest = new CommentUpdateRequest(); // CommentUpdateRequest | 
    try {
      BaseResponseCommentResponse result = apiInstance.updateDecompilationComment(commentId, functionId, commentUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsDecompilationApi#updateDecompilationComment");
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
| **400** | Bad Request |  -  |
| **403** | You can only update your own comments |  -  |
| **422** | Invalid request parameters |  -  |

