# AnalysesResultsMetadataApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCapabilities**](AnalysesResultsMetadataApi.md#getCapabilities) | **GET** /v2/analyses/{analysis_id}/capabilities | Gets the capabilities from the analysis |
| [**getCommunities**](AnalysesResultsMetadataApi.md#getCommunities) | **GET** /v2/analyses/{analysis_id}/communities | Gets the communities found in the analysis |
| [**getFunctionsList**](AnalysesResultsMetadataApi.md#getFunctionsList) | **GET** /v2/analyses/{analysis_id}/functions/list | Gets functions from analysis |
| [**getPdf**](AnalysesResultsMetadataApi.md#getPdf) | **GET** /v2/analyses/{analysis_id}/pdf | Gets the PDF found in the analysis |
| [**getSbom**](AnalysesResultsMetadataApi.md#getSbom) | **GET** /v2/analyses/{analysis_id}/sbom | Gets the software-bill-of-materials (SBOM) found in the analysis |
| [**getTags**](AnalysesResultsMetadataApi.md#getTags) | **GET** /v2/analyses/{analysis_id}/tags | Get function tags with maliciousness score |
| [**getVulnerabilities**](AnalysesResultsMetadataApi.md#getVulnerabilities) | **GET** /v2/analyses/{analysis_id}/vulnerabilities | Gets the vulnerabilities found in the analysis |


<a id="getCapabilities"></a>
# **getCapabilities**
> BaseResponseCapabilities getCapabilities(analysisId, authorization)

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCapabilities result = apiInstance.getCapabilities(analysisId, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseCapabilities**](BaseResponseCapabilities.md)

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

<a id="getCommunities"></a>
# **getCommunities**
> BaseResponseCommunities getCommunities(analysisId, userName, authorization)

Gets the communities found in the analysis

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String userName = "userName_example"; // String | The user name to limit communities to
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCommunities result = apiInstance.getCommunities(analysisId, userName, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getCommunities");
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
| **userName** | **String**| The user name to limit communities to | [optional] |
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseCommunities**](BaseResponseCommunities.md)

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

<a id="getFunctionsList"></a>
# **getFunctionsList**
> BaseResponseAnalysisFunctions getFunctionsList(analysisId, searchTerm, minVAddr, maxVAddr, authorization)

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String searchTerm = "searchTerm_example"; // String | 
    Integer minVAddr = 56; // Integer | 
    Integer maxVAddr = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseAnalysisFunctions result = apiInstance.getFunctionsList(analysisId, searchTerm, minVAddr, maxVAddr, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseAnalysisFunctions**](BaseResponseAnalysisFunctions.md)

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

<a id="getPdf"></a>
# **getPdf**
> Object getPdf(analysisId, authorization)

Gets the PDF found in the analysis

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      Object result = apiInstance.getPdf(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getPdf");
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

**Object**

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

<a id="getSbom"></a>
# **getSbom**
> BaseResponseListSBOM getSbom(analysisId, authorization)

Gets the software-bill-of-materials (SBOM) found in the analysis

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListSBOM result = apiInstance.getSbom(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getSbom");
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseListSBOM**](BaseResponseListSBOM.md)

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

<a id="getTags"></a>
# **getTags**
> BaseResponseAnalysisTags getTags(analysisId, authorization)

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseAnalysisTags result = apiInstance.getTags(analysisId, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseAnalysisTags**](BaseResponseAnalysisTags.md)

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

<a id="getVulnerabilities"></a>
# **getVulnerabilities**
> BaseResponseVulnerabilities getVulnerabilities(analysisId, authorization)

Gets the vulnerabilities found in the analysis

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

    AnalysesResultsMetadataApi apiInstance = new AnalysesResultsMetadataApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseVulnerabilities result = apiInstance.getVulnerabilities(analysisId, authorization);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesResultsMetadataApi#getVulnerabilities");
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
| **authorization** | **String**| API Key bearer token | [optional] |

### Return type

[**BaseResponseVulnerabilities**](BaseResponseVulnerabilities.md)

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

