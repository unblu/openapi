
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
 * Response replacing the Adaptive Card the action was executed on. &lt;p&gt; Only &#x60;adaptiveCard&#x60; is mandatory. The payload is validated against the
 * Unblu Adaptive Card schema exactly like a card sent through the &#x60;/bots/sendMessage&#x60; endpoint, including the rules on action URLs. &lt;p&gt; Only an
 * &#x60;Action.Execute&#x60; action may be answered with a replacement card, as &#x60;Action.Submit&#x60; has no request/response semantics. A card returned
 * for any other action type is ignored, as is a card that does not pass validation; in both cases the card the person acted on is left as it is. &lt;p&gt; The
 * card is applied to the message, so every participant of the conversation sees it and it is kept in the conversation&#39;s history like any other message
 * edit. &lt;p&gt; The web API serves the schema at &#x60;&lt;unblu-server&gt;/app/rest/v4/schemas/unblu-adaptive-card.json&#x60;. Its HTML reference is at
 * &#x60;&lt;unblu-server&gt;/app/schemas/v4/unblu-adaptive-card.html&#x60;.
 */
@ApiModel(description = "Response replacing the Adaptive Card the action was executed on. <p> Only `adaptiveCard` is mandatory. The payload is validated against the Unblu Adaptive Card schema exactly like a card sent through the `/bots/sendMessage` endpoint, including the rules on action URLs. <p> Only an `Action.Execute` action may be answered with a replacement card, as `Action.Submit` has no request/response semantics. A card returned for any other action type is ignored, as is a card that does not pass validation; in both cases the card the person acted on is left as it is. <p> The card is applied to the message, so every participant of the conversation sees it and it is kept in the conversation's history like any other message edit. <p> The web API serves the schema at `<unblu-server>/app/rest/v4/schemas/unblu-adaptive-card.json`. Its HTML reference is at `<unblu-server>/app/schemas/v4/unblu-adaptive-card.html`.")

@JsonPropertyOrder({
	BotDialogAdaptiveCardActionReplacementResponse.JSON_PROPERTY_$_TYPE,
	BotDialogAdaptiveCardActionReplacementResponse.JSON_PROPERTY_TYPE,
	BotDialogAdaptiveCardActionReplacementResponse.JSON_PROPERTY_ADAPTIVE_CARD,
	BotDialogAdaptiveCardActionReplacementResponse.JSON_PROPERTY_FALLBACK_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogAdaptiveCardActionReplacementResponse implements BotDialogAdaptiveCardActionResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGADAPTIVECARDACTIONREPLACEMENTRESPONSE("BotDialogAdaptiveCardActionReplacementResponse");

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
			return TypeEnum.BOTDIALOGADAPTIVECARDACTIONREPLACEMENTRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGADAPTIVECARDACTIONREPLACEMENTRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBotDialogAdaptiveCardActionResponseType type = EBotDialogAdaptiveCardActionResponseType.REPLACEMENT;

	public static final String JSON_PROPERTY_ADAPTIVE_CARD = "adaptiveCard";
	@JsonProperty(JSON_PROPERTY_ADAPTIVE_CARD)
	private JsonNode adaptiveCard = null;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public BotDialogAdaptiveCardActionReplacementResponse $type(TypeEnum $type) {
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

	public BotDialogAdaptiveCardActionReplacementResponse type(EBotDialogAdaptiveCardActionResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EBotDialogAdaptiveCardActionResponseType getType() {
		return type;
	}

	public void setType(EBotDialogAdaptiveCardActionResponseType type) {
		this.type = type;
	}

	public BotDialogAdaptiveCardActionReplacementResponse adaptiveCard(JsonNode adaptiveCard) {
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

	public BotDialogAdaptiveCardActionReplacementResponse fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text of the replacement card, used where the card itself can&#39;t be rendered, for instance in a push notification or as the last message
	 * in the conversation overview. The value must not contain markdown. &lt;p&gt; If no fallback text is given, one is derived from the returned card, the same
	 * way as for a card sent with &#x60;/bots/sendMessage&#x60; or edited with the &#x60;/bots/editMessage&#x60; endpoint.
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text of the replacement card, used where the card itself can't be rendered, for instance in a push notification or as the last message in the conversation overview. The value must not contain markdown. <p> If no fallback text is given, one is derived from the returned card, the same way as for a card sent with `/bots/sendMessage` or edited with the `/bots/editMessage` endpoint.")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogAdaptiveCardActionReplacementResponse botDialogAdaptiveCardActionReplacementResponse = (BotDialogAdaptiveCardActionReplacementResponse) o;
		return Objects.equals(this.$type, botDialogAdaptiveCardActionReplacementResponse.$type) &&
				Objects.equals(this.type, botDialogAdaptiveCardActionReplacementResponse.type) &&
				Objects.equals(this.adaptiveCard, botDialogAdaptiveCardActionReplacementResponse.adaptiveCard) &&
				Objects.equals(this.fallbackText, botDialogAdaptiveCardActionReplacementResponse.fallbackText);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, adaptiveCard, fallbackText);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogAdaptiveCardActionReplacementResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    adaptiveCard: ").append(toIndentedString(adaptiveCard)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
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
