
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
 * The translation of a message header&#39;s contents.
 */
@ApiModel(description = "The translation of a message header's contents.")

@JsonPropertyOrder({
	MessageHeaderTranslation.JSON_PROPERTY_$_TYPE,
	MessageHeaderTranslation.JSON_PROPERTY_TITLE,
	MessageHeaderTranslation.JSON_PROPERTY_BODY,
	MessageHeaderTranslation.JSON_PROPERTY_IMAGE_ALT_TEXT,
	MessageHeaderTranslation.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageHeaderTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEHEADERTRANSLATION("MessageHeaderTranslation");

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
			return TypeEnum.MESSAGEHEADERTRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEHEADERTRANSLATION;

	public static final String JSON_PROPERTY_TITLE = "title";
	@JsonProperty(JSON_PROPERTY_TITLE)
	private String title;

	public static final String JSON_PROPERTY_BODY = "body";
	@JsonProperty(JSON_PROPERTY_BODY)
	private String body;

	public static final String JSON_PROPERTY_IMAGE_ALT_TEXT = "imageAltText";
	@JsonProperty(JSON_PROPERTY_IMAGE_ALT_TEXT)
	private String imageAltText;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public MessageHeaderTranslation $type(TypeEnum $type) {
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

	public MessageHeaderTranslation title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * The translated title of the message header.
	 * 
	 * @return title
	 **/
	@ApiModelProperty(value = "The translated title of the message header.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MessageHeaderTranslation body(String body) {
		this.body = body;
		return this;
	}

	/**
	 * The translated body of the message header.
	 * 
	 * @return body
	 **/
	@ApiModelProperty(value = "The translated body of the message header.")
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public MessageHeaderTranslation imageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
		return this;
	}

	/**
	 * The translated image alt text of the message header.
	 * 
	 * @return imageAltText
	 **/
	@ApiModelProperty(value = "The translated image alt text of the message header.")
	public String getImageAltText() {
		return imageAltText;
	}

	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}

	public MessageHeaderTranslation locale(String locale) {
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
		MessageHeaderTranslation messageHeaderTranslation = (MessageHeaderTranslation) o;
		return Objects.equals(this.$type, messageHeaderTranslation.$type) &&
				Objects.equals(this.title, messageHeaderTranslation.title) &&
				Objects.equals(this.body, messageHeaderTranslation.body) &&
				Objects.equals(this.imageAltText, messageHeaderTranslation.imageAltText) &&
				Objects.equals(this.locale, messageHeaderTranslation.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, title, body, imageAltText, locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageHeaderTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    imageAltText: ").append(toIndentedString(imageAltText)).append("\n");
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
