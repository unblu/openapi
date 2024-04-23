
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
 * Model of a messenger conversation. The Conversation template is a container for default conversation configuration
 */
@ApiModel(description = "Model of a messenger conversation. The Conversation template is a container for default conversation configuration")

@JsonPropertyOrder({
	ConversationTemplate.JSON_PROPERTY_$_TYPE,
	ConversationTemplate.JSON_PROPERTY_ID,
	ConversationTemplate.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationTemplate.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ConversationTemplate.JSON_PROPERTY_VERSION,
	ConversationTemplate.JSON_PROPERTY_ACCOUNT_ID,
	ConversationTemplate.JSON_PROPERTY_NAME,
	ConversationTemplate.JSON_PROPERTY_DESCRIPTION,
	ConversationTemplate.JSON_PROPERTY_DEFAULT_TEMPLATE,
	ConversationTemplate.JSON_PROPERTY_CONVERSATION_VISIBILITY,
	ConversationTemplate.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationTemplate.JSON_PROPERTY_TRANSLATIONS,
	ConversationTemplate.JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS,
	ConversationTemplate.JSON_PROPERTY_CONFIGURATION,
	ConversationTemplate.JSON_PROPERTY_TEXT,
	ConversationTemplate.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationTemplate {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONTEMPLATE("ConversationTemplate");

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
			return TypeEnum.CONVERSATIONTEMPLATE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONTEMPLATE;

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

	public static final String JSON_PROPERTY_DEFAULT_TEMPLATE = "defaultTemplate";
	@JsonProperty(JSON_PROPERTY_DEFAULT_TEMPLATE)
	private Boolean defaultTemplate;

	public static final String JSON_PROPERTY_CONVERSATION_VISIBILITY = "conversationVisibility";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_VISIBILITY)
	private EConversationVisibility conversationVisibility;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, ConversationTemplateTranslation> translations = null;

	public static final String JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS = "inheritConfigurationAndTexts";
	@JsonProperty(JSON_PROPERTY_INHERIT_CONFIGURATION_AND_TEXTS)
	private Boolean inheritConfigurationAndTexts;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private Map<String, Map<String, String>> text = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public ConversationTemplate $type(TypeEnum $type) {
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

	public ConversationTemplate id(String id) {
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

	public ConversationTemplate creationTimestamp(Long creationTimestamp) {
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

	public ConversationTemplate modificationTimestamp(Long modificationTimestamp) {
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

	public ConversationTemplate version(Long version) {
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

	public ConversationTemplate accountId(String accountId) {
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

	public ConversationTemplate name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the conversation template. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the conversation template. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConversationTemplate description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the conversation template. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the conversation template. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ConversationTemplate defaultTemplate(Boolean defaultTemplate) {
		this.defaultTemplate = defaultTemplate;
		return this;
	}

	/**
	 * If true, this will be the default template for the initial engagement Type
	 * 
	 * @return defaultTemplate
	 **/
	@ApiModelProperty(value = "If true, this will be the default template for the initial engagement Type")
	public Boolean isDefaultTemplate() {
		return defaultTemplate;
	}

	public void setDefaultTemplate(Boolean defaultTemplate) {
		this.defaultTemplate = defaultTemplate;
	}

	public ConversationTemplate conversationVisibility(EConversationVisibility conversationVisibility) {
		this.conversationVisibility = conversationVisibility;
		return this;
	}

	/**
	 * Get conversationVisibility
	 * 
	 * @return conversationVisibility
	 **/
	@ApiModelProperty(value = "")
	public EConversationVisibility getConversationVisibility() {
		return conversationVisibility;
	}

	public void setConversationVisibility(EConversationVisibility conversationVisibility) {
		this.conversationVisibility = conversationVisibility;
	}

	public ConversationTemplate initialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
		return this;
	}

	/**
	 * Get initialEngagementType
	 * 
	 * @return initialEngagementType
	 **/
	@ApiModelProperty(value = "")
	public EInitialEngagementType getInitialEngagementType() {
		return initialEngagementType;
	}

	public void setInitialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
	}

	public ConversationTemplate translations(Map<String, ConversationTemplateTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public ConversationTemplate putTranslationsItem(String key, ConversationTemplateTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the name and description of this entity
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the name and description of this entity")
	public Map<String, ConversationTemplateTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, ConversationTemplateTranslation> translations) {
		this.translations = translations;
	}

	public ConversationTemplate inheritConfigurationAndTexts(Boolean inheritConfigurationAndTexts) {
		this.inheritConfigurationAndTexts = inheritConfigurationAndTexts;
		return this;
	}

	/**
	 * True if conversations, created from this template, inherit all configuration and texts. If omitted, the property is set to false. New conversations receive a
	 * copy of this conversation template&#39;s configuration and texts.
	 * 
	 * @return inheritConfigurationAndTexts
	 **/
	@ApiModelProperty(value = "True if conversations, created from this template, inherit all configuration and texts. If omitted, the property is set to false. New conversations receive a copy of this conversation template's configuration and texts.")
	public Boolean isInheritConfigurationAndTexts() {
		return inheritConfigurationAndTexts;
	}

	public void setInheritConfigurationAndTexts(Boolean inheritConfigurationAndTexts) {
		this.inheritConfigurationAndTexts = inheritConfigurationAndTexts;
	}

	public ConversationTemplate _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public ConversationTemplate putConfigurationItem(String key, String _configurationItem) {
		if (this._configuration == null) {
			this._configuration = new HashMap<>();
		}
		this._configuration.put(key, _configurationItem);
		return this;
	}

	/**
	 * The entity&#39;s configuration properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;configuration&#39;. Not
	 * filled in webhook events.
	 * 
	 * @return _configuration
	 **/
	@ApiModelProperty(value = "The entity's configuration properties. Only contains values when the 'expand' query parameter is used with the value 'configuration'. Not filled in webhook events.")
	public Map<String, String> getConfiguration() {
		return _configuration;
	}

	public void setConfiguration(Map<String, String> _configuration) {
		this._configuration = _configuration;
	}

	public ConversationTemplate text(Map<String, Map<String, String>> text) {
		this.text = text;
		return this;
	}

	public ConversationTemplate putTextItem(String key, Map<String, String> textItem) {
		if (this.text == null) {
			this.text = new HashMap<>();
		}
		this.text.put(key, textItem);
		return this;
	}

	/**
	 * The entity&#39;s text properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;text&#39;. Not filled in webhook
	 * events.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "The entity's text properties. Only contains values when the 'expand' query parameter is used with the value 'text'. Not filled in webhook events.")
	public Map<String, Map<String, String>> getText() {
		return text;
	}

	public void setText(Map<String, Map<String, String>> text) {
		this.text = text;
	}

	public ConversationTemplate metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public ConversationTemplate putMetadataItem(String key, String metadataItem) {
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
		ConversationTemplate conversationTemplate = (ConversationTemplate) o;
		return Objects.equals(this.$type, conversationTemplate.$type) &&
				Objects.equals(this.id, conversationTemplate.id) &&
				Objects.equals(this.creationTimestamp, conversationTemplate.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, conversationTemplate.modificationTimestamp) &&
				Objects.equals(this.version, conversationTemplate.version) &&
				Objects.equals(this.accountId, conversationTemplate.accountId) &&
				Objects.equals(this.name, conversationTemplate.name) &&
				Objects.equals(this.description, conversationTemplate.description) &&
				Objects.equals(this.defaultTemplate, conversationTemplate.defaultTemplate) &&
				Objects.equals(this.conversationVisibility, conversationTemplate.conversationVisibility) &&
				Objects.equals(this.initialEngagementType, conversationTemplate.initialEngagementType) &&
				Objects.equals(this.translations, conversationTemplate.translations) &&
				Objects.equals(this.inheritConfigurationAndTexts, conversationTemplate.inheritConfigurationAndTexts) &&
				Objects.equals(this._configuration, conversationTemplate._configuration) &&
				Objects.equals(this.text, conversationTemplate.text) &&
				Objects.equals(this.metadata, conversationTemplate.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, defaultTemplate, conversationVisibility, initialEngagementType, translations, inheritConfigurationAndTexts, _configuration, text, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationTemplate {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    defaultTemplate: ").append(toIndentedString(defaultTemplate)).append("\n");
		sb.append("    conversationVisibility: ").append(toIndentedString(conversationVisibility)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
		sb.append("    inheritConfigurationAndTexts: ").append(toIndentedString(inheritConfigurationAndTexts)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
