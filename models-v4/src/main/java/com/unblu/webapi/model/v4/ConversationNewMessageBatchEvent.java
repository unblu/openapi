
package com.unblu.webapi.model.v4;

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
 * Represents an event that is triggered when a batch of messages sent together in one action is complete, for example a text sent with files. &lt;p&gt; A batch
 * is complete once each of its messages is either rejected, or approved and, for a file, no longer uploading or being scanned. The event holds the approved
 * messages of the batch. Each of them is also sent as a conversation.new_message event, and the two events aren&#39;t triggered in a fixed order. &lt;p&gt; The
 * event is triggered before the batch is complete, with the messages approved so far, if none of its messages changes within the time set by the configuration
 * property &#x60;com.unblu.conversation.message.messageBatchTimeout&#x60;, or if another batch starts in the conversation while the maximum number of open
 * batches, set by &#x60;com.unblu.conversation.message.maxOpenMessageBatches&#x60;, is reached. A message approved after that is only sent as a
 * conversation.new_message event. No event is triggered for a batch without approved messages, or for a batch that was open when the cluster node handling the
 * conversation failed. &lt;p&gt; Supported filter keys: &lt;ul&gt; &lt;li&gt;&#x60;ETypedEventFilterKey.CONVERSATION_ID&#x60;: conversation ID&lt;/li&gt;
 * &lt;li&gt;&#x60;ETypedEventFilterKey.PARTICIPANT_PERSON_ID&#x60;: sender person ID&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Represents an event that is triggered when a batch of messages sent together in one action is complete, for example a text sent with files. <p> A batch is complete once each of its messages is either rejected, or approved and, for a file, no longer uploading or being scanned. The event holds the approved messages of the batch. Each of them is also sent as a conversation.new_message event, and the two events aren't triggered in a fixed order. <p> The event is triggered before the batch is complete, with the messages approved so far, if none of its messages changes within the time set by the configuration property `com.unblu.conversation.message.messageBatchTimeout`, or if another batch starts in the conversation while the maximum number of open batches, set by `com.unblu.conversation.message.maxOpenMessageBatches`, is reached. A message approved after that is only sent as a conversation.new_message event. No event is triggered for a batch without approved messages, or for a batch that was open when the cluster node handling the conversation failed. <p> Supported filter keys: <ul> <li>`ETypedEventFilterKey.CONVERSATION_ID`: conversation ID</li> <li>`ETypedEventFilterKey.PARTICIPANT_PERSON_ID`: sender person ID</li> </ul>")

@JsonPropertyOrder({
	ConversationNewMessageBatchEvent.JSON_PROPERTY_$_TYPE,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_CONVERSATION_ID,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_BATCH_ID,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_ORIGINAL_BATCH_SIZE,
	ConversationNewMessageBatchEvent.JSON_PROPERTY_MESSAGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationNewMessageBatchEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONNEWMESSAGEBATCHEVENT("ConversationNewMessageBatchEvent");

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
			return TypeEnum.CONVERSATIONNEWMESSAGEBATCHEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONNEWMESSAGEBATCHEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_BATCH_ID = "batchId";
	@JsonProperty(JSON_PROPERTY_BATCH_ID)
	private String batchId;

	public static final String JSON_PROPERTY_ORIGINAL_BATCH_SIZE = "originalBatchSize";
	@JsonProperty(JSON_PROPERTY_ORIGINAL_BATCH_SIZE)
	private Integer originalBatchSize;

	public static final String JSON_PROPERTY_MESSAGES = "messages";
	@JsonProperty(JSON_PROPERTY_MESSAGES)
	private List<MessageData> messages = null;

	public ConversationNewMessageBatchEvent $type(TypeEnum $type) {
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

	public ConversationNewMessageBatchEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The server time (Unix timestamp in ms) when the event occurred.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The server time (Unix timestamp in ms) when the event occurred.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public ConversationNewMessageBatchEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public ConversationNewMessageBatchEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationNewMessageBatchEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the messages were sent in
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the messages were sent in")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationNewMessageBatchEvent batchId(String batchId) {
		this.batchId = batchId;
		return this;
	}

	/**
	 * The ID of the batch, the same as &#x60;batchInfo.batchId&#x60; of each of its messages
	 * 
	 * @return batchId
	 **/
	@ApiModelProperty(value = "The ID of the batch, the same as `batchInfo.batchId` of each of its messages")
	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public ConversationNewMessageBatchEvent originalBatchSize(Integer originalBatchSize) {
		this.originalBatchSize = originalBatchSize;
		return this;
	}

	/**
	 * Number of messages the send action was meant to create. It&#39;s larger than the number of messages in the event if some of them were rejected, or
	 * weren&#39;t approved before the event was triggered.
	 * 
	 * @return originalBatchSize
	 **/
	@ApiModelProperty(value = "Number of messages the send action was meant to create. It's larger than the number of messages in the event if some of them were rejected, or weren't approved before the event was triggered.")
	public Integer getOriginalBatchSize() {
		return originalBatchSize;
	}

	public void setOriginalBatchSize(Integer originalBatchSize) {
		this.originalBatchSize = originalBatchSize;
	}

	public ConversationNewMessageBatchEvent messages(List<MessageData> messages) {
		this.messages = messages;
		return this;
	}

	public ConversationNewMessageBatchEvent addMessagesItem(MessageData messagesItem) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(messagesItem);
		return this;
	}

	/**
	 * The approved messages of the batch, ordered by their position within it
	 * 
	 * @return messages
	 **/
	@ApiModelProperty(value = "The approved messages of the batch, ordered by their position within it")
	public List<MessageData> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageData> messages) {
		this.messages = messages;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationNewMessageBatchEvent conversationNewMessageBatchEvent = (ConversationNewMessageBatchEvent) o;
		return Objects.equals(this.$type, conversationNewMessageBatchEvent.$type) &&
				Objects.equals(this.timestamp, conversationNewMessageBatchEvent.timestamp) &&
				Objects.equals(this.eventType, conversationNewMessageBatchEvent.eventType) &&
				Objects.equals(this.accountId, conversationNewMessageBatchEvent.accountId) &&
				Objects.equals(this.conversationId, conversationNewMessageBatchEvent.conversationId) &&
				Objects.equals(this.batchId, conversationNewMessageBatchEvent.batchId) &&
				Objects.equals(this.originalBatchSize, conversationNewMessageBatchEvent.originalBatchSize) &&
				Objects.equals(this.messages, conversationNewMessageBatchEvent.messages);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, batchId, originalBatchSize, messages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationNewMessageBatchEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
		sb.append("    originalBatchSize: ").append(toIndentedString(originalBatchSize)).append("\n");
		sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
