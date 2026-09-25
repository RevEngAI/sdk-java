# AnalysesBulkActionsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkAddAnalysisTags**](AnalysesBulkActionsApi.md#bulkAddAnalysisTags) | **PATCH** /v2/analyses/tags/add | Bulk Add Analysis Tags |
| [**bulkDeleteAnalyses**](AnalysesBulkActionsApi.md#bulkDeleteAnalyses) | **PATCH** /v2/analyses/delete | Bulk Delete Analyses |
| [**v3BatchAddAnalysisTags**](AnalysesBulkActionsApi.md#v3BatchAddAnalysisTags) | **POST** /v3/analyses:batchAddTags | Add tags to multiple analyses. |
| [**v3BatchDeleteAnalyses**](AnalysesBulkActionsApi.md#v3BatchDeleteAnalyses) | **POST** /v3/analyses:batchDelete | Delete multiple analyses. |


<a id="bulkAddAnalysisTags"></a>
# **bulkAddAnalysisTags**
> BaseResponseAnalysisBulkAddTagsResponse bulkAddAnalysisTags(analysisBulkAddTagsRequest)

Bulk Add Analysis Tags

Updates analysis tags for multiple analyses. User must be the owner.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesBulkActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysesBulkActionsApi apiInstance = new AnalysesBulkActionsApi(defaultClient);
    AnalysisBulkAddTagsRequest analysisBulkAddTagsRequest = new AnalysisBulkAddTagsRequest(); // AnalysisBulkAddTagsRequest | 
    try {
      BaseResponseAnalysisBulkAddTagsResponse result = apiInstance.bulkAddAnalysisTags(analysisBulkAddTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesBulkActionsApi#bulkAddAnalysisTags");
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
| **analysisBulkAddTagsRequest** | [**AnalysisBulkAddTagsRequest**](AnalysisBulkAddTagsRequest.md)|  | |

### Return type

[**BaseResponseAnalysisBulkAddTagsResponse**](BaseResponseAnalysisBulkAddTagsResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="bulkDeleteAnalyses"></a>
# **bulkDeleteAnalyses**
> BaseResponseDict bulkDeleteAnalyses(bulkDeleteAnalysesRequest)

Bulk Delete Analyses

Deletes multiple analyses. User must be the owner of all analyses.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesBulkActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysesBulkActionsApi apiInstance = new AnalysesBulkActionsApi(defaultClient);
    BulkDeleteAnalysesRequest bulkDeleteAnalysesRequest = new BulkDeleteAnalysesRequest(); // BulkDeleteAnalysesRequest | 
    try {
      BaseResponseDict result = apiInstance.bulkDeleteAnalyses(bulkDeleteAnalysesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesBulkActionsApi#bulkDeleteAnalyses");
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
| **bulkDeleteAnalysesRequest** | [**BulkDeleteAnalysesRequest**](BulkDeleteAnalysesRequest.md)|  | |

### Return type

[**BaseResponseDict**](BaseResponseDict.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |

<a id="v3BatchAddAnalysisTags"></a>
# **v3BatchAddAnalysisTags**
> BulkAddTagsOutputBody v3BatchAddAnalysisTags(bulkAddTagsInputBody)

Add tags to multiple analyses.

Adds tags (origin RevEng) to every given analysis&#39; binary. The caller must own every analysis, or none are changed.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesBulkActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysesBulkActionsApi apiInstance = new AnalysesBulkActionsApi(defaultClient);
    BulkAddTagsInputBody bulkAddTagsInputBody = new BulkAddTagsInputBody(); // BulkAddTagsInputBody | 
    try {
      BulkAddTagsOutputBody result = apiInstance.v3BatchAddAnalysisTags(bulkAddTagsInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesBulkActionsApi#v3BatchAddAnalysisTags");
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
| **bulkAddTagsInputBody** | [**BulkAddTagsInputBody**](BulkAddTagsInputBody.md)|  | |

### Return type

[**BulkAddTagsOutputBody**](BulkAddTagsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3BatchDeleteAnalyses"></a>
# **v3BatchDeleteAnalyses**
> v3BatchDeleteAnalyses(bulkDeleteAnalysesInputBody)

Delete multiple analyses.

Deactivates every given analysis. The caller must own all of them, or none are deleted.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesBulkActionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AnalysesBulkActionsApi apiInstance = new AnalysesBulkActionsApi(defaultClient);
    BulkDeleteAnalysesInputBody bulkDeleteAnalysesInputBody = new BulkDeleteAnalysesInputBody(); // BulkDeleteAnalysesInputBody | 
    try {
      apiInstance.v3BatchDeleteAnalyses(bulkDeleteAnalysesInputBody);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesBulkActionsApi#v3BatchDeleteAnalyses");
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
| **bulkDeleteAnalysesInputBody** | [**BulkDeleteAnalysesInputBody**](BulkDeleteAnalysesInputBody.md)|  | |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

