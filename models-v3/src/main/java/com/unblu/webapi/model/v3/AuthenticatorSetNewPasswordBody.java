
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorSetNewPassword&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorSetNewPassword' operation")

@JsonPropertyOrder({
	AuthenticatorSetNewPasswordBody.JSON_PROPERTY_AUTHENTICATION_TOKEN,
	AuthenticatorSetNewPasswordBody.JSON_PROPERTY_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorSetNewPasswordBody {
	public static final String JSON_PROPERTY_AUTHENTICATION_TOKEN = "authenticationToken";
	@JsonProperty(JSON_PROPERTY_AUTHENTICATION_TOKEN)
	private String authenticationToken;

	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public AuthenticatorSetNewPasswordBody authenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
		return this;
	}

	/**
	 * for authentication.
	 * 
	 * @return authenticationToken
	 **/
	@ApiModelProperty(value = "for authentication.")
	public String getAuthenticationToken() {
		return authenticationToken;
	}

	public void setAuthenticationToken(String authenticationToken) {
		this.authenticationToken = authenticationToken;
	}

	public AuthenticatorSetNewPasswordBody password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * the new password to be used
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "the new password to be used")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticatorSetNewPasswordBody authenticatorSetNewPasswordBody = (AuthenticatorSetNewPasswordBody) o;
		return Objects.equals(this.authenticationToken, authenticatorSetNewPasswordBody.authenticationToken) &&
				Objects.equals(this.password, authenticatorSetNewPasswordBody.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(authenticationToken, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorSetNewPasswordBody {\n");
		sb.append("    authenticationToken: ").append(toIndentedString(authenticationToken)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
