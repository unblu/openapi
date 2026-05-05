
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
 * Records the details and metadata of a message sent within a conversation. Each entry corresponds to a distinct message event.
 */
@ApiModel(description = "Records the details and metadata of a message sent within a conversation. Each entry corresponds to a distinct message event.")

@JsonPropertyOrder({
	MessagesAnalyticsKpiData.JSON_PROPERTY_$_TYPE,
	MessagesAnalyticsKpiData.JSON_PROPERTY_ID,
	MessagesAnalyticsKpiData.JSON_PROPERTY_EVENT_TIMESTAMP,
	MessagesAnalyticsKpiData.JSON_PROPERTY_SEND_TIMESTAMP,
	MessagesAnalyticsKpiData.JSON_PROPERTY_SERVER_TIMESTAMP,
	MessagesAnalyticsKpiData.JSON_PROPERTY_SENDER,
	MessagesAnalyticsKpiData.JSON_PROPERTY_MESSAGE_ID,
	MessagesAnalyticsKpiData.JSON_PROPERTY_CHARACTER_COUNT,
	MessagesAnalyticsKpiData.JSON_PROPERTY_TYPE,
	MessagesAnalyticsKpiData.JSON_PROPERTY_LOCALE,
	MessagesAnalyticsKpiData.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessagesAnalyticsKpiData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGESANALYTICSKPIDATA("MessagesAnalyticsKpiData");

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
			return TypeEnum.MESSAGESANALYTICSKPIDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGESANALYTICSKPIDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_EVENT_TIMESTAMP = "eventTimestamp";
	@JsonProperty(JSON_PROPERTY_EVENT_TIMESTAMP)
	private Long eventTimestamp;

	public static final String JSON_PROPERTY_SEND_TIMESTAMP = "sendTimestamp";
	@JsonProperty(JSON_PROPERTY_SEND_TIMESTAMP)
	private Long sendTimestamp;

	public static final String JSON_PROPERTY_SERVER_TIMESTAMP = "serverTimestamp";
	@JsonProperty(JSON_PROPERTY_SERVER_TIMESTAMP)
	private Long serverTimestamp;

	public static final String JSON_PROPERTY_SENDER = "sender";
	@JsonProperty(JSON_PROPERTY_SENDER)
	private PersonAnalyticsKpiData sender = null;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_CHARACTER_COUNT = "characterCount";
	@JsonProperty(JSON_PROPERTY_CHARACTER_COUNT)
	private Integer characterCount;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EMessageType type;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationAnalyticsKpiData conversation = null;

	public MessagesAnalyticsKpiData $type(TypeEnum $type) {
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

	public MessagesAnalyticsKpiData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The unique identifier of the data entry in the analytics KPI table
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The unique identifier of the data entry in the analytics KPI table")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public MessagesAnalyticsKpiData eventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) for the KPI entry. This is the timestamp used for filtering
	 * 
	 * @return eventTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) for the KPI entry. This is the timestamp used for filtering")
	public Long getEventTimestamp() {
		return eventTimestamp;
	}

	public void setEventTimestamp(Long eventTimestamp) {
		this.eventTimestamp = eventTimestamp;
	}

	public MessagesAnalyticsKpiData sendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the message was sent from the client.
	 * 
	 * @return sendTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the message was sent from the client.")
	public Long getSendTimestamp() {
		return sendTimestamp;
	}

	public void setSendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
	}

	public MessagesAnalyticsKpiData serverTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
		return this;
	}

	/**
	 * The UTC timestamp (ms) when the message was received on the server.
	 * 
	 * @return serverTimestamp
	 **/
	@ApiModelProperty(value = "The UTC timestamp (ms) when the message was received on the server.")
	public Long getServerTimestamp() {
		return serverTimestamp;
	}

	public void setServerTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public MessagesAnalyticsKpiData sender(PersonAnalyticsKpiData sender) {
		this.sender = sender;
		return this;
	}

	/**
	 * Get sender
	 * 
	 * @return sender
	 **/
	@ApiModelProperty(value = "")
	public PersonAnalyticsKpiData getSender() {
		return sender;
	}

	public void setSender(PersonAnalyticsKpiData sender) {
		this.sender = sender;
	}

	public MessagesAnalyticsKpiData messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The unique identifier of the message.
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The unique identifier of the message.")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public MessagesAnalyticsKpiData characterCount(Integer characterCount) {
		this.characterCount = characterCount;
		return this;
	}

	/**
	 * The number of characters in the message.
	 * 
	 * @return characterCount
	 **/
	@ApiModelProperty(value = "The number of characters in the message.")
	public Integer getCharacterCount() {
		return characterCount;
	}

	public void setCharacterCount(Integer characterCount) {
		this.characterCount = characterCount;
	}

	public MessagesAnalyticsKpiData type(EMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EMessageType getType() {
		return type;
	}

	public void setType(EMessageType type) {
		this.type = type;
	}

	public MessagesAnalyticsKpiData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * The message language as a locale representation. Null if not specified or not possible to detect automatically.
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "The message language as a locale representation. Null if not specified or not possible to detect automatically.")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public MessagesAnalyticsKpiData conversation(ConversationAnalyticsKpiData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationAnalyticsKpiData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationAnalyticsKpiData conversation) {
		this.conversation = conversation;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessagesAnalyticsKpiData messagesAnalyticsKpiData = (MessagesAnalyticsKpiData) o;
		return Objects.equals(this.$type, messagesAnalyticsKpiData.$type) &&
				Objects.equals(this.id, messagesAnalyticsKpiData.id) &&
				Objects.equals(this.eventTimestamp, messagesAnalyticsKpiData.eventTimestamp) &&
				Objects.equals(this.sendTimestamp, messagesAnalyticsKpiData.sendTimestamp) &&
				Objects.equals(this.serverTimestamp, messagesAnalyticsKpiData.serverTimestamp) &&
				Objects.equals(this.sender, messagesAnalyticsKpiData.sender) &&
				Objects.equals(this.messageId, messagesAnalyticsKpiData.messageId) &&
				Objects.equals(this.characterCount, messagesAnalyticsKpiData.characterCount) &&
				Objects.equals(this.type, messagesAnalyticsKpiData.type) &&
				Objects.equals(this.locale, messagesAnalyticsKpiData.locale) &&
				Objects.equals(this.conversation, messagesAnalyticsKpiData.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, eventTimestamp, sendTimestamp, serverTimestamp, sender, messageId, characterCount, type, locale, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessagesAnalyticsKpiData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
		sb.append("    sendTimestamp: ").append(toIndentedString(sendTimestamp)).append("\n");
		sb.append("    serverTimestamp: ").append(toIndentedString(serverTimestamp)).append("\n");
		sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    characterCount: ").append(toIndentedString(characterCount)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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
