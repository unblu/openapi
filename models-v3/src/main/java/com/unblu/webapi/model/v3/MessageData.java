package com.unblu.webapi.model.v3;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = ApprovalRequestMessageData.class, name = "APPROVAL_REQUEST"),
	@JsonSubTypes.Type(value = CardMessageData.class, name = "CARD"),
	@JsonSubTypes.Type(value = FileMessageData.class, name = "FILE"),
	@JsonSubTypes.Type(value = ListMessageData.class, name = "LIST"),
	@JsonSubTypes.Type(value = MultichoiceQuestionMessageData.class, name = "MULTICHOICE_QUESTION"),
	@JsonSubTypes.Type(value = QuestionAbortedMessageData.class, name = "QUESTION_ABORTED"),
	@JsonSubTypes.Type(value = RatingQuestionMessageData.class, name = "RATING_QUESTION"),
	@JsonSubTypes.Type(value = ReplyMessageData.class, name = "REPLY"),
	@JsonSubTypes.Type(value = TextMessageData.class, name = "TEXT"),
	@JsonSubTypes.Type(value = TextQuestionMessageData.class, name = "TEXT_QUESTION"),
})
public interface MessageData {
	void setId(String id);

	String getId();

	MessageData id(String id);

	void setConversationId(String conversationId);

	String getConversationId();

	MessageData conversationId(String conversationId);

	void setExternalMessengerChannelId(String externalMessengerChannelId);

	String getExternalMessengerChannelId();

	MessageData externalMessengerChannelId(String externalMessengerChannelId);

	void setAccountId(String accountId);

	String getAccountId();

	MessageData accountId(String accountId);

	void setSenderPerson(PersonData senderPerson);

	PersonData getSenderPerson();

	MessageData senderPerson(PersonData senderPerson);

	void setSenderPersonPresenceId(String senderPersonPresenceId);

	String getSenderPersonPresenceId();

	MessageData senderPersonPresenceId(String senderPersonPresenceId);

	void setServerTimestamp(Long serverTimestamp);

	Long getServerTimestamp();

	MessageData serverTimestamp(Long serverTimestamp);

	void setSendTimestamp(Long sendTimestamp);

	Long getSendTimestamp();

	MessageData sendTimestamp(Long sendTimestamp);

	void setType(EMessageType type);

	EMessageType getType();

	MessageData type(EMessageType type);

	void setRecipientPersonIds(List<String> recipientPersonIds);

	List<String> getRecipientPersonIds();

	MessageData recipientPersonIds(List<String> recipientPersonIds);

	void setFallbackText(String fallbackText);

	String getFallbackText();

	MessageData fallbackText(String fallbackText);

	void setActionId(String actionId);

	String getActionId();

	MessageData actionId(String actionId);

	void setSourceId(String sourceId);

	String getSourceId();

	MessageData sourceId(String sourceId);

}
