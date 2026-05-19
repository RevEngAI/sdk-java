# ReportsApi

All URIs are relative to *https://api.reveng.ai*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createPdfReport**](ReportsApi.md#createPdfReport) | **POST** /v3/analyses/{analysis_id}/pdf | Start PDF report generation |
| [**downloadPdfReport**](ReportsApi.md#downloadPdfReport) | **GET** /v3/analyses/{analysis_id}/pdf | Download generated PDF report |
| [**getPdfReportStatus**](ReportsApi.md#getPdfReportStatus) | **GET** /v3/analyses/{analysis_id}/pdf/status | Get PDF report workflow status |


<a id="createPdfReport"></a>
# **createPdfReport**
> GeneratePDFOutputBody createPdfReport(analysisId)

Start PDF report generation

Starts an asynchronous PDF report generation workflow for the given analysis. Poll status and download the resulting PDF using the same analysis ID. Idempotent: if a workflow is already running for this analysis and user, the response sets &#x60;already_running: true&#x60; and the caller rejoins the in-flight workflow.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      GeneratePDFOutputBody result = apiInstance.createPdfReport(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#createPdfReport");
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

### Return type

[**GeneratePDFOutputBody**](GeneratePDFOutputBody.md)

### Authorization

[APIKey](../README.md#APIKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="downloadPdfReport"></a>
# **downloadPdfReport**
> downloadPdfReport(analysisId)

Download generated PDF report

Streams the rendered PDF report. Returns 409 when the workflow is still running and 404 when no report generation exists for this analysis or the caller is not authorised to see it.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found - &#x60;409&#x60; [&#x60;ANALYSIS_NOT_READY&#x60;](/errors/ANALYSIS_NOT_READY) — Analysis Not Ready - &#x60;500&#x60; [&#x60;REPORT_RENDER_FAILED&#x60;](/errors/REPORT_RENDER_FAILED) — Report Render Failed

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      apiInstance.downloadPdfReport(analysisId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#downloadPdfReport");
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
| **200** | OK |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **409** | Conflict |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

<a id="getPdfReportStatus"></a>
# **getPdfReportStatus**
> WorkflowProgress getPdfReportStatus(analysisId)

Get PDF report workflow status

Returns live workflow progress for the given analysis. Returns 404 when no report generation exists for this analysis or the caller is not authorised to see it.  **Error codes:** - &#x60;403&#x60; [&#x60;ACCESS_DENIED&#x60;](/errors/ACCESS_DENIED) — Access Denied - &#x60;404&#x60; [&#x60;NOT_FOUND&#x60;](/errors/NOT_FOUND) — Not Found

### Example
```java
// Import classes:
import ai.reveng.invoker.ApiClient;
import ai.reveng.invoker.ApiException;
import ai.reveng.invoker.Configuration;
import ai.reveng.invoker.auth.*;
import ai.reveng.invoker.models.*;
import ai.reveng.api.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.reveng.ai");
    
    // Configure API key authorization: APIKey
    ApiKeyAuth APIKey = (ApiKeyAuth) defaultClient.getAuthentication("APIKey");
    APIKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKey.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    Long analysisId = 56L; // Long | Analysis ID
    try {
      WorkflowProgress result = apiInstance.getPdfReportStatus(analysisId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getPdfReportStatus");
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

### Return type

[**WorkflowProgress**](WorkflowProgress.md)

### Authorization

[APIKey](../README.md#APIKey)

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

