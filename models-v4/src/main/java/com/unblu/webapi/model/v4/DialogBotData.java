
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
 * Model representing an external dialog bot that can handle conversation onboarding and offboarding.
 */
@ApiModel(description = "Model representing an external dialog bot that can handle conversation onboarding and offboarding.")

@JsonPropertyOrder({
	DialogBotData.JSON_PROPERTY_$_TYPE,
	DialogBotData.JSON_PROPERTY_ID,
	DialogBotData.JSON_PROPERTY_CREATION_TIMESTAMP,
	DialogBotData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	DialogBotData.JSON_PROPERTY_VERSION,
	DialogBotData.JSON_PROPERTY_ACCOUNT_ID,
	DialogBotData.JSON_PROPERTY_NAME,
	DialogBotData.JSON_PROPERTY_DESCRIPTION,
	DialogBotData.JSON_PROPERTY_BOT_PERSON_ID,
	DialogBotData.JSON_PROPERTY_WEBHOOK_STATUS,
	DialogBotData.JSON_PROPERTY_WEBHOOK_ENDPOINT,
	DialogBotData.JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS,
	DialogBotData.JSON_PROPERTY_WEBHOOK_API_VERSION,
	DialogBotData.JSON_PROPERTY_WEBHOOK_SECRET,
	DialogBotData.JSON_PROPERTY_ONBOARDING_ORDER,
	DialogBotData.JSON_PROPERTY_REBOARDING_ORDER,
	DialogBotData.JSON_PROPERTY_OFFBOARDING_ORDER,
	DialogBotData.JSON_PROPERTY_ONBOARDING_FILTER,
	DialogBotData.JSON_PROPERTY_REBOARDING_ENABLED,
	DialogBotData.JSON_PROPERTY_OFFBOARDING_FILTER,
	DialogBotData.JSON_PROPERTY_NEEDS_COUNTERPART_PRESENCE,
	DialogBotData.JSON_PROPERTY_MESSAGE_STATE_HANDLED_EXTERNALLY,
	DialogBotData.JSON_PROPERTY_AUTOMATIC_TYPING_STATE_HANDLING_ENABLED,
	DialogBotData.JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DialogBotData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DIALOGBOTDATA("DialogBotData");

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
			return TypeEnum.DIALOGBOTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DIALOGBOTDATA;

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

	public static final String JSON_PROPERTY_WEBHOOK_STATUS = "webhookStatus";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_STATUS)
	private ERegistrationStatus webhookStatus;

	public static final String JSON_PROPERTY_WEBHOOK_ENDPOINT = "webhookEndpoint";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_ENDPOINT)
	private String webhookEndpoint;

	public static final String JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS = "outboundTimeoutMillis";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS)
	private Long outboundTimeoutMillis;

	public static final String JSON_PROPERTY_WEBHOOK_API_VERSION = "webhookApiVersion";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
	private EWebApiVersion webhookApiVersion;

	public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
	private String webhookSecret;

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

	public static final String JSON_PROPERTY_MESSAGE_STATE_HANDLED_EXTERNALLY = "messageStateHandledExternally";
	@JsonProperty(JSON_PROPERTY_MESSAGE_STATE_HANDLED_EXTERNALLY)
	private Boolean messageStateHandledExternally;

	public static final String JSON_PROPERTY_AUTOMATIC_TYPING_STATE_HANDLING_ENABLED = "automaticTypingStateHandlingEnabled";
	@JsonProperty(JSON_PROPERTY_AUTOMATIC_TYPING_STATE_HANDLING_ENABLED)
	private Boolean automaticTypingStateHandlingEnabled;

	public static final String JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR = "onTimeoutBehavior";
	@JsonProperty(JSON_PROPERTY_ON_TIMEOUT_BEHAVIOR)
	private EBotDialogTimeoutBehavior onTimeoutBehavior;

	public DialogBotData $type(TypeEnum $type) {
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

	public DialogBotData id(String id) {
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

	public DialogBotData creationTimestamp(Long creationTimestamp) {
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

	public DialogBotData modificationTimestamp(Long modificationTimestamp) {
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

	public DialogBotData version(Long version) {
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

	public DialogBotData accountId(String accountId) {
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

	public DialogBotData name(String name) {
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

	public DialogBotData description(String description) {
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

	public DialogBotData botPersonId(String botPersonId) {
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

	public DialogBotData webhookStatus(ERegistrationStatus webhookStatus) {
		this.webhookStatus = webhookStatus;
		return this;
	}

	/**
	 * Get webhookStatus
	 * 
	 * @return webhookStatus
	 **/
	@ApiModelProperty(value = "")
	public ERegistrationStatus getWebhookStatus() {
		return webhookStatus;
	}

	public void setWebhookStatus(ERegistrationStatus webhookStatus) {
		this.webhookStatus = webhookStatus;
	}

	public DialogBotData webhookEndpoint(String webhookEndpoint) {
		this.webhookEndpoint = webhookEndpoint;
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
	 * @return webhookEndpoint
	 **/
	@ApiModelProperty(value = "The endpoint url of the webhook registration. To this url the requests for the webhook events are done. Maximum length of 4000 characters. <p> Based on the configured filters/flags the following events will be sent to the endpoint: <ul> <li>`TypedEvent.BOT_ONBOARDING_OFFER`: When a person matching the onboarding filter joins a conversation.</li> <li>`TypedEvent.BOT_REBOARDING_OFFER`: When a person writes a message to an unassigned conversation and the reboardingEnabled flag is set to true.</li> <li>`TypedEvent.BOT_OFFBOARDING_OFFER`: When a person matching the offboarding filter leaves a conversation or the conversation ends.</li> <li>`TypedEvent.BOT_DIALOG_OPENED`: When a preaviously accepted bot dialog starts</li> <li>`TypedEvent.BOT_DIALOG_MESSAGE`: On each message of a previously accepted bot dialog.</li> <li>`TypedEvent.BOT_DIALOG_MESSAGE_STATE`: On each message state update of a previously accepted bot dialog.</li> <li>`TypedEvent.BOT_DIALOG_COUNTERPART_CHANGED`: When the counterpart person of dialog changes during a dialog.</li> <li>`TypedEvent.BOT_DIALOG_CLOSED`: When a previously accepted bot dialog closes.</li> </ul>")
	public String getWebhookEndpoint() {
		return webhookEndpoint;
	}

	public void setWebhookEndpoint(String webhookEndpoint) {
		this.webhookEndpoint = webhookEndpoint;
	}

	public DialogBotData outboundTimeoutMillis(Long outboundTimeoutMillis) {
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

	public DialogBotData webhookApiVersion(EWebApiVersion webhookApiVersion) {
		this.webhookApiVersion = webhookApiVersion;
		return this;
	}

	/**
	 * Get webhookApiVersion
	 * 
	 * @return webhookApiVersion
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getWebhookApiVersion() {
		return webhookApiVersion;
	}

	public void setWebhookApiVersion(EWebApiVersion webhookApiVersion) {
		this.webhookApiVersion = webhookApiVersion;
	}

	public DialogBotData webhookSecret(String webhookSecret) {
		this.webhookSecret = webhookSecret;
		return this;
	}

	/**
	 * Optional secret which is send with each webhook event. &lt;p&gt; Maximum length of 4000 characters.
	 * 
	 * @return webhookSecret
	 **/
	@ApiModelProperty(value = "Optional secret which is send with each webhook event. <p> Maximum length of 4000 characters.")
	public String getWebhookSecret() {
		return webhookSecret;
	}

	public void setWebhookSecret(String webhookSecret) {
		this.webhookSecret = webhookSecret;
	}

	public DialogBotData onboardingOrder(Integer onboardingOrder) {
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

	public DialogBotData reboardingOrder(Integer reboardingOrder) {
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

	public DialogBotData offboardingOrder(Integer offboardingOrder) {
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

	public DialogBotData onboardingFilter(EBotDialogFilter onboardingFilter) {
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

	public DialogBotData reboardingEnabled(Boolean reboardingEnabled) {
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

	public DialogBotData offboardingFilter(EBotDialogFilter offboardingFilter) {
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

	public DialogBotData needsCounterpartPresence(Boolean needsCounterpartPresence) {
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

	public DialogBotData messageStateHandledExternally(Boolean messageStateHandledExternally) {
		this.messageStateHandledExternally = messageStateHandledExternally;
		return this;
	}

	/**
	 * Defines if the delivered/read state of messages is handled externally or by the collaboration server. &lt;br&gt; If the collaboration server handles the
	 * state, the messages are marked as delivered and read a soon as the webhook could be successfully dispatched to the configured webhookEndpoint.&lt;br&gt; If
	 * the it is handled externally, the external service has to call the api function to mark the message as delivered/read. Additionally webhook events for the
	 * message state of messages from the bot are dispatched.
	 * 
	 * @return messageStateHandledExternally
	 **/
	@ApiModelProperty(value = "Defines if the delivered/read state of messages is handled externally or by the collaboration server. <br> If the collaboration server handles the state, the messages are marked as delivered and read a soon as the webhook could be successfully dispatched to the configured webhookEndpoint.<br> If the it is handled externally, the external service has to call the api function to mark the message as delivered/read. Additionally webhook events for the message state of messages from the bot are dispatched.")
	public Boolean isMessageStateHandledExternally() {
		return messageStateHandledExternally;
	}

	public void setMessageStateHandledExternally(Boolean messageStateHandledExternally) {
		this.messageStateHandledExternally = messageStateHandledExternally;
	}

	public DialogBotData automaticTypingStateHandlingEnabled(Boolean automaticTypingStateHandlingEnabled) {
		this.automaticTypingStateHandlingEnabled = automaticTypingStateHandlingEnabled;
		return this;
	}

	/**
	 * Defines if the bot should automatically display a typing indicator after receiving a message from the counterpart person. The indication starts 1s after the
	 * message is received. The typing state can also be influenced through the web API, independently of this property.
	 * 
	 * @return automaticTypingStateHandlingEnabled
	 **/
	@ApiModelProperty(value = "Defines if the bot should automatically display a typing indicator after receiving a message from the counterpart person. The indication starts 1s after the message is received. The typing state can also be influenced through the web API, independently of this property.")
	public Boolean isAutomaticTypingStateHandlingEnabled() {
		return automaticTypingStateHandlingEnabled;
	}

	public void setAutomaticTypingStateHandlingEnabled(Boolean automaticTypingStateHandlingEnabled) {
		this.automaticTypingStateHandlingEnabled = automaticTypingStateHandlingEnabled;
	}

	public DialogBotData onTimeoutBehavior(EBotDialogTimeoutBehavior onTimeoutBehavior) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DialogBotData dialogBotData = (DialogBotData) o;
		return Objects.equals(this.$type, dialogBotData.$type) &&
				Objects.equals(this.id, dialogBotData.id) &&
				Objects.equals(this.creationTimestamp, dialogBotData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, dialogBotData.modificationTimestamp) &&
				Objects.equals(this.version, dialogBotData.version) &&
				Objects.equals(this.accountId, dialogBotData.accountId) &&
				Objects.equals(this.name, dialogBotData.name) &&
				Objects.equals(this.description, dialogBotData.description) &&
				Objects.equals(this.botPersonId, dialogBotData.botPersonId) &&
				Objects.equals(this.webhookStatus, dialogBotData.webhookStatus) &&
				Objects.equals(this.webhookEndpoint, dialogBotData.webhookEndpoint) &&
				Objects.equals(this.outboundTimeoutMillis, dialogBotData.outboundTimeoutMillis) &&
				Objects.equals(this.webhookApiVersion, dialogBotData.webhookApiVersion) &&
				Objects.equals(this.webhookSecret, dialogBotData.webhookSecret) &&
				Objects.equals(this.onboardingOrder, dialogBotData.onboardingOrder) &&
				Objects.equals(this.reboardingOrder, dialogBotData.reboardingOrder) &&
				Objects.equals(this.offboardingOrder, dialogBotData.offboardingOrder) &&
				Objects.equals(this.onboardingFilter, dialogBotData.onboardingFilter) &&
				Objects.equals(this.reboardingEnabled, dialogBotData.reboardingEnabled) &&
				Objects.equals(this.offboardingFilter, dialogBotData.offboardingFilter) &&
				Objects.equals(this.needsCounterpartPresence, dialogBotData.needsCounterpartPresence) &&
				Objects.equals(this.messageStateHandledExternally, dialogBotData.messageStateHandledExternally) &&
				Objects.equals(this.automaticTypingStateHandlingEnabled, dialogBotData.automaticTypingStateHandlingEnabled) &&
				Objects.equals(this.onTimeoutBehavior, dialogBotData.onTimeoutBehavior);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, botPersonId, webhookStatus, webhookEndpoint, outboundTimeoutMillis, webhookApiVersion, webhookSecret, onboardingOrder, reboardingOrder, offboardingOrder, onboardingFilter, reboardingEnabled, offboardingFilter, needsCounterpartPresence, messageStateHandledExternally, automaticTypingStateHandlingEnabled, onTimeoutBehavior);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DialogBotData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    botPersonId: ").append(toIndentedString(botPersonId)).append("\n");
		sb.append("    webhookStatus: ").append(toIndentedString(webhookStatus)).append("\n");
		sb.append("    webhookEndpoint: ").append(toIndentedString(webhookEndpoint)).append("\n");
		sb.append("    outboundTimeoutMillis: ").append(toIndentedString(outboundTimeoutMillis)).append("\n");
		sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
		sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
		sb.append("    onboardingOrder: ").append(toIndentedString(onboardingOrder)).append("\n");
		sb.append("    reboardingOrder: ").append(toIndentedString(reboardingOrder)).append("\n");
		sb.append("    offboardingOrder: ").append(toIndentedString(offboardingOrder)).append("\n");
		sb.append("    onboardingFilter: ").append(toIndentedString(onboardingFilter)).append("\n");
		sb.append("    reboardingEnabled: ").append(toIndentedString(reboardingEnabled)).append("\n");
		sb.append("    offboardingFilter: ").append(toIndentedString(offboardingFilter)).append("\n");
		sb.append("    needsCounterpartPresence: ").append(toIndentedString(needsCounterpartPresence)).append("\n");
		sb.append("    messageStateHandledExternally: ").append(toIndentedString(messageStateHandledExternally)).append("\n");
		sb.append("    automaticTypingStateHandlingEnabled: ").append(toIndentedString(automaticTypingStateHandlingEnabled)).append("\n");
		sb.append("    onTimeoutBehavior: ").append(toIndentedString(onTimeoutBehavior)).append("\n");
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
