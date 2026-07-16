
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;deviceInfoServiceSetPushNotificationsEnabled&#39; operation
 */
@ApiModel(description = "Request body for the 'deviceInfoServiceSetPushNotificationsEnabled' operation")

@JsonPropertyOrder({
	DeviceInfoServiceSetPushNotificationsEnabledBody.JSON_PROPERTY_ENABLED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceInfoServiceSetPushNotificationsEnabledBody {
	public static final String JSON_PROPERTY_ENABLED = "enabled";
	@JsonProperty(JSON_PROPERTY_ENABLED)
	private Boolean enabled;

	public DeviceInfoServiceSetPushNotificationsEnabledBody enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	/**
	 * &#x60;true&#x60; to enable, &#x60;false&#x60; to disable push notifications on this device
	 * 
	 * @return enabled
	 **/
	@ApiModelProperty(value = "`true`  to enable,  `false`  to disable push notifications on this device")
	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceInfoServiceSetPushNotificationsEnabledBody deviceInfoServiceSetPushNotificationsEnabledBody = (DeviceInfoServiceSetPushNotificationsEnabledBody) o;
		return Objects.equals(this.enabled, deviceInfoServiceSetPushNotificationsEnabledBody.enabled);
	}

	@Override
	public int hashCode() {
		return Objects.hash(enabled);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceInfoServiceSetPushNotificationsEnabledBody {\n");
		sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
