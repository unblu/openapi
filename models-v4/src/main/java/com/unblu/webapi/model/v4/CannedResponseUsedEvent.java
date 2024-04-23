
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
 * An event triggered every time at least one canned response is used in a conversation message
 */
@ApiModel(description = "An event triggered every time at least one canned response is used in a conversation message")

@JsonPropertyOrder({
	CannedResponseUsedEvent.JSON_PROPERTY_$_TYPE,
	CannedResponseUsedEvent.JSON_PROPERTY_TIMESTAMP,
	CannedResponseUsedEvent.JSON_PROPERTY_EVENT_TYPE,
	CannedResponseUsedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CannedResponseUsedEvent.JSON_PROPERTY_CONVERSATION_MESSAGE,
	CannedResponseUsedEvent.JSON_PROPERTY_USED_CANNED_RESPONSES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CannedResponseUsedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CANNEDRESPONSEUSEDEVENT("CannedResponseUsedEvent");

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
			return TypeEnum.CANNEDRESPONSEUSEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CANNEDRESPONSEUSEDEVENT;

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

	public static final String JSON_PROPERTY_USED_CANNED_RESPONSES = "usedCannedResponses";
	@JsonProperty(JSON_PROPERTY_USED_CANNED_RESPONSES)
	private List<CannedResponse> usedCannedResponses = null;

	public CannedResponseUsedEvent $type(TypeEnum $type) {
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

	public CannedResponseUsedEvent timestamp(Long timestamp) {
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

	public CannedResponseUsedEvent eventType(String eventType) {
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

	public CannedResponseUsedEvent accountId(String accountId) {
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

	public CannedResponseUsedEvent conversationMessage(MessageData conversationMessage) {
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

	public CannedResponseUsedEvent usedCannedResponses(List<CannedResponse> usedCannedResponses) {
		this.usedCannedResponses = usedCannedResponses;
		return this;
	}

	public CannedResponseUsedEvent addUsedCannedResponsesItem(CannedResponse usedCannedResponsesItem) {
		if (this.usedCannedResponses == null) {
			this.usedCannedResponses = new ArrayList<>();
		}
		this.usedCannedResponses.add(usedCannedResponsesItem);
		return this;
	}

	/**
	 * The list of the used canned responses
	 * 
	 * @return usedCannedResponses
	 **/
	@ApiModelProperty(value = "The list of the used canned responses")
	public List<CannedResponse> getUsedCannedResponses() {
		return usedCannedResponses;
	}

	public void setUsedCannedResponses(List<CannedResponse> usedCannedResponses) {
		this.usedCannedResponses = usedCannedResponses;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CannedResponseUsedEvent cannedResponseUsedEvent = (CannedResponseUsedEvent) o;
		return Objects.equals(this.$type, cannedResponseUsedEvent.$type) &&
				Objects.equals(this.timestamp, cannedResponseUsedEvent.timestamp) &&
				Objects.equals(this.eventType, cannedResponseUsedEvent.eventType) &&
				Objects.equals(this.accountId, cannedResponseUsedEvent.accountId) &&
				Objects.equals(this.conversationMessage, cannedResponseUsedEvent.conversationMessage) &&
				Objects.equals(this.usedCannedResponses, cannedResponseUsedEvent.usedCannedResponses);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationMessage, usedCannedResponses);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CannedResponseUsedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    usedCannedResponses: ").append(toIndentedString(usedCannedResponses)).append("\n");
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
