
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;botsDeclineDialogOffer&#39; operation
 */
@ApiModel(description = "Request Body for the 'botsDeclineDialogOffer' operation")

@JsonPropertyOrder({
	BotsDeclineDialogOfferBody.JSON_PROPERTY_DIALOG_OFFER_TOKEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsDeclineDialogOfferBody {
	public static final String JSON_PROPERTY_DIALOG_OFFER_TOKEN = "dialogOfferToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_OFFER_TOKEN)
	private String dialogOfferToken;

	public BotsDeclineDialogOfferBody dialogOfferToken(String dialogOfferToken) {
		this.dialogOfferToken = dialogOfferToken;
		return this;
	}

	/**
	 * the onboarding-, reboarding- or offboarding-offer token contained in the webhook.
	 * 
	 * @return dialogOfferToken
	 **/
	@ApiModelProperty(value = "the onboarding-, reboarding- or offboarding-offer token contained in the webhook.")
	public String getDialogOfferToken() {
		return dialogOfferToken;
	}

	public void setDialogOfferToken(String dialogOfferToken) {
		this.dialogOfferToken = dialogOfferToken;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsDeclineDialogOfferBody botsDeclineDialogOfferBody = (BotsDeclineDialogOfferBody) o;
		return Objects.equals(this.dialogOfferToken, botsDeclineDialogOfferBody.dialogOfferToken);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dialogOfferToken);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsDeclineDialogOfferBody {\n");
		sb.append("    dialogOfferToken: ").append(toIndentedString(dialogOfferToken)).append("\n");
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
