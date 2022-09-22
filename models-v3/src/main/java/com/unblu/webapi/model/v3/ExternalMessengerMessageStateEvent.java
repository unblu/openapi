
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
 * Event emitted when a message from the external messenger is delivered/read.
 */
@ApiModel(description = "Event emitted when a message from the external messenger is delivered/read.")

@JsonPropertyOrder({
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_$_TYPE,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_TIMESTAMP,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_EVENT_TYPE,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_ACCOUNT_ID,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_MESSAGE_ID,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_STATE,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_SOURCE_ID,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	ExternalMessengerMessageStateEvent.JSON_PROPERTY_CONVERSATION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerMessageStateEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERMESSAGESTATEEVENT("ExternalMessengerMessageStateEvent");

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
			return TypeEnum.EXTERNALMESSENGERMESSAGESTATEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERMESSAGESTATEEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EMessageState state;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public ExternalMessengerMessageStateEvent $type(TypeEnum $type) {
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

	public ExternalMessengerMessageStateEvent timestamp(Long timestamp) {
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

	public ExternalMessengerMessageStateEvent eventType(String eventType) {
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

	public ExternalMessengerMessageStateEvent accountId(String accountId) {
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

	public ExternalMessengerMessageStateEvent messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The id of the message which state has changed
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The id of the message which state has changed")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public ExternalMessengerMessageStateEvent state(EMessageState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EMessageState getState() {
		return state;
	}

	public void setState(EMessageState state) {
		this.state = state;
	}

	public ExternalMessengerMessageStateEvent sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The source id of the message
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The source id of the message")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ExternalMessengerMessageStateEvent externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * The id if the external messenger channel
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "The id if the external messenger channel")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public ExternalMessengerMessageStateEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The conversation to which the message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The conversation to which the message belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerMessageStateEvent externalMessengerMessageStateEvent = (ExternalMessengerMessageStateEvent) o;
		return Objects.equals(this.$type, externalMessengerMessageStateEvent.$type) &&
				Objects.equals(this.timestamp, externalMessengerMessageStateEvent.timestamp) &&
				Objects.equals(this.eventType, externalMessengerMessageStateEvent.eventType) &&
				Objects.equals(this.accountId, externalMessengerMessageStateEvent.accountId) &&
				Objects.equals(this.messageId, externalMessengerMessageStateEvent.messageId) &&
				Objects.equals(this.state, externalMessengerMessageStateEvent.state) &&
				Objects.equals(this.sourceId, externalMessengerMessageStateEvent.sourceId) &&
				Objects.equals(this.externalMessengerChannelId, externalMessengerMessageStateEvent.externalMessengerChannelId) &&
				Objects.equals(this.conversationId, externalMessengerMessageStateEvent.conversationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, messageId, state, sourceId, externalMessengerChannelId, conversationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerMessageStateEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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
