
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
 * API model that represents a copilot suggestion source
 */
@ApiModel(description = "API model that represents a copilot suggestion source")

@JsonPropertyOrder({
	CopilotSuggestionSourceData.JSON_PROPERTY_$_TYPE,
	CopilotSuggestionSourceData.JSON_PROPERTY_ID,
	CopilotSuggestionSourceData.JSON_PROPERTY_CREATION_TIMESTAMP,
	CopilotSuggestionSourceData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CopilotSuggestionSourceData.JSON_PROPERTY_VERSION,
	CopilotSuggestionSourceData.JSON_PROPERTY_ACCOUNT_ID,
	CopilotSuggestionSourceData.JSON_PROPERTY_NAME,
	CopilotSuggestionSourceData.JSON_PROPERTY_DESCRIPTION,
	CopilotSuggestionSourceData.JSON_PROPERTY_OUTBOUND_STATUS,
	CopilotSuggestionSourceData.JSON_PROPERTY_OUTBOUND_ENDPOINT,
	CopilotSuggestionSourceData.JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS,
	CopilotSuggestionSourceData.JSON_PROPERTY_RETRY_COUNT,
	CopilotSuggestionSourceData.JSON_PROPERTY_RETRY_DELAY,
	CopilotSuggestionSourceData.JSON_PROPERTY_TYPE,
	CopilotSuggestionSourceData.JSON_PROPERTY_AUTH_TOKEN,
	CopilotSuggestionSourceData.JSON_PROPERTY_COPILOT_ID,
	CopilotSuggestionSourceData.JSON_PROPERTY_COPILOT_ENVIRONMENT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CopilotSuggestionSourceData implements SuggestionSourceData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COPILOTSUGGESTIONSOURCEDATA("CopilotSuggestionSourceData");

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
			return TypeEnum.COPILOTSUGGESTIONSOURCEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COPILOTSUGGESTIONSOURCEDATA;

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

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_OUTBOUND_STATUS = "outboundStatus";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_STATUS)
	private EOutboundEndpointStatus outboundStatus;

	public static final String JSON_PROPERTY_OUTBOUND_ENDPOINT = "outboundEndpoint";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_ENDPOINT)
	private String outboundEndpoint;

	public static final String JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS = "outboundTimeoutMillis";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS)
	private Long outboundTimeoutMillis;

	public static final String JSON_PROPERTY_RETRY_COUNT = "retryCount";
	@JsonProperty(JSON_PROPERTY_RETRY_COUNT)
	private Long retryCount;

	public static final String JSON_PROPERTY_RETRY_DELAY = "retryDelay";
	@JsonProperty(JSON_PROPERTY_RETRY_DELAY)
	private Long retryDelay;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ESuggestionSourceType type = ESuggestionSourceType.COPILOT;

	public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
	@JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
	private String authToken;

	public static final String JSON_PROPERTY_COPILOT_ID = "copilotId";
	@JsonProperty(JSON_PROPERTY_COPILOT_ID)
	private String copilotId;

	public static final String JSON_PROPERTY_COPILOT_ENVIRONMENT_ID = "copilotEnvironmentId";
	@JsonProperty(JSON_PROPERTY_COPILOT_ENVIRONMENT_ID)
	private String copilotEnvironmentId;

	public CopilotSuggestionSourceData $type(TypeEnum $type) {
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

	public CopilotSuggestionSourceData id(String id) {
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

	public CopilotSuggestionSourceData creationTimestamp(Long creationTimestamp) {
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

	public CopilotSuggestionSourceData modificationTimestamp(Long modificationTimestamp) {
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

	public CopilotSuggestionSourceData version(Long version) {
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

	public CopilotSuggestionSourceData accountId(String accountId) {
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

	public CopilotSuggestionSourceData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the message interceptor. Maximum length of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the message interceptor. Maximum length of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CopilotSuggestionSourceData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the message interceptor. Maximum length of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the message interceptor. Maximum length of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CopilotSuggestionSourceData outboundStatus(EOutboundEndpointStatus outboundStatus) {
		this.outboundStatus = outboundStatus;
		return this;
	}

	/**
	 * Get outboundStatus
	 * 
	 * @return outboundStatus
	 **/
	@ApiModelProperty(value = "")
	public EOutboundEndpointStatus getOutboundStatus() {
		return outboundStatus;
	}

	public void setOutboundStatus(EOutboundEndpointStatus outboundStatus) {
		this.outboundStatus = outboundStatus;
	}

	public CopilotSuggestionSourceData outboundEndpoint(String outboundEndpoint) {
		this.outboundEndpoint = outboundEndpoint;
		return this;
	}

	/**
	 * The endpoint URL used for the outbound registration. Outbound requests are sent to this URL. Maximum length of 4000 characters. &lt;br&gt; Mandatory for
	 * &#x60;CustomSuggestionSourceData&#x60; and &#x60;CopilotSuggestionSourceData&#x60;. &lt;br&gt; Not used for &#x60;AriaSuggestionSourceData&#x60; as the
	 * endpoint is determined server-side via Aria configuration. &lt;p&gt; The following requests will be sent to the endpoint: &lt;ul&gt; &lt;li&gt;&#x60;
	 * OutboundRequest#ServiceNameConstants#CONVERSATION_CHAT_SUGGESTION&#x60;: When a suggestion for one or more chat messages is requested.&lt;/li&gt;
	 * &lt;li&gt;&#x60; OutboundRequest#ServiceNameConstants#PING&#x60;: When pinging the endpoint.&lt;/li&gt; &lt;/ul&gt;
	 * 
	 * @return outboundEndpoint
	 **/
	@ApiModelProperty(value = "The endpoint URL used for the outbound registration. Outbound requests are sent to this URL. Maximum length of 4000 characters. <br> Mandatory for `CustomSuggestionSourceData` and `CopilotSuggestionSourceData`. <br> Not used for `AriaSuggestionSourceData` as the endpoint is determined server-side via Aria configuration. <p> The following requests will be sent to the endpoint: <ul> <li>` OutboundRequest#ServiceNameConstants#CONVERSATION_CHAT_SUGGESTION`: When a suggestion for one or more chat messages is requested.</li> <li>` OutboundRequest#ServiceNameConstants#PING`: When pinging the endpoint.</li> </ul>")
	public String getOutboundEndpoint() {
		return outboundEndpoint;
	}

	public void setOutboundEndpoint(String outboundEndpoint) {
		this.outboundEndpoint = outboundEndpoint;
	}

	public CopilotSuggestionSourceData outboundTimeoutMillis(Long outboundTimeoutMillis) {
		this.outboundTimeoutMillis = outboundTimeoutMillis;
		return this;
	}

	/**
	 * The timeout for the requests sent to the outbound endpoint. Mandatory.
	 * 
	 * @return outboundTimeoutMillis
	 **/
	@ApiModelProperty(value = "The timeout for the requests sent to the outbound endpoint. Mandatory.")
	public Long getOutboundTimeoutMillis() {
		return outboundTimeoutMillis;
	}

	public void setOutboundTimeoutMillis(Long outboundTimeoutMillis) {
		this.outboundTimeoutMillis = outboundTimeoutMillis;
	}

	public CopilotSuggestionSourceData retryCount(Long retryCount) {
		this.retryCount = retryCount;
		return this;
	}

	/**
	 * Defines the number of retries for failed outbound requests. If omitted, it defaults to 0.
	 * 
	 * @return retryCount
	 **/
	@ApiModelProperty(value = "Defines the number of retries for failed outbound requests. If omitted, it defaults to 0.")
	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public CopilotSuggestionSourceData retryDelay(Long retryDelay) {
		this.retryDelay = retryDelay;
		return this;
	}

	/**
	 * Defines the delay between retries for failed outbound requests. If omitted, it defaults to 0.
	 * 
	 * @return retryDelay
	 **/
	@ApiModelProperty(value = "Defines the delay between retries for failed outbound requests. If omitted, it defaults to 0.")
	public Long getRetryDelay() {
		return retryDelay;
	}

	public void setRetryDelay(Long retryDelay) {
		this.retryDelay = retryDelay;
	}

	public CopilotSuggestionSourceData type(ESuggestionSourceType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public ESuggestionSourceType getType() {
		return type;
	}

	public void setType(ESuggestionSourceType type) {
		this.type = type;
	}

	public CopilotSuggestionSourceData authToken(String authToken) {
		this.authToken = authToken;
		return this;
	}

	/**
	 * Authentication token for the communication with Microsoft Copilot Studio Agent. Maximum length: 2000 characters.
	 * 
	 * @return authToken
	 **/
	@ApiModelProperty(value = "Authentication token for the communication with Microsoft Copilot Studio Agent. Maximum length: 2000 characters.")
	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public CopilotSuggestionSourceData copilotId(String copilotId) {
		this.copilotId = copilotId;
		return this;
	}

	/**
	 * The Copilot Agent ID for selecting the correct copilot. Maximum length: 36 characters
	 * 
	 * @return copilotId
	 **/
	@ApiModelProperty(value = "The Copilot Agent ID for selecting the correct copilot. Maximum length: 36 characters")
	public String getCopilotId() {
		return copilotId;
	}

	public void setCopilotId(String copilotId) {
		this.copilotId = copilotId;
	}

	public CopilotSuggestionSourceData copilotEnvironmentId(String copilotEnvironmentId) {
		this.copilotEnvironmentId = copilotEnvironmentId;
		return this;
	}

	/**
	 * The Microsoft environment ID. Used by Microsoft Copilot. Maximum length: 2000 characters
	 * 
	 * @return copilotEnvironmentId
	 **/
	@ApiModelProperty(value = "The Microsoft environment ID. Used by Microsoft Copilot. Maximum length: 2000 characters")
	public String getCopilotEnvironmentId() {
		return copilotEnvironmentId;
	}

	public void setCopilotEnvironmentId(String copilotEnvironmentId) {
		this.copilotEnvironmentId = copilotEnvironmentId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CopilotSuggestionSourceData copilotSuggestionSourceData = (CopilotSuggestionSourceData) o;
		return Objects.equals(this.$type, copilotSuggestionSourceData.$type) &&
				Objects.equals(this.id, copilotSuggestionSourceData.id) &&
				Objects.equals(this.creationTimestamp, copilotSuggestionSourceData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, copilotSuggestionSourceData.modificationTimestamp) &&
				Objects.equals(this.version, copilotSuggestionSourceData.version) &&
				Objects.equals(this.accountId, copilotSuggestionSourceData.accountId) &&
				Objects.equals(this.name, copilotSuggestionSourceData.name) &&
				Objects.equals(this.description, copilotSuggestionSourceData.description) &&
				Objects.equals(this.outboundStatus, copilotSuggestionSourceData.outboundStatus) &&
				Objects.equals(this.outboundEndpoint, copilotSuggestionSourceData.outboundEndpoint) &&
				Objects.equals(this.outboundTimeoutMillis, copilotSuggestionSourceData.outboundTimeoutMillis) &&
				Objects.equals(this.retryCount, copilotSuggestionSourceData.retryCount) &&
				Objects.equals(this.retryDelay, copilotSuggestionSourceData.retryDelay) &&
				Objects.equals(this.type, copilotSuggestionSourceData.type) &&
				Objects.equals(this.authToken, copilotSuggestionSourceData.authToken) &&
				Objects.equals(this.copilotId, copilotSuggestionSourceData.copilotId) &&
				Objects.equals(this.copilotEnvironmentId, copilotSuggestionSourceData.copilotEnvironmentId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, outboundStatus, outboundEndpoint, outboundTimeoutMillis, retryCount, retryDelay, type, authToken, copilotId, copilotEnvironmentId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CopilotSuggestionSourceData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    outboundStatus: ").append(toIndentedString(outboundStatus)).append("\n");
		sb.append("    outboundEndpoint: ").append(toIndentedString(outboundEndpoint)).append("\n");
		sb.append("    outboundTimeoutMillis: ").append(toIndentedString(outboundTimeoutMillis)).append("\n");
		sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
		sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
		sb.append("    copilotId: ").append(toIndentedString(copilotId)).append("\n");
		sb.append("    copilotEnvironmentId: ").append(toIndentedString(copilotEnvironmentId)).append("\n");
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
