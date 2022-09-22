
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
 * Representation of a complex type which can be transferred between client and server
 */
@ApiModel(description = "Representation of a complex type which can be transferred between client and server")

@JsonPropertyOrder({
	ServiceType.JSON_PROPERTY_$_TYPE,
	ServiceType.JSON_PROPERTY_DOCUMENTATION,
	ServiceType.JSON_PROPERTY_NAME,
	ServiceType.JSON_PROPERTY_IMPLEMENTATION_NAME,
	ServiceType.JSON_PROPERTY_IS_ENUM,
	ServiceType.JSON_PROPERTY_ADDITIONAL_EXPANDABLES,
	ServiceType.JSON_PROPERTY_PROPERTIES,
	ServiceType.JSON_PROPERTY_STATIC_PROPERTIES,
	ServiceType.JSON_PROPERTY_IMPLEMENTATION_TYPES,
	ServiceType.JSON_PROPERTY_DISCRIMINATOR_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServiceType {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICETYPE("ServiceType");

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
			return TypeEnum.SERVICETYPE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICETYPE;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_IMPLEMENTATION_NAME = "implementationName";
	@JsonProperty(JSON_PROPERTY_IMPLEMENTATION_NAME)
	private String implementationName;

	public static final String JSON_PROPERTY_IS_ENUM = "isEnum";
	@JsonProperty(JSON_PROPERTY_IS_ENUM)
	private Boolean isEnum;

	public static final String JSON_PROPERTY_ADDITIONAL_EXPANDABLES = "additionalExpandables";
	@JsonProperty(JSON_PROPERTY_ADDITIONAL_EXPANDABLES)
	private List<String> additionalExpandables = null;

	public static final String JSON_PROPERTY_PROPERTIES = "properties";
	@JsonProperty(JSON_PROPERTY_PROPERTIES)
	private List<ServiceTypeProperty> properties = null;

	public static final String JSON_PROPERTY_STATIC_PROPERTIES = "staticProperties";
	@JsonProperty(JSON_PROPERTY_STATIC_PROPERTIES)
	private List<ServiceTypeProperty> staticProperties = null;

	public static final String JSON_PROPERTY_IMPLEMENTATION_TYPES = "implementationTypes";
	@JsonProperty(JSON_PROPERTY_IMPLEMENTATION_TYPES)
	private List<ServiceTypeBinding> implementationTypes = null;

	public static final String JSON_PROPERTY_DISCRIMINATOR_NAME = "discriminatorName";
	@JsonProperty(JSON_PROPERTY_DISCRIMINATOR_NAME)
	private String discriminatorName;

	public ServiceType $type(TypeEnum $type) {
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

	public ServiceType documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the type
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the type")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public ServiceType name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the type
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the type")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceType implementationName(String implementationName) {
		this.implementationName = implementationName;
		return this;
	}

	/**
	 * Name of the service inside unblu. Only needed to match references in documentation
	 * 
	 * @return implementationName
	 **/
	@ApiModelProperty(value = "Name of the service inside unblu. Only needed to match references in documentation")
	public String getImplementationName() {
		return implementationName;
	}

	public void setImplementationName(String implementationName) {
		this.implementationName = implementationName;
	}

	public ServiceType isEnum(Boolean isEnum) {
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

	public ServiceType additionalExpandables(List<String> additionalExpandables) {
		this.additionalExpandables = additionalExpandables;
		return this;
	}

	public ServiceType addAdditionalExpandablesItem(String additionalExpandablesItem) {
		if (this.additionalExpandables == null) {
			this.additionalExpandables = new ArrayList<>();
		}
		this.additionalExpandables.add(additionalExpandablesItem);
		return this;
	}

	/**
	 * Name of the properties that can be expanded to the type
	 * 
	 * @return additionalExpandables
	 **/
	@ApiModelProperty(value = "Name of the properties that can be expanded to the type")
	public List<String> getAdditionalExpandables() {
		return additionalExpandables;
	}

	public void setAdditionalExpandables(List<String> additionalExpandables) {
		this.additionalExpandables = additionalExpandables;
	}

	public ServiceType properties(List<ServiceTypeProperty> properties) {
		this.properties = properties;
		return this;
	}

	public ServiceType addPropertiesItem(ServiceTypeProperty propertiesItem) {
		if (this.properties == null) {
			this.properties = new ArrayList<>();
		}
		this.properties.add(propertiesItem);
		return this;
	}

	/**
	 * All properties of the type
	 * 
	 * @return properties
	 **/
	@ApiModelProperty(value = "All properties of the type")
	public List<ServiceTypeProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<ServiceTypeProperty> properties) {
		this.properties = properties;
	}

	public ServiceType staticProperties(List<ServiceTypeProperty> staticProperties) {
		this.staticProperties = staticProperties;
		return this;
	}

	public ServiceType addStaticPropertiesItem(ServiceTypeProperty staticPropertiesItem) {
		if (this.staticProperties == null) {
			this.staticProperties = new ArrayList<>();
		}
		this.staticProperties.add(staticPropertiesItem);
		return this;
	}

	/**
	 * Static properties of the type. Mainly used for enum constants
	 * 
	 * @return staticProperties
	 **/
	@ApiModelProperty(value = "Static properties of the type. Mainly used for enum constants")
	public List<ServiceTypeProperty> getStaticProperties() {
		return staticProperties;
	}

	public void setStaticProperties(List<ServiceTypeProperty> staticProperties) {
		this.staticProperties = staticProperties;
	}

	public ServiceType implementationTypes(List<ServiceTypeBinding> implementationTypes) {
		this.implementationTypes = implementationTypes;
		return this;
	}

	public ServiceType addImplementationTypesItem(ServiceTypeBinding implementationTypesItem) {
		if (this.implementationTypes == null) {
			this.implementationTypes = new ArrayList<>();
		}
		this.implementationTypes.add(implementationTypesItem);
		return this;
	}

	/**
	 * If this type is an interface, list of types that implement it.
	 * 
	 * @return implementationTypes
	 **/
	@ApiModelProperty(value = "If this type is an interface, list of types that implement it.")
	public List<ServiceTypeBinding> getImplementationTypes() {
		return implementationTypes;
	}

	public void setImplementationTypes(List<ServiceTypeBinding> implementationTypes) {
		this.implementationTypes = implementationTypes;
	}

	public ServiceType discriminatorName(String discriminatorName) {
		this.discriminatorName = discriminatorName;
		return this;
	}

	/**
	 * If this type has multiple implementation types, name of the property that is used as discriminator between the concrete types
	 * 
	 * @return discriminatorName
	 **/
	@ApiModelProperty(value = "If this type has multiple implementation types, name of the property that is used as discriminator between the concrete types")
	public String getDiscriminatorName() {
		return discriminatorName;
	}

	public void setDiscriminatorName(String discriminatorName) {
		this.discriminatorName = discriminatorName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceType serviceType = (ServiceType) o;
		return Objects.equals(this.$type, serviceType.$type) &&
				Objects.equals(this.documentation, serviceType.documentation) &&
				Objects.equals(this.name, serviceType.name) &&
				Objects.equals(this.implementationName, serviceType.implementationName) &&
				Objects.equals(this.isEnum, serviceType.isEnum) &&
				Objects.equals(this.additionalExpandables, serviceType.additionalExpandables) &&
				Objects.equals(this.properties, serviceType.properties) &&
				Objects.equals(this.staticProperties, serviceType.staticProperties) &&
				Objects.equals(this.implementationTypes, serviceType.implementationTypes) &&
				Objects.equals(this.discriminatorName, serviceType.discriminatorName);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, documentation, name, implementationName, isEnum, additionalExpandables, properties, staticProperties, implementationTypes, discriminatorName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceType {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    implementationName: ").append(toIndentedString(implementationName)).append("\n");
		sb.append("    isEnum: ").append(toIndentedString(isEnum)).append("\n");
		sb.append("    additionalExpandables: ").append(toIndentedString(additionalExpandables)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
		sb.append("    staticProperties: ").append(toIndentedString(staticProperties)).append("\n");
		sb.append("    implementationTypes: ").append(toIndentedString(implementationTypes)).append("\n");
		sb.append("    discriminatorName: ").append(toIndentedString(discriminatorName)).append("\n");
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
