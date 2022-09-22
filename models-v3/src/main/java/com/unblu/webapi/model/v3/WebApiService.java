
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
 * Representation of a Web API service with all its different containing resources
 */
@ApiModel(description = "Representation of a Web API service with all its different containing resources")

@JsonPropertyOrder({
	WebApiService.JSON_PROPERTY_$_TYPE,
	WebApiService.JSON_PROPERTY_DOCUMENTATION,
	WebApiService.JSON_PROPERTY_NAME,
	WebApiService.JSON_PROPERTY_IMPLEMENTATION_NAME,
	WebApiService.JSON_PROPERTY_RESOURCES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebApiService {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WEBAPISERVICE("WebApiService");

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
			return TypeEnum.WEBAPISERVICE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WEBAPISERVICE;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_IMPLEMENTATION_NAME = "implementationName";
	@JsonProperty(JSON_PROPERTY_IMPLEMENTATION_NAME)
	private String implementationName;

	public static final String JSON_PROPERTY_RESOURCES = "resources";
	@JsonProperty(JSON_PROPERTY_RESOURCES)
	private List<ResourceMetadata> resources = null;

	public WebApiService $type(TypeEnum $type) {
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

	public WebApiService documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the service
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the service")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public WebApiService name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the service
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the service")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WebApiService implementationName(String implementationName) {
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

	public WebApiService resources(List<ResourceMetadata> resources) {
		this.resources = resources;
		return this;
	}

	public WebApiService addResourcesItem(ResourceMetadata resourcesItem) {
		if (this.resources == null) {
			this.resources = new ArrayList<>();
		}
		this.resources.add(resourcesItem);
		return this;
	}

	/**
	 * All resources of the service
	 * 
	 * @return resources
	 **/
	@ApiModelProperty(value = "All resources of the service")
	public List<ResourceMetadata> getResources() {
		return resources;
	}

	public void setResources(List<ResourceMetadata> resources) {
		this.resources = resources;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebApiService webApiService = (WebApiService) o;
		return Objects.equals(this.$type, webApiService.$type) &&
				Objects.equals(this.documentation, webApiService.documentation) &&
				Objects.equals(this.name, webApiService.name) &&
				Objects.equals(this.implementationName, webApiService.implementationName) &&
				Objects.equals(this.resources, webApiService.resources);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, documentation, name, implementationName, resources);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebApiService {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    implementationName: ").append(toIndentedString(implementationName)).append("\n");
		sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
