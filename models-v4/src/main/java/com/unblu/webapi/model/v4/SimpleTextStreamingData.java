
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
 * Plain text content of a streaming message
 */
@ApiModel(description = "Plain text content of a streaming message")

@JsonPropertyOrder({
	SimpleTextStreamingData.JSON_PROPERTY_$_TYPE,
	SimpleTextStreamingData.JSON_PROPERTY_CONTENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SimpleTextStreamingData implements StreamingData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SIMPLETEXTSTREAMINGDATA("SimpleTextStreamingData");

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
			return TypeEnum.SIMPLETEXTSTREAMINGDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SIMPLETEXTSTREAMINGDATA;

	public static final String JSON_PROPERTY_CONTENT = "content";
	@JsonProperty(JSON_PROPERTY_CONTENT)
	private String content;

	public SimpleTextStreamingData $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(required = true, value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public SimpleTextStreamingData content(String content) {
		this.content = content;
		return this;
	}

	/**
	 * The full content of the message so far. It is stored as sent, except that content beyond the character limit set by
	 * &#x60;com.unblu.conversation.message.chatTextInputMaxLength&#x60; is truncated. Mandatory.
	 * 
	 * @return content
	 **/
	@ApiModelProperty(value = "The full content of the message so far. It is stored as sent, except that content beyond the character limit set by `com.unblu.conversation.message.chatTextInputMaxLength` is truncated. Mandatory.")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SimpleTextStreamingData simpleTextStreamingData = (SimpleTextStreamingData) o;
		return Objects.equals(this.$type, simpleTextStreamingData.$type) &&
				Objects.equals(this.content, simpleTextStreamingData.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, content);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SimpleTextStreamingData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
