
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;botsRestrictDialogCounterpart&#39; operation
 */
@ApiModel(description = "Request body for the 'botsRestrictDialogCounterpart' operation")

@JsonPropertyOrder({
	BotsRestrictDialogCounterpartBody.JSON_PROPERTY_DIALOG_TOKEN,
	BotsRestrictDialogCounterpartBody.JSON_PROPERTY_MAX_CHAT_INPUT_LENGTH,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsRestrictDialogCounterpartBody {
	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_MAX_CHAT_INPUT_LENGTH = "maxChatInputLength";
	@JsonProperty(JSON_PROPERTY_MAX_CHAT_INPUT_LENGTH)
	private Integer maxChatInputLength;

	public BotsRestrictDialogCounterpartBody dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The dialog token included in each bot dialog webhook
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The dialog token included in each bot dialog webhook")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotsRestrictDialogCounterpartBody maxChatInputLength(Integer maxChatInputLength) {
		this.maxChatInputLength = maxChatInputLength;
		return this;
	}

	/**
	 * The maximum number of characters in a message
	 * 
	 * @return maxChatInputLength
	 **/
	@ApiModelProperty(value = "The maximum number of characters in a message")
	public Integer getMaxChatInputLength() {
		return maxChatInputLength;
	}

	public void setMaxChatInputLength(Integer maxChatInputLength) {
		this.maxChatInputLength = maxChatInputLength;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsRestrictDialogCounterpartBody botsRestrictDialogCounterpartBody = (BotsRestrictDialogCounterpartBody) o;
		return Objects.equals(this.dialogToken, botsRestrictDialogCounterpartBody.dialogToken) &&
				Objects.equals(this.maxChatInputLength, botsRestrictDialogCounterpartBody.maxChatInputLength);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dialogToken, maxChatInputLength);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsRestrictDialogCounterpartBody {\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    maxChatInputLength: ").append(toIndentedString(maxChatInputLength)).append("\n");
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
