
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
 * Body for creating an abbreviation entry
 */
@ApiModel(description = "Body for creating an abbreviation entry")

@JsonPropertyOrder({
	AbbreviationEntryCreateBody.JSON_PROPERTY_$_TYPE,
	AbbreviationEntryCreateBody.JSON_PROPERTY_OWNER_TYPE,
	AbbreviationEntryCreateBody.JSON_PROPERTY_OWNER_ID,
	AbbreviationEntryCreateBody.JSON_PROPERTY_ABBREVIATION,
	AbbreviationEntryCreateBody.JSON_PROPERTY_EXPANSION,
	AbbreviationEntryCreateBody.JSON_PROPERTY_LANGUAGE,
	AbbreviationEntryCreateBody.JSON_PROPERTY_CASE_SENSITIVE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AbbreviationEntryCreateBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ABBREVIATIONENTRYCREATEBODY("AbbreviationEntryCreateBody");

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
			return TypeEnum.ABBREVIATIONENTRYCREATEBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ABBREVIATIONENTRYCREATEBODY;

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

	public AbbreviationEntryCreateBody $type(TypeEnum $type) {
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

	public AbbreviationEntryCreateBody ownerType(EAbbreviationEntryOwnerType ownerType) {
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

	public AbbreviationEntryCreateBody ownerId(String ownerId) {
		this.ownerId = ownerId;
		return this;
	}

	/**
	 * ID of the owner of the abbreviation entry. Optional. If omitted, an entry with owner type &lt;code&gt;ACCOUNT&lt;/code&gt; is owned by the current account,
	 * and an entry with owner type &lt;code&gt;USER&lt;/code&gt; is owned by the current user. Only a user with the supervisor role can create an entry owned by
	 * another user.
	 * 
	 * @return ownerId
	 **/
	@ApiModelProperty(value = "ID of the owner of the abbreviation entry. Optional. If omitted, an entry with owner type <code>ACCOUNT</code> is owned by the current account, and an entry with owner type <code>USER</code> is owned by the current user. Only a user with the supervisor role can create an entry owned by another user.")
	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public AbbreviationEntryCreateBody abbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
		return this;
	}

	/**
	 * The abbreviation that gets expanded. ASCII letters and digits only, no whitespace or punctuation. Maximum of 100 characters. Must be unique for the
	 * entry&#39;s owner, language, and case sensitivity.
	 * 
	 * @return abbreviation
	 **/
	@ApiModelProperty(value = "The abbreviation that gets expanded. ASCII letters and digits only, no whitespace or punctuation. Maximum of 100 characters. Must be unique for the entry's owner, language, and case sensitivity.")
	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public AbbreviationEntryCreateBody expansion(String expansion) {
		this.expansion = expansion;
		return this;
	}

	/**
	 * The expansion the abbreviation is replaced with. May contain multiple words. Must differ from the abbreviation. Maximum of 1000 characters.
	 * 
	 * @return expansion
	 **/
	@ApiModelProperty(value = "The expansion the abbreviation is replaced with. May contain multiple words. Must differ from the abbreviation. Maximum of 1000 characters.")
	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}

	public AbbreviationEntryCreateBody language(String language) {
		this.language = language;
		return this;
	}

	/**
	 * Language tag the abbreviation entry applies to, for example &lt;code&gt;en&lt;/code&gt; or &lt;code&gt;zh-Hans&lt;/code&gt;. Must be one of the account&#39;s
	 * supported languages. Optional. If omitted, the entry applies to all languages.
	 * 
	 * @return language
	 **/
	@ApiModelProperty(value = "Language tag the abbreviation entry applies to, for example <code>en</code> or <code>zh-Hans</code>. Must be one of the account's supported languages. Optional. If omitted, the entry applies to all languages.")
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public AbbreviationEntryCreateBody caseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
		return this;
	}

	/**
	 * Whether the abbreviation matches case-sensitively. Optional, &lt;code&gt;false&lt;/code&gt; if not provided. If &lt;code&gt;false&lt;/code&gt;, the
	 * abbreviation matches regardless of casing.
	 * 
	 * @return caseSensitive
	 **/
	@ApiModelProperty(value = "Whether the abbreviation matches case-sensitively. Optional, <code>false</code> if not provided. If <code>false</code>, the abbreviation matches regardless of casing.")
	public Boolean isCaseSensitive() {
		return caseSensitive;
	}

	public void setCaseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbbreviationEntryCreateBody abbreviationEntryCreateBody = (AbbreviationEntryCreateBody) o;
		return Objects.equals(this.$type, abbreviationEntryCreateBody.$type) &&
				Objects.equals(this.ownerType, abbreviationEntryCreateBody.ownerType) &&
				Objects.equals(this.ownerId, abbreviationEntryCreateBody.ownerId) &&
				Objects.equals(this.abbreviation, abbreviationEntryCreateBody.abbreviation) &&
				Objects.equals(this.expansion, abbreviationEntryCreateBody.expansion) &&
				Objects.equals(this.language, abbreviationEntryCreateBody.language) &&
				Objects.equals(this.caseSensitive, abbreviationEntryCreateBody.caseSensitive);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, ownerType, ownerId, abbreviation, expansion, language, caseSensitive);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbbreviationEntryCreateBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
		sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
		sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
		sb.append("    expansion: ").append(toIndentedString(expansion)).append("\n");
		sb.append("    language: ").append(toIndentedString(language)).append("\n");
		sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
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
