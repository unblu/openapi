
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;externalMessengersMessageRead&#39; operation
 */
@ApiModel(description = "Request body for the 'externalMessengersMessageRead' operation")

@JsonPropertyOrder({
	ExternalMessengersMessageReadBody.JSON_PROPERTY_CONVERSATION_ID,
	ExternalMessengersMessageReadBody.JSON_PROPERTY_MESSAGE_ID,
	ExternalMessengersMessageReadBody.JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengersMessageReadBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID = "externalMessengerContactId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID)
	private String externalMessengerContactId;

	public ExternalMessengersMessageReadBody conversationId(String conversationId) {
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

	public ExternalMessengersMessageReadBody messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the message that should be marked as read in the conversation
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the message that should be marked as read in the conversation")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public ExternalMessengersMessageReadBody externalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
		return this;
	}

	/**
	 * The ID of the &#x60;ExternalMessengerContact&#x60; who read the message. If null, it&#39;s assumed that the message has been read by everyone connected
	 * through the external messenger.
	 * 
	 * @return externalMessengerContactId
	 **/
	@ApiModelProperty(value = "The ID of the  `ExternalMessengerContact`  who read the message. If null, it's assumed that the message has been read by everyone connected through the external messenger.")
	public String getExternalMessengerContactId() {
		return externalMessengerContactId;
	}

	public void setExternalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengersMessageReadBody externalMessengersMessageReadBody = (ExternalMessengersMessageReadBody) o;
		return Objects.equals(this.conversationId, externalMessengersMessageReadBody.conversationId) &&
				Objects.equals(this.messageId, externalMessengersMessageReadBody.messageId) &&
				Objects.equals(this.externalMessengerContactId, externalMessengersMessageReadBody.externalMessengerContactId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, messageId, externalMessengerContactId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengersMessageReadBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    externalMessengerContactId: ").append(toIndentedString(externalMessengerContactId)).append("\n");
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
