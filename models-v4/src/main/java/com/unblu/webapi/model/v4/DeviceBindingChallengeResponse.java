
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
 * A server-issued one-time challenge that the device must sign to verify an existing binding.
 */
@ApiModel(description = "A server-issued one-time challenge that the device must sign to verify an existing binding.")

@JsonPropertyOrder({
	DeviceBindingChallengeResponse.JSON_PROPERTY_$_TYPE,
	DeviceBindingChallengeResponse.JSON_PROPERTY_CHALLENGE,
	DeviceBindingChallengeResponse.JSON_PROPERTY_EXPIRES_AT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingChallengeResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGCHALLENGERESPONSE("DeviceBindingChallengeResponse");

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
			return TypeEnum.DEVICEBINDINGCHALLENGERESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGCHALLENGERESPONSE;

	public static final String JSON_PROPERTY_CHALLENGE = "challenge";
	@JsonProperty(JSON_PROPERTY_CHALLENGE)
	private String challenge;

	public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
	@JsonProperty(JSON_PROPERTY_EXPIRES_AT)
	private Long expiresAt;

	public DeviceBindingChallengeResponse $type(TypeEnum $type) {
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

	public DeviceBindingChallengeResponse challenge(String challenge) {
		this.challenge = challenge;
		return this;
	}

	/**
	 * Base64-encoded random challenge the device signs with its bound private key.
	 * 
	 * @return challenge
	 **/
	@ApiModelProperty(value = "Base64-encoded random challenge the device signs with its bound private key.")
	public String getChallenge() {
		return challenge;
	}

	public void setChallenge(String challenge) {
		this.challenge = challenge;
	}

	public DeviceBindingChallengeResponse expiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
		return this;
	}

	/**
	 * Epoch-millis timestamp after which the challenge is no longer valid.
	 * 
	 * @return expiresAt
	 **/
	@ApiModelProperty(value = "Epoch-millis timestamp after which the challenge is no longer valid.")
	public Long getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceBindingChallengeResponse deviceBindingChallengeResponse = (DeviceBindingChallengeResponse) o;
		return Objects.equals(this.$type, deviceBindingChallengeResponse.$type) &&
				Objects.equals(this.challenge, deviceBindingChallengeResponse.challenge) &&
				Objects.equals(this.expiresAt, deviceBindingChallengeResponse.expiresAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, challenge, expiresAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingChallengeResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
		sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
