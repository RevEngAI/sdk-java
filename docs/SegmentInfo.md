

# SegmentInfo

Represents the information about a segment.  This is the per-xref view, carried on :class:`XRef.segment`. The binary-wide ``AnalysisModel.segments`` list is written by a different producer with a different shape -- see :class:`MemorySegment`.  Attributes:     name: The name of the segment.     r: Determines if the segment has read permission.     w: Determines if the segment has write permission.     x: Determines if the segment has execute permission.     start: The start address of the segment.     end: The end address of the segment (inclusive).     kind: Coarse classification of the segment: \"code\", \"data\", or \"other\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  [optional] |
|**r** | **Boolean** |  |  [optional] |
|**w** | **Boolean** |  |  [optional] |
|**x** | **Boolean** |  |  [optional] |
|**start** | **Integer** |  |  [optional] |
|**end** | **Integer** |  |  [optional] |
|**kind** | **String** |  |  [optional] |



