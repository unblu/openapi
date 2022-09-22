
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;externalMessengersMessageSendFailed&#39; operation
 */
@ApiModel(description = "Request Body for the 'externalMessengersMessageSendFailed' operation")

@JsonPropertyOrder({
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_CONVERSATION_ID,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_MESSAGE_ID,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_FAILED_STATE,
	ExternalMessengersMessageSendFailedBody.JSON_PROPERTY_FAILURE_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengersMessageSendFailedBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_FAILED_STATE = "failedState";
	@JsonProperty(JSON_PROPERTY_FAILED_STATE)
	private ESendFailState failedState;

	public static final String JSON_PROPERTY_FAILURE_TEXT = "failureText";
	@JsonProperty(JSON_PROPERTY_FAILURE_TEXT)
	private String failureText;

	public ExternalMessengersMessageSendFailedBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The id of the conversation
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The id of the conversation")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ExternalMessengersMessageSendFailedBody externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * The id of the custom external messenger channel
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "The id of the custom external messenger channel")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public ExternalMessengersMessageSendFailedBody messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The id of the message from the conversation, which should be set to the failed state
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The id of the message from the conversation, which should be set to the failed state")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public ExternalMessengersMessageSendFailedBody failedState(ESendFailState failedState) {
		this.failedState = failedState;
		return this;
	}

	/**
	 * Get failedState
	 * 
	 * @return failedState
	 **/
	@ApiModelProperty(value = "")
	public ESendFailState getFailedState() {
		return failedState;
	}

	public void setFailedState(ESendFailState failedState) {
		this.failedState = failedState;
	}

	public ExternalMessengersMessageSendFailedBody failureText(String failureText) {
		this.failureText = failureText;
		return this;
	}

	/**
	 * A text which describes why a message could not be sent to the external messenger. This text will be displayed to the user in the UI of the message
	 * 
	 * @return failureText
	 **/
	@ApiModelProperty(value = "A text which describes why a message could not be sent to the external messenger. This text will be displayed to the user in the UI of the message")
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
				Objects.equals(this.externalMessengerChannelId, externalMessengersMessageSendFailedBody.externalMessengerChannelId) &&
				Objects.equals(this.messageId, externalMessengersMessageSendFailedBody.messageId) &&
				Objects.equals(this.failedState, externalMessengersMessageSendFailedBody.failedState) &&
				Objects.equals(this.failureText, externalMessengersMessageSendFailedBody.failureText);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, externalMessengerChannelId, messageId, failedState, failureText);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengersMessageSendFailedBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    failedState: ").append(toIndentedString(failedState)).append("\n");
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
