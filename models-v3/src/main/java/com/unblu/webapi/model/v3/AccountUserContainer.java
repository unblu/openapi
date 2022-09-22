
package com.unblu.webapi.model.v3;

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
 * This container object will aggregate an account and an admin user.
 */
@ApiModel(description = "This container object will aggregate an account and an admin user.")

@JsonPropertyOrder({
	AccountUserContainer.JSON_PROPERTY_$_TYPE,
	AccountUserContainer.JSON_PROPERTY_ACCOUNT,
	AccountUserContainer.JSON_PROPERTY_ADMIN_USER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountUserContainer {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTUSERCONTAINER("AccountUserContainer");

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
			return TypeEnum.ACCOUNTUSERCONTAINER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTUSERCONTAINER;

	public static final String JSON_PROPERTY_ACCOUNT = "account";
	@JsonProperty(JSON_PROPERTY_ACCOUNT)
	private Account account = null;

	public static final String JSON_PROPERTY_ADMIN_USER = "adminUser";
	@JsonProperty(JSON_PROPERTY_ADMIN_USER)
	private User adminUser = null;

	public AccountUserContainer $type(TypeEnum $type) {
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

	public AccountUserContainer account(Account account) {
		this.account = account;
		return this;
	}

	/**
	 * Get account
	 * 
	 * @return account
	 **/
	@ApiModelProperty(value = "")
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public AccountUserContainer adminUser(User adminUser) {
		this.adminUser = adminUser;
		return this;
	}

	/**
	 * Get adminUser
	 * 
	 * @return adminUser
	 **/
	@ApiModelProperty(value = "")
	public User getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(User adminUser) {
		this.adminUser = adminUser;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountUserContainer accountUserContainer = (AccountUserContainer) o;
		return Objects.equals(this.$type, accountUserContainer.$type) &&
				Objects.equals(this.account, accountUserContainer.account) &&
				Objects.equals(this.adminUser, accountUserContainer.adminUser);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, account, adminUser);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountUserContainer {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    account: ").append(toIndentedString(account)).append("\n");
		sb.append("    adminUser: ").append(toIndentedString(adminUser)).append("\n");
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
