
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
 * Special case of a &#x60;MultichoiceQuestionPostMessageData&#x60; which is used to rate the conversation in which it is send. Typically used during the
 * offboarding phase. &lt;p&gt; &lt;b&gt;Note:&lt;/b&gt; an answer to this message does not automatically set this rating for the answering participant. This
 * must be done manually via the API.
 */
@ApiModel(description = "Special case of a `MultichoiceQuestionPostMessageData` which is used to rate the conversation in which it is send. Typically used during the offboarding phase. <p> <b>Note:</b> an answer to this message does not automatically set this rating for the answering participant. This must be done manually via the API.")

@JsonPropertyOrder({
	RatingQuestionPostMessageData.JSON_PROPERTY_$_TYPE,
	RatingQuestionPostMessageData.JSON_PROPERTY_TYPE,
	RatingQuestionPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	RatingQuestionPostMessageData.JSON_PROPERTY_TEXT,
	RatingQuestionPostMessageData.JSON_PROPERTY_TEXT_TYPE,
	RatingQuestionPostMessageData.JSON_PROPERTY_OPTIONS,
	RatingQuestionPostMessageData.JSON_PROPERTY_DECLINABLE,
	RatingQuestionPostMessageData.JSON_PROPERTY_DECLINE_LABEL,
	RatingQuestionPostMessageData.JSON_PROPERTY_DECLINE_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RatingQuestionPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RATINGQUESTIONPOSTMESSAGEDATA("RatingQuestionPostMessageData");

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
			return TypeEnum.RATINGQUESTIONPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RATINGQUESTIONPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.RATING_QUESTION;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_TEXT_TYPE = "textType";
	@JsonProperty(JSON_PROPERTY_TEXT_TYPE)
	private EConversationMessageTextType textType;

	public static final String JSON_PROPERTY_OPTIONS = "options";
	@JsonProperty(JSON_PROPERTY_OPTIONS)
	private List<RatingQuestionOption> options = null;

	public static final String JSON_PROPERTY_DECLINABLE = "declinable";
	@JsonProperty(JSON_PROPERTY_DECLINABLE)
	private Boolean declinable;

	public static final String JSON_PROPERTY_DECLINE_LABEL = "declineLabel";
	@JsonProperty(JSON_PROPERTY_DECLINE_LABEL)
	private String declineLabel;

	public static final String JSON_PROPERTY_DECLINE_VALUE = "declineValue";
	@JsonProperty(JSON_PROPERTY_DECLINE_VALUE)
	private String declineValue;

	public RatingQuestionPostMessageData $type(TypeEnum $type) {
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

	public RatingQuestionPostMessageData type(EPostMessageType type) {
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

	public RatingQuestionPostMessageData fallbackText(String fallbackText) {
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

	public RatingQuestionPostMessageData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Question message text
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Question message text")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public RatingQuestionPostMessageData textType(EConversationMessageTextType textType) {
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

	public RatingQuestionPostMessageData options(List<RatingQuestionOption> options) {
		this.options = options;
		return this;
	}

	public RatingQuestionPostMessageData addOptionsItem(RatingQuestionOption optionsItem) {
		if (this.options == null) {
			this.options = new ArrayList<>();
		}
		this.options.add(optionsItem);
		return this;
	}

	/**
	 * Response options for the question.&lt;br&gt; When replying to this question, the value of an option needs to be send in a &#x60;ReplyPostMessageData&#x60;
	 * 
	 * @return options
	 **/
	@ApiModelProperty(value = "Response options for the question.<br> When replying to this question, the value of an option needs to be send in a `ReplyPostMessageData`")
	public List<RatingQuestionOption> getOptions() {
		return options;
	}

	public void setOptions(List<RatingQuestionOption> options) {
		this.options = options;
	}

	public RatingQuestionPostMessageData declinable(Boolean declinable) {
		this.declinable = declinable;
		return this;
	}

	/**
	 * Whether the question can be declined
	 * 
	 * @return declinable
	 **/
	@ApiModelProperty(value = "Whether the question can be declined")
	public Boolean isDeclinable() {
		return declinable;
	}

	public void setDeclinable(Boolean declinable) {
		this.declinable = declinable;
	}

	public RatingQuestionPostMessageData declineLabel(String declineLabel) {
		this.declineLabel = declineLabel;
		return this;
	}

	/**
	 * Label for the decline button which will also be used as text for the reply
	 * 
	 * @return declineLabel
	 **/
	@ApiModelProperty(value = "Label for the decline button which will also be used as text for the reply")
	public String getDeclineLabel() {
		return declineLabel;
	}

	public void setDeclineLabel(String declineLabel) {
		this.declineLabel = declineLabel;
	}

	public RatingQuestionPostMessageData declineValue(String declineValue) {
		this.declineValue = declineValue;
		return this;
	}

	/**
	 * Value which will be propagated as reply value if the question is declined
	 * 
	 * @return declineValue
	 **/
	@ApiModelProperty(value = "Value which will be propagated as reply value if the question is declined")
	public String getDeclineValue() {
		return declineValue;
	}

	public void setDeclineValue(String declineValue) {
		this.declineValue = declineValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RatingQuestionPostMessageData ratingQuestionPostMessageData = (RatingQuestionPostMessageData) o;
		return Objects.equals(this.$type, ratingQuestionPostMessageData.$type) &&
				Objects.equals(this.type, ratingQuestionPostMessageData.type) &&
				Objects.equals(this.fallbackText, ratingQuestionPostMessageData.fallbackText) &&
				Objects.equals(this.text, ratingQuestionPostMessageData.text) &&
				Objects.equals(this.textType, ratingQuestionPostMessageData.textType) &&
				Objects.equals(this.options, ratingQuestionPostMessageData.options) &&
				Objects.equals(this.declinable, ratingQuestionPostMessageData.declinable) &&
				Objects.equals(this.declineLabel, ratingQuestionPostMessageData.declineLabel) &&
				Objects.equals(this.declineValue, ratingQuestionPostMessageData.declineValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, text, textType, options, declinable, declineLabel, declineValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RatingQuestionPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
		sb.append("    options: ").append(toIndentedString(options)).append("\n");
		sb.append("    declinable: ").append(toIndentedString(declinable)).append("\n");
		sb.append("    declineLabel: ").append(toIndentedString(declineLabel)).append("\n");
		sb.append("    declineValue: ").append(toIndentedString(declineValue)).append("\n");
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
