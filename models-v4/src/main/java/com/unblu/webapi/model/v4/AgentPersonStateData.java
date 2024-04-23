
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
 * State data of an agent person&lt;br&gt;
 */
@ApiModel(description = "State data of an agent person<br>")

@JsonPropertyOrder({
	AgentPersonStateData.JSON_PROPERTY_$_TYPE,
	AgentPersonStateData.JSON_PROPERTY_PERSON_ID,
	AgentPersonStateData.JSON_PROPERTY_ONLINE_STATE,
	AgentPersonStateData.JSON_PROPERTY_TYPE,
	AgentPersonStateData.JSON_PROPERTY_STATUS_MESSAGE,
	AgentPersonStateData.JSON_PROPERTY_PAUSE_NOTIFICATIONS_MODE,
	AgentPersonStateData.JSON_PROPERTY_PAUSE_NOTIFICATIONS_STATE,
	AgentPersonStateData.JSON_PROPERTY_PAUSE_NOTIFICATIONS_END_TIMESTAMP,
	AgentPersonStateData.JSON_PROPERTY_AUTO_PAUSE_NOTIFICATIONS_REASONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AgentPersonStateData implements PersonStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AGENTPERSONSTATEDATA("AgentPersonStateData");

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
			return TypeEnum.AGENTPERSONSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AGENTPERSONSTATEDATA;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_ONLINE_STATE = "onlineState";
	@JsonProperty(JSON_PROPERTY_ONLINE_STATE)
	private EOnlineState onlineState;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPersonStateType type = EPersonStateType.AGENT;

	public static final String JSON_PROPERTY_STATUS_MESSAGE = "statusMessage";
	@JsonProperty(JSON_PROPERTY_STATUS_MESSAGE)
	private String statusMessage;

	public static final String JSON_PROPERTY_PAUSE_NOTIFICATIONS_MODE = "pauseNotificationsMode";
	@JsonProperty(JSON_PROPERTY_PAUSE_NOTIFICATIONS_MODE)
	private EPauseNotificationsMode pauseNotificationsMode;

	public static final String JSON_PROPERTY_PAUSE_NOTIFICATIONS_STATE = "pauseNotificationsState";
	@JsonProperty(JSON_PROPERTY_PAUSE_NOTIFICATIONS_STATE)
	private EPauseNotificationsState pauseNotificationsState;

	public static final String JSON_PROPERTY_PAUSE_NOTIFICATIONS_END_TIMESTAMP = "pauseNotificationsEndTimestamp";
	@JsonProperty(JSON_PROPERTY_PAUSE_NOTIFICATIONS_END_TIMESTAMP)
	private Long pauseNotificationsEndTimestamp;

	public static final String JSON_PROPERTY_AUTO_PAUSE_NOTIFICATIONS_REASONS = "autoPauseNotificationsReasons";
	@JsonProperty(JSON_PROPERTY_AUTO_PAUSE_NOTIFICATIONS_REASONS)
	private List<AutoPauseNotificationsReasonData> autoPauseNotificationsReasons = null;

	public AgentPersonStateData $type(TypeEnum $type) {
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

	public AgentPersonStateData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The ID of the person this state data belongs to
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The ID of the person this state data belongs to")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public AgentPersonStateData onlineState(EOnlineState onlineState) {
		this.onlineState = onlineState;
		return this;
	}

	/**
	 * Get onlineState
	 * 
	 * @return onlineState
	 **/
	@ApiModelProperty(value = "")
	public EOnlineState getOnlineState() {
		return onlineState;
	}

	public void setOnlineState(EOnlineState onlineState) {
		this.onlineState = onlineState;
	}

	public AgentPersonStateData type(EPersonStateType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPersonStateType getType() {
		return type;
	}

	public void setType(EPersonStateType type) {
		this.type = type;
	}

	public AgentPersonStateData statusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
		return this;
	}

	/**
	 * The agent&#39;s status message. The message is displayed in the person&#39;s details in the UI.
	 * 
	 * @return statusMessage
	 **/
	@ApiModelProperty(value = "The agent's status message. The message is displayed in the person's details in the UI.")
	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public AgentPersonStateData pauseNotificationsMode(EPauseNotificationsMode pauseNotificationsMode) {
		this.pauseNotificationsMode = pauseNotificationsMode;
		return this;
	}

	/**
	 * Get pauseNotificationsMode
	 * 
	 * @return pauseNotificationsMode
	 **/
	@ApiModelProperty(value = "")
	public EPauseNotificationsMode getPauseNotificationsMode() {
		return pauseNotificationsMode;
	}

	public void setPauseNotificationsMode(EPauseNotificationsMode pauseNotificationsMode) {
		this.pauseNotificationsMode = pauseNotificationsMode;
	}

	public AgentPersonStateData pauseNotificationsState(EPauseNotificationsState pauseNotificationsState) {
		this.pauseNotificationsState = pauseNotificationsState;
		return this;
	}

	/**
	 * Get pauseNotificationsState
	 * 
	 * @return pauseNotificationsState
	 **/
	@ApiModelProperty(value = "")
	public EPauseNotificationsState getPauseNotificationsState() {
		return pauseNotificationsState;
	}

	public void setPauseNotificationsState(EPauseNotificationsState pauseNotificationsState) {
		this.pauseNotificationsState = pauseNotificationsState;
	}

	public AgentPersonStateData pauseNotificationsEndTimestamp(Long pauseNotificationsEndTimestamp) {
		this.pauseNotificationsEndTimestamp = pauseNotificationsEndTimestamp;
		return this;
	}

	/**
	 * The Unix timestamp (ms) when pausing notifications should end
	 * 
	 * @return pauseNotificationsEndTimestamp
	 **/
	@ApiModelProperty(value = "The Unix timestamp (ms) when pausing notifications should end")
	public Long getPauseNotificationsEndTimestamp() {
		return pauseNotificationsEndTimestamp;
	}

	public void setPauseNotificationsEndTimestamp(Long pauseNotificationsEndTimestamp) {
		this.pauseNotificationsEndTimestamp = pauseNotificationsEndTimestamp;
	}

	public AgentPersonStateData autoPauseNotificationsReasons(List<AutoPauseNotificationsReasonData> autoPauseNotificationsReasons) {
		this.autoPauseNotificationsReasons = autoPauseNotificationsReasons;
		return this;
	}

	public AgentPersonStateData addAutoPauseNotificationsReasonsItem(AutoPauseNotificationsReasonData autoPauseNotificationsReasonsItem) {
		if (this.autoPauseNotificationsReasons == null) {
			this.autoPauseNotificationsReasons = new ArrayList<>();
		}
		this.autoPauseNotificationsReasons.add(autoPauseNotificationsReasonsItem);
		return this;
	}

	/**
	 * A list of reasons based on which the agent&#39;s notifications should be auto-paused
	 * 
	 * @return autoPauseNotificationsReasons
	 **/
	@ApiModelProperty(value = "A list of reasons based on which the agent's notifications should be auto-paused")
	public List<AutoPauseNotificationsReasonData> getAutoPauseNotificationsReasons() {
		return autoPauseNotificationsReasons;
	}

	public void setAutoPauseNotificationsReasons(List<AutoPauseNotificationsReasonData> autoPauseNotificationsReasons) {
		this.autoPauseNotificationsReasons = autoPauseNotificationsReasons;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AgentPersonStateData agentPersonStateData = (AgentPersonStateData) o;
		return Objects.equals(this.$type, agentPersonStateData.$type) &&
				Objects.equals(this.personId, agentPersonStateData.personId) &&
				Objects.equals(this.onlineState, agentPersonStateData.onlineState) &&
				Objects.equals(this.type, agentPersonStateData.type) &&
				Objects.equals(this.statusMessage, agentPersonStateData.statusMessage) &&
				Objects.equals(this.pauseNotificationsMode, agentPersonStateData.pauseNotificationsMode) &&
				Objects.equals(this.pauseNotificationsState, agentPersonStateData.pauseNotificationsState) &&
				Objects.equals(this.pauseNotificationsEndTimestamp, agentPersonStateData.pauseNotificationsEndTimestamp) &&
				Objects.equals(this.autoPauseNotificationsReasons, agentPersonStateData.autoPauseNotificationsReasons);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, personId, onlineState, type, statusMessage, pauseNotificationsMode, pauseNotificationsState, pauseNotificationsEndTimestamp, autoPauseNotificationsReasons);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgentPersonStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    onlineState: ").append(toIndentedString(onlineState)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
		sb.append("    pauseNotificationsMode: ").append(toIndentedString(pauseNotificationsMode)).append("\n");
		sb.append("    pauseNotificationsState: ").append(toIndentedString(pauseNotificationsState)).append("\n");
		sb.append("    pauseNotificationsEndTimestamp: ").append(toIndentedString(pauseNotificationsEndTimestamp)).append("\n");
		sb.append("    autoPauseNotificationsReasons: ").append(toIndentedString(autoPauseNotificationsReasons)).append("\n");
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
