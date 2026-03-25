# AnalysisStagesApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalysisStages**](AnalysisStagesApi.md#getAnalysisStages) | **GET** /v2/analysis-stages/{analysis_id} | Get Analysis Stages |
| [**getPipelineStatus**](AnalysisStagesApi.md#getPipelineStatus) | **GET** /v2/analysis-stages/{analysis_id}/pipeline-status | Get Pipeline Status |


<a id="getAnalysisStages"></a>
# **getAnalysisStages**
> BaseResponseAnalysisStagesResponse getAnalysisStages(analysisId)

Get Analysis Stages

Returns all stage events for an analysis ordered by timestamp.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysisStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysisStagesApi apiInstance = new AnalysisStagesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseAnalysisStagesResponse result = apiInstance.getAnalysisStages(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisStagesApi#getAnalysisStages");
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

### Return type

[**BaseResponseAnalysisStagesResponse**](BaseResponseAnalysisStagesResponse.md)

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

<a id="getPipelineStatus"></a>
# **getPipelineStatus**
> BaseResponsePipelineStatusResponse getPipelineStatus(analysisId)

Get Pipeline Status

Returns the latest status for each core pipeline stage with the number of analyses ahead in the queue.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysisStagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysisStagesApi apiInstance = new AnalysisStagesApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponsePipelineStatusResponse result = apiInstance.getPipelineStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysisStagesApi#getPipelineStatus");
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

### Return type

[**BaseResponsePipelineStatusResponse**](BaseResponsePipelineStatusResponse.md)

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

