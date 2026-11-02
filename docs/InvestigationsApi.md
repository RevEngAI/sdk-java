# InvestigationsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v3CreateInvestigation**](InvestigationsApi.md#v3CreateInvestigation) | **POST** /v3/investigations | Create an investigation. |
| [**v3CreateInvestigationConversation**](InvestigationsApi.md#v3CreateInvestigationConversation) | **POST** /v3/investigations/{investigation_id}/conversations | Start a conversation in an investigation. |
| [**v3DeleteInvestigation**](InvestigationsApi.md#v3DeleteInvestigation) | **DELETE** /v3/investigations/{investigation_id} | Delete an investigation. |
| [**v3GetInvestigation**](InvestigationsApi.md#v3GetInvestigation) | **GET** /v3/investigations/{investigation_id} | Get an investigation. |
| [**v3GetInvestigationFinding**](InvestigationsApi.md#v3GetInvestigationFinding) | **GET** /v3/investigations/{investigation_id}/findings/{finding_id} | Get a finding of an investigation. |
| [**v3ListInvestigationAgentRuns**](InvestigationsApi.md#v3ListInvestigationAgentRuns) | **GET** /v3/investigations/agent-runs | List agent runs on investigations. |
| [**v3ListInvestigationConversations**](InvestigationsApi.md#v3ListInvestigationConversations) | **GET** /v3/investigations/{investigation_id}/conversations | List the conversations of an investigation. |
| [**v3ListInvestigationFindings**](InvestigationsApi.md#v3ListInvestigationFindings) | **GET** /v3/investigations/{investigation_id}/findings | List the findings of an investigation. |
| [**v3ListInvestigationSpend**](InvestigationsApi.md#v3ListInvestigationSpend) | **GET** /v3/investigations/{investigation_id}/spend | List what an investigation spent. |
| [**v3ListInvestigations**](InvestigationsApi.md#v3ListInvestigations) | **GET** /v3/investigations | List investigations. |
| [**v3PatchInvestigation**](InvestigationsApi.md#v3PatchInvestigation) | **PATCH** /v3/investigations/{investigation_id} | Update an investigation. |
| [**v3SetInvestigationBudget**](InvestigationsApi.md#v3SetInvestigationBudget) | **PUT** /v3/investigations/{investigation_id}/budget | Set the budget of an investigation. |


<a id="v3CreateInvestigation"></a>
# **v3CreateInvestigation**
> InvestigationBody v3CreateInvestigation(createInvestigationInputBody)

Create an investigation.

Creates an investigation owned by the caller, initially open and empty.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    CreateInvestigationInputBody createInvestigationInputBody = new CreateInvestigationInputBody(); // CreateInvestigationInputBody | 
    try {
      InvestigationBody result = apiInstance.v3CreateInvestigation(createInvestigationInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3CreateInvestigation");
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
| **createInvestigationInputBody** | [**CreateInvestigationInputBody**](CreateInvestigationInputBody.md)|  | |

### Return type

[**InvestigationBody**](InvestigationBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3CreateInvestigationConversation"></a>
# **v3CreateInvestigationConversation**
> ConversationBody v3CreateInvestigationConversation(investigationId, createConversationInputBody)

Start a conversation in an investigation.

Starts a chat conversation held by the investigation, about the whole investigation or about one of its analyses. Anyone who can see the investigation can start one. Read it, stream it and send messages in it with the /v2/conversations endpoints; only the user who started it can send messages in it. Deleting the investigation deletes its conversations.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    CreateConversationInputBody createConversationInputBody = new CreateConversationInputBody(); // CreateConversationInputBody | 
    try {
      ConversationBody result = apiInstance.v3CreateInvestigationConversation(investigationId, createConversationInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3CreateInvestigationConversation");
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
| **investigationId** | **Long**|  | |
| **createConversationInputBody** | [**CreateConversationInputBody**](CreateConversationInputBody.md)|  | |

### Return type

[**ConversationBody**](ConversationBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

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

<a id="v3DeleteInvestigation"></a>
# **v3DeleteInvestigation**
> v3DeleteInvestigation(investigationId)

Delete an investigation.

Deletes an investigation and its links to analyses. The analyses themselves are not deleted. Only the owner can delete an investigation.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    try {
      apiInstance.v3DeleteInvestigation(investigationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3DeleteInvestigation");
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
| **investigationId** | **Long**|  | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3GetInvestigation"></a>
# **v3GetInvestigation**
> GetInvestigationOutputBody v3GetInvestigation(investigationId)

Get an investigation.

Gets a single investigation, including the IDs of the analyses in it that the caller may see.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    try {
      GetInvestigationOutputBody result = apiInstance.v3GetInvestigation(investigationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3GetInvestigation");
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
| **investigationId** | **Long**|  | |

### Return type

[**GetInvestigationOutputBody**](GetInvestigationOutputBody.md)

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

<a id="v3GetInvestigationFinding"></a>
# **v3GetInvestigationFinding**
> GetFindingOutputBody v3GetInvestigationFinding(investigationId, findingId)

Get a finding of an investigation.

Gets a single finding, including the IDs of the analyses it was derived from that the caller may see.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    Long findingId = 56L; // Long | 
    try {
      GetFindingOutputBody result = apiInstance.v3GetInvestigationFinding(investigationId, findingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3GetInvestigationFinding");
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
| **investigationId** | **Long**|  | |
| **findingId** | **Long**|  | |

### Return type

[**GetFindingOutputBody**](GetFindingOutputBody.md)

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

<a id="v3ListInvestigationAgentRuns"></a>
# **v3ListInvestigationAgentRuns**
> ListAgentRunsOutputBody v3ListInvestigationAgentRuns(investigationId, ownerId, status, severity, search, limit, offset)

List agent runs on investigations.

Lists the runs of agents on the files of the investigations you can see, most recently updated first, each with a summary of its result once it is done. A run on a file held by several investigations is listed once for each. Only files you may see are included. Supports narrowing to one investigation, filtering by the investigations&#39; owner, status, severity and name, and pagination.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 0L; // Long | Only return runs on the files of this investigation. 0 returns runs across every investigation you can see.
    List<Long> ownerId = Arrays.asList(); // List<Long> | Only return runs in investigations owned by one of these user IDs.
    List<String> status = Arrays.asList(); // List<String> | Only return runs in investigations in one of these statuses.
    List<String> severity = Arrays.asList(); // List<String> | Only return runs in investigations with one of these severities.
    String search = "search_example"; // String | Only return runs in investigations whose name contains this text, ignoring case.
    Long limit = 20L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ListAgentRunsOutputBody result = apiInstance.v3ListInvestigationAgentRuns(investigationId, ownerId, status, severity, search, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3ListInvestigationAgentRuns");
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
| **investigationId** | **Long**| Only return runs on the files of this investigation. 0 returns runs across every investigation you can see. | [optional] [default to 0] |
| **ownerId** | [**List&lt;Long&gt;**](Long.md)| Only return runs in investigations owned by one of these user IDs. | [optional] |
| **status** | [**List&lt;String&gt;**](String.md)| Only return runs in investigations in one of these statuses. | [optional] [enum: OPEN, IN_PROGRESS, ON_HOLD, CLOSED] |
| **severity** | [**List&lt;String&gt;**](String.md)| Only return runs in investigations with one of these severities. | [optional] [enum: CRITICAL, HIGH, MEDIUM, LOW] |
| **search** | **String**| Only return runs in investigations whose name contains this text, ignoring case. | [optional] |
| **limit** | **Long**|  | [optional] [default to 20] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ListAgentRunsOutputBody**](ListAgentRunsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3ListInvestigationConversations"></a>
# **v3ListInvestigationConversations**
> ListConversationsOutputBody v3ListInvestigationConversations(investigationId, limit, offset)

List the conversations of an investigation.

Lists the chat conversations held by the investigation, whoever started them, most recently active first. Visible to anyone who can see the investigation. Supports pagination.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    Long limit = 20L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ListConversationsOutputBody result = apiInstance.v3ListInvestigationConversations(investigationId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3ListInvestigationConversations");
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
| **investigationId** | **Long**|  | |
| **limit** | **Long**|  | [optional] [default to 20] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ListConversationsOutputBody**](ListConversationsOutputBody.md)

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

<a id="v3ListInvestigationFindings"></a>
# **v3ListInvestigationFindings**
> ListFindingsOutputBody v3ListInvestigationFindings(investigationId, findingType, severity, limit, offset)

List the findings of an investigation.

Lists what the investigation has found, most severe first and then most recent first. Visible to anyone who can see the investigation. Supports filtering by finding type and severity, and pagination.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    List<String> findingType = Arrays.asList(); // List<String> | Only return findings of one of these types.
    List<String> severity = Arrays.asList(); // List<String> | Only return findings with one of these severities.
    Long limit = 20L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ListFindingsOutputBody result = apiInstance.v3ListInvestigationFindings(investigationId, findingType, severity, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3ListInvestigationFindings");
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
| **investigationId** | **Long**|  | |
| **findingType** | [**List&lt;String&gt;**](String.md)| Only return findings of one of these types. | [optional] [enum: IOC, CAPABILITY, VULNERABILITY, CROSS_FILE_FLOW] |
| **severity** | [**List&lt;String&gt;**](String.md)| Only return findings with one of these severities. | [optional] [enum: CRITICAL, HIGH, MEDIUM, LOW] |
| **limit** | **Long**|  | [optional] [default to 20] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ListFindingsOutputBody**](ListFindingsOutputBody.md)

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

<a id="v3ListInvestigationSpend"></a>
# **v3ListInvestigationSpend**
> ListSpendOutputBody v3ListInvestigationSpend(investigationId, limit, offset)

List what an investigation spent.

Lists the credits charged for the investigation&#39;s conversation turns and the agents run from it, newest first. Visible to anyone who can see the investigation. Supports pagination.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    Long limit = 20L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ListSpendOutputBody result = apiInstance.v3ListInvestigationSpend(investigationId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3ListInvestigationSpend");
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
| **investigationId** | **Long**|  | |
| **limit** | **Long**|  | [optional] [default to 20] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ListSpendOutputBody**](ListSpendOutputBody.md)

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

<a id="v3ListInvestigations"></a>
# **v3ListInvestigations**
> ListInvestigationsOutputBody v3ListInvestigations(status, severity, caseType, ownerId, search, orderBy, order, limit, offset)

List investigations.

Lists the investigations the caller owns or that are shared with the caller&#39;s team, most recently updated first by default. Supports filtering by status, severity, case type and owner, a name search, and pagination.  **Error codes:** - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    List<String> status = Arrays.asList(); // List<String> | Only return investigations in one of these statuses.
    List<String> severity = Arrays.asList(); // List<String> | Only return investigations with one of these severities.
    List<String> caseType = Arrays.asList(); // List<String> | Only return investigations of one of these case types.
    List<Long> ownerId = Arrays.asList(); // List<Long> | Only return investigations owned by one of these user IDs.
    String search = "search_example"; // String | Only return investigations whose name contains this text, ignoring case.
    String orderBy = "updated"; // String | 
    String order = "ASC"; // String | 
    Long limit = 20L; // Long | 
    Long offset = 0L; // Long | 
    try {
      ListInvestigationsOutputBody result = apiInstance.v3ListInvestigations(status, severity, caseType, ownerId, search, orderBy, order, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3ListInvestigations");
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
| **status** | [**List&lt;String&gt;**](String.md)| Only return investigations in one of these statuses. | [optional] [enum: OPEN, IN_PROGRESS, ON_HOLD, CLOSED] |
| **severity** | [**List&lt;String&gt;**](String.md)| Only return investigations with one of these severities. | [optional] [enum: CRITICAL, HIGH, MEDIUM, LOW] |
| **caseType** | [**List&lt;String&gt;**](String.md)| Only return investigations of one of these case types. | [optional] [enum: REVERSE_ENGINEERING, MALWARE_ANALYSIS, VULNERABILITY_DISCOVERY] |
| **ownerId** | [**List&lt;Long&gt;**](Long.md)| Only return investigations owned by one of these user IDs. | [optional] |
| **search** | **String**| Only return investigations whose name contains this text, ignoring case. | [optional] |
| **orderBy** | **String**|  | [optional] [default to updated] [enum: updated, created, name] |
| **order** | **String**|  | [optional] [default to DESC] [enum: ASC, DESC] |
| **limit** | **Long**|  | [optional] [default to 20] |
| **offset** | **Long**|  | [optional] [default to 0] |

### Return type

[**ListInvestigationsOutputBody**](ListInvestigationsOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey), [bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="v3PatchInvestigation"></a>
# **v3PatchInvestigation**
> InvestigationBody v3PatchInvestigation(investigationId, patchInvestigationInputBody)

Update an investigation.

Updates an investigation&#39;s name, case type, severity, status and/or scope. Omitted fields keep their existing values. Only the owner can update an investigation.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    PatchInvestigationInputBody patchInvestigationInputBody = new PatchInvestigationInputBody(); // PatchInvestigationInputBody | 
    try {
      InvestigationBody result = apiInstance.v3PatchInvestigation(investigationId, patchInvestigationInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3PatchInvestigation");
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
| **investigationId** | **Long**|  | |
| **patchInvestigationInputBody** | [**PatchInvestigationInputBody**](PatchInvestigationInputBody.md)|  | |

### Return type

[**InvestigationBody**](InvestigationBody.md)

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

<a id="v3SetInvestigationBudget"></a>
# **v3SetInvestigationBudget**
> BudgetBody v3SetInvestigationBudget(investigationId, setBudgetInputBody)

Set the budget of an investigation.

Sets the most credits the investigation may spend on its conversations and the agents run from it, or removes the limit with null. Once the budget is spent, no new message or agent run is started from the investigation; work already under way finishes, so spend can go a little past the budget. Only the owner can set the budget.  **Error codes:** - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;422&#x60; [&#x60;VALIDATION_FAILED&#x60;](/errors/VALIDATION_FAILED) — Validation Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.InvestigationsApi;

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

    InvestigationsApi apiInstance = new InvestigationsApi(defaultClient);
    Long investigationId = 56L; // Long | 
    SetBudgetInputBody setBudgetInputBody = new SetBudgetInputBody(); // SetBudgetInputBody | 
    try {
      BudgetBody result = apiInstance.v3SetInvestigationBudget(investigationId, setBudgetInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvestigationsApi#v3SetInvestigationBudget");
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
| **investigationId** | **Long**|  | |
| **setBudgetInputBody** | [**SetBudgetInputBody**](SetBudgetInputBody.md)|  | |

### Return type

[**BudgetBody**](BudgetBody.md)

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

