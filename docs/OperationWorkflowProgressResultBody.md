

# OperationWorkflowProgressResultBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**done** | **Boolean** | Whether the operation has reached a terminal state. |  |
|**error** | [**Status**](Status.md) | Failure detail, populated only when done is true and the operation failed. |  [optional] |
|**metadata** | [**WorkflowProgress**](WorkflowProgress.md) | In-flight information and details. |  [optional] |
|**name** | **String** | API resource name. |  |
|**response** | [**ResultBody**](ResultBody.md) | Result, set only when done is true and the operation succeeded. |  [optional] |



