
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
 * An event triggered every time a message is rejected by a message interceptor
 */
@ApiModel(description = "An event triggered every time a message is rejected by a message interceptor")

@JsonPropertyOrder({
	MessageRejectedEvent.JSON_PROPERTY_$_TYPE,
	MessageRejectedEvent.JSON_PROPERTY_TIMESTAMP,
	MessageRejectedEvent.JSON_PROPERTY_EVENT_TYPE,
	MessageRejectedEvent.JSON_PROPERTY_ACCOUNT_ID,
	MessageRejectedEvent.JSON_PROPERTY_MESSAGE,
	MessageRejectedEvent.JSON_PROPERTY_SEVERITY,
	MessageRejectedEvent.JSON_PROPERTY_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageRejectedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEREJECTEDEVENT("MessageRejectedEvent");

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
			return TypeEnum.MESSAGEREJECTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEREJECTEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_MESSAGE = "message";
	@JsonProperty(JSON_PROPERTY_MESSAGE)
	private MessageData message = null;

	public static final String JSON_PROPERTY_SEVERITY = "severity";
	@JsonProperty(JSON_PROPERTY_SEVERITY)
	private ESentRejectionSeverity severity;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private String reason;

	public MessageRejectedEvent $type(TypeEnum $type) {
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

	public MessageRejectedEvent timestamp(Long timestamp) {
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

	public MessageRejectedEvent eventType(String eventType) {
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

	public MessageRejectedEvent accountId(String accountId) {
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

	public MessageRejectedEvent message(MessageData message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@ApiModelProperty(value = "")
	public MessageData getMessage() {
		return message;
	}

	public void setMessage(MessageData message) {
		this.message = message;
	}

	public MessageRejectedEvent severity(ESentRejectionSeverity severity) {
		this.severity = severity;
		return this;
	}

	/**
	 * Get severity
	 * 
	 * @return severity
	 **/
	@ApiModelProperty(value = "")
	public ESentRejectionSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(ESentRejectionSeverity severity) {
		this.severity = severity;
	}

	public MessageRejectedEvent reason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * The reason the message was rejected. &lt;p&gt; Should be localized in the the language of the conversation the message belongs to.
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "The reason the message was rejected. <p> Should be localized in the the language of the conversation the message belongs to.")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MessageRejectedEvent messageRejectedEvent = (MessageRejectedEvent) o;
		return Objects.equals(this.$type, messageRejectedEvent.$type) &&
				Objects.equals(this.timestamp, messageRejectedEvent.timestamp) &&
				Objects.equals(this.eventType, messageRejectedEvent.eventType) &&
				Objects.equals(this.accountId, messageRejectedEvent.accountId) &&
				Objects.equals(this.message, messageRejectedEvent.message) &&
				Objects.equals(this.severity, messageRejectedEvent.severity) &&
				Objects.equals(this.reason, messageRejectedEvent.reason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, message, severity, reason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageRejectedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
		sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
