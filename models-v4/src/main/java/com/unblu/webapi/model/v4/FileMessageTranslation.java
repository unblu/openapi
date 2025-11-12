
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
 * The translation of a file message&#39;s contents. &lt;br&gt; The actual file is not translated.
 */
@ApiModel(description = "The translation of a file message's contents. <br> The actual file is not translated.")

@JsonPropertyOrder({
	FileMessageTranslation.JSON_PROPERTY_$_TYPE,
	FileMessageTranslation.JSON_PROPERTY_CAPTION,
	FileMessageTranslation.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FileMessageTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		FILEMESSAGETRANSLATION("FileMessageTranslation");

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
			return TypeEnum.FILEMESSAGETRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.FILEMESSAGETRANSLATION;

	public static final String JSON_PROPERTY_CAPTION = "caption";
	@JsonProperty(JSON_PROPERTY_CAPTION)
	private String caption;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public FileMessageTranslation $type(TypeEnum $type) {
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

	public FileMessageTranslation caption(String caption) {
		this.caption = caption;
		return this;
	}

	/**
	 * The translated caption of the file message.
	 * 
	 * @return caption
	 **/
	@ApiModelProperty(value = "The translated caption of the file message.")
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public FileMessageTranslation locale(String locale) {
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
		FileMessageTranslation fileMessageTranslation = (FileMessageTranslation) o;
		return Objects.equals(this.$type, fileMessageTranslation.$type) &&
				Objects.equals(this.caption, fileMessageTranslation.caption) &&
				Objects.equals(this.locale, fileMessageTranslation.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, caption, locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileMessageTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
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
