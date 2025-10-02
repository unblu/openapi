
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ApiSecretCreateResult
 */

@JsonPropertyOrder({
	ApiSecretCreateResult.JSON_PROPERTY_$_TYPE,
	ApiSecretCreateResult.JSON_PROPERTY_ID,
	ApiSecretCreateResult.JSON_PROPERTY_CREATION_TIMESTAMP,
	ApiSecretCreateResult.JSON_PROPERTY_NAME,
	ApiSecretCreateResult.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	ApiSecretCreateResult.JSON_PROPERTY_SECRET,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ApiSecretCreateResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		APISECRETCREATERESULT("ApiSecretCreateResult");

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
			return TypeEnum.APISECRETCREATERESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.APISECRETCREATERESULT;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_SECRET = "secret";
	@JsonProperty(JSON_PROPERTY_SECRET)
	private String secret;

	public ApiSecretCreateResult $type(TypeEnum $type) {
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

	public ApiSecretCreateResult id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the API secret
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the API secret")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ApiSecretCreateResult creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Timestamp, in ms, when the API secret was created
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp, in ms, when the API secret was created")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ApiSecretCreateResult name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the API secret
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the API secret")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApiSecretCreateResult expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Timestamp when the API secret expires
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the API secret expires")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public ApiSecretCreateResult secret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * A string representation of the API secret. The secret must be stored, as it can&#39;t be retrieved again later.
	 * 
	 * @return secret
	 **/
	@ApiModelProperty(value = "A string representation of the API secret. The secret must be stored, as it can't be retrieved again later.")
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiSecretCreateResult apiSecretCreateResult = (ApiSecretCreateResult) o;
		return Objects.equals(this.$type, apiSecretCreateResult.$type) &&
				Objects.equals(this.id, apiSecretCreateResult.id) &&
				Objects.equals(this.creationTimestamp, apiSecretCreateResult.creationTimestamp) &&
				Objects.equals(this.name, apiSecretCreateResult.name) &&
				Objects.equals(this.expirationTimestamp, apiSecretCreateResult.expirationTimestamp) &&
				Objects.equals(this.secret, apiSecretCreateResult.secret);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, name, expirationTimestamp, secret);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApiSecretCreateResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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
