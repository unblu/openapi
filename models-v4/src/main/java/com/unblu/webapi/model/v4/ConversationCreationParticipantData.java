
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
 * The participant of a new conversation
 */
@ApiModel(description = "The participant of a new conversation")

@JsonPropertyOrder({
	ConversationCreationParticipantData.JSON_PROPERTY_$_TYPE,
	ConversationCreationParticipantData.JSON_PROPERTY_PERSON_ID,
	ConversationCreationParticipantData.JSON_PROPERTY_HIDDEN,
	ConversationCreationParticipantData.JSON_PROPERTY_CONVERSATION_STARRED,
	ConversationCreationParticipantData.JSON_PROPERTY_PARTICIPATION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationCreationParticipantData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONCREATIONPARTICIPANTDATA("ConversationCreationParticipantData");

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
			return TypeEnum.CONVERSATIONCREATIONPARTICIPANTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONCREATIONPARTICIPANTDATA;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_HIDDEN = "hidden";
	@JsonProperty(JSON_PROPERTY_HIDDEN)
	private Boolean hidden;

	public static final String JSON_PROPERTY_CONVERSATION_STARRED = "conversationStarred";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_STARRED)
	private Boolean conversationStarred;

	public static final String JSON_PROPERTY_PARTICIPATION_TYPE = "participationType";
	@JsonProperty(JSON_PROPERTY_PARTICIPATION_TYPE)
	private EConversationRealParticipationType participationType;

	public ConversationCreationParticipantData $type(TypeEnum $type) {
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

	public ConversationCreationParticipantData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The participant&#39;s person ID. Mandatory.
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The participant's person ID. Mandatory.")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ConversationCreationParticipantData hidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	/**
	 * Indicates if the participant should be a hidden participant. This can only be set for agents and not for visitors. Optional, not hidden by default.
	 * 
	 * @return hidden
	 **/
	@ApiModelProperty(value = "Indicates if the participant should be a hidden participant. This can only be set for agents and not for visitors. Optional, not hidden by default.")
	public Boolean isHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public ConversationCreationParticipantData conversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
		return this;
	}

	/**
	 * Indicates whether the conversation is starred for the participant. Optional.
	 * 
	 * @return conversationStarred
	 **/
	@ApiModelProperty(value = "Indicates whether the conversation is starred for the participant. Optional.")
	public Boolean isConversationStarred() {
		return conversationStarred;
	}

	public void setConversationStarred(Boolean conversationStarred) {
		this.conversationStarred = conversationStarred;
	}

	public ConversationCreationParticipantData participationType(EConversationRealParticipationType participationType) {
		this.participationType = participationType;
		return this;
	}

	/**
	 * Get participationType
	 * 
	 * @return participationType
	 **/
	@ApiModelProperty(value = "")
	public EConversationRealParticipationType getParticipationType() {
		return participationType;
	}

	public void setParticipationType(EConversationRealParticipationType participationType) {
		this.participationType = participationType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationCreationParticipantData conversationCreationParticipantData = (ConversationCreationParticipantData) o;
		return Objects.equals(this.$type, conversationCreationParticipantData.$type) &&
				Objects.equals(this.personId, conversationCreationParticipantData.personId) &&
				Objects.equals(this.hidden, conversationCreationParticipantData.hidden) &&
				Objects.equals(this.conversationStarred, conversationCreationParticipantData.conversationStarred) &&
				Objects.equals(this.participationType, conversationCreationParticipantData.participationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, personId, hidden, conversationStarred, participationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationCreationParticipantData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
		sb.append("    conversationStarred: ").append(toIndentedString(conversationStarred)).append("\n");
		sb.append("    participationType: ").append(toIndentedString(participationType)).append("\n");
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
