
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
 * Event emitted when a message in a dialog between a person and a bot is marked as delivered/read. &lt;p&gt; This event will only be delivered to the dialog
 * bots that accepted dialog offer for this dialog beforehand.
 */
@ApiModel(description = "Event emitted when a message in a dialog between a person and a bot is marked as delivered/read. <p> This event will only be delivered to the dialog bots that accepted dialog offer for this dialog beforehand.")

@JsonPropertyOrder({
	BotDialogMessageStateEvent.JSON_PROPERTY_$_TYPE,
	BotDialogMessageStateEvent.JSON_PROPERTY_TIMESTAMP,
	BotDialogMessageStateEvent.JSON_PROPERTY_EVENT_TYPE,
	BotDialogMessageStateEvent.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogMessageStateEvent.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogMessageStateEvent.JSON_PROPERTY_MESSAGE_ID,
	BotDialogMessageStateEvent.JSON_PROPERTY_STATE,
	BotDialogMessageStateEvent.JSON_PROPERTY_BOT_PERSON_ID,
	BotDialogMessageStateEvent.JSON_PROPERTY_CONVERSATION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogMessageStateEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGMESSAGESTATEEVENT("BotDialogMessageStateEvent");

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
			return TypeEnum.BOTDIALOGMESSAGESTATEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGMESSAGESTATEEVENT;

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

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EMessageState state;

	public static final String JSON_PROPERTY_BOT_PERSON_ID = "botPersonId";
	@JsonProperty(JSON_PROPERTY_BOT_PERSON_ID)
	private String botPersonId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public BotDialogMessageStateEvent $type(TypeEnum $type) {
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

	public BotDialogMessageStateEvent timestamp(Long timestamp) {
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

	public BotDialogMessageStateEvent eventType(String eventType) {
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

	public BotDialogMessageStateEvent accountId(String accountId) {
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

	public BotDialogMessageStateEvent dialogToken(String dialogToken) {
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

	public BotDialogMessageStateEvent messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The id of the message which state has changed
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The id of the message which state has changed")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotDialogMessageStateEvent state(EMessageState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EMessageState getState() {
		return state;
	}

	public void setState(EMessageState state) {
		this.state = state;
	}

	public BotDialogMessageStateEvent botPersonId(String botPersonId) {
		this.botPersonId = botPersonId;
		return this;
	}

	/**
	 * The id if the bot who send the message
	 * 
	 * @return botPersonId
	 **/
	@ApiModelProperty(value = "The id if the bot who send the message")
	public String getBotPersonId() {
		return botPersonId;
	}

	public void setBotPersonId(String botPersonId) {
		this.botPersonId = botPersonId;
	}

	public BotDialogMessageStateEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The conversation to which the message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The conversation to which the message belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogMessageStateEvent botDialogMessageStateEvent = (BotDialogMessageStateEvent) o;
		return Objects.equals(this.$type, botDialogMessageStateEvent.$type) &&
				Objects.equals(this.timestamp, botDialogMessageStateEvent.timestamp) &&
				Objects.equals(this.eventType, botDialogMessageStateEvent.eventType) &&
				Objects.equals(this.accountId, botDialogMessageStateEvent.accountId) &&
				Objects.equals(this.dialogToken, botDialogMessageStateEvent.dialogToken) &&
				Objects.equals(this.messageId, botDialogMessageStateEvent.messageId) &&
				Objects.equals(this.state, botDialogMessageStateEvent.state) &&
				Objects.equals(this.botPersonId, botDialogMessageStateEvent.botPersonId) &&
				Objects.equals(this.conversationId, botDialogMessageStateEvent.conversationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, dialogToken, messageId, state, botPersonId, conversationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogMessageStateEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    botPersonId: ").append(toIndentedString(botPersonId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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
