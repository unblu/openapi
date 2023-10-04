
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
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
 * Message from external messenger send to the collaboration server
 */
@ApiModel(description = "Message from external messenger send to the collaboration server")

@JsonPropertyOrder({
	ExternalMessengerPostMessage.JSON_PROPERTY_$_TYPE,
	ExternalMessengerPostMessage.JSON_PROPERTY_CONVERSATION_ID,
	ExternalMessengerPostMessage.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ExternalMessengerPostMessage.JSON_PROPERTY_SENDER_PERSON_ID,
	ExternalMessengerPostMessage.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	ExternalMessengerPostMessage.JSON_PROPERTY_SOURCE_ID,
	ExternalMessengerPostMessage.JSON_PROPERTY_REPLY_TO_MESSAGE_ID,
	ExternalMessengerPostMessage.JSON_PROPERTY_MESSAGE_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerPostMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERPOSTMESSAGE("ExternalMessengerPostMessage");

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
			return TypeEnum.EXTERNALMESSENGERPOSTMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERPOSTMESSAGE;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_SENDER_PERSON_ID = "senderPersonId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_ID)
	private String senderPersonId;

	public static final String JSON_PROPERTY_RECIPIENT_PERSON_IDS = "recipientPersonIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_PERSON_IDS)
	private List<String> recipientPersonIds = null;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_REPLY_TO_MESSAGE_ID = "replyToMessageId";
	@JsonProperty(JSON_PROPERTY_REPLY_TO_MESSAGE_ID)
	private String replyToMessageId;

	public static final String JSON_PROPERTY_MESSAGE_DATA = "messageData";
	@JsonProperty(JSON_PROPERTY_MESSAGE_DATA)
	private PostMessageData messageData = null;

	public ExternalMessengerPostMessage $type(TypeEnum $type) {
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

	public ExternalMessengerPostMessage conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The id of the conversation to which this message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The id of the conversation to which this message belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ExternalMessengerPostMessage externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * The id of the external messenger channel this message belongs to
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "The id of the external messenger channel this message belongs to")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public ExternalMessengerPostMessage senderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
		return this;
	}

	/**
	 * ID of the person that sent the message.
	 * 
	 * @return senderPersonId
	 **/
	@ApiModelProperty(value = "ID of the person that sent the message.")
	public String getSenderPersonId() {
		return senderPersonId;
	}

	public void setSenderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
	}

	public ExternalMessengerPostMessage recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public ExternalMessengerPostMessage addRecipientPersonIdsItem(String recipientPersonIdsItem) {
		if (this.recipientPersonIds == null) {
			this.recipientPersonIds = new ArrayList<>();
		}
		this.recipientPersonIds.add(recipientPersonIdsItem);
		return this;
	}

	/**
	 * Person IDs of the recipients of the message. If it is null, all active participations are recipients
	 * 
	 * @return recipientPersonIds
	 **/
	@ApiModelProperty(value = "Person IDs of the recipients of the message. If it is null, all active participations are recipients")
	public List<String> getRecipientPersonIds() {
		return recipientPersonIds;
	}

	public void setRecipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
	}

	public ExternalMessengerPostMessage sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * An id identifying the source of the external message. Typically the id of the message in the other messaging system
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "An id identifying the source of the external message. Typically the id of the message in the other messaging system")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ExternalMessengerPostMessage replyToMessageId(String replyToMessageId) {
		this.replyToMessageId = replyToMessageId;
		return this;
	}

	/**
	 * Optional ID that identifies the message that this message is replying to
	 * 
	 * @return replyToMessageId
	 **/
	@ApiModelProperty(value = "Optional ID that identifies the message that this message is replying to")
	public String getReplyToMessageId() {
		return replyToMessageId;
	}

	public void setReplyToMessageId(String replyToMessageId) {
		this.replyToMessageId = replyToMessageId;
	}

	public ExternalMessengerPostMessage messageData(PostMessageData messageData) {
		this.messageData = messageData;
		return this;
	}

	/**
	 * Get messageData
	 * 
	 * @return messageData
	 **/
	@ApiModelProperty(value = "")
	public PostMessageData getMessageData() {
		return messageData;
	}

	public void setMessageData(PostMessageData messageData) {
		this.messageData = messageData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerPostMessage externalMessengerPostMessage = (ExternalMessengerPostMessage) o;
		return Objects.equals(this.$type, externalMessengerPostMessage.$type) &&
				Objects.equals(this.conversationId, externalMessengerPostMessage.conversationId) &&
				Objects.equals(this.externalMessengerChannelId, externalMessengerPostMessage.externalMessengerChannelId) &&
				Objects.equals(this.senderPersonId, externalMessengerPostMessage.senderPersonId) &&
				Objects.equals(this.recipientPersonIds, externalMessengerPostMessage.recipientPersonIds) &&
				Objects.equals(this.sourceId, externalMessengerPostMessage.sourceId) &&
				Objects.equals(this.replyToMessageId, externalMessengerPostMessage.replyToMessageId) &&
				Objects.equals(this.messageData, externalMessengerPostMessage.messageData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, externalMessengerChannelId, senderPersonId, recipientPersonIds, sourceId, replyToMessageId, messageData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerPostMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    senderPersonId: ").append(toIndentedString(senderPersonId)).append("\n");
		sb.append("    recipientPersonIds: ").append(toIndentedString(recipientPersonIds)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    replyToMessageId: ").append(toIndentedString(replyToMessageId)).append("\n");
		sb.append("    messageData: ").append(toIndentedString(messageData)).append("\n");
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
