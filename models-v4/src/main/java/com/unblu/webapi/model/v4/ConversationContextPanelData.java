
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * &lt;p&gt;This type is in preview mode.&lt;/p&gt;A public model that represents a custom conversation context panel: an iframe rendered alongside a
 * conversation. The panel&#39;s URL, permissions, and applicability are configurable per account.
 */
@ApiModel(description = "<p>This type is in preview mode.</p>A public model that represents a custom conversation context panel: an iframe rendered alongside a conversation. The panel's URL, permissions, and applicability are configurable per account.")

@JsonPropertyOrder({
	ConversationContextPanelData.JSON_PROPERTY_$_TYPE,
	ConversationContextPanelData.JSON_PROPERTY_ID,
	ConversationContextPanelData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ConversationContextPanelData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ConversationContextPanelData.JSON_PROPERTY_VERSION,
	ConversationContextPanelData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationContextPanelData.JSON_PROPERTY_NAME,
	ConversationContextPanelData.JSON_PROPERTY_DESCRIPTION,
	ConversationContextPanelData.JSON_PROPERTY_ENABLED,
	ConversationContextPanelData.JSON_PROPERTY_ICON,
	ConversationContextPanelData.JSON_PROPERTY_SHOW_HEADER,
	ConversationContextPanelData.JSON_PROPERTY_KEEP_ALIVE_WHEN_CLOSED,
	ConversationContextPanelData.JSON_PROPERTY_URL,
	ConversationContextPanelData.JSON_PROPERTY_IFRAME_ALLOW_TOKENS,
	ConversationContextPanelData.JSON_PROPERTY_ALLOWED_PARTICIPATION_TYPES,
	ConversationContextPanelData.JSON_PROPERTY_ENABLED_FRONTENDS,
	ConversationContextPanelData.JSON_PROPERTY_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationContextPanelData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONCONTEXTPANELDATA("ConversationContextPanelData");

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
			return TypeEnum.CONVERSATIONCONTEXTPANELDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONCONTEXTPANELDATA;

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

	public static final String JSON_PROPERTY_ENABLED = "enabled";
	@JsonProperty(JSON_PROPERTY_ENABLED)
	private Boolean enabled;

	public static final String JSON_PROPERTY_ICON = "icon";
	@JsonProperty(JSON_PROPERTY_ICON)
	private ExpandableField<Avatar> icon = null;

	public static final String JSON_PROPERTY_SHOW_HEADER = "showHeader";
	@JsonProperty(JSON_PROPERTY_SHOW_HEADER)
	private Boolean showHeader;

	public static final String JSON_PROPERTY_KEEP_ALIVE_WHEN_CLOSED = "keepAliveWhenClosed";
	@JsonProperty(JSON_PROPERTY_KEEP_ALIVE_WHEN_CLOSED)
	private Boolean keepAliveWhenClosed;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_IFRAME_ALLOW_TOKENS = "iframeAllowTokens";
	@JsonProperty(JSON_PROPERTY_IFRAME_ALLOW_TOKENS)
	private List<EIframeAllowToken> iframeAllowTokens = null;

	public static final String JSON_PROPERTY_ALLOWED_PARTICIPATION_TYPES = "allowedParticipationTypes";
	@JsonProperty(JSON_PROPERTY_ALLOWED_PARTICIPATION_TYPES)
	private List<EConversationAgentParticipationType> allowedParticipationTypes = null;

	public static final String JSON_PROPERTY_ENABLED_FRONTENDS = "enabledFrontends";
	@JsonProperty(JSON_PROPERTY_ENABLED_FRONTENDS)
	private List<EFrontend> enabledFrontends = null;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, ConversationContextPanelTranslation> translations = null;

	public ConversationContextPanelData $type(TypeEnum $type) {
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

	public ConversationContextPanelData id(String id) {
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

	public ConversationContextPanelData creationTimestamp(Long creationTimestamp) {
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

	public ConversationContextPanelData modificationTimestamp(Long modificationTimestamp) {
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

	public ConversationContextPanelData version(Long version) {
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

	public ConversationContextPanelData accountId(String accountId) {
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

	public ConversationContextPanelData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Canonical name of the context panel. Must be unique within the account. Maximum of 250 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Canonical name of the context panel. Must be unique within the account. Maximum of 250 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ConversationContextPanelData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the context panel in the default language. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the context panel in the default language. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ConversationContextPanelData enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	/**
	 * Whether the context panel is active. If omitted, the default is false.
	 * 
	 * @return enabled
	 **/
	@ApiModelProperty(value = "Whether the context panel is active. If omitted, the default is false.")
	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public ConversationContextPanelData icon(ExpandableField<Avatar> icon) {
		this.icon = icon;
		return this;
	}

	/**
	 * The ID of the avatar used as the panel&#39;s icon. Mandatory: a panel cannot be created or updated without an icon. The ID can be expanded, but cannot be set
	 * directly; send the expanded &#x60;icon&#x60; instead.
	 * 
	 * @return icon
	 **/
	@ApiModelProperty(value = "The ID of the avatar used as the panel's icon. Mandatory: a panel cannot be created or updated without an icon. The ID can be expanded, but cannot be set directly; send the expanded `icon` instead.")
	public ExpandableField<Avatar> getIcon() {
		return icon;
	}

	public void setIcon(ExpandableField<Avatar> icon) {
		this.icon = icon;
	}

	public ConversationContextPanelData showHeader(Boolean showHeader) {
		this.showHeader = showHeader;
		return this;
	}

	/**
	 * Whether the panel renders its header. If omitted, the default is false.
	 * 
	 * @return showHeader
	 **/
	@ApiModelProperty(value = "Whether the panel renders its header. If omitted, the default is false.")
	public Boolean isShowHeader() {
		return showHeader;
	}

	public void setShowHeader(Boolean showHeader) {
		this.showHeader = showHeader;
	}

	public ConversationContextPanelData keepAliveWhenClosed(Boolean keepAliveWhenClosed) {
		this.keepAliveWhenClosed = keepAliveWhenClosed;
		return this;
	}

	/**
	 * Whether the panel&#39;s iframe is kept alive in the background while the panel is closed. If omitted, the default is false, and the panel&#39;s content is
	 * discarded each time it is closed.
	 * 
	 * @return keepAliveWhenClosed
	 **/
	@ApiModelProperty(value = "Whether the panel's iframe is kept alive in the background while the panel is closed. If omitted, the default is false, and the panel's content is discarded each time it is closed.")
	public Boolean isKeepAliveWhenClosed() {
		return keepAliveWhenClosed;
	}

	public void setKeepAliveWhenClosed(Boolean keepAliveWhenClosed) {
		this.keepAliveWhenClosed = keepAliveWhenClosed;
	}

	public ConversationContextPanelData url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The panel&#39;s iframe URL. Must be an absolute http or https URL of at most 2000 characters. Mandatory. &lt;p&gt; The URL may contain conversation variables
	 * in the form &lt;code&gt;${name}&lt;/code&gt;, which are replaced server-side before the panel is delivered to the agent, each value URL-encoded. The storage
	 * service rejects any other variable. The supported variables are &lt;code&gt;conversation.id&lt;/code&gt;, &lt;code&gt;conversation.sourceId&lt;/code&gt;,
	 * &lt;code&gt;conversation.contextPerson.id&lt;/code&gt;, &lt;code&gt;conversation.contextPerson.sourceId&lt;/code&gt;,
	 * &lt;code&gt;conversation.assignedAgent.id&lt;/code&gt; and &lt;code&gt;conversation.assignedAgent.sourceId&lt;/code&gt;. A variable whose value is unknown
	 * for the conversation — no context person, or nobody assigned — is replaced with the literal string &lt;code&gt;null&lt;/code&gt;.
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "The panel's iframe URL. Must be an absolute http or https URL of at most 2000 characters. Mandatory. <p> The URL may contain conversation variables in the form <code>${name}</code>, which are replaced server-side before the panel is delivered to the agent, each value URL-encoded. The storage service rejects any other variable. The supported variables are <code>conversation.id</code>, <code>conversation.sourceId</code>, <code>conversation.contextPerson.id</code>, <code>conversation.contextPerson.sourceId</code>, <code>conversation.assignedAgent.id</code> and <code>conversation.assignedAgent.sourceId</code>. A variable whose value is unknown for the conversation — no context person, or nobody assigned — is replaced with the literal string <code>null</code>.")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ConversationContextPanelData iframeAllowTokens(List<EIframeAllowToken> iframeAllowTokens) {
		this.iframeAllowTokens = iframeAllowTokens;
		return this;
	}

	public ConversationContextPanelData addIframeAllowTokensItem(EIframeAllowToken iframeAllowTokensItem) {
		if (this.iframeAllowTokens == null) {
			this.iframeAllowTokens = new ArrayList<>();
		}
		this.iframeAllowTokens.add(iframeAllowTokensItem);
		return this;
	}

	/**
	 * The permission tokens the panel&#39;s iframe may request via its &#x60;allow&#x60; attribute. Optional.
	 * 
	 * @return iframeAllowTokens
	 **/
	@ApiModelProperty(value = "The permission tokens the panel's iframe may request via its `allow` attribute. Optional.")
	public List<EIframeAllowToken> getIframeAllowTokens() {
		return iframeAllowTokens;
	}

	public void setIframeAllowTokens(List<EIframeAllowToken> iframeAllowTokens) {
		this.iframeAllowTokens = iframeAllowTokens;
	}

	public ConversationContextPanelData allowedParticipationTypes(List<EConversationAgentParticipationType> allowedParticipationTypes) {
		this.allowedParticipationTypes = allowedParticipationTypes;
		return this;
	}

	public ConversationContextPanelData addAllowedParticipationTypesItem(EConversationAgentParticipationType allowedParticipationTypesItem) {
		if (this.allowedParticipationTypes == null) {
			this.allowedParticipationTypes = new ArrayList<>();
		}
		this.allowedParticipationTypes.add(allowedParticipationTypesItem);
		return this;
	}

	/**
	 * The agent participation types the panel is shown for. Must name at least one: a panel that allows none is never shown. Mandatory.
	 * 
	 * @return allowedParticipationTypes
	 **/
	@ApiModelProperty(value = "The agent participation types the panel is shown for. Must name at least one: a panel that allows none is never shown. Mandatory.")
	public List<EConversationAgentParticipationType> getAllowedParticipationTypes() {
		return allowedParticipationTypes;
	}

	public void setAllowedParticipationTypes(List<EConversationAgentParticipationType> allowedParticipationTypes) {
		this.allowedParticipationTypes = allowedParticipationTypes;
	}

	public ConversationContextPanelData enabledFrontends(List<EFrontend> enabledFrontends) {
		this.enabledFrontends = enabledFrontends;
		return this;
	}

	public ConversationContextPanelData addEnabledFrontendsItem(EFrontend enabledFrontendsItem) {
		if (this.enabledFrontends == null) {
			this.enabledFrontends = new ArrayList<>();
		}
		this.enabledFrontends.add(enabledFrontendsItem);
		return this;
	}

	/**
	 * The frontends the panel is enabled on. Must name at least one of &#x60;AGENT_DESK&#x60; and &#x60;AGENT_SINGLE_CONVERSATION_DESK&#x60;. Mandatory.
	 * 
	 * @return enabledFrontends
	 **/
	@ApiModelProperty(value = "The frontends the panel is enabled on. Must name at least one of `AGENT_DESK` and `AGENT_SINGLE_CONVERSATION_DESK`. Mandatory.")
	public List<EFrontend> getEnabledFrontends() {
		return enabledFrontends;
	}

	public void setEnabledFrontends(List<EFrontend> enabledFrontends) {
		this.enabledFrontends = enabledFrontends;
	}

	public ConversationContextPanelData translations(Map<String, ConversationContextPanelTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public ConversationContextPanelData putTranslationsItem(String key, ConversationContextPanelTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the name and description of this entity. Optional.
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the name and description of this entity. Optional.")
	public Map<String, ConversationContextPanelTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, ConversationContextPanelTranslation> translations) {
		this.translations = translations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationContextPanelData conversationContextPanelData = (ConversationContextPanelData) o;
		return Objects.equals(this.$type, conversationContextPanelData.$type) &&
				Objects.equals(this.id, conversationContextPanelData.id) &&
				Objects.equals(this.creationTimestamp, conversationContextPanelData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, conversationContextPanelData.modificationTimestamp) &&
				Objects.equals(this.version, conversationContextPanelData.version) &&
				Objects.equals(this.accountId, conversationContextPanelData.accountId) &&
				Objects.equals(this.name, conversationContextPanelData.name) &&
				Objects.equals(this.description, conversationContextPanelData.description) &&
				Objects.equals(this.enabled, conversationContextPanelData.enabled) &&
				Objects.equals(this.icon, conversationContextPanelData.icon) &&
				Objects.equals(this.showHeader, conversationContextPanelData.showHeader) &&
				Objects.equals(this.keepAliveWhenClosed, conversationContextPanelData.keepAliveWhenClosed) &&
				Objects.equals(this.url, conversationContextPanelData.url) &&
				Objects.equals(this.iframeAllowTokens, conversationContextPanelData.iframeAllowTokens) &&
				Objects.equals(this.allowedParticipationTypes, conversationContextPanelData.allowedParticipationTypes) &&
				Objects.equals(this.enabledFrontends, conversationContextPanelData.enabledFrontends) &&
				Objects.equals(this.translations, conversationContextPanelData.translations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, enabled, icon, showHeader, keepAliveWhenClosed, url, iframeAllowTokens, allowedParticipationTypes, enabledFrontends, translations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationContextPanelData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
		sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
		sb.append("    showHeader: ").append(toIndentedString(showHeader)).append("\n");
		sb.append("    keepAliveWhenClosed: ").append(toIndentedString(keepAliveWhenClosed)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    iframeAllowTokens: ").append(toIndentedString(iframeAllowTokens)).append("\n");
		sb.append("    allowedParticipationTypes: ").append(toIndentedString(allowedParticipationTypes)).append("\n");
		sb.append("    enabledFrontends: ").append(toIndentedString(enabledFrontends)).append("\n");
		sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
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
