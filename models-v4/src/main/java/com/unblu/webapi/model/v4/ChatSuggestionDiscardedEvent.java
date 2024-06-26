
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
 * An event triggered every time a chat suggestion in a conversation is discarded
 */
@ApiModel(description = "An event triggered every time a chat suggestion in a conversation is discarded")

@JsonPropertyOrder({
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_$_TYPE,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_TIMESTAMP,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_EVENT_TYPE,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_SUGGESTION_SOURCE_ID,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_SUGGESTION_ID,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_PERSON_ID,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_REQUESTED_TIMESTAMP,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_SUGGESTED_TEXT_MESSAGE,
	ChatSuggestionDiscardedEvent.JSON_PROPERTY_DISCARDED_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatSuggestionDiscardedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CHATSUGGESTIONDISCARDEDEVENT("ChatSuggestionDiscardedEvent");

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
			return TypeEnum.CHATSUGGESTIONDISCARDEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CHATSUGGESTIONDISCARDEDEVENT;

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

	public static final String JSON_PROPERTY_SUGGESTION_SOURCE_ID = "suggestionSourceId";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_SOURCE_ID)
	private String suggestionSourceId;

	public static final String JSON_PROPERTY_SUGGESTION_ID = "suggestionId";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_ID)
	private String suggestionId;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_REQUESTED_TIMESTAMP = "requestedTimestamp";
	@JsonProperty(JSON_PROPERTY_REQUESTED_TIMESTAMP)
	private Long requestedTimestamp;

	public static final String JSON_PROPERTY_SUGGESTED_TEXT_MESSAGE = "suggestedTextMessage";
	@JsonProperty(JSON_PROPERTY_SUGGESTED_TEXT_MESSAGE)
	private String suggestedTextMessage;

	public static final String JSON_PROPERTY_DISCARDED_TIMESTAMP = "discardedTimestamp";
	@JsonProperty(JSON_PROPERTY_DISCARDED_TIMESTAMP)
	private Long discardedTimestamp;

	public ChatSuggestionDiscardedEvent $type(TypeEnum $type) {
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

	public ChatSuggestionDiscardedEvent timestamp(Long timestamp) {
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

	public ChatSuggestionDiscardedEvent eventType(String eventType) {
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

	public ChatSuggestionDiscardedEvent accountId(String accountId) {
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

	public ChatSuggestionDiscardedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The conversation ID the event originated from
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The conversation ID the event originated from")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ChatSuggestionDiscardedEvent suggestionSourceId(String suggestionSourceId) {
		this.suggestionSourceId = suggestionSourceId;
		return this;
	}

	/**
	 * The suggestion source ID the event originated from
	 * 
	 * @return suggestionSourceId
	 **/
	@ApiModelProperty(value = "The suggestion source ID the event originated from")
	public String getSuggestionSourceId() {
		return suggestionSourceId;
	}

	public void setSuggestionSourceId(String suggestionSourceId) {
		this.suggestionSourceId = suggestionSourceId;
	}

	public ChatSuggestionDiscardedEvent suggestionId(String suggestionId) {
		this.suggestionId = suggestionId;
		return this;
	}

	/**
	 * A unique ID identifying the suggestion
	 * 
	 * @return suggestionId
	 **/
	@ApiModelProperty(value = "A unique ID identifying the suggestion")
	public String getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(String suggestionId) {
		this.suggestionId = suggestionId;
	}

	public ChatSuggestionDiscardedEvent personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The ID of the person requesting the suggestion
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The ID of the person requesting the suggestion")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ChatSuggestionDiscardedEvent requestedTimestamp(Long requestedTimestamp) {
		this.requestedTimestamp = requestedTimestamp;
		return this;
	}

	/**
	 * The timestamp when the suggestion was requested
	 * 
	 * @return requestedTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp when the suggestion was requested")
	public Long getRequestedTimestamp() {
		return requestedTimestamp;
	}

	public void setRequestedTimestamp(Long requestedTimestamp) {
		this.requestedTimestamp = requestedTimestamp;
	}

	public ChatSuggestionDiscardedEvent suggestedTextMessage(String suggestedTextMessage) {
		this.suggestedTextMessage = suggestedTextMessage;
		return this;
	}

	/**
	 * Get suggestedTextMessage
	 * 
	 * @return suggestedTextMessage
	 **/
	@ApiModelProperty(value = "")
	public String getSuggestedTextMessage() {
		return suggestedTextMessage;
	}

	public void setSuggestedTextMessage(String suggestedTextMessage) {
		this.suggestedTextMessage = suggestedTextMessage;
	}

	public ChatSuggestionDiscardedEvent discardedTimestamp(Long discardedTimestamp) {
		this.discardedTimestamp = discardedTimestamp;
		return this;
	}

	/**
	 * The server-side time when the suggestion was discarded
	 * 
	 * @return discardedTimestamp
	 **/
	@ApiModelProperty(value = "The server-side time when the suggestion was discarded")
	public Long getDiscardedTimestamp() {
		return discardedTimestamp;
	}

	public void setDiscardedTimestamp(Long discardedTimestamp) {
		this.discardedTimestamp = discardedTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChatSuggestionDiscardedEvent chatSuggestionDiscardedEvent = (ChatSuggestionDiscardedEvent) o;
		return Objects.equals(this.$type, chatSuggestionDiscardedEvent.$type) &&
				Objects.equals(this.timestamp, chatSuggestionDiscardedEvent.timestamp) &&
				Objects.equals(this.eventType, chatSuggestionDiscardedEvent.eventType) &&
				Objects.equals(this.accountId, chatSuggestionDiscardedEvent.accountId) &&
				Objects.equals(this.conversationId, chatSuggestionDiscardedEvent.conversationId) &&
				Objects.equals(this.suggestionSourceId, chatSuggestionDiscardedEvent.suggestionSourceId) &&
				Objects.equals(this.suggestionId, chatSuggestionDiscardedEvent.suggestionId) &&
				Objects.equals(this.personId, chatSuggestionDiscardedEvent.personId) &&
				Objects.equals(this.requestedTimestamp, chatSuggestionDiscardedEvent.requestedTimestamp) &&
				Objects.equals(this.suggestedTextMessage, chatSuggestionDiscardedEvent.suggestedTextMessage) &&
				Objects.equals(this.discardedTimestamp, chatSuggestionDiscardedEvent.discardedTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, suggestionSourceId, suggestionId, personId, requestedTimestamp, suggestedTextMessage, discardedTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChatSuggestionDiscardedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    suggestionSourceId: ").append(toIndentedString(suggestionSourceId)).append("\n");
		sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    requestedTimestamp: ").append(toIndentedString(requestedTimestamp)).append("\n");
		sb.append("    suggestedTextMessage: ").append(toIndentedString(suggestedTextMessage)).append("\n");
		sb.append("    discardedTimestamp: ").append(toIndentedString(discardedTimestamp)).append("\n");
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
