package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CardPostMessageData.class, name = "CARD"),
	@JsonSubTypes.Type(value = FilePostMessageData.class, name = "FILE"),
	@JsonSubTypes.Type(value = ListPostMessageData.class, name = "LIST"),
	@JsonSubTypes.Type(value = MultichoiceQuestionPostMessageData.class, name = "MULTICHOICE_QUESTION"),
	@JsonSubTypes.Type(value = RatingQuestionPostMessageData.class, name = "RATING_QUESTION"),
	@JsonSubTypes.Type(value = ReplyPostMessageData.class, name = "REPLY"),
	@JsonSubTypes.Type(value = TextPostMessageData.class, name = "TEXT"),
	@JsonSubTypes.Type(value = TextQuestionPostMessageData.class, name = "TEXT_QUESTION"),
	@JsonSubTypes.Type(value = WhatsAppTemplatePostMessageData.class, name = "WHATS_APP_TEMPLATE"),
})
public interface PostMessageData {
	void setType(EPostMessageType type);

	EPostMessageType getType();

	PostMessageData type(EPostMessageType type);

	void setFallbackText(String fallbackText);

	String getFallbackText();

	PostMessageData fallbackText(String fallbackText);

}
