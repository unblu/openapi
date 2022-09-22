
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;botsFinishDialog&#39; operation
 */
@ApiModel(description = "Request Body for the 'botsFinishDialog' operation")

@JsonPropertyOrder({
	BotsFinishDialogBody.JSON_PROPERTY_DIALOG_TOKEN,
	BotsFinishDialogBody.JSON_PROPERTY_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsFinishDialogBody {
	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private EBotDialogFinishReason reason;

	public BotsFinishDialogBody dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * The dialog token contained in each bot dialog webhook.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "The dialog token contained in each bot dialog webhook.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotsFinishDialogBody reason(EBotDialogFinishReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Get reason
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "")
	public EBotDialogFinishReason getReason() {
		return reason;
	}

	public void setReason(EBotDialogFinishReason reason) {
		this.reason = reason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsFinishDialogBody botsFinishDialogBody = (BotsFinishDialogBody) o;
		return Objects.equals(this.dialogToken, botsFinishDialogBody.dialogToken) &&
				Objects.equals(this.reason, botsFinishDialogBody.reason);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dialogToken, reason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsFinishDialogBody {\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
