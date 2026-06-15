# SearchApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchBinaries**](SearchApi.md#searchBinaries) | **GET** /v2/search/binaries | Binaries search |
| [**searchCollections**](SearchApi.md#searchCollections) | **GET** /v2/search/collections | Collections search |
| [**searchFunctions**](SearchApi.md#searchFunctions) | **GET** /v2/search/functions | Functions search |
| [**searchTags**](SearchApi.md#searchTags) | **GET** /v2/search/tags | Tags search |


<a id="searchBinaries"></a>
# **searchBinaries**
> BaseResponseBinarySearchResponse searchBinaries(page, pageSize, partialName, partialSha256, tags, modelName, userFilesOnly, excludeBinaryId)

Binaries search

Searches for a specific binary

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 10; // Integer | Number of items per page.
    String partialName = "partialName_example"; // String | The partial or full name of the binary being searched
    String partialSha256 = "partialSha256_example"; // String | The partial or full sha256 of the binary being searched
    List<String> tags = Arrays.asList(); // List<String> | The tags to be searched for
    String modelName = "modelName_example"; // String | The name of the model used to analyze the binary the function belongs to
    Boolean userFilesOnly = false; // Boolean | Whether to only search user's uploaded files
    Integer excludeBinaryId = 56; // Integer | A binary ID to exclude from the results
    try {
      BaseResponseBinarySearchResponse result = apiInstance.searchBinaries(page, pageSize, partialName, partialSha256, tags, modelName, userFilesOnly, excludeBinaryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchBinaries");
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
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 10] |
| **partialName** | **String**| The partial or full name of the binary being searched | [optional] |
| **partialSha256** | **String**| The partial or full sha256 of the binary being searched | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| The tags to be searched for | [optional] |
| **modelName** | **String**| The name of the model used to analyze the binary the function belongs to | [optional] |
| **userFilesOnly** | **Boolean**| Whether to only search user&#39;s uploaded files | [optional] [default to false] |
| **excludeBinaryId** | **Integer**| A binary ID to exclude from the results | [optional] |

### Return type

[**BaseResponseBinarySearchResponse**](BaseResponseBinarySearchResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | You must provide at least one of the filters; partial_name, partial_sha256, tags or model_name to search |  -  |

<a id="searchCollections"></a>
# **searchCollections**
> BaseResponseCollectionSearchResponse searchCollections(page, pageSize, partialCollectionName, partialBinaryName, partialBinarySha256, tags, modelName, filters, orderBy, orderByDirection)

Collections search

Searches for a specific collection

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 10; // Integer | Number of items per page.
    String partialCollectionName = "partialCollectionName_example"; // String | The partial or full name of the collection being searched
    String partialBinaryName = "partialBinaryName_example"; // String | The partial or full name of the binary belonging to the collection
    String partialBinarySha256 = "partialBinarySha256_example"; // String | The partial or full sha256 of the binary belonging to the collection
    List<String> tags = Arrays.asList(); // List<String> | The tags to be searched for
    String modelName = "modelName_example"; // String | The name of the model used to analyze the binary the function belongs to
    List<Filters> filters = Arrays.asList(); // List<Filters> | The filters to be used for the search
    AppApiRestV2CollectionsEnumsOrderBy orderBy = AppApiRestV2CollectionsEnumsOrderBy.fromValue("created"); // AppApiRestV2CollectionsEnumsOrderBy | The field to sort the order by in the results
    Order orderByDirection = Order.fromValue("ASC"); // Order | The order direction in which to return results
    try {
      BaseResponseCollectionSearchResponse result = apiInstance.searchCollections(page, pageSize, partialCollectionName, partialBinaryName, partialBinarySha256, tags, modelName, filters, orderBy, orderByDirection);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchCollections");
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
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 10] |
| **partialCollectionName** | **String**| The partial or full name of the collection being searched | [optional] |
| **partialBinaryName** | **String**| The partial or full name of the binary belonging to the collection | [optional] |
| **partialBinarySha256** | **String**| The partial or full sha256 of the binary belonging to the collection | [optional] |
| **tags** | [**List&lt;String&gt;**](String.md)| The tags to be searched for | [optional] |
| **modelName** | **String**| The name of the model used to analyze the binary the function belongs to | [optional] |
| **filters** | [**List&lt;Filters&gt;**](Filters.md)| The filters to be used for the search | [optional] |
| **orderBy** | [**AppApiRestV2CollectionsEnumsOrderBy**](.md)| The field to sort the order by in the results | [optional] [enum: created, collection, model, owner, collection_size, updated] |
| **orderByDirection** | [**Order**](.md)| The order direction in which to return results | [optional] [enum: ASC, DESC] |

### Return type

[**BaseResponseCollectionSearchResponse**](BaseResponseCollectionSearchResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | You must provide at least one of the filters; partial_collection_name, partial_binary_name, partial_binary_sha256, tags or model_name to search |  -  |
| **404** | The model name provided does not exist |  -  |

<a id="searchFunctions"></a>
# **searchFunctions**
> BaseResponseFunctionSearchResponse searchFunctions(page, pageSize, partialName, modelName)

Functions search

Searches for a specific function

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 10; // Integer | Number of items per page.
    String partialName = "partialName_example"; // String | The partial or full name of the function being searched
    String modelName = "modelName_example"; // String | The name of the model used to analyze the binary the function belongs to
    try {
      BaseResponseFunctionSearchResponse result = apiInstance.searchFunctions(page, pageSize, partialName, modelName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchFunctions");
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
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 10] |
| **partialName** | **String**| The partial or full name of the function being searched | [optional] |
| **modelName** | **String**| The name of the model used to analyze the binary the function belongs to | [optional] |

### Return type

[**BaseResponseFunctionSearchResponse**](BaseResponseFunctionSearchResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | You must provide at least one of the filters; partial_name, or model_name to search |  -  |

<a id="searchTags"></a>
# **searchTags**
> BaseResponseTagSearchResponse searchTags(partialName, page, pageSize)

Tags search

Searches for tags by there name

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String partialName = "partialName_example"; // String | The partial or full name of the tag to search for
    Integer page = 1; // Integer | The page number to retrieve.
    Integer pageSize = 10; // Integer | Number of items per page.
    try {
      BaseResponseTagSearchResponse result = apiInstance.searchTags(partialName, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#searchTags");
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
| **partialName** | **String**| The partial or full name of the tag to search for | |
| **page** | **Integer**| The page number to retrieve. | [optional] [default to 1] |
| **pageSize** | **Integer**| Number of items per page. | [optional] [default to 10] |

### Return type

[**BaseResponseTagSearchResponse**](BaseResponseTagSearchResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | You must provide a partial_name to search and it must be greater than 3 characters |  -  |

