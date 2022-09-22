
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
 * Push notification when some unread messages were read
 */
@ApiModel(description = "Push notification when some unread messages were read")

@JsonPropertyOrder({
	ReadMessagePushNotificationEvent.JSON_PROPERTY_$_TYPE,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_TIMESTAMP,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_EVENT_TYPE,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_ACCOUNT_ID,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_RECIPIENT,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_LOCALE,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_CONVERSATION_ID,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_DEVICE_TOKENS,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_MESSAGE_ID,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_READ_TIMESTAMP,
	ReadMessagePushNotificationEvent.JSON_PROPERTY_NOTIFICATION_COUNT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ReadMessagePushNotificationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		READMESSAGEPUSHNOTIFICATIONEVENT("ReadMessagePushNotificationEvent");

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
			return TypeEnum.READMESSAGEPUSHNOTIFICATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.READMESSAGEPUSHNOTIFICATIONEVENT;

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

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_READ_TIMESTAMP = "readTimestamp";
	@JsonProperty(JSON_PROPERTY_READ_TIMESTAMP)
	private Long readTimestamp;

	public static final String JSON_PROPERTY_NOTIFICATION_COUNT = "notificationCount";
	@JsonProperty(JSON_PROPERTY_NOTIFICATION_COUNT)
	private Integer notificationCount;

	public ReadMessagePushNotificationEvent $type(TypeEnum $type) {
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

	public ReadMessagePushNotificationEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (unix time in millies) that the event was generated.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (unix time in millies) that the event was generated.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public ReadMessagePushNotificationEvent eventType(String eventType) {
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

	public ReadMessagePushNotificationEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ReadMessagePushNotificationEvent recipient(PersonData recipient) {
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

	public ReadMessagePushNotificationEvent locale(String locale) {
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

	public ReadMessagePushNotificationEvent conversationId(String conversationId) {
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

	public ReadMessagePushNotificationEvent deviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
		return this;
	}

	public ReadMessagePushNotificationEvent addDeviceTokensItem(String deviceTokensItem) {
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

	public ReadMessagePushNotificationEvent messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * Id of the message
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "Id of the message")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public ReadMessagePushNotificationEvent readTimestamp(Long readTimestamp) {
		this.readTimestamp = readTimestamp;
		return this;
	}

	/**
	 * Timestamp when the message was read.
	 * 
	 * @return readTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the message was read.")
	public Long getReadTimestamp() {
		return readTimestamp;
	}

	public void setReadTimestamp(Long readTimestamp) {
		this.readTimestamp = readTimestamp;
	}

	public ReadMessagePushNotificationEvent notificationCount(Integer notificationCount) {
		this.notificationCount = notificationCount;
		return this;
	}

	/**
	 * Number of notifications (i.e. unread messages) in this conversation
	 * 
	 * @return notificationCount
	 **/
	@ApiModelProperty(value = "Number of notifications (i.e. unread messages) in this conversation")
	public Integer getNotificationCount() {
		return notificationCount;
	}

	public void setNotificationCount(Integer notificationCount) {
		this.notificationCount = notificationCount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReadMessagePushNotificationEvent readMessagePushNotificationEvent = (ReadMessagePushNotificationEvent) o;
		return Objects.equals(this.$type, readMessagePushNotificationEvent.$type) &&
				Objects.equals(this.timestamp, readMessagePushNotificationEvent.timestamp) &&
				Objects.equals(this.eventType, readMessagePushNotificationEvent.eventType) &&
				Objects.equals(this.accountId, readMessagePushNotificationEvent.accountId) &&
				Objects.equals(this.recipient, readMessagePushNotificationEvent.recipient) &&
				Objects.equals(this.locale, readMessagePushNotificationEvent.locale) &&
				Objects.equals(this.conversationId, readMessagePushNotificationEvent.conversationId) &&
				Objects.equals(this.deviceTokens, readMessagePushNotificationEvent.deviceTokens) &&
				Objects.equals(this.messageId, readMessagePushNotificationEvent.messageId) &&
				Objects.equals(this.readTimestamp, readMessagePushNotificationEvent.readTimestamp) &&
				Objects.equals(this.notificationCount, readMessagePushNotificationEvent.notificationCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, recipient, locale, conversationId, deviceTokens, messageId, readTimestamp, notificationCount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReadMessagePushNotificationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    deviceTokens: ").append(toIndentedString(deviceTokens)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    readTimestamp: ").append(toIndentedString(readTimestamp)).append("\n");
		sb.append("    notificationCount: ").append(toIndentedString(notificationCount)).append("\n");
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
