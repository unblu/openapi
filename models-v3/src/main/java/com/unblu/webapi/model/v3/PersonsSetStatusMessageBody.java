
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;personsSetStatusMessage&#39; operation
 */
@ApiModel(description = "Request Body for the 'personsSetStatusMessage' operation")

@JsonPropertyOrder({
	PersonsSetStatusMessageBody.JSON_PROPERTY_STATUS_MESSAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonsSetStatusMessageBody {
	public static final String JSON_PROPERTY_STATUS_MESSAGE = "statusMessage";
	@JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
	private String statusMessage;

	public PersonsSetStatusMessageBody statusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
		return this;
	}

	/**
	 * The status message to display in the person&#39;s details
	 * 
	 * @return statusMessage
	 **/
	@ApiModelProperty(value = "The status message to display in the person's details")
	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonsSetStatusMessageBody personsSetStatusMessageBody = (PersonsSetStatusMessageBody) o;
		return Objects.equals(this.statusMessage, personsSetStatusMessageBody.statusMessage);
	}

	@Override
	public int hashCode() {
		return Objects.hash(statusMessage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonsSetStatusMessageBody {\n");
		sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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
