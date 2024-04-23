
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;externalMessengersMessageSendFailed&#39; operation
 */
@ApiModel(description = "Request body for the 'externalMessengersMessageSendFailed' operation")

@JsonPropertyOrder({
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_CONVERSATION_ID,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_MESSAGE_ID,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_FAIL_STATE,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_FAILURE_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengersMessageSendFailedBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_FAIL_STATE = "failState";
	@JsonProperty(JSON_PROPERTY_FAIL_STATE)
	private ESendFailState failState;

	public static final String JSON_PROPERTY_FAILURE_TEXT = "failureText";
	@JsonProperty(JSON_PROPERTY_FAILURE_TEXT)
	private String failureText;

	public ExternalMessengersMessageSendFailedBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ExternalMessengersMessageSendFailedBody messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the message from the conversation, which should be set to the failed state
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the message from the conversation, which should be set to the failed state")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public ExternalMessengersMessageSendFailedBody failState(ESendFailState failState) {
		this.failState = failState;
		return this;
	}

	/**
	 * Get failState
	 * 
	 * @return failState
	 **/
	@ApiModelProperty(value = "")
	public ESendFailState getFailState() {
		return failState;
	}

	public void setFailState(ESendFailState failState) {
		this.failState = failState;
	}

	public ExternalMessengersMessageSendFailedBody failureText(String failureText) {
		this.failureText = failureText;
		return this;
	}

	/**
	 * A text that describes why the message couldn&#39;t be sent to the external messenger. The text is displayed to the user.
	 * 
	 * @return failureText
	 **/
	@ApiModelProperty(value = "A text that describes why the message couldn't be sent to the external messenger. The text is displayed to the user.")
	public String getFailureText() {
		return failureText;
	}

	public void setFailureText(String failureText) {
		this.failureText = failureText;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengersMessageSendFailedBody externalMessengersMessageSendFailedBody = (ExternalMessengersMessageSendFailedBody) o;
		return Objects.equals(this.conversationId, externalMessengersMessageSendFailedBody.conversationId) &&
				Objects.equals(this.messageId, externalMessengersMessageSendFailedBody.messageId) &&
				Objects.equals(this.failState, externalMessengersMessageSendFailedBody.failState) &&
				Objects.equals(this.failureText, externalMessengersMessageSendFailedBody.failureText);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, messageId, failState, failureText);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengersMessageSendFailedBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    failState: ").append(toIndentedString(failState)).append("\n");
		sb.append("    failureText: ").append(toIndentedString(failureText)).append("\n");
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
