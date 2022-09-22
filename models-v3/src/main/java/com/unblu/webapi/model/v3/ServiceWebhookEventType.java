
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
 * Webhook event type with all its properties
 */
@ApiModel(description = "Webhook event type with all its properties")

@JsonPropertyOrder({
	ServiceWebhookEventType.JSON_PROPERTY_$_TYPE,
	ServiceWebhookEventType.JSON_PROPERTY_DOCUMENTATION,
	ServiceWebhookEventType.JSON_PROPERTY_NAME,
	ServiceWebhookEventType.JSON_PROPERTY_IMPLEMENTATION_NAME,
	ServiceWebhookEventType.JSON_PROPERTY_REGISTRATION_LOCATION,
	ServiceWebhookEventType.JSON_PROPERTY_SINCE,
	ServiceWebhookEventType.JSON_PROPERTY_PROPERTIES,
	ServiceWebhookEventType.JSON_PROPERTY_STATIC_PROPERTIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServiceWebhookEventType {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICEWEBHOOKEVENTTYPE("ServiceWebhookEventType");

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
			return TypeEnum.SERVICEWEBHOOKEVENTTYPE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICEWEBHOOKEVENTTYPE;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_IMPLEMENTATION_NAME = "implementationName";
	@JsonProperty(JSON_PROPERTY_IMPLEMENTATION_NAME)
	private String implementationName;

	public static final String JSON_PROPERTY_REGISTRATION_LOCATION = "registrationLocation";
	@JsonProperty(JSON_PROPERTY_REGISTRATION_LOCATION)
	private ERegistrationLocation registrationLocation;

	public static final String JSON_PROPERTY_SINCE = "since";
	@JsonProperty(JSON_PROPERTY_SINCE)
	private EWebApiVersion since;

	public static final String JSON_PROPERTY_PROPERTIES = "properties";
	@JsonProperty(JSON_PROPERTY_PROPERTIES)
	private List<ServiceTypeProperty> properties = null;

	public static final String JSON_PROPERTY_STATIC_PROPERTIES = "staticProperties";
	@JsonProperty(JSON_PROPERTY_STATIC_PROPERTIES)
	private List<ServiceTypeProperty> staticProperties = null;

	public ServiceWebhookEventType $type(TypeEnum $type) {
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

	public ServiceWebhookEventType documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the webhook event
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the webhook event")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public ServiceWebhookEventType name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the event
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the event")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServiceWebhookEventType implementationName(String implementationName) {
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

	public ServiceWebhookEventType registrationLocation(ERegistrationLocation registrationLocation) {
		this.registrationLocation = registrationLocation;
		return this;
	}

	/**
	 * Get registrationLocation
	 * 
	 * @return registrationLocation
	 **/
	@ApiModelProperty(value = "")
	public ERegistrationLocation getRegistrationLocation() {
		return registrationLocation;
	}

	public void setRegistrationLocation(ERegistrationLocation registrationLocation) {
		this.registrationLocation = registrationLocation;
	}

	public ServiceWebhookEventType since(EWebApiVersion since) {
		this.since = since;
		return this;
	}

	/**
	 * Get since
	 * 
	 * @return since
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getSince() {
		return since;
	}

	public void setSince(EWebApiVersion since) {
		this.since = since;
	}

	public ServiceWebhookEventType properties(List<ServiceTypeProperty> properties) {
		this.properties = properties;
		return this;
	}

	public ServiceWebhookEventType addPropertiesItem(ServiceTypeProperty propertiesItem) {
		if (this.properties == null) {
			this.properties = new ArrayList<>();
		}
		this.properties.add(propertiesItem);
		return this;
	}

	/**
	 * Properties of the event
	 * 
	 * @return properties
	 **/
	@ApiModelProperty(value = "Properties of the event")
	public List<ServiceTypeProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<ServiceTypeProperty> properties) {
		this.properties = properties;
	}

	public ServiceWebhookEventType staticProperties(List<ServiceTypeProperty> staticProperties) {
		this.staticProperties = staticProperties;
		return this;
	}

	public ServiceWebhookEventType addStaticPropertiesItem(ServiceTypeProperty staticPropertiesItem) {
		if (this.staticProperties == null) {
			this.staticProperties = new ArrayList<>();
		}
		this.staticProperties.add(staticPropertiesItem);
		return this;
	}

	/**
	 * Static properties of the event. They are not send
	 * 
	 * @return staticProperties
	 **/
	@ApiModelProperty(value = "Static properties of the event. They are not send")
	public List<ServiceTypeProperty> getStaticProperties() {
		return staticProperties;
	}

	public void setStaticProperties(List<ServiceTypeProperty> staticProperties) {
		this.staticProperties = staticProperties;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceWebhookEventType serviceWebhookEventType = (ServiceWebhookEventType) o;
		return Objects.equals(this.$type, serviceWebhookEventType.$type) &&
				Objects.equals(this.documentation, serviceWebhookEventType.documentation) &&
				Objects.equals(this.name, serviceWebhookEventType.name) &&
				Objects.equals(this.implementationName, serviceWebhookEventType.implementationName) &&
				Objects.equals(this.registrationLocation, serviceWebhookEventType.registrationLocation) &&
				Objects.equals(this.since, serviceWebhookEventType.since) &&
				Objects.equals(this.properties, serviceWebhookEventType.properties) &&
				Objects.equals(this.staticProperties, serviceWebhookEventType.staticProperties);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, documentation, name, implementationName, registrationLocation, since, properties, staticProperties);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceWebhookEventType {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    implementationName: ").append(toIndentedString(implementationName)).append("\n");
		sb.append("    registrationLocation: ").append(toIndentedString(registrationLocation)).append("\n");
		sb.append("    since: ").append(toIndentedString(since)).append("\n");
		sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
		sb.append("    staticProperties: ").append(toIndentedString(staticProperties)).append("\n");
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
