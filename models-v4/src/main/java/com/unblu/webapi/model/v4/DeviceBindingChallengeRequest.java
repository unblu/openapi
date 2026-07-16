
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request for a one-time challenge used to verify an existing device binding (&#x60;IDeviceBindingService.issueVerifyChallenge&#x60;).
 */
@ApiModel(description = "Request for a one-time challenge used to verify an existing device binding (`IDeviceBindingService.issueVerifyChallenge`).")

@JsonPropertyOrder({
	DeviceBindingChallengeRequest.JSON_PROPERTY_$_TYPE,
	DeviceBindingChallengeRequest.JSON_PROPERTY_BINDING_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingChallengeRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGCHALLENGEREQUEST("DeviceBindingChallengeRequest");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.DEVICEBINDINGCHALLENGEREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGCHALLENGEREQUEST;

	public static final String JSON_PROPERTY_BINDING_ID = "bindingId";
	@JsonProperty(JSON_PROPERTY_BINDING_ID)
	private String bindingId;

	public DeviceBindingChallengeRequest $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public DeviceBindingChallengeRequest bindingId(String bindingId) {
		this.bindingId = bindingId;
		return this;
	}

	/**
	 * ID of the device binding to verify; the caller&#39;s session must own it.
	 * 
	 * @return bindingId
	 **/
	@ApiModelProperty(value = "ID of the device binding to verify; the caller's session must own it.")
	public String getBindingId() {
		return bindingId;
	}

	public void setBindingId(String bindingId) {
		this.bindingId = bindingId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceBindingChallengeRequest deviceBindingChallengeRequest = (DeviceBindingChallengeRequest) o;
		return Objects.equals(this.$type, deviceBindingChallengeRequest.$type) &&
				Objects.equals(this.bindingId, deviceBindingChallengeRequest.bindingId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, bindingId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingChallengeRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    bindingId: ").append(toIndentedString(bindingId)).append("\n");
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
