
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;usersSetPassword&#39; operation
 */
@ApiModel(description = "Request body for the 'usersSetPassword' operation")

@JsonPropertyOrder({
	UsersSetPasswordBody.JSON_PROPERTY_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UsersSetPasswordBody {
	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public UsersSetPasswordBody password(String password) {
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
		UsersSetPasswordBody usersSetPasswordBody = (UsersSetPasswordBody) o;
		return Objects.equals(this.password, usersSetPasswordBody.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UsersSetPasswordBody {\n");
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
