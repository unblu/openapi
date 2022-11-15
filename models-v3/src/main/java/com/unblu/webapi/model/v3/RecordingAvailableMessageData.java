
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
 * Recording available message which contains the blob store ID, blob size, filename, start time and end time
 */
@ApiModel(description = "Recording available message which contains the blob store ID, blob size, filename, start time and end time")

@JsonPropertyOrder({
	RecordingAvailableMessageData.JSON_PROPERTY_$_TYPE,
	RecordingAvailableMessageData.JSON_PROPERTY_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_CONVERSATION_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_ACCOUNT_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_SENDER_PERSON,
	RecordingAvailableMessageData.JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_SERVER_TIMESTAMP,
	RecordingAvailableMessageData.JSON_PROPERTY_SEND_TIMESTAMP,
	RecordingAvailableMessageData.JSON_PROPERTY_TYPE,
	RecordingAvailableMessageData.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	RecordingAvailableMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	RecordingAvailableMessageData.JSON_PROPERTY_ACTION_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_SOURCE_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_BOT_THREAD_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_INTERNAL,
	RecordingAvailableMessageData.JSON_PROPERTY_BLOB_ID,
	RecordingAvailableMessageData.JSON_PROPERTY_BLOB_SIZE,
	RecordingAvailableMessageData.JSON_PROPERTY_FILE_NAME,
	RecordingAvailableMessageData.JSON_PROPERTY_START_TIMESTAMP,
	RecordingAvailableMessageData.JSON_PROPERTY_END_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RecordingAvailableMessageData implements MessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		RECORDINGAVAILABLEMESSAGEDATA("RecordingAvailableMessageData");

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
			return TypeEnum.RECORDINGAVAILABLEMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.RECORDINGAVAILABLEMESSAGEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SENDER_PERSON = "senderPerson";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON)
	private PersonData senderPerson = null;

	public static final String JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID = "senderPersonPresenceId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID)
	private String senderPersonPresenceId;

	public static final String JSON_PROPERTY_SERVER_TIMESTAMP = "serverTimestamp";
	@JsonProperty(JSON_PROPERTY_SERVER_TIMESTAMP)
	private Long serverTimestamp;

	public static final String JSON_PROPERTY_SEND_TIMESTAMP = "sendTimestamp";
	@JsonProperty(JSON_PROPERTY_SEND_TIMESTAMP)
	private Long sendTimestamp;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EMessageType type = EMessageType.RECORDING_AVAILABLE;

	public static final String JSON_PROPERTY_RECIPIENT_PERSON_IDS = "recipientPersonIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_PERSON_IDS)
	private List<String> recipientPersonIds = null;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_ACTION_ID = "actionId";
	@JsonProperty(JSON_PROPERTY_ACTION_ID)
	private String actionId;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_BOT_THREAD_ID = "botThreadId";
	@JsonProperty(JSON_PROPERTY_BOT_THREAD_ID)
	private String botThreadId;

	public static final String JSON_PROPERTY_INTERNAL = "internal";
	@JsonProperty(JSON_PROPERTY_INTERNAL)
	private Boolean internal;

	public static final String JSON_PROPERTY_BLOB_ID = "blobId";
	@JsonProperty(JSON_PROPERTY_BLOB_ID)
	private String blobId;

	public static final String JSON_PROPERTY_BLOB_SIZE = "blobSize";
	@JsonProperty(JSON_PROPERTY_BLOB_SIZE)
	private Long blobSize;

	public static final String JSON_PROPERTY_FILE_NAME = "fileName";
	@JsonProperty(JSON_PROPERTY_FILE_NAME)
	private String fileName;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public RecordingAvailableMessageData $type(TypeEnum $type) {
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

	public RecordingAvailableMessageData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID of the message&lt;br&gt;
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The ID of the message<br>")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public RecordingAvailableMessageData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation ID this message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation ID this message belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public RecordingAvailableMessageData externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * ID of the external messenger channel connected to the conversation. Null if the conversation is not connected to an external messenger.
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "ID of the external messenger channel connected to the conversation. Null if the conversation is not connected to an external messenger.")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public RecordingAvailableMessageData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account this message and conversation belong to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account this message and conversation belong to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public RecordingAvailableMessageData senderPerson(PersonData senderPerson) {
		this.senderPerson = senderPerson;
		return this;
	}

	/**
	 * Get senderPerson
	 * 
	 * @return senderPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getSenderPerson() {
		return senderPerson;
	}

	public void setSenderPerson(PersonData senderPerson) {
		this.senderPerson = senderPerson;
	}

	public RecordingAvailableMessageData senderPersonPresenceId(String senderPersonPresenceId) {
		this.senderPersonPresenceId = senderPersonPresenceId;
		return this;
	}

	/**
	 * ID of the person presence who sent the message. &lt;p&gt; May be null if the message was sent by the system.
	 * 
	 * @return senderPersonPresenceId
	 **/
	@ApiModelProperty(value = "ID of the person presence who sent the message. <p> May be null if the message was sent by the system.")
	public String getSenderPersonPresenceId() {
		return senderPersonPresenceId;
	}

	public void setSenderPersonPresenceId(String senderPersonPresenceId) {
		this.senderPersonPresenceId = senderPersonPresenceId;
	}

	public RecordingAvailableMessageData serverTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the message was received by the server&lt;br&gt; Empty when sending a new message to the collaboration server
	 * 
	 * @return serverTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the message was received by the server<br> Empty when sending a new message to the collaboration server")
	public Long getServerTimestamp() {
		return serverTimestamp;
	}

	public void setServerTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public RecordingAvailableMessageData sendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the message was sent by the client.&lt;br&gt; Empty when sending a new message to the collaboration server
	 * 
	 * @return sendTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the message was sent by the client.<br> Empty when sending a new message to the collaboration server")
	public Long getSendTimestamp() {
		return sendTimestamp;
	}

	public void setSendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
	}

	public RecordingAvailableMessageData type(EMessageType type) {
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

	public RecordingAvailableMessageData recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public RecordingAvailableMessageData addRecipientPersonIdsItem(String recipientPersonIdsItem) {
		if (this.recipientPersonIds == null) {
			this.recipientPersonIds = new ArrayList<>();
		}
		this.recipientPersonIds.add(recipientPersonIdsItem);
		return this;
	}

	/**
	 * Person IDs of the recipients of the message. If null, all active participations are recipients.
	 * 
	 * @return recipientPersonIds
	 **/
	@ApiModelProperty(value = "Person IDs of the recipients of the message. If null, all active participations are recipients.")
	public List<String> getRecipientPersonIds() {
		return recipientPersonIds;
	}

	public void setRecipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
	}

	public RecordingAvailableMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Text representation of the message which is used in following cases: &lt;ul&gt; &lt;li&gt;Unblu cannot restore the complex content of the message
	 * anymore&lt;/li&gt; &lt;li&gt;Push notifications&lt;/li&gt; &lt;li&gt;For the last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The text
	 * doesn&#39;t contain markdown.&lt;br&gt; The fallback text can be provided by the sender (bot, external messenger) or is generated when missing. It may,
	 * however, not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Text representation of the message which is used in following cases: <ul> <li>Unblu cannot restore the complex content of the message anymore</li> <li>Push notifications</li> <li>For the last message in the conversation overview</li> </ul> The text doesn't contain markdown.<br> The fallback text can be provided by the sender (bot, external messenger) or is generated when missing. It may, however, not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public RecordingAvailableMessageData actionId(String actionId) {
		this.actionId = actionId;
		return this;
	}

	/**
	 * An ID of the action triggering the message to be able to identify a message created by an action
	 * 
	 * @return actionId
	 **/
	@ApiModelProperty(value = "An ID of the action triggering the message to be able to identify a message created by an action")
	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public RecordingAvailableMessageData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * A custom ID which identifies where this message initially came from
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "A custom ID which identifies where this message initially came from")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public RecordingAvailableMessageData botThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
		return this;
	}

	/**
	 * An ID which identifies the bot thread this message belongs. Null if the message is not part of a bot thread.
	 * 
	 * @return botThreadId
	 **/
	@ApiModelProperty(value = "An ID which identifies the bot thread this message belongs. Null if the message is not part of a bot thread.")
	public String getBotThreadId() {
		return botThreadId;
	}

	public void setBotThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
	}

	public RecordingAvailableMessageData internal(Boolean internal) {
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

	public RecordingAvailableMessageData blobId(String blobId) {
		this.blobId = blobId;
		return this;
	}

	/**
	 * The blob store ID of the recording
	 * 
	 * @return blobId
	 **/
	@ApiModelProperty(value = "The blob store ID of the recording")
	public String getBlobId() {
		return blobId;
	}

	public void setBlobId(String blobId) {
		this.blobId = blobId;
	}

	public RecordingAvailableMessageData blobSize(Long blobSize) {
		this.blobSize = blobSize;
		return this;
	}

	/**
	 * The total size, in bytes, of this recording
	 * 
	 * @return blobSize
	 **/
	@ApiModelProperty(value = "The total size, in bytes, of this recording")
	public Long getBlobSize() {
		return blobSize;
	}

	public void setBlobSize(Long blobSize) {
		this.blobSize = blobSize;
	}

	public RecordingAvailableMessageData fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * The filename of this recording
	 * 
	 * @return fileName
	 **/
	@ApiModelProperty(value = "The filename of this recording")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public RecordingAvailableMessageData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the conversation recording started
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the conversation recording started")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public RecordingAvailableMessageData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the conversation recording ended
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the conversation recording ended")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RecordingAvailableMessageData recordingAvailableMessageData = (RecordingAvailableMessageData) o;
		return Objects.equals(this.$type, recordingAvailableMessageData.$type) &&
				Objects.equals(this.id, recordingAvailableMessageData.id) &&
				Objects.equals(this.conversationId, recordingAvailableMessageData.conversationId) &&
				Objects.equals(this.externalMessengerChannelId, recordingAvailableMessageData.externalMessengerChannelId) &&
				Objects.equals(this.accountId, recordingAvailableMessageData.accountId) &&
				Objects.equals(this.senderPerson, recordingAvailableMessageData.senderPerson) &&
				Objects.equals(this.senderPersonPresenceId, recordingAvailableMessageData.senderPersonPresenceId) &&
				Objects.equals(this.serverTimestamp, recordingAvailableMessageData.serverTimestamp) &&
				Objects.equals(this.sendTimestamp, recordingAvailableMessageData.sendTimestamp) &&
				Objects.equals(this.type, recordingAvailableMessageData.type) &&
				Objects.equals(this.recipientPersonIds, recordingAvailableMessageData.recipientPersonIds) &&
				Objects.equals(this.fallbackText, recordingAvailableMessageData.fallbackText) &&
				Objects.equals(this.actionId, recordingAvailableMessageData.actionId) &&
				Objects.equals(this.sourceId, recordingAvailableMessageData.sourceId) &&
				Objects.equals(this.botThreadId, recordingAvailableMessageData.botThreadId) &&
				Objects.equals(this.internal, recordingAvailableMessageData.internal) &&
				Objects.equals(this.blobId, recordingAvailableMessageData.blobId) &&
				Objects.equals(this.blobSize, recordingAvailableMessageData.blobSize) &&
				Objects.equals(this.fileName, recordingAvailableMessageData.fileName) &&
				Objects.equals(this.startTimestamp, recordingAvailableMessageData.startTimestamp) &&
				Objects.equals(this.endTimestamp, recordingAvailableMessageData.endTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationId, externalMessengerChannelId, accountId, senderPerson, senderPersonPresenceId, serverTimestamp, sendTimestamp, type, recipientPersonIds, fallbackText, actionId, sourceId, botThreadId, internal, blobId, blobSize, fileName, startTimestamp, endTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RecordingAvailableMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    senderPerson: ").append(toIndentedString(senderPerson)).append("\n");
		sb.append("    senderPersonPresenceId: ").append(toIndentedString(senderPersonPresenceId)).append("\n");
		sb.append("    serverTimestamp: ").append(toIndentedString(serverTimestamp)).append("\n");
		sb.append("    sendTimestamp: ").append(toIndentedString(sendTimestamp)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    recipientPersonIds: ").append(toIndentedString(recipientPersonIds)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    botThreadId: ").append(toIndentedString(botThreadId)).append("\n");
		sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
		sb.append("    blobId: ").append(toIndentedString(blobId)).append("\n");
		sb.append("    blobSize: ").append(toIndentedString(blobSize)).append("\n");
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
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
