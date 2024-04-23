package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "field", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AccountSidSmsExternalMessengerChannelSearchFilter.class, name = "ACCOUNT_SID"),
	@JsonSubTypes.Type(value = CreationTimestampSmsExternalMessengerChannelSearchFilter.class, name = "CREATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = ModificationTimestampSmsExternalMessengerChannelSearchFilter.class, name = "MODIFICATION_TIMESTAMP"),
	@JsonSubTypes.Type(value = NameSmsExternalMessengerChannelSearchFilter.class, name = "NAME"),
	@JsonSubTypes.Type(value = PhoneNumberSmsExternalMessengerChannelSearchFilter.class, name = "PHONE_NUMBER"),
})
public interface SmsExternalMessengerChannelSearchFilter {
	void setField(ESmsExternalMessengerChannelSearchFilterField field);

	ESmsExternalMessengerChannelSearchFilterField getField();

	SmsExternalMessengerChannelSearchFilter field(ESmsExternalMessengerChannelSearchFilterField field);

}
