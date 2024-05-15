
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
 * Model representing an internal message interceptor used to approve or reject messages in a conversation
 */
@ApiModel(description = "Model representing an internal message interceptor used to approve or reject messages in a conversation")

@JsonPropertyOrder({
	InternalMessageInterceptorData.JSON_PROPERTY_$_TYPE,
	InternalMessageInterceptorData.JSON_PROPERTY_ID,
	InternalMessageInterceptorData.JSON_PROPERTY_CREATION_TIMESTAMP,
	InternalMessageInterceptorData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	InternalMessageInterceptorData.JSON_PROPERTY_VERSION,
	InternalMessageInterceptorData.JSON_PROPERTY_ACCOUNT_ID,
	InternalMessageInterceptorData.JSON_PROPERTY_NAME,
	InternalMessageInterceptorData.JSON_PROPERTY_DESCRIPTION,
	InternalMessageInterceptorData.JSON_PROPERTY_MESSAGE_FILTER,
	InternalMessageInterceptorData.JSON_PROPERTY_TIMEOUT_BEHAVIOR,
	InternalMessageInterceptorData.JSON_PROPERTY_TYPE,
	InternalMessageInterceptorData.JSON_PROPERTY_POINT_OF_INTERCEPTION,
	InternalMessageInterceptorData.JSON_PROPERTY_LANGUAGE,
	InternalMessageInterceptorData.JSON_PROPERTY_REGEX,
	InternalMessageInterceptorData.JSON_PROPERTY_REASON,
	InternalMessageInterceptorData.JSON_PROPERTY_SEVERITY,
	InternalMessageInterceptorData.JSON_PROPERTY_STATUS,
	InternalMessageInterceptorData.JSON_PROPERTY_TRANSLATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InternalMessageInterceptorData implements MessageInterceptorData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INTERNALMESSAGEINTERCEPTORDATA("InternalMessageInterceptorData");

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
			return TypeEnum.INTERNALMESSAGEINTERCEPTORDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INTERNALMESSAGEINTERCEPTORDATA;

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
	private EMessageInterceptorType type = EMessageInterceptorType.INTERNAL;

	public static final String JSON_PROPERTY_POINT_OF_INTERCEPTION = "pointOfInterception";
	@JsonProperty(JSON_PROPERTY_POINT_OF_INTERCEPTION)
	private EMessageInterceptionPoint pointOfInterception;

	public static final String JSON_PROPERTY_LANGUAGE = "language";
	@JsonProperty(JSON_PROPERTY_LANGUAGE)
	private String language;

	public static final String JSON_PROPERTY_REGEX = "regex";
	@JsonProperty(JSON_PROPERTY_REGEX)
	private String regex;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private String reason;

	public static final String JSON_PROPERTY_SEVERITY = "severity";
	@JsonProperty(JSON_PROPERTY_SEVERITY)
	private ESentRejectionSeverity severity;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private EInternalMessageInterceptorStatus status;

	public static final String JSON_PROPERTY_TRANSLATIONS = "translations";
	@JsonProperty(JSON_PROPERTY_TRANSLATIONS)
	private Map<String, InternalMessageInterceptorTranslation> translations = null;

	public InternalMessageInterceptorData $type(TypeEnum $type) {
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

	public InternalMessageInterceptorData id(String id) {
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

	public InternalMessageInterceptorData creationTimestamp(Long creationTimestamp) {
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

	public InternalMessageInterceptorData modificationTimestamp(Long modificationTimestamp) {
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

	public InternalMessageInterceptorData version(Long version) {
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

	public InternalMessageInterceptorData accountId(String accountId) {
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

	public InternalMessageInterceptorData name(String name) {
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

	public InternalMessageInterceptorData description(String description) {
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

	public InternalMessageInterceptorData messageFilter(EMessageInterceptorMessageFilter messageFilter) {
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

	public InternalMessageInterceptorData timeoutBehavior(EMessageInterceptorTimeoutBehavior timeoutBehavior) {
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

	public InternalMessageInterceptorData type(EMessageInterceptorType type) {
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

	public InternalMessageInterceptorData pointOfInterception(EMessageInterceptionPoint pointOfInterception) {
		this.pointOfInterception = pointOfInterception;
		return this;
	}

	/**
	 * Get pointOfInterception
	 * 
	 * @return pointOfInterception
	 **/
	@ApiModelProperty(value = "")
	public EMessageInterceptionPoint getPointOfInterception() {
		return pointOfInterception;
	}

	public void setPointOfInterception(EMessageInterceptionPoint pointOfInterception) {
		this.pointOfInterception = pointOfInterception;
	}

	public InternalMessageInterceptorData language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * The IETF BCP 47 language tag of the interceptor. The interceptor only applies to conversations in the language specified. Can be omitted for interceptors
	 * that apply to all languages. The following rules apply: &lt;ul&gt; &lt;li&gt;Internal Message Interceptors with no language defined are used for all
	 * conversations where they have been configured no matter the language of the conversation.&lt;/li&gt; &lt;li&gt;If the conversation language (e.g.
	 * \&quot;en-us\&quot;) is more specific than the language of the internal message interceptor (e.g. \&quot;en\&quot;), the internal message interceptor is also
	 * used.&lt;/li&gt; &lt;li&gt;If the language of the internal message interceptor (e.g. \&quot;en-us\&quot;) is &lt;i&gt;more&lt;/i&gt; specific than the
	 * conversation language (e.g. \&quot;en\&quot;), the internal message interceptor &lt;b&gt;isn&#39;t&lt;/b&gt; used.&lt;/li&gt;
	 * 
	 * @return language
	 **/
	@ApiModelProperty(value = "The IETF BCP 47 language tag of the interceptor. The interceptor only applies to conversations in the language specified. Can be omitted for interceptors that apply to all languages. The following rules apply: <ul> <li>Internal Message Interceptors with no language defined are used for all conversations where they have been configured no matter the language of the conversation.</li> <li>If the conversation language (e.g. \"en-us\") is more specific than the language of the internal message interceptor (e.g. \"en\"), the internal message interceptor is also used.</li> <li>If the language of the internal message interceptor (e.g. \"en-us\") is <i>more</i> specific than the conversation language (e.g. \"en\"), the internal message interceptor <b>isn't</b> used.</li>")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public InternalMessageInterceptorData regex(String regex) {
		this.regex = regex;
		return this;
	}

	/**
	 * The regular expression used to identify the messages to reject
	 * 
	 * @return regex
	 **/
	@ApiModelProperty(value = "The regular expression used to identify the messages to reject")
	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public InternalMessageInterceptorData reason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * The reason displayed when a message is rejected. If a localized version of the reason exists in the language of the conversation, the translation is used.
	 * Otherwise, this value is used.
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "The reason displayed when a message is rejected. If a localized version of the reason exists in the language of the conversation, the translation is used. Otherwise, this value is used.")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public InternalMessageInterceptorData severity(ESentRejectionSeverity severity) {
		this.severity = severity;
		return this;
	}

	/**
	 * Get severity
	 * 
	 * @return severity
	 **/
	@ApiModelProperty(value = "")
	public ESentRejectionSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(ESentRejectionSeverity severity) {
		this.severity = severity;
	}

	public InternalMessageInterceptorData status(EInternalMessageInterceptorStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public EInternalMessageInterceptorStatus getStatus() {
		return status;
	}

	public void setStatus(EInternalMessageInterceptorStatus status) {
		this.status = status;
	}

	public InternalMessageInterceptorData translations(Map<String, InternalMessageInterceptorTranslation> translations) {
		this.translations = translations;
		return this;
	}

	public InternalMessageInterceptorData putTranslationsItem(String key, InternalMessageInterceptorTranslation translationsItem) {
		if (this.translations == null) {
			this.translations = new HashMap<>();
		}
		this.translations.put(key, translationsItem);
		return this;
	}

	/**
	 * A map of localized versions of the reject reason of this entity. The key is the IETF BCP 47 representation of the locale.
	 * 
	 * @return translations
	 **/
	@ApiModelProperty(value = "A map of localized versions of the reject reason of this entity. The key is the IETF BCP 47 representation of the locale.")
	public Map<String, InternalMessageInterceptorTranslation> getTranslations() {
		return translations;
	}

	public void setTranslations(Map<String, InternalMessageInterceptorTranslation> translations) {
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
		InternalMessageInterceptorData internalMessageInterceptorData = (InternalMessageInterceptorData) o;
		return Objects.equals(this.$type, internalMessageInterceptorData.$type) &&
				Objects.equals(this.id, internalMessageInterceptorData.id) &&
				Objects.equals(this.creationTimestamp, internalMessageInterceptorData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, internalMessageInterceptorData.modificationTimestamp) &&
				Objects.equals(this.version, internalMessageInterceptorData.version) &&
				Objects.equals(this.accountId, internalMessageInterceptorData.accountId) &&
				Objects.equals(this.name, internalMessageInterceptorData.name) &&
				Objects.equals(this.description, internalMessageInterceptorData.description) &&
				Objects.equals(this.messageFilter, internalMessageInterceptorData.messageFilter) &&
				Objects.equals(this.timeoutBehavior, internalMessageInterceptorData.timeoutBehavior) &&
				Objects.equals(this.type, internalMessageInterceptorData.type) &&
				Objects.equals(this.pointOfInterception, internalMessageInterceptorData.pointOfInterception) &&
				Objects.equals(this.language, internalMessageInterceptorData.language) &&
				Objects.equals(this.regex, internalMessageInterceptorData.regex) &&
				Objects.equals(this.reason, internalMessageInterceptorData.reason) &&
				Objects.equals(this.severity, internalMessageInterceptorData.severity) &&
				Objects.equals(this.status, internalMessageInterceptorData.status) &&
				Objects.equals(this.translations, internalMessageInterceptorData.translations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, name, description, messageFilter, timeoutBehavior, type, pointOfInterception, language, regex, reason, severity, status, translations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InternalMessageInterceptorData {\n");
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
		sb.append("    pointOfInterception: ").append(toIndentedString(pointOfInterception)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
