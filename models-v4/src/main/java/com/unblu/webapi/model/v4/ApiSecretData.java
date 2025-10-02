
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
 * The Data entity for the API Secret. The secret in clear text can only be found
 * in&#x60;com.unblu.core.shared.storage.authentication.model.ApiSecretCreateResult&#x60;
 */
@ApiModel(description = "The Data entity for the API Secret. The secret in clear text can only be found in`com.unblu.core.shared.storage.authentication.model.ApiSecretCreateResult`")

@JsonPropertyOrder({
	ApiSecretData.JSON_PROPERTY_$_TYPE,
	ApiSecretData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ApiSecretData.JSON_PROPERTY_NAME,
	ApiSecretData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	ApiSecretData.JSON_PROPERTY_LAST_USED_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ApiSecretData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		APISECRETDATA("ApiSecretData");

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
			return TypeEnum.APISECRETDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.APISECRETDATA;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_LAST_USED_TIMESTAMP = "lastUsedTimestamp";
	@JsonProperty(JSON_PROPERTY_LAST_USED_TIMESTAMP)
	private Long lastUsedTimestamp;

	public ApiSecretData $type(TypeEnum $type) {
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

	public ApiSecretData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Timestamp when the API secret was created, defined when the secret is first stored in Unblu. Any value you include when creating an API secret is ignored and
	 * can therefore be omitted then. If you set the timestamp, Unblu returns the same value but doesn&#39;t store it.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the API secret was created, defined when the secret is first stored in Unblu. Any value you include when creating an API secret is ignored and can therefore be omitted then. If you set the timestamp, Unblu returns the same value but doesn't store it.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ApiSecretData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the API secret. The name must be unique per service principal
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the API secret. The name must be unique per service principal")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApiSecretData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Expiration timestamp of the API secret
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Expiration timestamp of the API secret")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public ApiSecretData lastUsedTimestamp(Long lastUsedTimestamp) {
		this.lastUsedTimestamp = lastUsedTimestamp;
		return this;
	}

	/**
	 * Timestamp when the API secret was last used
	 * 
	 * @return lastUsedTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the API secret was last used")
	public Long getLastUsedTimestamp() {
		return lastUsedTimestamp;
	}

	public void setLastUsedTimestamp(Long lastUsedTimestamp) {
		this.lastUsedTimestamp = lastUsedTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiSecretData apiSecretData = (ApiSecretData) o;
		return Objects.equals(this.$type, apiSecretData.$type) &&
				Objects.equals(this.creationTimestamp, apiSecretData.creationTimestamp) &&
				Objects.equals(this.name, apiSecretData.name) &&
				Objects.equals(this.expirationTimestamp, apiSecretData.expirationTimestamp) &&
				Objects.equals(this.lastUsedTimestamp, apiSecretData.lastUsedTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, creationTimestamp, name, expirationTimestamp, lastUsedTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApiSecretData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    lastUsedTimestamp: ").append(toIndentedString(lastUsedTimestamp)).append("\n");
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
