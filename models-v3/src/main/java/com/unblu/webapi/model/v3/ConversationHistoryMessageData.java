
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
 * Chat message log entry
 */
@ApiModel(description = "Chat message log entry")

@JsonPropertyOrder({
	ConversationHistoryMessageData.JSON_PROPERTY_$_TYPE,
	ConversationHistoryMessageData.JSON_PROPERTY_ID,
	ConversationHistoryMessageData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationHistoryMessageData.JSON_PROPERTY_SEND_TIMESTAMP,
	ConversationHistoryMessageData.JSON_PROPERTY_SERVER_TIMESTAMP,
	ConversationHistoryMessageData.JSON_PROPERTY_SENDER_PERSON_ID,
	ConversationHistoryMessageData.JSON_PROPERTY_TYPE,
	ConversationHistoryMessageData.JSON_PROPERTY_INTERNAL,
	ConversationHistoryMessageData.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	ConversationHistoryMessageData.JSON_PROPERTY_BOT_THREAD_ID,
	ConversationHistoryMessageData.JSON_PROPERTY_REJECTION_SEVERITY,
	ConversationHistoryMessageData.JSON_PROPERTY_REJECTION_REASON,
	ConversationHistoryMessageData.JSON_PROPERTY_TEXT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationHistoryMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONHISTORYMESSAGEDATA("ConversationHistoryMessageData");

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
			return TypeEnum.CONVERSATIONHISTORYMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONHISTORYMESSAGEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_SEND_TIMESTAMP = "sendTimestamp";
	@JsonProperty(JSON_PROPERTY_SEND_TIMESTAMP)
	private Long sendTimestamp;

	public static final String JSON_PROPERTY_SERVER_TIMESTAMP = "serverTimestamp";
	@JsonProperty(JSON_PROPERTY_SERVER_TIMESTAMP)
	private Long serverTimestamp;

	public static final String JSON_PROPERTY_SENDER_PERSON_ID = "senderPersonId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_ID)
	private String senderPersonId;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EMessageType type;

	public static final String JSON_PROPERTY_INTERNAL = "internal";
	@JsonProperty(JSON_PROPERTY_INTERNAL)
	private Boolean internal;

	public static final String JSON_PROPERTY_RECIPIENT_PERSON_IDS = "recipientPersonIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_PERSON_IDS)
	private List<String> recipientPersonIds = null;

	public static final String JSON_PROPERTY_BOT_THREAD_ID = "botThreadId";
	@JsonProperty(JSON_PROPERTY_BOT_THREAD_ID)
	private String botThreadId;

	public static final String JSON_PROPERTY_REJECTION_SEVERITY = "rejectionSeverity";
	@JsonProperty(JSON_PROPERTY_REJECTION_SEVERITY)
	private ESentRejectionSeverity rejectionSeverity;

	public static final String JSON_PROPERTY_REJECTION_REASON = "rejectionReason";
	@JsonProperty(JSON_PROPERTY_REJECTION_REASON)
	private String rejectionReason;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public ConversationHistoryMessageData $type(TypeEnum $type) {
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

	public ConversationHistoryMessageData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the message.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the message.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationHistoryMessageData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * ID of the conversation to which this message belongs.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "ID of the conversation to which this message belongs.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationHistoryMessageData sendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
		return this;
	}

	/**
	 * UTC time stamp when the message was sent from the client.
	 * 
	 * @return sendTimestamp
	 **/
	@ApiModelProperty(value = "UTC time stamp when the message was sent from the client.")
	public Long getSendTimestamp() {
		return sendTimestamp;
	}

	public void setSendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
	}

	public ConversationHistoryMessageData serverTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
		return this;
	}

	/**
	 * UTC time stamp when the message was received on the Unblu server.
	 * 
	 * @return serverTimestamp
	 **/
	@ApiModelProperty(value = "UTC time stamp when the message was received on the Unblu server.")
	public Long getServerTimestamp() {
		return serverTimestamp;
	}

	public void setServerTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public ConversationHistoryMessageData senderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
		return this;
	}

	/**
	 * ID of the person that send the message. May be null for system messages.
	 * 
	 * @return senderPersonId
	 **/
	@ApiModelProperty(value = "ID of the person that send the message. May be null for system messages.")
	public String getSenderPersonId() {
		return senderPersonId;
	}

	public void setSenderPersonId(String senderPersonId) {
		this.senderPersonId = senderPersonId;
	}

	public ConversationHistoryMessageData type(EMessageType type) {
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

	public ConversationHistoryMessageData internal(Boolean internal) {
		this.internal = internal;
		return this;
	}

	/**
	 * Flag indicating whether the message is internal and only visible to agents. If &#39;false&#39;, the message is public and visible for everyone.
	 * 
	 * @return internal
	 **/
	@ApiModelProperty(value = "Flag indicating whether the message is internal and only visible to agents. If 'false', the message is public and visible for everyone.")
	public Boolean isInternal() {
		return internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

	public ConversationHistoryMessageData recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public ConversationHistoryMessageData addRecipientPersonIdsItem(String recipientPersonIdsItem) {
		if (this.recipientPersonIds == null) {
			this.recipientPersonIds = new ArrayList<>();
		}
		this.recipientPersonIds.add(recipientPersonIdsItem);
		return this;
	}

	/**
	 * IDs of persons that the message was addressed to. &lt;p&gt; If it is null, all active participations are regarded as recipients.
	 * 
	 * @return recipientPersonIds
	 **/
	@ApiModelProperty(value = "IDs of persons that the message was addressed to. <p> If it is null, all active participations are regarded as recipients.")
	public List<String> getRecipientPersonIds() {
		return recipientPersonIds;
	}

	public void setRecipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
	}

	public ConversationHistoryMessageData botThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
		return this;
	}

	/**
	 * ID of the bot thread the message is part of. Always null for messages outside bot threads.
	 * 
	 * @return botThreadId
	 **/
	@ApiModelProperty(value = "ID of the bot thread the message is part of. Always null for messages outside bot threads.")
	public String getBotThreadId() {
		return botThreadId;
	}

	public void setBotThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
	}

	public ConversationHistoryMessageData rejectionSeverity(ESentRejectionSeverity rejectionSeverity) {
		this.rejectionSeverity = rejectionSeverity;
		return this;
	}

	/**
	 * Get rejectionSeverity
	 * 
	 * @return rejectionSeverity
	 **/
	@ApiModelProperty(value = "")
	public ESentRejectionSeverity getRejectionSeverity() {
		return rejectionSeverity;
	}

	public void setRejectionSeverity(ESentRejectionSeverity rejectionSeverity) {
		this.rejectionSeverity = rejectionSeverity;
	}

	public ConversationHistoryMessageData rejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	/**
	 * The reason why a message was rejected. Null for messages that weren&#39;t rejected.
	 * 
	 * @return rejectionReason
	 **/
	@ApiModelProperty(value = "The reason why a message was rejected. Null for messages that weren't rejected.")
	public String getRejectionReason() {
		return rejectionReason;
	}

	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}

	public ConversationHistoryMessageData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Text representation of the message.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Text representation of the message.")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationHistoryMessageData conversationHistoryMessageData = (ConversationHistoryMessageData) o;
		return Objects.equals(this.$type, conversationHistoryMessageData.$type) &&
				Objects.equals(this.id, conversationHistoryMessageData.id) &&
				Objects.equals(this.conversationId, conversationHistoryMessageData.conversationId) &&
				Objects.equals(this.sendTimestamp, conversationHistoryMessageData.sendTimestamp) &&
				Objects.equals(this.serverTimestamp, conversationHistoryMessageData.serverTimestamp) &&
				Objects.equals(this.senderPersonId, conversationHistoryMessageData.senderPersonId) &&
				Objects.equals(this.type, conversationHistoryMessageData.type) &&
				Objects.equals(this.internal, conversationHistoryMessageData.internal) &&
				Objects.equals(this.recipientPersonIds, conversationHistoryMessageData.recipientPersonIds) &&
				Objects.equals(this.botThreadId, conversationHistoryMessageData.botThreadId) &&
				Objects.equals(this.rejectionSeverity, conversationHistoryMessageData.rejectionSeverity) &&
				Objects.equals(this.rejectionReason, conversationHistoryMessageData.rejectionReason) &&
				Objects.equals(this.text, conversationHistoryMessageData.text);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationId, sendTimestamp, serverTimestamp, senderPersonId, type, internal, recipientPersonIds, botThreadId, rejectionSeverity, rejectionReason, text);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationHistoryMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    sendTimestamp: ").append(toIndentedString(sendTimestamp)).append("\n");
		sb.append("    serverTimestamp: ").append(toIndentedString(serverTimestamp)).append("\n");
		sb.append("    senderPersonId: ").append(toIndentedString(senderPersonId)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
		sb.append("    recipientPersonIds: ").append(toIndentedString(recipientPersonIds)).append("\n");
		sb.append("    botThreadId: ").append(toIndentedString(botThreadId)).append("\n");
		sb.append("    rejectionSeverity: ").append(toIndentedString(rejectionSeverity)).append("\n");
		sb.append("    rejectionReason: ").append(toIndentedString(rejectionReason)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
