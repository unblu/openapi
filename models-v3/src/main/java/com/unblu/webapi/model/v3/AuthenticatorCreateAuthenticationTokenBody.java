
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorCreateAuthenticationToken&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorCreateAuthenticationToken' operation")

@JsonPropertyOrder({
	AuthenticatorCreateAuthenticationTokenBody.JSON_PROPERTY_USERNAME,
	AuthenticatorCreateAuthenticationTokenBody.JSON_PROPERTY_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorCreateAuthenticationTokenBody {
	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public AuthenticatorCreateAuthenticationTokenBody username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * The username for which the token is created
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "The username for which the token is created")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AuthenticatorCreateAuthenticationTokenBody password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * The password of the user to authenticate
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "The password of the user to authenticate")
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
		AuthenticatorCreateAuthenticationTokenBody authenticatorCreateAuthenticationTokenBody = (AuthenticatorCreateAuthenticationTokenBody) o;
		return Objects.equals(this.username, authenticatorCreateAuthenticationTokenBody.username) &&
				Objects.equals(this.password, authenticatorCreateAuthenticationTokenBody.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorCreateAuthenticationTokenBody {\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
