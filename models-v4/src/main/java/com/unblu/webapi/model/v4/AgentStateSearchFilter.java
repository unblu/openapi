package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AutoPauseNotificationsReasonExpirationTimestampAgentStateSearchFilter.class, name = "AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = AutoPauseNotificationsReasonSourceIdAgentStateSearchFilter.class, name = "AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID"),
	@JsonSubTypes.Type(value = OnlineStateAgentStateSearchFilter.class, name = "ONLINE_STATE"),
	@JsonSubTypes.Type(value = PauseNotificationsEndTimestampAgentStateSearchFilter.class, name = "PAUSE_NOTIFICATIONS_END_TIMESTAMP"),
	@JsonSubTypes.Type(value = PauseNotificationsModeAgentStateSearchFilter.class, name = "PAUSE_NOTIFICATIONS_MODE"),
	@JsonSubTypes.Type(value = PauseNotificationsStateAgentStateSearchFilter.class, name = "PAUSE_NOTIFICATIONS_STATE"),
	@JsonSubTypes.Type(value = PersonIdAgentStateSearchFilter.class, name = "PERSON_ID"),
	@JsonSubTypes.Type(value = StatusMessageAgentStateSearchFilter.class, name = "STATUS_MESSAGE"),
})
public interface AgentStateSearchFilter {
	void setField(EAgentStateSearchFilterField field);

	EAgentStateSearchFilterField getField();

	AgentStateSearchFilter field(EAgentStateSearchFilterField field);

}
