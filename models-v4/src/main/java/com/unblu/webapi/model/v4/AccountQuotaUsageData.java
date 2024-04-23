
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
 * Quota information for API keys, domains, teams, and users
 */
@ApiModel(description = "Quota information for API keys, domains, teams, and users")

@JsonPropertyOrder({
	AccountQuotaUsageData.JSON_PROPERTY_$_TYPE,
	AccountQuotaUsageData.JSON_PROPERTY_API_KEYS,
	AccountQuotaUsageData.JSON_PROPERTY_DOMAINS,
	AccountQuotaUsageData.JSON_PROPERTY_TEAMS,
	AccountQuotaUsageData.JSON_PROPERTY_USERS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountQuotaUsageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTQUOTAUSAGEDATA("AccountQuotaUsageData");

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
			return TypeEnum.ACCOUNTQUOTAUSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTQUOTAUSAGEDATA;

	public static final String JSON_PROPERTY_API_KEYS = "apiKeys";
	@JsonProperty(JSON_PROPERTY_API_KEYS)
	private QuotaUsageData apiKeys = null;

	public static final String JSON_PROPERTY_DOMAINS = "domains";
	@JsonProperty(JSON_PROPERTY_DOMAINS)
	private QuotaUsageData domains = null;

	public static final String JSON_PROPERTY_TEAMS = "teams";
	@JsonProperty(JSON_PROPERTY_TEAMS)
	private QuotaUsageData teams = null;

	public static final String JSON_PROPERTY_USERS = "users";
	@JsonProperty(JSON_PROPERTY_USERS)
	private QuotaUsageData users = null;

	public AccountQuotaUsageData $type(TypeEnum $type) {
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

	public AccountQuotaUsageData apiKeys(QuotaUsageData apiKeys) {
		this.apiKeys = apiKeys;
		return this;
	}

	/**
	 * Get apiKeys
	 * 
	 * @return apiKeys
	 **/
	@ApiModelProperty(value = "")
	public QuotaUsageData getApiKeys() {
		return apiKeys;
	}

	public void setApiKeys(QuotaUsageData apiKeys) {
		this.apiKeys = apiKeys;
	}

	public AccountQuotaUsageData domains(QuotaUsageData domains) {
		this.domains = domains;
		return this;
	}

	/**
	 * Get domains
	 * 
	 * @return domains
	 **/
	@ApiModelProperty(value = "")
	public QuotaUsageData getDomains() {
		return domains;
	}

	public void setDomains(QuotaUsageData domains) {
		this.domains = domains;
	}

	public AccountQuotaUsageData teams(QuotaUsageData teams) {
		this.teams = teams;
		return this;
	}

	/**
	 * Get teams
	 * 
	 * @return teams
	 **/
	@ApiModelProperty(value = "")
	public QuotaUsageData getTeams() {
		return teams;
	}

	public void setTeams(QuotaUsageData teams) {
		this.teams = teams;
	}

	public AccountQuotaUsageData users(QuotaUsageData users) {
		this.users = users;
		return this;
	}

	/**
	 * Get users
	 * 
	 * @return users
	 **/
	@ApiModelProperty(value = "")
	public QuotaUsageData getUsers() {
		return users;
	}

	public void setUsers(QuotaUsageData users) {
		this.users = users;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountQuotaUsageData accountQuotaUsageData = (AccountQuotaUsageData) o;
		return Objects.equals(this.$type, accountQuotaUsageData.$type) &&
				Objects.equals(this.apiKeys, accountQuotaUsageData.apiKeys) &&
				Objects.equals(this.domains, accountQuotaUsageData.domains) &&
				Objects.equals(this.teams, accountQuotaUsageData.teams) &&
				Objects.equals(this.users, accountQuotaUsageData.users);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, apiKeys, domains, teams, users);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountQuotaUsageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    apiKeys: ").append(toIndentedString(apiKeys)).append("\n");
		sb.append("    domains: ").append(toIndentedString(domains)).append("\n");
		sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
		sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
