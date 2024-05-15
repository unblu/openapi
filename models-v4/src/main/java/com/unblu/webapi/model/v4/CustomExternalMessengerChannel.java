
package com.unblu.webapi.model.v4;

import java.util.HashMap;
import java.util.Map;
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
 * Channel between the collaboration server and an external messenger server. This could be emails, sms or other channels.&lt;br&gt; It defines basically a
 * webhook endpoint where the collaboration server sends new messages to. Messages from the external messenger can be send via the ExternalMessengers web api.
 */
@ApiModel(description = "Channel between the collaboration server and an external messenger server. This could be emails, sms or other channels.<br> It defines basically a webhook endpoint where the collaboration server sends new messages to. Messages from the external messenger can be send via the ExternalMessengers web api.")

@JsonPropertyOrder({
	CustomExternalMessengerChannel.JSON_PROPERTY_$_TYPE,
	CustomExternalMessengerChannel.JSON_PROPERTY_ID,
	CustomExternalMessengerChannel.JSON_PROPERTY_CREATION_TIMESTAMP,
	CustomExternalMessengerChannel.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CustomExternalMessengerChannel.JSON_PROPERTY_VERSION,
	CustomExternalMessengerChannel.JSON_PROPERTY_ACCOUNT_ID,
	CustomExternalMessengerChannel.JSON_PROPERTY_NAME,
	CustomExternalMessengerChannel.JSON_PROPERTY_DESCRIPTION,
	CustomExternalMessengerChannel.JSON_PROPERTY_CHANNEL_ICON,
	CustomExternalMessengerChannel.JSON_PROPERTY_SOURCE_ID,
	CustomExternalMessengerChannel.JSON_PROPERTY_TYPE,
	CustomExternalMessengerChannel.JSON_PROPERTY_WEBHOOK_ENDPOINT,
	CustomExternalMessengerChannel.JSON_PROPERTY_WEBHOOK_API_VERSION,
	CustomExternalMessengerChannel.JSON_PROPERTY_WEBHOOK_SECRET,
	CustomExternalMessengerChannel.JSON_PROPERTY_WEBHOOK_STATUS,
	CustomExternalMessengerChannel.JSON_PROPERTY_MESSAGE_STATE_HANDLED_EXTERNALLY,
	CustomExternalMessengerChannel.JSON_PROPERTY_OUTBOUND_SUPPORTED,
	CustomExternalMessengerChannel.JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS,
	CustomExternalMessengerChannel.JSON_PROPERTY_CONTACT_IDENTIFIER_FIELD_NAME,
	CustomExternalMessengerChannel.JSON_PROPERTY_CONTACT_IDENTIFIER_FIELD_TYPE,
	CustomExternalMessengerChannel.JSON_PROPERTY_CONTACT_IDENTIFIER_TRANSLATIONS,
	CustomExternalMessengerChannel.JSON_PROPERTY_SUPPORTS_MULTIPLE_CONVERSATIONS_PER_CONTACT,
	CustomExternalMessengerChannel.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomExternalMessengerChannel implements ExternalMessengerChannel {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMEXTERNALMESSENGERCHANNEL("CustomExternalMessengerChannel");

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
			return TypeEnum.CUSTOMEXTERNALMESSENGERCHANNEL;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMEXTERNALMESSENGERCHANNEL;

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

	public static final String JSON_PROPERTY_CHANNEL_ICON = "channelIcon";
	@JsonProperty(JSON_PROPERTY_CHANNEL_ICON)
	private ExpandableField<Avatar> channelIcon = null;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerChannelType type = EExternalMessengerChannelType.CUSTOM;

	public static final String JSON_PROPERTY_WEBHOOK_ENDPOINT = "webhookEndpoint";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_ENDPOINT)
	private String webhookEndpoint;

	public static final String JSON_PROPERTY_WEBHOOK_API_VERSION = "webhookApiVersion";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_API_VERSION)
	private EWebApiVersion webhookApiVersion;

	public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
	private String webhookSecret;

	public static final String JSON_PROPERTY_WEBHOOK_STATUS = "webhookStatus";
	@JsonProperty(JSON_PROPERTY_WEBHOOK_STATUS)
	private ERegistrationStatus webhookStatus;

	public static final String JSON_PROPERTY_MESSAGE_STATE_HANDLED_EXTERNALLY = "messageStateHandledExternally";
	@JsonProperty(JSON_PROPERTY_MESSAGE_STATE_HANDLED_EXTERNALLY)
	private Boolean messageStateHandledExternally;

	public static final String JSON_PROPERTY_OUTBOUND_SUPPORTED = "outboundSupported";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_SUPPORTED)
	private Boolean outboundSupported;

	public static final String JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS = "outboundTimeoutMillis";
	@JsonProperty(JSON_PROPERTY_OUTBOUND_TIMEOUT_MILLIS)
	private Long outboundTimeoutMillis;

	public static final String JSON_PROPERTY_CONTACT_IDENTIFIER_FIELD_NAME = "contactIdentifierFieldName";
	@JsonProperty(JSON_PROPERTY_CONTACT_IDENTIFIER_FIELD_NAME)
	private String contactIdentifierFieldName;

	public static final String JSON_PROPERTY_CONTACT_IDENTIFIER_FIELD_TYPE = "contactIdentifierFieldType";
	@JsonProperty(JSON_PROPERTY_CONTACT_IDENTIFIER_FIELD_TYPE)
	private EContactIdentifierFieldType contactIdentifierFieldType;

	public static final String JSON_PROPERTY_CONTACT_IDENTIFIER_TRANSLATIONS = "contactIdentifierTranslations";
	@JsonProperty(JSON_PROPERTY_CONTACT_IDENTIFIER_TRANSLATIONS)
	private Map<String, CustomChannelContactIdentifierTranslation> contactIdentifierTranslations = null;

	public static final String JSON_PROPERTY_SUPPORTS_MULTIPLE_CONVERSATIONS_PER_CONTACT = "supportsMultipleConversationsPerContact";
	@JsonProperty(JSON_PROPERTY_SUPPORTS_MULTIPLE_CONVERSATIONS_PER_CONTACT)
	private Boolean supportsMultipleConversationsPerContact;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public CustomExternalMessengerChannel $type(TypeEnum $type) {
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

	public CustomExternalMessengerChannel id(String id) {
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

	public CustomExternalMessengerChannel creationTimestamp(Long creationTimestamp) {
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

	public CustomExternalMessengerChannel modificationTimestamp(Long modificationTimestamp) {
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

	public CustomExternalMessengerChannel version(Long version) {
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

	public CustomExternalMessengerChannel accountId(String accountId) {
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

	public CustomExternalMessengerChannel name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the channel. Needs to be unique in the account.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the channel. Needs to be unique in the account.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomExternalMessengerChannel description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Optional description of the channel
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Optional description of the channel")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CustomExternalMessengerChannel channelIcon(ExpandableField<Avatar> channelIcon) {
		this.channelIcon = channelIcon;
		return this;
	}

	/**
	 * Channel icon of the entity: id that can be expanded.
	 * 
	 * @return channelIcon
	 **/
	@ApiModelProperty(value = "Channel icon of the entity: id that can be expanded.")
	public ExpandableField<Avatar> getChannelIcon() {
		return channelIcon;
	}

	public void setChannelIcon(ExpandableField<Avatar> channelIcon) {
		this.channelIcon = channelIcon;
	}

	public CustomExternalMessengerChannel sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * Custom identifier to find the source of the channel.&lt;br&gt; Has a maximum of 250 characters
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "Custom identifier to find the source of the channel.<br> Has a maximum of 250 characters")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public CustomExternalMessengerChannel type(EExternalMessengerChannelType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EExternalMessengerChannelType getType() {
		return type;
	}

	public void setType(EExternalMessengerChannelType type) {
		this.type = type;
	}

	public CustomExternalMessengerChannel webhookEndpoint(String webhookEndpoint) {
		this.webhookEndpoint = webhookEndpoint;
		return this;
	}

	/**
	 * The endpoint url of the webhook registration. To this url the requests for the webhook events are done. Maximum length of 4000 characters. Can not be
	 * omitted.
	 * 
	 * @return webhookEndpoint
	 **/
	@ApiModelProperty(value = "The endpoint url of the webhook registration. To this url the requests for the webhook events are done. Maximum length of 4000 characters. Can not be omitted.")
	public String getWebhookEndpoint() {
		return webhookEndpoint;
	}

	public void setWebhookEndpoint(String webhookEndpoint) {
		this.webhookEndpoint = webhookEndpoint;
	}

	public CustomExternalMessengerChannel webhookApiVersion(EWebApiVersion webhookApiVersion) {
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

	public CustomExternalMessengerChannel webhookSecret(String webhookSecret) {
		this.webhookSecret = webhookSecret;
		return this;
	}

	/**
	 * A secret which is send with each webhook event. Maximum length of 4000 characters. Can be omitted.
	 * 
	 * @return webhookSecret
	 **/
	@ApiModelProperty(value = "A secret which is send with each webhook event. Maximum length of 4000 characters. Can be omitted.")
	public String getWebhookSecret() {
		return webhookSecret;
	}

	public void setWebhookSecret(String webhookSecret) {
		this.webhookSecret = webhookSecret;
	}

	public CustomExternalMessengerChannel webhookStatus(ERegistrationStatus webhookStatus) {
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

	public CustomExternalMessengerChannel messageStateHandledExternally(Boolean messageStateHandledExternally) {
		this.messageStateHandledExternally = messageStateHandledExternally;
		return this;
	}

	/**
	 * Defines if the delivered/read state of messages is handled externally or by the collaboration server. &lt;br&gt; If the collaboration server handles the
	 * state, the messages are marked as delivered and read a soon as the webhook could be successfully dispatched to the configured webhookEndpoint.&lt;br&gt; If
	 * the it is handled externally, the external service has to call the api function to mark the message as delivered/read. Additionally webhook events for the
	 * message state of messages from the external messenger are dispatched.
	 * 
	 * @return messageStateHandledExternally
	 **/
	@ApiModelProperty(value = "Defines if the delivered/read state of messages is handled externally or by the collaboration server. <br> If the collaboration server handles the state, the messages are marked as delivered and read a soon as the webhook could be successfully dispatched to the configured webhookEndpoint.<br> If the it is handled externally, the external service has to call the api function to mark the message as delivered/read. Additionally webhook events for the message state of messages from the external messenger are dispatched.")
	public Boolean isMessageStateHandledExternally() {
		return messageStateHandledExternally;
	}

	public void setMessageStateHandledExternally(Boolean messageStateHandledExternally) {
		this.messageStateHandledExternally = messageStateHandledExternally;
	}

	public CustomExternalMessengerChannel outboundSupported(Boolean outboundSupported) {
		this.outboundSupported = outboundSupported;
		return this;
	}

	/**
	 * Defines if outbound requests to create external messenger contacts or conversations are supported
	 * 
	 * @return outboundSupported
	 **/
	@ApiModelProperty(value = "Defines if outbound requests to create external messenger contacts or conversations are supported")
	public Boolean isOutboundSupported() {
		return outboundSupported;
	}

	public void setOutboundSupported(Boolean outboundSupported) {
		this.outboundSupported = outboundSupported;
	}

	public CustomExternalMessengerChannel outboundTimeoutMillis(Long outboundTimeoutMillis) {
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

	public CustomExternalMessengerChannel contactIdentifierFieldName(String contactIdentifierFieldName) {
		this.contactIdentifierFieldName = contactIdentifierFieldName;
		return this;
	}

	/**
	 * The name of the field that contacts can be identified by in the external messenger. This can be an email address, a phone number, a number, or some other
	 * identifier.
	 * 
	 * @return contactIdentifierFieldName
	 **/
	@ApiModelProperty(value = "The name of the field that contacts can be identified by in the external messenger. This can be an email address, a phone number, a number, or some other identifier.")
	public String getContactIdentifierFieldName() {
		return contactIdentifierFieldName;
	}

	public void setContactIdentifierFieldName(String contactIdentifierFieldName) {
		this.contactIdentifierFieldName = contactIdentifierFieldName;
	}

	public CustomExternalMessengerChannel contactIdentifierFieldType(EContactIdentifierFieldType contactIdentifierFieldType) {
		this.contactIdentifierFieldType = contactIdentifierFieldType;
		return this;
	}

	/**
	 * Get contactIdentifierFieldType
	 * 
	 * @return contactIdentifierFieldType
	 **/
	@ApiModelProperty(value = "")
	public EContactIdentifierFieldType getContactIdentifierFieldType() {
		return contactIdentifierFieldType;
	}

	public void setContactIdentifierFieldType(EContactIdentifierFieldType contactIdentifierFieldType) {
		this.contactIdentifierFieldType = contactIdentifierFieldType;
	}

	public CustomExternalMessengerChannel contactIdentifierTranslations(Map<String, CustomChannelContactIdentifierTranslation> contactIdentifierTranslations) {
		this.contactIdentifierTranslations = contactIdentifierTranslations;
		return this;
	}

	public CustomExternalMessengerChannel putContactIdentifierTranslationsItem(String key, CustomChannelContactIdentifierTranslation contactIdentifierTranslationsItem) {
		if (this.contactIdentifierTranslations == null) {
			this.contactIdentifierTranslations = new HashMap<>();
		}
		this.contactIdentifierTranslations.put(key, contactIdentifierTranslationsItem);
		return this;
	}

	/**
	 * The translations for the contact identifier field
	 * 
	 * @return contactIdentifierTranslations
	 **/
	@ApiModelProperty(value = "The translations for the contact identifier field")
	public Map<String, CustomChannelContactIdentifierTranslation> getContactIdentifierTranslations() {
		return contactIdentifierTranslations;
	}

	public void setContactIdentifierTranslations(Map<String, CustomChannelContactIdentifierTranslation> contactIdentifierTranslations) {
		this.contactIdentifierTranslations = contactIdentifierTranslations;
	}

	public CustomExternalMessengerChannel supportsMultipleConversationsPerContact(Boolean supportsMultipleConversationsPerContact) {
		this.supportsMultipleConversationsPerContact = supportsMultipleConversationsPerContact;
		return this;
	}

	/**
	 * The channel supports multiple conversations for a contact. If false, there can be only one active conversation for that contact.
	 * 
	 * @return supportsMultipleConversationsPerContact
	 **/
	@ApiModelProperty(value = "The channel supports multiple conversations for a contact. If false, there can be only one active conversation for that contact.")
	public Boolean isSupportsMultipleConversationsPerContact() {
		return supportsMultipleConversationsPerContact;
	}

	public void setSupportsMultipleConversationsPerContact(Boolean supportsMultipleConversationsPerContact) {
		this.supportsMultipleConversationsPerContact = supportsMultipleConversationsPerContact;
	}

	public CustomExternalMessengerChannel metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public CustomExternalMessengerChannel putMetadataItem(String key, String metadataItem) {
		if (this.metadata == null) {
			this.metadata = new HashMap<>();
		}
		this.metadata.put(key, metadataItem);
		return this;
	}

	/**
	 * The entity&#39;s metadata properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;metadata&#39;. Not filled in
	 * webhook events.
	 * 
	 * @return metadata
	 **/
	@ApiModelProperty(value = "The entity's metadata properties. Only contains values when the 'expand' query parameter is used with the value 'metadata'. Not filled in webhook events.")
	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomExternalMessengerChannel customExternalMessengerChannel = (CustomExternalMessengerChannel) o;
		return Objects.equals(this.$type, customExternalMessengerChannel.$type) &&
				Objects.equals(this.id, customExternalMessengerChannel.id) &&
				Objects.equals(this.creationTimestamp, customExternalMessengerChannel.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, customExternalMessengerChannel.modificationTimestamp) &&
				Objects.equals(this.version, customExternalMessengerChannel.version) &&
				Objects.equals(this.accountId, customExternalMessengerChannel.accountId) &&
				Objects.equals(this.name, customExternalMessengerChannel.name) &&
				Objects.equals(this.description, customExternalMessengerChannel.description) &&
				Objects.equals(this.channelIcon, customExternalMessengerChannel.channelIcon) &&
				Objects.equals(this.sourceId, customExternalMessengerChannel.sourceId) &&
				Objects.equals(this.type, customExternalMessengerChannel.type) &&
				Objects.equals(this.webhookEndpoint, customExternalMessengerChannel.webhookEndpoint) &&
				Objects.equals(this.webhookApiVersion, customExternalMessengerChannel.webhookApiVersion) &&
				Objects.equals(this.webhookSecret, customExternalMessengerChannel.webhookSecret) &&
				Objects.equals(this.webhookStatus, customExternalMessengerChannel.webhookStatus) &&
				Objects.equals(this.messageStateHandledExternally, customExternalMessengerChannel.messageStateHandledExternally) &&
				Objects.equals(this.outboundSupported, customExternalMessengerChannel.outboundSupported) &&
				Objects.equals(this.outboundTimeoutMillis, customExternalMessengerChannel.outboundTimeoutMillis) &&
				Objects.equals(this.contactIdentifierFieldName, customExternalMessengerChannel.contactIdentifierFieldName) &&
				Objects.equals(this.contactIdentifierFieldType, customExternalMessengerChannel.contactIdentifierFieldType) &&
				Objects.equals(this.contactIdentifierTranslations, customExternalMessengerChannel.contactIdentifierTranslations) &&
				Objects.equals(this.supportsMultipleConversationsPerContact, customExternalMessengerChannel.supportsMultipleConversationsPerContact) &&
				Objects.equals(this.metadata, customExternalMessengerChannel.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, channelIcon, sourceId, type, webhookEndpoint, webhookApiVersion, webhookSecret, webhookStatus, messageStateHandledExternally, outboundSupported, outboundTimeoutMillis, contactIdentifierFieldName, contactIdentifierFieldType, contactIdentifierTranslations, supportsMultipleConversationsPerContact, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomExternalMessengerChannel {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    channelIcon: ").append(toIndentedString(channelIcon)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    webhookEndpoint: ").append(toIndentedString(webhookEndpoint)).append("\n");
		sb.append("    webhookApiVersion: ").append(toIndentedString(webhookApiVersion)).append("\n");
		sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
		sb.append("    webhookStatus: ").append(toIndentedString(webhookStatus)).append("\n");
		sb.append("    messageStateHandledExternally: ").append(toIndentedString(messageStateHandledExternally)).append("\n");
		sb.append("    outboundSupported: ").append(toIndentedString(outboundSupported)).append("\n");
		sb.append("    outboundTimeoutMillis: ").append(toIndentedString(outboundTimeoutMillis)).append("\n");
		sb.append("    contactIdentifierFieldName: ").append(toIndentedString(contactIdentifierFieldName)).append("\n");
		sb.append("    contactIdentifierFieldType: ").append(toIndentedString(contactIdentifierFieldType)).append("\n");
		sb.append("    contactIdentifierTranslations: ").append(toIndentedString(contactIdentifierTranslations)).append("\n");
		sb.append("    supportsMultipleConversationsPerContact: ").append(toIndentedString(supportsMultipleConversationsPerContact)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
