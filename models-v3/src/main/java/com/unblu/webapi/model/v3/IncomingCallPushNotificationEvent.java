
package com.unblu.webapi.model.v3;

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
 * Push notification when a call for the recipient person is ringing
 */
@ApiModel(description = "Push notification when a call for the recipient person is ringing")

@JsonPropertyOrder({
	IncomingCallPushNotificationEvent.JSON_PROPERTY_$_TYPE,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_TIMESTAMP,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_EVENT_TYPE,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_ACCOUNT_ID,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_RECIPIENT,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_LOCALE,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_CONVERSATION_ID,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_DEVICE_TOKENS,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_CALL_STATE,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_CALL_TYPE,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_CALL_START_TIMESTAMP,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_CALLER_NAME,
	IncomingCallPushNotificationEvent.JSON_PROPERTY_CALLER_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class IncomingCallPushNotificationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INCOMINGCALLPUSHNOTIFICATIONEVENT("IncomingCallPushNotificationEvent");

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
			return TypeEnum.INCOMINGCALLPUSHNOTIFICATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INCOMINGCALLPUSHNOTIFICATIONEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private PersonData recipient = null;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_DEVICE_TOKENS = "deviceTokens";
	@JsonProperty(JSON_PROPERTY_DEVICE_TOKENS)
	private List<String> deviceTokens = null;

	public static final String JSON_PROPERTY_CALL_STATE = "callState";
	@JsonProperty(JSON_PROPERTY_CALL_STATE)
	private ECallState callState;

	public static final String JSON_PROPERTY_CALL_TYPE = "callType";
	@JsonProperty(JSON_PROPERTY_CALL_TYPE)
	private ECallType callType;

	public static final String JSON_PROPERTY_CALL_START_TIMESTAMP = "callStartTimestamp";
	@JsonProperty(JSON_PROPERTY_CALL_START_TIMESTAMP)
	private Long callStartTimestamp;

	public static final String JSON_PROPERTY_CALLER_NAME = "callerName";
	@JsonProperty(JSON_PROPERTY_CALLER_NAME)
	private String callerName;

	public static final String JSON_PROPERTY_CALLER_PERSON_ID = "callerPersonId";
	@JsonProperty(JSON_PROPERTY_CALLER_PERSON_ID)
	private String callerPersonId;

	public IncomingCallPushNotificationEvent $type(TypeEnum $type) {
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

	public IncomingCallPushNotificationEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (unix time in millies) that the event was generated.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (unix time in millies) that the event was generated.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public IncomingCallPushNotificationEvent eventType(String eventType) {
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

	public IncomingCallPushNotificationEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public IncomingCallPushNotificationEvent recipient(PersonData recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public PersonData getRecipient() {
		return recipient;
	}

	public void setRecipient(PersonData recipient) {
		this.recipient = recipient;
	}

	public IncomingCallPushNotificationEvent locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Locale (as BCP 47 language tag form including region if available)
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Locale (as BCP 47 language tag form including region if available)")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public IncomingCallPushNotificationEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public IncomingCallPushNotificationEvent deviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
		return this;
	}

	public IncomingCallPushNotificationEvent addDeviceTokensItem(String deviceTokensItem) {
		if (this.deviceTokens == null) {
			this.deviceTokens = new ArrayList<>();
		}
		this.deviceTokens.add(deviceTokensItem);
		return this;
	}

	/**
	 * List of device tokens
	 * 
	 * @return deviceTokens
	 **/
	@ApiModelProperty(value = "List of device tokens")
	public List<String> getDeviceTokens() {
		return deviceTokens;
	}

	public void setDeviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
	}

	public IncomingCallPushNotificationEvent callState(ECallState callState) {
		this.callState = callState;
		return this;
	}

	/**
	 * Get callState
	 * 
	 * @return callState
	 **/
	@ApiModelProperty(value = "")
	public ECallState getCallState() {
		return callState;
	}

	public void setCallState(ECallState callState) {
		this.callState = callState;
	}

	public IncomingCallPushNotificationEvent callType(ECallType callType) {
		this.callType = callType;
		return this;
	}

	/**
	 * Get callType
	 * 
	 * @return callType
	 **/
	@ApiModelProperty(value = "")
	public ECallType getCallType() {
		return callType;
	}

	public void setCallType(ECallType callType) {
		this.callType = callType;
	}

	public IncomingCallPushNotificationEvent callStartTimestamp(Long callStartTimestamp) {
		this.callStartTimestamp = callStartTimestamp;
		return this;
	}

	/**
	 * Timestamp when the call started
	 * 
	 * @return callStartTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the call started")
	public Long getCallStartTimestamp() {
		return callStartTimestamp;
	}

	public void setCallStartTimestamp(Long callStartTimestamp) {
		this.callStartTimestamp = callStartTimestamp;
	}

	public IncomingCallPushNotificationEvent callerName(String callerName) {
		this.callerName = callerName;
		return this;
	}

	/**
	 * Name of the person calling
	 * 
	 * @return callerName
	 **/
	@ApiModelProperty(value = "Name of the person calling")
	public String getCallerName() {
		return callerName;
	}

	public void setCallerName(String callerName) {
		this.callerName = callerName;
	}

	public IncomingCallPushNotificationEvent callerPersonId(String callerPersonId) {
		this.callerPersonId = callerPersonId;
		return this;
	}

	/**
	 * Person id of the person calling
	 * 
	 * @return callerPersonId
	 **/
	@ApiModelProperty(value = "Person id of the person calling")
	public String getCallerPersonId() {
		return callerPersonId;
	}

	public void setCallerPersonId(String callerPersonId) {
		this.callerPersonId = callerPersonId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		IncomingCallPushNotificationEvent incomingCallPushNotificationEvent = (IncomingCallPushNotificationEvent) o;
		return Objects.equals(this.$type, incomingCallPushNotificationEvent.$type) &&
				Objects.equals(this.timestamp, incomingCallPushNotificationEvent.timestamp) &&
				Objects.equals(this.eventType, incomingCallPushNotificationEvent.eventType) &&
				Objects.equals(this.accountId, incomingCallPushNotificationEvent.accountId) &&
				Objects.equals(this.recipient, incomingCallPushNotificationEvent.recipient) &&
				Objects.equals(this.locale, incomingCallPushNotificationEvent.locale) &&
				Objects.equals(this.conversationId, incomingCallPushNotificationEvent.conversationId) &&
				Objects.equals(this.deviceTokens, incomingCallPushNotificationEvent.deviceTokens) &&
				Objects.equals(this.callState, incomingCallPushNotificationEvent.callState) &&
				Objects.equals(this.callType, incomingCallPushNotificationEvent.callType) &&
				Objects.equals(this.callStartTimestamp, incomingCallPushNotificationEvent.callStartTimestamp) &&
				Objects.equals(this.callerName, incomingCallPushNotificationEvent.callerName) &&
				Objects.equals(this.callerPersonId, incomingCallPushNotificationEvent.callerPersonId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, recipient, locale, conversationId, deviceTokens, callState, callType, callStartTimestamp, callerName, callerPersonId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class IncomingCallPushNotificationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    deviceTokens: ").append(toIndentedString(deviceTokens)).append("\n");
		sb.append("    callState: ").append(toIndentedString(callState)).append("\n");
		sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
		sb.append("    callStartTimestamp: ").append(toIndentedString(callStartTimestamp)).append("\n");
		sb.append("    callerName: ").append(toIndentedString(callerName)).append("\n");
		sb.append("    callerPersonId: ").append(toIndentedString(callerPersonId)).append("\n");
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
