

# SecurityScanResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Long** | Analysis the run was performed against |  |
|**cancelled** | **Boolean** | Whether the run was cancelled before it covered every function |  |
|**decompiled** | **Long** | Functions successfully decompiled and scanned |  |
|**failed** | **Long** | Functions whose decompilation or scan attempt errored |  |
|**securityScan** | **List&lt;SecurityFinding&gt;** | Shaped semgrep findings, one per result |  [optional] |
|**total** | **Long** | Functions the run considered |  |



