
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
 * The translation of a rating question option.
 */
@ApiModel(description = "The translation of a rating question option.")

@JsonPropertyOrder({
	RatingQuestionOptionTranslation.JSON_PROPERTY_$_TYPE,
	RatingQuestionOptionTranslation.JSON_PROPERTY_LABEL,
	RatingQuestionOptionTranslation.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RatingQuestionOptionTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RATINGQUESTIONOPTIONTRANSLATION("RatingQuestionOptionTranslation");

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
			return TypeEnum.RATINGQUESTIONOPTIONTRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RATINGQUESTIONOPTIONTRANSLATION;

	public static final String JSON_PROPERTY_LABEL = "label";
	@JsonProperty(JSON_PROPERTY_LABEL)
	private String label;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public RatingQuestionOptionTranslation $type(TypeEnum $type) {
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

	public RatingQuestionOptionTranslation label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Translated label of the option.
	 * 
	 * @return label
	 **/
	@ApiModelProperty(value = "Translated label of the option.")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public RatingQuestionOptionTranslation locale(String locale) {
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
		RatingQuestionOptionTranslation ratingQuestionOptionTranslation = (RatingQuestionOptionTranslation) o;
		return Objects.equals(this.$type, ratingQuestionOptionTranslation.$type) &&
				Objects.equals(this.label, ratingQuestionOptionTranslation.label) &&
				Objects.equals(this.locale, ratingQuestionOptionTranslation.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, label, locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatingQuestionOptionTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
