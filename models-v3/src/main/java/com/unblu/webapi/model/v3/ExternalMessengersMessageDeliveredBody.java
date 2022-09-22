
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;externalMessengersMessageDelivered&#39; operation
 */
@ApiModel(description = "Request Body for the 'externalMessengersMessageDelivered' operation")

@JsonPropertyOrder({
	ExternalMessengersMessageDeliveredBody.JSON_PROPERTY_CONVERSATION_ID,
	ExternalMessengersMessageDeliveredBody.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ExternalMessengersMessageDeliveredBody.JSON_PROPERTY_MESSAGE_ID,
	ExternalMessengersMessageDeliveredBody.JSON_PROPERTY_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengersMessageDeliveredBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public ExternalMessengersMessageDeliveredBody conversationId(String conversationId) {
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

	public ExternalMessengersMessageDeliveredBody externalMessengerChannelId(String externalMessengerChannelId) {
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

	public ExternalMessengersMessageDeliveredBody messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The id of the message from the conversation, which should be marked as delivered
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The id of the message from the conversation, which should be marked as delivered")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public ExternalMessengersMessageDeliveredBody personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The id of the person who received the message. If null, it will be assumed that the message has been delivered to all persons which are connected via the
	 * external messenger.
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The id of the person who received the message. If null, it will be assumed that the message has been delivered to all persons which are connected via the external messenger.")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengersMessageDeliveredBody externalMessengersMessageDeliveredBody = (ExternalMessengersMessageDeliveredBody) o;
		return Objects.equals(this.conversationId, externalMessengersMessageDeliveredBody.conversationId) &&
				Objects.equals(this.externalMessengerChannelId, externalMessengersMessageDeliveredBody.externalMessengerChannelId) &&
				Objects.equals(this.messageId, externalMessengersMessageDeliveredBody.messageId) &&
				Objects.equals(this.personId, externalMessengersMessageDeliveredBody.personId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, externalMessengerChannelId, messageId, personId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengersMessageDeliveredBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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
