package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AutoPauseNotificationsReasonExpirationTimestampPersonStateSearchFilter.class, name = "AUTO_PAUSE_NOTIFICATIONS_REASON_EXPIRATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = AutoPauseNotificationsReasonSourceIdPersonStateSearchFilter.class, name = "AUTO_PAUSE_NOTIFICATIONS_REASON_SOURCE_ID"),
	@JsonSubTypes.Type(value = OnlineStatePersonStateSearchFilter.class, name = "ONLINE_STATE"),
	@JsonSubTypes.Type(value = PauseNotificationsEndTimestampPersonStateSearchFilter.class, name = "PAUSE_NOTIFICATIONS_END_TIMESTAMP"),
	@JsonSubTypes.Type(value = PauseNotificationsModePersonStateSearchFilter.class, name = "PAUSE_NOTIFICATIONS_MODE"),
	@JsonSubTypes.Type(value = PauseNotificationsStatePersonStateSearchFilter.class, name = "PAUSE_NOTIFICATIONS_STATE"),
	@JsonSubTypes.Type(value = PersonIdPersonStateSearchFilter.class, name = "PERSON_ID"),
	@JsonSubTypes.Type(value = StatusMessagePersonStateSearchFilter.class, name = "STATUS_MESSAGE"),
})
public interface PersonStateSearchFilter {
	void setField(EPersonStateSearchFilterField field);

	EPersonStateSearchFilterField getField();

	PersonStateSearchFilter field(EPersonStateSearchFilterField field);

}
