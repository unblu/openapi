
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
 * Replaces the content of an open streaming message with the full content streamed so far.
 */
@ApiModel(description = "Replaces the content of an open streaming message with the full content streamed so far.")

@JsonPropertyOrder({
	BotDialogUpdateStreamingMessage.JSON_PROPERTY_$_TYPE,
	BotDialogUpdateStreamingMessage.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogUpdateStreamingMessage.JSON_PROPERTY_MESSAGE_ID,
	BotDialogUpdateStreamingMessage.JSON_PROPERTY_STREAMING_DATA,
	BotDialogUpdateStreamingMessage.JSON_PROPERTY_SEQUENCE,
	BotDialogUpdateStreamingMessage.JSON_PROPERTY_STREAMING_ANIMATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogUpdateStreamingMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGUPDATESTREAMINGMESSAGE("BotDialogUpdateStreamingMessage");

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
			return TypeEnum.BOTDIALOGUPDATESTREAMINGMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGUPDATESTREAMINGMESSAGE;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_STREAMING_DATA = "streamingData";
	@JsonProperty(JSON_PROPERTY_STREAMING_DATA)
	private StreamingData streamingData = null;

	public static final String JSON_PROPERTY_SEQUENCE = "sequence";
	@JsonProperty(JSON_PROPERTY_SEQUENCE)
	private Integer sequence;

	public static final String JSON_PROPERTY_STREAMING_ANIMATION = "streamingAnimation";
	@JsonProperty(JSON_PROPERTY_STREAMING_ANIMATION)
	private String streamingAnimation;

	public BotDialogUpdateStreamingMessage $type(TypeEnum $type) {
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

	public BotDialogUpdateStreamingMessage dialogToken(String dialogToken) {
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

	public BotDialogUpdateStreamingMessage messageId(String messageId) {
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

	public BotDialogUpdateStreamingMessage streamingData(StreamingData streamingData) {
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

	public BotDialogUpdateStreamingMessage sequence(Integer sequence) {
		this.sequence = sequence;
		return this;
	}

	/**
	 * The order of the update within the stream. An update whose sequence is lower than or equal to one already received for the stream is ignored, so an update
	 * arriving late can&#39;t overwrite newer content. Mandatory.
	 * 
	 * @return sequence
	 **/
	@ApiModelProperty(value = "The order of the update within the stream. An update whose sequence is lower than or equal to one already received for the stream is ignored, so an update arriving late can't overwrite newer content. Mandatory.")
	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public BotDialogUpdateStreamingMessage streamingAnimation(String streamingAnimation) {
		this.streamingAnimation = streamingAnimation;
		return this;
	}

	/**
	 * Animation shown in place of the bot&#39;s avatar for the rest of the bot&#39;s turn, as a base64-encoded &#x60;image/_*&#x60; data URL (e.g. SVG, GIF, PNG).
	 * It replaces the animation of the turn. If omitted, the turn keeps its animation. Optional.
	 * 
	 * @return streamingAnimation
	 **/
	@ApiModelProperty(value = "Animation shown in place of the bot's avatar for the rest of the bot's turn, as a base64-encoded `image/_*` data URL (e.g. SVG, GIF, PNG). It replaces the animation of the turn. If omitted, the turn keeps its animation. Optional.")
	public String getStreamingAnimation() {
		return streamingAnimation;
	}

	public void setStreamingAnimation(String streamingAnimation) {
		this.streamingAnimation = streamingAnimation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogUpdateStreamingMessage botDialogUpdateStreamingMessage = (BotDialogUpdateStreamingMessage) o;
		return Objects.equals(this.$type, botDialogUpdateStreamingMessage.$type) &&
				Objects.equals(this.dialogToken, botDialogUpdateStreamingMessage.dialogToken) &&
				Objects.equals(this.messageId, botDialogUpdateStreamingMessage.messageId) &&
				Objects.equals(this.streamingData, botDialogUpdateStreamingMessage.streamingData) &&
				Objects.equals(this.sequence, botDialogUpdateStreamingMessage.sequence) &&
				Objects.equals(this.streamingAnimation, botDialogUpdateStreamingMessage.streamingAnimation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogToken, messageId, streamingData, sequence, streamingAnimation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogUpdateStreamingMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    streamingData: ").append(toIndentedString(streamingData)).append("\n");
		sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
		sb.append("    streamingAnimation: ").append(toIndentedString(streamingAnimation)).append("\n");
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
