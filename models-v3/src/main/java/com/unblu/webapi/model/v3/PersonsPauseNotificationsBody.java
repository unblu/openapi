
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;personsPauseNotifications&#39; operation
 */
@ApiModel(description = "Request Body for the 'personsPauseNotifications' operation")

@JsonPropertyOrder({
	PersonsPauseNotificationsBody.JSON_PROPERTY_TIMEOUT_SECONDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonsPauseNotificationsBody {
	public static final String JSON_PROPERTY_TIMEOUT_SECONDS = "timeoutSeconds";
	@JsonProperty(JSON_PROPERTY_TIMEOUT_SECONDS)
	private Integer timeoutSeconds;

	public PersonsPauseNotificationsBody timeoutSeconds(Integer timeoutSeconds) {
		this.timeoutSeconds = timeoutSeconds;
		return this;
	}

	/**
	 * The duration, in seconds, that notifications should be paused for
	 * 
	 * @return timeoutSeconds
	 **/
	@ApiModelProperty(value = "The duration, in seconds, that notifications should be paused for")
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
		PersonsPauseNotificationsBody personsPauseNotificationsBody = (PersonsPauseNotificationsBody) o;
		return Objects.equals(this.timeoutSeconds, personsPauseNotificationsBody.timeoutSeconds);
	}

	@Override
	public int hashCode() {
		return Objects.hash(timeoutSeconds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonsPauseNotificationsBody {\n");
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
