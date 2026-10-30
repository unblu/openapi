package com.unblu.webapi.model.v4;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true, defaultImpl = CustomDialogBotData.class)
@JsonSubTypes({
	@JsonSubTypes.Type(value = AriaDialogBotData.class, name = "ARIA"),
	@JsonSubTypes.Type(value = CopilotDialogBotData.class, name = "COPILOT"),
	@JsonSubTypes.Type(value = CustomDialogBotData.class, name = "CUSTOM"),
})
public interface DialogBotData {
	void setId(String id);

	String getId();

	DialogBotData id(String id);

	void setCreationTimestamp(Long creationTimestamp);

	Long getCreationTimestamp();

	DialogBotData creationTimestamp(Long creationTimestamp);

	void setModificationTimestamp(Long modificationTimestamp);

	Long getModificationTimestamp();

	DialogBotData modificationTimestamp(Long modificationTimestamp);

	void setVersion(Long version);

	Long getVersion();

	DialogBotData version(Long version);

	void setAccountId(String accountId);

	String getAccountId();

	DialogBotData accountId(String accountId);

	void setName(String name);

	String getName();

	DialogBotData name(String name);

	void setDescription(String description);

	String getDescription();

	DialogBotData description(String description);

	void setBotPersonId(String botPersonId);

	String getBotPersonId();

	DialogBotData botPersonId(String botPersonId);

	void setOnboardingOrder(Integer onboardingOrder);

	Integer getOnboardingOrder();

	DialogBotData onboardingOrder(Integer onboardingOrder);

	void setReboardingOrder(Integer reboardingOrder);

	Integer getReboardingOrder();

	DialogBotData reboardingOrder(Integer reboardingOrder);

	void setOffboardingOrder(Integer offboardingOrder);

	Integer getOffboardingOrder();

	DialogBotData offboardingOrder(Integer offboardingOrder);

	void setOnboardingFilter(EBotDialogFilter onboardingFilter);

	EBotDialogFilter getOnboardingFilter();

	DialogBotData onboardingFilter(EBotDialogFilter onboardingFilter);

	void setReboardingEnabled(Boolean reboardingEnabled);

	Boolean isReboardingEnabled();

	DialogBotData reboardingEnabled(Boolean reboardingEnabled);

	void setOffboardingFilter(EBotDialogFilter offboardingFilter);

	EBotDialogFilter getOffboardingFilter();

	DialogBotData offboardingFilter(EBotDialogFilter offboardingFilter);

	void setNeedsCounterpartPresence(Boolean needsCounterpartPresence);

	Boolean isNeedsCounterpartPresence();

	DialogBotData needsCounterpartPresence(Boolean needsCounterpartPresence);

	void setOnTimeoutBehavior(EBotDialogTimeoutBehavior onTimeoutBehavior);

	EBotDialogTimeoutBehavior getOnTimeoutBehavior();

	DialogBotData onTimeoutBehavior(EBotDialogTimeoutBehavior onTimeoutBehavior);

	void setRetryCount(Long retryCount);

	Long getRetryCount();

	DialogBotData retryCount(Long retryCount);

	void setRetryDelay(Long retryDelay);

	Long getRetryDelay();

	DialogBotData retryDelay(Long retryDelay);

	void setType(EBotType type);

	EBotType getType();

	DialogBotData type(EBotType type);

	void setBotIndicatorType(EBotIndicatorType botIndicatorType);

	EBotIndicatorType getBotIndicatorType();

	DialogBotData botIndicatorType(EBotIndicatorType botIndicatorType);

	void setThinkingTexts(List<BotThinkingTextData> thinkingTexts);

	List<BotThinkingTextData> getThinkingTexts();

	DialogBotData thinkingTexts(List<BotThinkingTextData> thinkingTexts);

	void setThinkingInputMode(EThinkingInputMode thinkingInputMode);

	EThinkingInputMode getThinkingInputMode();

	DialogBotData thinkingInputMode(EThinkingInputMode thinkingInputMode);

	void setRandomizeThinkingTexts(Boolean randomizeThinkingTexts);

	Boolean isRandomizeThinkingTexts();

	DialogBotData randomizeThinkingTexts(Boolean randomizeThinkingTexts);

	void setMaxThinkingIndicatorTime(Integer maxThinkingIndicatorTime);

	Integer getMaxThinkingIndicatorTime();

	DialogBotData maxThinkingIndicatorTime(Integer maxThinkingIndicatorTime);

	void setAutoStartThinkingIndicatorDelay(Integer autoStartThinkingIndicatorDelay);

	Integer getAutoStartThinkingIndicatorDelay();

	DialogBotData autoStartThinkingIndicatorDelay(Integer autoStartThinkingIndicatorDelay);

	void setThinkingIndicatorTextCycleInterval(Integer thinkingIndicatorTextCycleInterval);

	Integer getThinkingIndicatorTextCycleInterval();

	DialogBotData thinkingIndicatorTextCycleInterval(Integer thinkingIndicatorTextCycleInterval);

	void setDefaultContentOrigin(EMessageContentOrigin defaultContentOrigin);

	EMessageContentOrigin getDefaultContentOrigin();

	DialogBotData defaultContentOrigin(EMessageContentOrigin defaultContentOrigin);

	void setOutboundTimeoutMillis(Long outboundTimeoutMillis);

	Long getOutboundTimeoutMillis();

	DialogBotData outboundTimeoutMillis(Long outboundTimeoutMillis);

}
