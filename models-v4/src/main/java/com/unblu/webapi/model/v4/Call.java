
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
 * Call metadata class
 */
@ApiModel(description = "Call metadata class")

@JsonPropertyOrder({
	Call.JSON_PROPERTY_$_TYPE,
	Call.JSON_PROPERTY_ID,
	Call.JSON_PROPERTY_CREATION_TIMESTAMP,
	Call.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	Call.JSON_PROPERTY_ACCOUNT_ID,
	Call.JSON_PROPERTY_CONVERSATION_ID,
	Call.JSON_PROPERTY_SERVICE_PROVIDER_CALL_ID,
	Call.JSON_PROPERTY_SERVICE_PROVIDER_TYPE,
	Call.JSON_PROPERTY_INITIATOR_PERSON_ID,
	Call.JSON_PROPERTY_CALL_TYPE,
	Call.JSON_PROPERTY_INITIATION_TIMESTAMP,
	Call.JSON_PROPERTY_ACCEPT_TIMESTAMP,
	Call.JSON_PROPERTY_ESTABLISHED_TIMESTAMP,
	Call.JSON_PROPERTY_END_TIMESTAMP,
	Call.JSON_PROPERTY_END_REASON,
	Call.JSON_PROPERTY_PARTICIPATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Call {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CALL("Call");

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
			return TypeEnum.CALL;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CALL;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

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

	public static final String JSON_PROPERTY_PARTICIPATIONS = "participations";
	@JsonProperty(JSON_PROPERTY_PARTICIPATIONS)
	private List<CallParticipation> participations = null;

	public Call $type(TypeEnum $type) {
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

	public Call id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the entity. When creating an entity, this property can be omitted; it&#39;s generated by the server.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the entity. When creating an entity, this property can be omitted; it's generated by the server.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Call creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be
	 * omitted. Note: If you set this property, Unblu returns the same value, but it isn&#39;t written to storage and doesn&#39;t affect data consistency..
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Creation timestamp of the entity. It is defined when the entity is first stored in Unblu. Any value sent to the Unblu server is ignored, so it can be omitted. Note: If you set this property, Unblu returns the same value, but it isn't written to storage and doesn't affect data consistency..")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Call modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational
	 * character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it
	 * will not be written to the storage and will not effect the data consistency.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp of the last modification. This property is always optional and can be omitted, when sending data to the server. It is only of informational character. It is ignored, when sending it to the server and therefore can be omitted. Note: If you set this property it will return the same value but it will not be written to the storage and will not effect the data consistency.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public Call accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the
	 * user currently logged in. When editing an entity, you must include the account ID.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the entity belongs to. When creating an entity, the account ID can be omitted. It is filled by the Unblu server with the account ID of the user currently logged in. When editing an entity, you must include the account ID.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public Call conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation ID the call belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation ID the call belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public Call serviceProviderCallId(String serviceProviderCallId) {
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

	public Call serviceProviderType(ECallServiceProvider serviceProviderType) {
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

	public Call initiatorPersonId(String initiatorPersonId) {
		this.initiatorPersonId = initiatorPersonId;
		return this;
	}

	/**
	 * The call initiator&#39;s person ID
	 * 
	 * @return initiatorPersonId
	 **/
	@ApiModelProperty(value = "The call initiator's person ID")
	public String getInitiatorPersonId() {
		return initiatorPersonId;
	}

	public void setInitiatorPersonId(String initiatorPersonId) {
		this.initiatorPersonId = initiatorPersonId;
	}

	public Call callType(ECallType callType) {
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

	public Call initiationTimestamp(Long initiationTimestamp) {
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

	public Call acceptTimestamp(Long acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
		return this;
	}

	/**
	 * UTC timestamp (ms) when the call was first accepted by a participant and that participant&#39;s connection phase started
	 * 
	 * @return acceptTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp (ms) when the call was first accepted by a participant and that participant's connection phase started")
	public Long getAcceptTimestamp() {
		return acceptTimestamp;
	}

	public void setAcceptTimestamp(Long acceptTimestamp) {
		this.acceptTimestamp = acceptTimestamp;
	}

	public Call establishedTimestamp(Long establishedTimestamp) {
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

	public Call endTimestamp(Long endTimestamp) {
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

	public Call endReason(ECallEndReason endReason) {
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

	public Call participations(List<CallParticipation> participations) {
		this.participations = participations;
		return this;
	}

	public Call addParticipationsItem(CallParticipation participationsItem) {
		if (this.participations == null) {
			this.participations = new ArrayList<>();
		}
		this.participations.add(participationsItem);
		return this;
	}

	/**
	 * Get participations
	 * 
	 * @return participations
	 **/
	@ApiModelProperty(value = "")
	public List<CallParticipation> getParticipations() {
		return participations;
	}

	public void setParticipations(List<CallParticipation> participations) {
		this.participations = participations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Call call = (Call) o;
		return Objects.equals(this.$type, call.$type) &&
				Objects.equals(this.id, call.id) &&
				Objects.equals(this.creationTimestamp, call.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, call.modificationTimestamp) &&
				Objects.equals(this.accountId, call.accountId) &&
				Objects.equals(this.conversationId, call.conversationId) &&
				Objects.equals(this.serviceProviderCallId, call.serviceProviderCallId) &&
				Objects.equals(this.serviceProviderType, call.serviceProviderType) &&
				Objects.equals(this.initiatorPersonId, call.initiatorPersonId) &&
				Objects.equals(this.callType, call.callType) &&
				Objects.equals(this.initiationTimestamp, call.initiationTimestamp) &&
				Objects.equals(this.acceptTimestamp, call.acceptTimestamp) &&
				Objects.equals(this.establishedTimestamp, call.establishedTimestamp) &&
				Objects.equals(this.endTimestamp, call.endTimestamp) &&
				Objects.equals(this.endReason, call.endReason) &&
				Objects.equals(this.participations, call.participations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, accountId, conversationId, serviceProviderCallId, serviceProviderType, initiatorPersonId, callType, initiationTimestamp, acceptTimestamp, establishedTimestamp, endTimestamp, endReason, participations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Call {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
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
		sb.append("    participations: ").append(toIndentedString(participations)).append("\n");
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