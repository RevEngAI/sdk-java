# ConversationsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelRun**](ConversationsApi.md#cancelRun) | **POST** /v2/conversations/{id}/cancel | Cancel an active run |
| [**confirmTool**](ConversationsApi.md#confirmTool) | **POST** /v2/conversations/{id}/confirm | Approve or reject a pending tool confirmation |
| [**createConversation**](ConversationsApi.md#createConversation) | **POST** /v2/conversations | Create a new conversation |
| [**getConversation**](ConversationsApi.md#getConversation) | **GET** /v2/conversations/{id} | Get a conversation with its events |
| [**listConversations**](ConversationsApi.md#listConversations) | **GET** /v2/conversations | List conversations for the authenticated user |
| [**sendMessage**](ConversationsApi.md#sendMessage) | **POST** /v2/conversations/{id}/messages | Send a message and start an agentic run |
| [**streamEvents**](ConversationsApi.md#streamEvents) | **GET** /v2/conversations/{id}/events | Stream conversation events (SSE) |


<a id="cancelRun"></a>
# **cancelRun**
> StatusResponse cancelRun(id)

Cancel an active run

Cancels the currently active agentic run for the given conversation. Returns 404 if no run is in progress.  **Error codes:** - &#x60;400&#x60; [&#x60;INVALID_CONVERSATION_ID&#x60;](/errors/INVALID_CONVERSATION_ID) — Invalid Conversation ID - &#x60;404&#x60; [&#x60;CONVERSATION_NOT_FOUND&#x60;](/errors/CONVERSATION_NOT_FOUND) — Conversation Not Found - &#x60;404&#x60; [&#x60;NO_ACTIVE_RUN&#x60;](/errors/NO_ACTIVE_RUN) — No Active Run

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Conversation UUID
    try {
      StatusResponse result = apiInstance.cancelRun(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#cancelRun");
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
| **id** | **UUID**| Conversation UUID | |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="confirmTool"></a>
# **confirmTool**
> StatusResponse confirmTool(id, confirmToolInputBody)

Approve or reject a pending tool confirmation

Responds to a pending tool confirmation request. The agent pauses before executing certain tools and emits a &#x60;TOOL_CONFIRMATION_REQUIRED&#x60; event. Use this endpoint to approve or reject the tool call. Returns 404 if no confirmation is pending.  **Error codes:** - &#x60;400&#x60; [&#x60;INVALID_CONVERSATION_ID&#x60;](/errors/INVALID_CONVERSATION_ID) — Invalid Conversation ID - &#x60;404&#x60; [&#x60;CONVERSATION_NOT_FOUND&#x60;](/errors/CONVERSATION_NOT_FOUND) — Conversation Not Found - &#x60;404&#x60; [&#x60;NO_PENDING_CONFIRMATION&#x60;](/errors/NO_PENDING_CONFIRMATION) — No Pending Confirmation

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Conversation UUID
    ConfirmToolInputBody confirmToolInputBody = new ConfirmToolInputBody(); // ConfirmToolInputBody | 
    try {
      StatusResponse result = apiInstance.confirmTool(id, confirmToolInputBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#confirmTool");
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
| **id** | **UUID**| Conversation UUID | |
| **confirmToolInputBody** | [**ConfirmToolInputBody**](ConfirmToolInputBody.md)|  | |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

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

<a id="createConversation"></a>
# **createConversation**
> Conversation createConversation(createConversationRequest)

Create a new conversation

Creates a new conversation for the authenticated user. Optionally include a binary analysis context to scope the assistant to a specific analysis.  **Error codes:** - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    CreateConversationRequest createConversationRequest = new CreateConversationRequest(); // CreateConversationRequest | 
    try {
      Conversation result = apiInstance.createConversation(createConversationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#createConversation");
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
| **createConversationRequest** | [**CreateConversationRequest**](CreateConversationRequest.md)|  | |

### Return type

[**Conversation**](Conversation.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getConversation"></a>
# **getConversation**
> ConversationWithEvents getConversation(id)

Get a conversation with its events

Returns the conversation metadata along with all persisted events. Useful for reconstructing the full conversation history on page load.  **Error codes:** - &#x60;400&#x60; [&#x60;INVALID_CONVERSATION_ID&#x60;](/errors/INVALID_CONVERSATION_ID) — Invalid Conversation ID - &#x60;404&#x60; [&#x60;CONVERSATION_NOT_FOUND&#x60;](/errors/CONVERSATION_NOT_FOUND) — Conversation Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Conversation UUID
    try {
      ConversationWithEvents result = apiInstance.getConversation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#getConversation");
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
| **id** | **UUID**| Conversation UUID | |

### Return type

[**ConversationWithEvents**](ConversationWithEvents.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="listConversations"></a>
# **listConversations**
> List&lt;Conversation&gt; listConversations()

List conversations for the authenticated user

Returns all conversations owned by the authenticated user, ordered by most recently updated.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    try {
      List<Conversation> result = apiInstance.listConversations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listConversations");
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

[**List&lt;Conversation&gt;**](Conversation.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error |  -  |

<a id="sendMessage"></a>
# **sendMessage**
> StatusResponse sendMessage(id, sendMessageRequest)

Send a message and start an agentic run

Sends a user message to the conversation and kicks off an agentic processing loop in the background. Returns immediately with 202 Accepted. Subscribe to &#x60;/v2/conversations/{id}/events&#x60; via SSE to receive real-time updates including text deltas, tool calls, and run lifecycle events.  **Error codes:** - &#x60;400&#x60; [&#x60;BAD_REQUEST&#x60;](/errors/BAD_REQUEST) — Bad Request - &#x60;400&#x60; [&#x60;INVALID_CONVERSATION_ID&#x60;](/errors/INVALID_CONVERSATION_ID) — Invalid Conversation ID - &#x60;404&#x60; [&#x60;CONVERSATION_NOT_FOUND&#x60;](/errors/CONVERSATION_NOT_FOUND) — Conversation Not Found - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;402&#x60; [&#x60;INSUFFICIENT_CREDITS&#x60;](/errors/INSUFFICIENT_CREDITS) — Insufficient Credits - &#x60;409&#x60; [&#x60;RUN_ALREADY_ACTIVE&#x60;](/errors/RUN_ALREADY_ACTIVE) — Run Already Active

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Conversation UUID
    SendMessageRequest sendMessageRequest = new SendMessageRequest(); // SendMessageRequest | 
    try {
      StatusResponse result = apiInstance.sendMessage(id, sendMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#sendMessage");
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
| **id** | **UUID**| Conversation UUID | |
| **sendMessageRequest** | [**SendMessageRequest**](SendMessageRequest.md)|  | |

### Return type

[**StatusResponse**](StatusResponse.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **402** | Payment Required |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="streamEvents"></a>
# **streamEvents**
> List&lt;StreamEvents200ResponseInner&gt; streamEvents(id, lastEventId)

Stream conversation events (SSE)

Opens a Server-Sent Events stream for the given conversation. Events include run lifecycle updates, streaming text deltas, tool call progress, and more. Use the &#x60;last_event_id&#x60; query parameter to replay missed events after a reconnection.

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Conversation UUID
    Long lastEventId = 56L; // Long | Replay events after this ID
    try {
      List<StreamEvents200ResponseInner> result = apiInstance.streamEvents(id, lastEventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#streamEvents");
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
| **id** | **UUID**| Conversation UUID | |
| **lastEventId** | **Long**| Replay events after this ID | [optional] |

### Return type

[**List&lt;StreamEvents200ResponseInner&gt;**](StreamEvents200ResponseInner.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/event-stream, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Error |  -  |

