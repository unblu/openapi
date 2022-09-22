
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorSwitchToAccount&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorSwitchToAccount' operation")

@JsonPropertyOrder({
	AuthenticatorSwitchToAccountBody.JSON_PROPERTY_ACCOUNT_ID,
	AuthenticatorSwitchToAccountBody.JSON_PROPERTY_REDIRECT_ON_SUCCESS,
	AuthenticatorSwitchToAccountBody.JSON_PROPERTY_REDIRECT_ON_FAILURE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorSwitchToAccountBody {
	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_REDIRECT_ON_SUCCESS = "redirectOnSuccess";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_SUCCESS)
	private String redirectOnSuccess;

	public static final String JSON_PROPERTY_REDIRECT_ON_FAILURE = "redirectOnFailure";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_FAILURE)
	private String redirectOnFailure;

	public AuthenticatorSwitchToAccountBody accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * the account id to impersonate on
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "the account id to impersonate on")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AuthenticatorSwitchToAccountBody redirectOnSuccess(String redirectOnSuccess) {
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

	public AuthenticatorSwitchToAccountBody redirectOnFailure(String redirectOnFailure) {
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
		AuthenticatorSwitchToAccountBody authenticatorSwitchToAccountBody = (AuthenticatorSwitchToAccountBody) o;
		return Objects.equals(this.accountId, authenticatorSwitchToAccountBody.accountId) &&
				Objects.equals(this.redirectOnSuccess, authenticatorSwitchToAccountBody.redirectOnSuccess) &&
				Objects.equals(this.redirectOnFailure, authenticatorSwitchToAccountBody.redirectOnFailure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId, redirectOnSuccess, redirectOnFailure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorSwitchToAccountBody {\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
