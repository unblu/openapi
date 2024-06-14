
package com.unblu.webapi.model.v3;

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
 * An event triggered every time a chat suggestion in a conversation is accepted with or without modifications
 */
@ApiModel(description = "An event triggered every time a chat suggestion in a conversation is accepted with or without modifications")

@JsonPropertyOrder({
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_$_TYPE,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_TIMESTAMP,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_EVENT_TYPE,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_SUGGESTION_SOURCE_ID,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_SUGGESTION_ID,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_PERSON_ID,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_REQUESTED_TIMESTAMP,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_SUGGESTED_TEXT_MESSAGE,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_SENT_TEXT_MESSAGE,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_ACCEPTED_TIMESTAMP,
	ChatSuggestionAcceptedEvent.JSON_PROPERTY_MODIFIED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatSuggestionAcceptedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CHATSUGGESTIONACCEPTEDEVENT("ChatSuggestionAcceptedEvent");

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
			return TypeEnum.CHATSUGGESTIONACCEPTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CHATSUGGESTIONACCEPTEDEVENT;

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

	public static final String JSON_PROPERTY_SENT_TEXT_MESSAGE = "sentTextMessage";
	@JsonProperty(JSON_PROPERTY_SENT_TEXT_MESSAGE)
	private String sentTextMessage;

	public static final String JSON_PROPERTY_ACCEPTED_TIMESTAMP = "acceptedTimestamp";
	@JsonProperty(JSON_PROPERTY_ACCEPTED_TIMESTAMP)
	private Long acceptedTimestamp;

	public static final String JSON_PROPERTY_MODIFIED = "modified";
	@JsonProperty(JSON_PROPERTY_MODIFIED)
	private Boolean modified;

	public ChatSuggestionAcceptedEvent $type(TypeEnum $type) {
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

	public ChatSuggestionAcceptedEvent timestamp(Long timestamp) {
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

	public ChatSuggestionAcceptedEvent eventType(String eventType) {
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

	public ChatSuggestionAcceptedEvent accountId(String accountId) {
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

	public ChatSuggestionAcceptedEvent conversationId(String conversationId) {
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

	public ChatSuggestionAcceptedEvent suggestionSourceId(String suggestionSourceId) {
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

	public ChatSuggestionAcceptedEvent suggestionId(String suggestionId) {
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

	public ChatSuggestionAcceptedEvent personId(String personId) {
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

	public ChatSuggestionAcceptedEvent requestedTimestamp(Long requestedTimestamp) {
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

	public ChatSuggestionAcceptedEvent suggestedTextMessage(String suggestedTextMessage) {
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

	public ChatSuggestionAcceptedEvent sentTextMessage(String sentTextMessage) {
		this.sentTextMessage = sentTextMessage;
		return this;
	}

	/**
	 * The suggested text as it was sent to the conversation
	 * 
	 * @return sentTextMessage
	 **/
	@ApiModelProperty(value = "The suggested text as it was sent to the conversation")
	public String getSentTextMessage() {
		return sentTextMessage;
	}

	public void setSentTextMessage(String sentTextMessage) {
		this.sentTextMessage = sentTextMessage;
	}

	public ChatSuggestionAcceptedEvent acceptedTimestamp(Long acceptedTimestamp) {
		this.acceptedTimestamp = acceptedTimestamp;
		return this;
	}

	/**
	 * The server-side time when the suggestion was accepted
	 * 
	 * @return acceptedTimestamp
	 **/
	@ApiModelProperty(value = "The server-side time when the suggestion was accepted")
	public Long getAcceptedTimestamp() {
		return acceptedTimestamp;
	}

	public void setAcceptedTimestamp(Long acceptedTimestamp) {
		this.acceptedTimestamp = acceptedTimestamp;
	}

	public ChatSuggestionAcceptedEvent modified(Boolean modified) {
		this.modified = modified;
		return this;
	}

	/**
	 * Flag indicating whether the suggestion text was modified by the person before being sent into the conversation
	 * 
	 * @return modified
	 **/
	@ApiModelProperty(value = "Flag indicating whether the suggestion text was modified by the person before being sent into the conversation")
	public Boolean isModified() {
		return modified;
	}

	public void setModified(Boolean modified) {
		this.modified = modified;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChatSuggestionAcceptedEvent chatSuggestionAcceptedEvent = (ChatSuggestionAcceptedEvent) o;
		return Objects.equals(this.$type, chatSuggestionAcceptedEvent.$type) &&
				Objects.equals(this.timestamp, chatSuggestionAcceptedEvent.timestamp) &&
				Objects.equals(this.eventType, chatSuggestionAcceptedEvent.eventType) &&
				Objects.equals(this.accountId, chatSuggestionAcceptedEvent.accountId) &&
				Objects.equals(this.conversationId, chatSuggestionAcceptedEvent.conversationId) &&
				Objects.equals(this.suggestionSourceId, chatSuggestionAcceptedEvent.suggestionSourceId) &&
				Objects.equals(this.suggestionId, chatSuggestionAcceptedEvent.suggestionId) &&
				Objects.equals(this.personId, chatSuggestionAcceptedEvent.personId) &&
				Objects.equals(this.requestedTimestamp, chatSuggestionAcceptedEvent.requestedTimestamp) &&
				Objects.equals(this.suggestedTextMessage, chatSuggestionAcceptedEvent.suggestedTextMessage) &&
				Objects.equals(this.sentTextMessage, chatSuggestionAcceptedEvent.sentTextMessage) &&
				Objects.equals(this.acceptedTimestamp, chatSuggestionAcceptedEvent.acceptedTimestamp) &&
				Objects.equals(this.modified, chatSuggestionAcceptedEvent.modified);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, suggestionSourceId, suggestionId, personId, requestedTimestamp, suggestedTextMessage, sentTextMessage, acceptedTimestamp, modified);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChatSuggestionAcceptedEvent {\n");
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
		sb.append("    sentTextMessage: ").append(toIndentedString(sentTextMessage)).append("\n");
		sb.append("    acceptedTimestamp: ").append(toIndentedString(acceptedTimestamp)).append("\n");
		sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
