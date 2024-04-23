
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
 * Model of a person-presence&lt;br&gt; A presence represents the time that a participant is logged into / available in the system.
 */
@ApiModel(description = "Model of a person-presence<br> A presence represents the time that a participant is logged into / available in the system.")

@JsonPropertyOrder({
	PersonPresenceData.JSON_PROPERTY_$_TYPE,
	PersonPresenceData.JSON_PROPERTY_ID,
	PersonPresenceData.JSON_PROPERTY_CREATION_TIMESTAMP,
	PersonPresenceData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	PersonPresenceData.JSON_PROPERTY_ACCOUNT_ID,
	PersonPresenceData.JSON_PROPERTY_JOINED_TIMESTAMP,
	PersonPresenceData.JSON_PROPERTY_LEFT_TIMESTAMP,
	PersonPresenceData.JSON_PROPERTY_PERSON_ID,
	PersonPresenceData.JSON_PROPERTY_DEVICE_INFO,
	PersonPresenceData.JSON_PROPERTY_IMPERSONATION_TYPE,
	PersonPresenceData.JSON_PROPERTY_IMPERSONATED_FROM_USER_ID,
	PersonPresenceData.JSON_PROPERTY_IMPERSONATED_FROM_ACCOUNT_ID,
	PersonPresenceData.JSON_PROPERTY_ADDITIONAL_INFO,
	PersonPresenceData.JSON_PROPERTY_AUTH_INFO,
	PersonPresenceData.JSON_PROPERTY_PROPAGATED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonPresenceData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONPRESENCEDATA("PersonPresenceData");

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
			return TypeEnum.PERSONPRESENCEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONPRESENCEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_JOINED_TIMESTAMP = "joinedTimestamp";
	@JsonProperty(JSON_PROPERTY_JOINED_TIMESTAMP)
	private Long joinedTimestamp;

	public static final String JSON_PROPERTY_LEFT_TIMESTAMP = "leftTimestamp";
	@JsonProperty(JSON_PROPERTY_LEFT_TIMESTAMP)
	private Long leftTimestamp;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_DEVICE_INFO = "deviceInfo";
	@JsonProperty(JSON_PROPERTY_DEVICE_INFO)
	private DeviceInfo deviceInfo = null;

	public static final String JSON_PROPERTY_IMPERSONATION_TYPE = "impersonationType";
	@JsonProperty(JSON_PROPERTY_IMPERSONATION_TYPE)
	private EImpersonationType impersonationType;

	public static final String JSON_PROPERTY_IMPERSONATED_FROM_USER_ID = "impersonatedFromUserId";
	@JsonProperty(JSON_PROPERTY_IMPERSONATED_FROM_USER_ID)
	private String impersonatedFromUserId;

	public static final String JSON_PROPERTY_IMPERSONATED_FROM_ACCOUNT_ID = "impersonatedFromAccountId";
	@JsonProperty(JSON_PROPERTY_IMPERSONATED_FROM_ACCOUNT_ID)
	private String impersonatedFromAccountId;

	public static final String JSON_PROPERTY_ADDITIONAL_INFO = "additionalInfo";
	@JsonProperty(JSON_PROPERTY_ADDITIONAL_INFO)
	private String additionalInfo;

	public static final String JSON_PROPERTY_AUTH_INFO = "authInfo";
	@JsonProperty(JSON_PROPERTY_AUTH_INFO)
	private String authInfo;

	public static final String JSON_PROPERTY_PROPAGATED = "propagated";
	@JsonProperty(JSON_PROPERTY_PROPAGATED)
	private Boolean propagated;

	public PersonPresenceData $type(TypeEnum $type) {
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

	public PersonPresenceData id(String id) {
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

	public PersonPresenceData creationTimestamp(Long creationTimestamp) {
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

	public PersonPresenceData modificationTimestamp(Long modificationTimestamp) {
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

	public PersonPresenceData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Account id to which an entity belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the
	 * account of the currently logged in user. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "Account id to which an entity belongs to. When creating an entity, the accountId can be omitted, as it will be filled by the server automatically with the account of the currently logged in user. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public PersonPresenceData joinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person has joined
	 * 
	 * @return joinedTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person has joined")
	public Long getJoinedTimestamp() {
		return joinedTimestamp;
	}

	public void setJoinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
	}

	public PersonPresenceData leftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person has left (may not be present or -1 if still online)
	 * 
	 * @return leftTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person has left (may not be present or -1 if still online)")
	public Long getLeftTimestamp() {
		return leftTimestamp;
	}

	public void setLeftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
	}

	public PersonPresenceData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Person id to which an entity belongs to
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "Person id to which an entity belongs to")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public PersonPresenceData deviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
		return this;
	}

	/**
	 * Get deviceInfo
	 * 
	 * @return deviceInfo
	 **/
	@ApiModelProperty(value = "")
	public DeviceInfo getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(DeviceInfo deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public PersonPresenceData impersonationType(EImpersonationType impersonationType) {
		this.impersonationType = impersonationType;
		return this;
	}

	/**
	 * Get impersonationType
	 * 
	 * @return impersonationType
	 **/
	@ApiModelProperty(value = "")
	public EImpersonationType getImpersonationType() {
		return impersonationType;
	}

	public void setImpersonationType(EImpersonationType impersonationType) {
		this.impersonationType = impersonationType;
	}

	public PersonPresenceData impersonatedFromUserId(String impersonatedFromUserId) {
		this.impersonatedFromUserId = impersonatedFromUserId;
		return this;
	}

	/**
	 * Get impersonatedFromUserId
	 * 
	 * @return impersonatedFromUserId
	 **/
	@ApiModelProperty(value = "")
	public String getImpersonatedFromUserId() {
		return impersonatedFromUserId;
	}

	public void setImpersonatedFromUserId(String impersonatedFromUserId) {
		this.impersonatedFromUserId = impersonatedFromUserId;
	}

	public PersonPresenceData impersonatedFromAccountId(String impersonatedFromAccountId) {
		this.impersonatedFromAccountId = impersonatedFromAccountId;
		return this;
	}

	/**
	 * Get impersonatedFromAccountId
	 * 
	 * @return impersonatedFromAccountId
	 **/
	@ApiModelProperty(value = "")
	public String getImpersonatedFromAccountId() {
		return impersonatedFromAccountId;
	}

	public void setImpersonatedFromAccountId(String impersonatedFromAccountId) {
		this.impersonatedFromAccountId = impersonatedFromAccountId;
	}

	public PersonPresenceData additionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
		return this;
	}

	/**
	 * Get additionalInfo
	 * 
	 * @return additionalInfo
	 **/
	@ApiModelProperty(value = "")
	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public PersonPresenceData authInfo(String authInfo) {
		this.authInfo = authInfo;
		return this;
	}

	/**
	 * Get authInfo
	 * 
	 * @return authInfo
	 **/
	@ApiModelProperty(value = "")
	public String getAuthInfo() {
		return authInfo;
	}

	public void setAuthInfo(String authInfo) {
		this.authInfo = authInfo;
	}

	public PersonPresenceData propagated(Boolean propagated) {
		this.propagated = propagated;
		return this;
	}

	/**
	 * Get propagated
	 * 
	 * @return propagated
	 **/
	@ApiModelProperty(value = "")
	public Boolean isPropagated() {
		return propagated;
	}

	public void setPropagated(Boolean propagated) {
		this.propagated = propagated;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonPresenceData personPresenceData = (PersonPresenceData) o;
		return Objects.equals(this.$type, personPresenceData.$type) &&
				Objects.equals(this.id, personPresenceData.id) &&
				Objects.equals(this.creationTimestamp, personPresenceData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, personPresenceData.modificationTimestamp) &&
				Objects.equals(this.accountId, personPresenceData.accountId) &&
				Objects.equals(this.joinedTimestamp, personPresenceData.joinedTimestamp) &&
				Objects.equals(this.leftTimestamp, personPresenceData.leftTimestamp) &&
				Objects.equals(this.personId, personPresenceData.personId) &&
				Objects.equals(this.deviceInfo, personPresenceData.deviceInfo) &&
				Objects.equals(this.impersonationType, personPresenceData.impersonationType) &&
				Objects.equals(this.impersonatedFromUserId, personPresenceData.impersonatedFromUserId) &&
				Objects.equals(this.impersonatedFromAccountId, personPresenceData.impersonatedFromAccountId) &&
				Objects.equals(this.additionalInfo, personPresenceData.additionalInfo) &&
				Objects.equals(this.authInfo, personPresenceData.authInfo) &&
				Objects.equals(this.propagated, personPresenceData.propagated);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, joinedTimestamp, leftTimestamp, personId, deviceInfo, impersonationType, impersonatedFromUserId, impersonatedFromAccountId, additionalInfo, authInfo, propagated);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonPresenceData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    joinedTimestamp: ").append(toIndentedString(joinedTimestamp)).append("\n");
		sb.append("    leftTimestamp: ").append(toIndentedString(leftTimestamp)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
		sb.append("    impersonationType: ").append(toIndentedString(impersonationType)).append("\n");
		sb.append("    impersonatedFromUserId: ").append(toIndentedString(impersonatedFromUserId)).append("\n");
		sb.append("    impersonatedFromAccountId: ").append(toIndentedString(impersonatedFromAccountId)).append("\n");
		sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
		sb.append("    authInfo: ").append(toIndentedString(authInfo)).append("\n");
		sb.append("    propagated: ").append(toIndentedString(propagated)).append("\n");
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
