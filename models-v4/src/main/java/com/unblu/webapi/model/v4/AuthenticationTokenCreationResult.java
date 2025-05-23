
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * AuthenticationTokenCreationResult
 */

@JsonPropertyOrder({
	AuthenticationTokenCreationResult.JSON_PROPERTY_$_TYPE,
	AuthenticationTokenCreationResult.JSON_PROPERTY_TOKEN,
	AuthenticationTokenCreationResult.JSON_PROPERTY_DEVICE_IDENTIFIER,
	AuthenticationTokenCreationResult.JSON_PROPERTY_COOKIE_PREFIX,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticationTokenCreationResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AUTHENTICATIONTOKENCREATIONRESULT("AuthenticationTokenCreationResult");

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
			return TypeEnum.AUTHENTICATIONTOKENCREATIONRESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AUTHENTICATIONTOKENCREATIONRESULT;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_DEVICE_IDENTIFIER = "deviceIdentifier";
	@JsonProperty(JSON_PROPERTY_DEVICE_IDENTIFIER)
	private String deviceIdentifier;

	public static final String JSON_PROPERTY_COOKIE_PREFIX = "cookiePrefix";
	@JsonProperty(JSON_PROPERTY_COOKIE_PREFIX)
	private String cookiePrefix;

	public AuthenticationTokenCreationResult $type(TypeEnum $type) {
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

	public AuthenticationTokenCreationResult token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Get token
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public AuthenticationTokenCreationResult deviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
		return this;
	}

	/**
	 * Get deviceIdentifier
	 * 
	 * @return deviceIdentifier
	 **/
	@ApiModelProperty(value = "")
	public String getDeviceIdentifier() {
		return deviceIdentifier;
	}

	public void setDeviceIdentifier(String deviceIdentifier) {
		this.deviceIdentifier = deviceIdentifier;
	}

	public AuthenticationTokenCreationResult cookiePrefix(String cookiePrefix) {
		this.cookiePrefix = cookiePrefix;
		return this;
	}

	/**
	 * Get cookiePrefix
	 * 
	 * @return cookiePrefix
	 **/
	@ApiModelProperty(value = "")
	public String getCookiePrefix() {
		return cookiePrefix;
	}

	public void setCookiePrefix(String cookiePrefix) {
		this.cookiePrefix = cookiePrefix;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticationTokenCreationResult authenticationTokenCreationResult = (AuthenticationTokenCreationResult) o;
		return Objects.equals(this.$type, authenticationTokenCreationResult.$type) &&
				Objects.equals(this.token, authenticationTokenCreationResult.token) &&
				Objects.equals(this.deviceIdentifier, authenticationTokenCreationResult.deviceIdentifier) &&
				Objects.equals(this.cookiePrefix, authenticationTokenCreationResult.cookiePrefix);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, token, deviceIdentifier, cookiePrefix);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticationTokenCreationResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    deviceIdentifier: ").append(toIndentedString(deviceIdentifier)).append("\n");
		sb.append("    cookiePrefix: ").append(toIndentedString(cookiePrefix)).append("\n");
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
