
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
 * An event triggered every time a participant is connected to a call
 */
@ApiModel(description = "An event triggered every time a participant is connected to a call")

@JsonPropertyOrder({
	CallParticipantConnectedEvent.JSON_PROPERTY_$_TYPE,
	CallParticipantConnectedEvent.JSON_PROPERTY_TIMESTAMP,
	CallParticipantConnectedEvent.JSON_PROPERTY_EVENT_TYPE,
	CallParticipantConnectedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CallParticipantConnectedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CallParticipantConnectedEvent.JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID,
	CallParticipantConnectedEvent.JSON_PROPERTY_SERVICE_PROVIDER_TYPE,
	CallParticipantConnectedEvent.JSON_PROPERTY_INITIATOR_PERSON_ID,
	CallParticipantConnectedEvent.JSON_PROPERTY_CALL_TYPE,
	CallParticipantConnectedEvent.JSON_PROPERTY_PERSON_ID,
	CallParticipantConnectedEvent.JSON_PROPERTY_JOINED_TIMESTAMP,
	CallParticipantConnectedEvent.JSON_PROPERTY_CONNECTED_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallParticipantConnectedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLPARTICIPANTCONNECTEDEVENT("CallParticipantConnectedEvent");

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
			return TypeEnum.CALLPARTICIPANTCONNECTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLPARTICIPANTCONNECTEDEVENT;

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

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_JOINED_TIMESTAMP = "joinedTimestamp";
	@JsonProperty(JSON_PROPERTY_JOINED_TIMESTAMP)
	private Long joinedTimestamp;

	public static final String JSON_PROPERTY_CONNECTED_TIMESTAMP = "connectedTimestamp";
	@JsonProperty(JSON_PROPERTY_CONNECTED_TIMESTAMP)
	private Long connectedTimestamp;

	public CallParticipantConnectedEvent $type(TypeEnum $type) {
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

	public CallParticipantConnectedEvent timestamp(Long timestamp) {
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

	public CallParticipantConnectedEvent eventType(String eventType) {
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

	public CallParticipantConnectedEvent accountId(String accountId) {
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

	public CallParticipantConnectedEvent conversationId(String conversationId) {
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

	public CallParticipantConnectedEvent serviceProviderCallId(String serviceProviderCallId) {
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

	public CallParticipantConnectedEvent serviceProviderType(ECallServiceProvider serviceProviderType) {
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

	public CallParticipantConnectedEvent initiatorPersonId(String initiatorPersonId) {
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

	public CallParticipantConnectedEvent callType(ECallType callType) {
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

	public CallParticipantConnectedEvent personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Person ID representing the participant
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "Person ID representing the participant")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public CallParticipantConnectedEvent joinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the participant joined the call and that particpant&#39;s connection phase started. Null if the participant never answered the call.
	 * For the participant initiating the call, this will be the same as the initiationTimestamp.
	 * 
	 * @return joinedTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the participant joined the call and that particpant's connection phase started. Null if the participant never answered the call. For the participant initiating the call, this will be the same as the initiationTimestamp.")
	public Long getJoinedTimestamp() {
		return joinedTimestamp;
	}

	public void setJoinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
	}

	public CallParticipantConnectedEvent connectedTimestamp(Long connectedTimestamp) {
		this.connectedTimestamp = connectedTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the participant connected to the call. Null if the participant never answered the call.
	 * 
	 * @return connectedTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the participant connected to the call. Null if the participant never answered the call.")
	public Long getConnectedTimestamp() {
		return connectedTimestamp;
	}

	public void setConnectedTimestamp(Long connectedTimestamp) {
		this.connectedTimestamp = connectedTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallParticipantConnectedEvent callParticipantConnectedEvent = (CallParticipantConnectedEvent) o;
		return Objects.equals(this.$type, callParticipantConnectedEvent.$type) &&
				Objects.equals(this.timestamp, callParticipantConnectedEvent.timestamp) &&
				Objects.equals(this.eventType, callParticipantConnectedEvent.eventType) &&
				Objects.equals(this.accountId, callParticipantConnectedEvent.accountId) &&
				Objects.equals(this.conversationId, callParticipantConnectedEvent.conversationId) &&
				Objects.equals(this.serviceProviderCallId, callParticipantConnectedEvent.serviceProviderCallId) &&
				Objects.equals(this.serviceProviderType, callParticipantConnectedEvent.serviceProviderType) &&
				Objects.equals(this.initiatorPersonId, callParticipantConnectedEvent.initiatorPersonId) &&
				Objects.equals(this.callType, callParticipantConnectedEvent.callType) &&
				Objects.equals(this.personId, callParticipantConnectedEvent.personId) &&
				Objects.equals(this.joinedTimestamp, callParticipantConnectedEvent.joinedTimestamp) &&
				Objects.equals(this.connectedTimestamp, callParticipantConnectedEvent.connectedTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, serviceProviderCallId, serviceProviderType, initiatorPersonId, callType, personId, joinedTimestamp, connectedTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallParticipantConnectedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    serviceProviderCallId: ").append(toIndentedString(serviceProviderCallId)).append("\n");
		sb.append("    serviceProviderType: ").append(toIndentedString(serviceProviderType)).append("\n");
		sb.append("    initiatorPersonId: ").append(toIndentedString(initiatorPersonId)).append("\n");
		sb.append("    callType: ").append(toIndentedString(callType)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    joinedTimestamp: ").append(toIndentedString(joinedTimestamp)).append("\n");
		sb.append("    connectedTimestamp: ").append(toIndentedString(connectedTimestamp)).append("\n");
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
