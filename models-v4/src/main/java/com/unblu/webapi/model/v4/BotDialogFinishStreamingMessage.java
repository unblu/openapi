
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
 * Finishes an open streaming message, which stores it as a message of the conversation.
 */
@ApiModel(description = "Finishes an open streaming message, which stores it as a message of the conversation.")

@JsonPropertyOrder({
	BotDialogFinishStreamingMessage.JSON_PROPERTY_$_TYPE,
	BotDialogFinishStreamingMessage.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogFinishStreamingMessage.JSON_PROPERTY_MESSAGE_ID,
	BotDialogFinishStreamingMessage.JSON_PROPERTY_REASON,
	BotDialogFinishStreamingMessage.JSON_PROPERTY_STREAMING_DATA,
	BotDialogFinishStreamingMessage.JSON_PROPERTY_KEEP_TURN_OPEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogFinishStreamingMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGFINISHSTREAMINGMESSAGE("BotDialogFinishStreamingMessage");

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
			return TypeEnum.BOTDIALOGFINISHSTREAMINGMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGFINISHSTREAMINGMESSAGE;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private EBotStreamingMessageFinishReason reason;

	public static final String JSON_PROPERTY_STREAMING_DATA = "streamingData";
	@JsonProperty(JSON_PROPERTY_STREAMING_DATA)
	private StreamingData streamingData = null;

	public static final String JSON_PROPERTY_KEEP_TURN_OPEN = "keepTurnOpen";
	@JsonProperty(JSON_PROPERTY_KEEP_TURN_OPEN)
	private Boolean keepTurnOpen;

	public BotDialogFinishStreamingMessage $type(TypeEnum $type) {
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

	public BotDialogFinishStreamingMessage dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The token belonging to the dialog the message is streamed to. Mandatory.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The token belonging to the dialog the message is streamed to. Mandatory.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogFinishStreamingMessage messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the streaming message, as returned when the stream was started. Mandatory.
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the streaming message, as returned when the stream was started. Mandatory.")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotDialogFinishStreamingMessage reason(EBotStreamingMessageFinishReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Get reason
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "")
	public EBotStreamingMessageFinishReason getReason() {
		return reason;
	}

	public void setReason(EBotStreamingMessageFinishReason reason) {
		this.reason = reason;
	}

	public BotDialogFinishStreamingMessage streamingData(StreamingData streamingData) {
		this.streamingData = streamingData;
		return this;
	}

	/**
	 * Get streamingData
	 * 
	 * @return streamingData
	 **/
	@ApiModelProperty(value = "")
	public StreamingData getStreamingData() {
		return streamingData;
	}

	public void setStreamingData(StreamingData streamingData) {
		this.streamingData = streamingData;
	}

	public BotDialogFinishStreamingMessage keepTurnOpen(Boolean keepTurnOpen) {
		this.keepTurnOpen = keepTurnOpen;
		return this;
	}

	/**
	 * If true, the bot keeps its turn open after this message. The input of the person in the dialog keeps the input mode of the open turn, or the
	 * &#x60;turnInputMode&#x60; of the dialog bot if this message opens the turn. The turn ends with the next message without this flag, a call to
	 * &#x60;endDialogTurn&#x60;, or once the time set by &#x60;com.unblu.conversation.bot.dialogTurnTimeout&#x60; passes without a bot action. Once the person has
	 * stopped the bot, the flag is ignored until the person writes again. If omitted, the default is false.
	 * 
	 * @return keepTurnOpen
	 **/
	@ApiModelProperty(value = "If true, the bot keeps its turn open after this message. The input of the person in the dialog keeps the input mode of the open turn, or the `turnInputMode` of the dialog bot if this message opens the turn. The turn ends with the next message without this flag, a call to `endDialogTurn`, or once the time set by `com.unblu.conversation.bot.dialogTurnTimeout` passes without a bot action. Once the person has stopped the bot, the flag is ignored until the person writes again. If omitted, the default is false.")
	public Boolean isKeepTurnOpen() {
		return keepTurnOpen;
	}

	public void setKeepTurnOpen(Boolean keepTurnOpen) {
		this.keepTurnOpen = keepTurnOpen;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogFinishStreamingMessage botDialogFinishStreamingMessage = (BotDialogFinishStreamingMessage) o;
		return Objects.equals(this.$type, botDialogFinishStreamingMessage.$type) &&
				Objects.equals(this.dialogToken, botDialogFinishStreamingMessage.dialogToken) &&
				Objects.equals(this.messageId, botDialogFinishStreamingMessage.messageId) &&
				Objects.equals(this.reason, botDialogFinishStreamingMessage.reason) &&
				Objects.equals(this.streamingData, botDialogFinishStreamingMessage.streamingData) &&
				Objects.equals(this.keepTurnOpen, botDialogFinishStreamingMessage.keepTurnOpen);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogToken, messageId, reason, streamingData, keepTurnOpen);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogFinishStreamingMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("    streamingData: ").append(toIndentedString(streamingData)).append("\n");
		sb.append("    keepTurnOpen: ").append(toIndentedString(keepTurnOpen)).append("\n");
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
