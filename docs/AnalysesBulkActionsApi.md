# AnalysesBulkActionsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bulkAddAnalysisTags**](AnalysesBulkActionsApi.md#bulkAddAnalysisTags) | **PATCH** /v2/analyses/tags/add | Bulk Add Analysis Tags |
| [**bulkDeleteAnalyses**](AnalysesBulkActionsApi.md#bulkDeleteAnalyses) | **PATCH** /v2/analyses/delete | Bulk Delete Analyses |


<a id="bulkAddAnalysisTags"></a>
# **bulkAddAnalysisTags**
> BaseResponseAnalysisBulkAddTagsResponse bulkAddAnalysisTags(analysisBulkAddTagsRequest, endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts)

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

    AnalysesBulkActionsApi apiInstance = new AnalysesBulkActionsApi(defaultClient);
    AnalysisBulkAddTagsRequest analysisBulkAddTagsRequest = new AnalysisBulkAddTagsRequest(); // AnalysisBulkAddTagsRequest | 
    String endpointUrl = "endpointUrl_example"; // String | 
    String localCacheDir = "localCacheDir_example"; // String | 
    Integer localCacheMaxSizeMb = 56; // Integer | 
    String customerSamplesBucket = "customerSamplesBucket_example"; // String | 
    String firmwareSamplesBucket = "firmwareSamplesBucket_example"; // String | 
    Integer maxRetryAttempts = 5; // Integer | 
    try {
      BaseResponseAnalysisBulkAddTagsResponse result = apiInstance.bulkAddAnalysisTags(analysisBulkAddTagsRequest, endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts);
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
| **endpointUrl** | **String**|  | [optional] |
| **localCacheDir** | **String**|  | [optional] |
| **localCacheMaxSizeMb** | **Integer**|  | [optional] |
| **customerSamplesBucket** | **String**|  | [optional] |
| **firmwareSamplesBucket** | **String**|  | [optional] |
| **maxRetryAttempts** | **Integer**|  | [optional] [default to 5] |

### Return type

[**BaseResponseAnalysisBulkAddTagsResponse**](BaseResponseAnalysisBulkAddTagsResponse.md)

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

<a id="bulkDeleteAnalyses"></a>
# **bulkDeleteAnalyses**
> BaseResponseDict bulkDeleteAnalyses(bulkDeleteAnalysesRequest, endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts)

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

    AnalysesBulkActionsApi apiInstance = new AnalysesBulkActionsApi(defaultClient);
    BulkDeleteAnalysesRequest bulkDeleteAnalysesRequest = new BulkDeleteAnalysesRequest(); // BulkDeleteAnalysesRequest | 
    String endpointUrl = "endpointUrl_example"; // String | 
    String localCacheDir = "localCacheDir_example"; // String | 
    Integer localCacheMaxSizeMb = 56; // Integer | 
    String customerSamplesBucket = "customerSamplesBucket_example"; // String | 
    String firmwareSamplesBucket = "firmwareSamplesBucket_example"; // String | 
    Integer maxRetryAttempts = 5; // Integer | 
    try {
      BaseResponseDict result = apiInstance.bulkDeleteAnalyses(bulkDeleteAnalysesRequest, endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts);
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
| **endpointUrl** | **String**|  | [optional] |
| **localCacheDir** | **String**|  | [optional] |
| **localCacheMaxSizeMb** | **Integer**|  | [optional] |
| **customerSamplesBucket** | **String**|  | [optional] |
| **firmwareSamplesBucket** | **String**|  | [optional] |
| **maxRetryAttempts** | **Integer**|  | [optional] [default to 5] |

### Return type

[**BaseResponseDict**](BaseResponseDict.md)

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
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |

