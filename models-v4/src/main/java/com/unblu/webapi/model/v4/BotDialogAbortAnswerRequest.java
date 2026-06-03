
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
 * Request sent when a dialog counterpart asks the bot to abort the answer it is currently producing. &lt;p&gt; Triggered when a user clicks the stop button
 * while the bot is generating its answer. The bot should abort its current answer and respond accordingly. &lt;p&gt; The request is only delivered to the
 * dialog bot that is currently producing the answer.
 */
@ApiModel(description = "Request sent when a dialog counterpart asks the bot to abort the answer it is currently producing. <p> Triggered when a user clicks the stop button while the bot is generating its answer. The bot should abort its current answer and respond accordingly. <p> The request is only delivered to the dialog bot that is currently producing the answer.")

@JsonPropertyOrder({
	BotDialogAbortAnswerRequest.JSON_PROPERTY_$_TYPE,
	BotDialogAbortAnswerRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogAbortAnswerRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogAbortAnswerRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogAbortAnswerRequest.JSON_PROPERTY_CONVERSATION_ID,
	BotDialogAbortAnswerRequest.JSON_PROPERTY_COUNTERPART_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogAbortAnswerRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGABORTANSWERREQUEST("BotDialogAbortAnswerRequest");

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
			return TypeEnum.BOTDIALOGABORTANSWERREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGABORTANSWERREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_COUNTERPART_PERSON_ID = "counterpartPersonId";
	@JsonProperty(JSON_PROPERTY_COUNTERPART_PERSON_ID)
	private String counterpartPersonId;

	public BotDialogAbortAnswerRequest $type(TypeEnum $type) {
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

	public BotDialogAbortAnswerRequest accountId(String accountId) {
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

	public BotDialogAbortAnswerRequest serviceName(String serviceName) {
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

	public BotDialogAbortAnswerRequest dialogToken(String dialogToken) {
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

	public BotDialogAbortAnswerRequest conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation this dialog belongs to.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation this dialog belongs to.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public BotDialogAbortAnswerRequest counterpartPersonId(String counterpartPersonId) {
		this.counterpartPersonId = counterpartPersonId;
		return this;
	}

	/**
	 * The ID of the person the bot is talking to.
	 * 
	 * @return counterpartPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person the bot is talking to.")
	public String getCounterpartPersonId() {
		return counterpartPersonId;
	}

	public void setCounterpartPersonId(String counterpartPersonId) {
		this.counterpartPersonId = counterpartPersonId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogAbortAnswerRequest botDialogAbortAnswerRequest = (BotDialogAbortAnswerRequest) o;
		return Objects.equals(this.$type, botDialogAbortAnswerRequest.$type) &&
				Objects.equals(this.accountId, botDialogAbortAnswerRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogAbortAnswerRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogAbortAnswerRequest.dialogToken) &&
				Objects.equals(this.conversationId, botDialogAbortAnswerRequest.conversationId) &&
				Objects.equals(this.counterpartPersonId, botDialogAbortAnswerRequest.counterpartPersonId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, conversationId, counterpartPersonId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogAbortAnswerRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    counterpartPersonId: ").append(toIndentedString(counterpartPersonId)).append("\n");
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
