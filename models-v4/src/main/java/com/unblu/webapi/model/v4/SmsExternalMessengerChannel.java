
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
 * Channel allowing to connect Unblu with SMS using Twilio as the backend SMS system.&lt;br&gt; It defines the data needed in order to use the Twilio API.
 */
@ApiModel(description = "Channel allowing to connect Unblu with SMS using Twilio as the backend SMS system.<br> It defines the data needed in order to use the Twilio API.")

@JsonPropertyOrder({
	SmsExternalMessengerChannel.JSON_PROPERTY_$_TYPE,
	SmsExternalMessengerChannel.JSON_PROPERTY_ID,
	SmsExternalMessengerChannel.JSON_PROPERTY_CREATION_TIMESTAMP,
	SmsExternalMessengerChannel.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	SmsExternalMessengerChannel.JSON_PROPERTY_VERSION,
	SmsExternalMessengerChannel.JSON_PROPERTY_ACCOUNT_ID,
	SmsExternalMessengerChannel.JSON_PROPERTY_NAME,
	SmsExternalMessengerChannel.JSON_PROPERTY_DESCRIPTION,
	SmsExternalMessengerChannel.JSON_PROPERTY_CHANNEL_ICON,
	SmsExternalMessengerChannel.JSON_PROPERTY_SOURCE_ID,
	SmsExternalMessengerChannel.JSON_PROPERTY_TYPE,
	SmsExternalMessengerChannel.JSON_PROPERTY_TWILIO_ACCOUNT_SID,
	SmsExternalMessengerChannel.JSON_PROPERTY_TWILIO_AUTH_TOKEN,
	SmsExternalMessengerChannel.JSON_PROPERTY_PHONE_NUMBER,
	SmsExternalMessengerChannel.JSON_PROPERTY_INBOUND_TEMPLATE_NAME,
	SmsExternalMessengerChannel.JSON_PROPERTY_RECIPIENT_TYPE,
	SmsExternalMessengerChannel.JSON_PROPERTY_RECIPIENT_NAME,
	SmsExternalMessengerChannel.JSON_PROPERTY_ACTIVE,
	SmsExternalMessengerChannel.JSON_PROPERTY_SUPPORTS_MULTIPLE_CONVERSATIONS_PER_CONTACT,
	SmsExternalMessengerChannel.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SmsExternalMessengerChannel implements ExternalMessengerChannel {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SMSEXTERNALMESSENGERCHANNEL("SmsExternalMessengerChannel");

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
			return TypeEnum.SMSEXTERNALMESSENGERCHANNEL;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SMSEXTERNALMESSENGERCHANNEL;

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
	private EExternalMessengerChannelType type = EExternalMessengerChannelType.SMS;

	public static final String JSON_PROPERTY_TWILIO_ACCOUNT_SID = "twilioAccountSid";
	@JsonProperty(JSON_PROPERTY_TWILIO_ACCOUNT_SID)
	private String twilioAccountSid;

	public static final String JSON_PROPERTY_TWILIO_AUTH_TOKEN = "twilioAuthToken";
	@JsonProperty(JSON_PROPERTY_TWILIO_AUTH_TOKEN)
	private String twilioAuthToken;

	public static final String JSON_PROPERTY_PHONE_NUMBER = "phoneNumber";
	@JsonProperty(JSON_PROPERTY_PHONE_NUMBER)
	private String phoneNumber;

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

	public static final String JSON_PROPERTY_SUPPORTS_MULTIPLE_CONVERSATIONS_PER_CONTACT = "supportsMultipleConversationsPerContact";
	@JsonProperty(JSON_PROPERTY_SUPPORTS_MULTIPLE_CONVERSATIONS_PER_CONTACT)
	private Boolean supportsMultipleConversationsPerContact;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public SmsExternalMessengerChannel $type(TypeEnum $type) {
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

	public SmsExternalMessengerChannel id(String id) {
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

	public SmsExternalMessengerChannel creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency..
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency..")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public SmsExternalMessengerChannel modificationTimestamp(Long modificationTimestamp) {
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

	public SmsExternalMessengerChannel version(Long version) {
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

	public SmsExternalMessengerChannel accountId(String accountId) {
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

	public SmsExternalMessengerChannel name(String name) {
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

	public SmsExternalMessengerChannel description(String description) {
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

	public SmsExternalMessengerChannel channelIcon(ExpandableField<Avatar> channelIcon) {
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

	public SmsExternalMessengerChannel sourceId(String sourceId) {
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

	public SmsExternalMessengerChannel type(EExternalMessengerChannelType type) {
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

	public SmsExternalMessengerChannel twilioAccountSid(String twilioAccountSid) {
		this.twilioAccountSid = twilioAccountSid;
		return this;
	}

	/**
	 * A unique key that identifies a specific Twilio parent account or subaccount. The Account SID is a credential and acts as a username.
	 * 
	 * @return twilioAccountSid
	 **/
	@ApiModelProperty(value = "A unique key that identifies a specific Twilio parent account or subaccount. The Account SID is a credential and acts as a username.")
	public String getTwilioAccountSid() {
		return twilioAccountSid;
	}

	public void setTwilioAccountSid(String twilioAccountSid) {
		this.twilioAccountSid = twilioAccountSid;
	}

	public SmsExternalMessengerChannel twilioAuthToken(String twilioAuthToken) {
		this.twilioAuthToken = twilioAuthToken;
		return this;
	}

	/**
	 * The promoted authentication token used to authenticate future API requests
	 * 
	 * @return twilioAuthToken
	 **/
	@ApiModelProperty(value = "The promoted authentication token used to authenticate future API requests")
	public String getTwilioAuthToken() {
		return twilioAuthToken;
	}

	public void setTwilioAuthToken(String twilioAuthToken) {
		this.twilioAuthToken = twilioAuthToken;
	}

	public SmsExternalMessengerChannel phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	/**
	 * The phone number used as the sender for SMS messages. The phone number must conform to the E.164 format.
	 * 
	 * @return phoneNumber
	 **/
	@ApiModelProperty(value = "The phone number used as the sender for SMS messages. The phone number must conform to the E.164 format.")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public SmsExternalMessengerChannel inboundTemplateName(String inboundTemplateName) {
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

	public SmsExternalMessengerChannel recipientType(EConversationRecipientType recipientType) {
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

	public SmsExternalMessengerChannel recipientName(String recipientName) {
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

	public SmsExternalMessengerChannel active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Specifies whether the channel is active
	 * 
	 * @return active
	 **/
	@ApiModelProperty(value = "Specifies whether the channel is active")
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public SmsExternalMessengerChannel supportsMultipleConversationsPerContact(Boolean supportsMultipleConversationsPerContact) {
		this.supportsMultipleConversationsPerContact = supportsMultipleConversationsPerContact;
		return this;
	}

	/**
	 * SMS channels only support one active conversation per contact. This field must therefore always be \&quot;false\&quot;.
	 * 
	 * @return supportsMultipleConversationsPerContact
	 **/
	@ApiModelProperty(value = "SMS channels only support one active conversation per contact. This field must therefore always be \"false\".")
	public Boolean isSupportsMultipleConversationsPerContact() {
		return supportsMultipleConversationsPerContact;
	}

	public void setSupportsMultipleConversationsPerContact(Boolean supportsMultipleConversationsPerContact) {
		this.supportsMultipleConversationsPerContact = supportsMultipleConversationsPerContact;
	}

	public SmsExternalMessengerChannel metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public SmsExternalMessengerChannel putMetadataItem(String key, String metadataItem) {
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
		SmsExternalMessengerChannel smsExternalMessengerChannel = (SmsExternalMessengerChannel) o;
		return Objects.equals(this.$type, smsExternalMessengerChannel.$type) &&
				Objects.equals(this.id, smsExternalMessengerChannel.id) &&
				Objects.equals(this.creationTimestamp, smsExternalMessengerChannel.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, smsExternalMessengerChannel.modificationTimestamp) &&
				Objects.equals(this.version, smsExternalMessengerChannel.version) &&
				Objects.equals(this.accountId, smsExternalMessengerChannel.accountId) &&
				Objects.equals(this.name, smsExternalMessengerChannel.name) &&
				Objects.equals(this.description, smsExternalMessengerChannel.description) &&
				Objects.equals(this.channelIcon, smsExternalMessengerChannel.channelIcon) &&
				Objects.equals(this.sourceId, smsExternalMessengerChannel.sourceId) &&
				Objects.equals(this.type, smsExternalMessengerChannel.type) &&
				Objects.equals(this.twilioAccountSid, smsExternalMessengerChannel.twilioAccountSid) &&
				Objects.equals(this.twilioAuthToken, smsExternalMessengerChannel.twilioAuthToken) &&
				Objects.equals(this.phoneNumber, smsExternalMessengerChannel.phoneNumber) &&
				Objects.equals(this.inboundTemplateName, smsExternalMessengerChannel.inboundTemplateName) &&
				Objects.equals(this.recipientType, smsExternalMessengerChannel.recipientType) &&
				Objects.equals(this.recipientName, smsExternalMessengerChannel.recipientName) &&
				Objects.equals(this.active, smsExternalMessengerChannel.active) &&
				Objects.equals(this.supportsMultipleConversationsPerContact, smsExternalMessengerChannel.supportsMultipleConversationsPerContact) &&
				Objects.equals(this.metadata, smsExternalMessengerChannel.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, channelIcon, sourceId, type, twilioAccountSid, twilioAuthToken, phoneNumber, inboundTemplateName, recipientType, recipientName, active, supportsMultipleConversationsPerContact, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SmsExternalMessengerChannel {\n");
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
		sb.append("    twilioAccountSid: ").append(toIndentedString(twilioAccountSid)).append("\n");
		sb.append("    twilioAuthToken: ").append(toIndentedString(twilioAuthToken)).append("\n");
		sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
		sb.append("    inboundTemplateName: ").append(toIndentedString(inboundTemplateName)).append("\n");
		sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
		sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
