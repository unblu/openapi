
package com.unblu.webapi.model.v3;

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
 * Push notification when deputy delegation is triggered for the recipient person to handle the inbound request for the primary agent
 */
@ApiModel(description = "Push notification when deputy delegation is triggered for the recipient person to handle the inbound request for the primary agent")

@JsonPropertyOrder({
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_$_TYPE,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_TIMESTAMP,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_EVENT_TYPE,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_ACCOUNT_ID,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_RECIPIENT,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_LOCALE,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_CONVERSATION_ID,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_DEVICE_TOKENS,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_INVITATION_ID,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_CONTEXT_PERSON,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_CONVERSATION_START_URL,
	DeputyDelegationPushNotificationEvent.JSON_PROPERTY_PRIMARY_AGENT_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeputyDelegationPushNotificationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEPUTYDELEGATIONPUSHNOTIFICATIONEVENT("DeputyDelegationPushNotificationEvent");

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
			return TypeEnum.DEPUTYDELEGATIONPUSHNOTIFICATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEPUTYDELEGATIONPUSHNOTIFICATIONEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private PersonData recipient = null;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_DEVICE_TOKENS = "deviceTokens";
	@JsonProperty(JSON_PROPERTY_DEVICE_TOKENS)
	private List<String> deviceTokens = null;

	public static final String JSON_PROPERTY_INVITATION_ID = "invitationId";
	@JsonProperty(JSON_PROPERTY_INVITATION_ID)
	private String invitationId;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_CONTEXT_PERSON = "contextPerson";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON)
	private PersonData contextPerson = null;

	public static final String JSON_PROPERTY_CONVERSATION_START_URL = "conversationStartUrl";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_START_URL)
	private String conversationStartUrl;

	public static final String JSON_PROPERTY_PRIMARY_AGENT_PERSON = "primaryAgentPerson";
	@JsonProperty(JSON_PROPERTY_PRIMARY_AGENT_PERSON)
	private PersonData primaryAgentPerson = null;

	public DeputyDelegationPushNotificationEvent $type(TypeEnum $type) {
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

	public DeputyDelegationPushNotificationEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public DeputyDelegationPushNotificationEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public DeputyDelegationPushNotificationEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public DeputyDelegationPushNotificationEvent recipient(PersonData recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public PersonData getRecipient() {
		return recipient;
	}

	public void setRecipient(PersonData recipient) {
		this.recipient = recipient;
	}

	public DeputyDelegationPushNotificationEvent locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Locale (as BCP 47 language tag form including region if available)
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Locale (as BCP 47 language tag form including region if available)")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public DeputyDelegationPushNotificationEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public DeputyDelegationPushNotificationEvent deviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
		return this;
	}

	public DeputyDelegationPushNotificationEvent addDeviceTokensItem(String deviceTokensItem) {
		if (this.deviceTokens == null) {
			this.deviceTokens = new ArrayList<>();
		}
		this.deviceTokens.add(deviceTokensItem);
		return this;
	}

	/**
	 * List of device tokens
	 * 
	 * @return deviceTokens
	 **/
	@ApiModelProperty(value = "List of device tokens")
	public List<String> getDeviceTokens() {
		return deviceTokens;
	}

	public void setDeviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
	}

	public DeputyDelegationPushNotificationEvent invitationId(String invitationId) {
		this.invitationId = invitationId;
		return this;
	}

	/**
	 * The ID of the invitation delegated to the deputy
	 * 
	 * @return invitationId
	 **/
	@ApiModelProperty(value = "The ID of the invitation delegated to the deputy")
	public String getInvitationId() {
		return invitationId;
	}

	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}

	public DeputyDelegationPushNotificationEvent initialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
		return this;
	}

	/**
	 * Get initialEngagementType
	 * 
	 * @return initialEngagementType
	 **/
	@ApiModelProperty(value = "")
	public EInitialEngagementType getInitialEngagementType() {
		return initialEngagementType;
	}

	public void setInitialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
	}

	public DeputyDelegationPushNotificationEvent contextPerson(PersonData contextPerson) {
		this.contextPerson = contextPerson;
		return this;
	}

	/**
	 * Get contextPerson
	 * 
	 * @return contextPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getContextPerson() {
		return contextPerson;
	}

	public void setContextPerson(PersonData contextPerson) {
		this.contextPerson = contextPerson;
	}

	public DeputyDelegationPushNotificationEvent conversationStartUrl(String conversationStartUrl) {
		this.conversationStartUrl = conversationStartUrl;
		return this;
	}

	/**
	 * The URL where the conversation started
	 * 
	 * @return conversationStartUrl
	 **/
	@ApiModelProperty(value = "The URL where the conversation started")
	public String getConversationStartUrl() {
		return conversationStartUrl;
	}

	public void setConversationStartUrl(String conversationStartUrl) {
		this.conversationStartUrl = conversationStartUrl;
	}

	public DeputyDelegationPushNotificationEvent primaryAgentPerson(PersonData primaryAgentPerson) {
		this.primaryAgentPerson = primaryAgentPerson;
		return this;
	}

	/**
	 * Get primaryAgentPerson
	 * 
	 * @return primaryAgentPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getPrimaryAgentPerson() {
		return primaryAgentPerson;
	}

	public void setPrimaryAgentPerson(PersonData primaryAgentPerson) {
		this.primaryAgentPerson = primaryAgentPerson;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeputyDelegationPushNotificationEvent deputyDelegationPushNotificationEvent = (DeputyDelegationPushNotificationEvent) o;
		return Objects.equals(this.$type, deputyDelegationPushNotificationEvent.$type) &&
				Objects.equals(this.timestamp, deputyDelegationPushNotificationEvent.timestamp) &&
				Objects.equals(this.eventType, deputyDelegationPushNotificationEvent.eventType) &&
				Objects.equals(this.accountId, deputyDelegationPushNotificationEvent.accountId) &&
				Objects.equals(this.recipient, deputyDelegationPushNotificationEvent.recipient) &&
				Objects.equals(this.locale, deputyDelegationPushNotificationEvent.locale) &&
				Objects.equals(this.conversationId, deputyDelegationPushNotificationEvent.conversationId) &&
				Objects.equals(this.deviceTokens, deputyDelegationPushNotificationEvent.deviceTokens) &&
				Objects.equals(this.invitationId, deputyDelegationPushNotificationEvent.invitationId) &&
				Objects.equals(this.initialEngagementType, deputyDelegationPushNotificationEvent.initialEngagementType) &&
				Objects.equals(this.contextPerson, deputyDelegationPushNotificationEvent.contextPerson) &&
				Objects.equals(this.conversationStartUrl, deputyDelegationPushNotificationEvent.conversationStartUrl) &&
				Objects.equals(this.primaryAgentPerson, deputyDelegationPushNotificationEvent.primaryAgentPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, recipient, locale, conversationId, deviceTokens, invitationId, initialEngagementType, contextPerson, conversationStartUrl, primaryAgentPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeputyDelegationPushNotificationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    deviceTokens: ").append(toIndentedString(deviceTokens)).append("\n");
		sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    contextPerson: ").append(toIndentedString(contextPerson)).append("\n");
		sb.append("    conversationStartUrl: ").append(toIndentedString(conversationStartUrl)).append("\n");
		sb.append("    primaryAgentPerson: ").append(toIndentedString(primaryAgentPerson)).append("\n");
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
