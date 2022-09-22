
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;botsDialogMessageDelivered&#39; operation
 */
@ApiModel(description = "Request Body for the 'botsDialogMessageDelivered' operation")

@JsonPropertyOrder({
	BotsDialogMessageDeliveredBody.JSON_PROPERTY_DIALOG_TOKEN,
	BotsDialogMessageDeliveredBody.JSON_PROPERTY_MESSAGE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsDialogMessageDeliveredBody {
	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public BotsDialogMessageDeliveredBody dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The token belonging to the dialog of the bot
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The token belonging to the dialog of the bot")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotsDialogMessageDeliveredBody messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the delivered message
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the delivered message")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsDialogMessageDeliveredBody botsDialogMessageDeliveredBody = (BotsDialogMessageDeliveredBody) o;
		return Objects.equals(this.dialogToken, botsDialogMessageDeliveredBody.dialogToken) &&
				Objects.equals(this.messageId, botsDialogMessageDeliveredBody.messageId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dialogToken, messageId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsDialogMessageDeliveredBody {\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
