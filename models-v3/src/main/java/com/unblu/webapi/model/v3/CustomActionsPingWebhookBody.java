
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;customActionsPingWebhook&#39; operation
 */
@ApiModel(description = "Request Body for the 'customActionsPingWebhook' operation")

@JsonPropertyOrder({
	CustomActionsPingWebhookBody.JSON_PROPERTY_CUSTOM_ACTION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomActionsPingWebhookBody {
	public static final String JSON_PROPERTY_CUSTOM_ACTION_ID = "customActionId";
	@JsonProperty(JSON_PROPERTY_CUSTOM_ACTION_ID)
	private String customActionId;

	public CustomActionsPingWebhookBody customActionId(String customActionId) {
		this.customActionId = customActionId;
		return this;
	}

	/**
	 * The ID of the custom action
	 * 
	 * @return customActionId
	 **/
	@ApiModelProperty(value = "The ID of the custom action")
	public String getCustomActionId() {
		return customActionId;
	}

	public void setCustomActionId(String customActionId) {
		this.customActionId = customActionId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomActionsPingWebhookBody customActionsPingWebhookBody = (CustomActionsPingWebhookBody) o;
		return Objects.equals(this.customActionId, customActionsPingWebhookBody.customActionId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(customActionId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomActionsPingWebhookBody {\n");
		sb.append("    customActionId: ").append(toIndentedString(customActionId)).append("\n");
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
