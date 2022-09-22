
package com.unblu.webapi.model.v3;

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
 * Information for the participant of a conversation (with historical information)
 */
@ApiModel(description = "Information for the participant of a conversation (with historical information)")

@JsonPropertyOrder({
	ParticipantHistoryData.JSON_PROPERTY_$_TYPE,
	ParticipantHistoryData.JSON_PROPERTY_STATE,
	ParticipantHistoryData.JSON_PROPERTY_CREATED_TIMESTAMP,
	ParticipantHistoryData.JSON_PROPERTY_JOINED_TIMESTAMP,
	ParticipantHistoryData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	ParticipantHistoryData.JSON_PROPERTY_OFFBOARDING_TIMESTAMP,
	ParticipantHistoryData.JSON_PROPERTY_LEFT_TIMESTAMP,
	ParticipantHistoryData.JSON_PROPERTY_CONVERSATION_RATING,
	ParticipantHistoryData.JSON_PROPERTY_IS_HIDDEN,
	ParticipantHistoryData.JSON_PROPERTY_CONVERSATION_STARRED,
	ParticipantHistoryData.JSON_PROPERTY_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ParticipantHistoryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PARTICIPANTHISTORYDATA("ParticipantHistoryData");

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
			return TypeEnum.PARTICIPANTHISTORYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PARTICIPANTHISTORYDATA;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationParticipationState state;

	public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
	private Long createdTimestamp;

	public static final String JSON_PROPERTY_JOINED_TIMESTAMP = "joinedTimestamp";
	@JsonProperty(JSON_PROPERTY_JOINED_TIMESTAMP)
	private Long joinedTimestamp;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_OFFBOARDING_TIMESTAMP = "offboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_TIMESTAMP)
	private Long offboardingTimestamp;

	public static final String JSON_PROPERTY_LEFT_TIMESTAMP = "leftTimestamp";
	@JsonProperty(JSON_PROPERTY_LEFT_TIMESTAMP)
	private Long leftTimestamp;

	public static final String JSON_PROPERTY_CONVERSATION_RATING = "conversationRating";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_RATING)
	private Float conversationRating;

	public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
	@JsonProperty(JSON_PROPERTY_IS_HIDDEN)
	private Boolean isHidden;

	public static final String JSON_PROPERTY_CONVERSATION_STARRED = "conversationStarred";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_STARRED)
	private Boolean conversationStarred;

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public ParticipantHistoryData $type(TypeEnum $type) {
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

	public ParticipantHistoryData state(EConversationParticipationState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public EConversationParticipationState getState() {
		return state;
	}

	public void setState(EConversationParticipationState state) {
		this.state = state;
	}

	public ParticipantHistoryData createdTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person participation was created (timestamp when the state was set to &#x60;EConversationParticipationState.CREATED&#x60;)
	 * 
	 * @return createdTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person participation was created (timestamp when the state was set to `EConversationParticipationState.CREATED`)")
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public ParticipantHistoryData joinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person has joined (timestamp when the state was set to &#x60;EConversationParticipationState.ONBOARDING&#x60;)
	 * 
	 * @return joinedTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person has joined (timestamp when the state was set to `EConversationParticipationState.ONBOARDING`)")
	public Long getJoinedTimestamp() {
		return joinedTimestamp;
	}

	public void setJoinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
	}

	public ParticipantHistoryData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participation was activated, can be null (timestamp when the state was set to
	 * &#x60;EConversationParticipationState.ACTIVE&#x60;)
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participation was activated, can be null (timestamp when the state was set to `EConversationParticipationState.ACTIVE`)")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public ParticipantHistoryData offboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person started offboarding, can be null (timestamp when the state was set
	 * to&#x60;EConversationParticipationState.OFFBOARDING&#x60;)
	 * 
	 * @return offboardingTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person started offboarding, can be null (timestamp when the state was set to`EConversationParticipationState.OFFBOARDING`)")
	public Long getOffboardingTimestamp() {
		return offboardingTimestamp;
	}

	public void setOffboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
	}

	public ParticipantHistoryData leftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the person has left, can be null (timestamp when the state was set to &#x60;EConversationParticipationState.ENDED&#x60;)
	 * 
	 * @return leftTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the person has left, can be null (timestamp when the state was set to `EConversationParticipationState.ENDED`)")
	public Long getLeftTimestamp() {
		return leftTimestamp;
	}

	public void setLeftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
	}

	public ParticipantHistoryData conversationRating(Float conversationRating) {
		this.conversationRating = conversationRating;
		return this;
	}

	/**
	 * Rating (between 0 and 1) for the conversation given by the participant
	 * 
	 * @return conversationRating
	 **/
	@ApiModelProperty(value = "Rating (between 0 and 1) for the conversation given by the participant")
	public Float getConversationRating() {
		return conversationRating;
	}

	public void setConversationRating(Float conversationRating) {
		this.conversationRating = conversationRating;
	}

	public ParticipantHistoryData isHidden(Boolean isHidden) {
		this.isHidden = isHidden;
		return this;
	}

	/**
	 * Indicates if the participant is hidden in the current conversation.
	 * 
	 * @return isHidden
	 **/
	@ApiModelProperty(value = "Indicates if the participant is hidden in the current conversation.")
	public Boolean isIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Boolean isHidden) {
		this.isHidden = isHidden;
	}

	public ParticipantHistoryData conversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
		return this;
	}

	/**
	 * Indicates whether this conversation is starred for the participant or not
	 * 
	 * @return conversationStarred
	 **/
	@ApiModelProperty(value = "Indicates whether this conversation is starred for the participant or not")
	public Boolean isConversationStarred() {
		return conversationStarred;
	}

	public void setConversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
	}

	public ParticipantHistoryData person(PersonData person) {
		this.person = person;
		return this;
	}

	/**
	 * Get person
	 * 
	 * @return person
	 **/
	@ApiModelProperty(value = "")
	public PersonData getPerson() {
		return person;
	}

	public void setPerson(PersonData person) {
		this.person = person;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ParticipantHistoryData participantHistoryData = (ParticipantHistoryData) o;
		return Objects.equals(this.$type, participantHistoryData.$type) &&
				Objects.equals(this.state, participantHistoryData.state) &&
				Objects.equals(this.createdTimestamp, participantHistoryData.createdTimestamp) &&
				Objects.equals(this.joinedTimestamp, participantHistoryData.joinedTimestamp) &&
				Objects.equals(this.activationTimestamp, participantHistoryData.activationTimestamp) &&
				Objects.equals(this.offboardingTimestamp, participantHistoryData.offboardingTimestamp) &&
				Objects.equals(this.leftTimestamp, participantHistoryData.leftTimestamp) &&
				Objects.equals(this.conversationRating, participantHistoryData.conversationRating) &&
				Objects.equals(this.isHidden, participantHistoryData.isHidden) &&
				Objects.equals(this.conversationStarred, participantHistoryData.conversationStarred) &&
				Objects.equals(this.person, participantHistoryData.person);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, state, createdTimestamp, joinedTimestamp, activationTimestamp, offboardingTimestamp, leftTimestamp, conversationRating, isHidden, conversationStarred, person);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ParticipantHistoryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    joinedTimestamp: ").append(toIndentedString(joinedTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    offboardingTimestamp: ").append(toIndentedString(offboardingTimestamp)).append("\n");
		sb.append("    leftTimestamp: ").append(toIndentedString(leftTimestamp)).append("\n");
		sb.append("    conversationRating: ").append(toIndentedString(conversationRating)).append("\n");
		sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
		sb.append("    conversationStarred: ").append(toIndentedString(conversationStarred)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
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
