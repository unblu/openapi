
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
 * Push notification for new message
 */
@ApiModel(description = "Push notification for new message")

@JsonPropertyOrder({
	NewMessagePushNotificationEvent.JSON_PROPERTY_$_TYPE,
	NewMessagePushNotificationEvent.JSON_PROPERTY_TIMESTAMP,
	NewMessagePushNotificationEvent.JSON_PROPERTY_EVENT_TYPE,
	NewMessagePushNotificationEvent.JSON_PROPERTY_ACCOUNT_ID,
	NewMessagePushNotificationEvent.JSON_PROPERTY_RECIPIENT,
	NewMessagePushNotificationEvent.JSON_PROPERTY_LOCALE,
	NewMessagePushNotificationEvent.JSON_PROPERTY_CONVERSATION_ID,
	NewMessagePushNotificationEvent.JSON_PROPERTY_DEVICE_TOKENS,
	NewMessagePushNotificationEvent.JSON_PROPERTY_MESSAGE_ID,
	NewMessagePushNotificationEvent.JSON_PROPERTY_MESSAGE_TEXT,
	NewMessagePushNotificationEvent.JSON_PROPERTY_MESSAGE_SEND_TIMESTAMP,
	NewMessagePushNotificationEvent.JSON_PROPERTY_MESSAGE_SERVER_TIMESTAMP,
	NewMessagePushNotificationEvent.JSON_PROPERTY_SENDER_NAME,
	NewMessagePushNotificationEvent.JSON_PROPERTY_SENDER_PERSON_ID,
	NewMessagePushNotificationEvent.JSON_PROPERTY_NOTIFICATION_COUNT,
	NewMessagePushNotificationEvent.JSON_PROPERTY_RECIPIENT_NOTIFICATION_COUNT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NewMessagePushNotificationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NEWMESSAGEPUSHNOTIFICATIONEVENT("NewMessagePushNotificationEvent");

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
			return TypeEnum.NEWMESSAGEPUSHNOTIFICATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NEWMESSAGEPUSHNOTIFICATIONEVENT;

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

	public static final String JSON_PROPERTY_MESSAGE_TEXT = "messageText";
	@JsonProperty(JSON_PROPERTY_MESSAGE_TEXT)
	private String messageText;

	public static final String JSON_PROPERTY_MESSAGE_SEND_TIMESTAMP = "messageSendTimestamp";
	@JsonProperty(JSON_PROPERTY_MESSAGE_SEND_TIMESTAMP)
	private Long messageSendTimestamp;

	public static final String JSON_PROPERTY_MESSAGE_SERVER_TIMESTAMP = "messageServerTimestamp";
	@JsonProperty(JSON_PROPERTY_MESSAGE_SERVER_TIMESTAMP)
	private Long messageServerTimestamp;

	public static final String JSON_PROPERTY_SENDER_NAME = "senderName";
	@JsonProperty(JSON_PROPERTY_SENDER_NAME)
	private String senderName;

	public static final String JSON_PROPERTY_SENDER_PERSON_ID = "senderPersonId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_ID)
	private String senderPersonId;

	public static final String JSON_PROPERTY_NOTIFICATION_COUNT = "notificationCount";
	@JsonProperty(JSON_PROPERTY_NOTIFICATION_COUNT)
	private Integer notificationCount;

	public static final String JSON_PROPERTY_RECIPIENT_NOTIFICATION_COUNT = "recipientNotificationCount";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_NOTIFICATION_COUNT)
	private Integer recipientNotificationCount;

	public NewMessagePushNotificationEvent $type(TypeEnum $type) {
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

	public NewMessagePushNotificationEvent timestamp(Long timestamp) {
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

	public NewMessagePushNotificationEvent eventType(String eventType) {
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

	public NewMessagePushNotificationEvent accountId(String accountId) {
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

	public NewMessagePushNotificationEvent recipient(PersonData recipient) {
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

	public NewMessagePushNotificationEvent locale(String locale) {
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

	public NewMessagePushNotificationEvent conversationId(String conversationId) {
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

	public NewMessagePushNotificationEvent deviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
		return this;
	}

	public NewMessagePushNotificationEvent addDeviceTokensItem(String deviceTokensItem) {
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

	public NewMessagePushNotificationEvent messageId(String messageId) {
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

	public NewMessagePushNotificationEvent messageText(String messageText) {
		this.messageText = messageText;
		return this;
	}

	/**
	 * Text of the message
	 * 
	 * @return messageText
	 **/
	@ApiModelProperty(value = "Text of the message")
	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public NewMessagePushNotificationEvent messageSendTimestamp(Long messageSendTimestamp) {
		this.messageSendTimestamp = messageSendTimestamp;
		return this;
	}

	/**
	 * Timestamp when the message was sent
	 * 
	 * @return messageSendTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the message was sent")
	public Long getMessageSendTimestamp() {
		return messageSendTimestamp;
	}

	public void setMessageSendTimestamp(Long messageSendTimestamp) {
		this.messageSendTimestamp = messageSendTimestamp;
	}

	public NewMessagePushNotificationEvent messageServerTimestamp(Long messageServerTimestamp) {
		this.messageServerTimestamp = messageServerTimestamp;
		return this;
	}

	/**
	 * Timestamp when the message was received by the server.
	 * 
	 * @return messageServerTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the message was received by the server.")
	public Long getMessageServerTimestamp() {
		return messageServerTimestamp;
	}

	public void setMessageServerTimestamp(Long messageServerTimestamp) {
		this.messageServerTimestamp = messageServerTimestamp;
	}

	public NewMessagePushNotificationEvent senderName(String senderName) {
		this.senderName = senderName;
		return this;
	}

	/**
	 * Name of the sender, can be null if the message was sent by the system.
	 * 
	 * @return senderName
	 **/
	@ApiModelProperty(value = "Name of the sender, can be null if the message was sent by the system.")
	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public NewMessagePushNotificationEvent senderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
		return this;
	}

	/**
	 * Person id of the sender, can be null if the message was sent by the system.
	 * 
	 * @return senderPersonId
	 **/
	@ApiModelProperty(value = "Person id of the sender, can be null if the message was sent by the system.")
	public String getSenderPersonId() {
		return senderPersonId;
	}

	public void setSenderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
	}

	public NewMessagePushNotificationEvent notificationCount(Integer notificationCount) {
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

	public NewMessagePushNotificationEvent recipientNotificationCount(Integer recipientNotificationCount) {
		this.recipientNotificationCount = recipientNotificationCount;
		return this;
	}

	/**
	 * Number of notifications (i.e. unread messages) the recipient person has in total
	 * 
	 * @return recipientNotificationCount
	 **/
	@ApiModelProperty(value = "Number of notifications (i.e. unread messages) the recipient person has in total")
	public Integer getRecipientNotificationCount() {
		return recipientNotificationCount;
	}

	public void setRecipientNotificationCount(Integer recipientNotificationCount) {
		this.recipientNotificationCount = recipientNotificationCount;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NewMessagePushNotificationEvent newMessagePushNotificationEvent = (NewMessagePushNotificationEvent) o;
		return Objects.equals(this.$type, newMessagePushNotificationEvent.$type) &&
				Objects.equals(this.timestamp, newMessagePushNotificationEvent.timestamp) &&
				Objects.equals(this.eventType, newMessagePushNotificationEvent.eventType) &&
				Objects.equals(this.accountId, newMessagePushNotificationEvent.accountId) &&
				Objects.equals(this.recipient, newMessagePushNotificationEvent.recipient) &&
				Objects.equals(this.locale, newMessagePushNotificationEvent.locale) &&
				Objects.equals(this.conversationId, newMessagePushNotificationEvent.conversationId) &&
				Objects.equals(this.deviceTokens, newMessagePushNotificationEvent.deviceTokens) &&
				Objects.equals(this.messageId, newMessagePushNotificationEvent.messageId) &&
				Objects.equals(this.messageText, newMessagePushNotificationEvent.messageText) &&
				Objects.equals(this.messageSendTimestamp, newMessagePushNotificationEvent.messageSendTimestamp) &&
				Objects.equals(this.messageServerTimestamp, newMessagePushNotificationEvent.messageServerTimestamp) &&
				Objects.equals(this.senderName, newMessagePushNotificationEvent.senderName) &&
				Objects.equals(this.senderPersonId, newMessagePushNotificationEvent.senderPersonId) &&
				Objects.equals(this.notificationCount, newMessagePushNotificationEvent.notificationCount) &&
				Objects.equals(this.recipientNotificationCount, newMessagePushNotificationEvent.recipientNotificationCount);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, recipient, locale, conversationId, deviceTokens, messageId, messageText, messageSendTimestamp, messageServerTimestamp, senderName, senderPersonId, notificationCount, recipientNotificationCount);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NewMessagePushNotificationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    deviceTokens: ").append(toIndentedString(deviceTokens)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    messageText: ").append(toIndentedString(messageText)).append("\n");
		sb.append("    messageSendTimestamp: ").append(toIndentedString(messageSendTimestamp)).append("\n");
		sb.append("    messageServerTimestamp: ").append(toIndentedString(messageServerTimestamp)).append("\n");
		sb.append("    senderName: ").append(toIndentedString(senderName)).append("\n");
		sb.append("    senderPersonId: ").append(toIndentedString(senderPersonId)).append("\n");
		sb.append("    notificationCount: ").append(toIndentedString(notificationCount)).append("\n");
		sb.append("    recipientNotificationCount: ").append(toIndentedString(recipientNotificationCount)).append("\n");
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
