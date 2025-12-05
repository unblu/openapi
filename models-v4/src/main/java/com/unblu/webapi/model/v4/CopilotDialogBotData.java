
package com.unblu.webapi.model.v4;

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
 * Model representing an external copilot dialog bot that can handle conversation onboarding and offboarding.
 */
@ApiModel(description = "Model representing an external copilot dialog bot that can handle conversation onboarding and offboarding.")

@JsonPropertyOrder({
	CopilotDialogBotData.JSON_PROPERTY_$_TYPE,
	CopilotDialogBotData.JSON_PROPERTY_ID,
	CopilotDialogBotData.JSON_PROPERTY_CREATION_TIMESTAMP,
	CopilotDialogBotData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CopilotDialogBotData.JSON_PROPERTY_VERSION,
	CopilotDialogBotData.JSON_PROPERTY_ACCOUNT_ID,
	CopilotDialogBotData.JSON_PROPERTY_NAME,
	CopilotDialogBotData.JSON_PROPERTY_DESCRIPTION,
	CopilotDialogBotData.JSON_PROPERTY_BOT_PERSON_ID,
	CopilotDialogBotData.JSON_PROPERTY_ONBOARDING_ORDER,
	CopilotDialogBotData.JSON_PROPERTY_REBOARDING_ORDER,
	CopilotDialogBotData.JSON_PROPERTY_OFFBOARDING_ORDER,
	CopilotDialogBotData.JSON_PROPERTY_ONBOARDING_FILTER,
	CopilotDialogBotData.JSON_PROPERTY_REBOARDING_ENABLED,
	CopilotDialogBotData.JSON_PROPERTY_OFFBOARDING_FILTER,
	CopilotDialogBotData.JSON_PROPERTY_NEEDS_COUNTERPART_PRESENCE,
	CopilotDialogBotData.JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR,
	CopilotDialogBotData.JSON_PROPERTY_RETRY_COUNT,
	CopilotDialogBotData.JSON_PROPERTY_RETRY_DELAY,
	CopilotDialogBotData.JSON_PROPERTY_TYPE,
	CopilotDialogBotData.JSON_PROPERTY_AUTH_TOKEN,
	CopilotDialogBotData.JSON_PROPERTY_COPILOT_ID,
	CopilotDialogBotData.JSON_PROPERTY_COPILOT_ENVIRONMENT_ID,
	CopilotDialogBotData.JSON_PROPERTY_ACTIVE,
	CopilotDialogBotData.JSON_PROPERTY_OUTBOUND_ENDPOINT,
	CopilotDialogBotData.JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS,
	CopilotDialogBotData.JSON_PROPERTY_OUTBOUND_API_VERSION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CopilotDialogBotData implements DialogBotData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COPILOTDIALOGBOTDATA("CopilotDialogBotData");

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
			return TypeEnum.COPILOTDIALOGBOTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COPILOTDIALOGBOTDATA;

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
	private EBotType type = EBotType.COPILOT;

	public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
	@JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
	private String authToken;

	public static final String JSON_PROPERTY_COPILOT_ID = "copilotId";
	@JsonProperty(JSON_PROPERTY_COPILOT_ID)
	private String copilotId;

	public static final String JSON_PROPERTY_COPILOT_ENVIRONMENT_ID = "copilotEnvironmentId";
	@JsonProperty(JSON_PROPERTY_COPILOT_ENVIRONMENT_ID)
	private String copilotEnvironmentId;

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

	public CopilotDialogBotData $type(TypeEnum $type) {
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

	public CopilotDialogBotData id(String id) {
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

	public CopilotDialogBotData creationTimestamp(Long creationTimestamp) {
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

	public CopilotDialogBotData modificationTimestamp(Long modificationTimestamp) {
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

	public CopilotDialogBotData version(Long version) {
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

	public CopilotDialogBotData accountId(String accountId) {
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

	public CopilotDialogBotData name(String name) {
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

	public CopilotDialogBotData description(String description) {
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

	public CopilotDialogBotData botPersonId(String botPersonId) {
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

	public CopilotDialogBotData onboardingOrder(Integer onboardingOrder) {
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

	public CopilotDialogBotData reboardingOrder(Integer reboardingOrder) {
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

	public CopilotDialogBotData offboardingOrder(Integer offboardingOrder) {
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

	public CopilotDialogBotData onboardingFilter(EBotDialogFilter onboardingFilter) {
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

	public CopilotDialogBotData reboardingEnabled(Boolean reboardingEnabled) {
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

	public CopilotDialogBotData offboardingFilter(EBotDialogFilter offboardingFilter) {
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

	public CopilotDialogBotData needsCounterpartPresence(Boolean needsCounterpartPresence) {
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

	public CopilotDialogBotData onTimeoutBehavior(EBotDialogTimeoutBehavior onTimeoutBehavior) {
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

	public CopilotDialogBotData retryCount(Long retryCount) {
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

	public CopilotDialogBotData retryDelay(Long retryDelay) {
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

	public CopilotDialogBotData type(EBotType type) {
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

	public CopilotDialogBotData authToken(String authToken) {
		this.authToken = authToken;
		return this;
	}

	/**
	 * The Authentication Token for the Microsoft Copilot Agent. Maximum length: 2000 characters
	 * 
	 * @return authToken
	 **/
	@ApiModelProperty(value = "The Authentication Token for the Microsoft Copilot Agent. Maximum length: 2000 characters")
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public CopilotDialogBotData copilotId(String copilotId) {
		this.copilotId = copilotId;
		return this;
	}

	/**
	 * The Copilot Agent ID for selecting the correct copilot. Maximum length: 36 characters
	 * 
	 * @return copilotId
	 **/
	@ApiModelProperty(value = "The Copilot Agent ID for selecting the correct copilot. Maximum length: 36 characters")
	public String getCopilotId() {
		return copilotId;
	}

	public void setCopilotId(String copilotId) {
		this.copilotId = copilotId;
	}

	public CopilotDialogBotData copilotEnvironmentId(String copilotEnvironmentId) {
		this.copilotEnvironmentId = copilotEnvironmentId;
		return this;
	}

	/**
	 * The Microsoft environment ID. Used by Microsoft Copilot. Maximum length: 2000 characters
	 * 
	 * @return copilotEnvironmentId
	 **/
	@ApiModelProperty(value = "The Microsoft environment ID. Used by Microsoft Copilot. Maximum length: 2000 characters")
	public String getCopilotEnvironmentId() {
		return copilotEnvironmentId;
	}

	public void setCopilotEnvironmentId(String copilotEnvironmentId) {
		this.copilotEnvironmentId = copilotEnvironmentId;
	}

	public CopilotDialogBotData active(Boolean active) {
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

	public CopilotDialogBotData outboundEndpoint(String outboundEndpoint) {
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

	public CopilotDialogBotData outboundTimeoutMillis(Long outboundTimeoutMillis) {
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

	public CopilotDialogBotData outboundApiVersion(EWebApiVersion outboundApiVersion) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CopilotDialogBotData copilotDialogBotData = (CopilotDialogBotData) o;
		return Objects.equals(this.$type, copilotDialogBotData.$type) &&
				Objects.equals(this.id, copilotDialogBotData.id) &&
				Objects.equals(this.creationTimestamp, copilotDialogBotData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, copilotDialogBotData.modificationTimestamp) &&
				Objects.equals(this.version, copilotDialogBotData.version) &&
				Objects.equals(this.accountId, copilotDialogBotData.accountId) &&
				Objects.equals(this.name, copilotDialogBotData.name) &&
				Objects.equals(this.description, copilotDialogBotData.description) &&
				Objects.equals(this.botPersonId, copilotDialogBotData.botPersonId) &&
				Objects.equals(this.onboardingOrder, copilotDialogBotData.onboardingOrder) &&
				Objects.equals(this.reboardingOrder, copilotDialogBotData.reboardingOrder) &&
				Objects.equals(this.offboardingOrder, copilotDialogBotData.offboardingOrder) &&
				Objects.equals(this.onboardingFilter, copilotDialogBotData.onboardingFilter) &&
				Objects.equals(this.reboardingEnabled, copilotDialogBotData.reboardingEnabled) &&
				Objects.equals(this.offboardingFilter, copilotDialogBotData.offboardingFilter) &&
				Objects.equals(this.needsCounterpartPresence, copilotDialogBotData.needsCounterpartPresence) &&
				Objects.equals(this.onTimeoutBehavior, copilotDialogBotData.onTimeoutBehavior) &&
				Objects.equals(this.retryCount, copilotDialogBotData.retryCount) &&
				Objects.equals(this.retryDelay, copilotDialogBotData.retryDelay) &&
				Objects.equals(this.type, copilotDialogBotData.type) &&
				Objects.equals(this.authToken, copilotDialogBotData.authToken) &&
				Objects.equals(this.copilotId, copilotDialogBotData.copilotId) &&
				Objects.equals(this.copilotEnvironmentId, copilotDialogBotData.copilotEnvironmentId) &&
				Objects.equals(this.active, copilotDialogBotData.active) &&
				Objects.equals(this.outboundEndpoint, copilotDialogBotData.outboundEndpoint) &&
				Objects.equals(this.outboundTimeoutMillis, copilotDialogBotData.outboundTimeoutMillis) &&
				Objects.equals(this.outboundApiVersion, copilotDialogBotData.outboundApiVersion);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, botPersonId, onboardingOrder, reboardingOrder, offboardingOrder, onboardingFilter, reboardingEnabled, offboardingFilter, needsCounterpartPresence, onTimeoutBehavior, retryCount, retryDelay, type, authToken, copilotId, copilotEnvironmentId, active, outboundEndpoint, outboundTimeoutMillis, outboundApiVersion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CopilotDialogBotData {\n");
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
		sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
		sb.append("    copilotId: ").append(toIndentedString(copilotId)).append("\n");
		sb.append("    copilotEnvironmentId: ").append(toIndentedString(copilotEnvironmentId)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    outboundEndpoint: ").append(toIndentedString(outboundEndpoint)).append("\n");
		sb.append("    outboundTimeoutMillis: ").append(toIndentedString(outboundTimeoutMillis)).append("\n");
		sb.append("    outboundApiVersion: ").append(toIndentedString(outboundApiVersion)).append("\n");
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
