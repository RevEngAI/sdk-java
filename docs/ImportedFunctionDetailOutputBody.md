

# ImportedFunctionDetailOutputBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**callers** | [**List&lt;ImportedFunctionCallerEntry&gt;**](ImportedFunctionCallerEntry.md) | Internal functions that call this import, resolved via its PLT/stub addresses. |  |
|**importedFunctionId** | **Long** |  |  |
|**isFunction** | **Boolean** | False for imported data symbols. |  |
|**libraryName** | **String** | Library the symbol is imported from. &#39;&lt;EXTERNAL&gt;&#39; for unattributed imports. |  |
|**libraryVersion** | **String** | Versioned symbol tag, when the loader records one. |  [optional] |
|**name** | **String** |  |  |
|**originalName** | **String** | Pre-demangling / pre-aliasing name, when it differs from name. |  [optional] |
|**stubVaddrs** | **List&lt;Long&gt;** | PLT/stub addresses that resolve external call edges (function_call_edges.callee_vaddr) to this import. Use these to link a caller&#39;s external callee to this import. |  |
|**vaddr** | **Long** | Virtual address of the import, when known. |  [optional] |



