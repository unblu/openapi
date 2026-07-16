
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
 * Enrollment step 2 request: proof-of-possession that completes device registration (&#x60;IDeviceBindingService.register&#x60;).
 */
@ApiModel(description = "Enrollment step 2 request: proof-of-possession that completes device registration (`IDeviceBindingService.register`).")

@JsonPropertyOrder({
	DeviceBindingRegistrationRequest.JSON_PROPERTY_$_TYPE,
	DeviceBindingRegistrationRequest.JSON_PROPERTY_REGISTRATION_TOKEN,
	DeviceBindingRegistrationRequest.JSON_PROPERTY_SIGNATURE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingRegistrationRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGREGISTRATIONREQUEST("DeviceBindingRegistrationRequest");

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
			return TypeEnum.DEVICEBINDINGREGISTRATIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGREGISTRATIONREQUEST;

	public static final String JSON_PROPERTY_REGISTRATION_TOKEN = "registrationToken";
	@JsonProperty(JSON_PROPERTY_REGISTRATION_TOKEN)
	private String registrationToken;

	public static final String JSON_PROPERTY_SIGNATURE = "signature";
	@JsonProperty(JSON_PROPERTY_SIGNATURE)
	private String signature;

	public DeviceBindingRegistrationRequest $type(TypeEnum $type) {
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

	public DeviceBindingRegistrationRequest registrationToken(String registrationToken) {
		this.registrationToken = registrationToken;
		return this;
	}

	/**
	 * Registration token previously presented when issuing the enrollment challenge.
	 * 
	 * @return registrationToken
	 **/
	@ApiModelProperty(value = "Registration token previously presented when issuing the enrollment challenge.")
	public String getRegistrationToken() {
		return registrationToken;
	}

	public void setRegistrationToken(String registrationToken) {
		this.registrationToken = registrationToken;
	}

	public DeviceBindingRegistrationRequest signature(String signature) {
		this.signature = signature;
		return this;
	}

	/**
	 * Base64-encoded signature over the server-stored challenge, produced with the device&#39;s private key.
	 * 
	 * @return signature
	 **/
	@ApiModelProperty(value = "Base64-encoded signature over the server-stored challenge, produced with the device's private key.")
	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceBindingRegistrationRequest deviceBindingRegistrationRequest = (DeviceBindingRegistrationRequest) o;
		return Objects.equals(this.$type, deviceBindingRegistrationRequest.$type) &&
				Objects.equals(this.registrationToken, deviceBindingRegistrationRequest.registrationToken) &&
				Objects.equals(this.signature, deviceBindingRegistrationRequest.signature);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, registrationToken, signature);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingRegistrationRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    registrationToken: ").append(toIndentedString(registrationToken)).append("\n");
		sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
