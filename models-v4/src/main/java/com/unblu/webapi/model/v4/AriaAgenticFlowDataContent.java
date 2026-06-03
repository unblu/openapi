package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AriaMultiflowAgenticFlowDataContent.class, name = "MULTIFLOW"),
	@JsonSubTypes.Type(value = AriaSingleFlowAgenticFlowDataContent.class, name = "SINGLE_FLOW"),
	@JsonSubTypes.Type(value = AriaSuggestionSourceAgenticFlowDataContent.class, name = "SUGGESTION_SOURCE"),
})
public interface AriaAgenticFlowDataContent {
	void setType(EAriaAgenticFlowDataContentType type);

	EAriaAgenticFlowDataContentType getType();

	AriaAgenticFlowDataContent type(EAriaAgenticFlowDataContentType type);

	void setId(String id);

	String getId();

	AriaAgenticFlowDataContent id(String id);

	void setPublishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows);

	List<AriaAgenticFlowTransferableData> getPublishedAgenticFlows();

	AriaAgenticFlowDataContent publishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows);

}
