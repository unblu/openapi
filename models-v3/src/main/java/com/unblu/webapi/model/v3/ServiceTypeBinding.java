
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
 * Representation of type binding. It reference either to a &#x60;ServiceType&#x60; or a simple well known type
 */
@ApiModel(description = "Representation of type binding. It reference either to a `ServiceType` or a simple well known type")

@JsonPropertyOrder({
	ServiceTypeBinding.JSON_PROPERTY_$_TYPE,
	ServiceTypeBinding.JSON_PROPERTY_TYPE_NAME,
	ServiceTypeBinding.JSON_PROPERTY_IS_ARRAY,
	ServiceTypeBinding.JSON_PROPERTY_NUM_ARRAY_DIM,
	ServiceTypeBinding.JSON_PROPERTY_IS_ENUM,
	ServiceTypeBinding.JSON_PROPERTY_TYPE_ARGS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServiceTypeBinding {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICETYPEBINDING("ServiceTypeBinding");

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
			return TypeEnum.SERVICETYPEBINDING;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICETYPEBINDING;

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

	public ServiceTypeBinding $type(TypeEnum $type) {
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

	public ServiceTypeBinding typeName(String typeName) {
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

	public ServiceTypeBinding isArray(Boolean isArray) {
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

	public ServiceTypeBinding numArrayDim(Integer numArrayDim) {
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

	public ServiceTypeBinding isEnum(Boolean isEnum) {
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

	public ServiceTypeBinding typeArgs(List<ServiceTypeBinding> typeArgs) {
		this.typeArgs = typeArgs;
		return this;
	}

	public ServiceTypeBinding addTypeArgsItem(ServiceTypeBinding typeArgsItem) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceTypeBinding serviceTypeBinding = (ServiceTypeBinding) o;
		return Objects.equals(this.$type, serviceTypeBinding.$type) &&
				Objects.equals(this.typeName, serviceTypeBinding.typeName) &&
				Objects.equals(this.isArray, serviceTypeBinding.isArray) &&
				Objects.equals(this.numArrayDim, serviceTypeBinding.numArrayDim) &&
				Objects.equals(this.isEnum, serviceTypeBinding.isEnum) &&
				Objects.equals(this.typeArgs, serviceTypeBinding.typeArgs);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, typeName, isArray, numArrayDim, isEnum, typeArgs);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceTypeBinding {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
		sb.append("    isArray: ").append(toIndentedString(isArray)).append("\n");
		sb.append("    numArrayDim: ").append(toIndentedString(numArrayDim)).append("\n");
		sb.append("    isEnum: ").append(toIndentedString(isEnum)).append("\n");
		sb.append("    typeArgs: ").append(toIndentedString(typeArgs)).append("\n");
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
