# FunctionsCoreApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addFunctionCallee**](FunctionsCoreApi.md#addFunctionCallee) | **POST** /v3/functions/{function_id}/callees | Add a callee to a function |
| [**addUserStringToFunction**](FunctionsCoreApi.md#addUserStringToFunction) | **POST** /v3/functions/{function_id}/user-provided-strings | Add a user-provided string to a function. |
| [**getFunctionBlocks**](FunctionsCoreApi.md#getFunctionBlocks) | **GET** /v3/functions/{function_id}/blocks | Get function disassembly |
| [**getFunctionCalleesCallers**](FunctionsCoreApi.md#getFunctionCalleesCallers) | **GET** /v3/functions/{function_id}/callees-callers | Get callees and callers for a function |
| [**getFunctionCapabilities**](FunctionsCoreApi.md#getFunctionCapabilities) | **GET** /v3/functions/{function_id}/capabilities | Get capabilities for a function |
| [**getFunctionDetails**](FunctionsCoreApi.md#getFunctionDetails) | **GET** /v3/functions/{function_id} | Get function details |
| [**getFunctionIndirectCallSites**](FunctionsCoreApi.md#getFunctionIndirectCallSites) | **GET** /v3/functions/{function_id}/indirect-call-sites | Get indirect call sites for a function |
| [**getFunctionStrings**](FunctionsCoreApi.md#getFunctionStrings) | **GET** /v3/functions/{function_id}/strings | List strings for a function. |
| [**getFunctionsCalleesCallers**](FunctionsCoreApi.md#getFunctionsCalleesCallers) | **GET** /v3/functions/callees-callers | Get callees and callers for many functions |
| [**getFunctionsMatches**](FunctionsCoreApi.md#getFunctionsMatches) | **GET** /v3/functions/matches | Get function-matching results for an explicit set of functions |
| [**getFunctionsMatchingStatus**](FunctionsCoreApi.md#getFunctionsMatchingStatus) | **GET** /v3/functions/matches/status | Get function-matching status for an explicit set of functions |
| [**getImportedFunction**](FunctionsCoreApi.md#getImportedFunction) | **GET** /v3/analyses/{analysis_id}/imported-functions/{imported_function_id} | Get an imported function with its callers |
| [**listAnalysisFunctions**](FunctionsCoreApi.md#listAnalysisFunctions) | **GET** /v3/analyses/{analysis_id}/functions | List functions in an analysis |
| [**listImportedFunctions**](FunctionsCoreApi.md#listImportedFunctions) | **GET** /v3/analyses/{analysis_id}/imported-functions | List imported functions in an analysis |
| [**startFunctionsMatching**](FunctionsCoreApi.md#startFunctionsMatching) | **POST** /v3/functions/matches | Start function matching for an explicit set of functions |
| [**v3CanonicalizeFunctionNames**](FunctionsCoreApi.md#v3CanonicalizeFunctionNames) | **POST** /v3/functions/canonical-names | Canonicalize a batch of function names |


<a id="addFunctionCallee"></a>
# **addFunctionCallee**
> Object addFunctionCallee(functionId, addCalleeInputBody)

Add a callee to a function

Records an outgoing call edge from the given function to a callee.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    AddCalleeInputBody addCalleeInputBody = new AddCalleeInputBody(); // AddCalleeInputBody | 
    try {
      Object result = apiInstance.addFunctionCallee(functionId, addCalleeInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#addFunctionCallee");
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
| **addCalleeInputBody** | [**AddCalleeInputBody**](AddCalleeInputBody.md)|  | |

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
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="addUserStringToFunction"></a>
# **addUserStringToFunction**
> Object addUserStringToFunction(functionId, addUserStringToFunctionInputBody)

Add a user-provided string to a function.

Attaches a user-provided string to a function at the given virtual address. The string is stored with source &#x60;USER&#x60; and complements strings discovered automatically during analysis.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    AddUserStringToFunctionInputBody addUserStringToFunctionInputBody = new AddUserStringToFunctionInputBody(); // AddUserStringToFunctionInputBody | 
    try {
      Object result = apiInstance.addUserStringToFunction(functionId, addUserStringToFunctionInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#addUserStringToFunction");
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
| **addUserStringToFunctionInputBody** | [**AddUserStringToFunctionInputBody**](AddUserStringToFunctionInputBody.md)|  | |

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

<a id="getFunctionBlocks"></a>
# **getFunctionBlocks**
> DisassemblyOutputBody getFunctionBlocks(functionId)

Get function disassembly

Returns the function&#39;s disassembly metadata (JSON blob containing basic blocks + local variables) along with parameter and return-type info.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      DisassemblyOutputBody result = apiInstance.getFunctionBlocks(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionBlocks");
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

[**DisassemblyOutputBody**](DisassemblyOutputBody.md)

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

<a id="getFunctionCalleesCallers"></a>
# **getFunctionCalleesCallers**
> CallEdgesOutputBody getFunctionCalleesCallers(functionId)

Get callees and callers for a function

Returns both the outgoing call edges (callees) and incoming call edges (callers) for a single function.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      CallEdgesOutputBody result = apiInstance.getFunctionCalleesCallers(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionCalleesCallers");
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

[**CallEdgesOutputBody**](CallEdgesOutputBody.md)

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

<a id="getFunctionCapabilities"></a>
# **getFunctionCapabilities**
> CapabilitiesOutputBody getFunctionCapabilities(functionId)

Get capabilities for a function

Returns the capability findings (CAPA-style behaviour matches) associated with the given function.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      CapabilitiesOutputBody result = apiInstance.getFunctionCapabilities(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionCapabilities");
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

[**CapabilitiesOutputBody**](CapabilitiesOutputBody.md)

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

<a id="getFunctionDetails"></a>
# **getFunctionDetails**
> FunctionDetailsOutputBody getFunctionDetails(functionId)

Get function details

Returns metadata for a single function — name, virtual address, size, debug status, binary it belongs to.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      FunctionDetailsOutputBody result = apiInstance.getFunctionDetails(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionDetails");
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

[**FunctionDetailsOutputBody**](FunctionDetailsOutputBody.md)

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

<a id="getFunctionIndirectCallSites"></a>
# **getFunctionIndirectCallSites**
> IndirectCallSitesOutputBody getFunctionIndirectCallSites(functionId)

Get indirect call sites for a function

Returns the function&#39;s indirect call instructions with their resolved call target.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    try {
      IndirectCallSitesOutputBody result = apiInstance.getFunctionIndirectCallSites(functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionIndirectCallSites");
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

[**IndirectCallSitesOutputBody**](IndirectCallSitesOutputBody.md)

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

<a id="getFunctionStrings"></a>
# **getFunctionStrings**
> ListFunctionStringsOutputBody getFunctionStrings(functionId, page, pageSize, search)

List strings for a function.

Returns the strings discovered in a function. Supports value search and pagination.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long functionId = 56L; // Long | Function ID
    Long page = 1L; // Long | Page number (1-indexed).
    Long pageSize = 100L; // Long | Number of results per page.
    String search = "search_example"; // String | Filter by string value (case-insensitive substring match).
    try {
      ListFunctionStringsOutputBody result = apiInstance.getFunctionStrings(functionId, page, pageSize, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionStrings");
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
| **page** | **Long**| Page number (1-indexed). | [optional] [default to 1] |
| **pageSize** | **Long**| Number of results per page. | [optional] [default to 100] |
| **search** | **String**| Filter by string value (case-insensitive substring match). | [optional] |

### Return type

[**ListFunctionStringsOutputBody**](ListFunctionStringsOutputBody.md)

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

<a id="getFunctionsCalleesCallers"></a>
# **getFunctionsCalleesCallers**
> CallEdgesOutputBody getFunctionsCalleesCallers(functionIds)

Get callees and callers for many functions

Bulk variant — pass &#x60;function_ids&#x60; as a query parameter (comma-separated or repeated). Caller must have access to every supplied function or the whole request is rejected.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    List<Long> functionIds = Arrays.asList(); // List<Long> | Function IDs to fetch edges for.
    try {
      CallEdgesOutputBody result = apiInstance.getFunctionsCalleesCallers(functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionsCalleesCallers");
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
| **functionIds** | [**List&lt;Long&gt;**](Long.md)| Function IDs to fetch edges for. | |

### Return type

[**CallEdgesOutputBody**](CallEdgesOutputBody.md)

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

<a id="getFunctionsMatches"></a>
# **getFunctionsMatches**
> GetMatchesOutputBody getFunctionsMatches(matchId, functionIds)

Get function-matching results for an explicit set of functions

Returns the matches blob when the matching workflow has completed. While the workflow is in progress this endpoint returns the current status with no matches; use /matches/status to poll progress.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    String matchId = "matchId_example"; // String | Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest.
    List<Long> functionIds = Arrays.asList(); // List<Long> | Source function IDs whose matches to fetch. Required unless match_id is supplied.
    try {
      GetMatchesOutputBody result = apiInstance.getFunctionsMatches(matchId, functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionsMatches");
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
| **matchId** | **String**| Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest. | [optional] |
| **functionIds** | [**List&lt;Long&gt;**](Long.md)| Source function IDs whose matches to fetch. Required unless match_id is supplied. | [optional] |

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

<a id="getFunctionsMatchingStatus"></a>
# **getFunctionsMatchingStatus**
> GetMatchesStatusOutputBody getFunctionsMatchingStatus(matchId, functionIds)

Get function-matching status for an explicit set of functions

Returns the matching workflow&#39;s current status for the supplied function IDs. Does not include the matches blob — use GET /matches for that.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    String matchId = "matchId_example"; // String | Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest.
    List<Long> functionIds = Arrays.asList(); // List<Long> | Source function IDs whose matches to fetch. Required unless match_id is supplied.
    try {
      GetMatchesStatusOutputBody result = apiInstance.getFunctionsMatchingStatus(matchId, functionIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getFunctionsMatchingStatus");
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
| **matchId** | **String**| Opaque token from a start-matching response. When supplied, returns that specific run instead of the latest. | [optional] |
| **functionIds** | [**List&lt;Long&gt;**](Long.md)| Source function IDs whose matches to fetch. Required unless match_id is supplied. | [optional] |

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

<a id="getImportedFunction"></a>
# **getImportedFunction**
> ImportedFunctionDetailOutputBody getImportedFunction(analysisId, importedFunctionId)

Get an imported function with its callers

Returns a single imported symbol plus the internal functions that call it, resolved via the import&#39;s PLT/stub addresses within the binary. Answers \&quot;which functions call &#x60;free&#x60;?\&quot; for binary navigation.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long importedFunctionId = 56L; // Long | Imported function ID
    try {
      ImportedFunctionDetailOutputBody result = apiInstance.getImportedFunction(analysisId, importedFunctionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#getImportedFunction");
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
| **importedFunctionId** | **Long**| Imported function ID | |

### Return type

[**ImportedFunctionDetailOutputBody**](ImportedFunctionDetailOutputBody.md)

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

<a id="listAnalysisFunctions"></a>
# **listAnalysisFunctions**
> ListAnalysisFunctionsOutputBody listAnalysisFunctions(analysisId, offset, limit)

List functions in an analysis

Returns a paginated list of functions belonging to the analysis. &#x60;total_count&#x60; is the full population size, ignoring pagination.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long offset = 56L; // Long | Pagination offset. Defaults to 0.
    Long limit = 56L; // Long | Page size. Defaults to 100.
    try {
      ListAnalysisFunctionsOutputBody result = apiInstance.listAnalysisFunctions(analysisId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#listAnalysisFunctions");
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
| **offset** | **Long**| Pagination offset. Defaults to 0. | [optional] |
| **limit** | **Long**| Page size. Defaults to 100. | [optional] |

### Return type

[**ListAnalysisFunctionsOutputBody**](ListAnalysisFunctionsOutputBody.md)

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

<a id="listImportedFunctions"></a>
# **listImportedFunctions**
> ListImportedFunctionsOutputBody listImportedFunctions(analysisId, offset, limit)

List imported functions in an analysis

Returns a paginated list of external/imported symbols (e.g. libc&#39;s &#x60;free&#x60;) linked by the analysis&#39;s binary. These are display-only: they carry no embeddings, cannot be renamed, and never participate in match/diff. &#x60;total_count&#x60; is the full population size, ignoring pagination.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long offset = 56L; // Long | Pagination offset. Defaults to 0.
    Long limit = 56L; // Long | Page size. Defaults to 100.
    try {
      ListImportedFunctionsOutputBody result = apiInstance.listImportedFunctions(analysisId, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#listImportedFunctions");
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
| **offset** | **Long**| Pagination offset. Defaults to 0. | [optional] |
| **limit** | **Long**| Page size. Defaults to 100. | [optional] |

### Return type

[**ListImportedFunctionsOutputBody**](ListImportedFunctionsOutputBody.md)

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

<a id="startFunctionsMatching"></a>
# **startFunctionsMatching**
> StartMatchingOutputBody startFunctionsMatching(startMatchingForFunctionsInputBody)

Start function matching for an explicit set of functions

Dispatches the function-matching workflow against the provided function IDs. Returns immediately. Poll the status endpoint for progress; fetch results from the matches endpoint when status&#x3D;COMPLETED.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    StartMatchingForFunctionsInputBody startMatchingForFunctionsInputBody = new StartMatchingForFunctionsInputBody(); // StartMatchingForFunctionsInputBody | 
    try {
      StartMatchingOutputBody result = apiInstance.startFunctionsMatching(startMatchingForFunctionsInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#startFunctionsMatching");
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
| **startMatchingForFunctionsInputBody** | [**StartMatchingForFunctionsInputBody**](StartMatchingForFunctionsInputBody.md)|  | |

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

<a id="v3CanonicalizeFunctionNames"></a>
# **v3CanonicalizeFunctionNames**
> CanonicalizeNamesOutputBody v3CanonicalizeFunctionNames(canonicalizeNamesInputBody)

Canonicalize a batch of function names

Accepts up to 25 raw function names and returns their canonical forms in the same order. A name with no canonical form is returned unchanged.  **Error codes:** - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;503&#x60; [&#x60;SERVICE_UNAVAILABLE&#x60;](/errors/SERVICE_UNAVAILABLE) — Service Unavailable

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.FunctionsCoreApi;

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

    FunctionsCoreApi apiInstance = new FunctionsCoreApi(defaultClient);
    CanonicalizeNamesInputBody canonicalizeNamesInputBody = new CanonicalizeNamesInputBody(); // CanonicalizeNamesInputBody | 
    try {
      CanonicalizeNamesOutputBody result = apiInstance.v3CanonicalizeFunctionNames(canonicalizeNamesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FunctionsCoreApi#v3CanonicalizeFunctionNames");
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
| **canonicalizeNamesInputBody** | [**CanonicalizeNamesInputBody**](CanonicalizeNamesInputBody.md)|  | |

### Return type

[**CanonicalizeNamesOutputBody**](CanonicalizeNamesOutputBody.md)

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
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |
| **503** | Service Unavailable |  -  |

