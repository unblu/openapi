package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "$_type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = MarkdownTextStreamingData.class, name = "MarkdownTextStreamingData"),
	@JsonSubTypes.Type(value = SimpleTextStreamingData.class, name = "SimpleTextStreamingData"),
})
public interface StreamingData {
	void setContent(String content);

	String getContent();

	StreamingData content(String content);

}
