
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
 * Text message
 */
@ApiModel(description = "Text message")

@JsonPropertyOrder({
	TextPostMessageData.JSON_PROPERTY_$_TYPE,
	TextPostMessageData.JSON_PROPERTY_TYPE,
	TextPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	TextPostMessageData.JSON_PROPERTY_TEXT,
	TextPostMessageData.JSON_PROPERTY_TEXT_TYPE,
	TextPostMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTPOSTMESSAGEDATA("TextPostMessageData");

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
			return TypeEnum.TEXTPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.TEXT;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_TEXT_TYPE = "textType";
	@JsonProperty(JSON_PROPERTY_TEXT_TYPE)
	private EConversationMessageTextType textType;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public TextPostMessageData $type(TypeEnum $type) {
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

	public TextPostMessageData type(EPostMessageType type) {
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

	public TextPostMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text which is used when: &lt;ul&gt; &lt;li&gt;Unblu can&#39;t restore the complex content of a message&lt;/li&gt; &lt;li&gt;A push
	 * notification couldn&#39;t be decrypted&lt;/li&gt; &lt;li&gt;Last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The usage of this field is
	 * recommended especially for complex message types.&lt;br&gt; The value must not contain markdown.&lt;br&gt; If no fallback is given, a fallback text based on
	 * the content of the message is generated. This may however not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text which is used when: <ul> <li>Unblu can't restore the complex content of a message</li> <li>A push notification couldn't be decrypted</li> <li>Last message in the conversation overview</li> </ul> The usage of this field is recommended especially for complex message types.<br> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the content of the message is generated. This may however not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public TextPostMessageData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Message text
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Message text")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextPostMessageData textType(EConversationMessageTextType textType) {
		this.textType = textType;
		return this;
	}

	/**
	 * Get textType
	 * 
	 * @return textType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageTextType getTextType() {
		return textType;
	}

	public void setTextType(EConversationMessageTextType textType) {
		this.textType = textType;
	}

	public TextPostMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public TextPostMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
		if (this.quickReplies == null) {
			this.quickReplies = new ArrayList<>();
		}
		this.quickReplies.add(quickRepliesItem);
		return this;
	}

	/**
	 * Optional list of quick replies available to the message&#39;s recipients &lt;p&gt; Max number of quick replies is 13.
	 * 
	 * @return quickReplies
	 **/
	@ApiModelProperty(value = "Optional list of quick replies available to the message's recipients <p> Max number of quick replies is 13.")
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
		TextPostMessageData textPostMessageData = (TextPostMessageData) o;
		return Objects.equals(this.$type, textPostMessageData.$type) &&
				Objects.equals(this.type, textPostMessageData.type) &&
				Objects.equals(this.fallbackText, textPostMessageData.fallbackText) &&
				Objects.equals(this.text, textPostMessageData.text) &&
				Objects.equals(this.textType, textPostMessageData.textType) &&
				Objects.equals(this.quickReplies, textPostMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, text, textType, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
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
