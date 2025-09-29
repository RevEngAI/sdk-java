# AnalysesCoreApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchSymbolAnn**](AnalysesCoreApi.md#batchSymbolAnn) | **POST** /v1/ann/symbol/batch | Batch Symbol ANN using function IDs |
| [**createAnalysis**](AnalysesCoreApi.md#createAnalysis) | **POST** /v2/analyses | Create Analysis |
| [**deleteAnalysis**](AnalysesCoreApi.md#deleteAnalysis) | **DELETE** /v2/analyses/{analysis_id} | Delete Analysis |
| [**findSimilarFunctionsBatch**](AnalysesCoreApi.md#findSimilarFunctionsBatch) | **POST** /v2/analyses/{analysis_id}/similarity/functions | Batch Symbol ANN using Analysis ID |
| [**getAnalysisBasicInfo**](AnalysesCoreApi.md#getAnalysisBasicInfo) | **GET** /v2/analyses/{analysis_id}/basic | Gets basic analysis information |
| [**getAnalysisFunctionMap**](AnalysesCoreApi.md#getAnalysisFunctionMap) | **GET** /v2/analyses/{analysis_id}/func_maps | Get Analysis Function Map |
| [**getAnalysisLogs**](AnalysesCoreApi.md#getAnalysisLogs) | **GET** /v2/analyses/{analysis_id}/logs | Gets the logs of an analysis |
| [**getAnalysisParams**](AnalysesCoreApi.md#getAnalysisParams) | **GET** /v2/analyses/{analysis_id}/params | Gets analysis param information |
| [**getAnalysisStatus**](AnalysesCoreApi.md#getAnalysisStatus) | **GET** /v2/analyses/{analysis_id}/status | Gets the status of an analysis |
| [**getBinaryAnn**](AnalysesCoreApi.md#getBinaryAnn) | **POST** /v2/binary_ann/{analysis_id} | Binary Ann |
| [**listAnalyses**](AnalysesCoreApi.md#listAnalyses) | **GET** /v2/analyses/list | Gets the most recent analyses |
| [**lookupBinaryId**](AnalysesCoreApi.md#lookupBinaryId) | **GET** /v2/analyses/lookup/{binary_id} | Gets the analysis ID from binary ID |
| [**requeueAnalysis**](AnalysesCoreApi.md#requeueAnalysis) | **POST** /v2/analyses/{analysis_id}/requeue | Requeue Analysis |
| [**updateAnalysis**](AnalysesCoreApi.md#updateAnalysis) | **PATCH** /v2/analyses/{analysis_id} | Update Analysis |
| [**updateAnalysisTags**](AnalysesCoreApi.md#updateAnalysisTags) | **PATCH** /v2/analyses/{analysis_id}/tags | Update Analysis Tags |
| [**uploadFile**](AnalysesCoreApi.md#uploadFile) | **POST** /v2/upload | Upload File |


<a id="batchSymbolAnn"></a>
# **batchSymbolAnn**
> FunctionBatchAnn batchSymbolAnn(appApiRestV1AnnSchemaANNFunction)

Batch Symbol ANN using function IDs

Takes in an input of functions ID&#39;s and settings and finds the nearest functions for each function that&#39;s within the database

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    AppApiRestV1AnnSchemaANNFunction appApiRestV1AnnSchemaANNFunction = new AppApiRestV1AnnSchemaANNFunction(); // AppApiRestV1AnnSchemaANNFunction | 
    try {
      FunctionBatchAnn result = apiInstance.batchSymbolAnn(appApiRestV1AnnSchemaANNFunction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#batchSymbolAnn");
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
| **appApiRestV1AnnSchemaANNFunction** | [**AppApiRestV1AnnSchemaANNFunction**](AppApiRestV1AnnSchemaANNFunction.md)|  | |

### Return type

[**FunctionBatchAnn**](FunctionBatchAnn.md)

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

<a id="createAnalysis"></a>
# **createAnalysis**
> BaseResponseAnalysisCreateResponse createAnalysis(analysisCreateRequest)

Create Analysis

Begins an analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    AnalysisCreateRequest analysisCreateRequest = new AnalysisCreateRequest(); // AnalysisCreateRequest | 
    try {
      BaseResponseAnalysisCreateResponse result = apiInstance.createAnalysis(analysisCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#createAnalysis");
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
| **analysisCreateRequest** | [**AnalysisCreateRequest**](AnalysisCreateRequest.md)|  | |

### Return type

[**BaseResponseAnalysisCreateResponse**](BaseResponseAnalysisCreateResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a id="deleteAnalysis"></a>
# **deleteAnalysis**
> BaseResponseDict deleteAnalysis(analysisId)

Delete Analysis

Deletes an analysis based on the provided analysis ID.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseDict result = apiInstance.deleteAnalysis(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#deleteAnalysis");
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

### Return type

[**BaseResponseDict**](BaseResponseDict.md)

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
| **404** | Not Found |  -  |
| **403** | Forbidden |  -  |

<a id="findSimilarFunctionsBatch"></a>
# **findSimilarFunctionsBatch**
> BaseResponseNearestNeighborAnalysis findSimilarFunctionsBatch(analysisId, appApiRestV2SimilaritySchemaANNFunction)

Batch Symbol ANN using Analysis ID

Takes a analysis ID and returns the nearest functions within the database that match those functions

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    AppApiRestV2SimilaritySchemaANNFunction appApiRestV2SimilaritySchemaANNFunction = new AppApiRestV2SimilaritySchemaANNFunction(); // AppApiRestV2SimilaritySchemaANNFunction | 
    try {
      BaseResponseNearestNeighborAnalysis result = apiInstance.findSimilarFunctionsBatch(analysisId, appApiRestV2SimilaritySchemaANNFunction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#findSimilarFunctionsBatch");
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
| **appApiRestV2SimilaritySchemaANNFunction** | [**AppApiRestV2SimilaritySchemaANNFunction**](AppApiRestV2SimilaritySchemaANNFunction.md)|  | |

### Return type

[**BaseResponseNearestNeighborAnalysis**](BaseResponseNearestNeighborAnalysis.md)

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

<a id="getAnalysisBasicInfo"></a>
# **getAnalysisBasicInfo**
> BaseResponseBasic getAnalysisBasicInfo(analysisId)

Gets basic analysis information

Just a random placeholder for now

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseBasic result = apiInstance.getAnalysisBasicInfo(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisBasicInfo");
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

### Return type

[**BaseResponseBasic**](BaseResponseBasic.md)

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

<a id="getAnalysisFunctionMap"></a>
# **getAnalysisFunctionMap**
> BaseResponseAnalysisFunctionMapping getAnalysisFunctionMap(analysisId)

Get Analysis Function Map

Returns three maps: a map of function ids to function addresses, it&#39;s inverse and a map of function addresses to function names.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseAnalysisFunctionMapping result = apiInstance.getAnalysisFunctionMap(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisFunctionMap");
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

### Return type

[**BaseResponseAnalysisFunctionMapping**](BaseResponseAnalysisFunctionMapping.md)

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

<a id="getAnalysisLogs"></a>
# **getAnalysisLogs**
> BaseResponseLogs getAnalysisLogs(analysisId)

Gets the logs of an analysis

Given an analysis ID gets the current logs of an analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseLogs result = apiInstance.getAnalysisLogs(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisLogs");
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

### Return type

[**BaseResponseLogs**](BaseResponseLogs.md)

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

<a id="getAnalysisParams"></a>
# **getAnalysisParams**
> BaseResponseParams getAnalysisParams(analysisId)

Gets analysis param information

Gets the params that the analysis was run with

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseParams result = apiInstance.getAnalysisParams(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisParams");
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

### Return type

[**BaseResponseParams**](BaseResponseParams.md)

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

<a id="getAnalysisStatus"></a>
# **getAnalysisStatus**
> BaseResponseStatus getAnalysisStatus(analysisId)

Gets the status of an analysis

Given an analysis ID gets the current status of the analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    try {
      BaseResponseStatus result = apiInstance.getAnalysisStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getAnalysisStatus");
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

### Return type

[**BaseResponseStatus**](BaseResponseStatus.md)

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

<a id="getBinaryAnn"></a>
# **getBinaryAnn**
> BaseResponseBinaryAnnListResponse getBinaryAnn(analysisId, binaryAnnForm)

Binary Ann

Binary Ann

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    BinaryAnnForm binaryAnnForm = new BinaryAnnForm(); // BinaryAnnForm | 
    try {
      BaseResponseBinaryAnnListResponse result = apiInstance.getBinaryAnn(analysisId, binaryAnnForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#getBinaryAnn");
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
| **binaryAnnForm** | [**BinaryAnnForm**](BinaryAnnForm.md)|  | |

### Return type

[**BaseResponseBinaryAnnListResponse**](BaseResponseBinaryAnnListResponse.md)

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

<a id="listAnalyses"></a>
# **listAnalyses**
> BaseResponseRecent listAnalyses(searchTerm, workspace, status, modelName, dynamicExecutionStatus, usernames, sha256Hash, limit, offset, orderBy, order)

Gets the most recent analyses

Gets the most recent analyses provided a scope, this is then paginated, if pages and limit doesnt fit, it increases the limit

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    String searchTerm = ""; // String | 
    List<Workspace> workspace = Arrays.asList(); // List<Workspace> | The workspace to be viewed
    List<StatusInput> status = Arrays.asList(); // List<StatusInput> | The status of the analysis
    List<ModelName> modelName = Arrays.asList(); // List<ModelName> | Show analysis belonging to the model
    DynamicExecutionStatusInput dynamicExecutionStatus = DynamicExecutionStatusInput.fromValue("PENDING"); // DynamicExecutionStatusInput | Show analysis that have a dynamic execution with the given status
    List<String> usernames = Arrays.asList(); // List<String> | Show analysis belonging to the user
    String sha256Hash = "sha256Hash_example"; // String | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    AppApiRestV2AnalysesEnumsOrderBy orderBy = AppApiRestV2AnalysesEnumsOrderBy.fromValue("created"); // AppApiRestV2AnalysesEnumsOrderBy | 
    Order order = Order.fromValue("ASC"); // Order | 
    try {
      BaseResponseRecent result = apiInstance.listAnalyses(searchTerm, workspace, status, modelName, dynamicExecutionStatus, usernames, sha256Hash, limit, offset, orderBy, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#listAnalyses");
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
| **searchTerm** | **String**|  | [optional] [default to ] |
| **workspace** | [**List&lt;Workspace&gt;**](Workspace.md)| The workspace to be viewed | [optional] |
| **status** | [**List&lt;StatusInput&gt;**](StatusInput.md)| The status of the analysis | [optional] |
| **modelName** | [**List&lt;ModelName&gt;**](ModelName.md)| Show analysis belonging to the model | [optional] |
| **dynamicExecutionStatus** | [**DynamicExecutionStatusInput**](.md)| Show analysis that have a dynamic execution with the given status | [optional] [enum: PENDING, ERROR, SUCCESS, ALL] |
| **usernames** | [**List&lt;String&gt;**](String.md)| Show analysis belonging to the user | [optional] |
| **sha256Hash** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **orderBy** | [**AppApiRestV2AnalysesEnumsOrderBy**](.md)|  | [optional] [enum: created, name, size] |
| **order** | [**Order**](.md)|  | [optional] [enum: ASC, DESC] |

### Return type

[**BaseResponseRecent**](BaseResponseRecent.md)

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

<a id="lookupBinaryId"></a>
# **lookupBinaryId**
> Object lookupBinaryId(binaryId)

Gets the analysis ID from binary ID

Given an binary ID gets the ID of an analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer binaryId = 56; // Integer | 
    try {
      Object result = apiInstance.lookupBinaryId(binaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#lookupBinaryId");
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

<a id="requeueAnalysis"></a>
# **requeueAnalysis**
> BaseResponseCreated requeueAnalysis(analysisId, reAnalysisForm)

Requeue Analysis

Re-queues an already uploaded analysis

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    ReAnalysisForm reAnalysisForm = new ReAnalysisForm(); // ReAnalysisForm | 
    try {
      BaseResponseCreated result = apiInstance.requeueAnalysis(analysisId, reAnalysisForm);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#requeueAnalysis");
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
| **reAnalysisForm** | [**ReAnalysisForm**](ReAnalysisForm.md)|  | |

### Return type

[**BaseResponseCreated**](BaseResponseCreated.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |
| **404** | Not Found |  -  |
| **400** | Bad Request |  -  |

<a id="updateAnalysis"></a>
# **updateAnalysis**
> BaseResponseAnalysisDetailResponse updateAnalysis(analysisId, analysisUpdateRequest)

Update Analysis

Updates analysis attributes (binary_name, analysis_scope). User must be the owner.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    AnalysisUpdateRequest analysisUpdateRequest = new AnalysisUpdateRequest(); // AnalysisUpdateRequest | 
    try {
      BaseResponseAnalysisDetailResponse result = apiInstance.updateAnalysis(analysisId, analysisUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#updateAnalysis");
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
| **analysisUpdateRequest** | [**AnalysisUpdateRequest**](AnalysisUpdateRequest.md)|  | |

### Return type

[**BaseResponseAnalysisDetailResponse**](BaseResponseAnalysisDetailResponse.md)

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

<a id="updateAnalysisTags"></a>
# **updateAnalysisTags**
> BaseResponseAnalysisUpdateTagsResponse updateAnalysisTags(analysisId, analysisUpdateTagsRequest)

Update Analysis Tags

Updates analysis tags. User must be the owner.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    Integer analysisId = 56; // Integer | 
    AnalysisUpdateTagsRequest analysisUpdateTagsRequest = new AnalysisUpdateTagsRequest(); // AnalysisUpdateTagsRequest | 
    try {
      BaseResponseAnalysisUpdateTagsResponse result = apiInstance.updateAnalysisTags(analysisId, analysisUpdateTagsRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#updateAnalysisTags");
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
| **analysisUpdateTagsRequest** | [**AnalysisUpdateTagsRequest**](AnalysisUpdateTagsRequest.md)|  | |

### Return type

[**BaseResponseAnalysisUpdateTagsResponse**](BaseResponseAnalysisUpdateTagsResponse.md)

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

<a id="uploadFile"></a>
# **uploadFile**
> BaseResponseUploadResponse uploadFile(uploadFileType, _file, packedPassword, forceOverwrite)

Upload File

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.AnalysesCoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    AnalysesCoreApi apiInstance = new AnalysesCoreApi(defaultClient);
    UploadFileType uploadFileType = UploadFileType.fromValue("BINARY"); // UploadFileType | 
    File _file = new File("/path/to/file"); // File | 
    String packedPassword = "packedPassword_example"; // String | 
    Boolean forceOverwrite = false; // Boolean | 
    try {
      BaseResponseUploadResponse result = apiInstance.uploadFile(uploadFileType, _file, packedPassword, forceOverwrite);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalysesCoreApi#uploadFile");
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
| **uploadFileType** | [**UploadFileType**](UploadFileType.md)|  | [enum: BINARY, DEBUG, PACKED, FIRMWARE] |
| **_file** | **File**|  | |
| **packedPassword** | **String**|  | [optional] |
| **forceOverwrite** | **Boolean**|  | [optional] [default to false] |

### Return type

[**BaseResponseUploadResponse**](BaseResponseUploadResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Invalid request parameters |  -  |

