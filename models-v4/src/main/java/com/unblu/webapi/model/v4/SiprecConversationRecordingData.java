
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
 * A recording made by external recording servers over SIPREC. It covers one start-to-stop cycle of one call; the recording servers store the audio.
 */
@ApiModel(description = "A recording made by external recording servers over SIPREC. It covers one start-to-stop cycle of one call; the recording servers store the audio.")

@JsonPropertyOrder({
	SiprecConversationRecordingData.JSON_PROPERTY_$_TYPE,
	SiprecConversationRecordingData.JSON_PROPERTY_ID,
	SiprecConversationRecordingData.JSON_PROPERTY_ACCOUNT_ID,
	SiprecConversationRecordingData.JSON_PROPERTY_CONVERSATION_ID,
	SiprecConversationRecordingData.JSON_PROPERTY_CALL_IDS,
	SiprecConversationRecordingData.JSON_PROPERTY_RECORDING_SYSTEM,
	SiprecConversationRecordingData.JSON_PROPERTY_START_TIMESTAMP,
	SiprecConversationRecordingData.JSON_PROPERTY_END_TIMESTAMP,
	SiprecConversationRecordingData.JSON_PROPERTY_STATUS,
	SiprecConversationRecordingData.JSON_PROPERTY_SESSIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SiprecConversationRecordingData implements ConversationRecordingData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SIPRECCONVERSATIONRECORDINGDATA("SiprecConversationRecordingData");

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
			return TypeEnum.SIPRECCONVERSATIONRECORDINGDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SIPRECCONVERSATIONRECORDINGDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_CALL_IDS = "callIds";
	@JsonProperty(JSON_PROPERTY_CALL_IDS)
	private List<String> callIds = null;

	public static final String JSON_PROPERTY_RECORDING_SYSTEM = "recordingSystem";
	@JsonProperty(JSON_PROPERTY_RECORDING_SYSTEM)
	private ERecordingSystem recordingSystem = ERecordingSystem.SIPREC;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private ESiprecRecordingStatus status;

	public static final String JSON_PROPERTY_SESSIONS = "sessions";
	@JsonProperty(JSON_PROPERTY_SESSIONS)
	private List<SiprecRecordingSessionData> sessions = null;

	public SiprecConversationRecordingData $type(TypeEnum $type) {
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

	public SiprecConversationRecordingData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID of the recording
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The ID of the recording")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SiprecConversationRecordingData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The ID of the account the recording belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The ID of the account the recording belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public SiprecConversationRecordingData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the recording belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the recording belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public SiprecConversationRecordingData callIds(List<String> callIds) {
		this.callIds = callIds;
		return this;
	}

	public SiprecConversationRecordingData addCallIdsItem(String callIdsItem) {
		if (this.callIds == null) {
			this.callIds = new ArrayList<>();
		}
		this.callIds.add(callIdsItem);
		return this;
	}

	/**
	 * The IDs of the calls held during the recording
	 * 
	 * @return callIds
	 **/
	@ApiModelProperty(value = "The IDs of the calls held during the recording")
	public List<String> getCallIds() {
		return callIds;
	}

	public void setCallIds(List<String> callIds) {
		this.callIds = callIds;
	}

	public SiprecConversationRecordingData recordingSystem(ERecordingSystem recordingSystem) {
		this.recordingSystem = recordingSystem;
		return this;
	}

	/**
	 * Get recordingSystem
	 * 
	 * @return recordingSystem
	 **/
	@ApiModelProperty(required = true, value = "")
	public ERecordingSystem getRecordingSystem() {
		return recordingSystem;
	}

	public void setRecordingSystem(ERecordingSystem recordingSystem) {
		this.recordingSystem = recordingSystem;
	}

	public SiprecConversationRecordingData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the recording started
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the recording started")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public SiprecConversationRecordingData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the recording ended. Empty while the recording is running.
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the recording ended. Empty while the recording is running.")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public SiprecConversationRecordingData status(ESiprecRecordingStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public ESiprecRecordingStatus getStatus() {
		return status;
	}

	public void setStatus(ESiprecRecordingStatus status) {
		this.status = status;
	}

	public SiprecConversationRecordingData sessions(List<SiprecRecordingSessionData> sessions) {
		this.sessions = sessions;
		return this;
	}

	public SiprecConversationRecordingData addSessionsItem(SiprecRecordingSessionData sessionsItem) {
		if (this.sessions == null) {
			this.sessions = new ArrayList<>();
		}
		this.sessions.add(sessionsItem);
		return this;
	}

	/**
	 * The session each recording server received, at most one per recording server. A recording server that refused the recording from the start has none.
	 * 
	 * @return sessions
	 **/
	@ApiModelProperty(value = "The session each recording server received, at most one per recording server. A recording server that refused the recording from the start has none.")
	public List<SiprecRecordingSessionData> getSessions() {
		return sessions;
	}

	public void setSessions(List<SiprecRecordingSessionData> sessions) {
		this.sessions = sessions;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SiprecConversationRecordingData siprecConversationRecordingData = (SiprecConversationRecordingData) o;
		return Objects.equals(this.$type, siprecConversationRecordingData.$type) &&
				Objects.equals(this.id, siprecConversationRecordingData.id) &&
				Objects.equals(this.accountId, siprecConversationRecordingData.accountId) &&
				Objects.equals(this.conversationId, siprecConversationRecordingData.conversationId) &&
				Objects.equals(this.callIds, siprecConversationRecordingData.callIds) &&
				Objects.equals(this.recordingSystem, siprecConversationRecordingData.recordingSystem) &&
				Objects.equals(this.startTimestamp, siprecConversationRecordingData.startTimestamp) &&
				Objects.equals(this.endTimestamp, siprecConversationRecordingData.endTimestamp) &&
				Objects.equals(this.status, siprecConversationRecordingData.status) &&
				Objects.equals(this.sessions, siprecConversationRecordingData.sessions);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, conversationId, callIds, recordingSystem, startTimestamp, endTimestamp, status, sessions);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SiprecConversationRecordingData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    callIds: ").append(toIndentedString(callIds)).append("\n");
		sb.append("    recordingSystem: ").append(toIndentedString(recordingSystem)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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
