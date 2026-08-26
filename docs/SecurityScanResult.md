

# SecurityScanResult


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**analysisId** | **Long** | Analysis the run was performed against |  |
|**cancelled** | **Boolean** | Whether the run was cancelled before it covered every function |  |
|**decompiled** | **Long** | Functions successfully decompiled and scanned |  |
|**failed** | **Long** | Functions whose decompilation or scan attempt errored |  |
|**securityScan** | **Map&lt;String, Object&gt;** | Raw semgrep findings, keyed by the scanner&#39;s own result shape |  [optional] |
|**source** | **String** | Decompiler that produced the source scanned |  |
|**total** | **Long** | Functions the run considered |  |



