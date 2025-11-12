
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
 * The translation of a rating question message&#39;s contents.
 */
@ApiModel(description = "The translation of a rating question message's contents.")

@JsonPropertyOrder({
	RatingQuestionMessageTranslation.JSON_PROPERTY_$_TYPE,
	RatingQuestionMessageTranslation.JSON_PROPERTY_TEXT,
	RatingQuestionMessageTranslation.JSON_PROPERTY_DECLINE_LABEL,
	RatingQuestionMessageTranslation.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RatingQuestionMessageTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RATINGQUESTIONMESSAGETRANSLATION("RatingQuestionMessageTranslation");

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
			return TypeEnum.RATINGQUESTIONMESSAGETRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RATINGQUESTIONMESSAGETRANSLATION;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_DECLINE_LABEL = "declineLabel";
	@JsonProperty(JSON_PROPERTY_DECLINE_LABEL)
	private String declineLabel;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public RatingQuestionMessageTranslation $type(TypeEnum $type) {
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

	public RatingQuestionMessageTranslation text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * The translated rating question.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "The translated rating question.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RatingQuestionMessageTranslation declineLabel(String declineLabel) {
		this.declineLabel = declineLabel;
		return this;
	}

	/**
	 * The translated label for the \&quot;decline\&quot; button. This is also be used as the text for the reply.
	 * 
	 * @return declineLabel
	 **/
	@ApiModelProperty(value = "The translated label for the \"decline\" button. This is also be used as the text for the reply.")
	public String getDeclineLabel() {
		return declineLabel;
	}

	public void setDeclineLabel(String declineLabel) {
		this.declineLabel = declineLabel;
	}

	public RatingQuestionMessageTranslation locale(String locale) {
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
		RatingQuestionMessageTranslation ratingQuestionMessageTranslation = (RatingQuestionMessageTranslation) o;
		return Objects.equals(this.$type, ratingQuestionMessageTranslation.$type) &&
				Objects.equals(this.text, ratingQuestionMessageTranslation.text) &&
				Objects.equals(this.declineLabel, ratingQuestionMessageTranslation.declineLabel) &&
				Objects.equals(this.locale, ratingQuestionMessageTranslation.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, text, declineLabel, locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatingQuestionMessageTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    declineLabel: ").append(toIndentedString(declineLabel)).append("\n");
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
