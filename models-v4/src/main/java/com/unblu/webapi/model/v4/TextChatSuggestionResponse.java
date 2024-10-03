
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
 * Model representing the response to a chat suggestion request
 */
@ApiModel(description = "Model representing the response to a chat suggestion request")

@JsonPropertyOrder({
	TextChatSuggestionResponse.JSON_PROPERTY_$_TYPE,
	TextChatSuggestionResponse.JSON_PROPERTY_TYPE,
	TextChatSuggestionResponse.JSON_PROPERTY_SUGGESTION_TEXT,
	TextChatSuggestionResponse.JSON_PROPERTY_SUGGESTION_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextChatSuggestionResponse implements ChatSuggestionResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTCHATSUGGESTIONRESPONSE("TextChatSuggestionResponse");

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
			return TypeEnum.TEXTCHATSUGGESTIONRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTCHATSUGGESTIONRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EChatSuggestionResponseType type = EChatSuggestionResponseType.TEXT;

	public static final String JSON_PROPERTY_SUGGESTION_TEXT = "suggestionText";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_TEXT)
	private String suggestionText;

	public static final String JSON_PROPERTY_SUGGESTION_COMMENT = "suggestionComment";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_COMMENT)
	private String suggestionComment;

	public TextChatSuggestionResponse $type(TypeEnum $type) {
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

	public TextChatSuggestionResponse type(EChatSuggestionResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EChatSuggestionResponseType getType() {
		return type;
	}

	public void setType(EChatSuggestionResponseType type) {
		this.type = type;
	}

	public TextChatSuggestionResponse suggestionText(String suggestionText) {
		this.suggestionText = suggestionText;
		return this;
	}

	/**
	 * The suggested text
	 * 
	 * @return suggestionText
	 **/
	@ApiModelProperty(value = "The suggested text")
	public String getSuggestionText() {
		return suggestionText;
	}

	public void setSuggestionText(String suggestionText) {
		this.suggestionText = suggestionText;
	}

	public TextChatSuggestionResponse suggestionComment(String suggestionComment) {
		this.suggestionComment = suggestionComment;
		return this;
	}

	/**
	 * Comment on the suggestion. The comment is displayed to the agent but not sent as part of the suggested message. Can be Markdown. Optional.
	 * 
	 * @return suggestionComment
	 **/
	@ApiModelProperty(value = "Comment on the suggestion. The comment is displayed to the agent but not sent as part of the suggested message. Can be Markdown. Optional.")
	public String getSuggestionComment() {
		return suggestionComment;
	}

	public void setSuggestionComment(String suggestionComment) {
		this.suggestionComment = suggestionComment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TextChatSuggestionResponse textChatSuggestionResponse = (TextChatSuggestionResponse) o;
		return Objects.equals(this.$type, textChatSuggestionResponse.$type) &&
				Objects.equals(this.type, textChatSuggestionResponse.type) &&
				Objects.equals(this.suggestionText, textChatSuggestionResponse.suggestionText) &&
				Objects.equals(this.suggestionComment, textChatSuggestionResponse.suggestionComment);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, suggestionText, suggestionComment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextChatSuggestionResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    suggestionText: ").append(toIndentedString(suggestionText)).append("\n");
		sb.append("    suggestionComment: ").append(toIndentedString(suggestionComment)).append("\n");
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
