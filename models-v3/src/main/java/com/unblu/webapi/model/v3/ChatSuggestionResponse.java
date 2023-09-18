
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
 * Model representing the response to a chat suggestion request
 */
@ApiModel(description = "Model representing the response to a chat suggestion request")

@JsonPropertyOrder({
	ChatSuggestionResponse.JSON_PROPERTY_$_TYPE,
	ChatSuggestionResponse.JSON_PROPERTY_SUGGESTION_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatSuggestionResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CHATSUGGESTIONRESPONSE("ChatSuggestionResponse");

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
			return TypeEnum.CHATSUGGESTIONRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CHATSUGGESTIONRESPONSE;

	public static final String JSON_PROPERTY_SUGGESTION_TEXT = "suggestionText";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_TEXT)
	private String suggestionText;

	public ChatSuggestionResponse $type(TypeEnum $type) {
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

	public ChatSuggestionResponse suggestionText(String suggestionText) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChatSuggestionResponse chatSuggestionResponse = (ChatSuggestionResponse) o;
		return Objects.equals(this.$type, chatSuggestionResponse.$type) &&
				Objects.equals(this.suggestionText, chatSuggestionResponse.suggestionText);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, suggestionText);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChatSuggestionResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    suggestionText: ").append(toIndentedString(suggestionText)).append("\n");
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
