
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
 * Represents an event that is triggered when a message is deleted in a conversation. &lt;p&gt; Participants may delete a message for all participants or just
 * themselves. In the latter case, the event is triggered each time a participant deletes the message for themselves. &lt;p&gt; Supported filter keys:
 * &lt;ul&gt; &lt;li&gt;&#x60;ETypedEventFilterKey.CONVERSATION_ID&#x60;: conversation ID&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Represents an event that is triggered when a message is deleted in a conversation. <p> Participants may delete a message for all participants or just themselves. In the latter case, the event is triggered each time a participant deletes the message for themselves. <p> Supported filter keys: <ul> <li>`ETypedEventFilterKey.CONVERSATION_ID`: conversation ID</li> </ul>")

@JsonPropertyOrder({
	ConversationMessageDeletedEvent.JSON_PROPERTY_$_TYPE,
	ConversationMessageDeletedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationMessageDeletedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationMessageDeletedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationMessageDeletedEvent.JSON_PROPERTY_CONVERSATION_MESSAGE,
	ConversationMessageDeletedEvent.JSON_PROPERTY_MARKED_AS_DELETED_FOR_EVERYBODY,
	ConversationMessageDeletedEvent.JSON_PROPERTY_DELETING_PERSON_ID,
	ConversationMessageDeletedEvent.JSON_PROPERTY_DELETED_ONLY_FOR_PERSON_IDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationMessageDeletedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONMESSAGEDELETEDEVENT("ConversationMessageDeletedEvent");

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
			return TypeEnum.CONVERSATIONMESSAGEDELETEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONMESSAGEDELETEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public static final String JSON_PROPERTY_MARKED_AS_DELETED_FOR_EVERYBODY = "markedAsDeletedForEverybody";
	@JsonProperty(JSON_PROPERTY_MARKED_AS_DELETED_FOR_EVERYBODY)
	private Boolean markedAsDeletedForEverybody;

	public static final String JSON_PROPERTY_DELETING_PERSON_ID = "deletingPersonId";
	@JsonProperty(JSON_PROPERTY_DELETING_PERSON_ID)
	private String deletingPersonId;

	public static final String JSON_PROPERTY_DELETED_ONLY_FOR_PERSON_IDS = "deletedOnlyForPersonIds";
	@JsonProperty(JSON_PROPERTY_DELETED_ONLY_FOR_PERSON_IDS)
	private List<String> deletedOnlyForPersonIds = null;

	public ConversationMessageDeletedEvent $type(TypeEnum $type) {
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

	public ConversationMessageDeletedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public ConversationMessageDeletedEvent eventType(String eventType) {
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

	public ConversationMessageDeletedEvent accountId(String accountId) {
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

	public ConversationMessageDeletedEvent conversationMessage(MessageData conversationMessage) {
		this.conversationMessage = conversationMessage;
		return this;
	}

	/**
	 * Get conversationMessage
	 * 
	 * @return conversationMessage
	 **/
	@ApiModelProperty(value = "")
	public MessageData getConversationMessage() {
		return conversationMessage;
	}

	public void setConversationMessage(MessageData conversationMessage) {
		this.conversationMessage = conversationMessage;
	}

	public ConversationMessageDeletedEvent markedAsDeletedForEverybody(Boolean markedAsDeletedForEverybody) {
		this.markedAsDeletedForEverybody = markedAsDeletedForEverybody;
		return this;
	}

	/**
	 * Whether the message is deleted for all participants
	 * 
	 * @return markedAsDeletedForEverybody
	 **/
	@ApiModelProperty(value = "Whether the message is deleted for all participants")
	public Boolean isMarkedAsDeletedForEverybody() {
		return markedAsDeletedForEverybody;
	}

	public void setMarkedAsDeletedForEverybody(Boolean markedAsDeletedForEverybody) {
		this.markedAsDeletedForEverybody = markedAsDeletedForEverybody;
	}

	public ConversationMessageDeletedEvent deletingPersonId(String deletingPersonId) {
		this.deletingPersonId = deletingPersonId;
		return this;
	}

	/**
	 * The ID of the person who marked the message as deleted for all participants. Null if the message wasn&#39;t deleted for all participants.
	 * 
	 * @return deletingPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person who marked the message as deleted for all participants. Null if the message wasn't deleted for all participants.")
	public String getDeletingPersonId() {
		return deletingPersonId;
	}

	public void setDeletingPersonId(String deletingPersonId) {
		this.deletingPersonId = deletingPersonId;
	}

	public ConversationMessageDeletedEvent deletedOnlyForPersonIds(List<String> deletedOnlyForPersonIds) {
		this.deletedOnlyForPersonIds = deletedOnlyForPersonIds;
		return this;
	}

	public ConversationMessageDeletedEvent addDeletedOnlyForPersonIdsItem(String deletedOnlyForPersonIdsItem) {
		if (this.deletedOnlyForPersonIds == null) {
			this.deletedOnlyForPersonIds = new ArrayList<>();
		}
		this.deletedOnlyForPersonIds.add(deletedOnlyForPersonIdsItem);
		return this;
	}

	/**
	 * The IDs of the participants who have marked this message as deleted for themselves
	 * 
	 * @return deletedOnlyForPersonIds
	 **/
	@ApiModelProperty(value = "The IDs of the participants who have marked this message as deleted for themselves")
	public List<String> getDeletedOnlyForPersonIds() {
		return deletedOnlyForPersonIds;
	}

	public void setDeletedOnlyForPersonIds(List<String> deletedOnlyForPersonIds) {
		this.deletedOnlyForPersonIds = deletedOnlyForPersonIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationMessageDeletedEvent conversationMessageDeletedEvent = (ConversationMessageDeletedEvent) o;
		return Objects.equals(this.$type, conversationMessageDeletedEvent.$type) &&
				Objects.equals(this.timestamp, conversationMessageDeletedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationMessageDeletedEvent.eventType) &&
				Objects.equals(this.accountId, conversationMessageDeletedEvent.accountId) &&
				Objects.equals(this.conversationMessage, conversationMessageDeletedEvent.conversationMessage) &&
				Objects.equals(this.markedAsDeletedForEverybody, conversationMessageDeletedEvent.markedAsDeletedForEverybody) &&
				Objects.equals(this.deletingPersonId, conversationMessageDeletedEvent.deletingPersonId) &&
				Objects.equals(this.deletedOnlyForPersonIds, conversationMessageDeletedEvent.deletedOnlyForPersonIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationMessage, markedAsDeletedForEverybody, deletingPersonId, deletedOnlyForPersonIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationMessageDeletedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    markedAsDeletedForEverybody: ").append(toIndentedString(markedAsDeletedForEverybody)).append("\n");
		sb.append("    deletingPersonId: ").append(toIndentedString(deletingPersonId)).append("\n");
		sb.append("    deletedOnlyForPersonIds: ").append(toIndentedString(deletedOnlyForPersonIds)).append("\n");
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
