# AnalysesCoreApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserStringToAnalysis**](AnalysesCoreApi.md#addUserStringToAnalysis) | **POST** /v3/analyses/{analysis_id}/user-provided-strings | Add a user-provided string to an analysis. |
| [**getAnalysisBasicInfo**](AnalysesCoreApi.md#getAnalysisBasicInfo) | **GET** /v3/analyses/{analysis_id}/basic | Get basic analysis information |
| [**getAnalysisBytes**](AnalysesCoreApi.md#getAnalysisBytes) | **GET** /v3/analyses/{analysis_id}/bytes | Get the bytes of a binary |
| [**getAnalysisFunctionMatches**](AnalysesCoreApi.md#getAnalysisFunctionMatches) | **GET** /v3/analyses/{analysis_id}/functions/matches | Get function-matching results for an analysis |
| [**getAnalysisFunctionMatchingStatus**](AnalysesCoreApi.md#getAnalysisFunctionMatchingStatus) | **GET** /v3/analyses/{analysis_id}/functions/matches/status | Get function-matching status for an analysis |
| [**getDynamicExecutionReport**](AnalysesCoreApi.md#getDynamicExecutionReport) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/report | Get dynamic execution report |
| [**getDynamicExecutionStatus**](AnalysesCoreApi.md#getDynamicExecutionStatus) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/status | Get dynamic execution status |
| [**startAnalysisFunctionMatching**](AnalysesCoreApi.md#startAnalysisFunctionMatching) | **POST** /v3/analyses/{analysis_id}/functions/matches | Start function matching for an analysis |
| [**v3GetAnalysisAutoUnstripStatus**](AnalysesCoreApi.md#v3GetAnalysisAutoUnstripStatus) | **GET** /v3/analyses/{analysis_id}/auto-unstrip/status | Get the auto-unstrip status for an analysis. |
| [**v3GetAnalysisStrings**](AnalysesCoreApi.md#v3GetAnalysisStrings) | **GET** /v3/analyses/{analysis_id}/functions/strings | List strings for an analysis. |
| [**v3GetAnalysisStringsStatus**](AnalysesCoreApi.md#v3GetAnalysisStringsStatus) | **GET** /v3/analyses/{analysis_id}/functions/strings/status | Get the string-extraction status for an analysis. |
| [**v3ListAnalyses**](AnalysesCoreApi.md#v3ListAnalyses) | **GET** /v3/analyses | List analyses |
| [**v3ListExampleAnalyses**](AnalysesCoreApi.md#v3ListExampleAnalyses) | **GET** /v3/analyses/examples | List example analyses |


<a id="addUserStringToAnalysis"></a>
# **addUserStringToAnalysis**
> Object addUserStringToAnalysis(analysisId, addUserStringInputBody)

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
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    AddUserStringInputBody addUserStringInputBody = new AddUserStringInputBody(); // AddUserStringInputBody | 
    try {
      Object result = apiInstance.addUserStringToAnalysis(analysisId, addUserStringInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#addUserStringToAnalysis");
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

**Object**

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="getAnalysisBasicInfo"></a>
# **getAnalysisBasicInfo**
> AnalysisBasicInfoOutputBody getAnalysisBasicInfo(analysisId)

Get basic analysis information

Returns basic metadata for the given analysis including binary details, model, owner, and function count.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      AnalysisBasicInfoOutputBody result = apiInstance.getAnalysisBasicInfo(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisBasicInfo");
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

### Return type

[**AnalysisBasicInfoOutputBody**](AnalysisBasicInfoOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="getAnalysisBytes"></a>
# **getAnalysisBytes**
> getAnalysisBytes(analysisId, page)

Get the bytes of a binary

Returns a 64kb byte page from the binary.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long page = 56L; // Long | 64kb page of binary data
    try {
      apiInstance.getAnalysisBytes(analysisId, page);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisBytes");
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
| **page** | **Long**| 64kb page of binary data | [optional] |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getAnalysisFunctionMatches"></a>
# **getAnalysisFunctionMatches**
> GetMatchesOutputBody getAnalysisFunctionMatches(analysisId, matchId)

Get function-matching results for an analysis

Returns the matches blob when the matching workflow has completed. While the workflow is in progress this endpoint returns the current status with no matches; use /matches/status to poll progress.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    String matchId = "matchId_example"; // String | Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest.
    try {
      GetMatchesOutputBody result = apiInstance.getAnalysisFunctionMatches(analysisId, matchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisFunctionMatches");
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
| **matchId** | **String**| Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest. | [optional] |

### Return type

[**GetMatchesOutputBody**](GetMatchesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getAnalysisFunctionMatchingStatus"></a>
# **getAnalysisFunctionMatchingStatus**
> GetMatchesStatusOutputBody getAnalysisFunctionMatchingStatus(analysisId, matchId)

Get function-matching status for an analysis

Returns the matching workflow&#39;s current status. Does not include the matches blob — use GET /matches for that.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    String matchId = "matchId_example"; // String | Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest.
    try {
      GetMatchesStatusOutputBody result = apiInstance.getAnalysisFunctionMatchingStatus(analysisId, matchId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisFunctionMatchingStatus");
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
| **matchId** | **String**| Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest. | [optional] |

### Return type

[**GetMatchesStatusOutputBody**](GetMatchesStatusOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
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

<a id="getDynamicExecutionReport"></a>
# **getDynamicExecutionReport**
> AnalysisReport getDynamicExecutionReport(analysisId)

Get dynamic execution report

Returns the dynamic execution report JSON for the analysis. Requires the task to be in COMPLETED status.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;DYNAMIC_EXECUTION_INCOMPLETE&#x60;](/errors/DYNAMIC_EXECUTION_INCOMPLETE) — Dynamic Execution Incomplete

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      AnalysisReport result = apiInstance.getDynamicExecutionReport(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getDynamicExecutionReport");
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

### Return type

[**AnalysisReport**](AnalysisReport.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getDynamicExecutionStatus"></a>
# **getDynamicExecutionStatus**
> DynamicExecutionStatusResponse getDynamicExecutionStatus(analysisId)

Get dynamic execution status

Returns the status of the most recent dynamic execution task for the analysis. Returns UNINITIALISED if no task has been started.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      DynamicExecutionStatusResponse result = apiInstance.getDynamicExecutionStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getDynamicExecutionStatus");
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

### Return type

[**DynamicExecutionStatusResponse**](DynamicExecutionStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="startAnalysisFunctionMatching"></a>
# **startAnalysisFunctionMatching**
> StartMatchingOutputBody startAnalysisFunctionMatching(analysisId, startMatchingForAnalysisInputBody)

Start function matching for an analysis

Dispatches the function-matching workflow against every function in the analysis. Returns immediately. Poll the status endpoint for progress; fetch results from the matches endpoint when status&#x3D;COMPLETED.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    StartMatchingForAnalysisInputBody startMatchingForAnalysisInputBody = new StartMatchingForAnalysisInputBody(); // StartMatchingForAnalysisInputBody | 
    try {
      StartMatchingOutputBody result = apiInstance.startAnalysisFunctionMatching(analysisId, startMatchingForAnalysisInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#startAnalysisFunctionMatching");
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
| **startMatchingForAnalysisInputBody** | [**StartMatchingForAnalysisInputBody**](StartMatchingForAnalysisInputBody.md)|  | |

### Return type

[**StartMatchingOutputBody**](StartMatchingOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetAnalysisAutoUnstripStatus"></a>
# **v3GetAnalysisAutoUnstripStatus**
> AutoUnstripStatusOutputBody v3GetAnalysisAutoUnstripStatus(analysisId)

Get the auto-unstrip status for an analysis.

Returns the status of the auto-unstrip task for the binary backing the analysis. One of &#x60;UNINITIALISED&#x60;, &#x60;PENDING&#x60;, &#x60;RUNNING&#x60;, &#x60;COMPLETED&#x60;, &#x60;FAILED&#x60;.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      AutoUnstripStatusOutputBody result = apiInstance.v3GetAnalysisAutoUnstripStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysisAutoUnstripStatus");
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

### Return type

[**AutoUnstripStatusOutputBody**](AutoUnstripStatusOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3GetAnalysisStrings"></a>
# **v3GetAnalysisStrings**
> ListAnalysisStringsOutputBody v3GetAnalysisStrings(analysisId, page, pageSize, search, searchOperator, functionSearch, orderBy, sortOrder)

List strings for an analysis.

Returns the strings discovered in an analysis, combining function-level and analysis-level strings. Supports value/function-name search, sorting and pagination.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long page = 1L; // Long | Page number (1-indexed).
    Long pageSize = 100L; // Long | Number of results per page.
    String search = "search_example"; // String | Filter by string value (case-insensitive substring match).
    String searchOperator = "CONTAINS"; // String | How the search term matches string values.
    String functionSearch = "functionSearch_example"; // String | Filter by function name (case-insensitive substring match).
    String orderBy = "value"; // String | Field to order results by.
    String sortOrder = "ASC"; // String | Sort direction.
    try {
      ListAnalysisStringsOutputBody result = apiInstance.v3GetAnalysisStrings(analysisId, page, pageSize, search, searchOperator, functionSearch, orderBy, sortOrder);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysisStrings");
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
| **page** | **Long**| Page number (1-indexed). | [optional] [default to 1] |
| **pageSize** | **Long**| Number of results per page. | [optional] [default to 100] |
| **search** | **String**| Filter by string value (case-insensitive substring match). | [optional] |
| **searchOperator** | **String**| How the search term matches string values. | [optional] [default to CONTAINS] [enum: CONTAINS, STARTS_WITH] |
| **functionSearch** | **String**| Filter by function name (case-insensitive substring match). | [optional] |
| **orderBy** | **String**| Field to order results by. | [optional] [default to value] [enum: value, length] |
| **sortOrder** | **String**| Sort direction. | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListAnalysisStringsOutputBody**](ListAnalysisStringsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3GetAnalysisStringsStatus"></a>
# **v3GetAnalysisStringsStatus**
> GetAnalysisStringsStatusOutputBody v3GetAnalysisStringsStatus(analysisId)

Get the string-extraction status for an analysis.

Returns the status of the string-extraction task for the binary backing the analysis. One of UNINITIALISED, PENDING, RUNNING, COMPLETED, FAILED.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      GetAnalysisStringsStatusOutputBody result = apiInstance.v3GetAnalysisStringsStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysisStringsStatus");
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

### Return type

[**GetAnalysisStringsStatusOutputBody**](GetAnalysisStringsStatusOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3ListAnalyses"></a>
# **v3ListAnalyses**
> ListAnalysesOutputBody v3ListAnalyses(searchTerm, analysisScope, status, modelName, usernames, sha256Hash, pageSize, nextPageToken, orderBy, order)

List analyses

Returns a page of analyses visible to the caller, filtered and ordered by the query parameters.  **Error codes:** - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    String searchTerm = "searchTerm_example"; // String | 
    List<String> analysisScope = Arrays.asList(); // List<String> | Leave empty for no filter
    List<String> status = Arrays.asList(); // List<String> | 
    List<String> modelName = Arrays.asList(); // List<String> | 
    List<String> usernames = Arrays.asList(); // List<String> | 
    String sha256Hash = "sha256Hash_example"; // String | 
    Long pageSize = 20L; // Long | 
    String nextPageToken = "nextPageToken_example"; // String | Forward-pagination cursor from a prior response. When set, order_by/order are taken from the token (the sort cannot change mid-pagination).
    String orderBy = "created"; // String | 
    String order = "ASC"; // String | 
    try {
      ListAnalysesOutputBody result = apiInstance.v3ListAnalyses(searchTerm, analysisScope, status, modelName, usernames, sha256Hash, pageSize, nextPageToken, orderBy, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3ListAnalyses");
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
| **searchTerm** | **String**|  | [optional] |
| **analysisScope** | [**List&lt;String&gt;**](String.md)| Leave empty for no filter | [optional] [enum: PRIVATE, PUBLIC, TEAM] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Uploaded, Queued, Complete, Error, Processing] |
| **modelName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **usernames** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sha256Hash** | **String**|  | [optional] |
| **pageSize** | **Long**|  | [optional] [default to 20] |
| **nextPageToken** | **String**| Forward-pagination cursor from a prior response. When set, order_by/order are taken from the token (the sort cannot change mid-pagination). | [optional] |
| **orderBy** | **String**|  | [optional] [default to created] [enum: created, binary_name, binary_size] |
| **order** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**ListAnalysesOutputBody**](ListAnalysesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3ListExampleAnalyses"></a>
# **v3ListExampleAnalyses**
> ListExampleAnalysesOutputBody v3ListExampleAnalyses()

List example analyses

Returns the curated example Analyses.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

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

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    try {
      ListExampleAnalysesOutputBody result = apiInstance.v3ListExampleAnalyses();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3ListExampleAnalyses");
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

[**ListExampleAnalysesOutputBody**](ListExampleAnalysesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error |  -  |

