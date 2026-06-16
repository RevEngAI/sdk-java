# FunctionsAiDecompilationApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAiDecompilation**](FunctionsAiDecompilationApi.md#createAiDecompilation) | **POST** /v3/functions/{function_id}/ai-decompilation | Start AI decompilation |
| [**createAiDecompilationComment**](FunctionsAiDecompilationApi.md#createAiDecompilationComment) | **POST** /v2/functions/{function_id}/ai-decompilation/comments | Create a comment for this function |
| [**createAiDecompilationTask**](FunctionsAiDecompilationApi.md#createAiDecompilationTask) | **POST** /v2/functions/{function_id}/ai-decompilation | Begins AI Decompilation Process |
| [**deleteAiDecompilationComment**](FunctionsAiDecompilationApi.md#deleteAiDecompilationComment) | **DELETE** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Delete a comment |
| [**deleteAiDecompilationInlineComment**](FunctionsAiDecompilationApi.md#deleteAiDecompilationInlineComment) | **DELETE** /v3/functions/{function_id}/ai-decompilation/inline-comments/{line} | Delete a single inline comment |
| [**getAiDecompilation**](FunctionsAiDecompilationApi.md#getAiDecompilation) | **GET** /v3/functions/{function_id}/ai-decompilation | Get AI decompilation result |
| [**getAiDecompilationComments**](FunctionsAiDecompilationApi.md#getAiDecompilationComments) | **GET** /v2/functions/{function_id}/ai-decompilation/comments | Get comments for this function |
| [**getAiDecompilationInlineComments**](FunctionsAiDecompilationApi.md#getAiDecompilationInlineComments) | **GET** /v3/functions/{function_id}/ai-decompilation/inline-comments | Get AI decompilation inline comments |
| [**getAiDecompilationInlineCommentsStatus**](FunctionsAiDecompilationApi.md#getAiDecompilationInlineCommentsStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/inline-comments/status | Get inline comments generation workflow status |
| [**getAiDecompilationRating**](FunctionsAiDecompilationApi.md#getAiDecompilationRating) | **GET** /v2/functions/{function_id}/ai-decompilation/rating | Get rating for AI decompilation |
| [**getAiDecompilationStatus**](FunctionsAiDecompilationApi.md#getAiDecompilationStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/status | Get AI decompilation workflow status |
| [**getAiDecompilationSummary**](FunctionsAiDecompilationApi.md#getAiDecompilationSummary) | **GET** /v3/functions/{function_id}/ai-decompilation/summary | Get AI decompilation summary |
| [**getAiDecompilationSummaryStatus**](FunctionsAiDecompilationApi.md#getAiDecompilationSummaryStatus) | **GET** /v3/functions/{function_id}/ai-decompilation/summary/status | Get summary generation workflow status |
| [**getAiDecompilationTaskResult**](FunctionsAiDecompilationApi.md#getAiDecompilationTaskResult) | **GET** /v2/functions/{function_id}/ai-decompilation | Polls AI Decompilation Process |
| [**getAiDecompilationTaskStatus**](FunctionsAiDecompilationApi.md#getAiDecompilationTaskStatus) | **GET** /v2/functions/{function_id}/ai-decompilation/status | Check the status of a function ai decompilation |
| [**getAiDecompilationTokenised**](FunctionsAiDecompilationApi.md#getAiDecompilationTokenised) | **GET** /v3/functions/{function_id}/ai-decompilation/tokenised | Get tokenised AI decompilation with function mapping |
| [**patchAiDecompilationInlineComment**](FunctionsAiDecompilationApi.md#patchAiDecompilationInlineComment) | **PATCH** /v3/functions/{function_id}/ai-decompilation/inline-comments | Update a single inline comment |
| [**regenerateAiDecompilationInlineComments**](FunctionsAiDecompilationApi.md#regenerateAiDecompilationInlineComments) | **POST** /v3/functions/{function_id}/ai-decompilation/inline-comments | Regenerate AI decompilation inline comments |
| [**regenerateAiDecompilationSummary**](FunctionsAiDecompilationApi.md#regenerateAiDecompilationSummary) | **POST** /v3/functions/{function_id}/ai-decompilation/summary | Regenerate AI decompilation summary |
| [**streamAiDecompilation**](FunctionsAiDecompilationApi.md#streamAiDecompilation) | **GET** /v3/functions/{function_id}/ai-decompilation/events | Stream live AI decompilation output (SSE) |
| [**updateAiDecompilationComment**](FunctionsAiDecompilationApi.md#updateAiDecompilationComment) | **PATCH** /v2/functions/{function_id}/ai-decompilation/comments/{comment_id} | Update a comment |
| [**upsertAiDecompilationOverrides**](FunctionsAiDecompilationApi.md#upsertAiDecompilationOverrides) | **PATCH** /v3/functions/{function_id}/ai-decompilation/overrides | Upsert variable/function name overrides |
| [**upsertAiDecompilationRating**](FunctionsAiDecompilationApi.md#upsertAiDecompilationRating) | **PATCH** /v2/functions/{function_id}/ai-decompilation/rating | Upsert rating for AI decompilation |


<a id="createAiDecompilation"></a>
# **createAiDecompilation**
> CreateAIDecompOutputBody createAiDecompilation(functionId, contextAware, temperature)

Start AI decompilation

Begins the AI decompilation process for a function. Charges team credits and starts the workflow.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits

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
    Long functionId = 56L; // Long | Function ID
    Boolean contextAware = false; // Boolean | Use context-aware decompilation
    Double temperature = -1D; // Double | LLM temperature (0.0-1.0). Overrides the server default when set. Omit or set to -1 to use the server default.
    try {
      CreateAIDecompOutputBody result = apiInstance.createAiDecompilation(functionId, contextAware, temperature);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#createAiDecompilation");
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
| **functionId** | **Long**| Function ID | |
| **contextAware** | **Boolean**| Use context-aware decompilation | [optional] [default to false] |
| **temperature** | **Double**| LLM temperature (0.0-1.0). Overrides the server default when set. Omit or set to -1 to use the server default. | [optional] [default to -1] |

### Return type

[**CreateAIDecompOutputBody**](CreateAIDecompOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="createAiDecompilationComment"></a>
# **createAiDecompilationComment**
> BaseResponseCommentResponse createAiDecompilationComment(functionId, functionCommentCreateRequest)

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
    try {
      BaseResponseCommentResponse result = apiInstance.createAiDecompilationComment(functionId, functionCommentCreateRequest);
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
> BaseResponse createAiDecompilationTask(functionId)

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
    Long functionId = 56L; // Long | The ID of the function for which we are creating the decompilation task
    try {
      BaseResponse result = apiInstance.createAiDecompilationTask(functionId);
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
| **functionId** | **Long**| The ID of the function for which we are creating the decompilation task | |

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
> BaseResponseBool deleteAiDecompilationComment(commentId, functionId)

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
    try {
      BaseResponseBool result = apiInstance.deleteAiDecompilationComment(commentId, functionId);
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

<a id="deleteAiDecompilationInlineComment"></a>
# **deleteAiDecompilationInlineComment**
> CommentsData deleteAiDecompilationInlineComment(functionId, line)

Delete a single inline comment

Removes the comment for the given line number. Requires comments to have been generated first.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    Long line = 56L; // Long | Line number of the comment to delete
    try {
      CommentsData result = apiInstance.deleteAiDecompilationInlineComment(functionId, line);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#deleteAiDecompilationInlineComment");
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
| **functionId** | **Long**| Function ID | |
| **line** | **Long**| Line number of the comment to delete | |

### Return type

[**CommentsData**](CommentsData.md)

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

<a id="getAiDecompilation"></a>
# **getAiDecompilation**
> DecompilationData getAiDecompilation(functionId)

Get AI decompilation result

Returns the decompilation source code.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;500&#x60; [&#x60;INTERNAL_ERROR&#x60;](/errors/INTERNAL_ERROR) — Internal Server Error

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
    Long functionId = 56L; // Long | Function ID
    try {
      DecompilationData result = apiInstance.getAiDecompilation(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilation");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**DecompilationData**](DecompilationData.md)

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

<a id="getAiDecompilationComments"></a>
# **getAiDecompilationComments**
> BaseResponseListCommentResponse getAiDecompilationComments(functionId)

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
    try {
      BaseResponseListCommentResponse result = apiInstance.getAiDecompilationComments(functionId);
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

<a id="getAiDecompilationInlineComments"></a>
# **getAiDecompilationInlineComments**
> CommentsData getAiDecompilationInlineComments(functionId)

Get AI decompilation inline comments

Returns the commented source if available. Returns pending status if comments are still being generated.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      CommentsData result = apiInstance.getAiDecompilationInlineComments(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationInlineComments");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**CommentsData**](CommentsData.md)

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

<a id="getAiDecompilationInlineCommentsStatus"></a>
# **getAiDecompilationInlineCommentsStatus**
> WorkflowProgress getAiDecompilationInlineCommentsStatus(functionId)

Get inline comments generation workflow status

Returns fine-grained progress of the inline comments generation workflow.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      WorkflowProgress result = apiInstance.getAiDecompilationInlineCommentsStatus(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationInlineCommentsStatus");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**WorkflowProgress**](WorkflowProgress.md)

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

<a id="getAiDecompilationRating"></a>
# **getAiDecompilationRating**
> BaseResponseUnionGetAiDecompilationRatingResponseNoneType getAiDecompilationRating(functionId)

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
    Long functionId = 56L; // Long | The ID of the function for which to get the rating
    try {
      BaseResponseUnionGetAiDecompilationRatingResponseNoneType result = apiInstance.getAiDecompilationRating(functionId);
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
| **functionId** | **Long**| The ID of the function for which to get the rating | |

### Return type

[**BaseResponseUnionGetAiDecompilationRatingResponseNoneType**](BaseResponseUnionGetAiDecompilationRatingResponseNoneType.md)

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

<a id="getAiDecompilationStatus"></a>
# **getAiDecompilationStatus**
> WorkflowProgress getAiDecompilationStatus(functionId)

Get AI decompilation workflow status

Returns fine-grained progress of the running workflow including current step, total steps, and messages. Falls back to the database task status when no workflow is running.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      WorkflowProgress result = apiInstance.getAiDecompilationStatus(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationStatus");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**WorkflowProgress**](WorkflowProgress.md)

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

<a id="getAiDecompilationSummary"></a>
# **getAiDecompilationSummary**
> SummaryData getAiDecompilationSummary(functionId)

Get AI decompilation summary

Returns the summary if available. Returns pending status if summary is still being generated.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      SummaryData result = apiInstance.getAiDecompilationSummary(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationSummary");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**SummaryData**](SummaryData.md)

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

<a id="getAiDecompilationSummaryStatus"></a>
# **getAiDecompilationSummaryStatus**
> WorkflowProgress getAiDecompilationSummaryStatus(functionId)

Get summary generation workflow status

Returns fine-grained progress of the summary generation workflow.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      WorkflowProgress result = apiInstance.getAiDecompilationSummaryStatus(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationSummaryStatus");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**WorkflowProgress**](WorkflowProgress.md)

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

<a id="getAiDecompilationTaskResult"></a>
# **getAiDecompilationTaskResult**
> BaseResponseGetAiDecompilationTask getAiDecompilationTaskResult(functionId, summarise, generateInlineComments, forceRegenerate)

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
    Long functionId = 56L; // Long | The ID of the function being decompiled
    Boolean summarise = true; // Boolean | Generate a summary for the decompilation
    Boolean generateInlineComments = true; // Boolean | Generate inline comments for the decompilation
    List<RegenerateTarget> forceRegenerate = Arrays.asList(); // List<RegenerateTarget> | Force regeneration of summary and/or comments.
    try {
      BaseResponseGetAiDecompilationTask result = apiInstance.getAiDecompilationTaskResult(functionId, summarise, generateInlineComments, forceRegenerate);
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
| **functionId** | **Long**| The ID of the function being decompiled | |
| **summarise** | **Boolean**| Generate a summary for the decompilation | [optional] [default to true] |
| **generateInlineComments** | **Boolean**| Generate inline comments for the decompilation | [optional] [default to true] |
| **forceRegenerate** | [**List&lt;RegenerateTarget&gt;**](RegenerateTarget.md)| Force regeneration of summary and/or comments. | [optional] |

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
> BaseResponseFunctionTaskResponse getAiDecompilationTaskStatus(functionId)

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
    Long functionId = 56L; // Long | The ID of the function being checked
    try {
      BaseResponseFunctionTaskResponse result = apiInstance.getAiDecompilationTaskStatus(functionId);
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
| **functionId** | **Long**| The ID of the function being checked | |

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

<a id="getAiDecompilationTokenised"></a>
# **getAiDecompilationTokenised**
> TokenisedData getAiDecompilationTokenised(functionId)

Get tokenised AI decompilation with function mapping

Returns the decompilation with placeholder tokens, the function mapping for token resolution, and the predicted function name.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;500&#x60; [&#x60;INTERNAL_ERROR&#x60;](/errors/INTERNAL_ERROR) — Internal Server Error

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
    Long functionId = 56L; // Long | Function ID
    try {
      TokenisedData result = apiInstance.getAiDecompilationTokenised(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#getAiDecompilationTokenised");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**TokenisedData**](TokenisedData.md)

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

<a id="patchAiDecompilationInlineComment"></a>
# **patchAiDecompilationInlineComment**
> CommentsData patchAiDecompilationInlineComment(functionId, patchCommentBody)

Update a single inline comment

Merges a single line comment into the existing AI-generated inline comments. Requires comments to have been generated first.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    PatchCommentBody patchCommentBody = new PatchCommentBody(); // PatchCommentBody | 
    try {
      CommentsData result = apiInstance.patchAiDecompilationInlineComment(functionId, patchCommentBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#patchAiDecompilationInlineComment");
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
| **functionId** | **Long**| Function ID | |
| **patchCommentBody** | [**PatchCommentBody**](PatchCommentBody.md)|  | |

### Return type

[**CommentsData**](CommentsData.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="regenerateAiDecompilationInlineComments"></a>
# **regenerateAiDecompilationInlineComments**
> RegenerateOutputBody regenerateAiDecompilationInlineComments(functionId)

Regenerate AI decompilation inline comments

Starts a new inline comments generation workflow for the function. Requires an existing decompilation with a summary.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      RegenerateOutputBody result = apiInstance.regenerateAiDecompilationInlineComments(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#regenerateAiDecompilationInlineComments");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**RegenerateOutputBody**](RegenerateOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="regenerateAiDecompilationSummary"></a>
# **regenerateAiDecompilationSummary**
> RegenerateOutputBody regenerateAiDecompilationSummary(functionId)

Regenerate AI decompilation summary

Starts a new summary generation workflow for the function. Requires an existing decompilation.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long functionId = 56L; // Long | Function ID
    try {
      RegenerateOutputBody result = apiInstance.regenerateAiDecompilationSummary(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#regenerateAiDecompilationSummary");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**RegenerateOutputBody**](RegenerateOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="streamAiDecompilation"></a>
# **streamAiDecompilation**
> List&lt;ServerSentEventsInner1&gt; streamAiDecompilation(functionId)

Stream live AI decompilation output (SSE)

Opens a Server-Sent Events stream of incremental decompilation events for the given function. Each event has a &#x60;type&#x60; discriminator (also used as the SSE &#x60;event:&#x60; line) and a per-attempt monotonic &#x60;seq&#x60;. Terminal events: &#x60;decomp_finished&#x60; (success) or &#x60;decomp_failed&#x60; (all retries exhausted). &#x60;attempt_failed&#x60; is per-attempt and non-terminal — Temporal may retry the activity. Clients should treat &#x60;attempt&#x60; changes as a reset signal. &#x60;last_event_id&#x60; is not supported — clients fall back to polling the standard GET endpoint after the stream ends.

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
    Long functionId = 56L; // Long | Function ID
    try {
      List<ServerSentEventsInner1> result = apiInstance.streamAiDecompilation(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#streamAiDecompilation");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**List&lt;ServerSentEventsInner1&gt;**](ServerSentEventsInner1.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/event-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error |  -  |

<a id="updateAiDecompilationComment"></a>
# **updateAiDecompilationComment**
> BaseResponseCommentResponse updateAiDecompilationComment(commentId, functionId, commentUpdateRequest)

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
    try {
      BaseResponseCommentResponse result = apiInstance.updateAiDecompilationComment(commentId, functionId, commentUpdateRequest);
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

<a id="upsertAiDecompilationOverrides"></a>
# **upsertAiDecompilationOverrides**
> UpsertOverridesData upsertAiDecompilationOverrides(functionId, upsertOverridesInputBody)

Upsert variable/function name overrides

Applies user-provided name overrides to placeholder tokens in the decompilation.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

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
    Long functionId = 56L; // Long | Function ID
    UpsertOverridesInputBody upsertOverridesInputBody = new UpsertOverridesInputBody(); // UpsertOverridesInputBody | 
    try {
      UpsertOverridesData result = apiInstance.upsertAiDecompilationOverrides(functionId, upsertOverridesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsAiDecompilationApi#upsertAiDecompilationOverrides");
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
| **functionId** | **Long**| Function ID | |
| **upsertOverridesInputBody** | [**UpsertOverridesInputBody**](UpsertOverridesInputBody.md)|  | |

### Return type

[**UpsertOverridesData**](UpsertOverridesData.md)

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

<a id="upsertAiDecompilationRating"></a>
# **upsertAiDecompilationRating**
> BaseResponse upsertAiDecompilationRating(functionId, upsertAiDecomplationRatingRequest)

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
    Long functionId = 56L; // Long | The ID of the function being rated
    UpsertAiDecomplationRatingRequest upsertAiDecomplationRatingRequest = new UpsertAiDecomplationRatingRequest(); // UpsertAiDecomplationRatingRequest | 
    try {
      BaseResponse result = apiInstance.upsertAiDecompilationRating(functionId, upsertAiDecomplationRatingRequest);
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
| **functionId** | **Long**| The ID of the function being rated | |
| **upsertAiDecomplationRatingRequest** | [**UpsertAiDecomplationRatingRequest**](UpsertAiDecomplationRatingRequest.md)|  | |

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

