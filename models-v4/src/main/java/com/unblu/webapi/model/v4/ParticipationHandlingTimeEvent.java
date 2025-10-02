
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
 * An event triggered every time an assigned agent&#39;s handling of a conversation ends:&lt;br&gt; - If the conversation is forwarded to another agent, team,
 * or named area&lt;br&gt; - If the agent leaves the conversation&lt;br&gt; - If the conversation ends
 */
@ApiModel(description = "An event triggered every time an assigned agent's handling of a conversation ends:<br> - If the conversation is forwarded to another agent, team, or named area<br> - If the agent leaves the conversation<br> - If the conversation ends")

@JsonPropertyOrder({
	ParticipationHandlingTimeEvent.JSON_PROPERTY_$_TYPE,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_TIMESTAMP,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_EVENT_TYPE,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_ACCOUNT_ID,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_PARTICIPATION,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_CONVERSATION,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_START_TIMESTAMP,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_RESOLUTION_TIMESTAMP,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_HANDLING_TIME,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_RESOLUTION_TYPE,
	ParticipationHandlingTimeEvent.JSON_PROPERTY_CONTEXT_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ParticipationHandlingTimeEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PARTICIPATIONHANDLINGTIMEEVENT("ParticipationHandlingTimeEvent");

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
			return TypeEnum.PARTICIPATIONHANDLINGTIMEEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PARTICIPATIONHANDLINGTIMEEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_PARTICIPATION = "participation";
	@JsonProperty(JSON_PROPERTY_PARTICIPATION)
	private ConversationParticipationData participation = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_RESOLUTION_TIMESTAMP = "resolutionTimestamp";
	@JsonProperty(JSON_PROPERTY_RESOLUTION_TIMESTAMP)
	private Long resolutionTimestamp;

	public static final String JSON_PROPERTY_HANDLING_TIME = "handlingTime";
	@JsonProperty(JSON_PROPERTY_HANDLING_TIME)
	private Long handlingTime;

	public static final String JSON_PROPERTY_RESOLUTION_TYPE = "resolutionType";
	@JsonProperty(JSON_PROPERTY_RESOLUTION_TYPE)
	private EHandlingTimeTrigger resolutionType;

	public static final String JSON_PROPERTY_CONTEXT_PERSON = "contextPerson";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON)
	private PersonData contextPerson = null;

	public ParticipationHandlingTimeEvent $type(TypeEnum $type) {
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

	public ParticipationHandlingTimeEvent timestamp(Long timestamp) {
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

	public ParticipationHandlingTimeEvent eventType(String eventType) {
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

	public ParticipationHandlingTimeEvent accountId(String accountId) {
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

	public ParticipationHandlingTimeEvent participation(ConversationParticipationData participation) {
		this.participation = participation;
		return this;
	}

	/**
	 * Get participation
	 * 
	 * @return participation
	 **/
	@ApiModelProperty(value = "")
	public ConversationParticipationData getParticipation() {
		return participation;
	}

	public void setParticipation(ConversationParticipationData participation) {
		this.participation = participation;
	}

	public ParticipationHandlingTimeEvent conversation(ConversationData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationData conversation) {
		this.conversation = conversation;
	}

	public ParticipationHandlingTimeEvent startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * The start timestamp of handling.
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "The start timestamp of handling.")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public ParticipationHandlingTimeEvent resolutionTimestamp(Long resolutionTimestamp) {
		this.resolutionTimestamp = resolutionTimestamp;
		return this;
	}

	/**
	 * The end timestamp of handling.
	 * 
	 * @return resolutionTimestamp
	 **/
	@ApiModelProperty(value = "The end timestamp of handling.")
	public Long getResolutionTimestamp() {
		return resolutionTimestamp;
	}

	public void setResolutionTimestamp(Long resolutionTimestamp) {
		this.resolutionTimestamp = resolutionTimestamp;
	}

	public ParticipationHandlingTimeEvent handlingTime(Long handlingTime) {
		this.handlingTime = handlingTime;
		return this;
	}

	/**
	 * The total handling time in milliseconds.
	 * 
	 * @return handlingTime
	 **/
	@ApiModelProperty(value = "The total handling time in milliseconds.")
	public Long getHandlingTime() {
		return handlingTime;
	}

	public void setHandlingTime(Long handlingTime) {
		this.handlingTime = handlingTime;
	}

	public ParticipationHandlingTimeEvent resolutionType(EHandlingTimeTrigger resolutionType) {
		this.resolutionType = resolutionType;
		return this;
	}

	/**
	 * Get resolutionType
	 * 
	 * @return resolutionType
	 **/
	@ApiModelProperty(value = "")
	public EHandlingTimeTrigger getResolutionType() {
		return resolutionType;
	}

	public void setResolutionType(EHandlingTimeTrigger resolutionType) {
		this.resolutionType = resolutionType;
	}

	public ParticipationHandlingTimeEvent contextPerson(PersonData contextPerson) {
		this.contextPerson = contextPerson;
		return this;
	}

	/**
	 * Get contextPerson
	 * 
	 * @return contextPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getContextPerson() {
		return contextPerson;
	}

	public void setContextPerson(PersonData contextPerson) {
		this.contextPerson = contextPerson;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ParticipationHandlingTimeEvent participationHandlingTimeEvent = (ParticipationHandlingTimeEvent) o;
		return Objects.equals(this.$type, participationHandlingTimeEvent.$type) &&
				Objects.equals(this.timestamp, participationHandlingTimeEvent.timestamp) &&
				Objects.equals(this.eventType, participationHandlingTimeEvent.eventType) &&
				Objects.equals(this.accountId, participationHandlingTimeEvent.accountId) &&
				Objects.equals(this.participation, participationHandlingTimeEvent.participation) &&
				Objects.equals(this.conversation, participationHandlingTimeEvent.conversation) &&
				Objects.equals(this.startTimestamp, participationHandlingTimeEvent.startTimestamp) &&
				Objects.equals(this.resolutionTimestamp, participationHandlingTimeEvent.resolutionTimestamp) &&
				Objects.equals(this.handlingTime, participationHandlingTimeEvent.handlingTime) &&
				Objects.equals(this.resolutionType, participationHandlingTimeEvent.resolutionType) &&
				Objects.equals(this.contextPerson, participationHandlingTimeEvent.contextPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, participation, conversation, startTimestamp, resolutionTimestamp, handlingTime, resolutionType, contextPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ParticipationHandlingTimeEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    resolutionTimestamp: ").append(toIndentedString(resolutionTimestamp)).append("\n");
		sb.append("    handlingTime: ").append(toIndentedString(handlingTime)).append("\n");
		sb.append("    resolutionType: ").append(toIndentedString(resolutionType)).append("\n");
		sb.append("    contextPerson: ").append(toIndentedString(contextPerson)).append("\n");
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
