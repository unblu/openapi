
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
 * A container for a user and it&#39;s password. This is needed because the user object should not always contain the user password. This container is normally
 * used, when creating a new password for a user.
 */
@ApiModel(description = "A container for a user and it's password. This is needed because the user object should not always contain the user password. This container is normally used, when creating a new password for a user.")

@JsonPropertyOrder({
	UserPasswordContainer.JSON_PROPERTY_$_TYPE,
	UserPasswordContainer.JSON_PROPERTY_USER,
	UserPasswordContainer.JSON_PROPERTY_PASSWORD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class UserPasswordContainer {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		USERPASSWORDCONTAINER("UserPasswordContainer");

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
			return TypeEnum.USERPASSWORDCONTAINER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.USERPASSWORDCONTAINER;

	public static final String JSON_PROPERTY_USER = "user";
	@JsonProperty(JSON_PROPERTY_USER)
	private User user = null;

	public static final String JSON_PROPERTY_PASSWORD = "password";
	@JsonProperty(JSON_PROPERTY_PASSWORD)
	private String password;

	public UserPasswordContainer $type(TypeEnum $type) {
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

	public UserPasswordContainer user(User user) {
		this.user = user;
		return this;
	}

	/**
	 * Get user
	 * 
	 * @return user
	 **/
	@ApiModelProperty(value = "")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserPasswordContainer password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * The user&#39;s password. &lt;p&gt; NOTE: this can only be used to set a password. The server will always return null.
	 * 
	 * @return password
	 **/
	@ApiModelProperty(value = "The user's password. <p> NOTE: this can only be used to set a password. The server will always return null.")
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
		UserPasswordContainer userPasswordContainer = (UserPasswordContainer) o;
		return Objects.equals(this.$type, userPasswordContainer.$type) &&
				Objects.equals(this.user, userPasswordContainer.user) &&
				Objects.equals(this.password, userPasswordContainer.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, user, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UserPasswordContainer {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
