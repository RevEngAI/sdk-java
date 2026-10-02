

# SuggestedTypeView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**appliedDataTypeId** | **Long** | The type this suggestion became: a newly minted data type holding its name and members. Once set, the suggestion&#39;s entities resolve through this id rather than data_type_id. Null when it has not been applied, either because the pass is off or because nothing gave the suggestion a shape to store. |  [optional] |
|**dataTypeId** | **Long** | The type this suggestion is about: the existing data type the members were accessed through. Never modified by applying a suggestion. Null when nothing resolved to a row, which is what makes the suggestion a proposal. |  [optional] |
|**holes** | **List&lt;SuggestedHole&gt;** | Gaps between consecutive placed members, in offset order. |  |
|**impliedSize** | **Long** | Highest byte_offset+byte_size across the members. A lower bound on the type&#39;s size, not its size. |  [optional] |
|**key** | **String** | Identity of the suggestion: index:&lt;data_type_id&gt; where the access named a row, type:&lt;type_token&gt; for a type with no observed members, else token:&lt;type_token&gt;. Do not infer data_type_id from the prefix: a type: key may carry one too. |  |
|**members** | **List&lt;SuggestedMemberView&gt;** | Members in offset order, unplaced ones last. |  |
|**name** | **String** | Name the type renders as: a database or frozen name where one exists, else the suggested one. |  |
|**typeToken** | **String** | Placeholder the type renders as, when it appears in this function&#39;s source. |  [optional] |
|**underlyingType** | **String** | Set only for a type with no observed members, where the suggestion is a name and a scalar type rather than a layout. |  [optional] |



