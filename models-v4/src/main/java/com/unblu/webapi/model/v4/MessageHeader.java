
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
 * Header of a message which may contain an image, title and body. &lt;p&gt; All of these parts are optional as long as it contains at least one of them.
 */
@ApiModel(description = "Header of a message which may contain an image, title and body. <p> All of these parts are optional as long as it contains at least one of them.")

@JsonPropertyOrder({
	MessageHeader.JSON_PROPERTY_$_TYPE,
	MessageHeader.JSON_PROPERTY_IMAGE_URL,
	MessageHeader.JSON_PROPERTY_IMAGE_ALT_TEXT,
	MessageHeader.JSON_PROPERTY_TITLE,
	MessageHeader.JSON_PROPERTY_BODY,
	MessageHeader.JSON_PROPERTY_BODY_TEXT_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageHeader {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEHEADER("MessageHeader");

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
			return TypeEnum.MESSAGEHEADER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEHEADER;

	public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
	@JsonProperty(JSON_PROPERTY_IMAGE_URL)
	private String imageUrl;

	public static final String JSON_PROPERTY_IMAGE_ALT_TEXT = "imageAltText";
	@JsonProperty(JSON_PROPERTY_IMAGE_ALT_TEXT)
	private String imageAltText;

	public static final String JSON_PROPERTY_TITLE = "title";
	@JsonProperty(JSON_PROPERTY_TITLE)
	private String title;

	public static final String JSON_PROPERTY_BODY = "body";
	@JsonProperty(JSON_PROPERTY_BODY)
	private String body;

	public static final String JSON_PROPERTY_BODY_TEXT_TYPE = "bodyTextType";
	@JsonProperty(JSON_PROPERTY_BODY_TEXT_TYPE)
	private EConversationMessageTextType bodyTextType;

	public MessageHeader $type(TypeEnum $type) {
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

	public MessageHeader imageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	/**
	 * URL of the image displayed at the top of the card.
	 * 
	 * @return imageUrl
	 **/
	@ApiModelProperty(value = "URL of the image displayed at the top of the card.")
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public MessageHeader imageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
		return this;
	}

	/**
	 * Alt text for the image.
	 * 
	 * @return imageAltText
	 **/
	@ApiModelProperty(value = "Alt text for the image.")
	public String getImageAltText() {
		return imageAltText;
	}

	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}

	public MessageHeader title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Title displayed bold below the image. &lt;p&gt; Max length is 64 characters.
	 * 
	 * @return title
	 **/
	@ApiModelProperty(value = "Title displayed bold below the image. <p> Max length is 64 characters.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MessageHeader body(String body) {
		this.body = body;
		return this;
	}

	/**
	 * Body text which may optionally contain markdown. &lt;p&gt; Max length is 256 characters.
	 * 
	 * @return body
	 **/
	@ApiModelProperty(value = "Body text which may optionally contain markdown. <p> Max length is 256 characters.")
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public MessageHeader bodyTextType(EConversationMessageTextType bodyTextType) {
		this.bodyTextType = bodyTextType;
		return this;
	}

	/**
	 * Get bodyTextType
	 * 
	 * @return bodyTextType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageTextType getBodyTextType() {
		return bodyTextType;
	}

	public void setBodyTextType(EConversationMessageTextType bodyTextType) {
		this.bodyTextType = bodyTextType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageHeader messageHeader = (MessageHeader) o;
		return Objects.equals(this.$type, messageHeader.$type) &&
				Objects.equals(this.imageUrl, messageHeader.imageUrl) &&
				Objects.equals(this.imageAltText, messageHeader.imageAltText) &&
				Objects.equals(this.title, messageHeader.title) &&
				Objects.equals(this.body, messageHeader.body) &&
				Objects.equals(this.bodyTextType, messageHeader.bodyTextType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, imageUrl, imageAltText, title, body, bodyTextType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageHeader {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
		sb.append("    imageAltText: ").append(toIndentedString(imageAltText)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    bodyTextType: ").append(toIndentedString(bodyTextType)).append("\n");
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
