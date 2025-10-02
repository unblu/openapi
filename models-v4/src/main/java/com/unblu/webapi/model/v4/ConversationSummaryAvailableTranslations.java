
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

import io.swagger.annotations.ApiModelProperty;

/**
 * ConversationSummaryAvailableTranslations
 */

@JsonPropertyOrder({
	ConversationSummaryAvailableTranslations.JSON_PROPERTY_$_TYPE,
	ConversationSummaryAvailableTranslations.JSON_PROPERTY_CONVERSATION_SUMMARY_ID,
	ConversationSummaryAvailableTranslations.JSON_PROPERTY_LANGUAGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationSummaryAvailableTranslations {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSUMMARYAVAILABLETRANSLATIONS("ConversationSummaryAvailableTranslations");

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
			return TypeEnum.CONVERSATIONSUMMARYAVAILABLETRANSLATIONS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSUMMARYAVAILABLETRANSLATIONS;

	public static final String JSON_PROPERTY_CONVERSATION_SUMMARY_ID = "conversationSummaryId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_SUMMARY_ID)
	private String conversationSummaryId;

	public static final String JSON_PROPERTY_LANGUAGES = "languages";
	@JsonProperty(JSON_PROPERTY_LANGUAGES)
	private List<String> languages = null;

	public ConversationSummaryAvailableTranslations $type(TypeEnum $type) {
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

	public ConversationSummaryAvailableTranslations conversationSummaryId(String conversationSummaryId) {
		this.conversationSummaryId = conversationSummaryId;
		return this;
	}

	/**
	 * Get conversationSummaryId
	 * 
	 * @return conversationSummaryId
	 **/
	@ApiModelProperty(value = "")
	public String getConversationSummaryId() {
		return conversationSummaryId;
	}

	public void setConversationSummaryId(String conversationSummaryId) {
		this.conversationSummaryId = conversationSummaryId;
	}

	public ConversationSummaryAvailableTranslations languages(List<String> languages) {
		this.languages = languages;
		return this;
	}

	public ConversationSummaryAvailableTranslations addLanguagesItem(String languagesItem) {
		if (this.languages == null) {
			this.languages = new ArrayList<>();
		}
		this.languages.add(languagesItem);
		return this;
	}

	/**
	 * Get languages
	 * 
	 * @return languages
	 **/
	@ApiModelProperty(value = "")
	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationSummaryAvailableTranslations conversationSummaryAvailableTranslations = (ConversationSummaryAvailableTranslations) o;
		return Objects.equals(this.$type, conversationSummaryAvailableTranslations.$type) &&
				Objects.equals(this.conversationSummaryId, conversationSummaryAvailableTranslations.conversationSummaryId) &&
				Objects.equals(this.languages, conversationSummaryAvailableTranslations.languages);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationSummaryId, languages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationSummaryAvailableTranslations {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationSummaryId: ").append(toIndentedString(conversationSummaryId)).append("\n");
		sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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
