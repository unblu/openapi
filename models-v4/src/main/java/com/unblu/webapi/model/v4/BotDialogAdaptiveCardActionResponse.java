package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = BotDialogAdaptiveCardActionEmptyResponse.class, name = "EMPTY"),
	@JsonSubTypes.Type(value = BotDialogAdaptiveCardActionReplacementResponse.class, name = "REPLACEMENT"),
})
public interface BotDialogAdaptiveCardActionResponse {
	void setType(EBotDialogAdaptiveCardActionResponseType type);

	EBotDialogAdaptiveCardActionResponseType getType();

	BotDialogAdaptiveCardActionResponse type(EBotDialogAdaptiveCardActionResponseType type);

}
