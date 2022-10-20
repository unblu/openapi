
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;usersUpdatePassword&#39; operation
 */
@ApiModel(description = "Request Body for the 'usersUpdatePassword' operation")

@JsonPropertyOrder({
	UsersUpdatePasswordBody.JSON_PROPERTY_USER_ID,
	UsersUpdatePasswordBody.JSON_PROPERTY_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UsersUpdatePasswordBody {
	public static final String JSON_PROPERTY_USER_ID = "userId";
	@JsonProperty(JSON_PROPERTY_USER_ID)
	private String userId;

	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public UsersUpdatePasswordBody userId(String userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * The ID of the user whose password should be updated
	 * 
	 * @return userId
	 **/
	@ApiModelProperty(value = "The ID of the user whose password should be updated")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UsersUpdatePasswordBody password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * The user&#39;s new password
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "The user's new password")
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
		UsersUpdatePasswordBody usersUpdatePasswordBody = (UsersUpdatePasswordBody) o;
		return Objects.equals(this.userId, usersUpdatePasswordBody.userId) &&
				Objects.equals(this.password, usersUpdatePasswordBody.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(userId, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UsersUpdatePasswordBody {\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
