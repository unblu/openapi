
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;botsStartDialogBotTypingIndicator&#39; operation
 */
@ApiModel(description = "Request body for the 'botsStartDialogBotTypingIndicator' operation")

@JsonPropertyOrder({
	BotsStartDialogBotTypingIndicatorBody.JSON_PROPERTY_DIALOG_TOKEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsStartDialogBotTypingIndicatorBody {
	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public BotsStartDialogBotTypingIndicatorBody dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The token that belongs to the bot&#39;s dialog
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The token that belongs to the bot's dialog")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsStartDialogBotTypingIndicatorBody botsStartDialogBotTypingIndicatorBody = (BotsStartDialogBotTypingIndicatorBody) o;
		return Objects.equals(this.dialogToken, botsStartDialogBotTypingIndicatorBody.dialogToken);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dialogToken);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsStartDialogBotTypingIndicatorBody {\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
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
