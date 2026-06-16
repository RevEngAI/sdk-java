# CollectionsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCollection**](CollectionsApi.md#createCollection) | **POST** /v2/collections | Creates new collection information |
| [**deleteCollection**](CollectionsApi.md#deleteCollection) | **DELETE** /v2/collections/{collection_id} | Deletes a collection |
| [**getCollection**](CollectionsApi.md#getCollection) | **GET** /v2/collections/{collection_id} | Returns a collection |
| [**listCollections**](CollectionsApi.md#listCollections) | **GET** /v2/collections | Gets basic collections information |
| [**updateCollection**](CollectionsApi.md#updateCollection) | **PATCH** /v2/collections/{collection_id} | Updates a collection |
| [**updateCollectionBinaries**](CollectionsApi.md#updateCollectionBinaries) | **PATCH** /v2/collections/{collection_id}/binaries | Updates a collection binaries |
| [**updateCollectionTags**](CollectionsApi.md#updateCollectionTags) | **PATCH** /v2/collections/{collection_id}/tags | Updates a collection tags |
| [**v3CreateCollection**](CollectionsApi.md#v3CreateCollection) | **POST** /v3/collections | Create a collection. |
| [**v3DeleteCollection**](CollectionsApi.md#v3DeleteCollection) | **DELETE** /v3/collections/{collection_id} | Delete a collection. |
| [**v3GetCollection**](CollectionsApi.md#v3GetCollection) | **GET** /v3/collections/{collection_id} | Get a collection. |
| [**v3ListCollections**](CollectionsApi.md#v3ListCollections) | **GET** /v3/collections | List collections. |
| [**v3PatchCollection**](CollectionsApi.md#v3PatchCollection) | **PATCH** /v3/collections/{collection_id} | Update a collection. |
| [**v3PatchCollectionBinaries**](CollectionsApi.md#v3PatchCollectionBinaries) | **PATCH** /v3/collections/{collection_id}/binaries | Replace the binaries in a collection. |
| [**v3PatchCollectionTags**](CollectionsApi.md#v3PatchCollectionTags) | **PATCH** /v3/collections/{collection_id}/tags | Replace the tags on a collection. |


<a id="createCollection"></a>
# **createCollection**
> BaseResponseCollectionResponse createCollection(collectionCreateRequest)

Creates new collection information

A collection is a group of binaries that are related in some way. This endpoint creates a new collection and allows you to add tags and binaries to it. If you add tags or binaries to the collection, they will be returned in the response.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    CollectionCreateRequest collectionCreateRequest = new CollectionCreateRequest(); // CollectionCreateRequest | 
    try {
      BaseResponseCollectionResponse result = apiInstance.createCollection(collectionCreateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#createCollection");
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
| **collectionCreateRequest** | [**CollectionCreateRequest**](CollectionCreateRequest.md)|  | |

### Return type

[**BaseResponseCollectionResponse**](BaseResponseCollectionResponse.md)

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

<a id="deleteCollection"></a>
# **deleteCollection**
> BaseResponseBool deleteCollection(collectionId)

Deletes a collection

Deletes a collection

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Integer collectionId = 56; // Integer | 
    try {
      BaseResponseBool result = apiInstance.deleteCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#deleteCollection");
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
| **collectionId** | **Integer**|  | |

### Return type

[**BaseResponseBool**](BaseResponseBool.md)

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

<a id="getCollection"></a>
# **getCollection**
> BaseResponseCollectionResponse getCollection(collectionId, includeTags, includeBinaries, pageSize, pageNumber, binarySearchStr)

Returns a collection

Gets a single collection. The collection can include binaries and tags if requested. You can specify whether to include tags and binaries in the response by using the query string parameters defined.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Integer collectionId = 56; // Integer | 
    Boolean includeTags = false; // Boolean | 
    Boolean includeBinaries = false; // Boolean | 
    Integer pageSize = 10; // Integer | 
    Integer pageNumber = 1; // Integer | 
    String binarySearchStr = "binarySearchStr_example"; // String | 
    try {
      BaseResponseCollectionResponse result = apiInstance.getCollection(collectionId, includeTags, includeBinaries, pageSize, pageNumber, binarySearchStr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#getCollection");
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
| **collectionId** | **Integer**|  | |
| **includeTags** | **Boolean**|  | [optional] [default to false] |
| **includeBinaries** | **Boolean**|  | [optional] [default to false] |
| **pageSize** | **Integer**|  | [optional] [default to 10] |
| **pageNumber** | **Integer**|  | [optional] [default to 1] |
| **binarySearchStr** | **String**|  | [optional] |

### Return type

[**BaseResponseCollectionResponse**](BaseResponseCollectionResponse.md)

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

<a id="listCollections"></a>
# **listCollections**
> BaseResponseListCollectionResults listCollections(searchTerm, filters, limit, offset, orderBy, order)

Gets basic collections information

Returns a list of collections

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String searchTerm = ""; // String | 
    List<Filters> filters = Arrays.asList(); // List<Filters> | 
    Integer limit = 20; // Integer | 
    Integer offset = 0; // Integer | 
    AppApiRestV2CollectionsEnumsOrderBy orderBy = AppApiRestV2CollectionsEnumsOrderBy.fromValue("created"); // AppApiRestV2CollectionsEnumsOrderBy | 
    Order order = Order.fromValue("ASC"); // Order | 
    try {
      BaseResponseListCollectionResults result = apiInstance.listCollections(searchTerm, filters, limit, offset, orderBy, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#listCollections");
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
| **filters** | [**List&lt;Filters&gt;**](Filters.md)|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 20] |
| **offset** | **Integer**|  | [optional] [default to 0] |
| **orderBy** | [**AppApiRestV2CollectionsEnumsOrderBy**](.md)|  | [optional] [default to collection] [enum: created, collection, model, owner, collection_size, updated] |
| **order** | [**Order**](.md)|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**BaseResponseListCollectionResults**](BaseResponseListCollectionResults.md)

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

<a id="updateCollection"></a>
# **updateCollection**
> BaseResponseCollectionResponse updateCollection(collectionId, collectionUpdateRequest)

Updates a collection

Updates a collection, you can update the collection name, description, and scope

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Integer collectionId = 56; // Integer | 
    CollectionUpdateRequest collectionUpdateRequest = new CollectionUpdateRequest(); // CollectionUpdateRequest | 
    try {
      BaseResponseCollectionResponse result = apiInstance.updateCollection(collectionId, collectionUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#updateCollection");
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
| **collectionId** | **Integer**|  | |
| **collectionUpdateRequest** | [**CollectionUpdateRequest**](CollectionUpdateRequest.md)|  | |

### Return type

[**BaseResponseCollectionResponse**](BaseResponseCollectionResponse.md)

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

<a id="updateCollectionBinaries"></a>
# **updateCollectionBinaries**
> BaseResponseCollectionBinariesUpdateResponse updateCollectionBinaries(collectionId, collectionBinariesUpdateRequest)

Updates a collection binaries

Updates/changes a collection binaries to whatever is provided in the request. After this update the collection will only contain the binaries provided in the request.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Integer collectionId = 56; // Integer | 
    CollectionBinariesUpdateRequest collectionBinariesUpdateRequest = new CollectionBinariesUpdateRequest(); // CollectionBinariesUpdateRequest | 
    try {
      BaseResponseCollectionBinariesUpdateResponse result = apiInstance.updateCollectionBinaries(collectionId, collectionBinariesUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#updateCollectionBinaries");
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
| **collectionId** | **Integer**|  | |
| **collectionBinariesUpdateRequest** | [**CollectionBinariesUpdateRequest**](CollectionBinariesUpdateRequest.md)|  | |

### Return type

[**BaseResponseCollectionBinariesUpdateResponse**](BaseResponseCollectionBinariesUpdateResponse.md)

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

<a id="updateCollectionTags"></a>
# **updateCollectionTags**
> BaseResponseCollectionTagsUpdateResponse updateCollectionTags(collectionId, collectionTagsUpdateRequest)

Updates a collection tags

Updates/changes a collection tags to whatever is provided in the request. After this update the collection will only contain the tags provided in the request.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Integer collectionId = 56; // Integer | 
    CollectionTagsUpdateRequest collectionTagsUpdateRequest = new CollectionTagsUpdateRequest(); // CollectionTagsUpdateRequest | 
    try {
      BaseResponseCollectionTagsUpdateResponse result = apiInstance.updateCollectionTags(collectionId, collectionTagsUpdateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#updateCollectionTags");
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
| **collectionId** | **Integer**|  | |
| **collectionTagsUpdateRequest** | [**CollectionTagsUpdateRequest**](CollectionTagsUpdateRequest.md)|  | |

### Return type

[**BaseResponseCollectionTagsUpdateResponse**](BaseResponseCollectionTagsUpdateResponse.md)

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

<a id="v3CreateCollection"></a>
# **v3CreateCollection**
> CreateCollectionOutputBody v3CreateCollection(createCollectionInputBody)

Create a collection.

Creates a new collection, optionally tagging it and linking binary IDs to it. Tags and binaries are returned in the response only when they were supplied in the request.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    CreateCollectionInputBody createCollectionInputBody = new CreateCollectionInputBody(); // CreateCollectionInputBody | 
    try {
      CreateCollectionOutputBody result = apiInstance.v3CreateCollection(createCollectionInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3CreateCollection");
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

[**CreateCollectionOutputBody**](CreateCollectionOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3DeleteCollection"></a>
# **v3DeleteCollection**
> v3DeleteCollection(collectionId)

Delete a collection.

Deletes a collection. The collection must not have any linked binaries (call PATCH /v3/collections/{collection_id}/binaries with an empty list first).  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;409&#x60; [&#x60;CONFLICT&#x60;](/errors/CONFLICT) — Conflict

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Long collectionId = 56L; // Long | 
    try {
      apiInstance.v3DeleteCollection(collectionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3DeleteCollection");
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
| **collectionId** | **Long**|  | |

### Return type

null (empty response body)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetCollection"></a>
# **v3GetCollection**
> GetCollectionOutputBody v3GetCollection(collectionId, includeTags, includeBinaries, pageSize, pageNumber, binarySearchStr)

Get a collection.

Gets a single collection by ID. Optionally include tags and paginated binaries.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Long collectionId = 56L; // Long | 
    Boolean includeTags = true; // Boolean | 
    Boolean includeBinaries = true; // Boolean | 
    Long pageSize = 10L; // Long | 
    Long pageNumber = 1L; // Long | 
    String binarySearchStr = "binarySearchStr_example"; // String | 
    try {
      GetCollectionOutputBody result = apiInstance.v3GetCollection(collectionId, includeTags, includeBinaries, pageSize, pageNumber, binarySearchStr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3GetCollection");
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
| **collectionId** | **Long**|  | |
| **includeTags** | **Boolean**|  | [optional] |
| **includeBinaries** | **Boolean**|  | [optional] |
| **pageSize** | **Long**|  | [optional] [default to 10] |
| **pageNumber** | **Long**|  | [optional] [default to 1] |
| **binarySearchStr** | **String**|  | [optional] |

### Return type

[**GetCollectionOutputBody**](GetCollectionOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

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

<a id="v3ListCollections"></a>
# **v3ListCollections**
> ListCollectionsOutputBody v3ListCollections(searchTerm, filters, limit, offset, orderBy, order)

List collections.

Lists collections accessible to the authenticated user. Supports search, filtering, ordering, and pagination.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    String searchTerm = "searchTerm_example"; // String | 
    List<String> filters = Arrays.asList(); // List<String> | 
    Long limit = 20L; // Long | 
    Long offset = 0L; // Long | 
    String orderBy = "created"; // String | 
    String order = "ASC"; // String | 
    try {
      ListCollectionsOutputBody result = apiInstance.v3ListCollections(searchTerm, filters, limit, offset, orderBy, order);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3ListCollections");
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
| **searchTerm** | **String**|  | [optional] |
| **filters** | [**List&lt;String&gt;**](String.md)|  | [optional] [enum: official_only, user_only, team_only, public_only, hide_empty] |
| **limit** | **Long**|  | [optional] [default to 20] |
| **offset** | **Long**|  | [optional] [default to 0] |
| **orderBy** | **String**|  | [optional] [default to collection] [enum: created, collection, model, collection_size, updated] |
| **order** | **String**|  | [optional] [default to ASC] [enum: ASC, DESC] |

### Return type

[**ListCollectionsOutputBody**](ListCollectionsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3PatchCollection"></a>
# **v3PatchCollection**
> PatchCollectionOutputBody v3PatchCollection(collectionId, patchCollectionInputBody)

Update a collection.

Updates a collection&#39;s name, description, and/or scope. Omitted fields keep their existing values.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Long collectionId = 56L; // Long | 
    PatchCollectionInputBody patchCollectionInputBody = new PatchCollectionInputBody(); // PatchCollectionInputBody | 
    try {
      PatchCollectionOutputBody result = apiInstance.v3PatchCollection(collectionId, patchCollectionInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3PatchCollection");
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
| **collectionId** | **Long**|  | |
| **patchCollectionInputBody** | [**PatchCollectionInputBody**](PatchCollectionInputBody.md)|  | |

### Return type

[**PatchCollectionOutputBody**](PatchCollectionOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

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

<a id="v3PatchCollectionBinaries"></a>
# **v3PatchCollectionBinaries**
> PatchCollectionBinariesOutputBody v3PatchCollectionBinaries(collectionId, patchCollectionBinariesInputBody)

Replace the binaries in a collection.

Replaces the binaries linked to a collection with the supplied list. Binaries not present in the request are removed. All supplied binary IDs must belong to the same model as the collection.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Long collectionId = 56L; // Long | 
    PatchCollectionBinariesInputBody patchCollectionBinariesInputBody = new PatchCollectionBinariesInputBody(); // PatchCollectionBinariesInputBody | 
    try {
      PatchCollectionBinariesOutputBody result = apiInstance.v3PatchCollectionBinaries(collectionId, patchCollectionBinariesInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3PatchCollectionBinaries");
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
| **collectionId** | **Long**|  | |
| **patchCollectionBinariesInputBody** | [**PatchCollectionBinariesInputBody**](PatchCollectionBinariesInputBody.md)|  | |

### Return type

[**PatchCollectionBinariesOutputBody**](PatchCollectionBinariesOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

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

<a id="v3PatchCollectionTags"></a>
# **v3PatchCollectionTags**
> PatchCollectionTagsOutputBody v3PatchCollectionTags(collectionId, patchCollectionTagsInputBody)

Replace the tags on a collection.

Replaces the tags on a collection with the supplied list. Tags not present in the request are removed. Empty or whitespace-only tags are filtered; duplicates are deduplicated.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.CollectionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    CollectionsApi apiInstance = new CollectionsApi(defaultClient);
    Long collectionId = 56L; // Long | 
    PatchCollectionTagsInputBody patchCollectionTagsInputBody = new PatchCollectionTagsInputBody(); // PatchCollectionTagsInputBody | 
    try {
      PatchCollectionTagsOutputBody result = apiInstance.v3PatchCollectionTags(collectionId, patchCollectionTagsInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CollectionsApi#v3PatchCollectionTags");
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
| **collectionId** | **Long**|  | |
| **patchCollectionTagsInputBody** | [**PatchCollectionTagsInputBody**](PatchCollectionTagsInputBody.md)|  | |

### Return type

[**PatchCollectionTagsOutputBody**](PatchCollectionTagsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

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

