
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;authenticatorImpersonate&#39; operation
 */
@ApiModel(description = "Request body for the 'authenticatorImpersonate' operation")

@JsonPropertyOrder({
	AuthenticatorImpersonateBody.JSON_PROPERTY_USERNAME,
	AuthenticatorImpersonateBody.JSON_PROPERTY_USER_ID,
	AuthenticatorImpersonateBody.JSON_PROPERTY_KEEP_ROLE,
	AuthenticatorImpersonateBody.JSON_PROPERTY_REDIRECT_ON_SUCCESS,
	AuthenticatorImpersonateBody.JSON_PROPERTY_REDIRECT_ON_FAILURE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorImpersonateBody {
	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_USER_ID = "userId";
	@JsonProperty(JSON_PROPERTY_USER_ID)
	private String userId;

	public static final String JSON_PROPERTY_KEEP_ROLE = "keepRole";
	@JsonProperty(JSON_PROPERTY_KEEP_ROLE)
	private Boolean keepRole;

	public static final String JSON_PROPERTY_REDIRECT_ON_SUCCESS = "redirectOnSuccess";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_SUCCESS)
	private String redirectOnSuccess;

	public static final String JSON_PROPERTY_REDIRECT_ON_FAILURE = "redirectOnFailure";
	@JsonProperty(JSON_PROPERTY_REDIRECT_ON_FAILURE)
	private String redirectOnFailure;

	public AuthenticatorImpersonateBody username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * If set and userid is set to null, the user is searched by the name
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "If set and userid is set to null, the user is searched by the name")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public AuthenticatorImpersonateBody userId(String userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * If set, the username is ignored and the user for the given id is impersonated
	 * 
	 * @return userId
	 **/
	@ApiModelProperty(value = "If set, the username is ignored and the user for the given id is impersonated")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public AuthenticatorImpersonateBody keepRole(Boolean keepRole) {
		this.keepRole = keepRole;
		return this;
	}

	/**
	 * If true, the impersonated user keeps the SUPER_ADMIN role even if they don&#39;t normally have it.
	 * 
	 * @return keepRole
	 **/
	@ApiModelProperty(value = "If true, the impersonated user keeps the SUPER_ADMIN role even if they don't normally have it.")
	public Boolean isKeepRole() {
		return keepRole;
	}

	public void setKeepRole(Boolean keepRole) {
		this.keepRole = keepRole;
	}

	public AuthenticatorImpersonateBody redirectOnSuccess(String redirectOnSuccess) {
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

	public AuthenticatorImpersonateBody redirectOnFailure(String redirectOnFailure) {
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
		AuthenticatorImpersonateBody authenticatorImpersonateBody = (AuthenticatorImpersonateBody) o;
		return Objects.equals(this.username, authenticatorImpersonateBody.username) &&
				Objects.equals(this.userId, authenticatorImpersonateBody.userId) &&
				Objects.equals(this.keepRole, authenticatorImpersonateBody.keepRole) &&
				Objects.equals(this.redirectOnSuccess, authenticatorImpersonateBody.redirectOnSuccess) &&
				Objects.equals(this.redirectOnFailure, authenticatorImpersonateBody.redirectOnFailure);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, userId, keepRole, redirectOnSuccess, redirectOnFailure);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorImpersonateBody {\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    keepRole: ").append(toIndentedString(keepRole)).append("\n");
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
