
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
 * Event sent to external message interceptors when a new message is added to the conversation
 */
@ApiModel(description = "Event sent to external message interceptors when a new message is added to the conversation")

@JsonPropertyOrder({
	InterceptorNewMessageEvent.JSON_PROPERTY_$_TYPE,
	InterceptorNewMessageEvent.JSON_PROPERTY_TIMESTAMP,
	InterceptorNewMessageEvent.JSON_PROPERTY_EVENT_TYPE,
	InterceptorNewMessageEvent.JSON_PROPERTY_ACCOUNT_ID,
	InterceptorNewMessageEvent.JSON_PROPERTY_MESSAGE_API_TOKEN,
	InterceptorNewMessageEvent.JSON_PROPERTY_CONVERSATION_MESSAGE,
	InterceptorNewMessageEvent.JSON_PROPERTY_CONVERSATION_LANGUAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InterceptorNewMessageEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INTERCEPTORNEWMESSAGEEVENT("InterceptorNewMessageEvent");

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
			return TypeEnum.INTERCEPTORNEWMESSAGEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INTERCEPTORNEWMESSAGEEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_MESSAGE_API_TOKEN = "messageApiToken";
	@JsonProperty(JSON_PROPERTY_MESSAGE_API_TOKEN)
	private String messageApiToken;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public static final String JSON_PROPERTY_CONVERSATION_LANGUAGE = "conversationLanguage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_LANGUAGE)
	private String conversationLanguage;

	public InterceptorNewMessageEvent $type(TypeEnum $type) {
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

	public InterceptorNewMessageEvent timestamp(Long timestamp) {
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

	public InterceptorNewMessageEvent eventType(String eventType) {
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

	public InterceptorNewMessageEvent accountId(String accountId) {
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

	public InterceptorNewMessageEvent messageApiToken(String messageApiToken) {
		this.messageApiToken = messageApiToken;
		return this;
	}

	/**
	 * The token to approve, modify, or reject the message
	 * 
	 * @return messageApiToken
	 **/
	@ApiModelProperty(value = "The token to approve, modify, or reject the message")
	public String getMessageApiToken() {
		return messageApiToken;
	}

	public void setMessageApiToken(String messageApiToken) {
		this.messageApiToken = messageApiToken;
	}

	public InterceptorNewMessageEvent conversationMessage(MessageData conversationMessage) {
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

	public InterceptorNewMessageEvent conversationLanguage(String conversationLanguage) {
		this.conversationLanguage = conversationLanguage;
		return this;
	}

	/**
	 * The language of the conversation
	 * 
	 * @return conversationLanguage
	 **/
	@ApiModelProperty(value = "The language of the conversation")
	public String getConversationLanguage() {
		return conversationLanguage;
	}

	public void setConversationLanguage(String conversationLanguage) {
		this.conversationLanguage = conversationLanguage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InterceptorNewMessageEvent interceptorNewMessageEvent = (InterceptorNewMessageEvent) o;
		return Objects.equals(this.$type, interceptorNewMessageEvent.$type) &&
				Objects.equals(this.timestamp, interceptorNewMessageEvent.timestamp) &&
				Objects.equals(this.eventType, interceptorNewMessageEvent.eventType) &&
				Objects.equals(this.accountId, interceptorNewMessageEvent.accountId) &&
				Objects.equals(this.messageApiToken, interceptorNewMessageEvent.messageApiToken) &&
				Objects.equals(this.conversationMessage, interceptorNewMessageEvent.conversationMessage) &&
				Objects.equals(this.conversationLanguage, interceptorNewMessageEvent.conversationLanguage);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, messageApiToken, conversationMessage, conversationLanguage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InterceptorNewMessageEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    messageApiToken: ").append(toIndentedString(messageApiToken)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    conversationLanguage: ").append(toIndentedString(conversationLanguage)).append("\n");
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
