# YaraApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3AddYaraCollectionRule**](YaraApi.md#v3AddYaraCollectionRule) | **POST** /v3/yara/collections/{id}/rules | Add a rule to a collection |
| [**v3CancelYaraScan**](YaraApi.md#v3CancelYaraScan) | **POST** /v3/yara/scans/{id}/cancel | Cancel a scan |
| [**v3CreateYaraCollection**](YaraApi.md#v3CreateYaraCollection) | **POST** /v3/yara/collections | Create a collection |
| [**v3CreateYaraRule**](YaraApi.md#v3CreateYaraRule) | **POST** /v3/yara/rules | Create a YARA rule |
| [**v3CreateYaraScan**](YaraApi.md#v3CreateYaraScan) | **POST** /v3/yara/scans | Run a scan |
| [**v3DeleteYaraCollection**](YaraApi.md#v3DeleteYaraCollection) | **DELETE** /v3/yara/collections/{id} | Delete a collection |
| [**v3DeleteYaraRule**](YaraApi.md#v3DeleteYaraRule) | **DELETE** /v3/yara/rules/{id} | Delete a YARA rule |
| [**v3GetYaraCollection**](YaraApi.md#v3GetYaraCollection) | **GET** /v3/yara/collections/{id} | Get a collection |
| [**v3GetYaraRule**](YaraApi.md#v3GetYaraRule) | **GET** /v3/yara/rules/{id} | Get a YARA rule |
| [**v3GetYaraRuleVersions**](YaraApi.md#v3GetYaraRuleVersions) | **GET** /v3/yara/rules/{id}/versions | Get a YARA rule&#39;s version history |
| [**v3GetYaraScan**](YaraApi.md#v3GetYaraScan) | **GET** /v3/yara/scans/{id} | Get scan status |
| [**v3ListYaraCollections**](YaraApi.md#v3ListYaraCollections) | **GET** /v3/yara/collections | List collections |
| [**v3ListYaraDatasets**](YaraApi.md#v3ListYaraDatasets) | **GET** /v3/yara/datasets | List scan datasets |
| [**v3ListYaraRules**](YaraApi.md#v3ListYaraRules) | **GET** /v3/yara/rules | List YARA rules |
| [**v3ListYaraScanMatches**](YaraApi.md#v3ListYaraScanMatches) | **GET** /v3/yara/scans/{id}/matches | List scan matches |
| [**v3ListYaraScans**](YaraApi.md#v3ListYaraScans) | **GET** /v3/yara/scans | List scans |
| [**v3RemoveYaraCollectionRule**](YaraApi.md#v3RemoveYaraCollectionRule) | **DELETE** /v3/yara/collections/{id}/rules/{rule_id} | Remove a rule from a collection |
| [**v3UpdateYaraRule**](YaraApi.md#v3UpdateYaraRule) | **PUT** /v3/yara/rules/{id} | Update a YARA rule |
| [**v3ValidateYaraRules**](YaraApi.md#v3ValidateYaraRules) | **POST** /v3/yara/rules/validate | Validate YARA rules |


<a id="v3AddYaraCollectionRule"></a>
# **v3AddYaraCollectionRule**
> DeleteOutputBody v3AddYaraCollectionRule(id, addRuleInputBody)

Add a rule to a collection

Adds a library rule to the collection (or updates its pinned version). Omit version to follow the rule&#39;s current version.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    AddRuleInputBody addRuleInputBody = new AddRuleInputBody(); // AddRuleInputBody | 
    try {
      DeleteOutputBody result = apiInstance.v3AddYaraCollectionRule(id, addRuleInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3AddYaraCollectionRule");
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
| **id** | **Long**|  | |
| **addRuleInputBody** | [**AddRuleInputBody**](AddRuleInputBody.md)|  | |

### Return type

[**DeleteOutputBody**](DeleteOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CancelYaraScan"></a>
# **v3CancelYaraScan**
> CancelScanOutputBody v3CancelYaraScan(id)

Cancel a scan

Requests cancellation of a running asynchronous scan. Already-finished or synchronous scans return a conflict.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      CancelScanOutputBody result = apiInstance.v3CancelYaraScan(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3CancelYaraScan");
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
| **id** | **Long**|  | |

### Return type

[**CancelScanOutputBody**](CancelScanOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CreateYaraCollection"></a>
# **v3CreateYaraCollection**
> Collection v3CreateYaraCollection(createCollectionInputBody)

Create a collection

Creates a named, shared collection of library rules that a scan can run as a unit.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    CreateCollectionInputBody createCollectionInputBody = new CreateCollectionInputBody(); // CreateCollectionInputBody | 
    try {
      Collection result = apiInstance.v3CreateYaraCollection(createCollectionInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3CreateYaraCollection");
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
| **createCollectionInputBody** | [**CreateCollectionInputBody**](CreateCollectionInputBody.md)|  | |

### Return type

[**Collection**](Collection.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CreateYaraRule"></a>
# **v3CreateYaraRule**
> Rule v3CreateYaraRule(createRuleInputBody)

Create a YARA rule

Saves a rule to the shared library under a unique name. The source is validated first; an uncompilable source is rejected.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed - &#x60;409&#x60; [&#x60;ALREADY_EXISTS&#x60;](/errors/ALREADY_EXISTS) — Already Exists

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    CreateRuleInputBody createRuleInputBody = new CreateRuleInputBody(); // CreateRuleInputBody | 
    try {
      Rule result = apiInstance.v3CreateYaraRule(createRuleInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3CreateYaraRule");
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
| **createRuleInputBody** | [**CreateRuleInputBody**](CreateRuleInputBody.md)|  | |

### Return type

[**Rule**](Rule.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CreateYaraScan"></a>
# **v3CreateYaraScan**
> CreateScanResponse v3CreateYaraScan(createScanInputBody)

Run a scan

Runs a set of rules (inline or by library reference) over a dataset. Small datasets scan synchronously and return the per-file matches inline; datasets over the synchronous limit are dispatched asynchronously and return a scan id to poll. The run mode can be forced with &#x60;mode&#x60;.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    CreateScanInputBody createScanInputBody = new CreateScanInputBody(); // CreateScanInputBody | 
    try {
      CreateScanResponse result = apiInstance.v3CreateYaraScan(createScanInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3CreateYaraScan");
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
| **createScanInputBody** | [**CreateScanInputBody**](CreateScanInputBody.md)|  | |

### Return type

[**CreateScanResponse**](CreateScanResponse.md)

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3DeleteYaraCollection"></a>
# **v3DeleteYaraCollection**
> DeleteOutputBody v3DeleteYaraCollection(id)

Delete a collection

Deletes a collection. The underlying rules and past scan results are untouched.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      DeleteOutputBody result = apiInstance.v3DeleteYaraCollection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3DeleteYaraCollection");
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
| **id** | **Long**|  | |

### Return type

[**DeleteOutputBody**](DeleteOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3DeleteYaraRule"></a>
# **v3DeleteYaraRule**
> v3DeleteYaraRule(id)

Delete a YARA rule

Removes a rule. Results of past scans that referenced it are untouched.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      apiInstance.v3DeleteYaraRule(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3DeleteYaraRule");
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
| **id** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetYaraCollection"></a>
# **v3GetYaraCollection**
> GetCollectionOutputBody v3GetYaraCollection(id)

Get a collection

Returns a collection with its member rules (name, effective version, and whether the version is pinned).  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      GetCollectionOutputBody result = apiInstance.v3GetYaraCollection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3GetYaraCollection");
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
| **id** | **Long**|  | |

### Return type

[**GetCollectionOutputBody**](GetCollectionOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetYaraRule"></a>
# **v3GetYaraRule**
> Rule v3GetYaraRule(id, version)

Get a YARA rule

Returns a rule with its current source, or a specific version&#39;s source when &#x60;version&#x60; is set.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    Long version = 0L; // Long | Version to fetch; 0 (default) is the current version
    try {
      Rule result = apiInstance.v3GetYaraRule(id, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3GetYaraRule");
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
| **id** | **Long**|  | |
| **version** | **Long**| Version to fetch; 0 (default) is the current version | [optional] [default to 0] |

### Return type

[**Rule**](Rule.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetYaraRuleVersions"></a>
# **v3GetYaraRuleVersions**
> VersionsOutputBody v3GetYaraRuleVersions(id)

Get a YARA rule&#39;s version history

Returns a rule&#39;s versions, newest first.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      VersionsOutputBody result = apiInstance.v3GetYaraRuleVersions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3GetYaraRuleVersions");
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
| **id** | **Long**|  | |

### Return type

[**VersionsOutputBody**](VersionsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetYaraScan"></a>
# **v3GetYaraScan**
> ScanStatusResponse v3GetYaraScan(id)

Get scan status

Returns a scan&#39;s status and progress. For a running asynchronous scan the live workflow progress is included.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    try {
      ScanStatusResponse result = apiInstance.v3GetYaraScan(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3GetYaraScan");
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
| **id** | **Long**|  | |

### Return type

[**ScanStatusResponse**](ScanStatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3ListYaraCollections"></a>
# **v3ListYaraCollections**
> ListCollectionsOutputBody v3ListYaraCollections()

List collections

Lists the rule collections, each with its rule count.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    try {
      ListCollectionsOutputBody result = apiInstance.v3ListYaraCollections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3ListYaraCollections");
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

[**ListCollectionsOutputBody**](ListCollectionsOutputBody.md)

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

<a id="v3ListYaraDatasets"></a>
# **v3ListYaraDatasets**
> ListDatasetsOutputBody v3ListYaraDatasets()

List scan datasets

Lists the datasets available to scan, each with its file count.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    try {
      ListDatasetsOutputBody result = apiInstance.v3ListYaraDatasets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3ListYaraDatasets");
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

[**ListDatasetsOutputBody**](ListDatasetsOutputBody.md)

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

<a id="v3ListYaraRules"></a>
# **v3ListYaraRules**
> ListRulesOutputBody v3ListYaraRules()

List YARA rules

Returns every rule in the shared library with its current source.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    try {
      ListRulesOutputBody result = apiInstance.v3ListYaraRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3ListYaraRules");
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

[**ListRulesOutputBody**](ListRulesOutputBody.md)

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

<a id="v3ListYaraScanMatches"></a>
# **v3ListYaraScanMatches**
> ScanMatchesResponse v3ListYaraScanMatches(id, rule, _file, sort, limit, offset)

List scan matches

Returns a scan&#39;s matches, optionally filtered by rule name and/or file key, paginated.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    String rule = "rule_example"; // String | Filter to a single rule name
    String _file = "_file_example"; // String | Filter to a single file key
    String sort = "file"; // String | Match ordering
    Long limit = 100L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ScanMatchesResponse result = apiInstance.v3ListYaraScanMatches(id, rule, _file, sort, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3ListYaraScanMatches");
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
| **id** | **Long**|  | |
| **rule** | **String**| Filter to a single rule name | [optional] |
| **_file** | **String**| Filter to a single file key | [optional] |
| **sort** | **String**| Match ordering | [optional] [default to file] [enum: file, rule] |
| **limit** | **Long**|  | [optional] [default to 100] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ScanMatchesResponse**](ScanMatchesResponse.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3ListYaraScans"></a>
# **v3ListYaraScans**
> ListScansOutputBody v3ListYaraScans(status, limit, offset)

List scans

Lists past scans, most recent first, optionally filtered by status. Paginated.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    String status = "pending"; // String | Filter to a single status
    Long limit = 100L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ListScansOutputBody result = apiInstance.v3ListYaraScans(status, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3ListYaraScans");
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
| **status** | **String**| Filter to a single status | [optional] [enum: pending, running, complete, failed, cancelled] |
| **limit** | **Long**|  | [optional] [default to 100] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ListScansOutputBody**](ListScansOutputBody.md)

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

<a id="v3RemoveYaraCollectionRule"></a>
# **v3RemoveYaraCollectionRule**
> DeleteOutputBody v3RemoveYaraCollectionRule(id, ruleId)

Remove a rule from a collection

Removes a library rule from the collection.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    Long ruleId = 56L; // Long | 
    try {
      DeleteOutputBody result = apiInstance.v3RemoveYaraCollectionRule(id, ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3RemoveYaraCollectionRule");
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
| **id** | **Long**|  | |
| **ruleId** | **Long**|  | |

### Return type

[**DeleteOutputBody**](DeleteOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3UpdateYaraRule"></a>
# **v3UpdateYaraRule**
> Rule v3UpdateYaraRule(id, updateRuleInputBody)

Update a YARA rule

Validates the source and appends a new version, bumping the rule&#39;s current version.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    Long id = 56L; // Long | 
    UpdateRuleInputBody updateRuleInputBody = new UpdateRuleInputBody(); // UpdateRuleInputBody | 
    try {
      Rule result = apiInstance.v3UpdateYaraRule(id, updateRuleInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3UpdateYaraRule");
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
| **id** | **Long**|  | |
| **updateRuleInputBody** | [**UpdateRuleInputBody**](UpdateRuleInputBody.md)|  | |

### Return type

[**Rule**](Rule.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3ValidateYaraRules"></a>
# **v3ValidateYaraRules**
> ValidateOutputBody v3ValidateYaraRules(validateInputBody)

Validate YARA rules

Compiles each submitted rule and reports, per rule, whether it compiled together with any errors and warnings. A rule that fails to compile is reported in the response, not as an HTTP error.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.YaraApi;

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

    YaraApi apiInstance = new YaraApi(defaultClient);
    ValidateInputBody validateInputBody = new ValidateInputBody(); // ValidateInputBody | 
    try {
      ValidateOutputBody result = apiInstance.v3ValidateYaraRules(validateInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling YaraApi#v3ValidateYaraRules");
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
| **validateInputBody** | [**ValidateInputBody**](ValidateInputBody.md)|  | |

### Return type

[**ValidateOutputBody**](ValidateOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error |  -  |

