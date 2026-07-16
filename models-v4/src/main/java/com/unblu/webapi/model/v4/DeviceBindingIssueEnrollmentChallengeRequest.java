
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
 * Enrollment step 1 request: the scanned registration token plus the device&#39;s freshly generated public key
 * (&#x60;IDeviceBindingService.issueEnrollmentChallenge&#x60;).
 */
@ApiModel(description = "Enrollment step 1 request: the scanned registration token plus the device's freshly generated public key (`IDeviceBindingService.issueEnrollmentChallenge`).")

@JsonPropertyOrder({
	DeviceBindingIssueEnrollmentChallengeRequest.JSON_PROPERTY_$_TYPE,
	DeviceBindingIssueEnrollmentChallengeRequest.JSON_PROPERTY_TOKEN,
	DeviceBindingIssueEnrollmentChallengeRequest.JSON_PROPERTY_PUBLIC_KEY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingIssueEnrollmentChallengeRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGISSUEENROLLMENTCHALLENGEREQUEST("DeviceBindingIssueEnrollmentChallengeRequest");

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
			return TypeEnum.DEVICEBINDINGISSUEENROLLMENTCHALLENGEREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGISSUEENROLLMENTCHALLENGEREQUEST;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_PUBLIC_KEY = "publicKey";
	@JsonProperty(JSON_PROPERTY_PUBLIC_KEY)
	private String publicKey;

	public DeviceBindingIssueEnrollmentChallengeRequest $type(TypeEnum $type) {
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

	public DeviceBindingIssueEnrollmentChallengeRequest token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Single-use registration token scanned from the enrollment QR code.
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "Single-use registration token scanned from the enrollment QR code.")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public DeviceBindingIssueEnrollmentChallengeRequest publicKey(String publicKey) {
		this.publicKey = publicKey;
		return this;
	}

	/**
	 * Base64-encoded SPKI public key generated and held by the device.
	 * 
	 * @return publicKey
	 **/
	@ApiModelProperty(value = "Base64-encoded SPKI public key generated and held by the device.")
	public String getPublicKey() {
		return publicKey;
	}

	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceBindingIssueEnrollmentChallengeRequest deviceBindingIssueEnrollmentChallengeRequest = (DeviceBindingIssueEnrollmentChallengeRequest) o;
		return Objects.equals(this.$type, deviceBindingIssueEnrollmentChallengeRequest.$type) &&
				Objects.equals(this.token, deviceBindingIssueEnrollmentChallengeRequest.token) &&
				Objects.equals(this.publicKey, deviceBindingIssueEnrollmentChallengeRequest.publicKey);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, token, publicKey);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingIssueEnrollmentChallengeRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
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
