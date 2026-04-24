# AuthenticationUsersApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRequesterUserInfo**](AuthenticationUsersApi.md#getRequesterUserInfo) | **GET** /v2/users/me | Get the requesters user information |
| [**getUser**](AuthenticationUsersApi.md#getUser) | **GET** /v2/users/{user_id} | Get a user&#39;s public information |
| [**getUserActivity**](AuthenticationUsersApi.md#getUserActivity) | **GET** /v2/users/activity | Get auth user activity |
| [**getUserComments**](AuthenticationUsersApi.md#getUserComments) | **GET** /v2/users/me/comments | Get comments by user |
| [**submitUserFeedback**](AuthenticationUsersApi.md#submitUserFeedback) | **POST** /v2/users/feedback | Submit feedback about the application |


<a id="getRequesterUserInfo"></a>
# **getRequesterUserInfo**
> BaseResponseGetMeResponse getRequesterUserInfo()

Get the requesters user information

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AuthenticationUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AuthenticationUsersApi apiInstance = new AuthenticationUsersApi(defaultClient);
    try {
      BaseResponseGetMeResponse result = apiInstance.getRequesterUserInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationUsersApi#getRequesterUserInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BaseResponseGetMeResponse**](BaseResponseGetMeResponse.md)

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

<a id="getUser"></a>
# **getUser**
> BaseResponseGetPublicUserResponse getUser(userId)

Get a user&#39;s public information

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AuthenticationUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AuthenticationUsersApi apiInstance = new AuthenticationUsersApi(defaultClient);
    Integer userId = 56; // Integer | 
    try {
      BaseResponseGetPublicUserResponse result = apiInstance.getUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationUsersApi#getUser");
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
| **userId** | **Integer**|  | |

### Return type

[**BaseResponseGetPublicUserResponse**](BaseResponseGetPublicUserResponse.md)

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

<a id="getUserActivity"></a>
# **getUserActivity**
> BaseResponseListUserActivityResponse getUserActivity()

Get auth user activity

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AuthenticationUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AuthenticationUsersApi apiInstance = new AuthenticationUsersApi(defaultClient);
    try {
      BaseResponseListUserActivityResponse result = apiInstance.getUserActivity();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationUsersApi#getUserActivity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BaseResponseListUserActivityResponse**](BaseResponseListUserActivityResponse.md)

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

<a id="getUserComments"></a>
# **getUserComments**
> BaseResponseListCommentResponse getUserComments(endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts)

Get comments by user

Retrieves all comments created by a specific user. Only returns comments for resources the requesting user has access to.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AuthenticationUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AuthenticationUsersApi apiInstance = new AuthenticationUsersApi(defaultClient);
    String endpointUrl = "endpointUrl_example"; // String | 
    String localCacheDir = "localCacheDir_example"; // String | 
    Integer localCacheMaxSizeMb = 56; // Integer | 
    String customerSamplesBucket = "customerSamplesBucket_example"; // String | 
    String firmwareSamplesBucket = "firmwareSamplesBucket_example"; // String | 
    Integer maxRetryAttempts = 5; // Integer | 
    try {
      BaseResponseListCommentResponse result = apiInstance.getUserComments(endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationUsersApi#getUserComments");
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
| **endpointUrl** | **String**|  | [optional] |
| **localCacheDir** | **String**|  | [optional] |
| **localCacheMaxSizeMb** | **Integer**|  | [optional] |
| **customerSamplesBucket** | **String**|  | [optional] |
| **firmwareSamplesBucket** | **String**|  | [optional] |
| **maxRetryAttempts** | **Integer**|  | [optional] [default to 5] |

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

<a id="submitUserFeedback"></a>
# **submitUserFeedback**
> BaseResponse submitUserFeedback(submitUserFeedbackRequest)

Submit feedback about the application

Submits feedback about the application and forwards it to the RevEng.ai project management tool.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AuthenticationUsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AuthenticationUsersApi apiInstance = new AuthenticationUsersApi(defaultClient);
    SubmitUserFeedbackRequest submitUserFeedbackRequest = new SubmitUserFeedbackRequest(); // SubmitUserFeedbackRequest | 
    try {
      BaseResponse result = apiInstance.submitUserFeedback(submitUserFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationUsersApi#submitUserFeedback");
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
| **submitUserFeedbackRequest** | [**SubmitUserFeedbackRequest**](SubmitUserFeedbackRequest.md)|  | |

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
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

