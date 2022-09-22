
package com.unblu.webapi.model.v3;

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
 * Event emitted when a new message in a dialog between a person and a bot is sent. &lt;p&gt; This event will only be delivered to the dialog bots that accepted
 * dialog offer for this dialog beforehand.
 */
@ApiModel(description = "Event emitted when a new message in a dialog between a person and a bot is sent. <p> This event will only be delivered to the dialog bots that accepted dialog offer for this dialog beforehand.")

@JsonPropertyOrder({
	BotDialogMessageEvent.JSON_PROPERTY_$_TYPE,
	BotDialogMessageEvent.JSON_PROPERTY_TIMESTAMP,
	BotDialogMessageEvent.JSON_PROPERTY_EVENT_TYPE,
	BotDialogMessageEvent.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogMessageEvent.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogMessageEvent.JSON_PROPERTY_CONVERSATION_MESSAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogMessageEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGMESSAGEEVENT("BotDialogMessageEvent");

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
			return TypeEnum.BOTDIALOGMESSAGEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGMESSAGEEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public BotDialogMessageEvent $type(TypeEnum $type) {
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

	public BotDialogMessageEvent timestamp(Long timestamp) {
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

	public BotDialogMessageEvent eventType(String eventType) {
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

	public BotDialogMessageEvent accountId(String accountId) {
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

	public BotDialogMessageEvent dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * Token for this dialog. It is present in every dialog webhook and must be passed to all Bot Web-API service calls to identify the dialog.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "Token for this dialog. It is present in every dialog webhook and must be passed to all Bot Web-API service calls to identify the dialog.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogMessageEvent conversationMessage(MessageData conversationMessage) {
		this.conversationMessage = conversationMessage;
		return this;
	}

	/**
	 * Get conversationMessage
	 * 
	 * @return conversationMessage
	 **/
	@ApiModelProperty(value = "")
	public MessageData getConversationMessage() {
		return conversationMessage;
	}

	public void setConversationMessage(MessageData conversationMessage) {
		this.conversationMessage = conversationMessage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogMessageEvent botDialogMessageEvent = (BotDialogMessageEvent) o;
		return Objects.equals(this.$type, botDialogMessageEvent.$type) &&
				Objects.equals(this.timestamp, botDialogMessageEvent.timestamp) &&
				Objects.equals(this.eventType, botDialogMessageEvent.eventType) &&
				Objects.equals(this.accountId, botDialogMessageEvent.accountId) &&
				Objects.equals(this.dialogToken, botDialogMessageEvent.dialogToken) &&
				Objects.equals(this.conversationMessage, botDialogMessageEvent.conversationMessage);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, dialogToken, conversationMessage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogMessageEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
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
