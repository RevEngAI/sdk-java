# AnalysesXRefsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getXrefByVaddr**](AnalysesXRefsApi.md#getXrefByVaddr) | **GET** /v2/analyses/{analysis_id}/xrefs/{vaddr} | [Beta] Look up an xref by virtual address |


<a id="getXrefByVaddr"></a>
# **getXrefByVaddr**
> BaseResponseXRef getXrefByVaddr(analysisId, vaddr)

[Beta] Look up an xref by virtual address

**This endpoint is in beta and may change without notice.**

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesXRefsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesXRefsApi apiInstance = new AnalysesXRefsApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    Integer vaddr = 56; // Integer | Virtual address to match against xref_to
    try {
      BaseResponseXRef result = apiInstance.getXrefByVaddr(analysisId, vaddr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesXRefsApi#getXrefByVaddr");
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
| **vaddr** | **Integer**| Virtual address to match against xref_to | |

### Return type

[**BaseResponseXRef**](BaseResponseXRef.md)

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
| **404** | Xref or analysis cache not found |  -  |

