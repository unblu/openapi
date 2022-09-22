
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
 * Push notification when a ringing call was missed
 */
@ApiModel(description = "Push notification when a ringing call was missed")

@JsonPropertyOrder({
	MissedCallPushNotificationEvent.JSON_PROPERTY_$_TYPE,
	MissedCallPushNotificationEvent.JSON_PROPERTY_TIMESTAMP,
	MissedCallPushNotificationEvent.JSON_PROPERTY_EVENT_TYPE,
	MissedCallPushNotificationEvent.JSON_PROPERTY_ACCOUNT_ID,
	MissedCallPushNotificationEvent.JSON_PROPERTY_RECIPIENT,
	MissedCallPushNotificationEvent.JSON_PROPERTY_LOCALE,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CONVERSATION_ID,
	MissedCallPushNotificationEvent.JSON_PROPERTY_DEVICE_TOKENS,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CALL_STATE,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CALL_TYPE,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CALL_START_TIMESTAMP,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CALLER_NAME,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CALLER_PERSON_ID,
	MissedCallPushNotificationEvent.JSON_PROPERTY_CALL_END_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MissedCallPushNotificationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MISSEDCALLPUSHNOTIFICATIONEVENT("MissedCallPushNotificationEvent");

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
			return TypeEnum.MISSEDCALLPUSHNOTIFICATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MISSEDCALLPUSHNOTIFICATIONEVENT;

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

	public static final String JSON_PROPERTY_CALL_END_REASON = "callEndReason";
	@JsonProperty(JSON_PROPERTY_CALL_END_REASON)
	private ECallParticipationEndReason callEndReason;

	public MissedCallPushNotificationEvent $type(TypeEnum $type) {
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

	public MissedCallPushNotificationEvent timestamp(Long timestamp) {
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

	public MissedCallPushNotificationEvent eventType(String eventType) {
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

	public MissedCallPushNotificationEvent accountId(String accountId) {
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

	public MissedCallPushNotificationEvent recipient(PersonData recipient) {
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

	public MissedCallPushNotificationEvent locale(String locale) {
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

	public MissedCallPushNotificationEvent conversationId(String conversationId) {
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

	public MissedCallPushNotificationEvent deviceTokens(List<String> deviceTokens) {
		this.deviceTokens = deviceTokens;
		return this;
	}

	public MissedCallPushNotificationEvent addDeviceTokensItem(String deviceTokensItem) {
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

	public MissedCallPushNotificationEvent callState(ECallState callState) {
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

	public MissedCallPushNotificationEvent callType(ECallType callType) {
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

	public MissedCallPushNotificationEvent callStartTimestamp(Long callStartTimestamp) {
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

	public MissedCallPushNotificationEvent callerName(String callerName) {
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

	public MissedCallPushNotificationEvent callerPersonId(String callerPersonId) {
		this.callerPersonId = callerPersonId;
		return this;
	}

	/**
	 * Person ID of the person calling
	 * 
	 * @return callerPersonId
	 **/
	@ApiModelProperty(value = "Person ID of the person calling")
	public String getCallerPersonId() {
		return callerPersonId;
	}

	public void setCallerPersonId(String callerPersonId) {
		this.callerPersonId = callerPersonId;
	}

	public MissedCallPushNotificationEvent callEndReason(ECallParticipationEndReason callEndReason) {
		this.callEndReason = callEndReason;
		return this;
	}

	/**
	 * Get callEndReason
	 * 
	 * @return callEndReason
	 **/
	@ApiModelProperty(value = "")
	public ECallParticipationEndReason getCallEndReason() {
		return callEndReason;
	}

	public void setCallEndReason(ECallParticipationEndReason callEndReason) {
		this.callEndReason = callEndReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MissedCallPushNotificationEvent missedCallPushNotificationEvent = (MissedCallPushNotificationEvent) o;
		return Objects.equals(this.$type, missedCallPushNotificationEvent.$type) &&
				Objects.equals(this.timestamp, missedCallPushNotificationEvent.timestamp) &&
				Objects.equals(this.eventType, missedCallPushNotificationEvent.eventType) &&
				Objects.equals(this.accountId, missedCallPushNotificationEvent.accountId) &&
				Objects.equals(this.recipient, missedCallPushNotificationEvent.recipient) &&
				Objects.equals(this.locale, missedCallPushNotificationEvent.locale) &&
				Objects.equals(this.conversationId, missedCallPushNotificationEvent.conversationId) &&
				Objects.equals(this.deviceTokens, missedCallPushNotificationEvent.deviceTokens) &&
				Objects.equals(this.callState, missedCallPushNotificationEvent.callState) &&
				Objects.equals(this.callType, missedCallPushNotificationEvent.callType) &&
				Objects.equals(this.callStartTimestamp, missedCallPushNotificationEvent.callStartTimestamp) &&
				Objects.equals(this.callerName, missedCallPushNotificationEvent.callerName) &&
				Objects.equals(this.callerPersonId, missedCallPushNotificationEvent.callerPersonId) &&
				Objects.equals(this.callEndReason, missedCallPushNotificationEvent.callEndReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, recipient, locale, conversationId, deviceTokens, callState, callType, callStartTimestamp, callerName, callerPersonId, callEndReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MissedCallPushNotificationEvent {\n");
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
		sb.append("    callEndReason: ").append(toIndentedString(callEndReason)).append("\n");
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
