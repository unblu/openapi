
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
 * List message item. &lt;p&gt; This model is used when creating a card item in a list message to send to a conversation.
 */
@ApiModel(description = "List message item. <p> This model is used when creating a card item in a list message to send to a conversation.")

@JsonPropertyOrder({
	PostListMessageCardItemData.JSON_PROPERTY_$_TYPE,
	PostListMessageCardItemData.JSON_PROPERTY_IMAGE_URL,
	PostListMessageCardItemData.JSON_PROPERTY_IMAGE_ALT_TEXT,
	PostListMessageCardItemData.JSON_PROPERTY_TITLE,
	PostListMessageCardItemData.JSON_PROPERTY_BODY,
	PostListMessageCardItemData.JSON_PROPERTY_BODY_TEXT_TYPE,
	PostListMessageCardItemData.JSON_PROPERTY_ACTION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PostListMessageCardItemData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		POSTLISTMESSAGECARDITEMDATA("PostListMessageCardItemData");

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
			return TypeEnum.POSTLISTMESSAGECARDITEMDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.POSTLISTMESSAGECARDITEMDATA;

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

	public static final String JSON_PROPERTY_ACTION = "action";
	@JsonProperty(JSON_PROPERTY_ACTION)
	private MessageAction action = null;

	public PostListMessageCardItemData $type(TypeEnum $type) {
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

	public PostListMessageCardItemData imageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	/**
	 * URL of the image displayed on the list item. (optional) &lt;p&gt; The alignment of the image on the item is determined by
	 * com.unblu.conversation.messaging.ui.listMessageImageAlignment.
	 * 
	 * @return imageUrl
	 **/
	@ApiModelProperty(value = "URL of the image displayed on the list item. (optional) <p> The alignment of the image on the item is determined by com.unblu.conversation.messaging.ui.listMessageImageAlignment.")
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public PostListMessageCardItemData imageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
		return this;
	}

	/**
	 * Alt text for the image. Required if imageUrl is set.
	 * 
	 * @return imageAltText
	 **/
	@ApiModelProperty(value = "Alt text for the image. Required if imageUrl is set.")
	public String getImageAltText() {
		return imageAltText;
	}

	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}

	public PostListMessageCardItemData title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Title displayed below the image. (optional) &lt;p&gt; Max length is 64 characters.
	 * 
	 * @return title
	 **/
	@ApiModelProperty(value = "Title displayed below the image. (optional) <p> Max length is 64 characters.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public PostListMessageCardItemData body(String body) {
		this.body = body;
		return this;
	}

	/**
	 * Body text. May optionally contain Markdown. (optional) &lt;p&gt; Max length is 256 characters.
	 * 
	 * @return body
	 **/
	@ApiModelProperty(value = "Body text. May optionally contain Markdown. (optional) <p> Max length is 256 characters.")
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public PostListMessageCardItemData bodyTextType(EConversationMessageTextType bodyTextType) {
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

	public PostListMessageCardItemData action(MessageAction action) {
		this.action = action;
		return this;
	}

	/**
	 * Get action
	 * 
	 * @return action
	 **/
	@ApiModelProperty(value = "")
	public MessageAction getAction() {
		return action;
	}

	public void setAction(MessageAction action) {
		this.action = action;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PostListMessageCardItemData postListMessageCardItemData = (PostListMessageCardItemData) o;
		return Objects.equals(this.$type, postListMessageCardItemData.$type) &&
				Objects.equals(this.imageUrl, postListMessageCardItemData.imageUrl) &&
				Objects.equals(this.imageAltText, postListMessageCardItemData.imageAltText) &&
				Objects.equals(this.title, postListMessageCardItemData.title) &&
				Objects.equals(this.body, postListMessageCardItemData.body) &&
				Objects.equals(this.bodyTextType, postListMessageCardItemData.bodyTextType) &&
				Objects.equals(this.action, postListMessageCardItemData.action);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, imageUrl, imageAltText, title, body, bodyTextType, action);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PostListMessageCardItemData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
		sb.append("    imageAltText: ").append(toIndentedString(imageAltText)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    bodyTextType: ").append(toIndentedString(bodyTextType)).append("\n");
		sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
