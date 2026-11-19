
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
 * The result of finishing a streaming message
 */
@ApiModel(description = "The result of finishing a streaming message")

@JsonPropertyOrder({
	FinishStreamingMessageResult.JSON_PROPERTY_$_TYPE,
	FinishStreamingMessageResult.JSON_PROPERTY_MESSAGE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FinishStreamingMessageResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		FINISHSTREAMINGMESSAGERESULT("FinishStreamingMessageResult");

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
			return TypeEnum.FINISHSTREAMINGMESSAGERESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.FINISHSTREAMINGMESSAGERESULT;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public FinishStreamingMessageResult $type(TypeEnum $type) {
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

	public FinishStreamingMessageResult messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the stored message. It is the ID returned when the stream was started, and the message can be read under it from now on.
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the stored message. It is the ID returned when the stream was started, and the message can be read under it from now on.")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FinishStreamingMessageResult finishStreamingMessageResult = (FinishStreamingMessageResult) o;
		return Objects.equals(this.$type, finishStreamingMessageResult.$type) &&
				Objects.equals(this.messageId, finishStreamingMessageResult.messageId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, messageId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FinishStreamingMessageResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
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
