
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
 * An edit of a message a bot sent earlier into a dialog. &lt;p&gt; The editing bot is the one the dialog belongs to, and it can only edit its own messages.
 */
@ApiModel(description = "An edit of a message a bot sent earlier into a dialog. <p> The editing bot is the one the dialog belongs to, and it can only edit its own messages.")

@JsonPropertyOrder({
	BotDialogEditMessage.JSON_PROPERTY_$_TYPE,
	BotDialogEditMessage.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogEditMessage.JSON_PROPERTY_MESSAGE_ID,
	BotDialogEditMessage.JSON_PROPERTY_EDIT_MESSAGE_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogEditMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGEDITMESSAGE("BotDialogEditMessage");

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
			return TypeEnum.BOTDIALOGEDITMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGEDITMESSAGE;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_EDIT_MESSAGE_DATA = "editMessageData";
	@JsonProperty(JSON_PROPERTY_EDIT_MESSAGE_DATA)
	private EditMessageData editMessageData = null;

	public BotDialogEditMessage $type(TypeEnum $type) {
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

	public BotDialogEditMessage dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The token belonging to the dialog the edited message was sent to
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The token belonging to the dialog the edited message was sent to")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogEditMessage messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the message to edit
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the message to edit")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotDialogEditMessage editMessageData(EditMessageData editMessageData) {
		this.editMessageData = editMessageData;
		return this;
	}

	/**
	 * Get editMessageData
	 * 
	 * @return editMessageData
	 **/
	@ApiModelProperty(value = "")
	public EditMessageData getEditMessageData() {
		return editMessageData;
	}

	public void setEditMessageData(EditMessageData editMessageData) {
		this.editMessageData = editMessageData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogEditMessage botDialogEditMessage = (BotDialogEditMessage) o;
		return Objects.equals(this.$type, botDialogEditMessage.$type) &&
				Objects.equals(this.dialogToken, botDialogEditMessage.dialogToken) &&
				Objects.equals(this.messageId, botDialogEditMessage.messageId) &&
				Objects.equals(this.editMessageData, botDialogEditMessage.editMessageData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, dialogToken, messageId, editMessageData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogEditMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    editMessageData: ").append(toIndentedString(editMessageData)).append("\n");
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
