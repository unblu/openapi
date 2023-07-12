
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConversationRecordingState
 */

@JsonPropertyOrder({
	ConversationRecordingState.JSON_PROPERTY_$_TYPE,
	ConversationRecordingState.JSON_PROPERTY_CONVERSATION_ID,
	ConversationRecordingState.JSON_PROPERTY_RECORDING_STATE,
	ConversationRecordingState.JSON_PROPERTY_RECORDING_TYPE,
	ConversationRecordingState.JSON_PROPERTY_RECORDING_START_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingState {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONRECORDINGSTATE("ConversationRecordingState");

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
			return TypeEnum.CONVERSATIONRECORDINGSTATE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONRECORDINGSTATE;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_RECORDING_STATE = "recordingState";
	@JsonProperty(JSON_PROPERTY_RECORDING_STATE)
	private EConversationRecordingState recordingState;

	public static final String JSON_PROPERTY_RECORDING_TYPE = "recordingType";
	@JsonProperty(JSON_PROPERTY_RECORDING_TYPE)
	private ERecordingType recordingType;

	public static final String JSON_PROPERTY_RECORDING_START_TIMESTAMP = "recordingStartTimestamp";
	@JsonProperty(JSON_PROPERTY_RECORDING_START_TIMESTAMP)
	private Long recordingStartTimestamp;

	public ConversationRecordingState $type(TypeEnum $type) {
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

	public ConversationRecordingState conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation this recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation this recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationRecordingState recordingState(EConversationRecordingState recordingState) {
		this.recordingState = recordingState;
		return this;
	}

	/**
	 * Get recordingState
	 * 
	 * @return recordingState
	 **/
	@ApiModelProperty(value = "")
	public EConversationRecordingState getRecordingState() {
		return recordingState;
	}

	public void setRecordingState(EConversationRecordingState recordingState) {
		this.recordingState = recordingState;
	}

	public ConversationRecordingState recordingType(ERecordingType recordingType) {
		this.recordingType = recordingType;
		return this;
	}

	/**
	 * Get recordingType
	 * 
	 * @return recordingType
	 **/
	@ApiModelProperty(value = "")
	public ERecordingType getRecordingType() {
		return recordingType;
	}

	public void setRecordingType(ERecordingType recordingType) {
		this.recordingType = recordingType;
	}

	public ConversationRecordingState recordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation recording has started
	 * 
	 * @return recordingStartTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation recording has started")
	public Long getRecordingStartTimestamp() {
		return recordingStartTimestamp;
	}

	public void setRecordingStartTimestamp(Long recordingStartTimestamp) {
		this.recordingStartTimestamp = recordingStartTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationRecordingState conversationRecordingState = (ConversationRecordingState) o;
		return Objects.equals(this.$type, conversationRecordingState.$type) &&
				Objects.equals(this.conversationId, conversationRecordingState.conversationId) &&
				Objects.equals(this.recordingState, conversationRecordingState.recordingState) &&
				Objects.equals(this.recordingType, conversationRecordingState.recordingType) &&
				Objects.equals(this.recordingStartTimestamp, conversationRecordingState.recordingStartTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, recordingState, recordingType, recordingStartTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingState {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    recordingState: ").append(toIndentedString(recordingState)).append("\n");
		sb.append("    recordingType: ").append(toIndentedString(recordingType)).append("\n");
		sb.append("    recordingStartTimestamp: ").append(toIndentedString(recordingStartTimestamp)).append("\n");
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
