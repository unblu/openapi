package com.unblu.webapi.model.v4;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
	@JsonSubTypes.Type(value = CustomConversationActionData.class, name = "CONVERSATION"),
	@JsonSubTypes.Type(value = CustomMessageActionData.class, name = "MESSAGE"),
	@JsonSubTypes.Type(value = CustomPersonActionData.class, name = "PERSON"),
})
public interface CustomActionData {
	void setId(String id);

	String getId();

	CustomActionData id(String id);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	CustomActionData creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	CustomActionData modificationTimestamp(Long modificationTimestamp);

	void setVersion(Long version);

	Long getVersion();

	CustomActionData version(Long version);

	void setAccountId(String accountId);

	String getAccountId();

	CustomActionData accountId(String accountId);

	void setKey(String key);

	String getKey();

	CustomActionData key(String key);

	void setName(String name);

	String getName();

	CustomActionData name(String name);

	void setDescription(String description);

	String getDescription();

	CustomActionData description(String description);

	void setTranslations(Map<String, CustomActionTranslation> translations);

	Map<String, CustomActionTranslation> getTranslations();

	CustomActionData translations(Map<String, CustomActionTranslation> translations);

	void setActionIcon(ExpandableField<Avatar> actionIcon);

	ExpandableField<Avatar> getActionIcon();

	CustomActionData actionIcon(ExpandableField<Avatar> actionIcon);

	void setState(ECustomActionState state);

	ECustomActionState getState();

	CustomActionData state(ECustomActionState state);

	void setTriggerWebhook(CustomActionWebhookRegistration triggerWebhook);

	CustomActionWebhookRegistration getTriggerWebhook();

	CustomActionData triggerWebhook(CustomActionWebhookRegistration triggerWebhook);

	void setInvocableFromFrontends(List<EFrontend> invocableFromFrontends);

	List<EFrontend> getInvocableFromFrontends();

	CustomActionData invocableFromFrontends(List<EFrontend> invocableFromFrontends);

	void setInvocableForConversationStates(List<EConversationState> invocableForConversationStates);

	List<EConversationState> getInvocableForConversationStates();

	CustomActionData invocableForConversationStates(List<EConversationState> invocableForConversationStates);

	void setInvocableForParticipationStates(List<EConversationParticipationState> invocableForParticipationStates);

	List<EConversationParticipationState> getInvocableForParticipationStates();

	CustomActionData invocableForParticipationStates(List<EConversationParticipationState> invocableForParticipationStates);

	void setInvocableBy(List<EConversationImpactingParticipationType> invocableBy);

	List<EConversationImpactingParticipationType> getInvocableBy();

	CustomActionData invocableBy(List<EConversationImpactingParticipationType> invocableBy);

	void setTriggerSystemMessage(Boolean triggerSystemMessage);

	Boolean isTriggerSystemMessage();

	CustomActionData triggerSystemMessage(Boolean triggerSystemMessage);

	void setTriggerVisitorMobileSdkEvent(Boolean triggerVisitorMobileSdkEvent);

	Boolean isTriggerVisitorMobileSdkEvent();

	CustomActionData triggerVisitorMobileSdkEvent(Boolean triggerVisitorMobileSdkEvent);

	void setTriggerVisitorEmbeddedApiEvent(Boolean triggerVisitorEmbeddedApiEvent);

	Boolean isTriggerVisitorEmbeddedApiEvent();

	CustomActionData triggerVisitorEmbeddedApiEvent(Boolean triggerVisitorEmbeddedApiEvent);

	void setTriggerVisitorFloatingApiEvent(Boolean triggerVisitorFloatingApiEvent);

	Boolean isTriggerVisitorFloatingApiEvent();

	CustomActionData triggerVisitorFloatingApiEvent(Boolean triggerVisitorFloatingApiEvent);

	void setTriggerAgentMobileSdkEvent(Boolean triggerAgentMobileSdkEvent);

	Boolean isTriggerAgentMobileSdkEvent();

	CustomActionData triggerAgentMobileSdkEvent(Boolean triggerAgentMobileSdkEvent);

	void setSortingOrder(Integer sortingOrder);

	Integer getSortingOrder();

	CustomActionData sortingOrder(Integer sortingOrder);

	void setType(ECustomActionType type);

	ECustomActionType getType();

	CustomActionData type(ECustomActionType type);

}
