
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
 * A message send from a bot to the collaboration server
 */
@ApiModel(description = "A message send from a bot to the collaboration server")

@JsonPropertyOrder({
	BotDialogPostMessage.JSON_PROPERTY_$_TYPE,
	BotDialogPostMessage.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogPostMessage.JSON_PROPERTY_MESSAGE_DATA,
	BotDialogPostMessage.JSON_PROPERTY_KEEP_TURN_OPEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogPostMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGPOSTMESSAGE("BotDialogPostMessage");

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
			return TypeEnum.BOTDIALOGPOSTMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGPOSTMESSAGE;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_MESSAGE_DATA = "messageData";
	@JsonProperty(JSON_PROPERTY_MESSAGE_DATA)
	private PostMessageData messageData = null;

	public static final String JSON_PROPERTY_KEEP_TURN_OPEN = "keepTurnOpen";
	@JsonProperty(JSON_PROPERTY_KEEP_TURN_OPEN)
	private Boolean keepTurnOpen;

	public BotDialogPostMessage $type(TypeEnum $type) {
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

	public BotDialogPostMessage dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The token belonging to the dialog the bot wants the message to
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The token belonging to the dialog the bot wants the message to")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogPostMessage messageData(PostMessageData messageData) {
		this.messageData = messageData;
		return this;
	}

	/**
	 * Get messageData
	 * 
	 * @return messageData
	 **/
	@ApiModelProperty(value = "")
	public PostMessageData getMessageData() {
		return messageData;
	}

	public void setMessageData(PostMessageData messageData) {
		this.messageData = messageData;
	}

	public BotDialogPostMessage keepTurnOpen(Boolean keepTurnOpen) {
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
		BotDialogPostMessage botDialogPostMessage = (BotDialogPostMessage) o;
		return Objects.equals(this.$type, botDialogPostMessage.$type) &&
				Objects.equals(this.dialogToken, botDialogPostMessage.dialogToken) &&
				Objects.equals(this.messageData, botDialogPostMessage.messageData) &&
				Objects.equals(this.keepTurnOpen, botDialogPostMessage.keepTurnOpen);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogToken, messageData, keepTurnOpen);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogPostMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageData: ").append(toIndentedString(messageData)).append("\n");
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
