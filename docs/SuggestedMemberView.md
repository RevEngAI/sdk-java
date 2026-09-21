

# SuggestedMemberView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bitOffset** | **Long** | Bit offset within the containing word for a bitfield member. |  |
|**byteOffset** | **Long** | Offset within the type. Null when no placement could be established. |  |
|**byteSize** | **Long** | Width of the access in bytes. |  |
|**confidence** | [**ConfidenceEnum**](#ConfidenceEnum) | Where suggested_type came from. declared and inferred were observed; width knows only the access width; model is the language model&#39;s proposal. |  |
|**name** | **String** | Name the member renders as: a database or frozen name where one exists, else the suggested one. |  |
|**origin** | **String** | Which function revealed this member: self, caller:&lt;function_id&gt; or callee:&lt;function_id&gt;. |  |
|**packed** | **Boolean** | The member sits at an offset its own width does not divide. |  |
|**placement** | [**PlacementEnum**](#PlacementEnum) | observed means the offset was read off an access; guessed means the model proposed it; unplaced means the member has no offset. |  |
|**suggestedType** | **String** | Type expression for the member. |  |
|**token** | **String** | Placeholder this member renders as in the tokenised source. Absent for a member no access in this function revealed. |  [optional] |



## Enum: ConfidenceEnum

| Name | Value |
|---- | -----|
| DECLARED | &quot;declared&quot; |
| INFERRED | &quot;inferred&quot; |
| WIDTH | &quot;width&quot; |
| MODEL | &quot;model&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: PlacementEnum

| Name | Value |
|---- | -----|
| OBSERVED | &quot;observed&quot; |
| GUESSED | &quot;guessed&quot; |
| UNPLACED | &quot;unplaced&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



