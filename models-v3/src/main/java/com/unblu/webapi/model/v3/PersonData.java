
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
 * Representation of a Person (Agent or Visitor).&lt;br&gt; If a message is send to unblu, only a small set of fields like the ID need to be defined.
 */
@ApiModel(description = "Representation of a Person (Agent or Visitor).<br> If a message is send to unblu, only a small set of fields like the ID need to be defined.")

@JsonPropertyOrder({
	PersonData.JSON_PROPERTY_$_TYPE,
	PersonData.JSON_PROPERTY_ID,
	PersonData.JSON_PROPERTY_ACCOUNT_ID,
	PersonData.JSON_PROPERTY_PERSON_SOURCE,
	PersonData.JSON_PROPERTY_SOURCE_ID,
	PersonData.JSON_PROPERTY_SOURCE_URL,
	PersonData.JSON_PROPERTY_SOURCE_DATA,
	PersonData.JSON_PROPERTY_FIRST_NAME,
	PersonData.JSON_PROPERTY_LAST_NAME,
	PersonData.JSON_PROPERTY_USERNAME,
	PersonData.JSON_PROPERTY_NICKNAME,
	PersonData.JSON_PROPERTY_DISPLAY_NAME,
	PersonData.JSON_PROPERTY_PERSON_TYPE,
	PersonData.JSON_PROPERTY_AUTHORIZATION_ROLE,
	PersonData.JSON_PROPERTY_EMAIL,
	PersonData.JSON_PROPERTY_PHONE,
	PersonData.JSON_PROPERTY_TEAM_ID,
	PersonData.JSON_PROPERTY_TEAM_NAME,
	PersonData.JSON_PROPERTY_AVATAR,
	PersonData.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonData implements ConversationRecipientData, AgentTargetData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONDATA("PersonData");

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
			return TypeEnum.PERSONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_PERSON_SOURCE = "personSource";
	@JsonProperty(JSON_PROPERTY_PERSON_SOURCE)
	private EPersonSource personSource;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_SOURCE_URL = "sourceUrl";
	@JsonProperty(JSON_PROPERTY_SOURCE_URL)
	private String sourceUrl;

	public static final String JSON_PROPERTY_SOURCE_DATA = "sourceData";
	@JsonProperty(JSON_PROPERTY_SOURCE_DATA)
	private String sourceData;

	public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
	@JsonProperty(JSON_PROPERTY_FIRST_NAME)
	private String firstName;

	public static final String JSON_PROPERTY_LAST_NAME = "lastName";
	@JsonProperty(JSON_PROPERTY_LAST_NAME)
	private String lastName;

	public static final String JSON_PROPERTY_USERNAME = "username";
	@JsonProperty(JSON_PROPERTY_USERNAME)
	private String username;

	public static final String JSON_PROPERTY_NICKNAME = "nickname";
	@JsonProperty(JSON_PROPERTY_NICKNAME)
	private String nickname;

	public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
	@JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
	private String displayName;

	public static final String JSON_PROPERTY_PERSON_TYPE = "personType";
	@JsonProperty(JSON_PROPERTY_PERSON_TYPE)
	private EPersonType personType;

	public static final String JSON_PROPERTY_AUTHORIZATION_ROLE = "authorizationRole";
	@JsonProperty(JSON_PROPERTY_AUTHORIZATION_ROLE)
	private EAuthorizationRole authorizationRole;

	public static final String JSON_PROPERTY_EMAIL = "email";
	@JsonProperty(JSON_PROPERTY_EMAIL)
	private String email;

	public static final String JSON_PROPERTY_PHONE = "phone";
	@JsonProperty(JSON_PROPERTY_PHONE)
	private String phone;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_TEAM_NAME = "teamName";
	@JsonProperty(JSON_PROPERTY_TEAM_NAME)
	private String teamName;

	public static final String JSON_PROPERTY_AVATAR = "avatar";
	@JsonProperty(JSON_PROPERTY_AVATAR)
	private ExpandableField<Avatar> avatar = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public PersonData $type(TypeEnum $type) {
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

	public PersonData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the person, when creating a person this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the person, when creating a person this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which a Person belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the
	 * account of the currently logged in user. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which a Person belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the account of the currently logged in user. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public PersonData personSource(EPersonSource personSource) {
		this.personSource = personSource;
		return this;
	}

	/**
	 * Get personSource
	 * 
	 * @return personSource
	 **/
	@ApiModelProperty(value = "")
	public EPersonSource getPersonSource() {
		return personSource;
	}

	public void setPersonSource(EPersonSource personSource) {
		this.personSource = personSource;
	}

	public PersonData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * Identifier of the person in its source (defined by &#x60;personSource&#x60;). For &#x60;EPersonSource.USER_DB&#x60; this is the
	 * &lt;code&gt;userId&lt;/code&gt;, for&#x60;EPersonSource.VIRTUAL&#x60; the propagated user id. Maximum length of 250 characters. Mandatory for virtual
	 * persons.
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "Identifier of the person in its source (defined by `personSource`). For `EPersonSource.USER_DB` this is the <code>userId</code>, for`EPersonSource.VIRTUAL` the propagated user id. Maximum length of 250 characters. Mandatory for virtual persons.")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public PersonData sourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
		return this;
	}

	/**
	 * URL identifying the source of the person. Maximum length of 2000 characters. Only available for virtual persons in conversations that were created outside
	 * Unblu.
	 * 
	 * @return sourceUrl
	 **/
	@ApiModelProperty(value = "URL identifying the source of the person. Maximum length of 2000 characters. Only available for virtual persons in conversations that were created outside Unblu.")
	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public PersonData sourceData(String sourceData) {
		this.sourceData = sourceData;
		return this;
	}

	/**
	 * Vendor specific data.
	 * 
	 * @return sourceData
	 **/
	@ApiModelProperty(value = "Vendor specific data.")
	public String getSourceData() {
		return sourceData;
	}

	public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
	}

	public PersonData firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * The first name of the person. Maximum length of 250 characters. Can be omitted.
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(value = "The first name of the person. Maximum length of 250 characters. Can be omitted.")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public PersonData lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * the last name of the person. Maximum length of 250 characters. Can be omitted.
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(value = "the last name of the person. Maximum length of 250 characters. Can be omitted.")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PersonData username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * The username of the person. When firstName and lastName are unknown, it is recommended to use this value to change the displayName. Depending on the
	 * configuration, this is may also be the email of the corresponding user. Maximum length of 250 characters. Can be omitted.
	 * 
	 * @return username
	 **/
	@ApiModelProperty(value = "The username of the person. When firstName and lastName are unknown, it is recommended to use this value to change the displayName. Depending on the configuration, this is may also be the email of the corresponding user. Maximum length of 250 characters. Can be omitted.")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public PersonData nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * A name that an anonymous person has given itself. Maximum length of 250 characters. Can be omitted.
	 * 
	 * @return nickname
	 **/
	@ApiModelProperty(value = "A name that an anonymous person has given itself. Maximum length of 250 characters. Can be omitted.")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public PersonData displayName(String displayName) {
		this.displayName = displayName;
		return this;
	}

	/**
	 * Display name of the person. This is read only information, it will be set by the server anyway.
	 * 
	 * @return displayName
	 **/
	@ApiModelProperty(value = "Display name of the person. This is read only information, it will be set by the server anyway.")
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public PersonData personType(EPersonType personType) {
		this.personType = personType;
		return this;
	}

	/**
	 * Get personType
	 * 
	 * @return personType
	 **/
	@ApiModelProperty(value = "")
	public EPersonType getPersonType() {
		return personType;
	}

	public void setPersonType(EPersonType personType) {
		this.personType = personType;
	}

	public PersonData authorizationRole(EAuthorizationRole authorizationRole) {
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

	public PersonData email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * The email of the person. Optional.
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "The email of the person. Optional.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PersonData phone(String phone) {
		this.phone = phone;
		return this;
	}

	/**
	 * The phone of the person. Optional.
	 * 
	 * @return phone
	 **/
	@ApiModelProperty(value = "The phone of the person. Optional.")
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public PersonData teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * Team id of the person. Optional.
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "Team id of the person. Optional.")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public PersonData teamName(String teamName) {
		this.teamName = teamName;
		return this;
	}

	/**
	 * Team name of the person, only present when the team id is set. When creating or updating a person this property can be omitted as it will be set by the
	 * server anyway.
	 * 
	 * @return teamName
	 **/
	@ApiModelProperty(value = "Team name of the person, only present when the team id is set. When creating or updating a person this property can be omitted as it will be set by the server anyway.")
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public PersonData avatar(ExpandableField<Avatar> avatar) {
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

	public PersonData metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public PersonData putMetadataItem(String key, String metadataItem) {
		if (this.metadata == null) {
			this.metadata = new HashMap<>();
		}
		this.metadata.put(key, metadataItem);
		return this;
	}

	/**
	 * The entity&#39;s metadata properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;metadata&#39;. Not filled in
	 * webhook events.
	 * 
	 * @return metadata
	 **/
	@ApiModelProperty(value = "The entity's metadata properties. Only contains values when the 'expand' query parameter is used with the value 'metadata'. Not filled in webhook events.")
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
		PersonData personData = (PersonData) o;
		return Objects.equals(this.$type, personData.$type) &&
				Objects.equals(this.id, personData.id) &&
				Objects.equals(this.accountId, personData.accountId) &&
				Objects.equals(this.personSource, personData.personSource) &&
				Objects.equals(this.sourceId, personData.sourceId) &&
				Objects.equals(this.sourceUrl, personData.sourceUrl) &&
				Objects.equals(this.sourceData, personData.sourceData) &&
				Objects.equals(this.firstName, personData.firstName) &&
				Objects.equals(this.lastName, personData.lastName) &&
				Objects.equals(this.username, personData.username) &&
				Objects.equals(this.nickname, personData.nickname) &&
				Objects.equals(this.displayName, personData.displayName) &&
				Objects.equals(this.personType, personData.personType) &&
				Objects.equals(this.authorizationRole, personData.authorizationRole) &&
				Objects.equals(this.email, personData.email) &&
				Objects.equals(this.phone, personData.phone) &&
				Objects.equals(this.teamId, personData.teamId) &&
				Objects.equals(this.teamName, personData.teamName) &&
				Objects.equals(this.avatar, personData.avatar) &&
				Objects.equals(this.metadata, personData.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, personSource, sourceId, sourceUrl, sourceData, firstName, lastName, username, nickname, displayName, personType, authorizationRole, email, phone, teamId, teamName, avatar, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    personSource: ").append(toIndentedString(personSource)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
		sb.append("    sourceData: ").append(toIndentedString(sourceData)).append("\n");
		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
		sb.append("    personType: ").append(toIndentedString(personType)).append("\n");
		sb.append("    authorizationRole: ").append(toIndentedString(authorizationRole)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
		sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
		sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
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
