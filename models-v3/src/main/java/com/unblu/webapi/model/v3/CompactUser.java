
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
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
 * A user class, which holds the most important information, which are needed on the client side. It sums up the information from the user instance with some
 * other data like team information for easier access of a user
 */
@ApiModel(description = "A user class, which holds the most important information, which are needed on the client side. It sums up the information from the user instance with some other data like team information for easier access of a user")

@JsonPropertyOrder({
	CompactUser.JSON_PROPERTY_$_TYPE,
	CompactUser.JSON_PROPERTY_ID,
	CompactUser.JSON_PROPERTY_ACCOUNT_ID,
	CompactUser.JSON_PROPERTY_USERNAME,
	CompactUser.JSON_PROPERTY_DISPLAY_NAME,
	CompactUser.JSON_PROPERTY_FIRST_NAME,
	CompactUser.JSON_PROPERTY_LAST_NAME,
	CompactUser.JSON_PROPERTY_AVATAR,
	CompactUser.JSON_PROPERTY_TEAM_ID,
	CompactUser.JSON_PROPERTY_PARENT_TEAM_IDS,
	CompactUser.JSON_PROPERTY_PERMISSIONS,
	CompactUser.JSON_PROPERTY_AUTHORIZATION_ROLE,
	CompactUser.JSON_PROPERTY_PASSWORD_DEFINED,
	CompactUser.JSON_PROPERTY_VIRTUAL,
	CompactUser.JSON_PROPERTY_PROPAGATED,
	CompactUser.JSON_PROPERTY_IMPERSONATED_FROM_USER_ID,
	CompactUser.JSON_PROPERTY_IMPERSONATED_FROM_ACCOUNT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CompactUser {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COMPACTUSER("CompactUser");

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
			return TypeEnum.COMPACTUSER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COMPACTUSER;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
	@JsonProperty(JSON_PROPERTY_FIRST_NAME)
	private String firstName;

	public static final String JSON_PROPERTY_LAST_NAME = "lastName";
	@JsonProperty(JSON_PROPERTY_LAST_NAME)
	private String lastName;

	public static final String JSON_PROPERTY_AVATAR = "avatar";
	@JsonProperty(JSON_PROPERTY_AVATAR)
	private ExpandableField<Avatar> avatar = null;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_PARENT_TEAM_IDS = "parentTeamIds";
	@JsonProperty(JSON_PROPERTY_PARENT_TEAM_IDS)
	private List<String> parentTeamIds = null;

	public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
	@JsonProperty(JSON_PROPERTY_PERMISSIONS)
	private Permissions permissions = null;

	public static final String JSON_PROPERTY_AUTHORIZATION_ROLE = "authorizationRole";
	@JsonProperty(JSON_PROPERTY_AUTHORIZATION_ROLE)
	private EAuthorizationRole authorizationRole;

	public static final String JSON_PROPERTY_PASSWORD_DEFINED = "passwordDefined";
	@JsonProperty(JSON_PROPERTY_PASSWORD_DEFINED)
	private Boolean passwordDefined;

	public static final String JSON_PROPERTY_VIRTUAL = "virtual";
	@JsonProperty(JSON_PROPERTY_VIRTUAL)
	private Boolean virtual;

	public static final String JSON_PROPERTY_PROPAGATED = "propagated";
	@JsonProperty(JSON_PROPERTY_PROPAGATED)
	private Boolean propagated;

	public static final String JSON_PROPERTY_IMPERSONATED_FROM_USER_ID = "impersonatedFromUserId";
	@JsonProperty(JSON_PROPERTY_IMPERSONATED_FROM_USER_ID)
	private String impersonatedFromUserId;

	public static final String JSON_PROPERTY_IMPERSONATED_FROM_ACCOUNT_ID = "impersonatedFromAccountId";
	@JsonProperty(JSON_PROPERTY_IMPERSONATED_FROM_ACCOUNT_ID)
	private String impersonatedFromAccountId;

	public CompactUser $type(TypeEnum $type) {
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

	public CompactUser id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Id of the user
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Id of the user")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CompactUser accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id of the user
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id of the user")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public CompactUser username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * username for login
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "username for login")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public CompactUser displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Displayed name of the user
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "Displayed name of the user")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public CompactUser firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * First name of the user
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(value = "First name of the user")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public CompactUser lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Last name of the user
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(value = "Last name of the user")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public CompactUser avatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * Avatar of the user: id that can be expanded.
	 * 
	 * @return avatar
	 **/
	@ApiModelProperty(value = "Avatar of the user: id that can be expanded.")
	public ExpandableField<Avatar> getAvatar() {
		return avatar;
	}

	public void setAvatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
	}

	public CompactUser teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * id of the team the user belongs to
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "id of the team the user belongs to")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public CompactUser parentTeamIds(List<String> parentTeamIds) {
		this.parentTeamIds = parentTeamIds;
		return this;
	}

	public CompactUser addParentTeamIdsItem(String parentTeamIdsItem) {
		if (this.parentTeamIds == null) {
			this.parentTeamIds = new ArrayList<>();
		}
		this.parentTeamIds.add(parentTeamIdsItem);
		return this;
	}

	/**
	 * Ids of the parent teams. That are recursively the parent team of each parent team
	 * 
	 * @return parentTeamIds
	 **/
	@ApiModelProperty(value = "Ids of the parent teams. That are recursively the parent team of each parent team")
	public List<String> getParentTeamIds() {
		return parentTeamIds;
	}

	public void setParentTeamIds(List<String> parentTeamIds) {
		this.parentTeamIds = parentTeamIds;
	}

	public CompactUser permissions(Permissions permissions) {
		this.permissions = permissions;
		return this;
	}

	/**
	 * Get permissions
	 * 
	 * @return permissions
	 **/
	@ApiModelProperty(value = "")
	public Permissions getPermissions() {
		return permissions;
	}

	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}

	public CompactUser authorizationRole(EAuthorizationRole authorizationRole) {
		this.authorizationRole = authorizationRole;
		return this;
	}

	/**
	 * Get authorizationRole
	 * 
	 * @return authorizationRole
	 **/
	@ApiModelProperty(value = "")
	public EAuthorizationRole getAuthorizationRole() {
		return authorizationRole;
	}

	public void setAuthorizationRole(EAuthorizationRole authorizationRole) {
		this.authorizationRole = authorizationRole;
	}

	public CompactUser passwordDefined(Boolean passwordDefined) {
		this.passwordDefined = passwordDefined;
		return this;
	}

	/**
	 * True if the user has a password defined
	 * 
	 * @return passwordDefined
	 **/
	@ApiModelProperty(value = "True if the user has a password defined")
	public Boolean isPasswordDefined() {
		return passwordDefined;
	}

	public void setPasswordDefined(Boolean passwordDefined) {
		this.passwordDefined = passwordDefined;
	}

	public CompactUser virtual(Boolean virtual) {
		this.virtual = virtual;
		return this;
	}

	/**
	 * True if the user is virtual
	 * 
	 * @return virtual
	 **/
	@ApiModelProperty(value = "True if the user is virtual")
	public Boolean isVirtual() {
		return virtual;
	}

	public void setVirtual(Boolean virtual) {
		this.virtual = virtual;
	}

	public CompactUser propagated(Boolean propagated) {
		this.propagated = propagated;
		return this;
	}

	/**
	 * True if the user is propagated (did not log in locally but identity was propagateds);
	 * 
	 * @return propagated
	 **/
	@ApiModelProperty(value = "True if the user is propagated (did not log in locally but identity was propagateds);")
	public Boolean isPropagated() {
		return propagated;
	}

	public void setPropagated(Boolean propagated) {
		this.propagated = propagated;
	}

	public CompactUser impersonatedFromUserId(String impersonatedFromUserId) {
		this.impersonatedFromUserId = impersonatedFromUserId;
		return this;
	}

	/**
	 * id of the user from which the impersonation was initiated. Null if no impersonation is used.
	 * 
	 * @return impersonatedFromUserId
	 **/
	@ApiModelProperty(value = "id of the user from which the impersonation was initiated. Null if no impersonation is used.")
	public String getImpersonatedFromUserId() {
		return impersonatedFromUserId;
	}

	public void setImpersonatedFromUserId(String impersonatedFromUserId) {
		this.impersonatedFromUserId = impersonatedFromUserId;
	}

	public CompactUser impersonatedFromAccountId(String impersonatedFromAccountId) {
		this.impersonatedFromAccountId = impersonatedFromAccountId;
		return this;
	}

	/**
	 * id of the account from which the impersonation was initiated. Null if no impersonation is used.
	 * 
	 * @return impersonatedFromAccountId
	 **/
	@ApiModelProperty(value = "id of the account from which the impersonation was initiated. Null if no impersonation is used.")
	public String getImpersonatedFromAccountId() {
		return impersonatedFromAccountId;
	}

	public void setImpersonatedFromAccountId(String impersonatedFromAccountId) {
		this.impersonatedFromAccountId = impersonatedFromAccountId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CompactUser compactUser = (CompactUser) o;
		return Objects.equals(this.$type, compactUser.$type) &&
				Objects.equals(this.id, compactUser.id) &&
				Objects.equals(this.accountId, compactUser.accountId) &&
				Objects.equals(this.username, compactUser.username) &&
				Objects.equals(this.displayName, compactUser.displayName) &&
				Objects.equals(this.firstName, compactUser.firstName) &&
				Objects.equals(this.lastName, compactUser.lastName) &&
				Objects.equals(this.avatar, compactUser.avatar) &&
				Objects.equals(this.teamId, compactUser.teamId) &&
				Objects.equals(this.parentTeamIds, compactUser.parentTeamIds) &&
				Objects.equals(this.permissions, compactUser.permissions) &&
				Objects.equals(this.authorizationRole, compactUser.authorizationRole) &&
				Objects.equals(this.passwordDefined, compactUser.passwordDefined) &&
				Objects.equals(this.virtual, compactUser.virtual) &&
				Objects.equals(this.propagated, compactUser.propagated) &&
				Objects.equals(this.impersonatedFromUserId, compactUser.impersonatedFromUserId) &&
				Objects.equals(this.impersonatedFromAccountId, compactUser.impersonatedFromAccountId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, username, displayName, firstName, lastName, avatar, teamId, parentTeamIds, permissions, authorizationRole, passwordDefined, virtual, propagated, impersonatedFromUserId, impersonatedFromAccountId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CompactUser {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
		sb.append("    parentTeamIds: ").append(toIndentedString(parentTeamIds)).append("\n");
		sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
		sb.append("    authorizationRole: ").append(toIndentedString(authorizationRole)).append("\n");
		sb.append("    passwordDefined: ").append(toIndentedString(passwordDefined)).append("\n");
		sb.append("    virtual: ").append(toIndentedString(virtual)).append("\n");
		sb.append("    propagated: ").append(toIndentedString(propagated)).append("\n");
		sb.append("    impersonatedFromUserId: ").append(toIndentedString(impersonatedFromUserId)).append("\n");
		sb.append("    impersonatedFromAccountId: ").append(toIndentedString(impersonatedFromAccountId)).append("\n");
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
