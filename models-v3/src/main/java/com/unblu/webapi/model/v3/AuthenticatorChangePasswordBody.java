
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorChangePassword&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorChangePassword' operation")

@JsonPropertyOrder({
	AuthenticatorChangePasswordBody.JSON_PROPERTY_OLD_PASSWORD,
	AuthenticatorChangePasswordBody.JSON_PROPERTY_NEW_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorChangePasswordBody {
	public static final String JSON_PROPERTY_OLD_PASSWORD = "oldPassword";
	@JsonProperty(JSON_PROPERTY_OLD_PASSWORD)
	private String oldPassword;

	public static final String JSON_PROPERTY_NEW_PASSWORD = "newPassword";
	@JsonProperty(JSON_PROPERTY_NEW_PASSWORD)
	private String newPassword;

	public AuthenticatorChangePasswordBody oldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
		return this;
	}

	/**
	 * The old password for validation
	 * 
	 * @return oldPassword
	 **/
	@ApiModelProperty(value = "The old password for validation")
	public String getOldPassword() {
		return oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	public AuthenticatorChangePasswordBody newPassword(String newPassword) {
		this.newPassword = newPassword;
		return this;
	}

	/**
	 * The new password to set
	 * 
	 * @return newPassword
	 **/
	@ApiModelProperty(value = "The new password to set")
	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticatorChangePasswordBody authenticatorChangePasswordBody = (AuthenticatorChangePasswordBody) o;
		return Objects.equals(this.oldPassword, authenticatorChangePasswordBody.oldPassword) &&
				Objects.equals(this.newPassword, authenticatorChangePasswordBody.newPassword);
	}

	@Override
	public int hashCode() {
		return Objects.hash(oldPassword, newPassword);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorChangePasswordBody {\n");
		sb.append("    oldPassword: ").append(toIndentedString(oldPassword)).append("\n");
		sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
