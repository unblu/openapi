
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationRecordingsGetRecordingState&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationRecordingsGetRecordingState' operation")

@JsonPropertyOrder({
	ConversationRecordingsGetRecordingStateBody.JSON_PROPERTY_CONVERSATION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationRecordingsGetRecordingStateBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public ConversationRecordingsGetRecordingStateBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The conversation to return the recording state for
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The conversation to return the recording state for")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationRecordingsGetRecordingStateBody conversationRecordingsGetRecordingStateBody = (ConversationRecordingsGetRecordingStateBody) o;
		return Objects.equals(this.conversationId, conversationRecordingsGetRecordingStateBody.conversationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationRecordingsGetRecordingStateBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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
