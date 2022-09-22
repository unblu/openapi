
package com.unblu.webapi.model.v3;

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
 * Question message which should be answered with a some kind of a free text. There are several predifined types of answer possibilities. &lt;p&gt;
 * &lt;b&gt;Note:&lt;/b&gt; The answer to this question is entered into a separat text input directly linked to the message. For questions that should be
 * answered via the normal chat-input, please use TextPostMessageData messages.
 */
@ApiModel(description = "Question message which should be answered with a some kind of a free text. There are several predifined types of answer possibilities. <p> <b>Note:</b> The answer to this question is entered into a separat text input directly linked to the message. For questions that should be answered via the normal chat-input, please use TextPostMessageData messages.")

@JsonPropertyOrder({
	TextQuestionPostMessageData.JSON_PROPERTY_$_TYPE,
	TextQuestionPostMessageData.JSON_PROPERTY_TYPE,
	TextQuestionPostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	TextQuestionPostMessageData.JSON_PROPERTY_TEXT,
	TextQuestionPostMessageData.JSON_PROPERTY_TEXT_TYPE,
	TextQuestionPostMessageData.JSON_PROPERTY_QUESTION_TYPE,
	TextQuestionPostMessageData.JSON_PROPERTY_HINT,
	TextQuestionPostMessageData.JSON_PROPERTY_MIN_CHARACTERS,
	TextQuestionPostMessageData.JSON_PROPERTY_MAX_CHARACTERS,
	TextQuestionPostMessageData.JSON_PROPERTY_ADDITIONAL_REGEX,
	TextQuestionPostMessageData.JSON_PROPERTY_DECLINABLE,
	TextQuestionPostMessageData.JSON_PROPERTY_DECLINE_LABEL,
	TextQuestionPostMessageData.JSON_PROPERTY_DECLINE_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextQuestionPostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTQUESTIONPOSTMESSAGEDATA("TextQuestionPostMessageData");

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
			return TypeEnum.TEXTQUESTIONPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTQUESTIONPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.TEXT_QUESTION;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_TEXT_TYPE = "textType";
	@JsonProperty(JSON_PROPERTY_TEXT_TYPE)
	private EConversationMessageTextType textType;

	public static final String JSON_PROPERTY_QUESTION_TYPE = "questionType";
	@JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
	private ETextQuestionType questionType;

	public static final String JSON_PROPERTY_HINT = "hint";
	@JsonProperty(JSON_PROPERTY_HINT)
	private String hint;

	public static final String JSON_PROPERTY_MIN_CHARACTERS = "minCharacters";
	@JsonProperty(JSON_PROPERTY_MIN_CHARACTERS)
	private Integer minCharacters;

	public static final String JSON_PROPERTY_MAX_CHARACTERS = "maxCharacters";
	@JsonProperty(JSON_PROPERTY_MAX_CHARACTERS)
	private Integer maxCharacters;

	public static final String JSON_PROPERTY_ADDITIONAL_REGEX = "additionalRegex";
	@JsonProperty(JSON_PROPERTY_ADDITIONAL_REGEX)
	private String additionalRegex;

	public static final String JSON_PROPERTY_DECLINABLE = "declinable";
	@JsonProperty(JSON_PROPERTY_DECLINABLE)
	private Boolean declinable;

	public static final String JSON_PROPERTY_DECLINE_LABEL = "declineLabel";
	@JsonProperty(JSON_PROPERTY_DECLINE_LABEL)
	private String declineLabel;

	public static final String JSON_PROPERTY_DECLINE_VALUE = "declineValue";
	@JsonProperty(JSON_PROPERTY_DECLINE_VALUE)
	private String declineValue;

	public TextQuestionPostMessageData $type(TypeEnum $type) {
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

	public TextQuestionPostMessageData type(EPostMessageType type) {
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

	public TextQuestionPostMessageData fallbackText(String fallbackText) {
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

	public TextQuestionPostMessageData text(String text) {
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

	public TextQuestionPostMessageData textType(EConversationMessageTextType textType) {
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

	public TextQuestionPostMessageData questionType(ETextQuestionType questionType) {
		this.questionType = questionType;
		return this;
	}

	/**
	 * Get questionType
	 * 
	 * @return questionType
	 **/
	@ApiModelProperty(value = "")
	public ETextQuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(ETextQuestionType questionType) {
		this.questionType = questionType;
	}

	public TextQuestionPostMessageData hint(String hint) {
		this.hint = hint;
		return this;
	}

	/**
	 * Hint which is displayed inside the reply field to give the user a hint, what the answer should contain. &lt;br&gt; Optional value
	 * 
	 * @return hint
	 **/
	@ApiModelProperty(value = "Hint which is displayed inside the reply field to give the user a hint, what the answer should contain. <br> Optional value")
	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public TextQuestionPostMessageData minCharacters(Integer minCharacters) {
		this.minCharacters = minCharacters;
		return this;
	}

	/**
	 * Minimum amount of characters the user has to answer with. &lt;br&gt; Optional value
	 * 
	 * @return minCharacters
	 **/
	@ApiModelProperty(value = "Minimum amount of characters the user has to answer with. <br> Optional value")
	public Integer getMinCharacters() {
		return minCharacters;
	}

	public void setMinCharacters(Integer minCharacters) {
		this.minCharacters = minCharacters;
	}

	public TextQuestionPostMessageData maxCharacters(Integer maxCharacters) {
		this.maxCharacters = maxCharacters;
		return this;
	}

	/**
	 * Maximum amount if characters the user can answer with.&lt;br&gt; Optional
	 * 
	 * @return maxCharacters
	 **/
	@ApiModelProperty(value = "Maximum amount if characters the user can answer with.<br> Optional")
	public Integer getMaxCharacters() {
		return maxCharacters;
	}

	public void setMaxCharacters(Integer maxCharacters) {
		this.maxCharacters = maxCharacters;
	}

	public TextQuestionPostMessageData additionalRegex(String additionalRegex) {
		this.additionalRegex = additionalRegex;
		return this;
	}

	/**
	 * The reply has to match this regex. &lt;br&gt; Optional value
	 * 
	 * @return additionalRegex
	 **/
	@ApiModelProperty(value = "The reply has to match this regex. <br> Optional value")
	public String getAdditionalRegex() {
		return additionalRegex;
	}

	public void setAdditionalRegex(String additionalRegex) {
		this.additionalRegex = additionalRegex;
	}

	public TextQuestionPostMessageData declinable(Boolean declinable) {
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

	public TextQuestionPostMessageData declineLabel(String declineLabel) {
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

	public TextQuestionPostMessageData declineValue(String declineValue) {
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
		TextQuestionPostMessageData textQuestionPostMessageData = (TextQuestionPostMessageData) o;
		return Objects.equals(this.$type, textQuestionPostMessageData.$type) &&
				Objects.equals(this.type, textQuestionPostMessageData.type) &&
				Objects.equals(this.fallbackText, textQuestionPostMessageData.fallbackText) &&
				Objects.equals(this.text, textQuestionPostMessageData.text) &&
				Objects.equals(this.textType, textQuestionPostMessageData.textType) &&
				Objects.equals(this.questionType, textQuestionPostMessageData.questionType) &&
				Objects.equals(this.hint, textQuestionPostMessageData.hint) &&
				Objects.equals(this.minCharacters, textQuestionPostMessageData.minCharacters) &&
				Objects.equals(this.maxCharacters, textQuestionPostMessageData.maxCharacters) &&
				Objects.equals(this.additionalRegex, textQuestionPostMessageData.additionalRegex) &&
				Objects.equals(this.declinable, textQuestionPostMessageData.declinable) &&
				Objects.equals(this.declineLabel, textQuestionPostMessageData.declineLabel) &&
				Objects.equals(this.declineValue, textQuestionPostMessageData.declineValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, text, textType, questionType, hint, minCharacters, maxCharacters, additionalRegex, declinable, declineLabel, declineValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextQuestionPostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
		sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
		sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
		sb.append("    minCharacters: ").append(toIndentedString(minCharacters)).append("\n");
		sb.append("    maxCharacters: ").append(toIndentedString(maxCharacters)).append("\n");
		sb.append("    additionalRegex: ").append(toIndentedString(additionalRegex)).append("\n");
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
