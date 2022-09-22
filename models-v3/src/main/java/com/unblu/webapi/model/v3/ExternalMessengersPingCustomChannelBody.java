
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;externalMessengersPingCustomChannel&#39; operation
 */
@ApiModel(description = "Request Body for the 'externalMessengersPingCustomChannel' operation")

@JsonPropertyOrder({
	ExternalMessengersPingCustomChannelBody.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengersPingCustomChannelBody {
	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public ExternalMessengersPingCustomChannelBody externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * The ID of an external messenger channel of type &#x60;EExternalMessengerChannelType.CUSTOM&#x60;
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "The ID of an external messenger channel of type  `EExternalMessengerChannelType.CUSTOM`")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengersPingCustomChannelBody externalMessengersPingCustomChannelBody = (ExternalMessengersPingCustomChannelBody) o;
		return Objects.equals(this.externalMessengerChannelId, externalMessengersPingCustomChannelBody.externalMessengerChannelId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalMessengerChannelId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengersPingCustomChannelBody {\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
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
