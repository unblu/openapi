
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
 * An event triggered every time a call ends
 */
@ApiModel(description = "An event triggered every time a call ends")

@JsonPropertyOrder({
	CallEndedEvent.JSON_PROPERTY_$_TYPE,
	CallEndedEvent.JSON_PROPERTY_TIMESTAMP,
	CallEndedEvent.JSON_PROPERTY_EVENT_TYPE,
	CallEndedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CallEndedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CallEndedEvent.JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID,
	CallEndedEvent.JSON_PROPERTY_SERVICE_PROVIDER_TYPE,
	CallEndedEvent.JSON_PROPERTY_INITIATOR_PERSON_ID,
	CallEndedEvent.JSON_PROPERTY_CALL_TYPE,
	CallEndedEvent.JSON_PROPERTY_INITIATION_TIMESTAMP,
	CallEndedEvent.JSON_PROPERTY_ACCEPT_TIMESTAMP,
	CallEndedEvent.JSON_PROPERTY_ESTABLISHED_TIMESTAMP,
	CallEndedEvent.JSON_PROPERTY_END_TIMESTAMP,
	CallEndedEvent.JSON_PROPERTY_END_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallEndedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLENDEDEVENT("CallEndedEvent");

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
			return TypeEnum.CALLENDEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLENDEDEVENT;

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

	public static final String JSON_PROPERTY_ESTABLISHED_TIMESTAMP = "establishedTimestamp";
	@JsonProperty(JSON_PROPERTY_ESTABLISHED_TIMESTAMP)
	private Long establishedTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private ECallEndReason endReason;

	public CallEndedEvent $type(TypeEnum $type) {
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

	public CallEndedEvent timestamp(Long timestamp) {
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

	public CallEndedEvent eventType(String eventType) {
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

	public CallEndedEvent accountId(String accountId) {
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

	public CallEndedEvent conversationId(String conversationId) {
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

	public CallEndedEvent serviceProviderCallId(String serviceProviderCallId) {
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

	public CallEndedEvent serviceProviderType(ECallServiceProvider serviceProviderType) {
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

	public CallEndedEvent initiatorPersonId(String initiatorPersonId) {
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

	public CallEndedEvent callType(ECallType callType) {
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

	public CallEndedEvent initiationTimestamp(Long initiationTimestamp) {
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

	public CallEndedEvent acceptTimestamp(Long acceptTimestamp) {
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

	public CallEndedEvent establishedTimestamp(Long establishedTimestamp) {
		this.establishedTimestamp = establishedTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when at least two participants successfully connected to the call service provider
	 * 
	 * @return establishedTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when at least two participants successfully connected to the call service provider")
	public Long getEstablishedTimestamp() {
		return establishedTimestamp;
	}

	public void setEstablishedTimestamp(Long establishedTimestamp) {
		this.establishedTimestamp = establishedTimestamp;
	}

	public CallEndedEvent endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call ended
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call ended")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public CallEndedEvent endReason(ECallEndReason endReason) {
		this.endReason = endReason;
		return this;
	}

	/**
	 * Get endReason
	 * 
	 * @return endReason
	 **/
	@ApiModelProperty(value = "")
	public ECallEndReason getEndReason() {
		return endReason;
	}

	public void setEndReason(ECallEndReason endReason) {
		this.endReason = endReason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallEndedEvent callEndedEvent = (CallEndedEvent) o;
		return Objects.equals(this.$type, callEndedEvent.$type) &&
				Objects.equals(this.timestamp, callEndedEvent.timestamp) &&
				Objects.equals(this.eventType, callEndedEvent.eventType) &&
				Objects.equals(this.accountId, callEndedEvent.accountId) &&
				Objects.equals(this.conversationId, callEndedEvent.conversationId) &&
				Objects.equals(this.serviceProviderCallId, callEndedEvent.serviceProviderCallId) &&
				Objects.equals(this.serviceProviderType, callEndedEvent.serviceProviderType) &&
				Objects.equals(this.initiatorPersonId, callEndedEvent.initiatorPersonId) &&
				Objects.equals(this.callType, callEndedEvent.callType) &&
				Objects.equals(this.initiationTimestamp, callEndedEvent.initiationTimestamp) &&
				Objects.equals(this.acceptTimestamp, callEndedEvent.acceptTimestamp) &&
				Objects.equals(this.establishedTimestamp, callEndedEvent.establishedTimestamp) &&
				Objects.equals(this.endTimestamp, callEndedEvent.endTimestamp) &&
				Objects.equals(this.endReason, callEndedEvent.endReason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, serviceProviderCallId, serviceProviderType, initiatorPersonId, callType, initiationTimestamp, acceptTimestamp, establishedTimestamp, endTimestamp, endReason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallEndedEvent {\n");
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
		sb.append("    establishedTimestamp: ").append(toIndentedString(establishedTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
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
