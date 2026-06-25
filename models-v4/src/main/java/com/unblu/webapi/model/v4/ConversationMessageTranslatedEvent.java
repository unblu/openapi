
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
 * Event emitted when a message is translated. &lt;p&gt; Supported filter keys: &lt;ul&gt; &lt;li&gt;&#x60;ETypedEventFilterKey.CONVERSATION_ID&#x60;:
 * conversation ID&lt;/li&gt; &lt;li&gt;&#x60;ETypedEventFilterKey.PARTICIPANT_PERSON_ID&#x60;: sender person ID&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Event emitted when a message is translated. <p> Supported filter keys: <ul> <li>`ETypedEventFilterKey.CONVERSATION_ID`: conversation ID</li> <li>`ETypedEventFilterKey.PARTICIPANT_PERSON_ID`: sender person ID</li> </ul>")

@JsonPropertyOrder({
	ConversationMessageTranslatedEvent.JSON_PROPERTY_$_TYPE,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_CONVERSATION_MESSAGE,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_TRANSLATION_TIMESTAMP,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_REQUESTED_LOCALE,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_REQUESTED_BY_PERSON,
	ConversationMessageTranslatedEvent.JSON_PROPERTY_REQUESTED_BY_PARTICIPATION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationMessageTranslatedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONMESSAGETRANSLATEDEVENT("ConversationMessageTranslatedEvent");

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
			return TypeEnum.CONVERSATIONMESSAGETRANSLATEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONMESSAGETRANSLATEDEVENT;

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

	public static final String JSON_PROPERTY_TRANSLATION_TIMESTAMP = "translationTimestamp";
	@JsonProperty(JSON_PROPERTY_TRANSLATION_TIMESTAMP)
	private Long translationTimestamp;

	public static final String JSON_PROPERTY_REQUESTED_LOCALE = "requestedLocale";
	@JsonProperty(JSON_PROPERTY_REQUESTED_LOCALE)
	private String requestedLocale;

	public static final String JSON_PROPERTY_REQUESTED_BY_PERSON = "requestedByPerson";
	@JsonProperty(JSON_PROPERTY_REQUESTED_BY_PERSON)
	private PersonData requestedByPerson = null;

	public static final String JSON_PROPERTY_REQUESTED_BY_PARTICIPATION_TYPE = "requestedByParticipationType";
	@JsonProperty(JSON_PROPERTY_REQUESTED_BY_PARTICIPATION_TYPE)
	private EConversationParticipationType requestedByParticipationType;

	public ConversationMessageTranslatedEvent $type(TypeEnum $type) {
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

	public ConversationMessageTranslatedEvent timestamp(Long timestamp) {
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

	public ConversationMessageTranslatedEvent eventType(String eventType) {
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

	public ConversationMessageTranslatedEvent accountId(String accountId) {
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

	public ConversationMessageTranslatedEvent conversationMessage(MessageData conversationMessage) {
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

	public ConversationMessageTranslatedEvent translationTimestamp(Long translationTimestamp) {
		this.translationTimestamp = translationTimestamp;
		return this;
	}

	/**
	 * Translation time
	 * 
	 * @return translationTimestamp
	 **/
	@ApiModelProperty(value = "Translation time")
	public Long getTranslationTimestamp() {
		return translationTimestamp;
	}

	public void setTranslationTimestamp(Long translationTimestamp) {
		this.translationTimestamp = translationTimestamp;
	}

	public ConversationMessageTranslatedEvent requestedLocale(String requestedLocale) {
		this.requestedLocale = requestedLocale;
		return this;
	}

	/**
	 * Requested translated language
	 * 
	 * @return requestedLocale
	 **/
	@ApiModelProperty(value = "Requested translated language")
	public String getRequestedLocale() {
		return requestedLocale;
	}

	public void setRequestedLocale(String requestedLocale) {
		this.requestedLocale = requestedLocale;
	}

	public ConversationMessageTranslatedEvent requestedByPerson(PersonData requestedByPerson) {
		this.requestedByPerson = requestedByPerson;
		return this;
	}

	/**
	 * Get requestedByPerson
	 * 
	 * @return requestedByPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getRequestedByPerson() {
		return requestedByPerson;
	}

	public void setRequestedByPerson(PersonData requestedByPerson) {
		this.requestedByPerson = requestedByPerson;
	}

	public ConversationMessageTranslatedEvent requestedByParticipationType(EConversationParticipationType requestedByParticipationType) {
		this.requestedByParticipationType = requestedByParticipationType;
		return this;
	}

	/**
	 * Get requestedByParticipationType
	 * 
	 * @return requestedByParticipationType
	 **/
	@ApiModelProperty(value = "")
	public EConversationParticipationType getRequestedByParticipationType() {
		return requestedByParticipationType;
	}

	public void setRequestedByParticipationType(EConversationParticipationType requestedByParticipationType) {
		this.requestedByParticipationType = requestedByParticipationType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationMessageTranslatedEvent conversationMessageTranslatedEvent = (ConversationMessageTranslatedEvent) o;
		return Objects.equals(this.$type, conversationMessageTranslatedEvent.$type) &&
				Objects.equals(this.timestamp, conversationMessageTranslatedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationMessageTranslatedEvent.eventType) &&
				Objects.equals(this.accountId, conversationMessageTranslatedEvent.accountId) &&
				Objects.equals(this.conversationMessage, conversationMessageTranslatedEvent.conversationMessage) &&
				Objects.equals(this.translationTimestamp, conversationMessageTranslatedEvent.translationTimestamp) &&
				Objects.equals(this.requestedLocale, conversationMessageTranslatedEvent.requestedLocale) &&
				Objects.equals(this.requestedByPerson, conversationMessageTranslatedEvent.requestedByPerson) &&
				Objects.equals(this.requestedByParticipationType, conversationMessageTranslatedEvent.requestedByParticipationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationMessage, translationTimestamp, requestedLocale, requestedByPerson, requestedByParticipationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationMessageTranslatedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    translationTimestamp: ").append(toIndentedString(translationTimestamp)).append("\n");
		sb.append("    requestedLocale: ").append(toIndentedString(requestedLocale)).append("\n");
		sb.append("    requestedByPerson: ").append(toIndentedString(requestedByPerson)).append("\n");
		sb.append("    requestedByParticipationType: ").append(toIndentedString(requestedByParticipationType)).append("\n");
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
