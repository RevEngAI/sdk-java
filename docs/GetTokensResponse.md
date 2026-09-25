

# GetTokensResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiDecomp** | **String** | Tokenised AI-decompilation. Includes generated comments. Empty until a run has succeeded. |  |
|**analysisId** | **Long** | Analysis the function belongs to. Scopes every data_type_id below. |  |
|**placeholderToRenderedToken** | **Map&lt;String, RenderedToken&gt;** | Each placeholder token mapped to the value the server would render in its place, and the record it refers to. Null until a run has succeeded. |  |
|**placeholderToUserOverride** | **Map&lt;String, Token&gt;** | The overrides on this function, keyed by token, each carrying who chose it. Null until a run has succeeded. |  |



