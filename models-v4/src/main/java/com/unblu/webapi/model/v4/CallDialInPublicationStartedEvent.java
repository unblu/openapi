
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
 * An event triggered when a dial-in publication for a call starts
 */
@ApiModel(description = "An event triggered when a dial-in publication for a call starts")

@JsonPropertyOrder({
	CallDialInPublicationStartedEvent.JSON_PROPERTY_$_TYPE,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_TIMESTAMP,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_EVENT_TYPE,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_ACCOUNT_ID,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_CONVERSATION_ID,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_SERVICE_PROVIDER_TYPE,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_INITIATOR_PERSON_ID,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_CALL_TYPE,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_PERSON_ID,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_DIAL_IN_SERVICE_PROVIDER_TYPE,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_DIAL_IN_ID,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_DIAL_IN_NUMBER,
	CallDialInPublicationStartedEvent.JSON_PROPERTY_START_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CallDialInPublicationStartedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALLDIALINPUBLICATIONSTARTEDEVENT("CallDialInPublicationStartedEvent");

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
			return TypeEnum.CALLDIALINPUBLICATIONSTARTEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALLDIALINPUBLICATIONSTARTEDEVENT;

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

	public static final String JSON_PROPERTY_DIAL_IN_SERVICE_PROVIDER_TYPE = "dialInServiceProviderType";
	@JsonProperty(JSON_PROPERTY_DIAL_IN_SERVICE_PROVIDER_TYPE)
	private EDialInServiceProvider dialInServiceProviderType;

	public static final String JSON_PROPERTY_DIAL_IN_ID = "dialInId";
	@JsonProperty(JSON_PROPERTY_DIAL_IN_ID)
	private String dialInId;

	public static final String JSON_PROPERTY_DIAL_IN_NUMBER = "dialInNumber";
	@JsonProperty(JSON_PROPERTY_DIAL_IN_NUMBER)
	private String dialInNumber;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public CallDialInPublicationStartedEvent $type(TypeEnum $type) {
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

	public CallDialInPublicationStartedEvent timestamp(Long timestamp) {
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

	public CallDialInPublicationStartedEvent eventType(String eventType) {
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

	public CallDialInPublicationStartedEvent accountId(String accountId) {
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

	public CallDialInPublicationStartedEvent conversationId(String conversationId) {
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

	public CallDialInPublicationStartedEvent serviceProviderCallId(String serviceProviderCallId) {
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

	public CallDialInPublicationStartedEvent serviceProviderType(ECallServiceProvider serviceProviderType) {
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

	public CallDialInPublicationStartedEvent initiatorPersonId(String initiatorPersonId) {
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

	public CallDialInPublicationStartedEvent callType(ECallType callType) {
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

	public CallDialInPublicationStartedEvent personId(String personId) {
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

	public CallDialInPublicationStartedEvent dialInServiceProviderType(EDialInServiceProvider dialInServiceProviderType) {
		this.dialInServiceProviderType = dialInServiceProviderType;
		return this;
	}

	/**
	 * Get dialInServiceProviderType
	 * 
	 * @return dialInServiceProviderType
	 **/
	@ApiModelProperty(value = "")
	public EDialInServiceProvider getDialInServiceProviderType() {
		return dialInServiceProviderType;
	}

	public void setDialInServiceProviderType(EDialInServiceProvider dialInServiceProviderType) {
		this.dialInServiceProviderType = dialInServiceProviderType;
	}

	public CallDialInPublicationStartedEvent dialInId(String dialInId) {
		this.dialInId = dialInId;
		return this;
	}

	/**
	 * Dial-in ID of dial-in service provider
	 * 
	 * @return dialInId
	 **/
	@ApiModelProperty(value = "Dial-in ID of dial-in service provider")
	public String getDialInId() {
		return dialInId;
	}

	public void setDialInId(String dialInId) {
		this.dialInId = dialInId;
	}

	public CallDialInPublicationStartedEvent dialInNumber(String dialInNumber) {
		this.dialInNumber = dialInNumber;
		return this;
	}

	/**
	 * Dial-in phone number used for the publication
	 * 
	 * @return dialInNumber
	 **/
	@ApiModelProperty(value = "Dial-in phone number used for the publication")
	public String getDialInNumber() {
		return dialInNumber;
	}

	public void setDialInNumber(String dialInNumber) {
		this.dialInNumber = dialInNumber;
	}

	public CallDialInPublicationStartedEvent startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the dial-in publication started
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the dial-in publication started")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CallDialInPublicationStartedEvent callDialInPublicationStartedEvent = (CallDialInPublicationStartedEvent) o;
		return Objects.equals(this.$type, callDialInPublicationStartedEvent.$type) &&
				Objects.equals(this.timestamp, callDialInPublicationStartedEvent.timestamp) &&
				Objects.equals(this.eventType, callDialInPublicationStartedEvent.eventType) &&
				Objects.equals(this.accountId, callDialInPublicationStartedEvent.accountId) &&
				Objects.equals(this.conversationId, callDialInPublicationStartedEvent.conversationId) &&
				Objects.equals(this.serviceProviderCallId, callDialInPublicationStartedEvent.serviceProviderCallId) &&
				Objects.equals(this.serviceProviderType, callDialInPublicationStartedEvent.serviceProviderType) &&
				Objects.equals(this.initiatorPersonId, callDialInPublicationStartedEvent.initiatorPersonId) &&
				Objects.equals(this.callType, callDialInPublicationStartedEvent.callType) &&
				Objects.equals(this.personId, callDialInPublicationStartedEvent.personId) &&
				Objects.equals(this.dialInServiceProviderType, callDialInPublicationStartedEvent.dialInServiceProviderType) &&
				Objects.equals(this.dialInId, callDialInPublicationStartedEvent.dialInId) &&
				Objects.equals(this.dialInNumber, callDialInPublicationStartedEvent.dialInNumber) &&
				Objects.equals(this.startTimestamp, callDialInPublicationStartedEvent.startTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversationId, serviceProviderCallId, serviceProviderType, initiatorPersonId, callType, personId, dialInServiceProviderType, dialInId, dialInNumber, startTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CallDialInPublicationStartedEvent {\n");
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
		sb.append("    dialInServiceProviderType: ").append(toIndentedString(dialInServiceProviderType)).append("\n");
		sb.append("    dialInId: ").append(toIndentedString(dialInId)).append("\n");
		sb.append("    dialInNumber: ").append(toIndentedString(dialInNumber)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
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
