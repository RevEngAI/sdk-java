

# OperationSecurityScanMetadataSecurityScanResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**done** | **Boolean** | Whether the operation has reached a terminal state. |  |
|**error** | [**Status**](Status.md) | Failure detail, populated only when done is true and the operation failed. |  [optional] |
|**metadata** | [**SecurityScanMetadata**](SecurityScanMetadata.md) | In-flight information and details. |  [optional] |
|**name** | **String** | API resource name. |  |
|**response** | [**SecurityScanResult**](SecurityScanResult.md) | Result, set only when done is true and the operation succeeded. |  [optional] |



