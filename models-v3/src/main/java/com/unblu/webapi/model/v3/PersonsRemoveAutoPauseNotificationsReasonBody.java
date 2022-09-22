
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;personsRemoveAutoPauseNotificationsReason&#39; operation
 */
@ApiModel(description = "Request Body for the 'personsRemoveAutoPauseNotificationsReason' operation")

@JsonPropertyOrder({
	PersonsRemoveAutoPauseNotificationsReasonBody.JSON_PROPERTY_SOURCE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonsRemoveAutoPauseNotificationsReasonBody {
	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public PersonsRemoveAutoPauseNotificationsReasonBody sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The identifier of the auto-pause reason to remove
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The identifier of the auto-pause reason to remove")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonsRemoveAutoPauseNotificationsReasonBody personsRemoveAutoPauseNotificationsReasonBody = (PersonsRemoveAutoPauseNotificationsReasonBody) o;
		return Objects.equals(this.sourceId, personsRemoveAutoPauseNotificationsReasonBody.sourceId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sourceId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonsRemoveAutoPauseNotificationsReasonBody {\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
