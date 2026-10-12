
package com.unblu.webapi.model.v4;

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
 * Model of a webhook registration. Registered webhooks for certain events are stored inside this model.
 */
@ApiModel(description = "Model of a webhook registration. Registered webhooks for certain events are stored inside this model.")

@JsonPropertyOrder({
	WebhookRegistrationData.JSON_PROPERTY_$_TYPE,
	WebhookRegistrationData.JSON_PROPERTY_ID,
	WebhookRegistrationData.JSON_PROPERTY_CREATION_TIMESTAMP,
	WebhookRegistrationData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	WebhookRegistrationData.JSON_PROPERTY_VERSION,
	WebhookRegistrationData.JSON_PROPERTY_ACCOUNT_ID,
	WebhookRegistrationData.JSON_PROPERTY_NAME,
	WebhookRegistrationData.JSON_PROPERTY_STATUS,
	WebhookRegistrationData.JSON_PROPERTY_DESCRIPTION,
	WebhookRegistrationData.JSON_PROPERTY_ENDPOINT,
	WebhookRegistrationData.JSON_PROPERTY_API_VERSION,
	WebhookRegistrationData.JSON_PROPERTY_SECRET,
	WebhookRegistrationData.JSON_PROPERTY_FILTERS,
	WebhookRegistrationData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	WebhookRegistrationData.JSON_PROPERTY_EVENTS,
	WebhookRegistrationData.JSON_PROPERTY_TRIGGER_AGENTIC_FLOW,
	WebhookRegistrationData.JSON_PROPERTY_AGENTIC_FLOW_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WebhookRegistrationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WEBHOOKREGISTRATIONDATA("WebhookRegistrationData");

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
			return TypeEnum.WEBHOOKREGISTRATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WEBHOOKREGISTRATIONDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_VERSION = "version";
	@JsonProperty(JSON_PROPERTY_VERSION)
	private Long version;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private ERegistrationStatus status;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
	@JsonProperty(JSON_PROPERTY_ENDPOINT)
	private String endpoint;

	public static final String JSON_PROPERTY_API_VERSION = "apiVersion";
	@JsonProperty(JSON_PROPERTY_API_VERSION)
	private EWebApiVersion apiVersion;

	public static final String JSON_PROPERTY_SECRET = "secret";
	@JsonProperty(JSON_PROPERTY_SECRET)
	private String secret;

	public static final String JSON_PROPERTY_FILTERS = "filters";
	@JsonProperty(JSON_PROPERTY_FILTERS)
	private List<WebhookRegistrationFilter> filters = null;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_EVENTS = "events";
	@JsonProperty(JSON_PROPERTY_EVENTS)
	private List<String> events = null;

	public static final String JSON_PROPERTY_TRIGGER_AGENTIC_FLOW = "triggerAgenticFlow";
	@JsonProperty(JSON_PROPERTY_TRIGGER_AGENTIC_FLOW)
	private Boolean triggerAgenticFlow;

	public static final String JSON_PROPERTY_AGENTIC_FLOW_DATA = "agenticFlowData";
	@JsonProperty(JSON_PROPERTY_AGENTIC_FLOW_DATA)
	private ExpandableField<AriaAgenticFlowDataContent> agenticFlowData = null;

	public WebhookRegistrationData $type(TypeEnum $type) {
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

	public WebhookRegistrationData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public WebhookRegistrationData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public WebhookRegistrationData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is
	 * ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn&#39;t written to storage and doesn&#39;t
	 * affect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted when sending data to the server. If sent to the server, it is ignored. It is only informational in character. Note: If you set this property, it returns the same value but it isn't written to storage and doesn't affect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public WebhookRegistrationData version(Long version) {
		this.version = version;
		return this;
	}

	/**
	 * Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When
	 * creating an object, the version can be omitted.
	 * 
	 * @return version
	 **/
	@ApiModelProperty(value = "Version of the entity. Will be incremented on each change. New updates must always be based on the newest version, if not updates will be rejected. When creating an object, the version can be omitted.")
	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public WebhookRegistrationData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It will be filled by the server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public WebhookRegistrationData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the webhook registration. Maximum length of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the webhook registration. Maximum length of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WebhookRegistrationData status(ERegistrationStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public ERegistrationStatus getStatus() {
		return status;
	}

	public void setStatus(ERegistrationStatus status) {
		this.status = status;
	}

	public WebhookRegistrationData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the webhook registration. Maximum length of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the webhook registration. Maximum length of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public WebhookRegistrationData endpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}

	/**
	 * The endpoint URL of the webhook registration. This is the URL that requests for webhook events are sent to. Maximum length of 4000 characters. Mandatory,
	 * unless the registration triggers an Aria agentic flow, in which case it must be omitted.
	 * 
	 * @return endpoint
	 **/
	@ApiModelProperty(value = "The endpoint URL of the webhook registration. This is the URL that requests for webhook events are sent to. Maximum length of 4000 characters. Mandatory, unless the registration triggers an Aria agentic flow, in which case it must be omitted.")
	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public WebhookRegistrationData apiVersion(EWebApiVersion apiVersion) {
		this.apiVersion = apiVersion;
		return this;
	}

	/**
	 * Get apiVersion
	 * 
	 * @return apiVersion
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(EWebApiVersion apiVersion) {
		this.apiVersion = apiVersion;
	}

	public WebhookRegistrationData secret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * A secret that is sent with each webhook event. Maximum length of 4000 characters. Optional. Prohibited for registrations that trigger an Aria agentic flow.
	 * 
	 * @return secret
	 **/
	@ApiModelProperty(value = "A secret that is sent with each webhook event. Maximum length of 4000 characters. Optional. Prohibited for registrations that trigger an Aria agentic flow.")
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public WebhookRegistrationData filters(List<WebhookRegistrationFilter> filters) {
		this.filters = filters;
		return this;
	}

	public WebhookRegistrationData addFiltersItem(WebhookRegistrationFilter filtersItem) {
		if (this.filters == null) {
			this.filters = new ArrayList<>();
		}
		this.filters.add(filtersItem);
		return this;
	}

	/**
	 * Defines the filters for the webhook registration. Only events that match all the specified filters are delivered. Webhook registrations with at least one
	 * filter defined must also specify an &#x60;expirationTimestamp&#x60;. Each event supports a specific set of filters; for further information, refer to the
	 * documentation of each event. If the webhook registration is for multiple events, each event must support all the filters you apply.
	 * 
	 * @return filters
	 **/
	@ApiModelProperty(value = "Defines the filters for the webhook registration. Only events that match all the specified filters are delivered. Webhook registrations with at least one filter defined must also specify an `expirationTimestamp`. Each event supports a specific set of filters; for further information, refer to the documentation of each event. If the webhook registration is for multiple events, each event must support all the filters you apply.")
	public List<WebhookRegistrationFilter> getFilters() {
		return filters;
	}

	public void setFilters(List<WebhookRegistrationFilter> filters) {
		this.filters = filters;
	}

	public WebhookRegistrationData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the webhook registration will expire. Mandatory for webhook registrations that define filters. The webhook registration is
	 * automatically deleted when the expiration time is reached. This timestamp can be updated at any time to extend the life of the webhook registration.
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the webhook registration will expire. Mandatory for webhook registrations that define filters. The webhook registration is automatically deleted when the expiration time is reached. This timestamp can be updated at any time to extend the life of the webhook registration.")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public WebhookRegistrationData events(List<String> events) {
		this.events = events;
		return this;
	}

	public WebhookRegistrationData addEventsItem(String eventsItem) {
		if (this.events == null) {
			this.events = new ArrayList<>();
		}
		this.events.add(eventsItem);
		return this;
	}

	/**
	 * Events for which the webhook endpoint is called, if they occur. Mandatory. Check the Webhook Events for possible values.
	 * 
	 * @return events
	 **/
	@ApiModelProperty(value = "Events for which the webhook endpoint is called, if they occur. Mandatory. Check the Webhook Events for possible values.")
	public List<String> getEvents() {
		return events;
	}

	public void setEvents(List<String> events) {
		this.events = events;
	}

	public WebhookRegistrationData triggerAgenticFlow(Boolean triggerAgenticFlow) {
		this.triggerAgenticFlow = triggerAgenticFlow;
		return this;
	}

	/**
	 * Whether this webhook registration triggers an Aria agentic flow rather than call an HTTP endpoint. On create this expresses the caller&#39;s wish: if set to
	 * &#x60;true&#x60; and no agentic flow data is imported, a new agentic flow is created from the default template. On read this reflects whether an agentic flow
	 * is currently linked. The value cannot be changed on update.
	 * 
	 * @return triggerAgenticFlow
	 **/
	@ApiModelProperty(value = "Whether this webhook registration triggers an Aria agentic flow rather than call an HTTP endpoint. On create this expresses the caller's wish: if set to `true` and no agentic flow data is imported, a new agentic flow is created from the default template. On read this reflects whether an agentic flow is currently linked. The value cannot be changed on update.")
	public Boolean isTriggerAgenticFlow() {
		return triggerAgenticFlow;
	}

	public void setTriggerAgenticFlow(Boolean triggerAgenticFlow) {
		this.triggerAgenticFlow = triggerAgenticFlow;
	}

	public WebhookRegistrationData agenticFlowData(ExpandableField<AriaAgenticFlowDataContent> agenticFlowData) {
		this.agenticFlowData = agenticFlowData;
		return this;
	}

	/**
	 * The Aria agentic flow ID, if the registration triggers an Aria agentic flow. Maximum length 36 characters. Managed by the server, never provided by the
	 * caller. Add &#x60;?expand&#x3D;agenticFlowData&#x60; to the request to replace this ID with the full flow content.
	 * 
	 * @return agenticFlowData
	 **/
	@ApiModelProperty(value = "The Aria agentic flow ID, if the registration triggers an Aria agentic flow. Maximum length 36 characters. Managed by the server, never provided by the caller. Add `?expand=agenticFlowData` to the request to replace this ID with the full flow content.")
	public ExpandableField<AriaAgenticFlowDataContent> getAgenticFlowData() {
		return agenticFlowData;
	}

	public void setAgenticFlowData(ExpandableField<AriaAgenticFlowDataContent> agenticFlowData) {
		this.agenticFlowData = agenticFlowData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WebhookRegistrationData webhookRegistrationData = (WebhookRegistrationData) o;
		return Objects.equals(this.$type, webhookRegistrationData.$type) &&
				Objects.equals(this.id, webhookRegistrationData.id) &&
				Objects.equals(this.creationTimestamp, webhookRegistrationData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, webhookRegistrationData.modificationTimestamp) &&
				Objects.equals(this.version, webhookRegistrationData.version) &&
				Objects.equals(this.accountId, webhookRegistrationData.accountId) &&
				Objects.equals(this.name, webhookRegistrationData.name) &&
				Objects.equals(this.status, webhookRegistrationData.status) &&
				Objects.equals(this.description, webhookRegistrationData.description) &&
				Objects.equals(this.endpoint, webhookRegistrationData.endpoint) &&
				Objects.equals(this.apiVersion, webhookRegistrationData.apiVersion) &&
				Objects.equals(this.secret, webhookRegistrationData.secret) &&
				Objects.equals(this.filters, webhookRegistrationData.filters) &&
				Objects.equals(this.expirationTimestamp, webhookRegistrationData.expirationTimestamp) &&
				Objects.equals(this.events, webhookRegistrationData.events) &&
				Objects.equals(this.triggerAgenticFlow, webhookRegistrationData.triggerAgenticFlow) &&
				Objects.equals(this.agenticFlowData, webhookRegistrationData.agenticFlowData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, status, description, endpoint, apiVersion, secret, filters, expirationTimestamp, events, triggerAgenticFlow, agenticFlowData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WebhookRegistrationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
		sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
		sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
		sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    events: ").append(toIndentedString(events)).append("\n");
		sb.append("    triggerAgenticFlow: ").append(toIndentedString(triggerAgenticFlow)).append("\n");
		sb.append("    agenticFlowData: ").append(toIndentedString(agenticFlowData)).append("\n");
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
