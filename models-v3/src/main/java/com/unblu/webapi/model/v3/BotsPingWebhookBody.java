
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;botsPingWebhook&#39; operation
 */
@ApiModel(description = "Request Body for the 'botsPingWebhook' operation")

@JsonPropertyOrder({
	BotsPingWebhookBody.JSON_PROPERTY_DIALOG_BOT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsPingWebhookBody {
	public static final String JSON_PROPERTY_DIALOG_BOT_ID = "dialogBotId";
	@JsonProperty(JSON_PROPERTY_DIALOG_BOT_ID)
	private String dialogBotId;

	public BotsPingWebhookBody dialogBotId(String dialogBotId) {
		this.dialogBotId = dialogBotId;
		return this;
	}

	/**
	 * The ID of the dialog bot
	 * 
	 * @return dialogBotId
	 **/
	@ApiModelProperty(value = "The ID of the dialog bot")
	public String getDialogBotId() {
		return dialogBotId;
	}

	public void setDialogBotId(String dialogBotId) {
		this.dialogBotId = dialogBotId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsPingWebhookBody botsPingWebhookBody = (BotsPingWebhookBody) o;
		return Objects.equals(this.dialogBotId, botsPingWebhookBody.dialogBotId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dialogBotId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsPingWebhookBody {\n");
		sb.append("    dialogBotId: ").append(toIndentedString(dialogBotId)).append("\n");
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
