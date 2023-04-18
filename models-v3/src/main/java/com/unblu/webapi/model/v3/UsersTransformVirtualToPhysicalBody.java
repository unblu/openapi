
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;usersTransformVirtualToPhysical&#39; operation
 */
@ApiModel(description = "Request Body for the 'usersTransformVirtualToPhysical' operation")

@JsonPropertyOrder({
	UsersTransformVirtualToPhysicalBody.JSON_PROPERTY_USERNAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UsersTransformVirtualToPhysicalBody {
	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public UsersTransformVirtualToPhysicalBody username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * The username of the User entity that should be converted to a physical user
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "The username of the User entity that should be converted to a physical user")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UsersTransformVirtualToPhysicalBody usersTransformVirtualToPhysicalBody = (UsersTransformVirtualToPhysicalBody) o;
		return Objects.equals(this.username, usersTransformVirtualToPhysicalBody.username);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UsersTransformVirtualToPhysicalBody {\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
