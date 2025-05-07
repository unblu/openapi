
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
 * An event triggered every time a chat suggestion is successfully retrieved from a suggestion source in a conversation
 */
@ApiModel(description = "An event triggered every time a chat suggestion is successfully retrieved from a suggestion source in a conversation")

@JsonPropertyOrder({
	ChatSuggestionProvidedEvent.JSON_PROPERTY_$_TYPE,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_TIMESTAMP,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_EVENT_TYPE,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_SUGGESTION_TYPE,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_CONVERSATION_ID,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_SUGGESTION_SOURCE_ID,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_SUGGESTION_ID,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_PERSON_ID,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_REQUESTED_TIMESTAMP,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_SOURCE_MESSAGES,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_SUGGESTED_TEXT,
	ChatSuggestionProvidedEvent.JSON_PROPERTY_SUGGESTED_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatSuggestionProvidedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CHATSUGGESTIONPROVIDEDEVENT("ChatSuggestionProvidedEvent");

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
			return TypeEnum.CHATSUGGESTIONPROVIDEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CHATSUGGESTIONPROVIDEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SUGGESTION_TYPE = "suggestionType";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_TYPE)
	private EChatSuggestionType suggestionType;

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

	public static final String JSON_PROPERTY_SOURCE_MESSAGES = "sourceMessages";
	@JsonProperty(JSON_PROPERTY_SOURCE_MESSAGES)
	private List<MessageData> sourceMessages = null;

	public static final String JSON_PROPERTY_SUGGESTED_TEXT = "suggestedText";
	@JsonProperty(JSON_PROPERTY_SUGGESTED_TEXT)
	private String suggestedText;

	public static final String JSON_PROPERTY_SUGGESTED_COMMENT = "suggestedComment";
	@JsonProperty(JSON_PROPERTY_SUGGESTED_COMMENT)
	private String suggestedComment;

	public ChatSuggestionProvidedEvent $type(TypeEnum $type) {
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

	public ChatSuggestionProvidedEvent timestamp(Long timestamp) {
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

	public ChatSuggestionProvidedEvent eventType(String eventType) {
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

	public ChatSuggestionProvidedEvent accountId(String accountId) {
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

	public ChatSuggestionProvidedEvent suggestionType(EChatSuggestionType suggestionType) {
		this.suggestionType = suggestionType;
		return this;
	}

	/**
	 * Get suggestionType
	 * 
	 * @return suggestionType
	 **/
	@ApiModelProperty(value = "")
	public EChatSuggestionType getSuggestionType() {
		return suggestionType;
	}

	public void setSuggestionType(EChatSuggestionType suggestionType) {
		this.suggestionType = suggestionType;
	}

	public ChatSuggestionProvidedEvent conversationId(String conversationId) {
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

	public ChatSuggestionProvidedEvent suggestionSourceId(String suggestionSourceId) {
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

	public ChatSuggestionProvidedEvent suggestionId(String suggestionId) {
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

	public ChatSuggestionProvidedEvent personId(String personId) {
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

	public ChatSuggestionProvidedEvent requestedTimestamp(Long requestedTimestamp) {
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

	public ChatSuggestionProvidedEvent sourceMessages(List<MessageData> sourceMessages) {
		this.sourceMessages = sourceMessages;
		return this;
	}

	public ChatSuggestionProvidedEvent addSourceMessagesItem(MessageData sourceMessagesItem) {
		if (this.sourceMessages == null) {
			this.sourceMessages = new ArrayList<>();
		}
		this.sourceMessages.add(sourceMessagesItem);
		return this;
	}

	/**
	 * The messages used as the source of the suggestion
	 * 
	 * @return sourceMessages
	 **/
	@ApiModelProperty(value = "The messages used as the source of the suggestion")
	public List<MessageData> getSourceMessages() {
		return sourceMessages;
	}

	public void setSourceMessages(List<MessageData> sourceMessages) {
		this.sourceMessages = sourceMessages;
	}

	public ChatSuggestionProvidedEvent suggestedText(String suggestedText) {
		this.suggestedText = suggestedText;
		return this;
	}

	/**
	 * The response text from the suggestion source
	 * 
	 * @return suggestedText
	 **/
	@ApiModelProperty(value = "The response text from the suggestion source")
	public String getSuggestedText() {
		return suggestedText;
	}

	public void setSuggestedText(String suggestedText) {
		this.suggestedText = suggestedText;
	}

	public ChatSuggestionProvidedEvent suggestedComment(String suggestedComment) {
		this.suggestedComment = suggestedComment;
		return this;
	}

	/**
	 * The response comment from the suggestion source
	 * 
	 * @return suggestedComment
	 **/
	@ApiModelProperty(value = "The response comment from the suggestion source")
	public String getSuggestedComment() {
		return suggestedComment;
	}

	public void setSuggestedComment(String suggestedComment) {
		this.suggestedComment = suggestedComment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChatSuggestionProvidedEvent chatSuggestionProvidedEvent = (ChatSuggestionProvidedEvent) o;
		return Objects.equals(this.$type, chatSuggestionProvidedEvent.$type) &&
				Objects.equals(this.timestamp, chatSuggestionProvidedEvent.timestamp) &&
				Objects.equals(this.eventType, chatSuggestionProvidedEvent.eventType) &&
				Objects.equals(this.accountId, chatSuggestionProvidedEvent.accountId) &&
				Objects.equals(this.suggestionType, chatSuggestionProvidedEvent.suggestionType) &&
				Objects.equals(this.conversationId, chatSuggestionProvidedEvent.conversationId) &&
				Objects.equals(this.suggestionSourceId, chatSuggestionProvidedEvent.suggestionSourceId) &&
				Objects.equals(this.suggestionId, chatSuggestionProvidedEvent.suggestionId) &&
				Objects.equals(this.personId, chatSuggestionProvidedEvent.personId) &&
				Objects.equals(this.requestedTimestamp, chatSuggestionProvidedEvent.requestedTimestamp) &&
				Objects.equals(this.sourceMessages, chatSuggestionProvidedEvent.sourceMessages) &&
				Objects.equals(this.suggestedText, chatSuggestionProvidedEvent.suggestedText) &&
				Objects.equals(this.suggestedComment, chatSuggestionProvidedEvent.suggestedComment);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, suggestionType, conversationId, suggestionSourceId, suggestionId, personId, requestedTimestamp, sourceMessages, suggestedText, suggestedComment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChatSuggestionProvidedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    suggestionType: ").append(toIndentedString(suggestionType)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    suggestionSourceId: ").append(toIndentedString(suggestionSourceId)).append("\n");
		sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    requestedTimestamp: ").append(toIndentedString(requestedTimestamp)).append("\n");
		sb.append("    sourceMessages: ").append(toIndentedString(sourceMessages)).append("\n");
		sb.append("    suggestedText: ").append(toIndentedString(suggestedText)).append("\n");
		sb.append("    suggestedComment: ").append(toIndentedString(suggestedComment)).append("\n");
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
