
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
 * The translation of an Adaptive Card message&#39;s human-readable texts into one language.
 */
@ApiModel(description = "The translation of an Adaptive Card message's human-readable texts into one language.")

@JsonPropertyOrder({
	AdaptiveCardMessageTranslation.JSON_PROPERTY_$_TYPE,
	AdaptiveCardMessageTranslation.JSON_PROPERTY_LOCALE,
	AdaptiveCardMessageTranslation.JSON_PROPERTY_TRANSLATED_TEXTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AdaptiveCardMessageTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ADAPTIVECARDMESSAGETRANSLATION("AdaptiveCardMessageTranslation");

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
			return TypeEnum.ADAPTIVECARDMESSAGETRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ADAPTIVECARDMESSAGETRANSLATION;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_TRANSLATED_TEXTS = "translatedTexts";
	@JsonProperty(JSON_PROPERTY_TRANSLATED_TEXTS)
	private Map<String, String> translatedTexts = null;

	public AdaptiveCardMessageTranslation $type(TypeEnum $type) {
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

	public AdaptiveCardMessageTranslation locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * The target language specified in the BCP 47 language tag format.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "The target language specified in the BCP 47 language tag format.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public AdaptiveCardMessageTranslation translatedTexts(Map<String, String> translatedTexts) {
		this.translatedTexts = translatedTexts;
		return this;
	}

	public AdaptiveCardMessageTranslation putTranslatedTextsItem(String key, String translatedTextsItem) {
		if (this.translatedTexts == null) {
			this.translatedTexts = new HashMap<>();
		}
		this.translatedTexts.put(key, translatedTextsItem);
		return this;
	}

	/**
	 * The translated texts, keyed by the JSON pointer (RFC 6901) of the text they replace in the card, for example &#x60;/body/0/text&#x60; for the text of the
	 * first body element. Applying every entry to the card yields the translated card. Only human-readable texts are translated, never identifiers, input values,
	 * URLs, action data, or the fallback text.
	 * 
	 * @return translatedTexts
	 **/
	@ApiModelProperty(value = "The translated texts, keyed by the JSON pointer (RFC 6901) of the text they replace in the card, for example `/body/0/text` for the text of the first body element. Applying every entry to the card yields the translated card. Only human-readable texts are translated, never identifiers, input values, URLs, action data, or the fallback text.")
	public Map<String, String> getTranslatedTexts() {
		return translatedTexts;
	}

	public void setTranslatedTexts(Map<String, String> translatedTexts) {
		this.translatedTexts = translatedTexts;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdaptiveCardMessageTranslation adaptiveCardMessageTranslation = (AdaptiveCardMessageTranslation) o;
		return Objects.equals(this.$type, adaptiveCardMessageTranslation.$type) &&
				Objects.equals(this.locale, adaptiveCardMessageTranslation.locale) &&
				Objects.equals(this.translatedTexts, adaptiveCardMessageTranslation.translatedTexts);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, locale, translatedTexts);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdaptiveCardMessageTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    translatedTexts: ").append(toIndentedString(translatedTexts)).append("\n");
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
