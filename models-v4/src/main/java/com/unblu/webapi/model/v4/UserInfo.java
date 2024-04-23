
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * User information which are normally used together with webhook events.
 */
@ApiModel(description = "User information which are normally used together with webhook events.")

@JsonPropertyOrder({
	UserInfo.JSON_PROPERTY_$_TYPE,
	UserInfo.JSON_PROPERTY_USER_ID,
	UserInfo.JSON_PROPERTY_USER_NAME,
	UserInfo.JSON_PROPERTY_FIRST_NAME,
	UserInfo.JSON_PROPERTY_LAST_NAME,
	UserInfo.JSON_PROPERTY_DISPLAY_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UserInfo {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		USERINFO("UserInfo");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.USERINFO;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.USERINFO;

	public static final String JSON_PROPERTY_USER_ID = "userId";
	@JsonProperty(JSON_PROPERTY_USER_ID)
	private String userId;

	public static final String JSON_PROPERTY_USER_NAME = "userName";
	@JsonProperty(JSON_PROPERTY_USER_NAME)
	private String userName;

	public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
	@JsonProperty(JSON_PROPERTY_FIRST_NAME)
	private String firstName;

	public static final String JSON_PROPERTY_LAST_NAME = "lastName";
	@JsonProperty(JSON_PROPERTY_LAST_NAME)
	private String lastName;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public UserInfo $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public UserInfo userId(String userId) {
		this.userId = userId;
		return this;
	}

	/**
	 * The id of the user
	 * 
	 * @return userId
	 **/
	@ApiModelProperty(value = "The id of the user")
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserInfo userName(String userName) {
		this.userName = userName;
		return this;
	}

	/**
	 * The username of the user
	 * 
	 * @return userName
	 **/
	@ApiModelProperty(value = "The username of the user")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UserInfo firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * The first name of the user
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(value = "The first name of the user")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public UserInfo lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * The last name of the user
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(value = "The last name of the user")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public UserInfo displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * The display name of the user
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "The display name of the user")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UserInfo userInfo = (UserInfo) o;
		return Objects.equals(this.$type, userInfo.$type) &&
				Objects.equals(this.userId, userInfo.userId) &&
				Objects.equals(this.userName, userInfo.userName) &&
				Objects.equals(this.firstName, userInfo.firstName) &&
				Objects.equals(this.lastName, userInfo.lastName) &&
				Objects.equals(this.displayName, userInfo.displayName);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, userId, userName, firstName, lastName, displayName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserInfo {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
		sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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
