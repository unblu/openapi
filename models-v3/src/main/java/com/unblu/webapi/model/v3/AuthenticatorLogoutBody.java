
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorLogout&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorLogout' operation")

@JsonPropertyOrder({
	AuthenticatorLogoutBody.JSON_PROPERTY_REDIRECT_ON_SUCCESS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorLogoutBody {
	public static final String JSON_PROPERTY_REDIRECT_ON_SUCCESS = "redirectOnSuccess";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_SUCCESS)
	private String redirectOnSuccess;

	public AuthenticatorLogoutBody redirectOnSuccess(String redirectOnSuccess) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticatorLogoutBody authenticatorLogoutBody = (AuthenticatorLogoutBody) o;
		return Objects.equals(this.redirectOnSuccess, authenticatorLogoutBody.redirectOnSuccess);
	}

	@Override
	public int hashCode() {
		return Objects.hash(redirectOnSuccess);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorLogoutBody {\n");
		sb.append("    redirectOnSuccess: ").append(toIndentedString(redirectOnSuccess)).append("\n");
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
