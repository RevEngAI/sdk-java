# StringsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserStringToAnalysis**](StringsApi.md#addUserStringToAnalysis) | **POST** /v3/analyses/{analysis_id}/user-provided-strings | Add a user-provided string to an analysis. |
| [**addUserStringToFunction**](StringsApi.md#addUserStringToFunction) | **POST** /v3/functions/{function_id}/user-provided-strings | Add a user-provided string to a function. |


<a id="addUserStringToAnalysis"></a>
# **addUserStringToAnalysis**
> Map&lt;String, Object&gt; addUserStringToAnalysis(analysisId, addUserStringInputBody)

Add a user-provided string to an analysis.

Attaches a user-provided string to an analysis at the given virtual address. The string is stored with source &#x60;USER&#x60; and complements strings discovered automatically during analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.StringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    StringsApi apiInstance = new StringsApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    AddUserStringInputBody addUserStringInputBody = new AddUserStringInputBody(); // AddUserStringInputBody | 
    try {
      Map<String, Object> result = apiInstance.addUserStringToAnalysis(analysisId, addUserStringInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StringsApi#addUserStringToAnalysis");
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
| **analysisId** | **Long**| Analysis ID | |
| **addUserStringInputBody** | [**AddUserStringInputBody**](AddUserStringInputBody.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="addUserStringToFunction"></a>
# **addUserStringToFunction**
> Map&lt;String, Object&gt; addUserStringToFunction(functionId, addUserStringToFunctionInputBody)

Add a user-provided string to a function.

Attaches a user-provided string to a function at the given virtual address. The string is stored with source &#x60;USER&#x60; and complements strings discovered automatically during analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.StringsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    StringsApi apiInstance = new StringsApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    AddUserStringToFunctionInputBody addUserStringToFunctionInputBody = new AddUserStringToFunctionInputBody(); // AddUserStringToFunctionInputBody | 
    try {
      Map<String, Object> result = apiInstance.addUserStringToFunction(functionId, addUserStringToFunctionInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StringsApi#addUserStringToFunction");
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
| **addUserStringToFunctionInputBody** | [**AddUserStringToFunctionInputBody**](AddUserStringToFunctionInputBody.md)|  | |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

