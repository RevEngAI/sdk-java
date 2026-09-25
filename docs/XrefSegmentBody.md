

# XrefSegmentBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**end** | **Long** | End address of the segment, inclusive |  |
|**exec** | **Boolean** | True when the segment is executable |  |
|**kind** | [**KindEnum**](#KindEnum) | Coarse classification of the segment |  |
|**name** | **String** | Segment name |  |
|**read** | **Boolean** | True when the segment is readable |  |
|**start** | **Long** | Start address of the segment |  |
|**write** | **Boolean** | True when the segment is writable |  |



## Enum: KindEnum

| Name | Value |
|---- | -----|
| CODE | &quot;code&quot; |
| DATA | &quot;data&quot; |
| OTHER | &quot;other&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



