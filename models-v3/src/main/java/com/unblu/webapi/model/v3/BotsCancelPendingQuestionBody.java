
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;botsCancelPendingQuestion&#39; operation
 */
@ApiModel(description = "Request Body for the 'botsCancelPendingQuestion' operation")

@JsonPropertyOrder({
	BotsCancelPendingQuestionBody.JSON_PROPERTY_CONVERSATION_ID,
	BotsCancelPendingQuestionBody.JSON_PROPERTY_QUESTION_MESSAGE_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotsCancelPendingQuestionBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_QUESTION_MESSAGE_ID = "questionMessageId";
	@JsonProperty(JSON_PROPERTY_QUESTION_MESSAGE_ID)
	private String questionMessageId;

	public BotsCancelPendingQuestionBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the question message was sent to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the question message was sent to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public BotsCancelPendingQuestionBody questionMessageId(String questionMessageId) {
		this.questionMessageId = questionMessageId;
		return this;
	}

	/**
	 * The ID of the question message that will be canceled
	 * 
	 * @return questionMessageId
	 **/
	@ApiModelProperty(value = "The ID of the question message that will be canceled")
	public String getQuestionMessageId() {
		return questionMessageId;
	}

	public void setQuestionMessageId(String questionMessageId) {
		this.questionMessageId = questionMessageId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotsCancelPendingQuestionBody botsCancelPendingQuestionBody = (BotsCancelPendingQuestionBody) o;
		return Objects.equals(this.conversationId, botsCancelPendingQuestionBody.conversationId) &&
				Objects.equals(this.questionMessageId, botsCancelPendingQuestionBody.questionMessageId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, questionMessageId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotsCancelPendingQuestionBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    questionMessageId: ").append(toIndentedString(questionMessageId)).append("\n");
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
