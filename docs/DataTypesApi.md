# DataTypesApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3CopyFunctionSignatures**](DataTypesApi.md#v3CopyFunctionSignatures) | **POST** /v3/analyses/{analysis_id}/signatures/copy | Copy function signatures |
| [**v3CreateAnalysisDataTypes**](DataTypesApi.md#v3CreateAnalysisDataTypes) | **POST** /v3/analyses/{analysis_id}/data-types | Create an analysis&#39;s data types |
| [**v3GetAnalysisDataType**](DataTypesApi.md#v3GetAnalysisDataType) | **GET** /v3/analyses/{analysis_id}/data-types/{data_type_id} | Get one of an analysis&#39;s data types |
| [**v3GetAnalysisDataTypeHistory**](DataTypesApi.md#v3GetAnalysisDataTypeHistory) | **GET** /v3/analyses/{analysis_id}/data-types/{data_type_id}/history | Get a data type&#39;s edit history |
| [**v3GetFunctionSignature**](DataTypesApi.md#v3GetFunctionSignature) | **GET** /v3/analyses/{analysis_id}/functions/{function_id}/signature | Get a function&#39;s signature |
| [**v3GetFunctionSignatureHistory**](DataTypesApi.md#v3GetFunctionSignatureHistory) | **GET** /v3/analyses/{analysis_id}/functions/{function_id}/signature/history | Get a function signature&#39;s edit history |
| [**v3ListAnalysisDataTypes**](DataTypesApi.md#v3ListAnalysisDataTypes) | **GET** /v3/analyses/{analysis_id}/data-types | List an analysis&#39;s data types |
| [**v3ListDataTypeFunctions**](DataTypesApi.md#v3ListDataTypeFunctions) | **GET** /v3/analyses/{analysis_id}/data-types/{data_type_id}/functions | List the functions using a data type |
| [**v3ListFunctionSignatures**](DataTypesApi.md#v3ListFunctionSignatures) | **GET** /v3/functions/signatures | Get signatures for many functions |
| [**v3UpdateAnalysisDataTypes**](DataTypesApi.md#v3UpdateAnalysisDataTypes) | **PUT** /v3/analyses/{analysis_id}/data-types | Update an analysis&#39;s data types |
| [**v3UpdateFunctionSignature**](DataTypesApi.md#v3UpdateFunctionSignature) | **PUT** /v3/analyses/{analysis_id}/functions/{function_id}/signature | Update a function&#39;s signature |


<a id="v3CopyFunctionSignatures"></a>
# **v3CopyFunctionSignatures**
> CopyFunctionSignaturesOutputBody v3CopyFunctionSignatures(analysisId, copyFunctionSignaturesInputBody)

Copy function signatures

Replaces each target function&#39;s signature with a copy of its source&#39;s parameters, return type and calling convention. Every target must belong to this analysis; a source may belong to any analysis the caller can read. The whole request is rejected if any pair is invalid.  A &#x60;data_type_id&#x60; means nothing outside the analysis that issued it, so the types a copied signature needs are resolved against this analysis by namespace, name and kind. A type this analysis already has under that key has its definition replaced by the source&#39;s; a type it lacks is created. Copied signatures get a &#x60;source_type&#x60; of &#x60;USER&#x60; and a &#x60;source_function_id&#x60;, and their previous value is retained.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    CopyFunctionSignaturesInputBody copyFunctionSignaturesInputBody = new CopyFunctionSignaturesInputBody(); // CopyFunctionSignaturesInputBody | 
    try {
      CopyFunctionSignaturesOutputBody result = apiInstance.v3CopyFunctionSignatures(analysisId, copyFunctionSignaturesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3CopyFunctionSignatures");
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
| **copyFunctionSignaturesInputBody** | [**CopyFunctionSignaturesInputBody**](CopyFunctionSignaturesInputBody.md)|  | |

### Return type

[**CopyFunctionSignaturesOutputBody**](CopyFunctionSignaturesOutputBody.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CreateAnalysisDataTypes"></a>
# **v3CreateAnalysisDataTypes**
> AnalysisDataTypesOutputBody v3CreateAnalysisDataTypes(analysisId, createAnalysisDataTypesInputBody)

Create an analysis&#39;s data types

Adds user-authored types to an analysis. Many types can be created in one request; the whole request is rejected if any of them is invalid. Ids are assigned by the server and returned here. Stored types get a &#x60;source_type&#x60; of &#x60;USER&#x60;.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    CreateAnalysisDataTypesInputBody createAnalysisDataTypesInputBody = new CreateAnalysisDataTypesInputBody(); // CreateAnalysisDataTypesInputBody | 
    try {
      AnalysisDataTypesOutputBody result = apiInstance.v3CreateAnalysisDataTypes(analysisId, createAnalysisDataTypesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3CreateAnalysisDataTypes");
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
| **createAnalysisDataTypesInputBody** | [**CreateAnalysisDataTypesInputBody**](CreateAnalysisDataTypesInputBody.md)|  | |

### Return type

[**AnalysisDataTypesOutputBody**](AnalysisDataTypesOutputBody.md)

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
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetAnalysisDataType"></a>
# **v3GetAnalysisDataType**
> DataTypeEntry v3GetAnalysisDataType(analysisId, dataTypeId)

Get one of an analysis&#39;s data types

Returns a single data type by its &#x60;data_type_id&#x60;, byte-identical to the entry the data types list returns for it — same variant, same fields, same definition — so a client can cache and invalidate rows from either endpoint interchangeably.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long dataTypeId = 56L; // Long | Data type ID, as returned by the data types list for this analysis. 0 is a valid id.
    try {
      DataTypeEntry result = apiInstance.v3GetAnalysisDataType(analysisId, dataTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3GetAnalysisDataType");
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
| **dataTypeId** | **Long**| Data type ID, as returned by the data types list for this analysis. 0 is a valid id. | |

### Return type

[**DataTypeEntry**](DataTypeEntry.md)

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

<a id="v3GetAnalysisDataTypeHistory"></a>
# **v3GetAnalysisDataTypeHistory**
> GetDataTypeHistoryBody v3GetAnalysisDataTypeHistory(analysisId, dataTypeId)

Get a data type&#39;s edit history

The versions a data type has held, newest first, each attributed to the edit that wrote it. The first value is the current value.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long dataTypeId = 56L; // Long | Data type ID, as returned by the data types list for this analysis. 0 is a valid id.
    try {
      GetDataTypeHistoryBody result = apiInstance.v3GetAnalysisDataTypeHistory(analysisId, dataTypeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3GetAnalysisDataTypeHistory");
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
| **dataTypeId** | **Long**| Data type ID, as returned by the data types list for this analysis. 0 is a valid id. | |

### Return type

[**GetDataTypeHistoryBody**](GetDataTypeHistoryBody.md)

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

<a id="v3GetFunctionSignature"></a>
# **v3GetFunctionSignature**
> FunctionSignatureBody v3GetFunctionSignature(analysisId, functionId, includeDataTypes)

Get a function&#39;s signature

Returns the extracted signature for one function: its parameters, return type and calling convention. Pass &#x60;include_data_types&#x3D;true&#x60; to also get the data types it names.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long functionId = 56L; // Long | Function ID
    Boolean includeDataTypes = true; // Boolean | Include the data types the signature names in the response.
    try {
      FunctionSignatureBody result = apiInstance.v3GetFunctionSignature(analysisId, functionId, includeDataTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3GetFunctionSignature");
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
| **functionId** | **Long**| Function ID | |
| **includeDataTypes** | **Boolean**| Include the data types the signature names in the response. | [optional] |

### Return type

[**FunctionSignatureBody**](FunctionSignatureBody.md)

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

<a id="v3GetFunctionSignatureHistory"></a>
# **v3GetFunctionSignatureHistory**
> GetFunctionSignatureHistoryBody v3GetFunctionSignatureHistory(analysisId, functionId)

Get a function signature&#39;s edit history

The versions a function&#39;s signature has held, newest first, each attributed to the edit that wrote it. The first value is the current value.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long functionId = 56L; // Long | Function ID
    try {
      GetFunctionSignatureHistoryBody result = apiInstance.v3GetFunctionSignatureHistory(analysisId, functionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3GetFunctionSignatureHistory");
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
| **functionId** | **Long**| Function ID | |

### Return type

[**GetFunctionSignatureHistoryBody**](GetFunctionSignatureHistoryBody.md)

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

<a id="v3ListAnalysisDataTypes"></a>
# **v3ListAnalysisDataTypes**
> ListAnalysisDataTypesOutputBody v3ListAnalysisDataTypes(analysisId, offset, limit, kind, namespace, search, sourceType, orderBy, order)

List an analysis&#39;s data types

Paginated, filterable list of the data types extracted from the binary — structs, unions, enums, typedefs and the rest. Every entry carries its full definition, so paging this list once resolves every &#x60;data_type_id&#x60; a definition or signature refers to; no follow-up request per id is needed.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long offset = 0L; // Long | Pagination offset.
    Long limit = 100L; // Long | Page size.
    List<String> kind = Arrays.asList(); // List<String> | Only return types of these kinds. Repeat for more than one; empty means no filter.
    List<String> namespace = Arrays.asList(); // List<String> | Only return types in these namespaces, matched exactly. Omit for no filter; pass an empty value (namespace=) for the binary's own types, which have no namespace.
    String search = "search_example"; // String | Only return types whose name contains this term. Wildcards in the term are matched literally.
    List<String> sourceType = Arrays.asList(); // List<String> | Only return types from these sources. Empty means no filter.
    String orderBy = "name"; // String | Field to order by. name orders by namespace, then name, then kind; size orders by size with types of unknown size last, then by namespace, name and kind.
    String order = "ASC"; // String | Sort direction.
    try {
      ListAnalysisDataTypesOutputBody result = apiInstance.v3ListAnalysisDataTypes(analysisId, offset, limit, kind, namespace, search, sourceType, orderBy, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3ListAnalysisDataTypes");
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
| **offset** | **Long**| Pagination offset. | [optional] [default to 0] |
| **limit** | **Long**| Page size. | [optional] [default to 100] |
| **kind** | [**List&lt;String&gt;**](String.md)| Only return types of these kinds. Repeat for more than one; empty means no filter. | [optional] [enum: STRUCT, UNION, ENUM, TYPEDEF, POINTER, ARRAY, FUNCTION_DEFINITION, BITFIELD, BASE, UNKNOWN] |
| **namespace** | [**List&lt;String&gt;**](String.md)| Only return types in these namespaces, matched exactly. Omit for no filter; pass an empty value (namespace&#x3D;) for the binary&#39;s own types, which have no namespace. | [optional] |
| **search** | **String**| Only return types whose name contains this term. Wildcards in the term are matched literally. | [optional] |
| **sourceType** | [**List&lt;String&gt;**](String.md)| Only return types from these sources. Empty means no filter. | [optional] [enum: SYSTEM, USER, AUTO_UNSTRIP, AI_DECOMP] |
| **orderBy** | **String**| Field to order by. name orders by namespace, then name, then kind; size orders by size with types of unknown size last, then by namespace, name and kind. | [optional] [default to name] [enum: name, size] |
| **order** | **String**| Sort direction. | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListAnalysisDataTypesOutputBody**](ListAnalysisDataTypesOutputBody.md)

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

<a id="v3ListDataTypeFunctions"></a>
# **v3ListDataTypeFunctions**
> ListDataTypeFunctionsBody v3ListDataTypeFunctions(analysisId, dataTypeId, pageSize, afterFunctionId)

List the functions using a data type

Functions that use this data type as their return type or as a parameter. Matches the &#x60;data_type_id&#x60; exactly as it appears in the signature, so a function taking &#x60;sockaddr_in *&#x60; matches the pointer type rather than &#x60;sockaddr_in&#x60;. Ordered by function ID. There is no total count; page with &#x60;after_function_id&#x60;.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long dataTypeId = 56L; // Long | Data type ID, as returned by the data types list for this analysis. 0 is a valid id.
    Long pageSize = 50L; // Long | Page size.
    Long afterFunctionId = 0L; // Long | Return functions with an ID greater than this. Pass the previous page's next_after_function_id; 0 starts at the first function.
    try {
      ListDataTypeFunctionsBody result = apiInstance.v3ListDataTypeFunctions(analysisId, dataTypeId, pageSize, afterFunctionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3ListDataTypeFunctions");
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
| **dataTypeId** | **Long**| Data type ID, as returned by the data types list for this analysis. 0 is a valid id. | |
| **pageSize** | **Long**| Page size. | [optional] [default to 50] |
| **afterFunctionId** | **Long**| Return functions with an ID greater than this. Pass the previous page&#39;s next_after_function_id; 0 starts at the first function. | [optional] [default to 0] |

### Return type

[**ListDataTypeFunctionsBody**](ListDataTypeFunctionsBody.md)

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

<a id="v3ListFunctionSignatures"></a>
# **v3ListFunctionSignatures**
> ListFunctionSignaturesOutputBody v3ListFunctionSignatures(functionIds, includeDataTypes)

Get signatures for many functions

Returns the extracted signature for each supplied function ID, in request order. The functions need not share an analysis; each entry names the analysis its &#x60;data_type_id&#x60;s resolve against. Pass &#x60;include_data_types&#x3D;true&#x60; to also get those data types, grouped by analysis. The caller must have read access to every function or the request is rejected.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    List<Long> functionIds = Arrays.asList(); // List<Long> | Function IDs to fetch signatures for.
    Boolean includeDataTypes = true; // Boolean | Include the data types the signatures name in the response.
    try {
      ListFunctionSignaturesOutputBody result = apiInstance.v3ListFunctionSignatures(functionIds, includeDataTypes);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3ListFunctionSignatures");
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
| **functionIds** | [**List&lt;Long&gt;**](Long.md)| Function IDs to fetch signatures for. | |
| **includeDataTypes** | **Boolean**| Include the data types the signatures name in the response. | [optional] |

### Return type

[**ListFunctionSignaturesOutputBody**](ListFunctionSignaturesOutputBody.md)

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

<a id="v3UpdateAnalysisDataTypes"></a>
# **v3UpdateAnalysisDataTypes**
> AnalysisDataTypesOutputBody v3UpdateAnalysisDataTypes(analysisId, updateAnalysisDataTypesInputBody)

Update an analysis&#39;s data types

Replaces stored types in full: a field left out of the request is cleared. Many types can be updated in one request; the whole request is rejected if any of them is invalid. &#x60;kind&#x60; may be changed, and the definition must then match the new kind. Updated types get a &#x60;source_type&#x60; of &#x60;USER&#x60;, and their previous value is retained.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    UpdateAnalysisDataTypesInputBody updateAnalysisDataTypesInputBody = new UpdateAnalysisDataTypesInputBody(); // UpdateAnalysisDataTypesInputBody | 
    try {
      AnalysisDataTypesOutputBody result = apiInstance.v3UpdateAnalysisDataTypes(analysisId, updateAnalysisDataTypesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3UpdateAnalysisDataTypes");
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
| **updateAnalysisDataTypesInputBody** | [**UpdateAnalysisDataTypesInputBody**](UpdateAnalysisDataTypesInputBody.md)|  | |

### Return type

[**AnalysisDataTypesOutputBody**](AnalysisDataTypesOutputBody.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3UpdateFunctionSignature"></a>
# **v3UpdateFunctionSignature**
> FunctionSignatureEntry v3UpdateFunctionSignature(analysisId, functionId, updateFunctionSignatureInputBody)

Update a function&#39;s signature

Replaces a function&#39;s parameters, return type and calling convention in full — anything left out of the request is cleared. Parameter and return types are &#x60;data_type_id&#x60;s belonging to this analysis. Edits an extracted signature only: a function with &#x60;has_signature&#x60; false is rejected with 404. The stored signature gets a &#x60;source_type&#x60; of &#x60;USER&#x60;, and its previous value is retained.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.DataTypesApi;

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

    DataTypesApi apiInstance = new DataTypesApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    Long functionId = 56L; // Long | Function ID
    UpdateFunctionSignatureInputBody updateFunctionSignatureInputBody = new UpdateFunctionSignatureInputBody(); // UpdateFunctionSignatureInputBody | 
    try {
      FunctionSignatureEntry result = apiInstance.v3UpdateFunctionSignature(analysisId, functionId, updateFunctionSignatureInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataTypesApi#v3UpdateFunctionSignature");
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
| **functionId** | **Long**| Function ID | |
| **updateFunctionSignatureInputBody** | [**UpdateFunctionSignatureInputBody**](UpdateFunctionSignatureInputBody.md)|  | |

### Return type

[**FunctionSignatureEntry**](FunctionSignatureEntry.md)

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

