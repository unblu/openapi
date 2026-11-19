package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CallIdRecordingSearchFilter.class, name = "CALL_ID"),
	@JsonSubTypes.Type(value = ConversationIdRecordingSearchFilter.class, name = "CONVERSATION_ID"),
	@JsonSubTypes.Type(value = EndTimestampRecordingSearchFilter.class, name = "END_TIMESTAMP"),
	@JsonSubTypes.Type(value = RecordingSystemRecordingSearchFilter.class, name = "RECORDING_SYSTEM"),
	@JsonSubTypes.Type(value = SiprecSessionIdRecordingSearchFilter.class, name = "SIPREC_SESSION_ID"),
	@JsonSubTypes.Type(value = StartTimestampRecordingSearchFilter.class, name = "START_TIMESTAMP"),
})
public interface RecordingSearchFilter {
	void setField(ERecordingSearchFilterField field);

	ERecordingSearchFilterField getField();

	RecordingSearchFilter field(ERecordingSearchFilterField field);

}
