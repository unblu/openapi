
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;authenticatorResetImpersonation&#39; operation
 */
@ApiModel(description = "Request body for the 'authenticatorResetImpersonation' operation")

@JsonPropertyOrder({
	AuthenticatorResetImpersonationBody.JSON_PROPERTY_REDIRECT_ON_SUCCESS,
	AuthenticatorResetImpersonationBody.JSON_PROPERTY_REDIRECT_ON_FAILURE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorResetImpersonationBody {
	public static final String JSON_PROPERTY_REDIRECT_ON_SUCCESS = "redirectOnSuccess";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_SUCCESS)
	private String redirectOnSuccess;

	public static final String JSON_PROPERTY_REDIRECT_ON_FAILURE = "redirectOnFailure";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_FAILURE)
	private String redirectOnFailure;

	public AuthenticatorResetImpersonationBody redirectOnSuccess(String redirectOnSuccess) {
		this.redirectOnSuccess = redirectOnSuccess;
		return this;
	}

	/**
	 * redirection URL when the operation is successful. Also if nothing needed to be done.
	 * 
	 * @return redirectOnSuccess
	 **/
	@ApiModelProperty(value = "redirection URL when the operation is successful. Also if nothing needed to be done.")
	public String getRedirectOnSuccess() {
		return redirectOnSuccess;
	}

	public void setRedirectOnSuccess(String redirectOnSuccess) {
		this.redirectOnSuccess = redirectOnSuccess;
	}

	public AuthenticatorResetImpersonationBody redirectOnFailure(String redirectOnFailure) {
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
		AuthenticatorResetImpersonationBody authenticatorResetImpersonationBody = (AuthenticatorResetImpersonationBody) o;
		return Objects.equals(this.redirectOnSuccess, authenticatorResetImpersonationBody.redirectOnSuccess) &&
				Objects.equals(this.redirectOnFailure, authenticatorResetImpersonationBody.redirectOnFailure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(redirectOnSuccess, redirectOnFailure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorResetImpersonationBody {\n");
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
