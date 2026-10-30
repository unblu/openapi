
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
 * Data model object for a key encryption key. A key encryption key represents a key in an external key management system that&#39;s used to wrap and unwrap the
 * data encryption keys of an account.
 */
@ApiModel(description = "Data model object for a key encryption key. A key encryption key represents a key in an external key management system that's used to wrap and unwrap the data encryption keys of an account.")

@JsonPropertyOrder({
	KeyEncryptionKeyData.JSON_PROPERTY_$_TYPE,
	KeyEncryptionKeyData.JSON_PROPERTY_ID,
	KeyEncryptionKeyData.JSON_PROPERTY_ACCOUNT_ID,
	KeyEncryptionKeyData.JSON_PROPERTY_CREATION_TIMESTAMP,
	KeyEncryptionKeyData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	KeyEncryptionKeyData.JSON_PROPERTY_VERSION,
	KeyEncryptionKeyData.JSON_PROPERTY_NAME,
	KeyEncryptionKeyData.JSON_PROPERTY_TYPE,
	KeyEncryptionKeyData.JSON_PROPERTY_ENDPOINT,
	KeyEncryptionKeyData.JSON_PROPERTY_STATUS,
	KeyEncryptionKeyData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class KeyEncryptionKeyData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		KEYENCRYPTIONKEYDATA("KeyEncryptionKeyData");

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
			return TypeEnum.KEYENCRYPTIONKEYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.KEYENCRYPTIONKEYDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EKeyManagementSystemType type;

	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
	@JsonProperty(JSON_PROPERTY_ENDPOINT)
	private String endpoint;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private EKeyEncryptionKeyStatus status;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public KeyEncryptionKeyData $type(TypeEnum $type) {
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

	public KeyEncryptionKeyData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the key encryption key
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the key encryption key")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public KeyEncryptionKeyData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the key encryption key belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the key encryption key belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public KeyEncryptionKeyData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public KeyEncryptionKeyData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is
	 * ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn&#39;t written to storage and doesn&#39;t
	 * affect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn't written to storage and doesn't affect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public KeyEncryptionKeyData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity, incremented on each change. Updates must always be based on the latest version or they&#39;re rejected. When creating an object, the
	 * version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity, incremented on each change. Updates must always be based on the latest version or they're rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public KeyEncryptionKeyData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the key encryption key. Maximum length of 500 characters.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the key encryption key. Maximum length of 500 characters.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public KeyEncryptionKeyData type(EKeyManagementSystemType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EKeyManagementSystemType getType() {
		return type;
	}

	public void setType(EKeyManagementSystemType type) {
		this.type = type;
	}

	public KeyEncryptionKeyData endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	/**
	 * The endpoint of the key encryption key in the external key management system. Maximum length of 2000 characters. The combination of type and endpoint must be
	 * unique among the key encryption keys of an account.
	 * 
	 * @return endpoint
	 **/
	@ApiModelProperty(value = "The endpoint of the key encryption key in the external key management system. Maximum length of 2000 characters. The combination of type and endpoint must be unique among the key encryption keys of an account.")
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public KeyEncryptionKeyData status(EKeyEncryptionKeyStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public EKeyEncryptionKeyStatus getStatus() {
		return status;
	}

	public void setStatus(EKeyEncryptionKeyStatus status) {
		this.status = status;
	}

	public KeyEncryptionKeyData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * The timestamp at which the key encryption key most recently became the active key of the account. Read-only, set by the server.
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp at which the key encryption key most recently became the active key of the account. Read-only, set by the server.")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		KeyEncryptionKeyData keyEncryptionKeyData = (KeyEncryptionKeyData) o;
		return Objects.equals(this.$type, keyEncryptionKeyData.$type) &&
				Objects.equals(this.id, keyEncryptionKeyData.id) &&
				Objects.equals(this.accountId, keyEncryptionKeyData.accountId) &&
				Objects.equals(this.creationTimestamp, keyEncryptionKeyData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, keyEncryptionKeyData.modificationTimestamp) &&
				Objects.equals(this.version, keyEncryptionKeyData.version) &&
				Objects.equals(this.name, keyEncryptionKeyData.name) &&
				Objects.equals(this.type, keyEncryptionKeyData.type) &&
				Objects.equals(this.endpoint, keyEncryptionKeyData.endpoint) &&
				Objects.equals(this.status, keyEncryptionKeyData.status) &&
				Objects.equals(this.activationTimestamp, keyEncryptionKeyData.activationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, creationTimestamp, modificationTimestamp, version, name, type, endpoint, status, activationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class KeyEncryptionKeyData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
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
