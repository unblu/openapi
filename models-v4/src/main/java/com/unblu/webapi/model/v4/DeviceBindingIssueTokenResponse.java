
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
 * Response containing the freshly minted single-use device-binding registration token and its QR representation.
 */
@ApiModel(description = "Response containing the freshly minted single-use device-binding registration token and its QR representation.")

@JsonPropertyOrder({
	DeviceBindingIssueTokenResponse.JSON_PROPERTY_$_TYPE,
	DeviceBindingIssueTokenResponse.JSON_PROPERTY_TOKEN,
	DeviceBindingIssueTokenResponse.JSON_PROPERTY_QR_URI,
	DeviceBindingIssueTokenResponse.JSON_PROPERTY_QR_IMAGE,
	DeviceBindingIssueTokenResponse.JSON_PROPERTY_EXPIRES_AT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeviceBindingIssueTokenResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEVICEBINDINGISSUETOKENRESPONSE("DeviceBindingIssueTokenResponse");

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
			return TypeEnum.DEVICEBINDINGISSUETOKENRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEVICEBINDINGISSUETOKENRESPONSE;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_QR_URI = "qrUri";
	@JsonProperty(JSON_PROPERTY_QR_URI)
	private String qrUri;

	public static final String JSON_PROPERTY_QR_IMAGE = "qrImage";
	@JsonProperty(JSON_PROPERTY_QR_IMAGE)
	private String qrImage;

	public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
	@JsonProperty(JSON_PROPERTY_EXPIRES_AT)
	private Long expiresAt;

	public DeviceBindingIssueTokenResponse $type(TypeEnum $type) {
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

	public DeviceBindingIssueTokenResponse token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Single-use bearer token used to enrol a device for the issuing user.
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "Single-use bearer token used to enrol a device for the issuing user.")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public DeviceBindingIssueTokenResponse qrUri(String qrUri) {
		this.qrUri = qrUri;
		return this;
	}

	/**
	 * The &#x60;unblu-bind://&#x60; URI encoding the token, for rendering as an enrolment QR code.
	 * 
	 * @return qrUri
	 **/
	@ApiModelProperty(value = "The `unblu-bind://` URI encoding the token, for rendering as an enrolment QR code.")
	public String getQrUri() {
		return qrUri;
	}

	public void setQrUri(String qrUri) {
		this.qrUri = qrUri;
	}

	public DeviceBindingIssueTokenResponse qrImage(String qrImage) {
		this.qrImage = qrImage;
		return this;
	}

	/**
	 * The &#x60;qrUri&#x60; rendered as a QR code, as a base64 PNG data URI (&#x60;data:image/png;base64,...&#x60;), ready to show in an &#x60;&lt;img&gt;&#x60;.
	 * 
	 * @return qrImage
	 **/
	@ApiModelProperty(value = "The `qrUri` rendered as a QR code, as a base64 PNG data URI (`data:image/png;base64,...`), ready to show in an `<img>`.")
	public String getQrImage() {
		return qrImage;
	}

	public void setQrImage(String qrImage) {
		this.qrImage = qrImage;
	}

	public DeviceBindingIssueTokenResponse expiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
		return this;
	}

	/**
	 * Epoch-millis timestamp after which the registration token expires.
	 * 
	 * @return expiresAt
	 **/
	@ApiModelProperty(value = "Epoch-millis timestamp after which the registration token expires.")
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
		DeviceBindingIssueTokenResponse deviceBindingIssueTokenResponse = (DeviceBindingIssueTokenResponse) o;
		return Objects.equals(this.$type, deviceBindingIssueTokenResponse.$type) &&
				Objects.equals(this.token, deviceBindingIssueTokenResponse.token) &&
				Objects.equals(this.qrUri, deviceBindingIssueTokenResponse.qrUri) &&
				Objects.equals(this.qrImage, deviceBindingIssueTokenResponse.qrImage) &&
				Objects.equals(this.expiresAt, deviceBindingIssueTokenResponse.expiresAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, token, qrUri, qrImage, expiresAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeviceBindingIssueTokenResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    qrUri: ").append(toIndentedString(qrUri)).append("\n");
		sb.append("    qrImage: ").append(toIndentedString(qrImage)).append("\n");
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
