
package com.unblu.webapi.model.v4;

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
 * New content for a text message edit. &lt;p&gt; The provided content replaces the message&#39;s current content: only &#x60;text&#x60; is mandatory.
 * &#x60;textType&#x60; and &#x60;quickReplies&#x60; are kept from the current content when left out; the other fields are derived from the new text.
 */
@ApiModel(description = "New content for a text message edit. <p> The provided content replaces the message's current content: only `text` is mandatory. `textType` and `quickReplies` are kept from the current content when left out; the other fields are derived from the new text.")

@JsonPropertyOrder({
	TextEditMessageData.JSON_PROPERTY_$_TYPE,
	TextEditMessageData.JSON_PROPERTY_TYPE,
	TextEditMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	TextEditMessageData.JSON_PROPERTY_LOCALE,
	TextEditMessageData.JSON_PROPERTY_TEXT,
	TextEditMessageData.JSON_PROPERTY_TEXT_TYPE,
	TextEditMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextEditMessageData implements EditMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTEDITMESSAGEDATA("TextEditMessageData");

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
			return TypeEnum.TEXTEDITMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTEDITMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.TEXT;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_TEXT_TYPE = "textType";
	@JsonProperty(JSON_PROPERTY_TEXT_TYPE)
	private EConversationMessageTextType textType;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public TextEditMessageData $type(TypeEnum $type) {
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

	public TextEditMessageData type(EPostMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EPostMessageType getType() {
		return type;
	}

	public void setType(EPostMessageType type) {
		this.type = type;
	}

	public TextEditMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text of the new content, used when: &lt;ul&gt; &lt;li&gt;Unblu can&#39;t restore the complex content of a message&lt;/li&gt; &lt;li&gt;A
	 * push notification couldn&#39;t be decrypted&lt;/li&gt; &lt;li&gt;Last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The value must not contain
	 * markdown.&lt;br&gt; If no fallback is given, a fallback text based on the new content is generated. This may however not always be a perfect textual
	 * representation of the content.
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text of the new content, used when: <ul> <li>Unblu can't restore the complex content of a message</li> <li>A push notification couldn't be decrypted</li> <li>Last message in the conversation overview</li> </ul> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the new content is generated. This may however not always be a perfect textual representation of the content.")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public TextEditMessageData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Optional source language of the new content (as BCP 47 language tag, including region if available).&lt;br&gt; If not provided, the language is automatically
	 * detected based on the new content. If the detection can&#39;t confidently detect the language, the message keeps its current locale.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Optional source language of the new content (as BCP 47 language tag, including region if available).<br> If not provided, the language is automatically detected based on the new content. If the detection can't confidently detect the language, the message keeps its current locale.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public TextEditMessageData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Mandatory new message text
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Mandatory new message text")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextEditMessageData textType(EConversationMessageTextType textType) {
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

	public TextEditMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public TextEditMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
		if (this.quickReplies == null) {
			this.quickReplies = new ArrayList<>();
		}
		this.quickReplies.add(quickRepliesItem);
		return this;
	}

	/**
	 * Optional quick replies available to the message&#39;s recipients after the edit. &lt;p&gt; The provided array replaces the message&#39;s current quick
	 * replies, and an empty array removes them. If the field is omitted, the message keeps its current quick replies. &lt;p&gt; Max number of quick replies is 13.
	 * 
	 * @return quickReplies
	 **/
	@ApiModelProperty(value = "Optional quick replies available to the message's recipients after the edit. <p> The provided array replaces the message's current quick replies, and an empty array removes them. If the field is omitted, the message keeps its current quick replies. <p> Max number of quick replies is 13.")
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
		TextEditMessageData textEditMessageData = (TextEditMessageData) o;
		return Objects.equals(this.$type, textEditMessageData.$type) &&
				Objects.equals(this.type, textEditMessageData.type) &&
				Objects.equals(this.fallbackText, textEditMessageData.fallbackText) &&
				Objects.equals(this.locale, textEditMessageData.locale) &&
				Objects.equals(this.text, textEditMessageData.text) &&
				Objects.equals(this.textType, textEditMessageData.textType) &&
				Objects.equals(this.quickReplies, textEditMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, locale, text, textType, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextEditMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
