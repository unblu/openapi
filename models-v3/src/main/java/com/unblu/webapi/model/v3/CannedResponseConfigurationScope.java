
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
 * Scope definition for CannedResponses
 */
@ApiModel(description = "Scope definition for CannedResponses")

@JsonPropertyOrder({
	CannedResponseConfigurationScope.JSON_PROPERTY_$_TYPE,
	CannedResponseConfigurationScope.JSON_PROPERTY_NAME,
	CannedResponseConfigurationScope.JSON_PROPERTY_OWNER_ID,
	CannedResponseConfigurationScope.JSON_PROPERTY_OWNER_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CannedResponseConfigurationScope {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CANNEDRESPONSECONFIGURATIONSCOPE("CannedResponseConfigurationScope");

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
			return TypeEnum.CANNEDRESPONSECONFIGURATIONSCOPE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CANNEDRESPONSECONFIGURATIONSCOPE;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
	@JsonProperty(JSON_PROPERTY_OWNER_ID)
	private String ownerId;

	public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
	@JsonProperty(JSON_PROPERTY_OWNER_TYPE)
	private EPropertyOwnerType ownerType;

	public CannedResponseConfigurationScope $type(TypeEnum $type) {
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

	public CannedResponseConfigurationScope name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the scope
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the scope")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CannedResponseConfigurationScope ownerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * Id of the owner. It defines to whom the configuration is assigned
	 * 
	 * @return ownerId
	 **/
	@ApiModelProperty(value = "Id of the owner. It defines to whom the configuration is assigned")
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public CannedResponseConfigurationScope ownerType(EPropertyOwnerType ownerType) {
		this.ownerType = ownerType;
		return this;
	}

	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@ApiModelProperty(value = "")
	public EPropertyOwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(EPropertyOwnerType ownerType) {
		this.ownerType = ownerType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CannedResponseConfigurationScope cannedResponseConfigurationScope = (CannedResponseConfigurationScope) o;
		return Objects.equals(this.$type, cannedResponseConfigurationScope.$type) &&
				Objects.equals(this.name, cannedResponseConfigurationScope.name) &&
				Objects.equals(this.ownerId, cannedResponseConfigurationScope.ownerId) &&
				Objects.equals(this.ownerType, cannedResponseConfigurationScope.ownerType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, name, ownerId, ownerType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CannedResponseConfigurationScope {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
		sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
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
