

# OperationMetadataReportResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**done** | **Boolean** | Whether the operation has reached a terminal state. |  |
|**error** | **Status** | Failure detail, populated only when done is true and the operation failed. |  [optional] |
|**metadata** | **Metadata** | In-flight information and details. |  [optional] |
|**name** | **String** | API resource name. |  |
|**response** | **ReportResult** | Result, set only when done is true and the operation succeeded. |  [optional] |



