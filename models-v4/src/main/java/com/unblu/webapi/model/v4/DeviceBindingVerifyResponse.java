
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
 * Result of a device-binding verification.
 */
@ApiModel(description = "Result of a device-binding verification.")

@JsonPropertyOrder({
	DeviceBindingVerifyResponse.JSON_PROPERTY_$_TYPE,
	DeviceBindingVerifyResponse.JSON_PROPERTY_VERIFIED,
	DeviceBindingVerifyResponse.JSON_PROPERTY_VERIFIED_AT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingVerifyResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGVERIFYRESPONSE("DeviceBindingVerifyResponse");

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
			return TypeEnum.DEVICEBINDINGVERIFYRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGVERIFYRESPONSE;

	public static final String JSON_PROPERTY_VERIFIED = "verified";
	@JsonProperty(JSON_PROPERTY_VERIFIED)
	private Boolean verified;

	public static final String JSON_PROPERTY_VERIFIED_AT = "verifiedAt";
	@JsonProperty(JSON_PROPERTY_VERIFIED_AT)
	private Long verifiedAt;

	public DeviceBindingVerifyResponse $type(TypeEnum $type) {
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

	public DeviceBindingVerifyResponse verified(Boolean verified) {
		this.verified = verified;
		return this;
	}

	/**
	 * Whether the signature was accepted and the device verified.
	 * 
	 * @return verified
	 **/
	@ApiModelProperty(value = "Whether the signature was accepted and the device verified.")
	public Boolean isVerified() {
		return verified;
	}

	public void setVerified(Boolean verified) {
		this.verified = verified;
	}

	public DeviceBindingVerifyResponse verifiedAt(Long verifiedAt) {
		this.verifiedAt = verifiedAt;
		return this;
	}

	/**
	 * Epoch-millis timestamp of the verification, or &#x60;null&#x60; if not verified.
	 * 
	 * @return verifiedAt
	 **/
	@ApiModelProperty(value = "Epoch-millis timestamp of the verification, or `null` if not verified.")
	public Long getVerifiedAt() {
		return verifiedAt;
	}

	public void setVerifiedAt(Long verifiedAt) {
		this.verifiedAt = verifiedAt;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeviceBindingVerifyResponse deviceBindingVerifyResponse = (DeviceBindingVerifyResponse) o;
		return Objects.equals(this.$type, deviceBindingVerifyResponse.$type) &&
				Objects.equals(this.verified, deviceBindingVerifyResponse.verified) &&
				Objects.equals(this.verifiedAt, deviceBindingVerifyResponse.verifiedAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, verified, verifiedAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingVerifyResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
		sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
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
