
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
 * A snapshot of the account&#39;s queue: every emission carries the complete current set of tracked conversations waiting in the queue.
 */
@ApiModel(description = "A snapshot of the account's queue: every emission carries the complete current set of tracked conversations waiting in the queue.")

@JsonPropertyOrder({
	QueueSnapshotEvent.JSON_PROPERTY_$_TYPE,
	QueueSnapshotEvent.JSON_PROPERTY_TIMESTAMP,
	QueueSnapshotEvent.JSON_PROPERTY_EVENT_TYPE,
	QueueSnapshotEvent.JSON_PROPERTY_ACCOUNT_ID,
	QueueSnapshotEvent.JSON_PROPERTY_QUEUED_CONVERSATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueueSnapshotEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUEUESNAPSHOTEVENT("QueueSnapshotEvent");

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
			return TypeEnum.QUEUESNAPSHOTEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUEUESNAPSHOTEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_QUEUED_CONVERSATIONS = "queuedConversations";
	@JsonProperty(JSON_PROPERTY_QUEUED_CONVERSATIONS)
	private List<QueuedConversationData> queuedConversations = null;

	public QueueSnapshotEvent $type(TypeEnum $type) {
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

	public QueueSnapshotEvent timestamp(Long timestamp) {
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

	public QueueSnapshotEvent eventType(String eventType) {
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

	public QueueSnapshotEvent accountId(String accountId) {
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

	public QueueSnapshotEvent queuedConversations(List<QueuedConversationData> queuedConversations) {
		this.queuedConversations = queuedConversations;
		return this;
	}

	public QueueSnapshotEvent addQueuedConversationsItem(QueuedConversationData queuedConversationsItem) {
		if (this.queuedConversations == null) {
			this.queuedConversations = new ArrayList<>();
		}
		this.queuedConversations.add(queuedConversationsItem);
		return this;
	}

	/**
	 * All conversations that are in QUEUED state at the time of the snapshot.
	 * 
	 * @return queuedConversations
	 **/
	@ApiModelProperty(value = "All conversations that are in QUEUED state at the time of the snapshot.")
	public List<QueuedConversationData> getQueuedConversations() {
		return queuedConversations;
	}

	public void setQueuedConversations(List<QueuedConversationData> queuedConversations) {
		this.queuedConversations = queuedConversations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QueueSnapshotEvent queueSnapshotEvent = (QueueSnapshotEvent) o;
		return Objects.equals(this.$type, queueSnapshotEvent.$type) &&
				Objects.equals(this.timestamp, queueSnapshotEvent.timestamp) &&
				Objects.equals(this.eventType, queueSnapshotEvent.eventType) &&
				Objects.equals(this.accountId, queueSnapshotEvent.accountId) &&
				Objects.equals(this.queuedConversations, queueSnapshotEvent.queuedConversations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, queuedConversations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueueSnapshotEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    queuedConversations: ").append(toIndentedString(queuedConversations)).append("\n");
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
