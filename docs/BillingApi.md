# BillingApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3GetCreditEstimates**](BillingApi.md#v3GetCreditEstimates) | **GET** /v3/credit-estimates | Get credit estimates. |


<a id="v3GetCreditEstimates"></a>
# **v3GetCreditEstimates**
> GetCreditEstimatesOutputBody v3GetCreditEstimates()

Get credit estimates.

Returns the table for estimating, before a binary is analysed, the credits creating an analysis of it will use. Find the size bucket the binary&#39;s size in bytes falls in; each requested operation, plus &#x60;binary-analysis&#x60;, is estimated to cost &#x60;base_credits + credits_per_function × functions&#x60;. The estimate is calibrated to come in at or above most real runs, but it is not a quote: what is charged depends on the binary.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.BillingApi;

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

    BillingApi apiInstance = new BillingApi(defaultClient);
    try {
      GetCreditEstimatesOutputBody result = apiInstance.v3GetCreditEstimates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#v3GetCreditEstimates");
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

[**GetCreditEstimatesOutputBody**](GetCreditEstimatesOutputBody.md)

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

