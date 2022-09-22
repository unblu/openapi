
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
 * Event sent when the LDAP sync job finishes.
 */
@ApiModel(description = "Event sent when the LDAP sync job finishes.")

@JsonPropertyOrder({
	LdapSyncJobEvent.JSON_PROPERTY_$_TYPE,
	LdapSyncJobEvent.JSON_PROPERTY_TIMESTAMP,
	LdapSyncJobEvent.JSON_PROPERTY_EVENT_TYPE,
	LdapSyncJobEvent.JSON_PROPERTY_ACCOUNT_ID,
	LdapSyncJobEvent.JSON_PROPERTY_NUMBER_OF_CREATED_USERS,
	LdapSyncJobEvent.JSON_PROPERTY_NUMBER_OF_UPDATED_USERS,
	LdapSyncJobEvent.JSON_PROPERTY_NUMBER_OF_DELETED_USERS,
	LdapSyncJobEvent.JSON_PROPERTY_NUMBER_OF_CREATED_TEAMS,
	LdapSyncJobEvent.JSON_PROPERTY_NUMBER_OF_DELETED_TEAMS,
	LdapSyncJobEvent.JSON_PROPERTY_FINISHED_WITH_ERROR,
	LdapSyncJobEvent.JSON_PROPERTY_ERROR_DESCRIPTION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LdapSyncJobEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LDAPSYNCJOBEVENT("LdapSyncJobEvent");

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
			return TypeEnum.LDAPSYNCJOBEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LDAPSYNCJOBEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NUMBER_OF_CREATED_USERS = "numberOfCreatedUsers";
	@JsonProperty(JSON_PROPERTY_NUMBER_OF_CREATED_USERS)
	private Integer numberOfCreatedUsers;

	public static final String JSON_PROPERTY_NUMBER_OF_UPDATED_USERS = "numberOfUpdatedUsers";
	@JsonProperty(JSON_PROPERTY_NUMBER_OF_UPDATED_USERS)
	private Integer numberOfUpdatedUsers;

	public static final String JSON_PROPERTY_NUMBER_OF_DELETED_USERS = "numberOfDeletedUsers";
	@JsonProperty(JSON_PROPERTY_NUMBER_OF_DELETED_USERS)
	private Integer numberOfDeletedUsers;

	public static final String JSON_PROPERTY_NUMBER_OF_CREATED_TEAMS = "numberOfCreatedTeams";
	@JsonProperty(JSON_PROPERTY_NUMBER_OF_CREATED_TEAMS)
	private Integer numberOfCreatedTeams;

	public static final String JSON_PROPERTY_NUMBER_OF_DELETED_TEAMS = "numberOfDeletedTeams";
	@JsonProperty(JSON_PROPERTY_NUMBER_OF_DELETED_TEAMS)
	private Integer numberOfDeletedTeams;

	public static final String JSON_PROPERTY_FINISHED_WITH_ERROR = "finishedWithError";
	@JsonProperty(JSON_PROPERTY_FINISHED_WITH_ERROR)
	private Boolean finishedWithError;

	public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "errorDescription";
	@JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
	private String errorDescription;

	public LdapSyncJobEvent $type(TypeEnum $type) {
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

	public LdapSyncJobEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public LdapSyncJobEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public LdapSyncJobEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public LdapSyncJobEvent numberOfCreatedUsers(Integer numberOfCreatedUsers) {
		this.numberOfCreatedUsers = numberOfCreatedUsers;
		return this;
	}

	/**
	 * The number of users created in the LDAP sync.
	 * 
	 * @return numberOfCreatedUsers
	 **/
	@ApiModelProperty(value = "The number of users created in the LDAP sync.")
	public Integer getNumberOfCreatedUsers() {
		return numberOfCreatedUsers;
	}

	public void setNumberOfCreatedUsers(Integer numberOfCreatedUsers) {
		this.numberOfCreatedUsers = numberOfCreatedUsers;
	}

	public LdapSyncJobEvent numberOfUpdatedUsers(Integer numberOfUpdatedUsers) {
		this.numberOfUpdatedUsers = numberOfUpdatedUsers;
		return this;
	}

	/**
	 * The number of users updated in the LDAP sync.
	 * 
	 * @return numberOfUpdatedUsers
	 **/
	@ApiModelProperty(value = "The number of users updated in the LDAP sync.")
	public Integer getNumberOfUpdatedUsers() {
		return numberOfUpdatedUsers;
	}

	public void setNumberOfUpdatedUsers(Integer numberOfUpdatedUsers) {
		this.numberOfUpdatedUsers = numberOfUpdatedUsers;
	}

	public LdapSyncJobEvent numberOfDeletedUsers(Integer numberOfDeletedUsers) {
		this.numberOfDeletedUsers = numberOfDeletedUsers;
		return this;
	}

	/**
	 * The number of users deleted in the LDAP sync.
	 * 
	 * @return numberOfDeletedUsers
	 **/
	@ApiModelProperty(value = "The number of users deleted in the LDAP sync.")
	public Integer getNumberOfDeletedUsers() {
		return numberOfDeletedUsers;
	}

	public void setNumberOfDeletedUsers(Integer numberOfDeletedUsers) {
		this.numberOfDeletedUsers = numberOfDeletedUsers;
	}

	public LdapSyncJobEvent numberOfCreatedTeams(Integer numberOfCreatedTeams) {
		this.numberOfCreatedTeams = numberOfCreatedTeams;
		return this;
	}

	/**
	 * The number of teams created in the LDAP sync.
	 * 
	 * @return numberOfCreatedTeams
	 **/
	@ApiModelProperty(value = "The number of teams created in the LDAP sync.")
	public Integer getNumberOfCreatedTeams() {
		return numberOfCreatedTeams;
	}

	public void setNumberOfCreatedTeams(Integer numberOfCreatedTeams) {
		this.numberOfCreatedTeams = numberOfCreatedTeams;
	}

	public LdapSyncJobEvent numberOfDeletedTeams(Integer numberOfDeletedTeams) {
		this.numberOfDeletedTeams = numberOfDeletedTeams;
		return this;
	}

	/**
	 * The number of teams deleted in the LDAP sync.
	 * 
	 * @return numberOfDeletedTeams
	 **/
	@ApiModelProperty(value = "The number of teams deleted in the LDAP sync.")
	public Integer getNumberOfDeletedTeams() {
		return numberOfDeletedTeams;
	}

	public void setNumberOfDeletedTeams(Integer numberOfDeletedTeams) {
		this.numberOfDeletedTeams = numberOfDeletedTeams;
	}

	public LdapSyncJobEvent finishedWithError(Boolean finishedWithError) {
		this.finishedWithError = finishedWithError;
		return this;
	}

	/**
	 * Set to true if the LDAP sync finishes with an error.
	 * 
	 * @return finishedWithError
	 **/
	@ApiModelProperty(value = "Set to true if the LDAP sync finishes with an error.")
	public Boolean isFinishedWithError() {
		return finishedWithError;
	}

	public void setFinishedWithError(Boolean finishedWithError) {
		this.finishedWithError = finishedWithError;
	}

	public LdapSyncJobEvent errorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
		return this;
	}

	/**
	 * Error description if the LDAP sync finishes with an error.
	 * 
	 * @return errorDescription
	 **/
	@ApiModelProperty(value = "Error description if the LDAP sync finishes with an error.")
	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LdapSyncJobEvent ldapSyncJobEvent = (LdapSyncJobEvent) o;
		return Objects.equals(this.$type, ldapSyncJobEvent.$type) &&
				Objects.equals(this.timestamp, ldapSyncJobEvent.timestamp) &&
				Objects.equals(this.eventType, ldapSyncJobEvent.eventType) &&
				Objects.equals(this.accountId, ldapSyncJobEvent.accountId) &&
				Objects.equals(this.numberOfCreatedUsers, ldapSyncJobEvent.numberOfCreatedUsers) &&
				Objects.equals(this.numberOfUpdatedUsers, ldapSyncJobEvent.numberOfUpdatedUsers) &&
				Objects.equals(this.numberOfDeletedUsers, ldapSyncJobEvent.numberOfDeletedUsers) &&
				Objects.equals(this.numberOfCreatedTeams, ldapSyncJobEvent.numberOfCreatedTeams) &&
				Objects.equals(this.numberOfDeletedTeams, ldapSyncJobEvent.numberOfDeletedTeams) &&
				Objects.equals(this.finishedWithError, ldapSyncJobEvent.finishedWithError) &&
				Objects.equals(this.errorDescription, ldapSyncJobEvent.errorDescription);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, numberOfCreatedUsers, numberOfUpdatedUsers, numberOfDeletedUsers, numberOfCreatedTeams, numberOfDeletedTeams, finishedWithError, errorDescription);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LdapSyncJobEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    numberOfCreatedUsers: ").append(toIndentedString(numberOfCreatedUsers)).append("\n");
		sb.append("    numberOfUpdatedUsers: ").append(toIndentedString(numberOfUpdatedUsers)).append("\n");
		sb.append("    numberOfDeletedUsers: ").append(toIndentedString(numberOfDeletedUsers)).append("\n");
		sb.append("    numberOfCreatedTeams: ").append(toIndentedString(numberOfCreatedTeams)).append("\n");
		sb.append("    numberOfDeletedTeams: ").append(toIndentedString(numberOfDeletedTeams)).append("\n");
		sb.append("    finishedWithError: ").append(toIndentedString(finishedWithError)).append("\n");
		sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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
