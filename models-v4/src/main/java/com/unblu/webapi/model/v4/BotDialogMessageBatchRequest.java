
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
 * Request sent once for the messages of a dialog between a person and a bot that were sent together in one action, for example a text with files. It replaces
 * the &#x60;BotDialogMessageRequest&#x60; for each of them. &lt;p&gt; The request is only sent to bots with message batching enabled, and only delivered to the
 * dialog bot that is currently handling this dialog. It&#39;s sent when the batch is complete, or before that with the messages approved so far, in the cases
 * described for &#x60;ConversationNewMessageBatchEvent&#x60;. A message approved after the request was sent reaches the bot as a
 * &#x60;BotDialogMessageRequest&#x60;.
 */
@ApiModel(description = "Request sent once for the messages of a dialog between a person and a bot that were sent together in one action, for example a text with files. It replaces the `BotDialogMessageRequest` for each of them. <p> The request is only sent to bots with message batching enabled, and only delivered to the dialog bot that is currently handling this dialog. It's sent when the batch is complete, or before that with the messages approved so far, in the cases described for `ConversationNewMessageBatchEvent`. A message approved after the request was sent reaches the bot as a `BotDialogMessageRequest`.")

@JsonPropertyOrder({
	BotDialogMessageBatchRequest.JSON_PROPERTY_$_TYPE,
	BotDialogMessageBatchRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogMessageBatchRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogMessageBatchRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogMessageBatchRequest.JSON_PROPERTY_CONVERSATION_ID,
	BotDialogMessageBatchRequest.JSON_PROPERTY_BATCH_ID,
	BotDialogMessageBatchRequest.JSON_PROPERTY_ORIGINAL_BATCH_SIZE,
	BotDialogMessageBatchRequest.JSON_PROPERTY_MESSAGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogMessageBatchRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGMESSAGEBATCHREQUEST("BotDialogMessageBatchRequest");

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
			return TypeEnum.BOTDIALOGMESSAGEBATCHREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGMESSAGEBATCHREQUEST;

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

	public static final String JSON_PROPERTY_BATCH_ID = "batchId";
	@JsonProperty(JSON_PROPERTY_BATCH_ID)
	private String batchId;

	public static final String JSON_PROPERTY_ORIGINAL_BATCH_SIZE = "originalBatchSize";
	@JsonProperty(JSON_PROPERTY_ORIGINAL_BATCH_SIZE)
	private Integer originalBatchSize;

	public static final String JSON_PROPERTY_MESSAGES = "messages";
	@JsonProperty(JSON_PROPERTY_MESSAGES)
	private List<MessageData> messages = null;

	public BotDialogMessageBatchRequest $type(TypeEnum $type) {
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

	public BotDialogMessageBatchRequest accountId(String accountId) {
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

	public BotDialogMessageBatchRequest serviceName(String serviceName) {
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

	public BotDialogMessageBatchRequest dialogToken(String dialogToken) {
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

	public BotDialogMessageBatchRequest conversationId(String conversationId) {
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

	public BotDialogMessageBatchRequest batchId(String batchId) {
		this.batchId = batchId;
		return this;
	}

	/**
	 * The ID of the batch, the same as &#x60;batchInfo.batchId&#x60; of each of its messages
	 * 
	 * @return batchId
	 **/
	@ApiModelProperty(value = "The ID of the batch, the same as `batchInfo.batchId` of each of its messages")
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public BotDialogMessageBatchRequest originalBatchSize(Integer originalBatchSize) {
		this.originalBatchSize = originalBatchSize;
		return this;
	}

	/**
	 * Number of messages the send action was meant to create. It&#39;s larger than the number of messages in the request if some of them were rejected, or
	 * weren&#39;t approved before the request was sent.
	 * 
	 * @return originalBatchSize
	 **/
	@ApiModelProperty(value = "Number of messages the send action was meant to create. It's larger than the number of messages in the request if some of them were rejected, or weren't approved before the request was sent.")
	public Integer getOriginalBatchSize() {
		return originalBatchSize;
	}

	public void setOriginalBatchSize(Integer originalBatchSize) {
		this.originalBatchSize = originalBatchSize;
	}

	public BotDialogMessageBatchRequest messages(List<MessageData> messages) {
		this.messages = messages;
		return this;
	}

	public BotDialogMessageBatchRequest addMessagesItem(MessageData messagesItem) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(messagesItem);
		return this;
	}

	/**
	 * The approved messages of the batch, ordered by their position within it
	 * 
	 * @return messages
	 **/
	@ApiModelProperty(value = "The approved messages of the batch, ordered by their position within it")
	public List<MessageData> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageData> messages) {
		this.messages = messages;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogMessageBatchRequest botDialogMessageBatchRequest = (BotDialogMessageBatchRequest) o;
		return Objects.equals(this.$type, botDialogMessageBatchRequest.$type) &&
				Objects.equals(this.accountId, botDialogMessageBatchRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogMessageBatchRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogMessageBatchRequest.dialogToken) &&
				Objects.equals(this.conversationId, botDialogMessageBatchRequest.conversationId) &&
				Objects.equals(this.batchId, botDialogMessageBatchRequest.batchId) &&
				Objects.equals(this.originalBatchSize, botDialogMessageBatchRequest.originalBatchSize) &&
				Objects.equals(this.messages, botDialogMessageBatchRequest.messages);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, conversationId, batchId, originalBatchSize, messages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogMessageBatchRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
		sb.append("    originalBatchSize: ").append(toIndentedString(originalBatchSize)).append("\n");
		sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
