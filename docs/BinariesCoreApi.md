# BinariesCoreApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBinaryAdditionalDetails**](BinariesCoreApi.md#getBinaryAdditionalDetails) | **GET** /v3/binaries/{binary_id}/additional-details | Get additional details for a binary. |
| [**getBinaryAdditionalDetailsStatus**](BinariesCoreApi.md#getBinaryAdditionalDetailsStatus) | **GET** /v3/binaries/{binary_id}/additional-details/status | Get the additional-details extraction status for a binary. |


<a id="getBinaryAdditionalDetails"></a>
# **getBinaryAdditionalDetails**
> GetAdditionalDetailsOutputBody getBinaryAdditionalDetails(binaryId)

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
import ai.reveng.api.BinariesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    BinariesCoreApi apiInstance = new BinariesCoreApi(defaultClient);
    Long binaryId = 56L; // Long | Binary ID
    try {
      GetAdditionalDetailsOutputBody result = apiInstance.getBinaryAdditionalDetails(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesCoreApi#getBinaryAdditionalDetails");
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

[APIKey](../README.md#APIKey)

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

<a id="getBinaryAdditionalDetailsStatus"></a>
# **getBinaryAdditionalDetailsStatus**
> GetAdditionalDetailsStatusOutputBody getBinaryAdditionalDetailsStatus(binaryId)

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
import ai.reveng.api.BinariesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    BinariesCoreApi apiInstance = new BinariesCoreApi(defaultClient);
    Long binaryId = 56L; // Long | Binary ID
    try {
      GetAdditionalDetailsStatusOutputBody result = apiInstance.getBinaryAdditionalDetailsStatus(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BinariesCoreApi#getBinaryAdditionalDetailsStatus");
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

[APIKey](../README.md#APIKey)

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

