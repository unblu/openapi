
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
 * Information about the bot participant of a conversation (with historical information)
 */
@ApiModel(description = "Information about the bot participant of a conversation (with historical information)")

@JsonPropertyOrder({
	BotParticipantHistoryData.JSON_PROPERTY_$_TYPE,
	BotParticipantHistoryData.JSON_PROPERTY_STATE,
	BotParticipantHistoryData.JSON_PROPERTY_CREATED_TIMESTAMP,
	BotParticipantHistoryData.JSON_PROPERTY_JOINED_TIMESTAMP,
	BotParticipantHistoryData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	BotParticipantHistoryData.JSON_PROPERTY_OFFBOARDING_TIMESTAMP,
	BotParticipantHistoryData.JSON_PROPERTY_LEFT_TIMESTAMP,
	BotParticipantHistoryData.JSON_PROPERTY_HIDDEN,
	BotParticipantHistoryData.JSON_PROPERTY_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotParticipantHistoryData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTPARTICIPANTHISTORYDATA("BotParticipantHistoryData");

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
			return TypeEnum.BOTPARTICIPANTHISTORYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTPARTICIPANTHISTORYDATA;

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

	public static final String JSON_PROPERTY_HIDDEN = "hidden";
	@JsonProperty(JSON_PROPERTY_HIDDEN)
	private Boolean hidden;

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public BotParticipantHistoryData $type(TypeEnum $type) {
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

	public BotParticipantHistoryData state(EConversationParticipationState state) {
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

	public BotParticipantHistoryData createdTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the bot&#39;s participation was created (timestamp when the state was set to &#x60;EConversationParticipationState.CREATED&#x60;)
	 * 
	 * @return createdTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the bot's participation was created (timestamp when the state was set to `EConversationParticipationState.CREATED`)")
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public BotParticipantHistoryData joinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when bot joined (timestamp when the state was set to &#x60;EConversationParticipationState.ONBOARDING&#x60;)
	 * 
	 * @return joinedTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when bot joined (timestamp when the state was set to `EConversationParticipationState.ONBOARDING`)")
	public Long getJoinedTimestamp() {
		return joinedTimestamp;
	}

	public void setJoinedTimestamp(Long joinedTimestamp) {
		this.joinedTimestamp = joinedTimestamp;
	}

	public BotParticipantHistoryData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participation was activated, may be null (timestamp when the state was set to
	 * &#x60;EConversationParticipationState.ACTIVE&#x60;)
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participation was activated, may be null (timestamp when the state was set to `EConversationParticipationState.ACTIVE`)")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public BotParticipantHistoryData offboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when bot started offboarding, may be null (timestamp when the state was set to &#x60;EConversationParticipationState.OFFBOARDING&#x60;)
	 * 
	 * @return offboardingTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when bot started offboarding, may be null (timestamp when the state was set to `EConversationParticipationState.OFFBOARDING`)")
	public Long getOffboardingTimestamp() {
		return offboardingTimestamp;
	}

	public void setOffboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
	}

	public BotParticipantHistoryData leftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the bot left, may be null (timestamp when the state was set to &#x60;EConversationParticipationState.ENDED&#x60;)
	 * 
	 * @return leftTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the bot left, may be null (timestamp when the state was set to `EConversationParticipationState.ENDED`)")
	public Long getLeftTimestamp() {
		return leftTimestamp;
	}

	public void setLeftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
	}

	public BotParticipantHistoryData hidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	/**
	 * Indicates whether the bot&#39;s participation is hidden in the current conversation
	 * 
	 * @return hidden
	 **/
	@ApiModelProperty(value = "Indicates whether the bot's participation is hidden in the current conversation")
	public Boolean isHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public BotParticipantHistoryData person(PersonData person) {
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
		BotParticipantHistoryData botParticipantHistoryData = (BotParticipantHistoryData) o;
		return Objects.equals(this.$type, botParticipantHistoryData.$type) &&
				Objects.equals(this.state, botParticipantHistoryData.state) &&
				Objects.equals(this.createdTimestamp, botParticipantHistoryData.createdTimestamp) &&
				Objects.equals(this.joinedTimestamp, botParticipantHistoryData.joinedTimestamp) &&
				Objects.equals(this.activationTimestamp, botParticipantHistoryData.activationTimestamp) &&
				Objects.equals(this.offboardingTimestamp, botParticipantHistoryData.offboardingTimestamp) &&
				Objects.equals(this.leftTimestamp, botParticipantHistoryData.leftTimestamp) &&
				Objects.equals(this.hidden, botParticipantHistoryData.hidden) &&
				Objects.equals(this.person, botParticipantHistoryData.person);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, state, createdTimestamp, joinedTimestamp, activationTimestamp, offboardingTimestamp, leftTimestamp, hidden, person);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotParticipantHistoryData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    joinedTimestamp: ").append(toIndentedString(joinedTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    offboardingTimestamp: ").append(toIndentedString(offboardingTimestamp)).append("\n");
		sb.append("    leftTimestamp: ").append(toIndentedString(leftTimestamp)).append("\n");
		sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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
