
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
 * ApiSecretCreateBody
 */

@JsonPropertyOrder({
	ApiSecretCreateBody.JSON_PROPERTY_$_TYPE,
	ApiSecretCreateBody.JSON_PROPERTY_NAME,
	ApiSecretCreateBody.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ApiSecretCreateBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		APISECRETCREATEBODY("ApiSecretCreateBody");

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
			return TypeEnum.APISECRETCREATEBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.APISECRETCREATEBODY;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public ApiSecretCreateBody $type(TypeEnum $type) {
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

	public ApiSecretCreateBody name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the API secret. The name of the secret must be unique per service principal the secret belongs to.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the API secret. The name of the secret must be unique per service principal the secret belongs to.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ApiSecretCreateBody expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Expiration time of the API secret. The minimum value is 1 minute, the maximum value is 2 years in the future.
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Expiration time of the API secret. The minimum value is 1 minute, the maximum value is 2 years in the future.")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApiSecretCreateBody apiSecretCreateBody = (ApiSecretCreateBody) o;
		return Objects.equals(this.$type, apiSecretCreateBody.$type) &&
				Objects.equals(this.name, apiSecretCreateBody.name) &&
				Objects.equals(this.expirationTimestamp, apiSecretCreateBody.expirationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, name, expirationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApiSecretCreateBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
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
