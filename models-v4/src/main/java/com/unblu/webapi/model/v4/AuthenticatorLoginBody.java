
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;authenticatorLogin&#39; operation
 */
@ApiModel(description = "Request body for the 'authenticatorLogin' operation")

@JsonPropertyOrder({
	AuthenticatorLoginBody.JSON_PROPERTY_USERNAME,
	AuthenticatorLoginBody.JSON_PROPERTY_PASSWORD,
	AuthenticatorLoginBody.JSON_PROPERTY_REDIRECT_ON_SUCCESS,
	AuthenticatorLoginBody.JSON_PROPERTY_REDIRECT_ON_FAILURE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorLoginBody {
	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public static final String JSON_PROPERTY_REDIRECT_ON_SUCCESS = "redirectOnSuccess";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_SUCCESS)
	private String redirectOnSuccess;

	public static final String JSON_PROPERTY_REDIRECT_ON_FAILURE = "redirectOnFailure";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_FAILURE)
	private String redirectOnFailure;

	public AuthenticatorLoginBody username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * user to use for login
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "user to use for login")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AuthenticatorLoginBody password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * password to use for login
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "password to use for login")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public AuthenticatorLoginBody redirectOnSuccess(String redirectOnSuccess) {
		this.redirectOnSuccess = redirectOnSuccess;
		return this;
	}

	/**
	 * redirection URL when the operation is successful
	 * 
	 * @return redirectOnSuccess
	 **/
	@ApiModelProperty(value = "redirection URL when the operation is successful")
	public String getRedirectOnSuccess() {
		return redirectOnSuccess;
	}

	public void setRedirectOnSuccess(String redirectOnSuccess) {
		this.redirectOnSuccess = redirectOnSuccess;
	}

	public AuthenticatorLoginBody redirectOnFailure(String redirectOnFailure) {
		this.redirectOnFailure = redirectOnFailure;
		return this;
	}

	/**
	 * redirection URL when the operation is not successful
	 * 
	 * @return redirectOnFailure
	 **/
	@ApiModelProperty(value = "redirection URL when the operation is not successful")
	public String getRedirectOnFailure() {
		return redirectOnFailure;
	}

	public void setRedirectOnFailure(String redirectOnFailure) {
		this.redirectOnFailure = redirectOnFailure;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticatorLoginBody authenticatorLoginBody = (AuthenticatorLoginBody) o;
		return Objects.equals(this.username, authenticatorLoginBody.username) &&
				Objects.equals(this.password, authenticatorLoginBody.password) &&
				Objects.equals(this.redirectOnSuccess, authenticatorLoginBody.redirectOnSuccess) &&
				Objects.equals(this.redirectOnFailure, authenticatorLoginBody.redirectOnFailure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password, redirectOnSuccess, redirectOnFailure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorLoginBody {\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("    redirectOnSuccess: ").append(toIndentedString(redirectOnSuccess)).append("\n");
		sb.append("    redirectOnFailure: ").append(toIndentedString(redirectOnFailure)).append("\n");
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
