
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Model representing an external aria dialog bot that can handle conversation onboarding and offboarding.
 */
@ApiModel(description = "Model representing an external aria dialog bot that can handle conversation onboarding and offboarding.")

@JsonPropertyOrder({
	AriaDialogBotData.JSON_PROPERTY_$_TYPE,
	AriaDialogBotData.JSON_PROPERTY_ID,
	AriaDialogBotData.JSON_PROPERTY_CREATION_TIMESTAMP,
	AriaDialogBotData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	AriaDialogBotData.JSON_PROPERTY_VERSION,
	AriaDialogBotData.JSON_PROPERTY_ACCOUNT_ID,
	AriaDialogBotData.JSON_PROPERTY_NAME,
	AriaDialogBotData.JSON_PROPERTY_DESCRIPTION,
	AriaDialogBotData.JSON_PROPERTY_BOT_PERSON_ID,
	AriaDialogBotData.JSON_PROPERTY_ONBOARDING_ORDER,
	AriaDialogBotData.JSON_PROPERTY_REBOARDING_ORDER,
	AriaDialogBotData.JSON_PROPERTY_OFFBOARDING_ORDER,
	AriaDialogBotData.JSON_PROPERTY_ONBOARDING_FILTER,
	AriaDialogBotData.JSON_PROPERTY_REBOARDING_ENABLED,
	AriaDialogBotData.JSON_PROPERTY_OFFBOARDING_FILTER,
	AriaDialogBotData.JSON_PROPERTY_NEEDS_COUNTERPART_PRESENCE,
	AriaDialogBotData.JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR,
	AriaDialogBotData.JSON_PROPERTY_RETRY_COUNT,
	AriaDialogBotData.JSON_PROPERTY_RETRY_DELAY,
	AriaDialogBotData.JSON_PROPERTY_TYPE,
	AriaDialogBotData.JSON_PROPERTY_BOT_INDICATOR_TYPE,
	AriaDialogBotData.JSON_PROPERTY_THINKING_TEXTS,
	AriaDialogBotData.JSON_PROPERTY_THINKING_INPUT_MODE,
	AriaDialogBotData.JSON_PROPERTY_RANDOMIZE_THINKING_TEXTS,
	AriaDialogBotData.JSON_PROPERTY_MAX_THINKING_INDICATOR_TIME,
	AriaDialogBotData.JSON_PROPERTY_AUTO_START_THINKING_INDICATOR_DELAY,
	AriaDialogBotData.JSON_PROPERTY_THINKING_INDICATOR_TEXT_CYCLE_INTERVAL,
	AriaDialogBotData.JSON_PROPERTY_AGENTIC_FLOW_DATA,
	AriaDialogBotData.JSON_PROPERTY_ACTIVE,
	AriaDialogBotData.JSON_PROPERTY_OUTBOUND_ENDPOINT,
	AriaDialogBotData.JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS,
	AriaDialogBotData.JSON_PROPERTY_OUTBOUND_API_VERSION,
	AriaDialogBotData.JSON_PROPERTY_ARIA_DIALOG_BOT_TYPE,
	AriaDialogBotData.JSON_PROPERTY_EXTERNAL_CONFIGURATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AriaDialogBotData implements DialogBotData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARIADIALOGBOTDATA("AriaDialogBotData");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.ARIADIALOGBOTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARIADIALOGBOTDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_BOT_PERSON_ID = "botPersonId";
	@JsonProperty(JSON_PROPERTY_BOT_PERSON_ID)
	private String botPersonId;

	public static final String JSON_PROPERTY_ONBOARDING_ORDER = "onboardingOrder";
	@JsonProperty(JSON_PROPERTY_ONBOARDING_ORDER)
	private Integer onboardingOrder;

	public static final String JSON_PROPERTY_REBOARDING_ORDER = "reboardingOrder";
	@JsonProperty(JSON_PROPERTY_REBOARDING_ORDER)
	private Integer reboardingOrder;

	public static final String JSON_PROPERTY_OFFBOARDING_ORDER = "offboardingOrder";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_ORDER)
	private Integer offboardingOrder;

	public static final String JSON_PROPERTY_ONBOARDING_FILTER = "onboardingFilter";
	@JsonProperty(JSON_PROPERTY_ONBOARDING_FILTER)
	private EBotDialogFilter onboardingFilter;

	public static final String JSON_PROPERTY_REBOARDING_ENABLED = "reboardingEnabled";
	@JsonProperty(JSON_PROPERTY_REBOARDING_ENABLED)
	private Boolean reboardingEnabled;

	public static final String JSON_PROPERTY_OFFBOARDING_FILTER = "offboardingFilter";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_FILTER)
	private EBotDialogFilter offboardingFilter;

	public static final String JSON_PROPERTY_NEEDS_COUNTERPART_PRESENCE = "needsCounterpartPresence";
	@JsonProperty(JSON_PROPERTY_NEEDS_COUNTERPART_PRESENCE)
	private Boolean needsCounterpartPresence;

	public static final String JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR = "onTimeoutBehavior";
	@JsonProperty(JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR)
	private EBotDialogTimeoutBehavior onTimeoutBehavior;

	public static final String JSON_PROPERTY_RETRY_COUNT = "retryCount";
	@JsonProperty(JSON_PROPERTY_RETRY_COUNT)
	private Long retryCount;

	public static final String JSON_PROPERTY_RETRY_DELAY = "retryDelay";
	@JsonProperty(JSON_PROPERTY_RETRY_DELAY)
	private Long retryDelay;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBotType type = EBotType.ARIA;

	public static final String JSON_PROPERTY_BOT_INDICATOR_TYPE = "botIndicatorType";
	@JsonProperty(JSON_PROPERTY_BOT_INDICATOR_TYPE)
	private EBotIndicatorType botIndicatorType;

	public static final String JSON_PROPERTY_THINKING_TEXTS = "thinkingTexts";
	@JsonProperty(JSON_PROPERTY_THINKING_TEXTS)
	private List<BotThinkingTextData> thinkingTexts = null;

	public static final String JSON_PROPERTY_THINKING_INPUT_MODE = "thinkingInputMode";
	@JsonProperty(JSON_PROPERTY_THINKING_INPUT_MODE)
	private EThinkingInputMode thinkingInputMode;

	public static final String JSON_PROPERTY_RANDOMIZE_THINKING_TEXTS = "randomizeThinkingTexts";
	@JsonProperty(JSON_PROPERTY_RANDOMIZE_THINKING_TEXTS)
	private Boolean randomizeThinkingTexts;

	public static final String JSON_PROPERTY_MAX_THINKING_INDICATOR_TIME = "maxThinkingIndicatorTime";
	@JsonProperty(JSON_PROPERTY_MAX_THINKING_INDICATOR_TIME)
	private Integer maxThinkingIndicatorTime;

	public static final String JSON_PROPERTY_AUTO_START_THINKING_INDICATOR_DELAY = "autoStartThinkingIndicatorDelay";
	@JsonProperty(JSON_PROPERTY_AUTO_START_THINKING_INDICATOR_DELAY)
	private Integer autoStartThinkingIndicatorDelay;

	public static final String JSON_PROPERTY_THINKING_INDICATOR_TEXT_CYCLE_INTERVAL = "thinkingIndicatorTextCycleInterval";
	@JsonProperty(JSON_PROPERTY_THINKING_INDICATOR_TEXT_CYCLE_INTERVAL)
	private Integer thinkingIndicatorTextCycleInterval;

	public static final String JSON_PROPERTY_AGENTIC_FLOW_DATA = "agenticFlowData";
	@JsonProperty(JSON_PROPERTY_AGENTIC_FLOW_DATA)
	private ExpandableField<AriaAgenticFlowDataContent> agenticFlowData = null;

	public static final String JSON_PROPERTY_ACTIVE = "active";
	@JsonProperty(JSON_PROPERTY_ACTIVE)
	private Boolean active;

	public static final String JSON_PROPERTY_OUTBOUND_ENDPOINT = "outboundEndpoint";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_ENDPOINT)
	private String outboundEndpoint;

	public static final String JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS = "outboundTimeoutMillis";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS)
	private Long outboundTimeoutMillis;

	public static final String JSON_PROPERTY_OUTBOUND_API_VERSION = "outboundApiVersion";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_API_VERSION)
	private EWebApiVersion outboundApiVersion;

	public static final String JSON_PROPERTY_ARIA_DIALOG_BOT_TYPE = "ariaDialogBotType";
	@JsonProperty(JSON_PROPERTY_ARIA_DIALOG_BOT_TYPE)
	private EAriaDialogBotType ariaDialogBotType;

	public static final String JSON_PROPERTY_EXTERNAL_CONFIGURATION = "externalConfiguration";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_CONFIGURATION)
	private AriaDialogBotExternalConfiguration externalConfiguration = null;

	public AriaDialogBotData $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public AriaDialogBotData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AriaDialogBotData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public AriaDialogBotData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is
	 * ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn&#39;t written to storage and doesn&#39;t
	 * affect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn't written to storage and doesn't affect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public AriaDialogBotData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public AriaDialogBotData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AriaDialogBotData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the dialog bot. Maximum length of 250 characters. Can not be omitted.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the dialog bot. Maximum length of 250 characters. Can not be omitted.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AriaDialogBotData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the dialog bot. Maximum length of 500 characters. Can be omitted.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the dialog bot. Maximum length of 500 characters. Can be omitted.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public AriaDialogBotData botPersonId(String botPersonId) {
		this.botPersonId = botPersonId;
		return this;
	}

	/**
	 * ID of the person representing the bot
	 * 
	 * @return botPersonId
	 **/
	@ApiModelProperty(value = "ID of the person representing the bot")
	public String getBotPersonId() {
		return botPersonId;
	}

	public void setBotPersonId(String botPersonId) {
		this.botPersonId = botPersonId;
	}

	public AriaDialogBotData onboardingOrder(Integer onboardingOrder) {
		this.onboardingOrder = onboardingOrder;
		return this;
	}

	/**
	 * Defines the onboarding order of this bot. &lt;p&gt; If more than one bots want to participate in an onboarding, the one with the lowest order value will go
	 * first.
	 * 
	 * @return onboardingOrder
	 **/
	@ApiModelProperty(value = "Defines the onboarding order of this bot. <p> If more than one bots want to participate in an onboarding, the one with the lowest order value will go first.")
	public Integer getOnboardingOrder() {
		return onboardingOrder;
	}

	public void setOnboardingOrder(Integer onboardingOrder) {
		this.onboardingOrder = onboardingOrder;
	}

	public AriaDialogBotData reboardingOrder(Integer reboardingOrder) {
		this.reboardingOrder = reboardingOrder;
		return this;
	}

	/**
	 * Defines the reboarding order of this bot. &lt;p&gt; If more than one bots want to participate in an reboarding, the one with the lowest order value will go
	 * first.
	 * 
	 * @return reboardingOrder
	 **/
	@ApiModelProperty(value = "Defines the reboarding order of this bot. <p> If more than one bots want to participate in an reboarding, the one with the lowest order value will go first.")
	public Integer getReboardingOrder() {
		return reboardingOrder;
	}

	public void setReboardingOrder(Integer reboardingOrder) {
		this.reboardingOrder = reboardingOrder;
	}

	public AriaDialogBotData offboardingOrder(Integer offboardingOrder) {
		this.offboardingOrder = offboardingOrder;
		return this;
	}

	/**
	 * Defines the offboarding priority of this bot. &lt;p&gt; If more than one bots want to participate in an offboarding, the one with the lowest order value will
	 * go first.
	 * 
	 * @return offboardingOrder
	 **/
	@ApiModelProperty(value = "Defines the offboarding priority of this bot. <p> If more than one bots want to participate in an offboarding, the one with the lowest order value will go first.")
	public Integer getOffboardingOrder() {
		return offboardingOrder;
	}

	public void setOffboardingOrder(Integer offboardingOrder) {
		this.offboardingOrder = offboardingOrder;
	}

	public AriaDialogBotData onboardingFilter(EBotDialogFilter onboardingFilter) {
		this.onboardingFilter = onboardingFilter;
		return this;
	}

	/**
	 * Get onboardingFilter
	 * 
	 * @return onboardingFilter
	 **/
	@ApiModelProperty(value = "")
	public EBotDialogFilter getOnboardingFilter() {
		return onboardingFilter;
	}

	public void setOnboardingFilter(EBotDialogFilter onboardingFilter) {
		this.onboardingFilter = onboardingFilter;
	}

	public AriaDialogBotData reboardingEnabled(Boolean reboardingEnabled) {
		this.reboardingEnabled = reboardingEnabled;
		return this;
	}

	/**
	 * Defines if this bot can reboard. &lt;p&gt; A reboarding offer will be sent only if this flag is enabled, giving the bot the chance to be part of the
	 * reboarding.
	 * 
	 * @return reboardingEnabled
	 **/
	@ApiModelProperty(value = "Defines if this bot can reboard. <p> A reboarding offer will be sent only if this flag is enabled, giving the bot the chance to be part of the reboarding.")
	public Boolean isReboardingEnabled() {
		return reboardingEnabled;
	}

	public void setReboardingEnabled(Boolean reboardingEnabled) {
		this.reboardingEnabled = reboardingEnabled;
	}

	public AriaDialogBotData offboardingFilter(EBotDialogFilter offboardingFilter) {
		this.offboardingFilter = offboardingFilter;
		return this;
	}

	/**
	 * Get offboardingFilter
	 * 
	 * @return offboardingFilter
	 **/
	@ApiModelProperty(value = "")
	public EBotDialogFilter getOffboardingFilter() {
		return offboardingFilter;
	}

	public void setOffboardingFilter(EBotDialogFilter offboardingFilter) {
		this.offboardingFilter = offboardingFilter;
	}

	public AriaDialogBotData needsCounterpartPresence(Boolean needsCounterpartPresence) {
		this.needsCounterpartPresence = needsCounterpartPresence;
		return this;
	}

	/**
	 * Defines if the counterpart has to be online for the onboarding to start. E.g. if questions have to be answered live.
	 * 
	 * @return needsCounterpartPresence
	 **/
	@ApiModelProperty(value = "Defines if the counterpart has to be online for the onboarding to start. E.g. if questions have to be answered live.")
	public Boolean isNeedsCounterpartPresence() {
		return needsCounterpartPresence;
	}

	public void setNeedsCounterpartPresence(Boolean needsCounterpartPresence) {
		this.needsCounterpartPresence = needsCounterpartPresence;
	}

	public AriaDialogBotData onTimeoutBehavior(EBotDialogTimeoutBehavior onTimeoutBehavior) {
		this.onTimeoutBehavior = onTimeoutBehavior;
		return this;
	}

	/**
	 * Get onTimeoutBehavior
	 * 
	 * @return onTimeoutBehavior
	 **/
	@ApiModelProperty(value = "")
	public EBotDialogTimeoutBehavior getOnTimeoutBehavior() {
		return onTimeoutBehavior;
	}

	public void setOnTimeoutBehavior(EBotDialogTimeoutBehavior onTimeoutBehavior) {
		this.onTimeoutBehavior = onTimeoutBehavior;
	}

	public AriaDialogBotData retryCount(Long retryCount) {
		this.retryCount = retryCount;
		return this;
	}

	/**
	 * Defines the number of retries for failed outbound requests. If omitted, the default is 0.
	 * 
	 * @return retryCount
	 **/
	@ApiModelProperty(value = "Defines the number of retries for failed outbound requests. If omitted, the default is 0.")
	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public AriaDialogBotData retryDelay(Long retryDelay) {
		this.retryDelay = retryDelay;
		return this;
	}

	/**
	 * Defines the delay between retries for failed outbound requests. If omitted, the default is 0.
	 * 
	 * @return retryDelay
	 **/
	@ApiModelProperty(value = "Defines the delay between retries for failed outbound requests. If omitted, the default is 0.")
	public Long getRetryDelay() {
		return retryDelay;
	}

	public void setRetryDelay(Long retryDelay) {
		this.retryDelay = retryDelay;
	}

	public AriaDialogBotData type(EBotType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EBotType getType() {
		return type;
	}

	public void setType(EBotType type) {
		this.type = type;
	}

	public AriaDialogBotData botIndicatorType(EBotIndicatorType botIndicatorType) {
		this.botIndicatorType = botIndicatorType;
		return this;
	}

	/**
	 * Get botIndicatorType
	 * 
	 * @return botIndicatorType
	 **/
	@ApiModelProperty(value = "")
	public EBotIndicatorType getBotIndicatorType() {
		return botIndicatorType;
	}

	public void setBotIndicatorType(EBotIndicatorType botIndicatorType) {
		this.botIndicatorType = botIndicatorType;
	}

	public AriaDialogBotData thinkingTexts(List<BotThinkingTextData> thinkingTexts) {
		this.thinkingTexts = thinkingTexts;
		return this;
	}

	public AriaDialogBotData addThinkingTextsItem(BotThinkingTextData thinkingTextsItem) {
		if (this.thinkingTexts == null) {
			this.thinkingTexts = new ArrayList<>();
		}
		this.thinkingTexts.add(thinkingTextsItem);
		return this;
	}

	/**
	 * Configurable thinking indicator texts for the bot, ordered by display sequence.
	 * 
	 * @return thinkingTexts
	 **/
	@ApiModelProperty(value = "Configurable thinking indicator texts for the bot, ordered by display sequence.")
	public List<BotThinkingTextData> getThinkingTexts() {
		return thinkingTexts;
	}

	public void setThinkingTexts(List<BotThinkingTextData> thinkingTexts) {
		this.thinkingTexts = thinkingTexts;
	}

	public AriaDialogBotData thinkingInputMode(EThinkingInputMode thinkingInputMode) {
		this.thinkingInputMode = thinkingInputMode;
		return this;
	}

	/**
	 * Get thinkingInputMode
	 * 
	 * @return thinkingInputMode
	 **/
	@ApiModelProperty(value = "")
	public EThinkingInputMode getThinkingInputMode() {
		return thinkingInputMode;
	}

	public void setThinkingInputMode(EThinkingInputMode thinkingInputMode) {
		this.thinkingInputMode = thinkingInputMode;
	}

	public AriaDialogBotData randomizeThinkingTexts(Boolean randomizeThinkingTexts) {
		this.randomizeThinkingTexts = randomizeThinkingTexts;
		return this;
	}

	/**
	 * If true, the configured thinking texts are shown in random order. If false, they are shown in the order they were defined.
	 * 
	 * @return randomizeThinkingTexts
	 **/
	@ApiModelProperty(value = "If true, the configured thinking texts are shown in random order. If false, they are shown in the order they were defined.")
	public Boolean isRandomizeThinkingTexts() {
		return randomizeThinkingTexts;
	}

	public void setRandomizeThinkingTexts(Boolean randomizeThinkingTexts) {
		this.randomizeThinkingTexts = randomizeThinkingTexts;
	}

	public AriaDialogBotData maxThinkingIndicatorTime(Integer maxThinkingIndicatorTime) {
		this.maxThinkingIndicatorTime = maxThinkingIndicatorTime;
		return this;
	}

	/**
	 * The maximum delay, in milliseconds, before the thinking indicator is automatically hidden. The thinking indicator is also dismissed when the bot sends a
	 * message. Optional; if omitted the system default is used.
	 * 
	 * @return maxThinkingIndicatorTime
	 **/
	@ApiModelProperty(value = "The maximum delay, in milliseconds, before the thinking indicator is automatically hidden. The thinking indicator is also dismissed when the bot sends a message. Optional; if omitted the system default is used.")
	public Integer getMaxThinkingIndicatorTime() {
		return maxThinkingIndicatorTime;
	}

	public void setMaxThinkingIndicatorTime(Integer maxThinkingIndicatorTime) {
		this.maxThinkingIndicatorTime = maxThinkingIndicatorTime;
	}

	public AriaDialogBotData autoStartThinkingIndicatorDelay(Integer autoStartThinkingIndicatorDelay) {
		this.autoStartThinkingIndicatorDelay = autoStartThinkingIndicatorDelay;
		return this;
	}

	/**
	 * The delay, in milliseconds, before the thinking indicator is automatically shown after a visitor message. If the bot responds before this delay, no thinking
	 * indicator is displayed. Set to 0 to show the indicator immediately. Optional; if omitted the system default is used.
	 * 
	 * @return autoStartThinkingIndicatorDelay
	 **/
	@ApiModelProperty(value = "The delay, in milliseconds, before the thinking indicator is automatically shown after a visitor message. If the bot responds before this delay, no thinking indicator is displayed. Set to 0 to show the indicator immediately. Optional; if omitted the system default is used.")
	public Integer getAutoStartThinkingIndicatorDelay() {
		return autoStartThinkingIndicatorDelay;
	}

	public void setAutoStartThinkingIndicatorDelay(Integer autoStartThinkingIndicatorDelay) {
		this.autoStartThinkingIndicatorDelay = autoStartThinkingIndicatorDelay;
	}

	public AriaDialogBotData thinkingIndicatorTextCycleInterval(Integer thinkingIndicatorTextCycleInterval) {
		this.thinkingIndicatorTextCycleInterval = thinkingIndicatorTextCycleInterval;
		return this;
	}

	/**
	 * The interval, in milliseconds, between cycling through the pre-configured thinking indicator text messages. Ignored if the text is set via API. Optional; if
	 * omitted the system default is used.
	 * 
	 * @return thinkingIndicatorTextCycleInterval
	 **/
	@ApiModelProperty(value = "The interval, in milliseconds, between cycling through the pre-configured thinking indicator text messages. Ignored if the text is set via API. Optional; if omitted the system default is used.")
	public Integer getThinkingIndicatorTextCycleInterval() {
		return thinkingIndicatorTextCycleInterval;
	}

	public void setThinkingIndicatorTextCycleInterval(Integer thinkingIndicatorTextCycleInterval) {
		this.thinkingIndicatorTextCycleInterval = thinkingIndicatorTextCycleInterval;
	}

	public AriaDialogBotData agenticFlowData(ExpandableField<AriaAgenticFlowDataContent> agenticFlowData) {
		this.agenticFlowData = agenticFlowData;
		return this;
	}

	/**
	 * Aria agentic flow ID. Add &#x60;?expand&#x3D;agenticFlowData&#x60; to the request to replace this ID with the full flow content in
	 * &#x60;agenticFlowData&#x60;. Maximum length: 36 characters.
	 * 
	 * @return agenticFlowData
	 **/
	@ApiModelProperty(value = "Aria agentic flow ID. Add `?expand=agenticFlowData` to the request to replace this ID with the full flow content in `agenticFlowData`. Maximum length: 36 characters.")
	public ExpandableField<AriaAgenticFlowDataContent> getAgenticFlowData() {
		return agenticFlowData;
	}

	public void setAgenticFlowData(ExpandableField<AriaAgenticFlowDataContent> agenticFlowData) {
		this.agenticFlowData = agenticFlowData;
	}

	public AriaDialogBotData active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Specifies whether the bot is active
	 * 
	 * @return active
	 **/
	@ApiModelProperty(value = "Specifies whether the bot is active")
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public AriaDialogBotData outboundEndpoint(String outboundEndpoint) {
		this.outboundEndpoint = outboundEndpoint;
		return this;
	}

	/**
	 * The endpoint url of the webhook registration. To this url the requests for the webhook events are done. Maximum length of 4000 characters. &lt;p&gt; Based on
	 * the configured filters/flags the following events will be sent to the endpoint: &lt;ul&gt; &lt;li&gt;&#x60;TypedEvent.BOT_ONBOARDING_OFFER&#x60;: When a
	 * person matching the onboarding filter joins a conversation.&lt;/li&gt; &lt;li&gt;&#x60;TypedEvent.BOT_REBOARDING_OFFER&#x60;: When a person writes a message
	 * to an unassigned conversation and the reboardingEnabled flag is set to true.&lt;/li&gt; &lt;li&gt;&#x60;TypedEvent.BOT_OFFBOARDING_OFFER&#x60;: When a person
	 * matching the offboarding filter leaves a conversation or the conversation ends.&lt;/li&gt; &lt;li&gt;&#x60;TypedEvent.BOT_DIALOG_OPENED&#x60;: When a
	 * preaviously accepted bot dialog starts&lt;/li&gt; &lt;li&gt;&#x60;TypedEvent.BOT_DIALOG_MESSAGE&#x60;: On each message of a previously accepted bot
	 * dialog.&lt;/li&gt; &lt;li&gt;&#x60;TypedEvent.BOT_DIALOG_MESSAGE_STATE&#x60;: On each message state update of a previously accepted bot dialog.&lt;/li&gt;
	 * &lt;li&gt;&#x60;TypedEvent.BOT_DIALOG_COUNTERPART_CHANGED&#x60;: When the counterpart person of dialog changes during a dialog.&lt;/li&gt;
	 * &lt;li&gt;&#x60;TypedEvent.BOT_DIALOG_CLOSED&#x60;: When a previously accepted bot dialog closes.&lt;/li&gt; &lt;/ul&gt;
	 * 
	 * @return outboundEndpoint
	 **/
	@ApiModelProperty(value = "The endpoint url of the webhook registration. To this url the requests for the webhook events are done. Maximum length of 4000 characters. <p> Based on the configured filters/flags the following events will be sent to the endpoint: <ul> <li>`TypedEvent.BOT_ONBOARDING_OFFER`: When a person matching the onboarding filter joins a conversation.</li> <li>`TypedEvent.BOT_REBOARDING_OFFER`: When a person writes a message to an unassigned conversation and the reboardingEnabled flag is set to true.</li> <li>`TypedEvent.BOT_OFFBOARDING_OFFER`: When a person matching the offboarding filter leaves a conversation or the conversation ends.</li> <li>`TypedEvent.BOT_DIALOG_OPENED`: When a preaviously accepted bot dialog starts</li> <li>`TypedEvent.BOT_DIALOG_MESSAGE`: On each message of a previously accepted bot dialog.</li> <li>`TypedEvent.BOT_DIALOG_MESSAGE_STATE`: On each message state update of a previously accepted bot dialog.</li> <li>`TypedEvent.BOT_DIALOG_COUNTERPART_CHANGED`: When the counterpart person of dialog changes during a dialog.</li> <li>`TypedEvent.BOT_DIALOG_CLOSED`: When a previously accepted bot dialog closes.</li> </ul>")
	public String getOutboundEndpoint() {
		return outboundEndpoint;
	}

	public void setOutboundEndpoint(String outboundEndpoint) {
		this.outboundEndpoint = outboundEndpoint;
	}

	public AriaDialogBotData outboundTimeoutMillis(Long outboundTimeoutMillis) {
		this.outboundTimeoutMillis = outboundTimeoutMillis;
		return this;
	}

	/**
	 * The timeout for the requests sent to the outbound endpoint. Mandatory for webhookApiVersion greater than 3.
	 * 
	 * @return outboundTimeoutMillis
	 **/
	@ApiModelProperty(value = "The timeout for the requests sent to the outbound endpoint. Mandatory for webhookApiVersion greater than 3.")
	public Long getOutboundTimeoutMillis() {
		return outboundTimeoutMillis;
	}

	public void setOutboundTimeoutMillis(Long outboundTimeoutMillis) {
		this.outboundTimeoutMillis = outboundTimeoutMillis;
	}

	public AriaDialogBotData outboundApiVersion(EWebApiVersion outboundApiVersion) {
		this.outboundApiVersion = outboundApiVersion;
		return this;
	}

	/**
	 * Get outboundApiVersion
	 * 
	 * @return outboundApiVersion
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getOutboundApiVersion() {
		return outboundApiVersion;
	}

	public void setOutboundApiVersion(EWebApiVersion outboundApiVersion) {
		this.outboundApiVersion = outboundApiVersion;
	}

	public AriaDialogBotData ariaDialogBotType(EAriaDialogBotType ariaDialogBotType) {
		this.ariaDialogBotType = ariaDialogBotType;
		return this;
	}

	/**
	 * Get ariaDialogBotType
	 * 
	 * @return ariaDialogBotType
	 **/
	@ApiModelProperty(value = "")
	public EAriaDialogBotType getAriaDialogBotType() {
		return ariaDialogBotType;
	}

	public void setAriaDialogBotType(EAriaDialogBotType ariaDialogBotType) {
		this.ariaDialogBotType = ariaDialogBotType;
	}

	public AriaDialogBotData externalConfiguration(AriaDialogBotExternalConfiguration externalConfiguration) {
		this.externalConfiguration = externalConfiguration;
		return this;
	}

	/**
	 * Get externalConfiguration
	 * 
	 * @return externalConfiguration
	 **/
	@ApiModelProperty(value = "")
	public AriaDialogBotExternalConfiguration getExternalConfiguration() {
		return externalConfiguration;
	}

	public void setExternalConfiguration(AriaDialogBotExternalConfiguration externalConfiguration) {
		this.externalConfiguration = externalConfiguration;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AriaDialogBotData ariaDialogBotData = (AriaDialogBotData) o;
		return Objects.equals(this.$type, ariaDialogBotData.$type) &&
				Objects.equals(this.id, ariaDialogBotData.id) &&
				Objects.equals(this.creationTimestamp, ariaDialogBotData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, ariaDialogBotData.modificationTimestamp) &&
				Objects.equals(this.version, ariaDialogBotData.version) &&
				Objects.equals(this.accountId, ariaDialogBotData.accountId) &&
				Objects.equals(this.name, ariaDialogBotData.name) &&
				Objects.equals(this.description, ariaDialogBotData.description) &&
				Objects.equals(this.botPersonId, ariaDialogBotData.botPersonId) &&
				Objects.equals(this.onboardingOrder, ariaDialogBotData.onboardingOrder) &&
				Objects.equals(this.reboardingOrder, ariaDialogBotData.reboardingOrder) &&
				Objects.equals(this.offboardingOrder, ariaDialogBotData.offboardingOrder) &&
				Objects.equals(this.onboardingFilter, ariaDialogBotData.onboardingFilter) &&
				Objects.equals(this.reboardingEnabled, ariaDialogBotData.reboardingEnabled) &&
				Objects.equals(this.offboardingFilter, ariaDialogBotData.offboardingFilter) &&
				Objects.equals(this.needsCounterpartPresence, ariaDialogBotData.needsCounterpartPresence) &&
				Objects.equals(this.onTimeoutBehavior, ariaDialogBotData.onTimeoutBehavior) &&
				Objects.equals(this.retryCount, ariaDialogBotData.retryCount) &&
				Objects.equals(this.retryDelay, ariaDialogBotData.retryDelay) &&
				Objects.equals(this.type, ariaDialogBotData.type) &&
				Objects.equals(this.botIndicatorType, ariaDialogBotData.botIndicatorType) &&
				Objects.equals(this.thinkingTexts, ariaDialogBotData.thinkingTexts) &&
				Objects.equals(this.thinkingInputMode, ariaDialogBotData.thinkingInputMode) &&
				Objects.equals(this.randomizeThinkingTexts, ariaDialogBotData.randomizeThinkingTexts) &&
				Objects.equals(this.maxThinkingIndicatorTime, ariaDialogBotData.maxThinkingIndicatorTime) &&
				Objects.equals(this.autoStartThinkingIndicatorDelay, ariaDialogBotData.autoStartThinkingIndicatorDelay) &&
				Objects.equals(this.thinkingIndicatorTextCycleInterval, ariaDialogBotData.thinkingIndicatorTextCycleInterval) &&
				Objects.equals(this.agenticFlowData, ariaDialogBotData.agenticFlowData) &&
				Objects.equals(this.active, ariaDialogBotData.active) &&
				Objects.equals(this.outboundEndpoint, ariaDialogBotData.outboundEndpoint) &&
				Objects.equals(this.outboundTimeoutMillis, ariaDialogBotData.outboundTimeoutMillis) &&
				Objects.equals(this.outboundApiVersion, ariaDialogBotData.outboundApiVersion) &&
				Objects.equals(this.ariaDialogBotType, ariaDialogBotData.ariaDialogBotType) &&
				Objects.equals(this.externalConfiguration, ariaDialogBotData.externalConfiguration);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, botPersonId, onboardingOrder, reboardingOrder, offboardingOrder, onboardingFilter, reboardingEnabled, offboardingFilter, needsCounterpartPresence, onTimeoutBehavior, retryCount, retryDelay, type, botIndicatorType, thinkingTexts, thinkingInputMode, randomizeThinkingTexts, maxThinkingIndicatorTime, autoStartThinkingIndicatorDelay, thinkingIndicatorTextCycleInterval, agenticFlowData, active, outboundEndpoint, outboundTimeoutMillis, outboundApiVersion, ariaDialogBotType, externalConfiguration);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AriaDialogBotData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    botPersonId: ").append(toIndentedString(botPersonId)).append("\n");
		sb.append("    onboardingOrder: ").append(toIndentedString(onboardingOrder)).append("\n");
		sb.append("    reboardingOrder: ").append(toIndentedString(reboardingOrder)).append("\n");
		sb.append("    offboardingOrder: ").append(toIndentedString(offboardingOrder)).append("\n");
		sb.append("    onboardingFilter: ").append(toIndentedString(onboardingFilter)).append("\n");
		sb.append("    reboardingEnabled: ").append(toIndentedString(reboardingEnabled)).append("\n");
		sb.append("    offboardingFilter: ").append(toIndentedString(offboardingFilter)).append("\n");
		sb.append("    needsCounterpartPresence: ").append(toIndentedString(needsCounterpartPresence)).append("\n");
		sb.append("    onTimeoutBehavior: ").append(toIndentedString(onTimeoutBehavior)).append("\n");
		sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
		sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    botIndicatorType: ").append(toIndentedString(botIndicatorType)).append("\n");
		sb.append("    thinkingTexts: ").append(toIndentedString(thinkingTexts)).append("\n");
		sb.append("    thinkingInputMode: ").append(toIndentedString(thinkingInputMode)).append("\n");
		sb.append("    randomizeThinkingTexts: ").append(toIndentedString(randomizeThinkingTexts)).append("\n");
		sb.append("    maxThinkingIndicatorTime: ").append(toIndentedString(maxThinkingIndicatorTime)).append("\n");
		sb.append("    autoStartThinkingIndicatorDelay: ").append(toIndentedString(autoStartThinkingIndicatorDelay)).append("\n");
		sb.append("    thinkingIndicatorTextCycleInterval: ").append(toIndentedString(thinkingIndicatorTextCycleInterval)).append("\n");
		sb.append("    agenticFlowData: ").append(toIndentedString(agenticFlowData)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    outboundEndpoint: ").append(toIndentedString(outboundEndpoint)).append("\n");
		sb.append("    outboundTimeoutMillis: ").append(toIndentedString(outboundTimeoutMillis)).append("\n");
		sb.append("    outboundApiVersion: ").append(toIndentedString(outboundApiVersion)).append("\n");
		sb.append("    ariaDialogBotType: ").append(toIndentedString(ariaDialogBotType)).append("\n");
		sb.append("    externalConfiguration: ").append(toIndentedString(externalConfiguration)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
