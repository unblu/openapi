
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;accountsEnableAccountIngress&#39; operation
 */
@ApiModel(description = "Request Body for the 'accountsEnableAccountIngress' operation")

@JsonPropertyOrder({
	AccountsEnableAccountIngressBody.JSON_PROPERTY_ACCOUNT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountsEnableAccountIngressBody {
	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public AccountsEnableAccountIngressBody accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountsEnableAccountIngressBody accountsEnableAccountIngressBody = (AccountsEnableAccountIngressBody) o;
		return Objects.equals(this.accountId, accountsEnableAccountIngressBody.accountId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountsEnableAccountIngressBody {\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
