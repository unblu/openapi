package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = TextEditMessageData.class, name = "TEXT"),
})
public interface EditMessageData {
	void setType(EPostMessageType type);

	EPostMessageType getType();

	EditMessageData type(EPostMessageType type);

	void setFallbackText(String fallbackText);

	String getFallbackText();

	EditMessageData fallbackText(String fallbackText);

	void setLocale(String locale);

	String getLocale();

	EditMessageData locale(String locale);

	void setText(String text);

	String getText();

	EditMessageData text(String text);

	void setTextType(EConversationMessageTextType textType);

	EConversationMessageTextType getTextType();

	EditMessageData textType(EConversationMessageTextType textType);

	void setQuickReplies(List<QuickReply> quickReplies);

	List<QuickReply> getQuickReplies();

	EditMessageData quickReplies(List<QuickReply> quickReplies);

}
