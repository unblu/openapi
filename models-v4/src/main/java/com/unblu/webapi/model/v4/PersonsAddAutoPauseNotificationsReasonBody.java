
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;personsAddAutoPauseNotificationsReason&#39; operation
 */
@ApiModel(description = "Request body for the 'personsAddAutoPauseNotificationsReason' operation")

@JsonPropertyOrder({
	PersonsAddAutoPauseNotificationsReasonBody.JSON_PROPERTY_SOURCE_ID,
	PersonsAddAutoPauseNotificationsReasonBody.JSON_PROPERTY_DISPLAY_NAME,
	PersonsAddAutoPauseNotificationsReasonBody.JSON_PROPERTY_TIMEOUT_SECONDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonsAddAutoPauseNotificationsReasonBody {
	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_TIMEOUT_SECONDS = "timeoutSeconds";
	@JsonProperty(JSON_PROPERTY_TIMEOUT_SECONDS)
	private Integer timeoutSeconds;

	public PersonsAddAutoPauseNotificationsReasonBody sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The source identifier of the auto-pause reason. This can be used later to remove or change the timeout for this reason.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The source identifier of the auto-pause reason. This can be used later to remove or change the timeout for this reason.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public PersonsAddAutoPauseNotificationsReasonBody displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * The name of the auto-pause reason displayed in the UI
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "The name of the auto-pause reason displayed in the UI")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public PersonsAddAutoPauseNotificationsReasonBody timeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
		return this;
	}

	/**
	 * The duration, in seconds, for which notifications should be paused automatically
	 * 
	 * @return timeoutSeconds
	 **/
	@ApiModelProperty(value = "The duration, in seconds, for which notifications should be paused automatically")
	public Integer getTimeoutSeconds() {
		return timeoutSeconds;
	}

	public void setTimeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonsAddAutoPauseNotificationsReasonBody personsAddAutoPauseNotificationsReasonBody = (PersonsAddAutoPauseNotificationsReasonBody) o;
		return Objects.equals(this.sourceId, personsAddAutoPauseNotificationsReasonBody.sourceId) &&
				Objects.equals(this.displayName, personsAddAutoPauseNotificationsReasonBody.displayName) &&
				Objects.equals(this.timeoutSeconds, personsAddAutoPauseNotificationsReasonBody.timeoutSeconds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(sourceId, displayName, timeoutSeconds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonsAddAutoPauseNotificationsReasonBody {\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
