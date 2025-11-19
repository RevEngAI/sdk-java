# AnalysesCommentsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAnalysisComment**](AnalysesCommentsApi.md#createAnalysisComment) | **POST** /v2/analyses/{analysis_id}/comments | Create a comment for this analysis |
| [**deleteAnalysisComment**](AnalysesCommentsApi.md#deleteAnalysisComment) | **DELETE** /v2/analyses/{analysis_id}/comments/{comment_id} | Delete a comment |
| [**getAnalysisComments**](AnalysesCommentsApi.md#getAnalysisComments) | **GET** /v2/analyses/{analysis_id}/comments | Get comments for this analysis |
| [**updateAnalysisComment**](AnalysesCommentsApi.md#updateAnalysisComment) | **PATCH** /v2/analyses/{analysis_id}/comments/{comment_id} | Update a comment |


<a id="createAnalysisComment"></a>
# **createAnalysisComment**
> BaseResponseCommentResponse createAnalysisComment(analysisId, commentBase, apiKey)

Create a comment for this analysis

Creates a comment associated with a specified analysis).

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCommentsApi apiInstance = new AnalysesCommentsApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    CommentBase commentBase = new CommentBase(); // CommentBase | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseCommentResponse result = apiInstance.createAnalysisComment(analysisId, commentBase, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCommentsApi#createAnalysisComment");
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
| **commentBase** | [**CommentBase**](CommentBase.md)|  | |
| **apiKey** | **String**|  | [optional] |

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

<a id="deleteAnalysisComment"></a>
# **deleteAnalysisComment**
> BaseResponseBool deleteAnalysisComment(commentId, analysisId, apiKey)

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
import ai.reveng.api.AnalysesCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCommentsApi apiInstance = new AnalysesCommentsApi(defaultClient);
    Integer commentId = 56; // Integer | 
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseBool result = apiInstance.deleteAnalysisComment(commentId, analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCommentsApi#deleteAnalysisComment");
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
| **analysisId** | **Integer**|  | |
| **apiKey** | **String**|  | [optional] |

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

<a id="getAnalysisComments"></a>
# **getAnalysisComments**
> BaseResponseListCommentResponse getAnalysisComments(analysisId, apiKey)

Get comments for this analysis

Retrieves all comments created for a specific analysis. Only returns comments for resources the requesting user has access to.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCommentsApi apiInstance = new AnalysesCommentsApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseListCommentResponse result = apiInstance.getAnalysisComments(analysisId, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCommentsApi#getAnalysisComments");
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

<a id="updateAnalysisComment"></a>
# **updateAnalysisComment**
> BaseResponseCommentResponse updateAnalysisComment(commentId, analysisId, commentUpdateRequest, apiKey)

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
import ai.reveng.api.AnalysesCommentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCommentsApi apiInstance = new AnalysesCommentsApi(defaultClient);
    Integer commentId = 56; // Integer | 
    Integer analysisId = 56; // Integer | 
    CommentUpdateRequest commentUpdateRequest = new CommentUpdateRequest(); // CommentUpdateRequest | 
    String apiKey = "apiKey_example"; // String | 
    try {
      BaseResponseCommentResponse result = apiInstance.updateAnalysisComment(commentId, analysisId, commentUpdateRequest, apiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCommentsApi#updateAnalysisComment");
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
| **analysisId** | **Integer**|  | |
| **commentUpdateRequest** | [**CommentUpdateRequest**](CommentUpdateRequest.md)|  | |
| **apiKey** | **String**|  | [optional] |

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

