
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
 * Model representing an external message interceptor used to approve or reject messages in a conversation
 */
@ApiModel(description = "Model representing an external message interceptor used to approve or reject messages in a conversation")

@JsonPropertyOrder({
	ExternalMessageInterceptorData.JSON_PROPERTY_$_TYPE,
	ExternalMessageInterceptorData.JSON_PROPERTY_ID,
	ExternalMessageInterceptorData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ExternalMessageInterceptorData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ExternalMessageInterceptorData.JSON_PROPERTY_VERSION,
	ExternalMessageInterceptorData.JSON_PROPERTY_ACCOUNT_ID,
	ExternalMessageInterceptorData.JSON_PROPERTY_NAME,
	ExternalMessageInterceptorData.JSON_PROPERTY_DESCRIPTION,
	ExternalMessageInterceptorData.JSON_PROPERTY_MESSAGE_FILTER,
	ExternalMessageInterceptorData.JSON_PROPERTY_TIMEOUT_BEHAVIOR,
	ExternalMessageInterceptorData.JSON_PROPERTY_TYPE,
	ExternalMessageInterceptorData.JSON_PROPERTY_WEBHOOK_STATUS,
	ExternalMessageInterceptorData.JSON_PROPERTY_WEBHOOK_ENDPOINT,
	ExternalMessageInterceptorData.JSON_PROPERTY_WEBHOOK_API_VERSION,
	ExternalMessageInterceptorData.JSON_PROPERTY_WEBHOOK_SECRET,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessageInterceptorData implements MessageInterceptorData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSAGEINTERCEPTORDATA("ExternalMessageInterceptorData");

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
			return TypeEnum.EXTERNALMESSAGEINTERCEPTORDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSAGEINTERCEPTORDATA;

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

	public static final String JSON_PROPERTY_MESSAGE_FILTER = "messageFilter";
	@JsonProperty(JSON_PROPERTY_MESSAGE_FILTER)
	private EMessageInterceptorMessageFilter messageFilter;

	public static final String JSON_PROPERTY_TIMEOUT_BEHAVIOR = "timeoutBehavior";
	@JsonProperty(JSON_PROPERTY_TIMEOUT_BEHAVIOR)
	private EMessageInterceptorTimeoutBehavior timeoutBehavior;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EMessageInterceptorType type = EMessageInterceptorType.EXTERNAL;

	public static final String JSON_PROPERTY_WEBHOOK_STATUS = "webhookStatus";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_STATUS)
	private ERegistrationStatus webhookStatus;

	public static final String JSON_PROPERTY_WEBHOOK_ENDPOINT = "webhookEndpoint";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_ENDPOINT)
	private String webhookEndpoint;

	public static final String JSON_PROPERTY_WEBHOOK_API_VERSION = "webhookApiVersion";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
	private EWebApiVersion webhookApiVersion;

	public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
	private String webhookSecret;

	public ExternalMessageInterceptorData $type(TypeEnum $type) {
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

	public ExternalMessageInterceptorData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ExternalMessageInterceptorData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and
	 * therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data
	 * consistency.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is stored the first time in the system. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ExternalMessageInterceptorData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public ExternalMessageInterceptorData version(Long version) {
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

	public ExternalMessageInterceptorData accountId(String accountId) {
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

	public ExternalMessageInterceptorData name(String name) {
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

	public ExternalMessageInterceptorData description(String description) {
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

	public ExternalMessageInterceptorData messageFilter(EMessageInterceptorMessageFilter messageFilter) {
		this.messageFilter = messageFilter;
		return this;
	}

	/**
	 * Get messageFilter
	 * 
	 * @return messageFilter
	 **/
	@ApiModelProperty(value = "")
	public EMessageInterceptorMessageFilter getMessageFilter() {
		return messageFilter;
	}

	public void setMessageFilter(EMessageInterceptorMessageFilter messageFilter) {
		this.messageFilter = messageFilter;
	}

	public ExternalMessageInterceptorData timeoutBehavior(EMessageInterceptorTimeoutBehavior timeoutBehavior) {
		this.timeoutBehavior = timeoutBehavior;
		return this;
	}

	/**
	 * Get timeoutBehavior
	 * 
	 * @return timeoutBehavior
	 **/
	@ApiModelProperty(value = "")
	public EMessageInterceptorTimeoutBehavior getTimeoutBehavior() {
		return timeoutBehavior;
	}

	public void setTimeoutBehavior(EMessageInterceptorTimeoutBehavior timeoutBehavior) {
		this.timeoutBehavior = timeoutBehavior;
	}

	public ExternalMessageInterceptorData type(EMessageInterceptorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EMessageInterceptorType getType() {
		return type;
	}

	public void setType(EMessageInterceptorType type) {
		this.type = type;
	}

	public ExternalMessageInterceptorData webhookStatus(ERegistrationStatus webhookStatus) {
		this.webhookStatus = webhookStatus;
		return this;
	}

	/**
	 * Get webhookStatus
	 * 
	 * @return webhookStatus
	 **/
	@ApiModelProperty(value = "")
	public ERegistrationStatus getWebhookStatus() {
		return webhookStatus;
	}

	public void setWebhookStatus(ERegistrationStatus webhookStatus) {
		this.webhookStatus = webhookStatus;
	}

	public ExternalMessageInterceptorData webhookEndpoint(String webhookEndpoint) {
		this.webhookEndpoint = webhookEndpoint;
		return this;
	}

	/**
	 * The URL of the webhook registration endpoint. Requests for webhook events are sent to this URL. Maximum length of 4000 characters. &lt;p&gt; The following
	 * event is sent to the endpoint: &lt;ul&gt; &lt;li&gt;&#x60;TypedEvent.MESSAGE_INTERCEPTOR_NEW_MESSAGE&#x60;: On each message in the conversation.&lt;/li&gt;
	 * &lt;/ul&gt;
	 * 
	 * @return webhookEndpoint
	 **/
	@ApiModelProperty(value = "The URL of the webhook registration endpoint. Requests for webhook events are sent to this URL. Maximum length of 4000 characters. <p> The following event is sent to the endpoint: <ul> <li>`TypedEvent.MESSAGE_INTERCEPTOR_NEW_MESSAGE`: On each message in the conversation.</li> </ul>")
	public String getWebhookEndpoint() {
		return webhookEndpoint;
	}

	public void setWebhookEndpoint(String webhookEndpoint) {
		this.webhookEndpoint = webhookEndpoint;
	}

	public ExternalMessageInterceptorData webhookApiVersion(EWebApiVersion webhookApiVersion) {
		this.webhookApiVersion = webhookApiVersion;
		return this;
	}

	/**
	 * Get webhookApiVersion
	 * 
	 * @return webhookApiVersion
	 **/
	@ApiModelProperty(value = "")
	public EWebApiVersion getWebhookApiVersion() {
		return webhookApiVersion;
	}

	public void setWebhookApiVersion(EWebApiVersion webhookApiVersion) {
		this.webhookApiVersion = webhookApiVersion;
	}

	public ExternalMessageInterceptorData webhookSecret(String webhookSecret) {
		this.webhookSecret = webhookSecret;
		return this;
	}

	/**
	 * Optional secret sent with each webhook event &lt;p&gt; Maximum length of 4000 characters.
	 * 
	 * @return webhookSecret
	 **/
	@ApiModelProperty(value = "Optional secret sent with each webhook event <p> Maximum length of 4000 characters.")
	public String getWebhookSecret() {
		return webhookSecret;
	}

	public void setWebhookSecret(String webhookSecret) {
		this.webhookSecret = webhookSecret;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessageInterceptorData externalMessageInterceptorData = (ExternalMessageInterceptorData) o;
		return Objects.equals(this.$type, externalMessageInterceptorData.$type) &&
				Objects.equals(this.id, externalMessageInterceptorData.id) &&
				Objects.equals(this.creationTimestamp, externalMessageInterceptorData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, externalMessageInterceptorData.modificationTimestamp) &&
				Objects.equals(this.version, externalMessageInterceptorData.version) &&
				Objects.equals(this.accountId, externalMessageInterceptorData.accountId) &&
				Objects.equals(this.name, externalMessageInterceptorData.name) &&
				Objects.equals(this.description, externalMessageInterceptorData.description) &&
				Objects.equals(this.messageFilter, externalMessageInterceptorData.messageFilter) &&
				Objects.equals(this.timeoutBehavior, externalMessageInterceptorData.timeoutBehavior) &&
				Objects.equals(this.type, externalMessageInterceptorData.type) &&
				Objects.equals(this.webhookStatus, externalMessageInterceptorData.webhookStatus) &&
				Objects.equals(this.webhookEndpoint, externalMessageInterceptorData.webhookEndpoint) &&
				Objects.equals(this.webhookApiVersion, externalMessageInterceptorData.webhookApiVersion) &&
				Objects.equals(this.webhookSecret, externalMessageInterceptorData.webhookSecret);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, messageFilter, timeoutBehavior, type, webhookStatus, webhookEndpoint, webhookApiVersion, webhookSecret);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessageInterceptorData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    messageFilter: ").append(toIndentedString(messageFilter)).append("\n");
		sb.append("    timeoutBehavior: ").append(toIndentedString(timeoutBehavior)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    webhookStatus: ").append(toIndentedString(webhookStatus)).append("\n");
		sb.append("    webhookEndpoint: ").append(toIndentedString(webhookEndpoint)).append("\n");
		sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
		sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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
