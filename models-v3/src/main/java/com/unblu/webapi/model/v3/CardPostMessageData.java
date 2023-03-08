
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
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
 * Card message which may contain an image, title, body and actions. All of these parts are optional as long as it contains at least one of them. &lt;p&gt; This
 * model is used when creating a card message to send to a conversation.
 */
@ApiModel(description = "Card message which may contain an image, title, body and actions. All of these parts are optional as long as it contains at least one of them. <p> This model is used when creating a card message to send to a conversation.")

@JsonPropertyOrder({
	CardPostMessageData.JSON_PROPERTY_$_TYPE,
	CardPostMessageData.JSON_PROPERTY_TYPE,
	CardPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	CardPostMessageData.JSON_PROPERTY_IMAGE_URL,
	CardPostMessageData.JSON_PROPERTY_IMAGE_ALT_TEXT,
	CardPostMessageData.JSON_PROPERTY_TITLE,
	CardPostMessageData.JSON_PROPERTY_BODY,
	CardPostMessageData.JSON_PROPERTY_BODY_TEXT_TYPE,
	CardPostMessageData.JSON_PROPERTY_ACTIONS,
	CardPostMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CardPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CARDPOSTMESSAGEDATA("CardPostMessageData");

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
			return TypeEnum.CARDPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CARDPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.CARD;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

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

	public static final String JSON_PROPERTY_ACTIONS = "actions";
	@JsonProperty(JSON_PROPERTY_ACTIONS)
	private List<MessageAction> actions = null;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public CardPostMessageData $type(TypeEnum $type) {
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

	public CardPostMessageData type(EPostMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPostMessageType getType() {
		return type;
	}

	public void setType(EPostMessageType type) {
		this.type = type;
	}

	public CardPostMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text which is used when: &lt;ul&gt; &lt;li&gt;unblu cannot restore the complex content of the message anymore&lt;/li&gt; &lt;li&gt;in push
	 * notifications&lt;/li&gt; &lt;li&gt;or for the last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The usage of this field is recommended
	 * especially for complex message types.&lt;br&gt; The value must not contain markdown.&lt;br&gt; If no fallback is given, a fallback text based on the content
	 * of the message is generated. This may however not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text which is used when: <ul> <li>unblu cannot restore the complex content of the message anymore</li> <li>in push notifications</li> <li>or for the last message in the conversation overview</li> </ul> The usage of this field is recommended especially for complex message types.<br> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the content of the message is generated. This may however not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public CardPostMessageData imageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	/**
	 * URL of the image displayed at the top of the card. (optional) &lt;p&gt; &lt;ul&gt; &lt;li&gt;The image is always displayed with an aspect ratio of
	 * 16:9&lt;/li&gt; &lt;li&gt;If the image doesn&#39;t fit the aspect ratio it&#39;s magnified to cover the whole area&lt;/li&gt; &lt;li&gt;Depending on the chat
	 * windows size, the image is displayed with a width of 200-400px.&lt;/li&gt; &lt;/ul&gt;
	 * 
	 * @return imageUrl
	 **/
	@ApiModelProperty(value = "URL of the image displayed at the top of the card. (optional) <p> <ul> <li>The image is always displayed with an aspect ratio of 16:9</li> <li>If the image doesn't fit the aspect ratio it's magnified to cover the whole area</li> <li>Depending on the chat windows size, the image is displayed with a width of 200-400px.</li> </ul>")
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public CardPostMessageData imageAltText(String imageAltText) {
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

	public CardPostMessageData title(String title) {
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

	public CardPostMessageData body(String body) {
		this.body = body;
		return this;
	}

	/**
	 * Body text. May optionally contain Markdown. (optional) &lt;p&gt; Max length is 640 characters.
	 * 
	 * @return body
	 **/
	@ApiModelProperty(value = "Body text. May optionally contain Markdown. (optional) <p> Max length is 640 characters.")
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public CardPostMessageData bodyTextType(EConversationMessageTextType bodyTextType) {
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

	public CardPostMessageData actions(List<MessageAction> actions) {
		this.actions = actions;
		return this;
	}

	public CardPostMessageData addActionsItem(MessageAction actionsItem) {
		if (this.actions == null) {
			this.actions = new ArrayList<>();
		}
		this.actions.add(actionsItem);
		return this;
	}

	/**
	 * Actions to be displayed at the bottom of the card. (optional) &lt;p&gt; Max number of actions is 5.
	 * 
	 * @return actions
	 **/
	@ApiModelProperty(value = "Actions to be displayed at the bottom of the card. (optional) <p> Max number of actions is 5.")
	public List<MessageAction> getActions() {
		return actions;
	}

	public void setActions(List<MessageAction> actions) {
		this.actions = actions;
	}

	public CardPostMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public CardPostMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
		if (this.quickReplies == null) {
			this.quickReplies = new ArrayList<>();
		}
		this.quickReplies.add(quickRepliesItem);
		return this;
	}

	/**
	 * List of quick replies available to the message&#39;s recipients. (optional) &lt;p&gt; Max number of quick replies is 13.
	 * 
	 * @return quickReplies
	 **/
	@ApiModelProperty(value = "List of quick replies available to the message's recipients. (optional) <p> Max number of quick replies is 13.")
	public List<QuickReply> getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CardPostMessageData cardPostMessageData = (CardPostMessageData) o;
		return Objects.equals(this.$type, cardPostMessageData.$type) &&
				Objects.equals(this.type, cardPostMessageData.type) &&
				Objects.equals(this.fallbackText, cardPostMessageData.fallbackText) &&
				Objects.equals(this.imageUrl, cardPostMessageData.imageUrl) &&
				Objects.equals(this.imageAltText, cardPostMessageData.imageAltText) &&
				Objects.equals(this.title, cardPostMessageData.title) &&
				Objects.equals(this.body, cardPostMessageData.body) &&
				Objects.equals(this.bodyTextType, cardPostMessageData.bodyTextType) &&
				Objects.equals(this.actions, cardPostMessageData.actions) &&
				Objects.equals(this.quickReplies, cardPostMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, imageUrl, imageAltText, title, body, bodyTextType, actions, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
		sb.append("    imageAltText: ").append(toIndentedString(imageAltText)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    bodyTextType: ").append(toIndentedString(bodyTextType)).append("\n");
		sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
		sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
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
