
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
 * Request body for setting the active key encryption key of an account.
 */
@ApiModel(description = "Request body for setting the active key encryption key of an account.")

@JsonPropertyOrder({
	KeyEncryptionKeyActivationBody.JSON_PROPERTY_$_TYPE,
	KeyEncryptionKeyActivationBody.JSON_PROPERTY_NAME,
	KeyEncryptionKeyActivationBody.JSON_PROPERTY_TYPE,
	KeyEncryptionKeyActivationBody.JSON_PROPERTY_ENDPOINT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class KeyEncryptionKeyActivationBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		KEYENCRYPTIONKEYACTIVATIONBODY("KeyEncryptionKeyActivationBody");

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
			return TypeEnum.KEYENCRYPTIONKEYACTIVATIONBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.KEYENCRYPTIONKEYACTIVATIONBODY;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EKeyManagementSystemType type;

	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
	@JsonProperty(JSON_PROPERTY_ENDPOINT)
	private String endpoint;

	public KeyEncryptionKeyActivationBody $type(TypeEnum $type) {
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

	public KeyEncryptionKeyActivationBody name(String name) {
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

	public KeyEncryptionKeyActivationBody type(EKeyManagementSystemType type) {
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

	public KeyEncryptionKeyActivationBody endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	/**
	 * The endpoint of the key encryption key in the external key management system. Maximum length of 2000 characters.
	 * 
	 * @return endpoint
	 **/
	@ApiModelProperty(value = "The endpoint of the key encryption key in the external key management system. Maximum length of 2000 characters.")
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		KeyEncryptionKeyActivationBody keyEncryptionKeyActivationBody = (KeyEncryptionKeyActivationBody) o;
		return Objects.equals(this.$type, keyEncryptionKeyActivationBody.$type) &&
				Objects.equals(this.name, keyEncryptionKeyActivationBody.name) &&
				Objects.equals(this.type, keyEncryptionKeyActivationBody.type) &&
				Objects.equals(this.endpoint, keyEncryptionKeyActivationBody.endpoint);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, name, type, endpoint);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class KeyEncryptionKeyActivationBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
