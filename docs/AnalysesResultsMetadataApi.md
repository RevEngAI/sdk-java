# AnalysesResultsMetadataApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAnalysisFunctionsPaginated**](AnalysesResultsMetadataApi.md#getAnalysisFunctionsPaginated) | **GET** /v2/analyses/{analysis_id}/functions | Get functions from analysis |
| [**getCapabilities**](AnalysesResultsMetadataApi.md#getCapabilities) | **GET** /v2/analyses/{analysis_id}/capabilities | Gets the capabilities from the analysis |
| [**getFunctionsList**](AnalysesResultsMetadataApi.md#getFunctionsList) | **GET** /v2/analyses/{analysis_id}/functions/list | Gets functions from analysis |
| [**getTags**](AnalysesResultsMetadataApi.md#getTags) | **GET** /v2/analyses/{analysis_id}/tags | Get function tags with maliciousness score |
| [**v3GetAnalysisXref**](AnalysesResultsMetadataApi.md#v3GetAnalysisXref) | **GET** /v3/analyses/{analysis_id}/xrefs/{vaddr} | Look up xrefs by virtual address. |
| [**v3ListAnalysisCapabilities**](AnalysesResultsMetadataApi.md#v3ListAnalysisCapabilities) | **GET** /v3/analyses/{analysis_id}/capabilities | List the capabilities found in an analysis. |
| [**v3ListAnalysisTags**](AnalysesResultsMetadataApi.md#v3ListAnalysisTags) | **GET** /v3/analyses/{analysis_id}/tags | List the tags on an analysis. |


<a id="getAnalysisFunctionsPaginated"></a>
# **getAnalysisFunctionsPaginated**
> BaseResponseAnalysisFunctionsList getAnalysisFunctionsPaginated(analysisId, page, pageSize)

Get functions from analysis

Returns a paginated list of functions identified during analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 1000; // Integer | Number of items per page.
    try {
      BaseResponseAnalysisFunctionsList result = apiInstance.getAnalysisFunctionsPaginated(analysisId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getAnalysisFunctionsPaginated");
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
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 1000] |

### Return type

[**BaseResponseAnalysisFunctionsList**](BaseResponseAnalysisFunctionsList.md)

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

<a id="getCapabilities"></a>
# **getCapabilities**
> BaseResponseCapabilities getCapabilities(analysisId)

Gets the capabilities from the analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseCapabilities result = apiInstance.getCapabilities(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getCapabilities");
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

[**BaseResponseCapabilities**](BaseResponseCapabilities.md)

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

<a id="getFunctionsList"></a>
# **getFunctionsList**
> BaseResponseAnalysisFunctions getFunctionsList(analysisId, searchTerm, minVAddr, maxVAddr, includeEmbeddings, page, pageSize)

Gets functions from analysis

Gets the functions identified during analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String searchTerm = "searchTerm_example"; // String | 
    Integer minVAddr = 56; // Integer | 
    Integer maxVAddr = 56; // Integer | 
    Boolean includeEmbeddings = true; // Boolean | 
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 1000; // Integer | Number of items per page.
    try {
      BaseResponseAnalysisFunctions result = apiInstance.getFunctionsList(analysisId, searchTerm, minVAddr, maxVAddr, includeEmbeddings, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getFunctionsList");
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
| **searchTerm** | **String**|  | [optional] |
| **minVAddr** | **Integer**|  | [optional] |
| **maxVAddr** | **Integer**|  | [optional] |
| **includeEmbeddings** | **Boolean**|  | [optional] [default to true] |
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 1000] |

### Return type

[**BaseResponseAnalysisFunctions**](BaseResponseAnalysisFunctions.md)

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

<a id="getTags"></a>
# **getTags**
> BaseResponseAnalysisTags getTags(analysisId)

Get function tags with maliciousness score

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseAnalysisTags result = apiInstance.getTags(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getTags");
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

[**BaseResponseAnalysisTags**](BaseResponseAnalysisTags.md)

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

<a id="v3GetAnalysisXref"></a>
# **v3GetAnalysisXref**
> AnalysisXrefOutputBody v3GetAnalysisXref(analysisId, vaddr)

Look up xrefs by virtual address.

Returns every cross-reference into and out of a virtual address, read from the analysis&#39; cache.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long vaddr = 56L; // Long | Virtual address to match against xrefs
    try {
      AnalysisXrefOutputBody result = apiInstance.v3GetAnalysisXref(analysisId, vaddr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#v3GetAnalysisXref");
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
| **vaddr** | **Long**| Virtual address to match against xrefs | |

### Return type

[**AnalysisXrefOutputBody**](AnalysisXrefOutputBody.md)

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

<a id="v3ListAnalysisCapabilities"></a>
# **v3ListAnalysisCapabilities**
> AnalysisCapabilitiesOutputBody v3ListAnalysisCapabilities(analysisId)

List the capabilities found in an analysis.

Returns the capabilities the binary-analysis pipeline attributed to the analysis&#39; functions, ordered by function address. This is the static capability set recorded against the binary, not the AI capabilities agent&#39;s findings, which are triggered by &#x60;/v3/analyses/{analysis_id}/capabilities:run&#x60;.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      AnalysisCapabilitiesOutputBody result = apiInstance.v3ListAnalysisCapabilities(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#v3ListAnalysisCapabilities");
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

[**AnalysisCapabilitiesOutputBody**](AnalysisCapabilitiesOutputBody.md)

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

<a id="v3ListAnalysisTags"></a>
# **v3ListAnalysisTags**
> AnalysisTagsOutputBody v3ListAnalysisTags(analysisId)

List the tags on an analysis.

Returns every tag on the analysis&#39; binary, of any origin.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesResultsMetadataApi;

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      AnalysisTagsOutputBody result = apiInstance.v3ListAnalysisTags(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#v3ListAnalysisTags");
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

[**AnalysisTagsOutputBody**](AnalysisTagsOutputBody.md)

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

