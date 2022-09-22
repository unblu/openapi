
package com.unblu.webapi.model.v3;

import java.util.HashMap;
import java.util.Map;
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
 * Model of a user. A user is normally an agent and/or a person who manages the system
 */
@ApiModel(description = "Model of a user. A user is normally an agent and/or a person who manages the system")

@JsonPropertyOrder({
	User.JSON_PROPERTY_$_TYPE,
	User.JSON_PROPERTY_ID,
	User.JSON_PROPERTY_CREATION_TIMESTAMP,
	User.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	User.JSON_PROPERTY_VERSION,
	User.JSON_PROPERTY_ACCOUNT_ID,
	User.JSON_PROPERTY_AVATAR,
	User.JSON_PROPERTY_USERNAME,
	User.JSON_PROPERTY_EMAIL,
	User.JSON_PROPERTY_PHONE,
	User.JSON_PROPERTY_TEAM_ID,
	User.JSON_PROPERTY_AUTHORIZATION_ROLE,
	User.JSON_PROPERTY_DISPLAY_NAME,
	User.JSON_PROPERTY_FIRST_NAME,
	User.JSON_PROPERTY_LAST_NAME,
	User.JSON_PROPERTY_EXTERNALLY_MANAGED,
	User.JSON_PROPERTY_VIRTUAL_USER,
	User.JSON_PROPERTY_CONFIGURATION,
	User.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class User {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		USER("User");

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
			return TypeEnum.USER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.USER;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_AVATAR = "avatar";
	@JsonProperty(JSON_PROPERTY_AVATAR)
	private ExpandableField<Avatar> avatar = null;

	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_EMAIL = "email";
	@JsonProperty(JSON_PROPERTY_EMAIL)
	private String email;

	public static final String JSON_PROPERTY_PHONE = "phone";
	@JsonProperty(JSON_PROPERTY_PHONE)
	private String phone;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_AUTHORIZATION_ROLE = "authorizationRole";
	@JsonProperty(JSON_PROPERTY_AUTHORIZATION_ROLE)
	private EAuthorizationRole authorizationRole;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
	@JsonProperty(JSON_PROPERTY_FIRST_NAME)
	private String firstName;

	public static final String JSON_PROPERTY_LAST_NAME = "lastName";
	@JsonProperty(JSON_PROPERTY_LAST_NAME)
	private String lastName;

	public static final String JSON_PROPERTY_EXTERNALLY_MANAGED = "externallyManaged";
	@JsonProperty(JSON_PROPERTY_EXTERNALLY_MANAGED)
	private Boolean externallyManaged;

	public static final String JSON_PROPERTY_VIRTUAL_USER = "virtualUser";
	@JsonProperty(JSON_PROPERTY_VIRTUAL_USER)
	private Boolean virtualUser;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public User $type(TypeEnum $type) {
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

	public User id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and
	 * therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data
	 * consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public User modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public User version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public User accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public User avatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
		return this;
	}

	/**
	 * Avatar of the entity: id that can be expanded.
	 * 
	 * @return avatar
	 **/
	@ApiModelProperty(value = "Avatar of the entity: id that can be expanded.")
	public ExpandableField<Avatar> getAvatar() {
		return avatar;
	}

	public void setAvatar(ExpandableField<Avatar> avatar) {
		this.avatar = avatar;
	}

	public User username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * The username for the login. Depending on the configuration, this may also be the email address. Maximum length of 250 characters. Cannot be omitted. When
	 * creating or updating a user, and &#39;storage.user.useEmailAsUsername&#39; is enabled, this value must be the same as the email address.
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "The username for the login. Depending on the configuration, this may also be the email address. Maximum length of 250 characters. Cannot be omitted. When creating or updating a user, and 'storage.user.useEmailAsUsername' is enabled, this value must be the same as the email address.")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * The email address of the user. Maximum length of 250 characters. If &#39;storage.user.useEmailAsUsername&#39; is set to &#39;false&#39;, the email may be an
	 * empty string or set to null.
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "The email address of the user. Maximum length of 250 characters. If 'storage.user.useEmailAsUsername' is set to 'false', the email may be an empty string or set to null.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * The phone number of the user. Maximum length of 100 characters.
	 * 
	 * @return phone
	 **/
	@ApiModelProperty(value = "The phone number of the user. Maximum length of 100 characters.")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * The ID of the team the user belongs to. If omitted when creating a user, it is filled by the server with the ID of the account&#39;s default team.
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "The ID of the team the user belongs to. If omitted when creating a user, it is filled by the server with the ID of the account's default team.")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public User authorizationRole(EAuthorizationRole authorizationRole) {
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

	public User displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * The display name of the user. Calculated by the server. Can be omitted when creating a user.
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "The display name of the user. Calculated by the server. Can be omitted when creating a user.")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public User firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * The first name of the user. Maximum length of 250 characters. Cannot be omitted.
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(value = "The first name of the user. Maximum length of 250 characters. Cannot be omitted.")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public User lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * The user&#39;s last name. Maximum length of 250 characters. Cannot be omitted.
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(value = "The user's last name. Maximum length of 250 characters. Cannot be omitted.")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public User externallyManaged(Boolean externallyManaged) {
		this.externallyManaged = externallyManaged;
		return this;
	}

	/**
	 * True if the user is externally managed and cannot be edited in the Unblu user interface. If omitted, the property is set to false.
	 * 
	 * @return externallyManaged
	 **/
	@ApiModelProperty(value = "True if the user is externally managed and cannot be edited in the Unblu user interface. If omitted, the property is set to false.")
	public Boolean isExternallyManaged() {
		return externallyManaged;
	}

	public void setExternallyManaged(Boolean externallyManaged) {
		this.externallyManaged = externallyManaged;
	}

	public User virtualUser(Boolean virtualUser) {
		this.virtualUser = virtualUser;
		return this;
	}

	/**
	 * True if the user is pure virtual (i.e. not created beforehand by LDAP sync for instance) and therefore can not be edited by the Unblu user interface. If
	 * omitted, the property is set to false.
	 * 
	 * @return virtualUser
	 **/
	@ApiModelProperty(value = "True if the user is pure virtual (i.e. not created beforehand by LDAP sync for instance) and therefore can not be edited by the Unblu user interface. If omitted, the property is set to false.")
	public Boolean isVirtualUser() {
		return virtualUser;
	}

	public void setVirtualUser(Boolean virtualUser) {
		this.virtualUser = virtualUser;
	}

	public User _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public User putConfigurationItem(String key, String _configurationItem) {
		if (this._configuration == null) {
			this._configuration = new HashMap<>();
		}
		this._configuration.put(key, _configurationItem);
		return this;
	}

	/**
	 * The entity&#39;s configuration properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;configuration&#39;.
	 * 
	 * @return _configuration
	 **/
	@ApiModelProperty(value = "The entity's configuration properties. Only contains values when the 'expand' query parameter is used with the value 'configuration'.")
	public Map<String, String> getConfiguration() {
		return _configuration;
	}

	public void setConfiguration(Map<String, String> _configuration) {
		this._configuration = _configuration;
	}

	public User metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public User putMetadataItem(String key, String metadataItem) {
		if (this.metadata == null) {
			this.metadata = new HashMap<>();
		}
		this.metadata.put(key, metadataItem);
		return this;
	}

	/**
	 * The entity&#39;s metadata properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;metadata&#39;.
	 * 
	 * @return metadata
	 **/
	@ApiModelProperty(value = "The entity's metadata properties. Only contains values when the 'expand' query parameter is used with the value 'metadata'.")
	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		User user = (User) o;
		return Objects.equals(this.$type, user.$type) &&
				Objects.equals(this.id, user.id) &&
				Objects.equals(this.creationTimestamp, user.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, user.modificationTimestamp) &&
				Objects.equals(this.version, user.version) &&
				Objects.equals(this.accountId, user.accountId) &&
				Objects.equals(this.avatar, user.avatar) &&
				Objects.equals(this.username, user.username) &&
				Objects.equals(this.email, user.email) &&
				Objects.equals(this.phone, user.phone) &&
				Objects.equals(this.teamId, user.teamId) &&
				Objects.equals(this.authorizationRole, user.authorizationRole) &&
				Objects.equals(this.displayName, user.displayName) &&
				Objects.equals(this.firstName, user.firstName) &&
				Objects.equals(this.lastName, user.lastName) &&
				Objects.equals(this.externallyManaged, user.externallyManaged) &&
				Objects.equals(this.virtualUser, user.virtualUser) &&
				Objects.equals(this._configuration, user._configuration) &&
				Objects.equals(this.metadata, user.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, avatar, username, email, phone, teamId, authorizationRole, displayName, firstName, lastName, externallyManaged, virtualUser, _configuration, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
		sb.append("    authorizationRole: ").append(toIndentedString(authorizationRole)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    externallyManaged: ").append(toIndentedString(externallyManaged)).append("\n");
		sb.append("    virtualUser: ").append(toIndentedString(virtualUser)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
