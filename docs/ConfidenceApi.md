# ConfidenceApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalysisTagScore**](ConfidenceApi.md#getAnalysisTagScore) | **POST** /v2/confidence/analysis/{analysis_id}/tag_score | Calculate Tag Confidence Score for an Analysis |


<a id="getAnalysisTagScore"></a>
# **getAnalysisTagScore**
> BaseResponseListTagOriginBoxPlotConfidence getAnalysisTagScore(analysisId, tagConfidenceBody)

Calculate Tag Confidence Score for an Analysis

Accepts a analysis ID and a list of tags, returns the confidence score for each tag in the list

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConfidenceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConfidenceApi apiInstance = new ConfidenceApi(defaultClient);
    Integer analysisId = 56; // Integer | The analysis to calculate the tag scores for
    TagConfidenceBody tagConfidenceBody = new TagConfidenceBody(); // TagConfidenceBody | 
    try {
      BaseResponseListTagOriginBoxPlotConfidence result = apiInstance.getAnalysisTagScore(analysisId, tagConfidenceBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfidenceApi#getAnalysisTagScore");
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
| **analysisId** | **Integer**| The analysis to calculate the tag scores for | |
| **tagConfidenceBody** | [**TagConfidenceBody**](TagConfidenceBody.md)|  | |

### Return type

[**BaseResponseListTagOriginBoxPlotConfidence**](BaseResponseListTagOriginBoxPlotConfidence.md)

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

