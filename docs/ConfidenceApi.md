# ConfidenceApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalysisTagScore**](ConfidenceApi.md#getAnalysisTagScore) | **POST** /v2/confidence/analysis/{analysis_id}/tag_score | Calculate Tag Confidence Score for an Analysis |
| [**getAnalysisThreatScore**](ConfidenceApi.md#getAnalysisThreatScore) | **GET** /v2/confidence/analysis/{analysis_id}/threat_score | Calculate Threat Score for Binary |
| [**getFunctionsNameScore**](ConfidenceApi.md#getFunctionsNameScore) | **POST** /v2/confidence/functions/name_score | Calculate function name confidence for a set of Functions |
| [**getFunctionsThreatScore**](ConfidenceApi.md#getFunctionsThreatScore) | **POST** /v2/confidence/functions/threat_score | Calculate Threat Score for a set of Functions |


<a id="getAnalysisTagScore"></a>
# **getAnalysisTagScore**
> BaseResponseListTagOriginBoxPlotConfidence getAnalysisTagScore(analysisId, tagConfidenceBody, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListTagOriginBoxPlotConfidence result = apiInstance.getAnalysisTagScore(analysisId, tagConfidenceBody, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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

<a id="getAnalysisThreatScore"></a>
# **getAnalysisThreatScore**
> BaseResponseBoxPlotConfidence getAnalysisThreatScore(analysisId, authorization)

Calculate Threat Score for Binary

Accepts a binary ID and returns the threat score for that binary

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
    Integer analysisId = 56; // Integer | The analysis to calculate the threat score for
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseBoxPlotConfidence result = apiInstance.getAnalysisThreatScore(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfidenceApi#getAnalysisThreatScore");
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
| **analysisId** | **Integer**| The analysis to calculate the threat score for | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseBoxPlotConfidence**](BaseResponseBoxPlotConfidence.md)

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

<a id="getFunctionsNameScore"></a>
# **getFunctionsNameScore**
> BaseResponseListFunctionBoxPlotConfidence getFunctionsNameScore(functionNameConfidenceBody, authorization)

Calculate function name confidence for a set of Functions

Accepts a list of function ids mapped to a function name, for each function we return a confidence score in that being the correct name for each function. Each function must be from the same model, or you may find some functions missing in the return.

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
    FunctionNameConfidenceBody functionNameConfidenceBody = new FunctionNameConfidenceBody(); // FunctionNameConfidenceBody | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListFunctionBoxPlotConfidence result = apiInstance.getFunctionsNameScore(functionNameConfidenceBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfidenceApi#getFunctionsNameScore");
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
| **functionNameConfidenceBody** | [**FunctionNameConfidenceBody**](FunctionNameConfidenceBody.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseListFunctionBoxPlotConfidence**](BaseResponseListFunctionBoxPlotConfidence.md)

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

<a id="getFunctionsThreatScore"></a>
# **getFunctionsThreatScore**
> BaseResponseListFunctionBoxPlotConfidence getFunctionsThreatScore(threatScoreFunctionBody, authorization)

Calculate Threat Score for a set of Functions

Accepts a list of function ids and returns the threat score for each function. Each function must be from the same model, or you may find some functions missing in the return.

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
    ThreatScoreFunctionBody threatScoreFunctionBody = new ThreatScoreFunctionBody(); // ThreatScoreFunctionBody | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListFunctionBoxPlotConfidence result = apiInstance.getFunctionsThreatScore(threatScoreFunctionBody, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConfidenceApi#getFunctionsThreatScore");
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
| **threatScoreFunctionBody** | [**ThreatScoreFunctionBody**](ThreatScoreFunctionBody.md)|  | |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseListFunctionBoxPlotConfidence**](BaseResponseListFunctionBoxPlotConfidence.md)

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

