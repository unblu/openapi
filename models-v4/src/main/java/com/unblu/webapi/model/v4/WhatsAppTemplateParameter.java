package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = WhatsAppTemplateCurrencyParameter.class, name = "CURRENCY"),
	@JsonSubTypes.Type(value = WhatsAppTemplateDateTimeParameter.class, name = "DATE_TIME"),
	@JsonSubTypes.Type(value = WhatsAppTemplateDocumentParameter.class, name = "DOCUMENT"),
	@JsonSubTypes.Type(value = WhatsAppTemplateImageParameter.class, name = "IMAGE"),
	@JsonSubTypes.Type(value = WhatsAppTemplateLocationParameter.class, name = "LOCATION"),
	@JsonSubTypes.Type(value = WhatsAppTemplatePayloadParameter.class, name = "PAYLOAD"),
	@JsonSubTypes.Type(value = WhatsAppTemplateTextParameter.class, name = "TEXT"),
	@JsonSubTypes.Type(value = WhatsAppTemplateVideoParameter.class, name = "VIDEO"),
})
public interface WhatsAppTemplateParameter {
	void setType(ETemplateComponentParameterType type);

	ETemplateComponentParameterType getType();

	WhatsAppTemplateParameter type(ETemplateComponentParameterType type);

}
