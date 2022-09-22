
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
 * Element of the url path to a resource. Can either be static or dynamic part
 */
@ApiModel(description = "Element of the url path to a resource. Can either be static or dynamic part")

@JsonPropertyOrder({
	ResourcePathElement.JSON_PROPERTY_$_TYPE,
	ResourcePathElement.JSON_PROPERTY_DOCUMENTATION,
	ResourcePathElement.JSON_PROPERTY_NAME,
	ResourcePathElement.JSON_PROPERTY_DYNAMIC,
	ResourcePathElement.JSON_PROPERTY_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ResourcePathElement {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RESOURCEPATHELEMENT("ResourcePathElement");

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
			return TypeEnum.RESOURCEPATHELEMENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RESOURCEPATHELEMENT;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DYNAMIC = "dynamic";
	@JsonProperty(JSON_PROPERTY_DYNAMIC)
	private Boolean dynamic;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private String type;

	public ResourcePathElement $type(TypeEnum $type) {
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

	public ResourcePathElement documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the element
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the element")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public ResourcePathElement name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the path element
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the path element")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ResourcePathElement dynamic(Boolean dynamic) {
		this.dynamic = dynamic;
		return this;
	}

	/**
	 * True if it is a variable part
	 * 
	 * @return dynamic
	 **/
	@ApiModelProperty(value = "True if it is a variable part")
	public Boolean isDynamic() {
		return dynamic;
	}

	public void setDynamic(Boolean dynamic) {
		this.dynamic = dynamic;
	}

	public ResourcePathElement type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Type of the element
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "Type of the element")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ResourcePathElement resourcePathElement = (ResourcePathElement) o;
		return Objects.equals(this.$type, resourcePathElement.$type) &&
				Objects.equals(this.documentation, resourcePathElement.documentation) &&
				Objects.equals(this.name, resourcePathElement.name) &&
				Objects.equals(this.dynamic, resourcePathElement.dynamic) &&
				Objects.equals(this.type, resourcePathElement.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, documentation, name, dynamic, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ResourcePathElement {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    dynamic: ").append(toIndentedString(dynamic)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
