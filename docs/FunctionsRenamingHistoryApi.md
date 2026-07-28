# FunctionsRenamingHistoryApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchRenameFunctions**](FunctionsRenamingHistoryApi.md#batchRenameFunctions) | **POST** /v3/functions/rename | Batch rename functions |
| [**getFunctionHistory**](FunctionsRenamingHistoryApi.md#getFunctionHistory) | **GET** /v3/functions/{function_id}/history | Get function name history |
| [**renameFunction**](FunctionsRenamingHistoryApi.md#renameFunction) | **POST** /v3/functions/{function_id}/rename | Rename a function |
| [**revertFunctionName**](FunctionsRenamingHistoryApi.md#revertFunctionName) | **POST** /v3/functions/{function_id}/history/{history_id}/revert | Revert function name |


<a id="batchRenameFunctions"></a>
# **batchRenameFunctions**
> BatchRenameOutputBody batchRenameFunctions(batchRenameInputBody)

Batch rename functions

Renames multiple functions in a single request. Records name changes in history and copies data types from source functions.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsRenamingHistoryApi;

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    BatchRenameInputBody batchRenameInputBody = new BatchRenameInputBody(); // BatchRenameInputBody | 
    try {
      BatchRenameOutputBody result = apiInstance.batchRenameFunctions(batchRenameInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#batchRenameFunctions");
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
| **batchRenameInputBody** | [**BatchRenameInputBody**](BatchRenameInputBody.md)|  | |

### Return type

[**BatchRenameOutputBody**](BatchRenameOutputBody.md)

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
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getFunctionHistory"></a>
# **getFunctionHistory**
> List&lt;HistoryEntry&gt; getFunctionHistory(functionId)

Get function name history

Returns the name change history for a function, newest first.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsRenamingHistoryApi;

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      List<HistoryEntry> result = apiInstance.getFunctionHistory(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#getFunctionHistory");
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

### Return type

[**List&lt;HistoryEntry&gt;**](HistoryEntry.md)

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

<a id="renameFunction"></a>
# **renameFunction**
> RenameOutputBody renameFunction(functionId, renameInputBody)

Rename a function

Renames a single function and records the change in history.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsRenamingHistoryApi;

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    RenameInputBody renameInputBody = new RenameInputBody(); // RenameInputBody | 
    try {
      RenameOutputBody result = apiInstance.renameFunction(functionId, renameInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#renameFunction");
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
| **renameInputBody** | [**RenameInputBody**](RenameInputBody.md)|  | |

### Return type

[**RenameOutputBody**](RenameOutputBody.md)

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

<a id="revertFunctionName"></a>
# **revertFunctionName**
> Object revertFunctionName(functionId, historyId)

Revert function name

Reverts a function&#39;s name to a previous value from its history.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsRenamingHistoryApi;

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    Long historyId = 56L; // Long | History ID to revert to
    try {
      Object result = apiInstance.revertFunctionName(functionId, historyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#revertFunctionName");
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
| **historyId** | **Long**| History ID to revert to | |

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
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

