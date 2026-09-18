
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
 * An edit of a message a bot sent earlier. &lt;p&gt; A bot can only edit its own messages: the message must have been sent by the given bot person.
 */
@ApiModel(description = "An edit of a message a bot sent earlier. <p> A bot can only edit its own messages: the message must have been sent by the given bot person.")

@JsonPropertyOrder({
	BotEditMessage.JSON_PROPERTY_$_TYPE,
	BotEditMessage.JSON_PROPERTY_CONVERSATION_ID,
	BotEditMessage.JSON_PROPERTY_SENDER_PERSON_ID,
	BotEditMessage.JSON_PROPERTY_MESSAGE_ID,
	BotEditMessage.JSON_PROPERTY_EDIT_MESSAGE_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotEditMessage {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTEDITMESSAGE("BotEditMessage");

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
			return TypeEnum.BOTEDITMESSAGE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTEDITMESSAGE;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_SENDER_PERSON_ID = "senderPersonId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_ID)
	private String senderPersonId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_EDIT_MESSAGE_DATA = "editMessageData";
	@JsonProperty(JSON_PROPERTY_EDIT_MESSAGE_DATA)
	private EditMessageData editMessageData = null;

	public BotEditMessage $type(TypeEnum $type) {
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

	public BotEditMessage conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the message belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public BotEditMessage senderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
		return this;
	}

	/**
	 * ID of the bot person that sent the message
	 * 
	 * @return senderPersonId
	 **/
	@ApiModelProperty(value = "ID of the bot person that sent the message")
	public String getSenderPersonId() {
		return senderPersonId;
	}

	public void setSenderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
	}

	public BotEditMessage messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the message to edit
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the message to edit")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotEditMessage editMessageData(EditMessageData editMessageData) {
		this.editMessageData = editMessageData;
		return this;
	}

	/**
	 * Get editMessageData
	 * 
	 * @return editMessageData
	 **/
	@ApiModelProperty(value = "")
	public EditMessageData getEditMessageData() {
		return editMessageData;
	}

	public void setEditMessageData(EditMessageData editMessageData) {
		this.editMessageData = editMessageData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotEditMessage botEditMessage = (BotEditMessage) o;
		return Objects.equals(this.$type, botEditMessage.$type) &&
				Objects.equals(this.conversationId, botEditMessage.conversationId) &&
				Objects.equals(this.senderPersonId, botEditMessage.senderPersonId) &&
				Objects.equals(this.messageId, botEditMessage.messageId) &&
				Objects.equals(this.editMessageData, botEditMessage.editMessageData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, conversationId, senderPersonId, messageId, editMessageData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotEditMessage {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    senderPersonId: ").append(toIndentedString(senderPersonId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    editMessageData: ").append(toIndentedString(editMessageData)).append("\n");
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
