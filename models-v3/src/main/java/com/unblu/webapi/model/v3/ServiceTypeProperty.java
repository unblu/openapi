
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
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
 * Representation of a property of a type
 */
@ApiModel(description = "Representation of a property of a type")

@JsonPropertyOrder({
	ServiceTypeProperty.JSON_PROPERTY_$_TYPE,
	ServiceTypeProperty.JSON_PROPERTY_TYPE_NAME,
	ServiceTypeProperty.JSON_PROPERTY_IS_ARRAY,
	ServiceTypeProperty.JSON_PROPERTY_NUM_ARRAY_DIM,
	ServiceTypeProperty.JSON_PROPERTY_IS_ENUM,
	ServiceTypeProperty.JSON_PROPERTY_TYPE_ARGS,
	ServiceTypeProperty.JSON_PROPERTY_DOCUMENTATION,
	ServiceTypeProperty.JSON_PROPERTY_NAME,
	ServiceTypeProperty.JSON_PROPERTY_EXPANDABLE_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServiceTypeProperty {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICETYPEPROPERTY("ServiceTypeProperty");

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
			return TypeEnum.SERVICETYPEPROPERTY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICETYPEPROPERTY;

	public static final String JSON_PROPERTY_TYPE_NAME = "typeName";
	@JsonProperty(JSON_PROPERTY_TYPE_NAME)
	private String typeName;

	public static final String JSON_PROPERTY_IS_ARRAY = "isArray";
	@JsonProperty(JSON_PROPERTY_IS_ARRAY)
	private Boolean isArray;

	public static final String JSON_PROPERTY_NUM_ARRAY_DIM = "numArrayDim";
	@JsonProperty(JSON_PROPERTY_NUM_ARRAY_DIM)
	private Integer numArrayDim;

	public static final String JSON_PROPERTY_IS_ENUM = "isEnum";
	@JsonProperty(JSON_PROPERTY_IS_ENUM)
	private Boolean isEnum;

	public static final String JSON_PROPERTY_TYPE_ARGS = "typeArgs";
	@JsonProperty(JSON_PROPERTY_TYPE_ARGS)
	private List<ServiceTypeBinding> typeArgs = null;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_EXPANDABLE_TYPE = "expandableType";
	@JsonProperty(JSON_PROPERTY_EXPANDABLE_TYPE)
	private String expandableType;

	public ServiceTypeProperty $type(TypeEnum $type) {
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

	public ServiceTypeProperty typeName(String typeName) {
		this.typeName = typeName;
		return this;
	}

	/**
	 * Name of the type
	 * 
	 * @return typeName
	 **/
	@ApiModelProperty(value = "Name of the type")
	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public ServiceTypeProperty isArray(Boolean isArray) {
		this.isArray = isArray;
		return this;
	}

	/**
	 * True if the type is an array
	 * 
	 * @return isArray
	 **/
	@ApiModelProperty(value = "True if the type is an array")
	public Boolean isIsArray() {
		return isArray;
	}

	public void setIsArray(Boolean isArray) {
		this.isArray = isArray;
	}

	public ServiceTypeProperty numArrayDim(Integer numArrayDim) {
		this.numArrayDim = numArrayDim;
		return this;
	}

	/**
	 * 0 if type is not an array. Otherwise the property defines the number of dimension of the property. E.g. with 2 a string type would be a 2 dim string array:
	 * string[][]
	 * 
	 * @return numArrayDim
	 **/
	@ApiModelProperty(value = "0 if type is not an array. Otherwise the property defines the number of dimension of the property. E.g. with 2 a string type would be a 2 dim string array: string[][]")
	public Integer getNumArrayDim() {
		return numArrayDim;
	}

	public void setNumArrayDim(Integer numArrayDim) {
		this.numArrayDim = numArrayDim;
	}

	public ServiceTypeProperty isEnum(Boolean isEnum) {
		this.isEnum = isEnum;
		return this;
	}

	/**
	 * True if the type is an enum
	 * 
	 * @return isEnum
	 **/
	@ApiModelProperty(value = "True if the type is an enum")
	public Boolean isIsEnum() {
		return isEnum;
	}

	public void setIsEnum(Boolean isEnum) {
		this.isEnum = isEnum;
	}

	public ServiceTypeProperty typeArgs(List<ServiceTypeBinding> typeArgs) {
		this.typeArgs = typeArgs;
		return this;
	}

	public ServiceTypeProperty addTypeArgsItem(ServiceTypeBinding typeArgsItem) {
		if (this.typeArgs == null) {
			this.typeArgs = new ArrayList<>();
		}
		this.typeArgs.add(typeArgsItem);
		return this;
	}

	/**
	 * Type arguments for generic types. E.g. a list has generic types: list&amp;lt;string&amp;gt; generic type would be string
	 * 
	 * @return typeArgs
	 **/
	@ApiModelProperty(value = "Type arguments for generic types. E.g. a list has generic types: list&lt;string&gt; generic type would be string")
	public List<ServiceTypeBinding> getTypeArgs() {
		return typeArgs;
	}

	public void setTypeArgs(List<ServiceTypeBinding> typeArgs) {
		this.typeArgs = typeArgs;
	}

	public ServiceTypeProperty documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the property
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the property")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public ServiceTypeProperty name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * name of the property
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "name of the property")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceTypeProperty expandableType(String expandableType) {
		this.expandableType = expandableType;
		return this;
	}

	/**
	 * type if this property represent an id that can be expanded
	 * 
	 * @return expandableType
	 **/
	@ApiModelProperty(value = "type if this property represent an id that can be expanded")
	public String getExpandableType() {
		return expandableType;
	}

	public void setExpandableType(String expandableType) {
		this.expandableType = expandableType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceTypeProperty serviceTypeProperty = (ServiceTypeProperty) o;
		return Objects.equals(this.$type, serviceTypeProperty.$type) &&
				Objects.equals(this.typeName, serviceTypeProperty.typeName) &&
				Objects.equals(this.isArray, serviceTypeProperty.isArray) &&
				Objects.equals(this.numArrayDim, serviceTypeProperty.numArrayDim) &&
				Objects.equals(this.isEnum, serviceTypeProperty.isEnum) &&
				Objects.equals(this.typeArgs, serviceTypeProperty.typeArgs) &&
				Objects.equals(this.documentation, serviceTypeProperty.documentation) &&
				Objects.equals(this.name, serviceTypeProperty.name) &&
				Objects.equals(this.expandableType, serviceTypeProperty.expandableType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, typeName, isArray, numArrayDim, isEnum, typeArgs, documentation, name, expandableType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceTypeProperty {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
		sb.append("    isArray: ").append(toIndentedString(isArray)).append("\n");
		sb.append("    numArrayDim: ").append(toIndentedString(numArrayDim)).append("\n");
		sb.append("    isEnum: ").append(toIndentedString(isEnum)).append("\n");
		sb.append("    typeArgs: ").append(toIndentedString(typeArgs)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    expandableType: ").append(toIndentedString(expandableType)).append("\n");
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
