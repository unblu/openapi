
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
 * Channel between the collaboration server and WhatsApp&lt;br&gt; It defines the data needed in order to use the WhatsApp API.
 */
@ApiModel(description = "Channel between the collaboration server and WhatsApp<br> It defines the data needed in order to use the WhatsApp API.")

@JsonPropertyOrder({
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_$_TYPE,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_ID,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_CREATION_TIMESTAMP,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_VERSION,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_ACCOUNT_ID,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_NAME,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_DESCRIPTION,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_CHANNEL_ICON,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_SOURCE_ID,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_TYPE,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_BUSINESS_ACCOUNT_ID,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_PHONE_NUMBER_ID,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_ACCESS_TOKEN,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_APP_SECRET,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_INBOUND_TEMPLATE_NAME,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_RECIPIENT_TYPE,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_RECIPIENT_NAME,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_ACTIVE,
	WhatsAppExternalMessengerChannel.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppExternalMessengerChannel implements ExternalMessengerChannel {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPEXTERNALMESSENGERCHANNEL("WhatsAppExternalMessengerChannel");

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
			return TypeEnum.WHATSAPPEXTERNALMESSENGERCHANNEL;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPEXTERNALMESSENGERCHANNEL;

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
	private EExternalMessengerChannelType type = EExternalMessengerChannelType.WHATS_APP;

	public static final String JSON_PROPERTY_BUSINESS_ACCOUNT_ID = "businessAccountId";
	@JsonProperty(JSON_PROPERTY_BUSINESS_ACCOUNT_ID)
	private String businessAccountId;

	public static final String JSON_PROPERTY_PHONE_NUMBER_ID = "phoneNumberId";
	@JsonProperty(JSON_PROPERTY_PHONE_NUMBER_ID)
	private String phoneNumberId;

	public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
	@JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
	private String accessToken;

	public static final String JSON_PROPERTY_APP_SECRET = "appSecret";
	@JsonProperty(JSON_PROPERTY_APP_SECRET)
	private String appSecret;

	public static final String JSON_PROPERTY_INBOUND_TEMPLATE_NAME = "inboundTemplateName";
	@JsonProperty(JSON_PROPERTY_INBOUND_TEMPLATE_NAME)
	private String inboundTemplateName;

	public static final String JSON_PROPERTY_RECIPIENT_TYPE = "recipientType";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_TYPE)
	private EConversationRecipientType recipientType;

	public static final String JSON_PROPERTY_RECIPIENT_NAME = "recipientName";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_NAME)
	private String recipientName;

	public static final String JSON_PROPERTY_ACTIVE = "active";
	@JsonProperty(JSON_PROPERTY_ACTIVE)
	private Boolean active;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public WhatsAppExternalMessengerChannel $type(TypeEnum $type) {
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

	public WhatsAppExternalMessengerChannel id(String id) {
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

	public WhatsAppExternalMessengerChannel creationTimestamp(Long creationTimestamp) {
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

	public WhatsAppExternalMessengerChannel modificationTimestamp(Long modificationTimestamp) {
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

	public WhatsAppExternalMessengerChannel version(Long version) {
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

	public WhatsAppExternalMessengerChannel accountId(String accountId) {
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

	public WhatsAppExternalMessengerChannel name(String name) {
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

	public WhatsAppExternalMessengerChannel description(String description) {
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

	public WhatsAppExternalMessengerChannel channelIcon(ExpandableField<Avatar> channelIcon) {
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

	public WhatsAppExternalMessengerChannel sourceId(String sourceId) {
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

	public WhatsAppExternalMessengerChannel type(EExternalMessengerChannelType type) {
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

	public WhatsAppExternalMessengerChannel businessAccountId(String businessAccountId) {
		this.businessAccountId = businessAccountId;
		return this;
	}

	/**
	 * The whatsApp business accountId from which the template will be received
	 * 
	 * @return businessAccountId
	 **/
	@ApiModelProperty(value = "The whatsApp business accountId from which the template will be received")
	public String getBusinessAccountId() {
		return businessAccountId;
	}

	public void setBusinessAccountId(String businessAccountId) {
		this.businessAccountId = businessAccountId;
	}

	public WhatsAppExternalMessengerChannel phoneNumberId(String phoneNumberId) {
		this.phoneNumberId = phoneNumberId;
		return this;
	}

	/**
	 * The phone number ID that will be used to send messages
	 * 
	 * @return phoneNumberId
	 **/
	@ApiModelProperty(value = "The phone number ID that will be used to send messages")
	public String getPhoneNumberId() {
		return phoneNumberId;
	}

	public void setPhoneNumberId(String phoneNumberId) {
		this.phoneNumberId = phoneNumberId;
	}

	public WhatsAppExternalMessengerChannel accessToken(String accessToken) {
		this.accessToken = accessToken;
		return this;
	}

	/**
	 * The access token to connect to the WhatsApp API. Can only be written.
	 * 
	 * @return accessToken
	 **/
	@ApiModelProperty(value = "The access token to connect to the WhatsApp API. Can only be written.")
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public WhatsAppExternalMessengerChannel appSecret(String appSecret) {
		this.appSecret = appSecret;
		return this;
	}

	/**
	 * The app secret used to validate the webhook payloads
	 * 
	 * @return appSecret
	 **/
	@ApiModelProperty(value = "The app secret used to validate the webhook payloads")
	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}

	public WhatsAppExternalMessengerChannel inboundTemplateName(String inboundTemplateName) {
		this.inboundTemplateName = inboundTemplateName;
		return this;
	}

	/**
	 * The name of the conversation template for new inbound conversation requests. If no template of that name can be found, the default template
	 * for&#x60;EInitialEngagementType.OFFLINE_CHAT_REQUEST&#x60; is used.
	 * 
	 * @return inboundTemplateName
	 **/
	@ApiModelProperty(value = "The name of the conversation template for new inbound conversation requests. If no template of that name can be found, the default template for`EInitialEngagementType.OFFLINE_CHAT_REQUEST` is used.")
	public String getInboundTemplateName() {
		return inboundTemplateName;
	}

	public void setInboundTemplateName(String inboundTemplateName) {
		this.inboundTemplateName = inboundTemplateName;
	}

	public WhatsAppExternalMessengerChannel recipientType(EConversationRecipientType recipientType) {
		this.recipientType = recipientType;
		return this;
	}

	/**
	 * Get recipientType
	 * 
	 * @return recipientType
	 **/
	@ApiModelProperty(value = "")
	public EConversationRecipientType getRecipientType() {
		return recipientType;
	}

	public void setRecipientType(EConversationRecipientType recipientType) {
		this.recipientType = recipientType;
	}

	public WhatsAppExternalMessengerChannel recipientName(String recipientName) {
		this.recipientName = recipientName;
		return this;
	}

	/**
	 * The name of the conversation recipient for new inbound conversation requests. It is used together with the &#x60;recipientType&#x60;. If the recipient
	 * can&#39;t be found, the account is used. &lt;p&gt; For &#x60;EConversationRecipientType.ACCOUNT&#x60;, the &#x60;recipientName&#x60; is not relevant. The
	 * account that the channel belongs to is used. &lt;p&gt; For &#x60;EConversationRecipientType.NAMED_AREA&#x60;, the &#x60;recipientName&#x60; must match the
	 * name (not the ID) of a named area. &lt;p&gt; For &#x60;EConversationRecipientType.TEAM&#x60;, the &#x60;recipientName&#x60; must match a team&#39;s name.
	 * &lt;p&gt; For &#x60;EConversationRecipientType.AGENT&#x60;, the &#x60;recipientName&#x60; must match an agent&#39;s username.
	 * 
	 * @return recipientName
	 **/
	@ApiModelProperty(value = "The name of the conversation recipient for new inbound conversation requests. It is used together with the `recipientType`. If the recipient can't be found, the account is used. <p> For `EConversationRecipientType.ACCOUNT`, the `recipientName` is not relevant. The account that the channel belongs to is used. <p> For `EConversationRecipientType.NAMED_AREA`, the `recipientName` must match the name (not the ID) of a named area. <p> For `EConversationRecipientType.TEAM`, the `recipientName` must match a team's name. <p> For `EConversationRecipientType.AGENT`, the `recipientName` must match an agent's username.")
	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public WhatsAppExternalMessengerChannel active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * If the channel is active or not
	 * 
	 * @return active
	 **/
	@ApiModelProperty(value = "If the channel is active or not")
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public WhatsAppExternalMessengerChannel metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public WhatsAppExternalMessengerChannel putMetadataItem(String key, String metadataItem) {
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
		WhatsAppExternalMessengerChannel whatsAppExternalMessengerChannel = (WhatsAppExternalMessengerChannel) o;
		return Objects.equals(this.$type, whatsAppExternalMessengerChannel.$type) &&
				Objects.equals(this.id, whatsAppExternalMessengerChannel.id) &&
				Objects.equals(this.creationTimestamp, whatsAppExternalMessengerChannel.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, whatsAppExternalMessengerChannel.modificationTimestamp) &&
				Objects.equals(this.version, whatsAppExternalMessengerChannel.version) &&
				Objects.equals(this.accountId, whatsAppExternalMessengerChannel.accountId) &&
				Objects.equals(this.name, whatsAppExternalMessengerChannel.name) &&
				Objects.equals(this.description, whatsAppExternalMessengerChannel.description) &&
				Objects.equals(this.channelIcon, whatsAppExternalMessengerChannel.channelIcon) &&
				Objects.equals(this.sourceId, whatsAppExternalMessengerChannel.sourceId) &&
				Objects.equals(this.type, whatsAppExternalMessengerChannel.type) &&
				Objects.equals(this.businessAccountId, whatsAppExternalMessengerChannel.businessAccountId) &&
				Objects.equals(this.phoneNumberId, whatsAppExternalMessengerChannel.phoneNumberId) &&
				Objects.equals(this.accessToken, whatsAppExternalMessengerChannel.accessToken) &&
				Objects.equals(this.appSecret, whatsAppExternalMessengerChannel.appSecret) &&
				Objects.equals(this.inboundTemplateName, whatsAppExternalMessengerChannel.inboundTemplateName) &&
				Objects.equals(this.recipientType, whatsAppExternalMessengerChannel.recipientType) &&
				Objects.equals(this.recipientName, whatsAppExternalMessengerChannel.recipientName) &&
				Objects.equals(this.active, whatsAppExternalMessengerChannel.active) &&
				Objects.equals(this.metadata, whatsAppExternalMessengerChannel.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, channelIcon, sourceId, type, businessAccountId, phoneNumberId, accessToken, appSecret, inboundTemplateName, recipientType, recipientName, active, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppExternalMessengerChannel {\n");
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
		sb.append("    businessAccountId: ").append(toIndentedString(businessAccountId)).append("\n");
		sb.append("    phoneNumberId: ").append(toIndentedString(phoneNumberId)).append("\n");
		sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
		sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
		sb.append("    inboundTemplateName: ").append(toIndentedString(inboundTemplateName)).append("\n");
		sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
		sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
