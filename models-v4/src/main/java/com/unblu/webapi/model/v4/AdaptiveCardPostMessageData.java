
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A message carrying an Adaptive Card JSON payload. &lt;p&gt; This model is used when a bot sends an Adaptive Card to a conversation. The Collaboration Server
 * validates the card payload against the Unblu Adaptive Card schema when the message is posted and rejects payloads that violate it. The card&#39;s
 * human-readable texts are translated like those of a text message. &lt;p&gt; On top of the schema, the URL of every &#x60;Action.OpenUrl&#x60; must start with
 * &#x60;http://&#x60; or &#x60;https://&#x60;. The Collaboration Server rejects cards with an action URL that uses another protocol, such as
 * &#x60;javascript:&#x60;, &#x60;data:&#x60;, or &#x60;file:&#x60;. &lt;p&gt; If no fallback text is given, one is derived from the card: its own
 * &#x60;fallbackText&#x60; property if present, otherwise the text of all text blocks in its body, joined by line breaks. If neither exists, a generic fallback
 * text is used (the text property &#x60;com.unblu.conversation.message.emptyAdaptiveCardFallback&#x60;). &lt;p&gt; The web API serves the schema at
 * &#x60;&lt;unblu-server&gt;/app/rest/v4/schemas/unblu-adaptive-card.json&#x60;. Its HTML reference is at
 * &#x60;&lt;unblu-server&gt;/app/schemas/v4/unblu-adaptive-card.html&#x60;.
 */
@ApiModel(description = "A message carrying an Adaptive Card JSON payload. <p> This model is used when a bot sends an Adaptive Card to a conversation. The Collaboration Server validates the card payload against the Unblu Adaptive Card schema when the message is posted and rejects payloads that violate it. The card's human-readable texts are translated like those of a text message. <p> On top of the schema, the URL of every `Action.OpenUrl` must start with `http://` or `https://`. The Collaboration Server rejects cards with an action URL that uses another protocol, such as `javascript:`, `data:`, or `file:`. <p> If no fallback text is given, one is derived from the card: its own `fallbackText` property if present, otherwise the text of all text blocks in its body, joined by line breaks. If neither exists, a generic fallback text is used (the text property `com.unblu.conversation.message.emptyAdaptiveCardFallback`). <p> The web API serves the schema at `<unblu-server>/app/rest/v4/schemas/unblu-adaptive-card.json`. Its HTML reference is at `<unblu-server>/app/schemas/v4/unblu-adaptive-card.html`.")

@JsonPropertyOrder({
	AdaptiveCardPostMessageData.JSON_PROPERTY_$_TYPE,
	AdaptiveCardPostMessageData.JSON_PROPERTY_TYPE,
	AdaptiveCardPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	AdaptiveCardPostMessageData.JSON_PROPERTY_LOCALE,
	AdaptiveCardPostMessageData.JSON_PROPERTY_CONTENT_ORIGIN,
	AdaptiveCardPostMessageData.JSON_PROPERTY_ADAPTIVE_CARD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AdaptiveCardPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ADAPTIVECARDPOSTMESSAGEDATA("AdaptiveCardPostMessageData");

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
			return TypeEnum.ADAPTIVECARDPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ADAPTIVECARDPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.ADAPTIVE_CARD;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_CONTENT_ORIGIN = "contentOrigin";
	@JsonProperty(JSON_PROPERTY_CONTENT_ORIGIN)
	private EMessageContentOrigin contentOrigin;

	public static final String JSON_PROPERTY_ADAPTIVE_CARD = "adaptiveCard";
	@JsonProperty(JSON_PROPERTY_ADAPTIVE_CARD)
	private JsonNode adaptiveCard = null;

	public AdaptiveCardPostMessageData $type(TypeEnum $type) {
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

	public AdaptiveCardPostMessageData type(EPostMessageType type) {
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

	public AdaptiveCardPostMessageData fallbackText(String fallbackText) {
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

	public AdaptiveCardPostMessageData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Optional source language of the message (as BCP 47 language tag form including region if available). If not provided the language will be automatically
	 * detected based on the provided content. If the detection can&#39;t confidently detect the language the message will be considered to be in the
	 * conversation&#39;s locale.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Optional source language of the message (as BCP 47 language tag form including region if available). If not provided the language will be automatically detected based on the provided content. If the detection can't confidently detect the language the message will be considered to be in the conversation's locale.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public AdaptiveCardPostMessageData contentOrigin(EMessageContentOrigin contentOrigin) {
		this.contentOrigin = contentOrigin;
		return this;
	}

	/**
	 * Get contentOrigin
	 * 
	 * @return contentOrigin
	 **/
	@ApiModelProperty(value = "")
	public EMessageContentOrigin getContentOrigin() {
		return contentOrigin;
	}

	public void setContentOrigin(EMessageContentOrigin contentOrigin) {
		this.contentOrigin = contentOrigin;
	}

	public AdaptiveCardPostMessageData adaptiveCard(JsonNode adaptiveCard) {
		this.adaptiveCard = adaptiveCard;
		return this;
	}

	/**
	 * Get adaptiveCard
	 * 
	 * @return adaptiveCard
	 **/
	@ApiModelProperty(value = "")
	public JsonNode getAdaptiveCard() {
		return adaptiveCard;
	}

	public void setAdaptiveCard(JsonNode adaptiveCard) {
		this.adaptiveCard = adaptiveCard;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdaptiveCardPostMessageData adaptiveCardPostMessageData = (AdaptiveCardPostMessageData) o;
		return Objects.equals(this.$type, adaptiveCardPostMessageData.$type) &&
				Objects.equals(this.type, adaptiveCardPostMessageData.type) &&
				Objects.equals(this.fallbackText, adaptiveCardPostMessageData.fallbackText) &&
				Objects.equals(this.locale, adaptiveCardPostMessageData.locale) &&
				Objects.equals(this.contentOrigin, adaptiveCardPostMessageData.contentOrigin) &&
				Objects.equals(this.adaptiveCard, adaptiveCardPostMessageData.adaptiveCard);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, locale, contentOrigin, adaptiveCard);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdaptiveCardPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    contentOrigin: ").append(toIndentedString(contentOrigin)).append("\n");
		sb.append("    adaptiveCard: ").append(toIndentedString(adaptiveCard)).append("\n");
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
