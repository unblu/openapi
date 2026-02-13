
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
 * A model representing a conversation access interceptor. These interceptors are used to approve or reject an attempt to join a conversation.
 */
@ApiModel(description = "A model representing a conversation access interceptor. These interceptors are used to approve or reject an attempt to join a conversation.")

@JsonPropertyOrder({
	ConversationAccessInterceptorData.JSON_PROPERTY_$_TYPE,
	ConversationAccessInterceptorData.JSON_PROPERTY_ID,
	ConversationAccessInterceptorData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationAccessInterceptorData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ConversationAccessInterceptorData.JSON_PROPERTY_VERSION,
	ConversationAccessInterceptorData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationAccessInterceptorData.JSON_PROPERTY_NAME,
	ConversationAccessInterceptorData.JSON_PROPERTY_DESCRIPTION,
	ConversationAccessInterceptorData.JSON_PROPERTY_TIMEOUT_BEHAVIOR,
	ConversationAccessInterceptorData.JSON_PROPERTY_INTERCEPTED_OPENING_TYPES,
	ConversationAccessInterceptorData.JSON_PROPERTY_OUTBOUND_ENDPOINT,
	ConversationAccessInterceptorData.JSON_PROPERTY_OUTBOUND_STATUS,
	ConversationAccessInterceptorData.JSON_PROPERTY_OUTBOUND_SECRET,
	ConversationAccessInterceptorData.JSON_PROPERTY_OUTBOUND_API_VERSION,
	ConversationAccessInterceptorData.JSON_PROPERTY_RETRY_COUNT,
	ConversationAccessInterceptorData.JSON_PROPERTY_RETRY_DELAY,
	ConversationAccessInterceptorData.JSON_PROPERTY_ORDER,
	ConversationAccessInterceptorData.JSON_PROPERTY_TIMEOUT_MILLIS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationAccessInterceptorData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONACCESSINTERCEPTORDATA("ConversationAccessInterceptorData");

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
			return TypeEnum.CONVERSATIONACCESSINTERCEPTORDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONACCESSINTERCEPTORDATA;

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

	public static final String JSON_PROPERTY_TIMEOUT_BEHAVIOR = "timeoutBehavior";
	@JsonProperty(JSON_PROPERTY_TIMEOUT_BEHAVIOR)
	private EConversationAccessInterceptorTimeoutBehavior timeoutBehavior;

	public static final String JSON_PROPERTY_INTERCEPTED_OPENING_TYPES = "interceptedOpeningTypes";
	@JsonProperty(JSON_PROPERTY_INTERCEPTED_OPENING_TYPES)
	private List<EConversationAccessType> interceptedOpeningTypes = null;

	public static final String JSON_PROPERTY_OUTBOUND_ENDPOINT = "outboundEndpoint";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_ENDPOINT)
	private String outboundEndpoint;

	public static final String JSON_PROPERTY_OUTBOUND_STATUS = "outboundStatus";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_STATUS)
	private EOutboundEndpointStatus outboundStatus;

	public static final String JSON_PROPERTY_OUTBOUND_SECRET = "outboundSecret";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_SECRET)
	private String outboundSecret;

	public static final String JSON_PROPERTY_OUTBOUND_API_VERSION = "outboundApiVersion";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_API_VERSION)
	private EWebApiVersion outboundApiVersion;

	public static final String JSON_PROPERTY_RETRY_COUNT = "retryCount";
	@JsonProperty(JSON_PROPERTY_RETRY_COUNT)
	private Long retryCount;

	public static final String JSON_PROPERTY_RETRY_DELAY = "retryDelay";
	@JsonProperty(JSON_PROPERTY_RETRY_DELAY)
	private Long retryDelay;

	public static final String JSON_PROPERTY_ORDER = "order";
	@JsonProperty(JSON_PROPERTY_ORDER)
	private Long order;

	public static final String JSON_PROPERTY_TIMEOUT_MILLIS = "timeoutMillis";
	@JsonProperty(JSON_PROPERTY_TIMEOUT_MILLIS)
	private Long timeoutMillis;

	public ConversationAccessInterceptorData $type(TypeEnum $type) {
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

	public ConversationAccessInterceptorData id(String id) {
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

	public ConversationAccessInterceptorData creationTimestamp(Long creationTimestamp) {
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

	public ConversationAccessInterceptorData modificationTimestamp(Long modificationTimestamp) {
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

	public ConversationAccessInterceptorData version(Long version) {
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

	public ConversationAccessInterceptorData accountId(String accountId) {
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

	public ConversationAccessInterceptorData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * A model representing a conversation access interceptor. These interceptors are used to approve or reject an attempt to join a conversation. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "A model representing a conversation access interceptor. These interceptors are used to approve or reject an attempt to join a conversation. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConversationAccessInterceptorData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the conversation access interceptor. Maximum length of 500 characters.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the conversation access interceptor. Maximum length of 500 characters.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ConversationAccessInterceptorData timeoutBehavior(EConversationAccessInterceptorTimeoutBehavior timeoutBehavior) {
		this.timeoutBehavior = timeoutBehavior;
		return this;
	}

	/**
	 * Get timeoutBehavior
	 * 
	 * @return timeoutBehavior
	 **/
	@ApiModelProperty(value = "")
	public EConversationAccessInterceptorTimeoutBehavior getTimeoutBehavior() {
		return timeoutBehavior;
	}

	public void setTimeoutBehavior(EConversationAccessInterceptorTimeoutBehavior timeoutBehavior) {
		this.timeoutBehavior = timeoutBehavior;
	}

	public ConversationAccessInterceptorData interceptedOpeningTypes(List<EConversationAccessType> interceptedOpeningTypes) {
		this.interceptedOpeningTypes = interceptedOpeningTypes;
		return this;
	}

	public ConversationAccessInterceptorData addInterceptedOpeningTypesItem(EConversationAccessType interceptedOpeningTypesItem) {
		if (this.interceptedOpeningTypes == null) {
			this.interceptedOpeningTypes = new ArrayList<>();
		}
		this.interceptedOpeningTypes.add(interceptedOpeningTypesItem);
		return this;
	}

	/**
	 * Defines the different ways in which a conversation can be opened and which of these are intercepted. Mandatory.
	 * 
	 * @return interceptedOpeningTypes
	 **/
	@ApiModelProperty(value = "Defines the different ways in which a conversation can be opened and which of these are intercepted. Mandatory.")
	public List<EConversationAccessType> getInterceptedOpeningTypes() {
		return interceptedOpeningTypes;
	}

	public void setInterceptedOpeningTypes(List<EConversationAccessType> interceptedOpeningTypes) {
		this.interceptedOpeningTypes = interceptedOpeningTypes;
	}

	public ConversationAccessInterceptorData outboundEndpoint(String outboundEndpoint) {
		this.outboundEndpoint = outboundEndpoint;
		return this;
	}

	/**
	 * The URL of the outbound request registration endpoint. Requests for outbound request events are sent to this URL. Maximum length of 4000 characters.
	 * Mandatory. &lt;p&gt; The following event is sent to the endpoint: &lt;ul&gt; &lt;li&gt;The
	 * &#x60;OutboundRequest.ServiceNameConstants#CONVERSATION_ACCESS_INTERCEPTOR_ACCESS_CONVERSATION&#x60; event is sent to the endpoint every time a conversation
	 * is opened in an Unblu UI.&lt;/li&gt; &lt;/ul&gt;
	 * 
	 * @return outboundEndpoint
	 **/
	@ApiModelProperty(value = "The URL of the outbound request registration endpoint. Requests for outbound request events are sent to this URL. Maximum length of 4000 characters. Mandatory. <p> The following event is sent to the endpoint: <ul> <li>The `OutboundRequest.ServiceNameConstants#CONVERSATION_ACCESS_INTERCEPTOR_ACCESS_CONVERSATION` event is sent to the endpoint every time a conversation is opened in an Unblu UI.</li> </ul>")
	public String getOutboundEndpoint() {
		return outboundEndpoint;
	}

	public void setOutboundEndpoint(String outboundEndpoint) {
		this.outboundEndpoint = outboundEndpoint;
	}

	public ConversationAccessInterceptorData outboundStatus(EOutboundEndpointStatus outboundStatus) {
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

	public ConversationAccessInterceptorData outboundSecret(String outboundSecret) {
		this.outboundSecret = outboundSecret;
		return this;
	}

	/**
	 * Optional secret sent with each outbound event. Mandatory. &lt;p&gt; Maximum length of 4000 characters.
	 * 
	 * @return outboundSecret
	 **/
	@ApiModelProperty(value = "Optional secret sent with each outbound event. Mandatory. <p> Maximum length of 4000 characters.")
	public String getOutboundSecret() {
		return outboundSecret;
	}

	public void setOutboundSecret(String outboundSecret) {
		this.outboundSecret = outboundSecret;
	}

	public ConversationAccessInterceptorData outboundApiVersion(EWebApiVersion outboundApiVersion) {
		this.outboundApiVersion = outboundApiVersion;
		return this;
	}

	/**
	 * Get outboundApiVersion
	 * 
	 * @return outboundApiVersion
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getOutboundApiVersion() {
		return outboundApiVersion;
	}

	public void setOutboundApiVersion(EWebApiVersion outboundApiVersion) {
		this.outboundApiVersion = outboundApiVersion;
	}

	public ConversationAccessInterceptorData retryCount(Long retryCount) {
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

	public ConversationAccessInterceptorData retryDelay(Long retryDelay) {
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

	public ConversationAccessInterceptorData order(Long order) {
		this.order = order;
		return this;
	}

	/**
	 * Order of execution of the file upload interceptor among all the file upload interceptors configured in the account. Mandatory.
	 * 
	 * @return order
	 **/
	@ApiModelProperty(value = "Order of execution of the file upload interceptor among all the file upload interceptors configured in the account. Mandatory.")
	public Long getOrder() {
		return order;
	}

	public void setOrder(Long order) {
		this.order = order;
	}

	public ConversationAccessInterceptorData timeoutMillis(Long timeoutMillis) {
		this.timeoutMillis = timeoutMillis;
		return this;
	}

	/**
	 * A long for the amount of miliseconds until the timeout of the interceptor occurs.
	 * 
	 * @return timeoutMillis
	 **/
	@ApiModelProperty(value = "A long for the amount of miliseconds until the timeout of the interceptor occurs.")
	public Long getTimeoutMillis() {
		return timeoutMillis;
	}

	public void setTimeoutMillis(Long timeoutMillis) {
		this.timeoutMillis = timeoutMillis;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationAccessInterceptorData conversationAccessInterceptorData = (ConversationAccessInterceptorData) o;
		return Objects.equals(this.$type, conversationAccessInterceptorData.$type) &&
				Objects.equals(this.id, conversationAccessInterceptorData.id) &&
				Objects.equals(this.creationTimestamp, conversationAccessInterceptorData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, conversationAccessInterceptorData.modificationTimestamp) &&
				Objects.equals(this.version, conversationAccessInterceptorData.version) &&
				Objects.equals(this.accountId, conversationAccessInterceptorData.accountId) &&
				Objects.equals(this.name, conversationAccessInterceptorData.name) &&
				Objects.equals(this.description, conversationAccessInterceptorData.description) &&
				Objects.equals(this.timeoutBehavior, conversationAccessInterceptorData.timeoutBehavior) &&
				Objects.equals(this.interceptedOpeningTypes, conversationAccessInterceptorData.interceptedOpeningTypes) &&
				Objects.equals(this.outboundEndpoint, conversationAccessInterceptorData.outboundEndpoint) &&
				Objects.equals(this.outboundStatus, conversationAccessInterceptorData.outboundStatus) &&
				Objects.equals(this.outboundSecret, conversationAccessInterceptorData.outboundSecret) &&
				Objects.equals(this.outboundApiVersion, conversationAccessInterceptorData.outboundApiVersion) &&
				Objects.equals(this.retryCount, conversationAccessInterceptorData.retryCount) &&
				Objects.equals(this.retryDelay, conversationAccessInterceptorData.retryDelay) &&
				Objects.equals(this.order, conversationAccessInterceptorData.order) &&
				Objects.equals(this.timeoutMillis, conversationAccessInterceptorData.timeoutMillis);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, timeoutBehavior, interceptedOpeningTypes, outboundEndpoint, outboundStatus, outboundSecret, outboundApiVersion, retryCount, retryDelay, order, timeoutMillis);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationAccessInterceptorData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    timeoutBehavior: ").append(toIndentedString(timeoutBehavior)).append("\n");
		sb.append("    interceptedOpeningTypes: ").append(toIndentedString(interceptedOpeningTypes)).append("\n");
		sb.append("    outboundEndpoint: ").append(toIndentedString(outboundEndpoint)).append("\n");
		sb.append("    outboundStatus: ").append(toIndentedString(outboundStatus)).append("\n");
		sb.append("    outboundSecret: ").append(toIndentedString(outboundSecret)).append("\n");
		sb.append("    outboundApiVersion: ").append(toIndentedString(outboundApiVersion)).append("\n");
		sb.append("    retryCount: ").append(toIndentedString(retryCount)).append("\n");
		sb.append("    retryDelay: ").append(toIndentedString(retryDelay)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
		sb.append("    timeoutMillis: ").append(toIndentedString(timeoutMillis)).append("\n");
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
