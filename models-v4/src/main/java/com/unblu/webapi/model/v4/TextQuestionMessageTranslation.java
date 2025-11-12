
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
 * The translation of a text question message&#39;s contents.
 */
@ApiModel(description = "The translation of a text question message's contents.")

@JsonPropertyOrder({
	TextQuestionMessageTranslation.JSON_PROPERTY_$_TYPE,
	TextQuestionMessageTranslation.JSON_PROPERTY_TEXT,
	TextQuestionMessageTranslation.JSON_PROPERTY_HINT,
	TextQuestionMessageTranslation.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextQuestionMessageTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTQUESTIONMESSAGETRANSLATION("TextQuestionMessageTranslation");

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
			return TypeEnum.TEXTQUESTIONMESSAGETRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTQUESTIONMESSAGETRANSLATION;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_HINT = "hint";
	@JsonProperty(JSON_PROPERTY_HINT)
	private String hint;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public TextQuestionMessageTranslation $type(TypeEnum $type) {
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

	public TextQuestionMessageTranslation text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Translation of the question text.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Translation of the question text.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextQuestionMessageTranslation hint(String hint) {
		this.hint = hint;
		return this;
	}

	/**
	 * Translation of the hint text.
	 * 
	 * @return hint
	 **/
	@ApiModelProperty(value = "Translation of the hint text.")
	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public TextQuestionMessageTranslation locale(String locale) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TextQuestionMessageTranslation textQuestionMessageTranslation = (TextQuestionMessageTranslation) o;
		return Objects.equals(this.$type, textQuestionMessageTranslation.$type) &&
				Objects.equals(this.text, textQuestionMessageTranslation.text) &&
				Objects.equals(this.hint, textQuestionMessageTranslation.hint) &&
				Objects.equals(this.locale, textQuestionMessageTranslation.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, text, hint, locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextQuestionMessageTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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
