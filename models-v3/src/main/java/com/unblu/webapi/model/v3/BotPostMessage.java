
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
 * A message send from a bot to the collaboration server
 */
@ApiModel(description = "A message send from a bot to the collaboration server")

@JsonPropertyOrder({
	BotPostMessage.JSON_PROPERTY_$_TYPE,
	BotPostMessage.JSON_PROPERTY_CONVERSATION_ID,
	BotPostMessage.JSON_PROPERTY_SENDER_PERSON_ID,
	BotPostMessage.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	BotPostMessage.JSON_PROPERTY_MESSAGE_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotPostMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTPOSTMESSAGE("BotPostMessage");

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
			return TypeEnum.BOTPOSTMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTPOSTMESSAGE;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_SENDER_PERSON_ID = "senderPersonId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_ID)
	private String senderPersonId;

	public static final String JSON_PROPERTY_RECIPIENT_PERSON_IDS = "recipientPersonIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_PERSON_IDS)
	private List<String> recipientPersonIds = null;

	public static final String JSON_PROPERTY_MESSAGE_DATA = "messageData";
	@JsonProperty(JSON_PROPERTY_MESSAGE_DATA)
	private PostMessageData messageData = null;

	public BotPostMessage $type(TypeEnum $type) {
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

	public BotPostMessage conversationId(String conversationId) {
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

	public BotPostMessage senderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
		return this;
	}

	/**
	 * ID of the bot person that sent the message.
	 * 
	 * @return senderPersonId
	 **/
	@ApiModelProperty(value = "ID of the bot person that sent the message.")
	public String getSenderPersonId() {
		return senderPersonId;
	}

	public void setSenderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
	}

	public BotPostMessage recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public BotPostMessage addRecipientPersonIdsItem(String recipientPersonIdsItem) {
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

	public BotPostMessage messageData(PostMessageData messageData) {
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
		BotPostMessage botPostMessage = (BotPostMessage) o;
		return Objects.equals(this.$type, botPostMessage.$type) &&
				Objects.equals(this.conversationId, botPostMessage.conversationId) &&
				Objects.equals(this.senderPersonId, botPostMessage.senderPersonId) &&
				Objects.equals(this.recipientPersonIds, botPostMessage.recipientPersonIds) &&
				Objects.equals(this.messageData, botPostMessage.messageData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, senderPersonId, recipientPersonIds, messageData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotPostMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    senderPersonId: ").append(toIndentedString(senderPersonId)).append("\n");
		sb.append("    recipientPersonIds: ").append(toIndentedString(recipientPersonIds)).append("\n");
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
