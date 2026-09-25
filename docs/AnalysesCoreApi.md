# AnalysesCoreApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUserStringToAnalysis**](AnalysesCoreApi.md#addUserStringToAnalysis) | **POST** /v3/analyses/{analysis_id}/user-provided-strings | Add a user-provided string to an analysis. |
| [**createAnalysis**](AnalysesCoreApi.md#createAnalysis) | **POST** /v2/analyses | Create Analysis |
| [**deleteAnalysis**](AnalysesCoreApi.md#deleteAnalysis) | **DELETE** /v2/analyses/{analysis_id} | Delete Analysis |
| [**getAnalysisBasicInfo**](AnalysesCoreApi.md#getAnalysisBasicInfo) | **GET** /v2/analyses/{analysis_id}/basic | Gets basic analysis information |
| [**getAnalysisBasicInfo_0**](AnalysesCoreApi.md#getAnalysisBasicInfo_0) | **GET** /v3/analyses/{analysis_id}/basic | Get basic analysis information |
| [**getAnalysisBytes**](AnalysesCoreApi.md#getAnalysisBytes) | **GET** /v3/analyses/{analysis_id}/bytes | Get the bytes of a binary |
| [**getAnalysisFunctionMap**](AnalysesCoreApi.md#getAnalysisFunctionMap) | **GET** /v2/analyses/{analysis_id}/func_maps | Get Analysis Function Map |
| [**getAnalysisFunctionMatches**](AnalysesCoreApi.md#getAnalysisFunctionMatches) | **GET** /v3/analyses/{analysis_id}/functions/matches | Get function-matching results for an analysis |
| [**getAnalysisFunctionMatchingStatus**](AnalysesCoreApi.md#getAnalysisFunctionMatchingStatus) | **GET** /v3/analyses/{analysis_id}/functions/matches/status | Get function-matching status for an analysis |
| [**getAnalysisLogs**](AnalysesCoreApi.md#getAnalysisLogs) | **GET** /v2/analyses/{analysis_id}/logs | Gets the logs of an analysis |
| [**getAnalysisParams**](AnalysesCoreApi.md#getAnalysisParams) | **GET** /v2/analyses/{analysis_id}/params | Gets analysis param information |
| [**getAnalysisStatus**](AnalysesCoreApi.md#getAnalysisStatus) | **GET** /v2/analyses/{analysis_id}/status | Gets the status of an analysis |
| [**getDynamicExecutionReport**](AnalysesCoreApi.md#getDynamicExecutionReport) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/report | Get dynamic execution report |
| [**getDynamicExecutionStatus**](AnalysesCoreApi.md#getDynamicExecutionStatus) | **GET** /v2/analyses/{analysis_id}/dynamic-execution/status | Get dynamic execution status |
| [**insertAnalysisLog**](AnalysesCoreApi.md#insertAnalysisLog) | **POST** /v2/analyses/{analysis_id}/logs | Insert a log entry for an analysis |
| [**listAnalyses**](AnalysesCoreApi.md#listAnalyses) | **GET** /v2/analyses/list | Gets the most recent analyses |
| [**lookupBinaryId**](AnalysesCoreApi.md#lookupBinaryId) | **GET** /v2/analyses/lookup/{binary_id} | Gets the analysis ID from binary ID |
| [**putAnalysisStrings**](AnalysesCoreApi.md#putAnalysisStrings) | **PUT** /v2/analyses/{analysis_id}/strings | Add strings to the analysis |
| [**requeueAnalysis**](AnalysesCoreApi.md#requeueAnalysis) | **POST** /v2/analyses/{analysis_id}/requeue | Requeue Analysis |
| [**startAnalysisFunctionMatching**](AnalysesCoreApi.md#startAnalysisFunctionMatching) | **POST** /v3/analyses/{analysis_id}/functions/matches | Start function matching for an analysis |
| [**updateAnalysis**](AnalysesCoreApi.md#updateAnalysis) | **PATCH** /v2/analyses/{analysis_id} | Update Analysis |
| [**updateAnalysisTags**](AnalysesCoreApi.md#updateAnalysisTags) | **PATCH** /v2/analyses/{analysis_id}/tags | Update Analysis Tags |
| [**uploadFile**](AnalysesCoreApi.md#uploadFile) | **POST** /v2/upload | Upload File |
| [**v3CreateAnalysis**](AnalysesCoreApi.md#v3CreateAnalysis) | **POST** /v3/analyses | Create an analysis |
| [**v3DeleteAnalysis**](AnalysesCoreApi.md#v3DeleteAnalysis) | **DELETE** /v3/analyses/{analysis_id} | Delete an analysis. |
| [**v3DownloadBinaryExport**](AnalysesCoreApi.md#v3DownloadBinaryExport) | **GET** /v3/analyses/{analysis_id}/binary-export | Download a binary export |
| [**v3GetAnalysis**](AnalysesCoreApi.md#v3GetAnalysis) | **GET** /v3/analyses/{analysis_id} | Get an analysis. |
| [**v3GetAnalysisAutoUnstripStatus**](AnalysesCoreApi.md#v3GetAnalysisAutoUnstripStatus) | **GET** /v3/analyses/{analysis_id}/auto-unstrip/status | Get the auto-unstrip status for an analysis. |
| [**v3GetAnalysisFunctionsProgress**](AnalysesCoreApi.md#v3GetAnalysisFunctionsProgress) | **GET** /v3/analyses/{analysis_id}/progress/functions | Get function embedding progress for an analysis. |
| [**v3GetAnalysisLogs**](AnalysesCoreApi.md#v3GetAnalysisLogs) | **GET** /v3/analyses/{analysis_id}/logs | Get the Analysis log |
| [**v3GetAnalysisOperation**](AnalysesCoreApi.md#v3GetAnalysisOperation) | **GET** /v3/operations/analyses/{analysis_id} | Get an Analysis-creation operation |
| [**v3GetAnalysisStrings**](AnalysesCoreApi.md#v3GetAnalysisStrings) | **GET** /v3/analyses/{analysis_id}/functions/strings | List strings for an analysis. |
| [**v3GetAnalysisStringsStatus**](AnalysesCoreApi.md#v3GetAnalysisStringsStatus) | **GET** /v3/analyses/{analysis_id}/functions/strings/status | Get the string-extraction status for an analysis. |
| [**v3GetBinaryExportOperation**](AnalysesCoreApi.md#v3GetBinaryExportOperation) | **GET** /v3/operations/binary-export/{task_id} | Get a binary export operation |
| [**v3ListAnalyses**](AnalysesCoreApi.md#v3ListAnalyses) | **GET** /v3/analyses | List analyses |
| [**v3ListExampleAnalyses**](AnalysesCoreApi.md#v3ListExampleAnalyses) | **GET** /v3/analyses/examples | List example analyses |
| [**v3LookupAnalysisByBinaryId**](AnalysesCoreApi.md#v3LookupAnalysisByBinaryId) | **GET** /v3/analyses/lookup/{binary_id} | Look up the most recent analysis for a binary. |
| [**v3QueueBinaryExport**](AnalysesCoreApi.md#v3QueueBinaryExport) | **POST** /v3/analyses/{analysis_id}/binary-export | Queue a binary export |
| [**v3SearchTags**](AnalysesCoreApi.md#v3SearchTags) | **GET** /v3/tags | Search tags |
| [**v3UpdateAnalysis**](AnalysesCoreApi.md#v3UpdateAnalysis) | **PATCH** /v3/analyses/{analysis_id} | Update an analysis. |
| [**v3UpdateAnalysisTags**](AnalysesCoreApi.md#v3UpdateAnalysisTags) | **PATCH** /v3/analyses/{analysis_id}/tags | Replace an analysis&#39; tags. |
| [**v3UpgradeAnalysisModel**](AnalysesCoreApi.md#v3UpgradeAnalysisModel) | **POST** /v3/analyses/{analysis_id}/upgrade-model | Re-analyse on the latest model |


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

<a id="createAnalysis"></a>
# **createAnalysis**
> BaseResponseAnalysisCreateResponse createAnalysis(analysisCreateRequest, xRevEngApplication)

Create Analysis

Begins an analysis

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
    AnalysisCreateRequest analysisCreateRequest = new AnalysisCreateRequest(); // AnalysisCreateRequest | 
    String xRevEngApplication = "xRevEngApplication_example"; // String | 
    try {
      BaseResponseAnalysisCreateResponse result = apiInstance.createAnalysis(analysisCreateRequest, xRevEngApplication);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#createAnalysis");
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
| **analysisCreateRequest** | [**AnalysisCreateRequest**](AnalysisCreateRequest.md)|  | |
| **xRevEngApplication** | **String**|  | [optional] |

### Return type

[**BaseResponseAnalysisCreateResponse**](BaseResponseAnalysisCreateResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Unprocessable Entity |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a id="deleteAnalysis"></a>
# **deleteAnalysis**
> BaseResponseDict deleteAnalysis(analysisId)

Delete Analysis

Deletes an analysis based on the provided analysis ID.

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
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseDict result = apiInstance.deleteAnalysis(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#deleteAnalysis");
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

[**BaseResponseDict**](BaseResponseDict.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |

<a id="getAnalysisBasicInfo"></a>
# **getAnalysisBasicInfo**
> BaseResponseBasic getAnalysisBasicInfo(analysisId)

Gets basic analysis information

Returns basic analysis information for an analysis

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
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseBasic result = apiInstance.getAnalysisBasicInfo(analysisId);
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
| **analysisId** | **Integer**|  | |

### Return type

[**BaseResponseBasic**](BaseResponseBasic.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getAnalysisBasicInfo_0"></a>
# **getAnalysisBasicInfo_0**
> AnalysisBasicInfoOutputBody getAnalysisBasicInfo_0(analysisId)

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
      AnalysisBasicInfoOutputBody result = apiInstance.getAnalysisBasicInfo_0(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisBasicInfo_0");
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

<a id="getAnalysisFunctionMap"></a>
# **getAnalysisFunctionMap**
> BaseResponseAnalysisFunctionMapping getAnalysisFunctionMap(analysisId)

Get Analysis Function Map

Returns three maps: a map of function ids to function addresses, it&#39;s inverse and a map of function addresses to function names.

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
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseAnalysisFunctionMapping result = apiInstance.getAnalysisFunctionMap(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisFunctionMap");
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

[**BaseResponseAnalysisFunctionMapping**](BaseResponseAnalysisFunctionMapping.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

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

<a id="getAnalysisLogs"></a>
# **getAnalysisLogs**
> BaseResponseLogs getAnalysisLogs(analysisId)

Gets the logs of an analysis

Given an analysis ID gets the current logs of an analysis

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
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseLogs result = apiInstance.getAnalysisLogs(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisLogs");
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

[**BaseResponseLogs**](BaseResponseLogs.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getAnalysisParams"></a>
# **getAnalysisParams**
> BaseResponseParams getAnalysisParams(analysisId)

Gets analysis param information

Gets the params that the analysis was run with

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
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseParams result = apiInstance.getAnalysisParams(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisParams");
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

[**BaseResponseParams**](BaseResponseParams.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getAnalysisStatus"></a>
# **getAnalysisStatus**
> BaseResponseStatus getAnalysisStatus(analysisId)

Gets the status of an analysis

Given an analysis ID gets the current status of the analysis

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
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseStatus result = apiInstance.getAnalysisStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisStatus");
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

[**BaseResponseStatus**](BaseResponseStatus.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

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

<a id="insertAnalysisLog"></a>
# **insertAnalysisLog**
> BaseResponse insertAnalysisLog(analysisId, insertAnalysisLogRequest)

Insert a log entry for an analysis

Inserts a log record for an analysis. Only the analysis owner can insert logs.

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
    Integer analysisId = 56; // Integer | 
    InsertAnalysisLogRequest insertAnalysisLogRequest = new InsertAnalysisLogRequest(); // InsertAnalysisLogRequest | 
    try {
      BaseResponse result = apiInstance.insertAnalysisLog(analysisId, insertAnalysisLogRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#insertAnalysisLog");
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
| **insertAnalysisLogRequest** | [**InsertAnalysisLogRequest**](InsertAnalysisLogRequest.md)|  | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="listAnalyses"></a>
# **listAnalyses**
> BaseResponseRecent listAnalyses(searchTerm, workspace, status, modelName, dynamicExecutionStatus, usernames, sha256Hash, limit, offset, orderBy, order)

Gets the most recent analyses

Gets the most recent analyses provided a scope, this is then paginated, if pages and limit doesnt fit, it increases the limit

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
    String searchTerm = ""; // String | 
    List<Workspace> workspace = Arrays.asList(); // List<Workspace> | The workspace to be viewed
    List<StatusInput> status = Arrays.asList(); // List<StatusInput> | The status of the analysis
    List<ModelName> modelName = Arrays.asList(); // List<ModelName> | Show analysis belonging to the model
    DynamicExecutionStatus dynamicExecutionStatus = DynamicExecutionStatus.fromValue("PENDING"); // DynamicExecutionStatus | Show analysis that have a dynamic execution with the given status
    List<String> usernames = Arrays.asList(); // List<String> | Show analysis belonging to the user
    String sha256Hash = "sha256Hash_example"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    AppApiRestV2AnalysesEnumsOrderBy orderBy = AppApiRestV2AnalysesEnumsOrderBy.fromValue("created"); // AppApiRestV2AnalysesEnumsOrderBy | 
    Order order = Order.fromValue("ASC"); // Order | 
    try {
      BaseResponseRecent result = apiInstance.listAnalyses(searchTerm, workspace, status, modelName, dynamicExecutionStatus, usernames, sha256Hash, limit, offset, orderBy, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#listAnalyses");
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
| **searchTerm** | **String**|  | [optional] [default to ] |
| **workspace** | [**List&lt;Workspace&gt;**](Workspace.md)| The workspace to be viewed | [optional] |
| **status** | [**List&lt;StatusInput&gt;**](StatusInput.md)| The status of the analysis | [optional] |
| **modelName** | [**List&lt;ModelName&gt;**](ModelName.md)| Show analysis belonging to the model | [optional] |
| **dynamicExecutionStatus** | [**DynamicExecutionStatus**](.md)| Show analysis that have a dynamic execution with the given status | [optional] [enum: PENDING, ERROR, SUCCESS, ALL] |
| **usernames** | [**List&lt;String&gt;**](String.md)| Show analysis belonging to the user | [optional] |
| **sha256Hash** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **orderBy** | [**AppApiRestV2AnalysesEnumsOrderBy**](.md)|  | [optional] [default to created] [enum: created, name, size] |
| **order** | [**Order**](.md)|  | [optional] [default to DESC] [enum: ASC, DESC] |

### Return type

[**BaseResponseRecent**](BaseResponseRecent.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="lookupBinaryId"></a>
# **lookupBinaryId**
> Object lookupBinaryId(binaryId)

Gets the analysis ID from binary ID

Given an binary ID gets the ID of an analysis

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
    Integer binaryId = 56; // Integer | 
    try {
      Object result = apiInstance.lookupBinaryId(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#lookupBinaryId");
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
| **binaryId** | **Integer**|  | |

### Return type

**Object**

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="putAnalysisStrings"></a>
# **putAnalysisStrings**
> BaseResponse putAnalysisStrings(analysisId, putAnalysisStringsRequest)

Add strings to the analysis

Add strings to the analysis. Rejects if any string already exists at the given vaddr.

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
    Integer analysisId = 56; // Integer | 
    PutAnalysisStringsRequest putAnalysisStringsRequest = new PutAnalysisStringsRequest(); // PutAnalysisStringsRequest | 
    try {
      BaseResponse result = apiInstance.putAnalysisStrings(analysisId, putAnalysisStringsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#putAnalysisStrings");
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
| **putAnalysisStringsRequest** | [**PutAnalysisStringsRequest**](PutAnalysisStringsRequest.md)|  | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="requeueAnalysis"></a>
# **requeueAnalysis**
> BaseResponseCreated requeueAnalysis(analysisId, reAnalysisForm, xRevEngApplication)

Requeue Analysis

Re-queues an already uploaded analysis

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
    Integer analysisId = 56; // Integer | 
    ReAnalysisForm reAnalysisForm = new ReAnalysisForm(); // ReAnalysisForm | 
    String xRevEngApplication = "xRevEngApplication_example"; // String | 
    try {
      BaseResponseCreated result = apiInstance.requeueAnalysis(analysisId, reAnalysisForm, xRevEngApplication);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#requeueAnalysis");
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
| **reAnalysisForm** | [**ReAnalysisForm**](ReAnalysisForm.md)|  | |
| **xRevEngApplication** | **String**|  | [optional] |

### Return type

[**BaseResponseCreated**](BaseResponseCreated.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

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

<a id="updateAnalysis"></a>
# **updateAnalysis**
> BaseResponseAnalysisDetailResponse updateAnalysis(analysisId, analysisUpdateRequest)

Update Analysis

Updates analysis attributes (binary_name, analysis_scope). User must be the owner.

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
    Integer analysisId = 56; // Integer | 
    AnalysisUpdateRequest analysisUpdateRequest = new AnalysisUpdateRequest(); // AnalysisUpdateRequest | 
    try {
      BaseResponseAnalysisDetailResponse result = apiInstance.updateAnalysis(analysisId, analysisUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#updateAnalysis");
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
| **analysisUpdateRequest** | [**AnalysisUpdateRequest**](AnalysisUpdateRequest.md)|  | |

### Return type

[**BaseResponseAnalysisDetailResponse**](BaseResponseAnalysisDetailResponse.md)

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

<a id="updateAnalysisTags"></a>
# **updateAnalysisTags**
> BaseResponseAnalysisUpdateTagsResponse updateAnalysisTags(analysisId, analysisUpdateTagsRequest)

Update Analysis Tags

Updates analysis tags. User must be the owner.

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
    Integer analysisId = 56; // Integer | 
    AnalysisUpdateTagsRequest analysisUpdateTagsRequest = new AnalysisUpdateTagsRequest(); // AnalysisUpdateTagsRequest | 
    try {
      BaseResponseAnalysisUpdateTagsResponse result = apiInstance.updateAnalysisTags(analysisId, analysisUpdateTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#updateAnalysisTags");
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
| **analysisUpdateTagsRequest** | [**AnalysisUpdateTagsRequest**](AnalysisUpdateTagsRequest.md)|  | |

### Return type

[**BaseResponseAnalysisUpdateTagsResponse**](BaseResponseAnalysisUpdateTagsResponse.md)

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

<a id="uploadFile"></a>
# **uploadFile**
> BaseResponseUploadResponse uploadFile(uploadFileType, _file, packedPassword, forceOverwrite)

Upload File

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
    UploadFileType uploadFileType = UploadFileType.fromValue("BINARY"); // UploadFileType | 
    File _file = new File("/path/to/file"); // File | 
    String packedPassword = "packedPassword_example"; // String | 
    Boolean forceOverwrite = false; // Boolean | 
    try {
      BaseResponseUploadResponse result = apiInstance.uploadFile(uploadFileType, _file, packedPassword, forceOverwrite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#uploadFile");
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
| **uploadFileType** | [**UploadFileType**](UploadFileType.md)|  | [enum: BINARY, DEBUG, PACKED, FIRMWARE] |
| **_file** | **File**|  | |
| **packedPassword** | **String**|  | [optional] |
| **forceOverwrite** | **Boolean**|  | [optional] [default to false] |

### Return type

[**BaseResponseUploadResponse**](BaseResponseUploadResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="v3CreateAnalysis"></a>
# **v3CreateAnalysis**
> OperationCreateMetadataCreateResult v3CreateAnalysis(createRequest, xRevEngApplication)

Create an analysis

Queues a new Analysis for an uploaded Binary and returns the created Operation.  **Error codes:** - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;413&#x60; [&#x60;REQUEST_ENTITY_TOO_LARGE&#x60;](/errors/REQUEST_ENTITY_TOO_LARGE) — Request Entity Too Large

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
    CreateRequest createRequest = new CreateRequest(); // CreateRequest | 
    String xRevEngApplication = "xRevEngApplication_example"; // String | Identifies the calling RevEng application. Recorded on the Analysis log.
    try {
      OperationCreateMetadataCreateResult result = apiInstance.v3CreateAnalysis(createRequest, xRevEngApplication);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3CreateAnalysis");
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
| **createRequest** | [**CreateRequest**](CreateRequest.md)|  | |
| **xRevEngApplication** | **String**| Identifies the calling RevEng application. Recorded on the Analysis log. | [optional] |

### Return type

[**OperationCreateMetadataCreateResult**](OperationCreateMetadataCreateResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **413** | Request Entity Too Large |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3DeleteAnalysis"></a>
# **v3DeleteAnalysis**
> v3DeleteAnalysis(analysisId)

Delete an analysis.

Deactivates the analysis. Only the owner may call it.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
      apiInstance.v3DeleteAnalysis(analysisId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3DeleteAnalysis");
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

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3DownloadBinaryExport"></a>
# **v3DownloadBinaryExport**
> v3DownloadBinaryExport(analysisId, taskId)

Download a binary export

Streams the exported binary. Returns 404 if the task is not complete or its result has expired -- export again in either case.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
    String taskId = "taskId_example"; // String | Task ID returned by queueing the export
    try {
      apiInstance.v3DownloadBinaryExport(analysisId, taskId);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3DownloadBinaryExport");
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
| **taskId** | **String**| Task ID returned by queueing the export | [optional] |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetAnalysis"></a>
# **v3GetAnalysis**
> AnalysisDetailOutputBody v3GetAnalysis(analysisId)

Get an analysis.

Returns the analysis&#39; resource-level detail: binary attributes, ownership, and the configuration it was submitted with.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
      AnalysisDetailOutputBody result = apiInstance.v3GetAnalysis(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysis");
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

[**AnalysisDetailOutputBody**](AnalysisDetailOutputBody.md)

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

<a id="v3GetAnalysisFunctionsProgress"></a>
# **v3GetAnalysisFunctionsProgress**
> FunctionsProgressOutputBody v3GetAnalysisFunctionsProgress(analysisId)

Get function embedding progress for an analysis.

Returns how many functions the analysis has and how many carry an embedding, with the percentage complete. Embeddings are counted from the unified store, so an analysis whose model predates the current multi-arch one reports zero.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
      FunctionsProgressOutputBody result = apiInstance.v3GetAnalysisFunctionsProgress(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysisFunctionsProgress");
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

[**FunctionsProgressOutputBody**](FunctionsProgressOutputBody.md)

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

<a id="v3GetAnalysisLogs"></a>
# **v3GetAnalysisLogs**
> GetAnalysisLogsOutputBody v3GetAnalysisLogs(analysisId)

Get the Analysis log

Returns every log line recorded for the Analysis, oldest first, merged from every source that has written one.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
      GetAnalysisLogsOutputBody result = apiInstance.v3GetAnalysisLogs(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysisLogs");
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

[**GetAnalysisLogsOutputBody**](GetAnalysisLogsOutputBody.md)

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

<a id="v3GetAnalysisOperation"></a>
# **v3GetAnalysisOperation**
> OperationCreateMetadataCreateResult v3GetAnalysisOperation(analysisId)

Get an Analysis-creation operation

Polls the status of an Analysis-creation operation.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
      OperationCreateMetadataCreateResult result = apiInstance.v3GetAnalysisOperation(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetAnalysisOperation");
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

[**OperationCreateMetadataCreateResult**](OperationCreateMetadataCreateResult.md)

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

<a id="v3GetBinaryExportOperation"></a>
# **v3GetBinaryExportOperation**
> OperationBinaryExportMetadataBinaryExportResult v3GetBinaryExportOperation(taskId)

Get a binary export operation

Returns the current state of the export started for this task ID. &#x60;done&#x60; is the only readiness signal: while false, poll again; once true, exactly one of &#x60;response&#x60; or &#x60;error&#x60; is set. A task ID the platform no longer recognises -- whether it never existed or its history has expired -- resolves to a failed operation, since either way the caller must export again.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
    String taskId = "taskId_example"; // String | Task ID returned by queueing the export
    try {
      OperationBinaryExportMetadataBinaryExportResult result = apiInstance.v3GetBinaryExportOperation(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3GetBinaryExportOperation");
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
| **taskId** | **String**| Task ID returned by queueing the export | |

### Return type

[**OperationBinaryExportMetadataBinaryExportResult**](OperationBinaryExportMetadataBinaryExportResult.md)

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
> ListAnalysesOutputBody v3ListAnalyses(searchTerm, analysisScope, status, modelName, usernames, sha256Hash, binaryId, platform, architecture, pageSize, nextPageToken, orderBy, order)

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
    List<String> analysisScope = Arrays.asList(); // List<String> | Leave empty to search your own, your team's and all public analyses
    List<String> status = Arrays.asList(); // List<String> | 
    List<String> modelName = Arrays.asList(); // List<String> | 
    List<String> usernames = Arrays.asList(); // List<String> | 
    String sha256Hash = "sha256Hash_example"; // String | 
    Long binaryId = 56L; // Long | Restrict to analyses of this binary. A binary can carry more than one analysis; they are returned newest first under the default sort
    List<String> platform = Arrays.asList(); // List<String> | Restrict to binaries running on one of these operating-system platforms. Matches the uploader's override when they set one, the detected platform otherwise; a binary with neither is never matched. Leave empty for no filter
    List<String> architecture = Arrays.asList(); // List<String> | Restrict to binaries built for one of these instruction-set architectures. Resolved the same way as platform. Leave empty for no filter
    Long pageSize = 20L; // Long | 
    String nextPageToken = "nextPageToken_example"; // String | Forward-pagination cursor from a prior response. When set, order_by/order are taken from the token (the sort cannot change mid-pagination).
    String orderBy = "created"; // String | 
    String order = "ASC"; // String | 
    try {
      ListAnalysesOutputBody result = apiInstance.v3ListAnalyses(searchTerm, analysisScope, status, modelName, usernames, sha256Hash, binaryId, platform, architecture, pageSize, nextPageToken, orderBy, order);
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
| **analysisScope** | [**List&lt;String&gt;**](String.md)| Leave empty to search your own, your team&#39;s and all public analyses | [optional] [enum: PRIVATE, PUBLIC, TEAM] |
| **status** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: Uploaded, Queued, Complete, Error, Processing] |
| **modelName** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **usernames** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **sha256Hash** | **String**|  | [optional] |
| **binaryId** | **Long**| Restrict to analyses of this binary. A binary can carry more than one analysis; they are returned newest first under the default sort | [optional] |
| **platform** | [**List&lt;String&gt;**](String.md)| Restrict to binaries running on one of these operating-system platforms. Matches the uploader&#39;s override when they set one, the detected platform otherwise; a binary with neither is never matched. Leave empty for no filter | [optional] [enum: windows, linux, android] |
| **architecture** | [**List&lt;String&gt;**](String.md)| Restrict to binaries built for one of these instruction-set architectures. Resolved the same way as platform. Leave empty for no filter | [optional] [enum: x86_64, x86_32, arm_64] |
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

<a id="v3LookupAnalysisByBinaryId"></a>
# **v3LookupAnalysisByBinaryId**
> LookupAnalysisByBinaryIDOutputBody v3LookupAnalysisByBinaryId(binaryId)

Look up the most recent analysis for a binary.

Returns the ID of the most recent analysis of this binary that the caller may see (their own, their team&#39;s, or public). Returns 404 if the binary has none, whether because it has never been analysed or because every analysis of it is private to someone else.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

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
    Long binaryId = 56L; // Long | Binary ID
    try {
      LookupAnalysisByBinaryIDOutputBody result = apiInstance.v3LookupAnalysisByBinaryId(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3LookupAnalysisByBinaryId");
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
| **binaryId** | **Long**| Binary ID | |

### Return type

[**LookupAnalysisByBinaryIDOutputBody**](LookupAnalysisByBinaryIDOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3QueueBinaryExport"></a>
# **v3QueueBinaryExport**
> OperationBinaryExportMetadataBinaryExportResult v3QueueBinaryExport(analysisId)

Queue a binary export

Starts an asynchronous export of the binary with its current symbols rewritten in, and returns the operation to poll for its outcome. Only the owner may call it, and it requires a subscription tier that supports symbol export. Download the result once the operation reports done.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
      OperationBinaryExportMetadataBinaryExportResult result = apiInstance.v3QueueBinaryExport(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3QueueBinaryExport");
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

[**OperationBinaryExportMetadataBinaryExportResult**](OperationBinaryExportMetadataBinaryExportResult.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3SearchTags"></a>
# **v3SearchTags**
> SearchTagsOutputBody v3SearchTags(partialName, limit, offset)

Search tags

Searches for tags by name. partial_name is required and must be at least 3 characters.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

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
    String partialName = "partialName_example"; // String | Partial or full tag name to search for, at least 3 characters
    Long limit = 10L; // Long | Maximum results to return
    Long offset = 0L; // Long | Number of results to skip
    try {
      SearchTagsOutputBody result = apiInstance.v3SearchTags(partialName, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3SearchTags");
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
| **partialName** | **String**| Partial or full tag name to search for, at least 3 characters | [optional] |
| **limit** | **Long**| Maximum results to return | [optional] [default to 10] |
| **offset** | **Long**| Number of results to skip | [optional] [default to 0] |

### Return type

[**SearchTagsOutputBody**](SearchTagsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3UpdateAnalysis"></a>
# **v3UpdateAnalysis**
> AnalysisDetailOutputBody v3UpdateAnalysis(analysisId, updateAnalysisInputBody)

Update an analysis.

Renames the analysis&#39; binary and/or changes its scope. Only the owner may call it. Changing to a non-PUBLIC scope requires a subscription tier that supports private analyses.  **Error codes:** - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
    UpdateAnalysisInputBody updateAnalysisInputBody = new UpdateAnalysisInputBody(); // UpdateAnalysisInputBody | 
    try {
      AnalysisDetailOutputBody result = apiInstance.v3UpdateAnalysis(analysisId, updateAnalysisInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3UpdateAnalysis");
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
| **updateAnalysisInputBody** | [**UpdateAnalysisInputBody**](UpdateAnalysisInputBody.md)|  | |

### Return type

[**AnalysisDetailOutputBody**](AnalysisDetailOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3UpdateAnalysisTags"></a>
# **v3UpdateAnalysisTags**
> AnalysisTagsOutputBody v3UpdateAnalysisTags(analysisId, updateTagsInputBody)

Replace an analysis&#39; tags.

Replaces the analysis&#39; binary&#39;s user tags (origin RevEng) with the given set. A tag recorded under any other origin, such as a heuristic detection sharing a name with a user tag, is left in place even when its name is absent from the request. Only the owner may call it.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

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
    UpdateTagsInputBody updateTagsInputBody = new UpdateTagsInputBody(); // UpdateTagsInputBody | 
    try {
      AnalysisTagsOutputBody result = apiInstance.v3UpdateAnalysisTags(analysisId, updateTagsInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3UpdateAnalysisTags");
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
| **updateTagsInputBody** | [**UpdateTagsInputBody**](UpdateTagsInputBody.md)|  | |

### Return type

[**AnalysisTagsOutputBody**](AnalysisTagsOutputBody.md)

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

<a id="v3UpgradeAnalysisModel"></a>
# **v3UpgradeAnalysisModel**
> UpgradeAnalysisModelOutputBody v3UpgradeAnalysisModel(analysisId)

Re-analyse on the latest model

Re-runs an analysis created on an older model against the current unified model, in place — the analysis ID does not change. No credits are consumed. Only the owner may call it, and only once the analysis has settled: the pipeline clears the binary&#39;s functions, names, data types and signatures before re-running. Returns 409 if the analysis is already on the latest model, or is still running. Poll &#x60;GET /v3/analyses/{analysis_id}/basic&#x60; for status, as with any other run.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

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
      UpgradeAnalysisModelOutputBody result = apiInstance.v3UpgradeAnalysisModel(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#v3UpgradeAnalysisModel");
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

[**UpgradeAnalysisModelOutputBody**](UpgradeAnalysisModelOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

