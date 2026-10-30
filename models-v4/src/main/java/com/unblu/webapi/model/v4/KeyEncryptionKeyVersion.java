
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
 * Model of a version of a key encryption key. A key encryption key is a container for the versions the external key management system holds for it. Data
 * encryption keys are wrapped with a specific version, so the status that decides whether a version is still used for wrapping is tracked per version.
 */
@ApiModel(description = "Model of a version of a key encryption key. A key encryption key is a container for the versions the external key management system holds for it. Data encryption keys are wrapped with a specific version, so the status that decides whether a version is still used for wrapping is tracked per version.")

@JsonPropertyOrder({
	KeyEncryptionKeyVersion.JSON_PROPERTY_$_TYPE,
	KeyEncryptionKeyVersion.JSON_PROPERTY_ID,
	KeyEncryptionKeyVersion.JSON_PROPERTY_ACCOUNT_ID,
	KeyEncryptionKeyVersion.JSON_PROPERTY_KEY_ENCRYPTION_KEY_ID,
	KeyEncryptionKeyVersion.JSON_PROPERTY_VERSION_IDENTIFIER,
	KeyEncryptionKeyVersion.JSON_PROPERTY_STATUS,
	KeyEncryptionKeyVersion.JSON_PROPERTY_CREATION_TIMESTAMP,
	KeyEncryptionKeyVersion.JSON_PROPERTY_DRAINING_START_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class KeyEncryptionKeyVersion {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		KEYENCRYPTIONKEYVERSION("KeyEncryptionKeyVersion");

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
			return TypeEnum.KEYENCRYPTIONKEYVERSION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.KEYENCRYPTIONKEYVERSION;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_KEY_ENCRYPTION_KEY_ID = "keyEncryptionKeyId";
	@JsonProperty(JSON_PROPERTY_KEY_ENCRYPTION_KEY_ID)
	private String keyEncryptionKeyId;

	public static final String JSON_PROPERTY_VERSION_IDENTIFIER = "versionIdentifier";
	@JsonProperty(JSON_PROPERTY_VERSION_IDENTIFIER)
	private String versionIdentifier;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private EKeyEncryptionKeyStatus status;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_DRAINING_START_TIMESTAMP = "drainingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_DRAINING_START_TIMESTAMP)
	private Long drainingStartTimestamp;

	public KeyEncryptionKeyVersion $type(TypeEnum $type) {
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

	public KeyEncryptionKeyVersion id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public KeyEncryptionKeyVersion accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The ID of the account the version belongs to. It&#39;s always the account of the version&#39;s key encryption key. It&#39;s stored on the version as well so
	 * that a version looked up by its own ID can be checked against an account without loading the key encryption key first.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The ID of the account the version belongs to. It's always the account of the version's key encryption key. It's stored on the version as well so that a version looked up by its own ID can be checked against an account without loading the key encryption key first.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public KeyEncryptionKeyVersion keyEncryptionKeyId(String keyEncryptionKeyId) {
		this.keyEncryptionKeyId = keyEncryptionKeyId;
		return this;
	}

	/**
	 * The ID of the key encryption key this version belongs to.
	 * 
	 * @return keyEncryptionKeyId
	 **/
	@ApiModelProperty(value = "The ID of the key encryption key this version belongs to.")
	public String getKeyEncryptionKeyId() {
		return keyEncryptionKeyId;
	}

	public void setKeyEncryptionKeyId(String keyEncryptionKeyId) {
		this.keyEncryptionKeyId = keyEncryptionKeyId;
	}

	public KeyEncryptionKeyVersion versionIdentifier(String versionIdentifier) {
		this.versionIdentifier = versionIdentifier;
		return this;
	}

	/**
	 * The identifier of the version in the external key management system. Maximum length of 500 characters. The combination of key encryption key and version
	 * identifier must be unique.
	 * 
	 * @return versionIdentifier
	 **/
	@ApiModelProperty(value = "The identifier of the version in the external key management system. Maximum length of 500 characters. The combination of key encryption key and version identifier must be unique.")
	public String getVersionIdentifier() {
		return versionIdentifier;
	}

	public void setVersionIdentifier(String versionIdentifier) {
		this.versionIdentifier = versionIdentifier;
	}

	public KeyEncryptionKeyVersion status(EKeyEncryptionKeyStatus status) {
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

	public KeyEncryptionKeyVersion creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * The timestamp at which the version was created in the external key management system. Determines which version of a key encryption key is the latest one.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp at which the version was created in the external key management system. Determines which version of a key encryption key is the latest one.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public KeyEncryptionKeyVersion drainingStartTimestamp(Long drainingStartTimestamp) {
		this.drainingStartTimestamp = drainingStartTimestamp;
		return this;
	}

	/**
	 * The timestamp at which the version transitioned to status &#x60;DRAINING&#x60;, or null while it isn&#39;t draining. Draining waits until data encryption
	 * keys that consumers cached before this point are guaranteed to have expired, so the version can&#39;t receive new data anymore and the set of entities to
	 * re-wrap is final before the first batch runs.
	 * 
	 * @return drainingStartTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp at which the version transitioned to status `DRAINING`, or null while it isn't draining. Draining waits until data encryption keys that consumers cached before this point are guaranteed to have expired, so the version can't receive new data anymore and the set of entities to re-wrap is final before the first batch runs.")
	public Long getDrainingStartTimestamp() {
		return drainingStartTimestamp;
	}

	public void setDrainingStartTimestamp(Long drainingStartTimestamp) {
		this.drainingStartTimestamp = drainingStartTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		KeyEncryptionKeyVersion keyEncryptionKeyVersion = (KeyEncryptionKeyVersion) o;
		return Objects.equals(this.$type, keyEncryptionKeyVersion.$type) &&
				Objects.equals(this.id, keyEncryptionKeyVersion.id) &&
				Objects.equals(this.accountId, keyEncryptionKeyVersion.accountId) &&
				Objects.equals(this.keyEncryptionKeyId, keyEncryptionKeyVersion.keyEncryptionKeyId) &&
				Objects.equals(this.versionIdentifier, keyEncryptionKeyVersion.versionIdentifier) &&
				Objects.equals(this.status, keyEncryptionKeyVersion.status) &&
				Objects.equals(this.creationTimestamp, keyEncryptionKeyVersion.creationTimestamp) &&
				Objects.equals(this.drainingStartTimestamp, keyEncryptionKeyVersion.drainingStartTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, keyEncryptionKeyId, versionIdentifier, status, creationTimestamp, drainingStartTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class KeyEncryptionKeyVersion {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    keyEncryptionKeyId: ").append(toIndentedString(keyEncryptionKeyId)).append("\n");
		sb.append("    versionIdentifier: ").append(toIndentedString(versionIdentifier)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    drainingStartTimestamp: ").append(toIndentedString(drainingStartTimestamp)).append("\n");
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
