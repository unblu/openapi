
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
 * History information about a conversation
 */
@ApiModel(description = "History information about a conversation")

@JsonPropertyOrder({
	ConversationHistoryData.JSON_PROPERTY_$_TYPE,
	ConversationHistoryData.JSON_PROPERTY_ID,
	ConversationHistoryData.JSON_PROPERTY_RECIPIENT,
	ConversationHistoryData.JSON_PROPERTY_ASSIGNEE_PERSON,
	ConversationHistoryData.JSON_PROPERTY_CONTEXT_PERSON,
	ConversationHistoryData.JSON_PROPERTY_END_PERSON,
	ConversationHistoryData.JSON_PROPERTY_PARTICIPANTS,
	ConversationHistoryData.JSON_PROPERTY_CREATED_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_ONBOARDING_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_ASSIGNEE_JOIN_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_REBOARDING_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_OFFBOARDING_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_END_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_QUEUED_TIMESTAMP,
	ConversationHistoryData.JSON_PROPERTY_STATE,
	ConversationHistoryData.JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE,
	ConversationHistoryData.JSON_PROPERTY_LOCALE,
	ConversationHistoryData.JSON_PROPERTY_END_REASON,
	ConversationHistoryData.JSON_PROPERTY_TOKBOX_SESSION_ID,
	ConversationHistoryData.JSON_PROPERTY_CONVERSATION_TEMPLATE_ID,
	ConversationHistoryData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ICON_ID,
	ConversationHistoryData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_NAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationHistoryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONHISTORYDATA("ConversationHistoryData");

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
			return TypeEnum.CONVERSATIONHISTORYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONHISTORYDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_RECIPIENT = "recipient";
	@JsonProperty(JSON_PROPERTY_RECIPIENT)
	private ConversationRecipientData recipient = null;

	public static final String JSON_PROPERTY_ASSIGNEE_PERSON = "assigneePerson";
	@JsonProperty(JSON_PROPERTY_ASSIGNEE_PERSON)
	private PersonData assigneePerson = null;

	public static final String JSON_PROPERTY_CONTEXT_PERSON = "contextPerson";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON)
	private PersonData contextPerson = null;

	public static final String JSON_PROPERTY_END_PERSON = "endPerson";
	@JsonProperty(JSON_PROPERTY_END_PERSON)
	private PersonData endPerson = null;

	public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
	@JsonProperty(JSON_PROPERTY_PARTICIPANTS)
	private List<ParticipantHistoryData> participants = null;

	public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
	private Long createdTimestamp;

	public static final String JSON_PROPERTY_ONBOARDING_TIMESTAMP = "onboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_ONBOARDING_TIMESTAMP)
	private Long onboardingTimestamp;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_ASSIGNEE_JOIN_TIMESTAMP = "assigneeJoinTimestamp";
	@JsonProperty(JSON_PROPERTY_ASSIGNEE_JOIN_TIMESTAMP)
	private Long assigneeJoinTimestamp;

	public static final String JSON_PROPERTY_REBOARDING_TIMESTAMP = "reboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_REBOARDING_TIMESTAMP)
	private Long reboardingTimestamp;

	public static final String JSON_PROPERTY_OFFBOARDING_TIMESTAMP = "offboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_TIMESTAMP)
	private Long offboardingTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_QUEUED_TIMESTAMP = "queuedTimestamp";
	@JsonProperty(JSON_PROPERTY_QUEUED_TIMESTAMP)
	private Long queuedTimestamp;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationState state;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE = "initialEngagementType";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_TYPE)
	private EInitialEngagementType initialEngagementType;

	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public static final String JSON_PROPERTY_END_REASON = "endReason";
	@JsonProperty(JSON_PROPERTY_END_REASON)
	private EConversationEndReason endReason;

	public static final String JSON_PROPERTY_TOKBOX_SESSION_ID = "tokboxSessionId";
	@JsonProperty(JSON_PROPERTY_TOKBOX_SESSION_ID)
	private String tokboxSessionId;

	public static final String JSON_PROPERTY_CONVERSATION_TEMPLATE_ID = "conversationTemplateId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_TEMPLATE_ID)
	private String conversationTemplateId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ICON_ID = "externalMessengerChannelIconId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ICON_ID)
	private String externalMessengerChannelIconId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_NAME = "externalMessengerChannelName";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_NAME)
	private String externalMessengerChannelName;

	public ConversationHistoryData $type(TypeEnum $type) {
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

	public ConversationHistoryData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Id of the conversation
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Id of the conversation")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationHistoryData recipient(ConversationRecipientData recipient) {
		this.recipient = recipient;
		return this;
	}

	/**
	 * Get recipient
	 * 
	 * @return recipient
	 **/
	@ApiModelProperty(value = "")
	public ConversationRecipientData getRecipient() {
		return recipient;
	}

	public void setRecipient(ConversationRecipientData recipient) {
		this.recipient = recipient;
	}

	public ConversationHistoryData assigneePerson(PersonData assigneePerson) {
		this.assigneePerson = assigneePerson;
		return this;
	}

	/**
	 * Get assigneePerson
	 * 
	 * @return assigneePerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getAssigneePerson() {
		return assigneePerson;
	}

	public void setAssigneePerson(PersonData assigneePerson) {
		this.assigneePerson = assigneePerson;
	}

	public ConversationHistoryData contextPerson(PersonData contextPerson) {
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

	public ConversationHistoryData endPerson(PersonData endPerson) {
		this.endPerson = endPerson;
		return this;
	}

	/**
	 * Get endPerson
	 * 
	 * @return endPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getEndPerson() {
		return endPerson;
	}

	public void setEndPerson(PersonData endPerson) {
		this.endPerson = endPerson;
	}

	public ConversationHistoryData participants(List<ParticipantHistoryData> participants) {
		this.participants = participants;
		return this;
	}

	public ConversationHistoryData addParticipantsItem(ParticipantHistoryData participantsItem) {
		if (this.participants == null) {
			this.participants = new ArrayList<>();
		}
		this.participants.add(participantsItem);
		return this;
	}

	/**
	 * All participants (present and past) of the conversation
	 * 
	 * @return participants
	 **/
	@ApiModelProperty(value = "All participants (present and past) of the conversation")
	public List<ParticipantHistoryData> getParticipants() {
		return participants;
	}

	public void setParticipants(List<ParticipantHistoryData> participants) {
		this.participants = participants;
	}

	public ConversationHistoryData createdTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation was created (timestamp when the state was set to &#x60;EConversationState.CREATED&#x60;)
	 * 
	 * @return createdTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation was created (timestamp when the state was set to `EConversationState.CREATED`)")
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public ConversationHistoryData onboardingTimestamp(Long onboardingTimestamp) {
		this.onboardingTimestamp = onboardingTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the onboarding of the conversation started (timestamp when the state was set to &#x60;EConversationState.ONBOARDING&#x60;)
	 * 
	 * @return onboardingTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the onboarding of the conversation started (timestamp when the state was set to `EConversationState.ONBOARDING`)")
	public Long getOnboardingTimestamp() {
		return onboardingTimestamp;
	}

	public void setOnboardingTimestamp(Long onboardingTimestamp) {
		this.onboardingTimestamp = onboardingTimestamp;
	}

	public ConversationHistoryData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation was activated (timestamp when the state was set to &#x60;EConversationState.ACTIVE&#x60;)
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation was activated (timestamp when the state was set to `EConversationState.ACTIVE`)")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public ConversationHistoryData assigneeJoinTimestamp(Long assigneeJoinTimestamp) {
		this.assigneeJoinTimestamp = assigneeJoinTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the assignee joined the conversation (timestamp when the state of the first agent participant was set
	 * to&#x60;EConversationParticipationState.ACTIVE&#x60;) Value is null of no assignee has joined yet.
	 * 
	 * @return assigneeJoinTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the assignee joined the conversation (timestamp when the state of the first agent participant was set to`EConversationParticipationState.ACTIVE`) Value is null of no assignee has joined yet.")
	public Long getAssigneeJoinTimestamp() {
		return assigneeJoinTimestamp;
	}

	public void setAssigneeJoinTimestamp(Long assigneeJoinTimestamp) {
		this.assigneeJoinTimestamp = assigneeJoinTimestamp;
	}

	public ConversationHistoryData reboardingTimestamp(Long reboardingTimestamp) {
		this.reboardingTimestamp = reboardingTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the reboarding of the conversation last started, i.e. when the conversation state was last set to
	 * &#x60;EConversationState.REBOARDING&#x60;)
	 * 
	 * @return reboardingTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the reboarding of the conversation last started, i.e. when the conversation state was last set to `EConversationState.REBOARDING`)")
	public Long getReboardingTimestamp() {
		return reboardingTimestamp;
	}

	public void setReboardingTimestamp(Long reboardingTimestamp) {
		this.reboardingTimestamp = reboardingTimestamp;
	}

	public ConversationHistoryData offboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the offboarding of the conversation started (timestamp when the state was set to &#x60;EConversationState.OFFBOARDING&#x60;)
	 * 
	 * @return offboardingTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the offboarding of the conversation started (timestamp when the state was set to `EConversationState.OFFBOARDING`)")
	public Long getOffboardingTimestamp() {
		return offboardingTimestamp;
	}

	public void setOffboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
	}

	public ConversationHistoryData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation has ended (all active participants have finished their offboarding; timestamp when the state was set
	 * to&#x60;EConversationState.ENDED&#x60;)
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation has ended (all active participants have finished their offboarding; timestamp when the state was set to`EConversationState.ENDED`)")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public ConversationHistoryData queuedTimestamp(Long queuedTimestamp) {
		this.queuedTimestamp = queuedTimestamp;
		return this;
	}

	/**
	 * utc timestamp when the conversation was last queued. Null if the conversation was never be queued.
	 * 
	 * @return queuedTimestamp
	 **/
	@ApiModelProperty(value = "utc timestamp when the conversation was last queued. Null if the conversation was never be queued.")
	public Long getQueuedTimestamp() {
		return queuedTimestamp;
	}

	public void setQueuedTimestamp(Long queuedTimestamp) {
		this.queuedTimestamp = queuedTimestamp;
	}

	public ConversationHistoryData state(EConversationState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EConversationState getState() {
		return state;
	}

	public void setState(EConversationState state) {
		this.state = state;
	}

	public ConversationHistoryData initialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
		return this;
	}

	/**
	 * Get initialEngagementType
	 * 
	 * @return initialEngagementType
	 **/
	@ApiModelProperty(value = "")
	public EInitialEngagementType getInitialEngagementType() {
		return initialEngagementType;
	}

	public void setInitialEngagementType(EInitialEngagementType initialEngagementType) {
		this.initialEngagementType = initialEngagementType;
	}

	public ConversationHistoryData locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * Locale of the conversation language (as BCP 47 language tag form including region if available)
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "Locale of the conversation language (as BCP 47 language tag form including region if available)")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public ConversationHistoryData endReason(EConversationEndReason endReason) {
		this.endReason = endReason;
		return this;
	}

	/**
	 * Get endReason
	 * 
	 * @return endReason
	 **/
	@ApiModelProperty(value = "")
	public EConversationEndReason getEndReason() {
		return endReason;
	}

	public void setEndReason(EConversationEndReason endReason) {
		this.endReason = endReason;
	}

	public ConversationHistoryData tokboxSessionId(String tokboxSessionId) {
		this.tokboxSessionId = tokboxSessionId;
		return this;
	}

	/**
	 * Tokbox sessionId.
	 * 
	 * @return tokboxSessionId
	 **/
	@ApiModelProperty(value = "Tokbox sessionId.")
	public String getTokboxSessionId() {
		return tokboxSessionId;
	}

	public void setTokboxSessionId(String tokboxSessionId) {
		this.tokboxSessionId = tokboxSessionId;
	}

	public ConversationHistoryData conversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
		return this;
	}

	/**
	 * Template id of this conversation. If omitted, the default conversationTemplate will be retrieved based on the initialEngagementType
	 * 
	 * @return conversationTemplateId
	 **/
	@ApiModelProperty(value = "Template id of this conversation. If omitted, the default conversationTemplate will be retrieved based on the initialEngagementType")
	public String getConversationTemplateId() {
		return conversationTemplateId;
	}

	public void setConversationTemplateId(String conversationTemplateId) {
		this.conversationTemplateId = conversationTemplateId;
	}

	public ConversationHistoryData externalMessengerChannelIconId(String externalMessengerChannelIconId) {
		this.externalMessengerChannelIconId = externalMessengerChannelIconId;
		return this;
	}

	/**
	 * External messenger channel id.
	 * 
	 * @return externalMessengerChannelIconId
	 **/
	@ApiModelProperty(value = "External messenger channel id.")
	public String getExternalMessengerChannelIconId() {
		return externalMessengerChannelIconId;
	}

	public void setExternalMessengerChannelIconId(String externalMessengerChannelIconId) {
		this.externalMessengerChannelIconId = externalMessengerChannelIconId;
	}

	public ConversationHistoryData externalMessengerChannelName(String externalMessengerChannelName) {
		this.externalMessengerChannelName = externalMessengerChannelName;
		return this;
	}

	/**
	 * External messenger name.
	 * 
	 * @return externalMessengerChannelName
	 **/
	@ApiModelProperty(value = "External messenger name.")
	public String getExternalMessengerChannelName() {
		return externalMessengerChannelName;
	}

	public void setExternalMessengerChannelName(String externalMessengerChannelName) {
		this.externalMessengerChannelName = externalMessengerChannelName;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationHistoryData conversationHistoryData = (ConversationHistoryData) o;
		return Objects.equals(this.$type, conversationHistoryData.$type) &&
				Objects.equals(this.id, conversationHistoryData.id) &&
				Objects.equals(this.recipient, conversationHistoryData.recipient) &&
				Objects.equals(this.assigneePerson, conversationHistoryData.assigneePerson) &&
				Objects.equals(this.contextPerson, conversationHistoryData.contextPerson) &&
				Objects.equals(this.endPerson, conversationHistoryData.endPerson) &&
				Objects.equals(this.participants, conversationHistoryData.participants) &&
				Objects.equals(this.createdTimestamp, conversationHistoryData.createdTimestamp) &&
				Objects.equals(this.onboardingTimestamp, conversationHistoryData.onboardingTimestamp) &&
				Objects.equals(this.activationTimestamp, conversationHistoryData.activationTimestamp) &&
				Objects.equals(this.assigneeJoinTimestamp, conversationHistoryData.assigneeJoinTimestamp) &&
				Objects.equals(this.reboardingTimestamp, conversationHistoryData.reboardingTimestamp) &&
				Objects.equals(this.offboardingTimestamp, conversationHistoryData.offboardingTimestamp) &&
				Objects.equals(this.endTimestamp, conversationHistoryData.endTimestamp) &&
				Objects.equals(this.queuedTimestamp, conversationHistoryData.queuedTimestamp) &&
				Objects.equals(this.state, conversationHistoryData.state) &&
				Objects.equals(this.initialEngagementType, conversationHistoryData.initialEngagementType) &&
				Objects.equals(this.locale, conversationHistoryData.locale) &&
				Objects.equals(this.endReason, conversationHistoryData.endReason) &&
				Objects.equals(this.tokboxSessionId, conversationHistoryData.tokboxSessionId) &&
				Objects.equals(this.conversationTemplateId, conversationHistoryData.conversationTemplateId) &&
				Objects.equals(this.externalMessengerChannelIconId, conversationHistoryData.externalMessengerChannelIconId) &&
				Objects.equals(this.externalMessengerChannelName, conversationHistoryData.externalMessengerChannelName);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, recipient, assigneePerson, contextPerson, endPerson, participants, createdTimestamp, onboardingTimestamp, activationTimestamp, assigneeJoinTimestamp, reboardingTimestamp, offboardingTimestamp, endTimestamp, queuedTimestamp, state, initialEngagementType, locale, endReason, tokboxSessionId, conversationTemplateId, externalMessengerChannelIconId, externalMessengerChannelName);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationHistoryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
		sb.append("    assigneePerson: ").append(toIndentedString(assigneePerson)).append("\n");
		sb.append("    contextPerson: ").append(toIndentedString(contextPerson)).append("\n");
		sb.append("    endPerson: ").append(toIndentedString(endPerson)).append("\n");
		sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    onboardingTimestamp: ").append(toIndentedString(onboardingTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    assigneeJoinTimestamp: ").append(toIndentedString(assigneeJoinTimestamp)).append("\n");
		sb.append("    reboardingTimestamp: ").append(toIndentedString(reboardingTimestamp)).append("\n");
		sb.append("    offboardingTimestamp: ").append(toIndentedString(offboardingTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    queuedTimestamp: ").append(toIndentedString(queuedTimestamp)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    initialEngagementType: ").append(toIndentedString(initialEngagementType)).append("\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
		sb.append("    endReason: ").append(toIndentedString(endReason)).append("\n");
		sb.append("    tokboxSessionId: ").append(toIndentedString(tokboxSessionId)).append("\n");
		sb.append("    conversationTemplateId: ").append(toIndentedString(conversationTemplateId)).append("\n");
		sb.append("    externalMessengerChannelIconId: ").append(toIndentedString(externalMessengerChannelIconId)).append("\n");
		sb.append("    externalMessengerChannelName: ").append(toIndentedString(externalMessengerChannelName)).append("\n");
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
