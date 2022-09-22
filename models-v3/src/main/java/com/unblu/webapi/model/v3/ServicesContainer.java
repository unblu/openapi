
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
 * Container for Web API services, webhook events and the types used in them
 */
@ApiModel(description = "Container for Web API services, webhook events and the types used in them")

@JsonPropertyOrder({
	ServicesContainer.JSON_PROPERTY_$_TYPE,
	ServicesContainer.JSON_PROPERTY_VERSION,
	ServicesContainer.JSON_PROPERTY_SERVICES,
	ServicesContainer.JSON_PROPERTY_WEBHOOK_EVENTS,
	ServicesContainer.JSON_PROPERTY_TYPES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServicesContainer {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICESCONTAINER("ServicesContainer");

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
			return TypeEnum.SERVICESCONTAINER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICESCONTAINER;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private String version;

	public static final String JSON_PROPERTY_SERVICES = "services";
	@JsonProperty(JSON_PROPERTY_SERVICES)
	private List<WebApiService> services = null;

	public static final String JSON_PROPERTY_WEBHOOK_EVENTS = "webhookEvents";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_EVENTS)
	private List<ServiceWebhookEventType> webhookEvents = null;

	public static final String JSON_PROPERTY_TYPES = "types";
	@JsonProperty(JSON_PROPERTY_TYPES)
	private List<ServiceType> types = null;

	public ServicesContainer $type(TypeEnum $type) {
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

	public ServicesContainer version(String version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the metadata
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the metadata")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public ServicesContainer services(List<WebApiService> services) {
		this.services = services;
		return this;
	}

	public ServicesContainer addServicesItem(WebApiService servicesItem) {
		if (this.services == null) {
			this.services = new ArrayList<>();
		}
		this.services.add(servicesItem);
		return this;
	}

	/**
	 * All services
	 * 
	 * @return services
	 **/
	@ApiModelProperty(value = "All services")
	public List<WebApiService> getServices() {
		return services;
	}

	public void setServices(List<WebApiService> services) {
		this.services = services;
	}

	public ServicesContainer webhookEvents(List<ServiceWebhookEventType> webhookEvents) {
		this.webhookEvents = webhookEvents;
		return this;
	}

	public ServicesContainer addWebhookEventsItem(ServiceWebhookEventType webhookEventsItem) {
		if (this.webhookEvents == null) {
			this.webhookEvents = new ArrayList<>();
		}
		this.webhookEvents.add(webhookEventsItem);
		return this;
	}

	/**
	 * All webhook events
	 * 
	 * @return webhookEvents
	 **/
	@ApiModelProperty(value = "All webhook events")
	public List<ServiceWebhookEventType> getWebhookEvents() {
		return webhookEvents;
	}

	public void setWebhookEvents(List<ServiceWebhookEventType> webhookEvents) {
		this.webhookEvents = webhookEvents;
	}

	public ServicesContainer types(List<ServiceType> types) {
		this.types = types;
		return this;
	}

	public ServicesContainer addTypesItem(ServiceType typesItem) {
		if (this.types == null) {
			this.types = new ArrayList<>();
		}
		this.types.add(typesItem);
		return this;
	}

	/**
	 * All types used in the services and webhook events
	 * 
	 * @return types
	 **/
	@ApiModelProperty(value = "All types used in the services and webhook events")
	public List<ServiceType> getTypes() {
		return types;
	}

	public void setTypes(List<ServiceType> types) {
		this.types = types;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServicesContainer servicesContainer = (ServicesContainer) o;
		return Objects.equals(this.$type, servicesContainer.$type) &&
				Objects.equals(this.version, servicesContainer.version) &&
				Objects.equals(this.services, servicesContainer.services) &&
				Objects.equals(this.webhookEvents, servicesContainer.webhookEvents) &&
				Objects.equals(this.types, servicesContainer.types);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, version, services, webhookEvents, types);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServicesContainer {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    services: ").append(toIndentedString(services)).append("\n");
		sb.append("    webhookEvents: ").append(toIndentedString(webhookEvents)).append("\n");
		sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
