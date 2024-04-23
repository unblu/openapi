
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
 * Request sent when a message in a dialog between a person and a bot is marked as delivered/read. &lt;p&gt; The request is only delivered to the dialog bots
 * that accepted the dialog offer for the dialog.
 */
@ApiModel(description = "Request sent when a message in a dialog between a person and a bot is marked as delivered/read. <p> The request is only delivered to the dialog bots that accepted the dialog offer for the dialog.")

@JsonPropertyOrder({
	BotDialogMessageStateRequest.JSON_PROPERTY_$_TYPE,
	BotDialogMessageStateRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogMessageStateRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogMessageStateRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogMessageStateRequest.JSON_PROPERTY_MESSAGE_ID,
	BotDialogMessageStateRequest.JSON_PROPERTY_STATE,
	BotDialogMessageStateRequest.JSON_PROPERTY_BOT_PERSON_ID,
	BotDialogMessageStateRequest.JSON_PROPERTY_CONVERSATION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogMessageStateRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGMESSAGESTATEREQUEST("BotDialogMessageStateRequest");

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
			return TypeEnum.BOTDIALOGMESSAGESTATEREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGMESSAGESTATEREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

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

	public BotDialogMessageStateRequest $type(TypeEnum $type) {
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

	public BotDialogMessageStateRequest accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public BotDialogMessageStateRequest serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	@ApiModelProperty(value = "")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public BotDialogMessageStateRequest dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * Token for this dialog. It is present in every dialog webhook and must be passed to all bot web API service calls to identify the dialog.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "Token for this dialog. It is present in every dialog webhook and must be passed to all bot web API service calls to identify the dialog.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogMessageStateRequest messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the message whose state has changed
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the message whose state has changed")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotDialogMessageStateRequest state(EMessageState state) {
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

	public BotDialogMessageStateRequest botPersonId(String botPersonId) {
		this.botPersonId = botPersonId;
		return this;
	}

	/**
	 * The ID of the bot that sent the message
	 * 
	 * @return botPersonId
	 **/
	@ApiModelProperty(value = "The ID of the bot that sent the message")
	public String getBotPersonId() {
		return botPersonId;
	}

	public void setBotPersonId(String botPersonId) {
		this.botPersonId = botPersonId;
	}

	public BotDialogMessageStateRequest conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The conversation the message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The conversation the message belongs to")
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
		BotDialogMessageStateRequest botDialogMessageStateRequest = (BotDialogMessageStateRequest) o;
		return Objects.equals(this.$type, botDialogMessageStateRequest.$type) &&
				Objects.equals(this.accountId, botDialogMessageStateRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogMessageStateRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogMessageStateRequest.dialogToken) &&
				Objects.equals(this.messageId, botDialogMessageStateRequest.messageId) &&
				Objects.equals(this.state, botDialogMessageStateRequest.state) &&
				Objects.equals(this.botPersonId, botDialogMessageStateRequest.botPersonId) &&
				Objects.equals(this.conversationId, botDialogMessageStateRequest.conversationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, messageId, state, botPersonId, conversationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogMessageStateRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
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
