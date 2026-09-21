

# SuggestedTypeView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataTypeId** | **Long** | Existing data type the members were accessed through. Null when nothing resolved to a row; never minted for a suggestion. |  [optional] |
|**holes** | **List&lt;SuggestedHole&gt;** | Gaps between consecutive placed members, in offset order. |  |
|**impliedSize** | **Long** | Highest byte_offset+byte_size across the members. A lower bound on the type&#39;s size, not its size. |  [optional] |
|**key** | **String** | Identity of the suggestion: index:&lt;data_type_id&gt; where the access named a row, else token:&lt;type_token&gt;. |  |
|**members** | **List&lt;SuggestedMemberView&gt;** | Members in offset order, unplaced ones last. |  |
|**name** | **String** | Name the type renders as: a database or frozen name where one exists, else the suggested one. |  |
|**typeToken** | **String** | Placeholder the type renders as, when it appears in this function&#39;s source. |  [optional] |
|**underlyingType** | **String** | Set only for a type with no observed members, where the suggestion is a name and a scalar type rather than a layout. |  [optional] |



