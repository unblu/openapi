
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
 * Request sent when Unblu finishes a streaming message of the bot: a person stopped it (&#x60;STOPPED_BY_USER&#x60;), the bot sent no update within the stream
 * timeout set by &#x60;com.unblu.conversation.bot.streamingMessageTimeout&#x60; (&#x60;TIMED_OUT&#x60;), or the dialog ended while the stream was open
 * (&#x60;STOPPED_BY_SYSTEM&#x60;). The message is stored with the content streamed so far, or discarded if no content was streamed. Updating or finishing it
 * returns the HTTP status code 409, or 404 if the message was discarded. &lt;p&gt; A stream the bot finishes itself is not reported. A stop by a person is also
 * reported with &#x60;BotDialogAbortAnswerRequest&#x60;, if the bot receives it. &lt;p&gt; The request is only delivered to the dialog bot that streamed the
 * message.
 */
@ApiModel(description = "Request sent when Unblu finishes a streaming message of the bot: a person stopped it (`STOPPED_BY_USER`), the bot sent no update within the stream timeout set by `com.unblu.conversation.bot.streamingMessageTimeout` (`TIMED_OUT`), or the dialog ended while the stream was open (`STOPPED_BY_SYSTEM`). The message is stored with the content streamed so far, or discarded if no content was streamed. Updating or finishing it returns the HTTP status code 409, or 404 if the message was discarded. <p> A stream the bot finishes itself is not reported. A stop by a person is also reported with `BotDialogAbortAnswerRequest`, if the bot receives it. <p> The request is only delivered to the dialog bot that streamed the message.")

@JsonPropertyOrder({
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_$_TYPE,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_CONVERSATION_ID,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_COUNTERPART_PERSON_ID,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_MESSAGE_ID,
	BotDialogStreamingMessageFinishedRequest.JSON_PROPERTY_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogStreamingMessageFinishedRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGSTREAMINGMESSAGEFINISHEDREQUEST("BotDialogStreamingMessageFinishedRequest");

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
			return TypeEnum.BOTDIALOGSTREAMINGMESSAGEFINISHEDREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGSTREAMINGMESSAGEFINISHEDREQUEST;

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

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private EStreamingMessageFinishReason reason;

	public BotDialogStreamingMessageFinishedRequest $type(TypeEnum $type) {
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

	public BotDialogStreamingMessageFinishedRequest accountId(String accountId) {
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

	public BotDialogStreamingMessageFinishedRequest serviceName(String serviceName) {
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

	public BotDialogStreamingMessageFinishedRequest dialogToken(String dialogToken) {
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

	public BotDialogStreamingMessageFinishedRequest conversationId(String conversationId) {
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

	public BotDialogStreamingMessageFinishedRequest counterpartPersonId(String counterpartPersonId) {
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

	public BotDialogStreamingMessageFinishedRequest messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the streaming message that was finished.
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the streaming message that was finished.")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotDialogStreamingMessageFinishedRequest reason(EStreamingMessageFinishReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Get reason
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "")
	public EStreamingMessageFinishReason getReason() {
		return reason;
	}

	public void setReason(EStreamingMessageFinishReason reason) {
		this.reason = reason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogStreamingMessageFinishedRequest botDialogStreamingMessageFinishedRequest = (BotDialogStreamingMessageFinishedRequest) o;
		return Objects.equals(this.$type, botDialogStreamingMessageFinishedRequest.$type) &&
				Objects.equals(this.accountId, botDialogStreamingMessageFinishedRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogStreamingMessageFinishedRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogStreamingMessageFinishedRequest.dialogToken) &&
				Objects.equals(this.conversationId, botDialogStreamingMessageFinishedRequest.conversationId) &&
				Objects.equals(this.counterpartPersonId, botDialogStreamingMessageFinishedRequest.counterpartPersonId) &&
				Objects.equals(this.messageId, botDialogStreamingMessageFinishedRequest.messageId) &&
				Objects.equals(this.reason, botDialogStreamingMessageFinishedRequest.reason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, conversationId, counterpartPersonId, messageId, reason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogStreamingMessageFinishedRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    counterpartPersonId: ").append(toIndentedString(counterpartPersonId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
