

# GetTokensResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**aiDecomp** | **String** | Tokenised AI-decompilation. Includes generated comments. Empty until a run has succeeded. |  |
|**analysisId** | **Long** | Analysis the function belongs to. Scopes every data_type_id below. |  |
|**placeholderToRenderedToken** | [**Map&lt;String, RenderedToken&gt;**](RenderedToken.md) | Each placeholder token mapped to the value the server would render in its place, and the record it refers to. Null until a run has succeeded. |  |
|**placeholderToUserOverride** | [**Map&lt;String, Token&gt;**](Token.md) | The caller&#39;s own overrides, keyed by token. Null until a run has succeeded. |  |



