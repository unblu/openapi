
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
 * An abbreviation entry. Abbreviation entries map a short abbreviation to a longer expansion. Autocorrect replaces the abbreviation with its expansion as an
 * agent types.
 */
@ApiModel(description = "An abbreviation entry. Abbreviation entries map a short abbreviation to a longer expansion. Autocorrect replaces the abbreviation with its expansion as an agent types.")

@JsonPropertyOrder({
	AbbreviationEntryData.JSON_PROPERTY_$_TYPE,
	AbbreviationEntryData.JSON_PROPERTY_ID,
	AbbreviationEntryData.JSON_PROPERTY_ACCOUNT_ID,
	AbbreviationEntryData.JSON_PROPERTY_OWNER_TYPE,
	AbbreviationEntryData.JSON_PROPERTY_OWNER_ID,
	AbbreviationEntryData.JSON_PROPERTY_ABBREVIATION,
	AbbreviationEntryData.JSON_PROPERTY_EXPANSION,
	AbbreviationEntryData.JSON_PROPERTY_LANGUAGE,
	AbbreviationEntryData.JSON_PROPERTY_CASE_SENSITIVE,
	AbbreviationEntryData.JSON_PROPERTY_CREATION_TIMESTAMP,
	AbbreviationEntryData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AbbreviationEntryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ABBREVIATIONENTRYDATA("AbbreviationEntryData");

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
			return TypeEnum.ABBREVIATIONENTRYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ABBREVIATIONENTRYDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_OWNER_TYPE = "ownerType";
	@JsonProperty(JSON_PROPERTY_OWNER_TYPE)
	private EAbbreviationEntryOwnerType ownerType;

	public static final String JSON_PROPERTY_OWNER_ID = "ownerId";
	@JsonProperty(JSON_PROPERTY_OWNER_ID)
	private String ownerId;

	public static final String JSON_PROPERTY_ABBREVIATION = "abbreviation";
	@JsonProperty(JSON_PROPERTY_ABBREVIATION)
	private String abbreviation;

	public static final String JSON_PROPERTY_EXPANSION = "expansion";
	@JsonProperty(JSON_PROPERTY_EXPANSION)
	private String expansion;

	public static final String JSON_PROPERTY_LANGUAGE = "language";
	@JsonProperty(JSON_PROPERTY_LANGUAGE)
	private String language;

	public static final String JSON_PROPERTY_CASE_SENSITIVE = "caseSensitive";
	@JsonProperty(JSON_PROPERTY_CASE_SENSITIVE)
	private Boolean caseSensitive;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public AbbreviationEntryData $type(TypeEnum $type) {
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

	public AbbreviationEntryData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the abbreviation entry
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the abbreviation entry")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AbbreviationEntryData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the abbreviation entry belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the abbreviation entry belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AbbreviationEntryData ownerType(EAbbreviationEntryOwnerType ownerType) {
		this.ownerType = ownerType;
		return this;
	}

	/**
	 * Get ownerType
	 * 
	 * @return ownerType
	 **/
	@ApiModelProperty(value = "")
	public EAbbreviationEntryOwnerType getOwnerType() {
		return ownerType;
	}

	public void setOwnerType(EAbbreviationEntryOwnerType ownerType) {
		this.ownerType = ownerType;
	}

	public AbbreviationEntryData ownerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * ID of the owner of the abbreviation entry. The account ID for owner type &lt;code&gt;ACCOUNT&lt;/code&gt;, the user ID for owner type
	 * &lt;code&gt;USER&lt;/code&gt;.
	 * 
	 * @return ownerId
	 **/
	@ApiModelProperty(value = "ID of the owner of the abbreviation entry. The account ID for owner type <code>ACCOUNT</code>, the user ID for owner type <code>USER</code>.")
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public AbbreviationEntryData abbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
		return this;
	}

	/**
	 * The abbreviation that gets expanded. ASCII letters and digits only, no whitespace or punctuation. Maximum of 100 characters.
	 * 
	 * @return abbreviation
	 **/
	@ApiModelProperty(value = "The abbreviation that gets expanded. ASCII letters and digits only, no whitespace or punctuation. Maximum of 100 characters.")
	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public AbbreviationEntryData expansion(String expansion) {
		this.expansion = expansion;
		return this;
	}

	/**
	 * The expansion the abbreviation is replaced with. May contain multiple words. Maximum of 1000 characters.
	 * 
	 * @return expansion
	 **/
	@ApiModelProperty(value = "The expansion the abbreviation is replaced with. May contain multiple words. Maximum of 1000 characters.")
	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}

	public AbbreviationEntryData language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * Language tag the abbreviation entry applies to, for example &lt;code&gt;en&lt;/code&gt; or &lt;code&gt;zh-Hans&lt;/code&gt;. One of the account&#39;s
	 * supported languages. Absent if the entry applies to all languages.
	 * 
	 * @return language
	 **/
	@ApiModelProperty(value = "Language tag the abbreviation entry applies to, for example <code>en</code> or <code>zh-Hans</code>. One of the account's supported languages. Absent if the entry applies to all languages.")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public AbbreviationEntryData caseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
		return this;
	}

	/**
	 * Whether the abbreviation matches case-sensitively. If &lt;code&gt;false&lt;/code&gt;, the abbreviation matches regardless of casing.
	 * 
	 * @return caseSensitive
	 **/
	@ApiModelProperty(value = "Whether the abbreviation matches case-sensitively. If <code>false</code>, the abbreviation matches regardless of casing.")
	public Boolean isCaseSensitive() {
		return caseSensitive;
	}

	public void setCaseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}

	public AbbreviationEntryData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the entity was created. It is defined when the entity is stored the first time in the system.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the entity was created. It is defined when the entity is stored the first time in the system.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public AbbreviationEntryData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the entity was last modified
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the entity was last modified")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbbreviationEntryData abbreviationEntryData = (AbbreviationEntryData) o;
		return Objects.equals(this.$type, abbreviationEntryData.$type) &&
				Objects.equals(this.id, abbreviationEntryData.id) &&
				Objects.equals(this.accountId, abbreviationEntryData.accountId) &&
				Objects.equals(this.ownerType, abbreviationEntryData.ownerType) &&
				Objects.equals(this.ownerId, abbreviationEntryData.ownerId) &&
				Objects.equals(this.abbreviation, abbreviationEntryData.abbreviation) &&
				Objects.equals(this.expansion, abbreviationEntryData.expansion) &&
				Objects.equals(this.language, abbreviationEntryData.language) &&
				Objects.equals(this.caseSensitive, abbreviationEntryData.caseSensitive) &&
				Objects.equals(this.creationTimestamp, abbreviationEntryData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, abbreviationEntryData.modificationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, ownerType, ownerId, abbreviation, expansion, language, caseSensitive, creationTimestamp, modificationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbbreviationEntryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
		sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
		sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
		sb.append("    expansion: ").append(toIndentedString(expansion)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
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
