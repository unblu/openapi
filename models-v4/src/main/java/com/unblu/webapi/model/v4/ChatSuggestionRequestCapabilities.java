
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ChatSuggestionRequestCapabilities
 */

@JsonPropertyOrder({
	ChatSuggestionRequestCapabilities.JSON_PROPERTY_$_TYPE,
	ChatSuggestionRequestCapabilities.JSON_PROPERTY_MARKDOWN_SUPPORTED,
	ChatSuggestionRequestCapabilities.JSON_PROPERTY_MAX_CHARS_SUPPORTED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatSuggestionRequestCapabilities {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CHATSUGGESTIONREQUESTCAPABILITIES("ChatSuggestionRequestCapabilities");

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
			return TypeEnum.CHATSUGGESTIONREQUESTCAPABILITIES;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CHATSUGGESTIONREQUESTCAPABILITIES;

	public static final String JSON_PROPERTY_MARKDOWN_SUPPORTED = "markdownSupported";
	@JsonProperty(JSON_PROPERTY_MARKDOWN_SUPPORTED)
	private Boolean markdownSupported;

	public static final String JSON_PROPERTY_MAX_CHARS_SUPPORTED = "maxCharsSupported";
	@JsonProperty(JSON_PROPERTY_MAX_CHARS_SUPPORTED)
	private Integer maxCharsSupported;

	public ChatSuggestionRequestCapabilities $type(TypeEnum $type) {
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

	public ChatSuggestionRequestCapabilities markdownSupported(Boolean markdownSupported) {
		this.markdownSupported = markdownSupported;
		return this;
	}

	/**
	 * Indicates whether the caller of the request supports markdown syntax in the response or not
	 * 
	 * @return markdownSupported
	 **/
	@ApiModelProperty(value = "Indicates whether the caller of the request supports markdown syntax in the response or not")
	public Boolean isMarkdownSupported() {
		return markdownSupported;
	}

	public void setMarkdownSupported(Boolean markdownSupported) {
		this.markdownSupported = markdownSupported;
	}

	public ChatSuggestionRequestCapabilities maxCharsSupported(Integer maxCharsSupported) {
		this.maxCharsSupported = maxCharsSupported;
		return this;
	}

	/**
	 * The maximum number of characters in the response that are supported by the caller
	 * 
	 * @return maxCharsSupported
	 **/
	@ApiModelProperty(value = "The maximum number of characters in the response that are supported by the caller")
	public Integer getMaxCharsSupported() {
		return maxCharsSupported;
	}

	public void setMaxCharsSupported(Integer maxCharsSupported) {
		this.maxCharsSupported = maxCharsSupported;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChatSuggestionRequestCapabilities chatSuggestionRequestCapabilities = (ChatSuggestionRequestCapabilities) o;
		return Objects.equals(this.$type, chatSuggestionRequestCapabilities.$type) &&
				Objects.equals(this.markdownSupported, chatSuggestionRequestCapabilities.markdownSupported) &&
				Objects.equals(this.maxCharsSupported, chatSuggestionRequestCapabilities.maxCharsSupported);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, markdownSupported, maxCharsSupported);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChatSuggestionRequestCapabilities {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    markdownSupported: ").append(toIndentedString(markdownSupported)).append("\n");
		sb.append("    maxCharsSupported: ").append(toIndentedString(maxCharsSupported)).append("\n");
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
