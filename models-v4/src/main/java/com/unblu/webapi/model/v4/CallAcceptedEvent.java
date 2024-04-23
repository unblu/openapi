
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
 * An event triggered every time a call is accepted and the connection phase of the participant accepting the call starts. A call is accepted when the first
 * participant answers the call.
 */
@ApiModel(description = "An event triggered every time a call is accepted and the connection phase of the participant accepting the call starts. A call is accepted when the first participant answers the call.")

@JsonPropertyOrder({
	CallAcceptedEvent.JSON_PROPERTY_$_TYPE,
	CallAcceptedEvent.JSON_PROPERTY_TIMESTAMP,
	CallAcceptedEvent.JSON_PROPERTY_EVENT_TYPE,
	CallAcceptedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CallAcceptedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CallAcceptedEvent.JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID,
	CallAcceptedEvent.JSON_PROPERTY_SERVICE_PROVIDER_TYPE,
	CallAcceptedEvent.JSON_PROPERTY_INITIATOR_PERSON_ID,
	CallAcceptedEvent.JSON_PROPERTY_CALL_TYPE,
	CallAcceptedEvent.JSON_PROPERTY_INITIATION_TIMESTAMP,
	CallAcceptedEvent.JSON_PROPERTY_ACCEPT_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallAcceptedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLACCEPTEDEVENT("CallAcceptedEvent");

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
			return TypeEnum.CALLACCEPTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLACCEPTEDEVENT;

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

	public static final String JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID = "serviceProviderCallId";
	@JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID)
	private String serviceProviderCallId;

	public static final String JSON_PROPERTY_SERVICE_PROVIDER_TYPE = "serviceProviderType";
	@JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER_TYPE)
	private ECallServiceProvider serviceProviderType;

	public static final String JSON_PROPERTY_INITIATOR_PERSON_ID = "initiatorPersonId";
	@JsonProperty(JSON_PROPERTY_INITIATOR_PERSON_ID)
	private String initiatorPersonId;

	public static final String JSON_PROPERTY_CALL_TYPE = "callType";
	@JsonProperty(JSON_PROPERTY_CALL_TYPE)
	private ECallType callType;

	public static final String JSON_PROPERTY_INITIATION_TIMESTAMP = "initiationTimestamp";
	@JsonProperty(JSON_PROPERTY_INITIATION_TIMESTAMP)
	private Long initiationTimestamp;

	public static final String JSON_PROPERTY_ACCEPT_TIMESTAMP = "acceptTimestamp";
	@JsonProperty(JSON_PROPERTY_ACCEPT_TIMESTAMP)
	private Long acceptTimestamp;

	public CallAcceptedEvent $type(TypeEnum $type) {
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

	public CallAcceptedEvent timestamp(Long timestamp) {
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

	public CallAcceptedEvent eventType(String eventType) {
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

	public CallAcceptedEvent accountId(String accountId) {
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

	public CallAcceptedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * ID of the conversation the call belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "ID of the conversation the call belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public CallAcceptedEvent serviceProviderCallId(String serviceProviderCallId) {
		this.serviceProviderCallId = serviceProviderCallId;
		return this;
	}

	/**
	 * The service provider call ID for the call
	 * 
	 * @return serviceProviderCallId
	 **/
	@ApiModelProperty(value = "The service provider call ID for the call")
	public String getServiceProviderCallId() {
		return serviceProviderCallId;
	}

	public void setServiceProviderCallId(String serviceProviderCallId) {
		this.serviceProviderCallId = serviceProviderCallId;
	}

	public CallAcceptedEvent serviceProviderType(ECallServiceProvider serviceProviderType) {
		this.serviceProviderType = serviceProviderType;
		return this;
	}

	/**
	 * Get serviceProviderType
	 * 
	 * @return serviceProviderType
	 **/
	@ApiModelProperty(value = "")
	public ECallServiceProvider getServiceProviderType() {
		return serviceProviderType;
	}

	public void setServiceProviderType(ECallServiceProvider serviceProviderType) {
		this.serviceProviderType = serviceProviderType;
	}

	public CallAcceptedEvent initiatorPersonId(String initiatorPersonId) {
		this.initiatorPersonId = initiatorPersonId;
		return this;
	}

	/**
	 * Person ID initiating the call
	 * 
	 * @return initiatorPersonId
	 **/
	@ApiModelProperty(value = "Person ID initiating the call")
	public String getInitiatorPersonId() {
		return initiatorPersonId;
	}

	public void setInitiatorPersonId(String initiatorPersonId) {
		this.initiatorPersonId = initiatorPersonId;
	}

	public CallAcceptedEvent callType(ECallType callType) {
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

	public CallAcceptedEvent initiationTimestamp(Long initiationTimestamp) {
		this.initiationTimestamp = initiationTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call was initiated
	 * 
	 * @return initiationTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call was initiated")
	public Long getInitiationTimestamp() {
		return initiationTimestamp;
	}

	public void setInitiationTimestamp(Long initiationTimestamp) {
		this.initiationTimestamp = initiationTimestamp;
	}

	public CallAcceptedEvent acceptTimestamp(Long acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call was first accepted by a participant and that particpant&#39;s connection phase started
	 * 
	 * @return acceptTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call was first accepted by a participant and that particpant's connection phase started")
	public Long getAcceptTimestamp() {
		return acceptTimestamp;
	}

	public void setAcceptTimestamp(Long acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallAcceptedEvent callAcceptedEvent = (CallAcceptedEvent) o;
		return Objects.equals(this.$type, callAcceptedEvent.$type) &&
				Objects.equals(this.timestamp, callAcceptedEvent.timestamp) &&
				Objects.equals(this.eventType, callAcceptedEvent.eventType) &&
				Objects.equals(this.accountId, callAcceptedEvent.accountId) &&
				Objects.equals(this.conversationId, callAcceptedEvent.conversationId) &&
				Objects.equals(this.serviceProviderCallId, callAcceptedEvent.serviceProviderCallId) &&
				Objects.equals(this.serviceProviderType, callAcceptedEvent.serviceProviderType) &&
				Objects.equals(this.initiatorPersonId, callAcceptedEvent.initiatorPersonId) &&
				Objects.equals(this.callType, callAcceptedEvent.callType) &&
				Objects.equals(this.initiationTimestamp, callAcceptedEvent.initiationTimestamp) &&
				Objects.equals(this.acceptTimestamp, callAcceptedEvent.acceptTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, serviceProviderCallId, serviceProviderType, initiatorPersonId, callType, initiationTimestamp, acceptTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallAcceptedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    serviceProviderCallId: ").append(toIndentedString(serviceProviderCallId)).append("\n");
		sb.append("    serviceProviderType: ").append(toIndentedString(serviceProviderType)).append("\n");
		sb.append("    initiatorPersonId: ").append(toIndentedString(initiatorPersonId)).append("\n");
		sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
		sb.append("    initiationTimestamp: ").append(toIndentedString(initiationTimestamp)).append("\n");
		sb.append("    acceptTimestamp: ").append(toIndentedString(acceptTimestamp)).append("\n");
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
