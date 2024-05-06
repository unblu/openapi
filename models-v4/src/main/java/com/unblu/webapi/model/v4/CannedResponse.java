
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
 * Model of canned response. Canned responses are predefined messages for chat responses.
 */
@ApiModel(description = "Model of canned response. Canned responses are predefined messages for chat responses.")

@JsonPropertyOrder({
	CannedResponse.JSON_PROPERTY_$_TYPE,
	CannedResponse.JSON_PROPERTY_ID,
	CannedResponse.JSON_PROPERTY_CREATION_TIMESTAMP,
	CannedResponse.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	CannedResponse.JSON_PROPERTY_VERSION,
	CannedResponse.JSON_PROPERTY_ACCOUNT_ID,
	CannedResponse.JSON_PROPERTY_OWNER_ID,
	CannedResponse.JSON_PROPERTY_OWNER_TYPE,
	CannedResponse.JSON_PROPERTY_PLACEHOLDERS,
	CannedResponse.JSON_PROPERTY_TITLE,
	CannedResponse.JSON_PROPERTY_TEXT,
	CannedResponse.JSON_PROPERTY_LANGUAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CannedResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CANNEDRESPONSE("CannedResponse");

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
			return TypeEnum.CANNEDRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CANNEDRESPONSE;

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

	public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
	@JsonProperty(JSON_PROPERTY_OWNER_ID)
	private String ownerId;

	public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
	@JsonProperty(JSON_PROPERTY_OWNER_TYPE)
	private EPropertyOwnerType ownerType;

	public static final String JSON_PROPERTY_PLACEHOLDERS = "placeholders";
	@JsonProperty(JSON_PROPERTY_PLACEHOLDERS)
	private List<Placeholder> placeholders = null;

	public static final String JSON_PROPERTY_TITLE = "title";
	@JsonProperty(JSON_PROPERTY_TITLE)
	private String title;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_LANGUAGE = "language";
	@JsonProperty(JSON_PROPERTY_LANGUAGE)
	private String language;

	public CannedResponse $type(TypeEnum $type) {
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

	public CannedResponse id(String id) {
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

	public CannedResponse creationTimestamp(Long creationTimestamp) {
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

	public CannedResponse modificationTimestamp(Long modificationTimestamp) {
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

	public CannedResponse version(Long version) {
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

	public CannedResponse accountId(String accountId) {
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

	public CannedResponse ownerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * Id of the owner of the entity. Can not be omitted.
	 * 
	 * @return ownerId
	 **/
	@ApiModelProperty(value = "Id of the owner of the entity. Can not be omitted.")
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public CannedResponse ownerType(EPropertyOwnerType ownerType) {
		this.ownerType = ownerType;
		return this;
	}

	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@ApiModelProperty(value = "")
	public EPropertyOwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(EPropertyOwnerType ownerType) {
		this.ownerType = ownerType;
	}

	public CannedResponse placeholders(List<Placeholder> placeholders) {
		this.placeholders = placeholders;
		return this;
	}

	public CannedResponse addPlaceholdersItem(Placeholder placeholdersItem) {
		if (this.placeholders == null) {
			this.placeholders = new ArrayList<>();
		}
		this.placeholders.add(placeholdersItem);
		return this;
	}

	/**
	 * Get placeholders
	 * 
	 * @return placeholders
	 **/
	@ApiModelProperty(value = "")
	public List<Placeholder> getPlaceholders() {
		return placeholders;
	}

	public void setPlaceholders(List<Placeholder> placeholders) {
		this.placeholders = placeholders;
	}

	public CannedResponse title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * The title of a canned response as unique identifier. Maximum of 250 characters.
	 * 
	 * @return title
	 **/
	@ApiModelProperty(value = "The title of a canned response as unique identifier. Maximum of 250 characters.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CannedResponse text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * The text of a canned response. Can be omitted, but should not.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "The text of a canned response. Can be omitted, but should not.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public CannedResponse language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * The language of a canned response, specified using the language tag format as defined in IETF BCP 47. This field can be omitted, but doing so may lead to
	 * behavior that doesn&#39;t matches users&#39; expectations. &lt;p&gt; Only canned responses matching a conversation&#39;s language are displayed in the
	 * UI.&lt;br&gt; The following rules apply: &lt;ul&gt; &lt;li&gt;Canned response with no language defined are displayed for all conversations.&lt;/li&gt;
	 * &lt;li&gt;If the conversation language (e.g. \&quot;en-us\&quot;) is more specific than the language of the canned response (e.g. \&quot;en\&quot;), the
	 * canned response is also displayed.&lt;/li&gt; &lt;li&gt;If the language of the canned response (e.g. \&quot;en-us\&quot;) is &lt;i&gt;more&lt;/i&gt; specific
	 * than the conversation language (e.g. \&quot;en\&quot;), the canned response &lt;b&gt;isn&#39;t&lt;/b&gt; displayed.&lt;/li&gt;
	 * 
	 * @return language
	 **/
	@ApiModelProperty(value = "The language of a canned response, specified using the language tag format as defined in IETF BCP 47. This field can be omitted, but doing so may lead to behavior that doesn't matches users' expectations. <p> Only canned responses matching a conversation's language are displayed in the UI.<br> The following rules apply: <ul> <li>Canned response with no language defined are displayed for all conversations.</li> <li>If the conversation language (e.g. \"en-us\") is more specific than the language of the canned response (e.g. \"en\"), the canned response is also displayed.</li> <li>If the language of the canned response (e.g. \"en-us\") is <i>more</i> specific than the conversation language (e.g. \"en\"), the canned response <b>isn't</b> displayed.</li>")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CannedResponse cannedResponse = (CannedResponse) o;
		return Objects.equals(this.$type, cannedResponse.$type) &&
				Objects.equals(this.id, cannedResponse.id) &&
				Objects.equals(this.creationTimestamp, cannedResponse.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, cannedResponse.modificationTimestamp) &&
				Objects.equals(this.version, cannedResponse.version) &&
				Objects.equals(this.accountId, cannedResponse.accountId) &&
				Objects.equals(this.ownerId, cannedResponse.ownerId) &&
				Objects.equals(this.ownerType, cannedResponse.ownerType) &&
				Objects.equals(this.placeholders, cannedResponse.placeholders) &&
				Objects.equals(this.title, cannedResponse.title) &&
				Objects.equals(this.text, cannedResponse.text) &&
				Objects.equals(this.language, cannedResponse.language);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, version, accountId, ownerId, ownerType, placeholders, title, text, language);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CannedResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    version: ").append(toIndentedString(version)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
		sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
		sb.append("    placeholders: ").append(toIndentedString(placeholders)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
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