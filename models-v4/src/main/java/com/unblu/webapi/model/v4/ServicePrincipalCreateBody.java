
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
 * Model for creating new service principals
 */
@ApiModel(description = "Model for creating new service principals")

@JsonPropertyOrder({
	ServicePrincipalCreateBody.JSON_PROPERTY_$_TYPE,
	ServicePrincipalCreateBody.JSON_PROPERTY_NAME,
	ServicePrincipalCreateBody.JSON_PROPERTY_DESCRIPTION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServicePrincipalCreateBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICEPRINCIPALCREATEBODY("ServicePrincipalCreateBody");

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
			return TypeEnum.SERVICEPRINCIPALCREATEBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICEPRINCIPALCREATEBODY;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public ServicePrincipalCreateBody $type(TypeEnum $type) {
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

	public ServicePrincipalCreateBody name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the service principal. Must be unique within the account.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the service principal. Must be unique within the account.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServicePrincipalCreateBody description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the service principal
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the service principal")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServicePrincipalCreateBody servicePrincipalCreateBody = (ServicePrincipalCreateBody) o;
		return Objects.equals(this.$type, servicePrincipalCreateBody.$type) &&
				Objects.equals(this.name, servicePrincipalCreateBody.name) &&
				Objects.equals(this.description, servicePrincipalCreateBody.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, name, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServicePrincipalCreateBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
