# FunctionsRenamingHistoryApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchRenameFunction**](FunctionsRenamingHistoryApi.md#batchRenameFunction) | **POST** /v2/functions/rename/batch | Batch Rename Functions |
| [**getFunctionNameHistory**](FunctionsRenamingHistoryApi.md#getFunctionNameHistory) | **GET** /v2/functions/history/{function_id} | Get Function Name History |
| [**renameFunctionId**](FunctionsRenamingHistoryApi.md#renameFunctionId) | **POST** /v2/functions/rename/{function_id} | Rename Function |
| [**revertFunctionName**](FunctionsRenamingHistoryApi.md#revertFunctionName) | **POST** /v2/functions/history/{function_id}/{history_id} | Revert the function name |


<a id="batchRenameFunction"></a>
# **batchRenameFunction**
> BaseResponse batchRenameFunction(functionsListRename)

Batch Rename Functions

Renames a list of functions using the function IDs   Will record name changes in history

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    FunctionsListRename functionsListRename = new FunctionsListRename(); // FunctionsListRename | 
    try {
      BaseResponse result = apiInstance.batchRenameFunction(functionsListRename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#batchRenameFunction");
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
| **functionsListRename** | [**FunctionsListRename**](FunctionsListRename.md)|  | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="getFunctionNameHistory"></a>
# **getFunctionNameHistory**
> BaseResponseListFunctionNameHistory getFunctionNameHistory(functionId)

Get Function Name History

Gets the name history of a function using the function ID

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    Integer functionId = 56; // Integer | 
    try {
      BaseResponseListFunctionNameHistory result = apiInstance.getFunctionNameHistory(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#getFunctionNameHistory");
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
| **functionId** | **Integer**|  | |

### Return type

[**BaseResponseListFunctionNameHistory**](BaseResponseListFunctionNameHistory.md)

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

<a id="renameFunctionId"></a>
# **renameFunctionId**
> BaseResponse renameFunctionId(functionId, functionRename)

Rename Function

Renames a function using the function ID   Will record name change history

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    Integer functionId = 56; // Integer | 
    FunctionRename functionRename = new FunctionRename(); // FunctionRename | 
    try {
      BaseResponse result = apiInstance.renameFunctionId(functionId, functionRename);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsRenamingHistoryApi#renameFunctionId");
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
| **functionId** | **Integer**|  | |
| **functionRename** | [**FunctionRename**](FunctionRename.md)|  | |

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

<a id="revertFunctionName"></a>
# **revertFunctionName**
> BaseResponse revertFunctionName(functionId, historyId)

Revert the function name

Reverts the function name to a previous name using the function ID and history ID

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

    FunctionsRenamingHistoryApi apiInstance = new FunctionsRenamingHistoryApi(defaultClient);
    Integer functionId = 56; // Integer | 
    Integer historyId = 56; // Integer | 
    try {
      BaseResponse result = apiInstance.revertFunctionName(functionId, historyId);
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
| **functionId** | **Integer**|  | |
| **historyId** | **Integer**|  | |

### Return type

[**BaseResponse**](BaseResponse.md)

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

