# FirmwareApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getBinariesForFirmwareTask**](FirmwareApi.md#getBinariesForFirmwareTask) | **GET** /v2/firmware/get-binaries/{task_id} | Upload firmware for unpacking |
| [**uploadFirmware**](FirmwareApi.md#uploadFirmware) | **POST** /v2/firmware | Upload firmware for unpacking |


<a id="getBinariesForFirmwareTask"></a>
# **getBinariesForFirmwareTask**
> Object getBinariesForFirmwareTask(taskId)

Upload firmware for unpacking

Uploads a firmware file and begins a &#39;Firmware Unpacker&#39; task. Returns a result identifier, which can be used to poll for the response.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FirmwareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FirmwareApi apiInstance = new FirmwareApi(defaultClient);
    String taskId = "taskId_example"; // String | 
    try {
      Object result = apiInstance.getBinariesForFirmwareTask(taskId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirmwareApi#getBinariesForFirmwareTask");
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
| **taskId** | **String**|  | |

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

<a id="uploadFirmware"></a>
# **uploadFirmware**
> Object uploadFirmware(_file, endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts, password)

Upload firmware for unpacking

Uploads a firmware file and begins a &#39;Firmware Unpacker&#39; task. Returns a result identifier, which can be used to poll for the response.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FirmwareApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    FirmwareApi apiInstance = new FirmwareApi(defaultClient);
    File _file = new File("/path/to/file"); // File | 
    String endpointUrl = "endpointUrl_example"; // String | 
    String localCacheDir = "localCacheDir_example"; // String | 
    Integer localCacheMaxSizeMb = 56; // Integer | 
    String customerSamplesBucket = "customerSamplesBucket_example"; // String | 
    String firmwareSamplesBucket = "firmwareSamplesBucket_example"; // String | 
    Integer maxRetryAttempts = 5; // Integer | 
    String password = "password_example"; // String | 
    try {
      Object result = apiInstance.uploadFirmware(_file, endpointUrl, localCacheDir, localCacheMaxSizeMb, customerSamplesBucket, firmwareSamplesBucket, maxRetryAttempts, password);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FirmwareApi#uploadFirmware");
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
| **_file** | **File**|  | |
| **endpointUrl** | **String**|  | [optional] |
| **localCacheDir** | **String**|  | [optional] |
| **localCacheMaxSizeMb** | **Integer**|  | [optional] |
| **customerSamplesBucket** | **String**|  | [optional] |
| **firmwareSamplesBucket** | **String**|  | [optional] |
| **maxRetryAttempts** | **Integer**|  | [optional] [default to 5] |
| **password** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

