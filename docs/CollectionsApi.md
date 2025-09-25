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


<a id="createCollection"></a>
# **createCollection**
> BaseResponseCollectionResponse createCollection(collectionCreateRequest, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCollectionResponse result = apiInstance.createCollection(collectionCreateRequest, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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
> BaseResponseBool deleteCollection(collectionId, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseBool result = apiInstance.deleteCollection(collectionId, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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
> BaseResponseCollectionResponse getCollection(collectionId, includeTags, includeBinaries, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCollectionResponse result = apiInstance.getCollection(collectionId, includeTags, includeBinaries, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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
> BaseResponseListCollectionResults listCollections(searchTerm, filters, limit, offset, orderBy, order, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseListCollectionResults result = apiInstance.listCollections(searchTerm, filters, limit, offset, orderBy, order, authorization);
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
| **orderBy** | [**AppApiRestV2CollectionsEnumsOrderBy**](.md)|  | [optional] [enum: created, collection, model, owner, collection_size, updated] |
| **order** | [**Order**](.md)|  | [optional] [enum: ASC, DESC] |
| **authorization** | **String**| API Key bearer token | [optional] |

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
> BaseResponseCollectionResponse updateCollection(collectionId, collectionUpdateRequest, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCollectionResponse result = apiInstance.updateCollection(collectionId, collectionUpdateRequest, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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
> BaseResponseCollectionBinariesUpdateResponse updateCollectionBinaries(collectionId, collectionBinariesUpdateRequest, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCollectionBinariesUpdateResponse result = apiInstance.updateCollectionBinaries(collectionId, collectionBinariesUpdateRequest, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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
> BaseResponseCollectionTagsUpdateResponse updateCollectionTags(collectionId, collectionTagsUpdateRequest, authorization)

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
    String authorization = "authorization_example"; // String | API Key bearer token
    try {
      BaseResponseCollectionTagsUpdateResponse result = apiInstance.updateCollectionTags(collectionId, collectionTagsUpdateRequest, authorization);
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
| **authorization** | **String**| API Key bearer token | [optional] |

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

