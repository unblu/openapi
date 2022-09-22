
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
 * A message send from a bot to the collaboration server
 */
@ApiModel(description = "A message send from a bot to the collaboration server")

@JsonPropertyOrder({
	BotDialogPostMessage.JSON_PROPERTY_$_TYPE,
	BotDialogPostMessage.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogPostMessage.JSON_PROPERTY_MESSAGE_DATA,
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
				Objects.equals(this.messageData, botDialogPostMessage.messageData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogToken, messageData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogPostMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageData: ").append(toIndentedString(messageData)).append("\n");
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
