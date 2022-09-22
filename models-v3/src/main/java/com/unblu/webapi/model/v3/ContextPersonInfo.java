
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
 * Information about the context person of a conversation. Normally send together with webhook events.
 */
@ApiModel(description = "Information about the context person of a conversation. Normally send together with webhook events.")

@JsonPropertyOrder({
	ContextPersonInfo.JSON_PROPERTY_$_TYPE,
	ContextPersonInfo.JSON_PROPERTY_ID,
	ContextPersonInfo.JSON_PROPERTY_ACCOUNT_ID,
	ContextPersonInfo.JSON_PROPERTY_PERSON_SOURCE,
	ContextPersonInfo.JSON_PROPERTY_SOURCE_ID,
	ContextPersonInfo.JSON_PROPERTY_SOURCE_DATA,
	ContextPersonInfo.JSON_PROPERTY_FIRST_NAME,
	ContextPersonInfo.JSON_PROPERTY_LAST_NAME,
	ContextPersonInfo.JSON_PROPERTY_USERNAME,
	ContextPersonInfo.JSON_PROPERTY_NICKNAME,
	ContextPersonInfo.JSON_PROPERTY_DISPLAY_NAME,
	ContextPersonInfo.JSON_PROPERTY_PERSON_TYPE,
	ContextPersonInfo.JSON_PROPERTY_AUTHORIZATION_ROLE,
	ContextPersonInfo.JSON_PROPERTY_EMAIL,
	ContextPersonInfo.JSON_PROPERTY_PHONE,
	ContextPersonInfo.JSON_PROPERTY_TEAM_ID,
	ContextPersonInfo.JSON_PROPERTY_TEAM_NAME,
	ContextPersonInfo.JSON_PROPERTY_AVATAR,
	ContextPersonInfo.JSON_PROPERTY_OS_NAME,
	ContextPersonInfo.JSON_PROPERTY_OS_VERSION,
	ContextPersonInfo.JSON_PROPERTY_BROWSER_NAME,
	ContextPersonInfo.JSON_PROPERTY_BROWSER_VERSION,
	ContextPersonInfo.JSON_PROPERTY_LOCALE,
	ContextPersonInfo.JSON_PROPERTY_CITY,
	ContextPersonInfo.JSON_PROPERTY_COUNTRY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ContextPersonInfo {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONTEXTPERSONINFO("ContextPersonInfo");

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
			return TypeEnum.CONTEXTPERSONINFO;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONTEXTPERSONINFO;

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

	public static final String JSON_PROPERTY_OS_NAME = "osName";
	@JsonProperty(JSON_PROPERTY_OS_NAME)
	private String osName;

	public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
	@JsonProperty(JSON_PROPERTY_OS_VERSION)
	private String osVersion;

	public static final String JSON_PROPERTY_BROWSER_NAME = "browserName";
	@JsonProperty(JSON_PROPERTY_BROWSER_NAME)
	private String browserName;

	public static final String JSON_PROPERTY_BROWSER_VERSION = "browserVersion";
	@JsonProperty(JSON_PROPERTY_BROWSER_VERSION)
	private String browserVersion;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_CITY = "city";
	@JsonProperty(JSON_PROPERTY_CITY)
	private String city;

	public static final String JSON_PROPERTY_COUNTRY = "country";
	@JsonProperty(JSON_PROPERTY_COUNTRY)
	private String country;

	public ContextPersonInfo $type(TypeEnum $type) {
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

	public ContextPersonInfo id(String id) {
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

	public ContextPersonInfo accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which a Person belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the
	 * account of the currently logged in user. When editing an entity, the accountId must be send.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which a Person belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the account of the currently logged in user. When editing an entity, the accountId must be send.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ContextPersonInfo personSource(EPersonSource personSource) {
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

	public ContextPersonInfo sourceId(String sourceId) {
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

	public ContextPersonInfo sourceData(String sourceData) {
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

	public ContextPersonInfo firstName(String firstName) {
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

	public ContextPersonInfo lastName(String lastName) {
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

	public ContextPersonInfo username(String username) {
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

	public ContextPersonInfo nickname(String nickname) {
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

	public ContextPersonInfo displayName(String displayName) {
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

	public ContextPersonInfo personType(EPersonType personType) {
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

	public ContextPersonInfo authorizationRole(EAuthorizationRole authorizationRole) {
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

	public ContextPersonInfo email(String email) {
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

	public ContextPersonInfo phone(String phone) {
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

	public ContextPersonInfo teamId(String teamId) {
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

	public ContextPersonInfo teamName(String teamName) {
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

	public ContextPersonInfo avatar(ExpandableField<Avatar> avatar) {
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

	public ContextPersonInfo osName(String osName) {
		this.osName = osName;
		return this;
	}

	/**
	 * The operation system name of the visitors computer
	 * 
	 * @return osName
	 **/
	@ApiModelProperty(value = "The operation system name of the visitors computer")
	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public ContextPersonInfo osVersion(String osVersion) {
		this.osVersion = osVersion;
		return this;
	}

	/**
	 * The version of the operation system of the visitors computer
	 * 
	 * @return osVersion
	 **/
	@ApiModelProperty(value = "The version of the operation system of the visitors computer")
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}

	public ContextPersonInfo browserName(String browserName) {
		this.browserName = browserName;
		return this;
	}

	/**
	 * The name of the browser the visitor uses
	 * 
	 * @return browserName
	 **/
	@ApiModelProperty(value = "The name of the browser the visitor uses")
	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public ContextPersonInfo browserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
		return this;
	}

	/**
	 * The version of the browser the visitor uses
	 * 
	 * @return browserVersion
	 **/
	@ApiModelProperty(value = "The version of the browser the visitor uses")
	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public ContextPersonInfo locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * The locale defined in the browser of the visitor (BCP 47 language tag form including region if available)
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "The locale defined in the browser of the visitor (BCP 47 language tag form including region if available)")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ContextPersonInfo city(String city) {
		this.city = city;
		return this;
	}

	/**
	 * The city in which the visitor is (probably)
	 * 
	 * @return city
	 **/
	@ApiModelProperty(value = "The city in which the visitor is (probably)")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ContextPersonInfo country(String country) {
		this.country = country;
		return this;
	}

	/**
	 * The country in which the visitor is (probable)
	 * 
	 * @return country
	 **/
	@ApiModelProperty(value = "The country in which the visitor is (probable)")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ContextPersonInfo contextPersonInfo = (ContextPersonInfo) o;
		return Objects.equals(this.$type, contextPersonInfo.$type) &&
				Objects.equals(this.id, contextPersonInfo.id) &&
				Objects.equals(this.accountId, contextPersonInfo.accountId) &&
				Objects.equals(this.personSource, contextPersonInfo.personSource) &&
				Objects.equals(this.sourceId, contextPersonInfo.sourceId) &&
				Objects.equals(this.sourceData, contextPersonInfo.sourceData) &&
				Objects.equals(this.firstName, contextPersonInfo.firstName) &&
				Objects.equals(this.lastName, contextPersonInfo.lastName) &&
				Objects.equals(this.username, contextPersonInfo.username) &&
				Objects.equals(this.nickname, contextPersonInfo.nickname) &&
				Objects.equals(this.displayName, contextPersonInfo.displayName) &&
				Objects.equals(this.personType, contextPersonInfo.personType) &&
				Objects.equals(this.authorizationRole, contextPersonInfo.authorizationRole) &&
				Objects.equals(this.email, contextPersonInfo.email) &&
				Objects.equals(this.phone, contextPersonInfo.phone) &&
				Objects.equals(this.teamId, contextPersonInfo.teamId) &&
				Objects.equals(this.teamName, contextPersonInfo.teamName) &&
				Objects.equals(this.avatar, contextPersonInfo.avatar) &&
				Objects.equals(this.osName, contextPersonInfo.osName) &&
				Objects.equals(this.osVersion, contextPersonInfo.osVersion) &&
				Objects.equals(this.browserName, contextPersonInfo.browserName) &&
				Objects.equals(this.browserVersion, contextPersonInfo.browserVersion) &&
				Objects.equals(this.locale, contextPersonInfo.locale) &&
				Objects.equals(this.city, contextPersonInfo.city) &&
				Objects.equals(this.country, contextPersonInfo.country);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, personSource, sourceId, sourceData, firstName, lastName, username, nickname, displayName, personType, authorizationRole, email, phone, teamId, teamName, avatar, osName, osVersion, browserName, browserVersion, locale, city, country);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContextPersonInfo {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    personSource: ").append(toIndentedString(personSource)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
		sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
		sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
		sb.append("    browserName: ").append(toIndentedString(browserName)).append("\n");
		sb.append("    browserVersion: ").append(toIndentedString(browserVersion)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    city: ").append(toIndentedString(city)).append("\n");
		sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
