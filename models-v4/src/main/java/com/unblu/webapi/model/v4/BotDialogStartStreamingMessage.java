
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
 * Opens a streaming message in a dialog. Only one streaming message can be open per dialog, and the bot can&#39;t send other messages into the dialog while it
 * is open.
 */
@ApiModel(description = "Opens a streaming message in a dialog. Only one streaming message can be open per dialog, and the bot can't send other messages into the dialog while it is open.")

@JsonPropertyOrder({
	BotDialogStartStreamingMessage.JSON_PROPERTY_$_TYPE,
	BotDialogStartStreamingMessage.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogStartStreamingMessage.JSON_PROPERTY_STREAMING_DATA,
	BotDialogStartStreamingMessage.JSON_PROPERTY_INPUT_MODE,
	BotDialogStartStreamingMessage.JSON_PROPERTY_STREAMING_ANIMATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogStartStreamingMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGSTARTSTREAMINGMESSAGE("BotDialogStartStreamingMessage");

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
			return TypeEnum.BOTDIALOGSTARTSTREAMINGMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGSTARTSTREAMINGMESSAGE;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_STREAMING_DATA = "streamingData";
	@JsonProperty(JSON_PROPERTY_STREAMING_DATA)
	private StreamingData streamingData = null;

	public static final String JSON_PROPERTY_INPUT_MODE = "inputMode";
	@JsonProperty(JSON_PROPERTY_INPUT_MODE)
	private EBotTurnInputMode inputMode;

	public static final String JSON_PROPERTY_STREAMING_ANIMATION = "streamingAnimation";
	@JsonProperty(JSON_PROPERTY_STREAMING_ANIMATION)
	private String streamingAnimation;

	public BotDialogStartStreamingMessage $type(TypeEnum $type) {
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

	public BotDialogStartStreamingMessage dialogToken(String dialogToken) {
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

	public BotDialogStartStreamingMessage streamingData(StreamingData streamingData) {
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

	public BotDialogStartStreamingMessage inputMode(EBotTurnInputMode inputMode) {
		this.inputMode = inputMode;
		return this;
	}

	/**
	 * Get inputMode
	 * 
	 * @return inputMode
	 **/
	@ApiModelProperty(value = "")
	public EBotTurnInputMode getInputMode() {
		return inputMode;
	}

	public void setInputMode(EBotTurnInputMode inputMode) {
		this.inputMode = inputMode;
	}

	public BotDialogStartStreamingMessage streamingAnimation(String streamingAnimation) {
		this.streamingAnimation = streamingAnimation;
		return this;
	}

	/**
	 * Animation shown in place of the bot&#39;s avatar for the rest of the bot&#39;s turn, as a base64-encoded &#x60;image/_*&#x60; data URL (e.g. SVG, GIF, PNG).
	 * It replaces the animation of a turn that is already open, such as the one of a thinking indicator. If omitted, the turn keeps its animation. Optional.
	 * 
	 * @return streamingAnimation
	 **/
	@ApiModelProperty(value = "Animation shown in place of the bot's avatar for the rest of the bot's turn, as a base64-encoded `image/_*` data URL (e.g. SVG, GIF, PNG). It replaces the animation of a turn that is already open, such as the one of a thinking indicator. If omitted, the turn keeps its animation. Optional.")
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
		BotDialogStartStreamingMessage botDialogStartStreamingMessage = (BotDialogStartStreamingMessage) o;
		return Objects.equals(this.$type, botDialogStartStreamingMessage.$type) &&
				Objects.equals(this.dialogToken, botDialogStartStreamingMessage.dialogToken) &&
				Objects.equals(this.streamingData, botDialogStartStreamingMessage.streamingData) &&
				Objects.equals(this.inputMode, botDialogStartStreamingMessage.inputMode) &&
				Objects.equals(this.streamingAnimation, botDialogStartStreamingMessage.streamingAnimation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogToken, streamingData, inputMode, streamingAnimation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogStartStreamingMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    streamingData: ").append(toIndentedString(streamingData)).append("\n");
		sb.append("    inputMode: ").append(toIndentedString(inputMode)).append("\n");
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
