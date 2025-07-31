
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
 * Represents the translation of the original text into the conversation&#39;s language &#x60;PostMessageData&#x60;
 */
@ApiModel(description = "Represents the translation of the original text into the conversation's language `PostMessageData`")

@JsonPropertyOrder({
	TextMessageTranslation.JSON_PROPERTY_$_TYPE,
	TextMessageTranslation.JSON_PROPERTY_TRANSLATED_TEXT,
	TextMessageTranslation.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextMessageTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTMESSAGETRANSLATION("TextMessageTranslation");

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
			return TypeEnum.TEXTMESSAGETRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTMESSAGETRANSLATION;

	public static final String JSON_PROPERTY_TRANSLATED_TEXT = "translatedText";
	@JsonProperty(JSON_PROPERTY_TRANSLATED_TEXT)
	private String translatedText;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public TextMessageTranslation $type(TypeEnum $type) {
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

	public TextMessageTranslation translatedText(String translatedText) {
		this.translatedText = translatedText;
		return this;
	}

	/**
	 * Translation of the original text
	 * 
	 * @return translatedText
	 **/
	@ApiModelProperty(value = "Translation of the original text")
	public String getTranslatedText() {
		return translatedText;
	}

	public void setTranslatedText(String translatedText) {
		this.translatedText = translatedText;
	}

	public TextMessageTranslation locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Language into which the original text is translated, specified using the BCP 47 language tag format.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Language into which the original text is translated, specified using the BCP 47 language tag format.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TextMessageTranslation textMessageTranslation = (TextMessageTranslation) o;
		return Objects.equals(this.$type, textMessageTranslation.$type) &&
				Objects.equals(this.translatedText, textMessageTranslation.translatedText) &&
				Objects.equals(this.locale, textMessageTranslation.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, translatedText, locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextMessageTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    translatedText: ").append(toIndentedString(translatedText)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
