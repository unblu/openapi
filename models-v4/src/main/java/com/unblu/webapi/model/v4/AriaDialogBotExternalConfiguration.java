package com.unblu.webapi.model.v4;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = MultiflowAriaDialogBotExternalConfiguration.class, name = "MULTIFLOW"),
})
public interface AriaDialogBotExternalConfiguration {
	void setType(EAriaDialogBotExternalConfigurationType type);

	EAriaDialogBotExternalConfigurationType getType();

	AriaDialogBotExternalConfiguration type(EAriaDialogBotExternalConfigurationType type);

	void setConditionAgentLlmCredentialId(String conditionAgentLlmCredentialId);

	String getConditionAgentLlmCredentialId();

	AriaDialogBotExternalConfiguration conditionAgentLlmCredentialId(String conditionAgentLlmCredentialId);

	void setConditionAgentLlmProvider(String conditionAgentLlmProvider);

	String getConditionAgentLlmProvider();

	AriaDialogBotExternalConfiguration conditionAgentLlmProvider(String conditionAgentLlmProvider);

	void setConditionAgentLlmParameters(Map<String, String> conditionAgentLlmParameters);

	Map<String, String> getConditionAgentLlmParameters();

	AriaDialogBotExternalConfiguration conditionAgentLlmParameters(Map<String, String> conditionAgentLlmParameters);

}
