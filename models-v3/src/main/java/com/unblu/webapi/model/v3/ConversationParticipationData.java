
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
 * Data about a conversation participation&lt;br&gt;
 */
@ApiModel(description = "Data about a conversation participation<br>")

@JsonPropertyOrder({
	ConversationParticipationData.JSON_PROPERTY_$_TYPE,
	ConversationParticipationData.JSON_PROPERTY_ID,
	ConversationParticipationData.JSON_PROPERTY_STATE,
	ConversationParticipationData.JSON_PROPERTY_CREATED_TIMESTAMP,
	ConversationParticipationData.JSON_PROPERTY_ONBOARDING_TIMESTAMP,
	ConversationParticipationData.JSON_PROPERTY_ACTIVATION_TIMESTAMP,
	ConversationParticipationData.JSON_PROPERTY_OFFBOARDING_TIMESTAMP,
	ConversationParticipationData.JSON_PROPERTY_LEFT_TIMESTAMP,
	ConversationParticipationData.JSON_PROPERTY_LEFT_REASON,
	ConversationParticipationData.JSON_PROPERTY_LEFT_COMMENT,
	ConversationParticipationData.JSON_PROPERTY_CONVERSATION_RATING,
	ConversationParticipationData.JSON_PROPERTY_HIDDEN,
	ConversationParticipationData.JSON_PROPERTY_CONVERSATION_STARRED,
	ConversationParticipationData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationParticipationData.JSON_PROPERTY_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationParticipationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONPARTICIPATIONDATA("ConversationParticipationData");

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
			return TypeEnum.CONVERSATIONPARTICIPATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONPARTICIPATIONDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationParticipationState state;

	public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
	private Long createdTimestamp;

	public static final String JSON_PROPERTY_ONBOARDING_TIMESTAMP = "onboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_ONBOARDING_TIMESTAMP)
	private Long onboardingTimestamp;

	public static final String JSON_PROPERTY_ACTIVATION_TIMESTAMP = "activationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTIVATION_TIMESTAMP)
	private Long activationTimestamp;

	public static final String JSON_PROPERTY_OFFBOARDING_TIMESTAMP = "offboardingTimestamp";
	@JsonProperty(JSON_PROPERTY_OFFBOARDING_TIMESTAMP)
	private Long offboardingTimestamp;

	public static final String JSON_PROPERTY_LEFT_TIMESTAMP = "leftTimestamp";
	@JsonProperty(JSON_PROPERTY_LEFT_TIMESTAMP)
	private Long leftTimestamp;

	public static final String JSON_PROPERTY_LEFT_REASON = "leftReason";
	@JsonProperty(JSON_PROPERTY_LEFT_REASON)
	private EConversationLeftReason leftReason;

	public static final String JSON_PROPERTY_LEFT_COMMENT = "leftComment";
	@JsonProperty(JSON_PROPERTY_LEFT_COMMENT)
	private String leftComment;

	public static final String JSON_PROPERTY_CONVERSATION_RATING = "conversationRating";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_RATING)
	private Float conversationRating;

	public static final String JSON_PROPERTY_HIDDEN = "hidden";
	@JsonProperty(JSON_PROPERTY_HIDDEN)
	private Boolean hidden;

	public static final String JSON_PROPERTY_CONVERSATION_STARRED = "conversationStarred";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_STARRED)
	private Boolean conversationStarred;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public ConversationParticipationData $type(TypeEnum $type) {
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

	public ConversationParticipationData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique ID of the participation
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique ID of the participation")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationParticipationData state(EConversationParticipationState state) {
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

	public ConversationParticipationData createdTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participation was created. It is set when the entity is stored for the first time.
	 * 
	 * @return createdTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participation was created. It is set when the entity is stored for the first time.")
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public ConversationParticipationData onboardingTimestamp(Long onboardingTimestamp) {
		this.onboardingTimestamp = onboardingTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participation started the onboarding process. Null if the participant hasn&#39;t yet started the onboarding.
	 * 
	 * @return onboardingTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participation started the onboarding process. Null if the participant hasn't yet started the onboarding.")
	public Long getOnboardingTimestamp() {
		return onboardingTimestamp;
	}

	public void setOnboardingTimestamp(Long onboardingTimestamp) {
		this.onboardingTimestamp = onboardingTimestamp;
	}

	public ConversationParticipationData activationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participation was activated. Null if the participation hasn&#39;t being activated yet.
	 * 
	 * @return activationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participation was activated. Null if the participation hasn't being activated yet.")
	public Long getActivationTimestamp() {
		return activationTimestamp;
	}

	public void setActivationTimestamp(Long activationTimestamp) {
		this.activationTimestamp = activationTimestamp;
	}

	public ConversationParticipationData offboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participation started the offboarding process. Null if the participant hasn&#39;t yet started the offboarding.
	 * 
	 * @return offboardingTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participation started the offboarding process. Null if the participant hasn't yet started the offboarding.")
	public Long getOffboardingTimestamp() {
		return offboardingTimestamp;
	}

	public void setOffboardingTimestamp(Long offboardingTimestamp) {
		this.offboardingTimestamp = offboardingTimestamp;
	}

	public ConversationParticipationData leftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the participant left the conversation after finishing offboarding. Null if the participant is still part of the conversation.
	 * 
	 * @return leftTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the participant left the conversation after finishing offboarding. Null if the participant is still part of the conversation.")
	public Long getLeftTimestamp() {
		return leftTimestamp;
	}

	public void setLeftTimestamp(Long leftTimestamp) {
		this.leftTimestamp = leftTimestamp;
	}

	public ConversationParticipationData leftReason(EConversationLeftReason leftReason) {
		this.leftReason = leftReason;
		return this;
	}

	/**
	 * Get leftReason
	 * 
	 * @return leftReason
	 **/
	@ApiModelProperty(value = "")
	public EConversationLeftReason getLeftReason() {
		return leftReason;
	}

	public void setLeftReason(EConversationLeftReason leftReason) {
		this.leftReason = leftReason;
	}

	public ConversationParticipationData leftComment(String leftComment) {
		this.leftComment = leftComment;
		return this;
	}

	/**
	 * The comment on why the participant left the conversation. If provided, this attribute is set when offboarding starts and is null if the participant is still
	 * part of the conversation.
	 * 
	 * @return leftComment
	 **/
	@ApiModelProperty(value = "The comment on why the participant left the conversation. If provided, this attribute is set when offboarding starts and is null if the participant is still part of the conversation.")
	public String getLeftComment() {
		return leftComment;
	}

	public void setLeftComment(String leftComment) {
		this.leftComment = leftComment;
	}

	public ConversationParticipationData conversationRating(Float conversationRating) {
		this.conversationRating = conversationRating;
		return this;
	}

	/**
	 * The rating the participant gave the conversation. The rating is mapped to a number from 0-1. Null until the participant rates the conversation.
	 * 
	 * @return conversationRating
	 **/
	@ApiModelProperty(value = "The rating the participant gave the conversation. The rating is mapped to a number from 0-1. Null until the participant rates the conversation.")
	public Float getConversationRating() {
		return conversationRating;
	}

	public void setConversationRating(Float conversationRating) {
		this.conversationRating = conversationRating;
	}

	public ConversationParticipationData hidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	/**
	 * Flag indicating whether the participant is hidden
	 * 
	 * @return hidden
	 **/
	@ApiModelProperty(value = "Flag indicating whether the participant is hidden")
	public Boolean isHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public ConversationParticipationData conversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
		return this;
	}

	/**
	 * Flag indictaing whether the participant has starred this conversation
	 * 
	 * @return conversationStarred
	 **/
	@ApiModelProperty(value = "Flag indictaing whether the participant has starred this conversation")
	public Boolean isConversationStarred() {
		return conversationStarred;
	}

	public void setConversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
	}

	public ConversationParticipationData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation the participation belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation the participation belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationParticipationData person(PersonData person) {
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
		ConversationParticipationData conversationParticipationData = (ConversationParticipationData) o;
		return Objects.equals(this.$type, conversationParticipationData.$type) &&
				Objects.equals(this.id, conversationParticipationData.id) &&
				Objects.equals(this.state, conversationParticipationData.state) &&
				Objects.equals(this.createdTimestamp, conversationParticipationData.createdTimestamp) &&
				Objects.equals(this.onboardingTimestamp, conversationParticipationData.onboardingTimestamp) &&
				Objects.equals(this.activationTimestamp, conversationParticipationData.activationTimestamp) &&
				Objects.equals(this.offboardingTimestamp, conversationParticipationData.offboardingTimestamp) &&
				Objects.equals(this.leftTimestamp, conversationParticipationData.leftTimestamp) &&
				Objects.equals(this.leftReason, conversationParticipationData.leftReason) &&
				Objects.equals(this.leftComment, conversationParticipationData.leftComment) &&
				Objects.equals(this.conversationRating, conversationParticipationData.conversationRating) &&
				Objects.equals(this.hidden, conversationParticipationData.hidden) &&
				Objects.equals(this.conversationStarred, conversationParticipationData.conversationStarred) &&
				Objects.equals(this.conversationId, conversationParticipationData.conversationId) &&
				Objects.equals(this.person, conversationParticipationData.person);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, state, createdTimestamp, onboardingTimestamp, activationTimestamp, offboardingTimestamp, leftTimestamp, leftReason, leftComment, conversationRating, hidden, conversationStarred, conversationId, person);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationParticipationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    onboardingTimestamp: ").append(toIndentedString(onboardingTimestamp)).append("\n");
		sb.append("    activationTimestamp: ").append(toIndentedString(activationTimestamp)).append("\n");
		sb.append("    offboardingTimestamp: ").append(toIndentedString(offboardingTimestamp)).append("\n");
		sb.append("    leftTimestamp: ").append(toIndentedString(leftTimestamp)).append("\n");
		sb.append("    leftReason: ").append(toIndentedString(leftReason)).append("\n");
		sb.append("    leftComment: ").append(toIndentedString(leftComment)).append("\n");
		sb.append("    conversationRating: ").append(toIndentedString(conversationRating)).append("\n");
		sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
		sb.append("    conversationStarred: ").append(toIndentedString(conversationStarred)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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
