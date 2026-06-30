# BinariesApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**downloadZippedBinary**](BinariesApi.md#downloadZippedBinary) | **GET** /v2/binaries/{binary_id}/download-zipped | Downloads a zipped binary with password protection |
| [**getBinaryAdditionalDetails**](BinariesApi.md#getBinaryAdditionalDetails) | **GET** /v2/binaries/{binary_id}/additional-details | Gets the additional details of a binary |
| [**getBinaryAdditionalDetailsStatus**](BinariesApi.md#getBinaryAdditionalDetailsStatus) | **GET** /v2/binaries/{binary_id}/additional-details/status | Gets the status of the additional details task for a binary |
| [**getBinaryAdditionalDetailsStatus_0**](BinariesApi.md#getBinaryAdditionalDetailsStatus_0) | **GET** /v3/binaries/{binary_id}/additional-details/status | Get the additional-details extraction status for a binary. |
| [**getBinaryAdditionalDetails_0**](BinariesApi.md#getBinaryAdditionalDetails_0) | **GET** /v3/binaries/{binary_id}/additional-details | Get additional details for a binary. |
| [**getBinaryDetails**](BinariesApi.md#getBinaryDetails) | **GET** /v2/binaries/{binary_id}/details | Gets the details of a binary |
| [**getBinaryDieInfo**](BinariesApi.md#getBinaryDieInfo) | **GET** /v2/binaries/{binary_id}/die-info | Gets the die info of a binary |
| [**getBinaryExternals**](BinariesApi.md#getBinaryExternals) | **GET** /v2/binaries/{binary_id}/externals | Gets the external details of a binary |
| [**getBinaryRelatedStatus**](BinariesApi.md#getBinaryRelatedStatus) | **GET** /v2/binaries/{binary_id}/related/status | Gets the status of the unpack binary task for a binary |
| [**getRelatedBinaries**](BinariesApi.md#getRelatedBinaries) | **GET** /v2/binaries/{binary_id}/related | Gets the related binaries of a binary. |


<a id="downloadZippedBinary"></a>
# **downloadZippedBinary**
> File downloadZippedBinary(binaryId)

Downloads a zipped binary with password protection

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      File result = apiInstance.downloadZippedBinary(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#downloadZippedBinary");
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

[**File**](File.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download file |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getBinaryAdditionalDetails"></a>
# **getBinaryAdditionalDetails**
> BaseResponseBinaryAdditionalResponse getBinaryAdditionalDetails(binaryId)

Gets the additional details of a binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseBinaryAdditionalResponse result = apiInstance.getBinaryAdditionalDetails(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryAdditionalDetails");
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

[**BaseResponseBinaryAdditionalResponse**](BaseResponseBinaryAdditionalResponse.md)

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

<a id="getBinaryAdditionalDetailsStatus"></a>
# **getBinaryAdditionalDetailsStatus**
> BaseResponseAdditionalDetailsStatusResponse getBinaryAdditionalDetailsStatus(binaryId)

Gets the status of the additional details task for a binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseAdditionalDetailsStatusResponse result = apiInstance.getBinaryAdditionalDetailsStatus(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryAdditionalDetailsStatus");
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

[**BaseResponseAdditionalDetailsStatusResponse**](BaseResponseAdditionalDetailsStatusResponse.md)

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

<a id="getBinaryAdditionalDetailsStatus_0"></a>
# **getBinaryAdditionalDetailsStatus_0**
> GetAdditionalDetailsStatusOutputBody getBinaryAdditionalDetailsStatus_0(binaryId)

Get the additional-details extraction status for a binary.

Returns the status of the additional-details extraction task. One of &#x60;UNINITIALISED&#x60;, &#x60;PENDING&#x60;, &#x60;RUNNING&#x60;, &#x60;COMPLETED&#x60;, &#x60;FAILED&#x60;.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Long binaryId = 56L; // Long | Binary ID
    try {
      GetAdditionalDetailsStatusOutputBody result = apiInstance.getBinaryAdditionalDetailsStatus_0(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryAdditionalDetailsStatus_0");
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

[**GetAdditionalDetailsStatusOutputBody**](GetAdditionalDetailsStatusOutputBody.md)

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

<a id="getBinaryAdditionalDetails_0"></a>
# **getBinaryAdditionalDetails_0**
> GetAdditionalDetailsOutputBody getBinaryAdditionalDetails_0(binaryId)

Get additional details for a binary.

Returns structured metadata extracted by the additional-details pipeline for the given binary. Returns &#x60;null&#x60; for &#x60;details&#x60; when the pipeline has not yet run.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Long binaryId = 56L; // Long | Binary ID
    try {
      GetAdditionalDetailsOutputBody result = apiInstance.getBinaryAdditionalDetails_0(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryAdditionalDetails_0");
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

[**GetAdditionalDetailsOutputBody**](GetAdditionalDetailsOutputBody.md)

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

<a id="getBinaryDetails"></a>
# **getBinaryDetails**
> BaseResponseBinaryDetailsResponse getBinaryDetails(binaryId)

Gets the details of a binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseBinaryDetailsResponse result = apiInstance.getBinaryDetails(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryDetails");
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

[**BaseResponseBinaryDetailsResponse**](BaseResponseBinaryDetailsResponse.md)

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

<a id="getBinaryDieInfo"></a>
# **getBinaryDieInfo**
> BaseResponseListDieMatch getBinaryDieInfo(binaryId)

Gets the die info of a binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseListDieMatch result = apiInstance.getBinaryDieInfo(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryDieInfo");
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

[**BaseResponseListDieMatch**](BaseResponseListDieMatch.md)

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

<a id="getBinaryExternals"></a>
# **getBinaryExternals**
> BaseResponseBinaryExternalsResponse getBinaryExternals(binaryId)

Gets the external details of a binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseBinaryExternalsResponse result = apiInstance.getBinaryExternals(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryExternals");
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

[**BaseResponseBinaryExternalsResponse**](BaseResponseBinaryExternalsResponse.md)

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

<a id="getBinaryRelatedStatus"></a>
# **getBinaryRelatedStatus**
> BaseResponseBinariesRelatedStatusResponse getBinaryRelatedStatus(binaryId)

Gets the status of the unpack binary task for a binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseBinariesRelatedStatusResponse result = apiInstance.getBinaryRelatedStatus(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getBinaryRelatedStatus");
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

[**BaseResponseBinariesRelatedStatusResponse**](BaseResponseBinariesRelatedStatusResponse.md)

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

<a id="getRelatedBinaries"></a>
# **getRelatedBinaries**
> BaseResponseChildBinariesResponse getRelatedBinaries(binaryId)

Gets the related binaries of a binary.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BinariesApi;

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

    BinariesApi apiInstance = new BinariesApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      BaseResponseChildBinariesResponse result = apiInstance.getRelatedBinaries(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesApi#getRelatedBinaries");
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

[**BaseResponseChildBinariesResponse**](BaseResponseChildBinariesResponse.md)

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
| **403** | Forbidden |  -  |

