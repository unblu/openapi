package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "recordingSystem", visible = true, defaultImpl = UnbluConversationRecordingData.class)
@JsonSubTypes({
	@JsonSubTypes.Type(value = SiprecConversationRecordingData.class, name = "SIPREC"),
	@JsonSubTypes.Type(value = UnbluConversationRecordingData.class, name = "UNBLU"),
})
public interface ConversationRecordingData {
	void setId(String id);

	String getId();

	ConversationRecordingData id(String id);

	void setAccountId(String accountId);

	String getAccountId();

	ConversationRecordingData accountId(String accountId);

	void setConversationId(String conversationId);

	String getConversationId();

	ConversationRecordingData conversationId(String conversationId);

	void setCallIds(List<String> callIds);

	List<String> getCallIds();

	ConversationRecordingData callIds(List<String> callIds);

	void setRecordingSystem(ERecordingSystem recordingSystem);

	ERecordingSystem getRecordingSystem();

	ConversationRecordingData recordingSystem(ERecordingSystem recordingSystem);

	void setStartTimestamp(Long startTimestamp);

	Long getStartTimestamp();

	ConversationRecordingData startTimestamp(Long startTimestamp);

	void setEndTimestamp(Long endTimestamp);

	Long getEndTimestamp();

	ConversationRecordingData endTimestamp(Long endTimestamp);

}
