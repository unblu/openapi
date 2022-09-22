
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
 * Participant of a conversation
 */
@ApiModel(description = "Participant of a conversation")

@JsonPropertyOrder({
	ParticipantData.JSON_PROPERTY_$_TYPE,
	ParticipantData.JSON_PROPERTY_STATE,
	ParticipantData.JSON_PROPERTY_PERSON_ID,
	ParticipantData.JSON_PROPERTY_CONNECTED_VIA_EXTERNAL_MESSENGER,
	ParticipantData.JSON_PROPERTY_HIDDEN,
	ParticipantData.JSON_PROPERTY_CONVERSATION_STARRED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ParticipantData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PARTICIPANTDATA("ParticipantData");

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
			return TypeEnum.PARTICIPANTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PARTICIPANTDATA;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationParticipationState state;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_CONNECTED_VIA_EXTERNAL_MESSENGER = "connectedViaExternalMessenger";
	@JsonProperty(JSON_PROPERTY_CONNECTED_VIA_EXTERNAL_MESSENGER)
	private Boolean connectedViaExternalMessenger;

	public static final String JSON_PROPERTY_HIDDEN = "hidden";
	@JsonProperty(JSON_PROPERTY_HIDDEN)
	private Boolean hidden;

	public static final String JSON_PROPERTY_CONVERSATION_STARRED = "conversationStarred";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_STARRED)
	private Boolean conversationStarred;

	public ParticipantData $type(TypeEnum $type) {
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

	public ParticipantData state(EConversationParticipationState state) {
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

	public ParticipantData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Id of the participant person
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "Id of the participant person")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ParticipantData connectedViaExternalMessenger(Boolean connectedViaExternalMessenger) {
		this.connectedViaExternalMessenger = connectedViaExternalMessenger;
		return this;
	}

	/**
	 * Indicates if the participant is connected to a messenger channel
	 * 
	 * @return connectedViaExternalMessenger
	 **/
	@ApiModelProperty(value = "Indicates if the participant is connected to a messenger channel")
	public Boolean isConnectedViaExternalMessenger() {
		return connectedViaExternalMessenger;
	}

	public void setConnectedViaExternalMessenger(Boolean connectedViaExternalMessenger) {
		this.connectedViaExternalMessenger = connectedViaExternalMessenger;
	}

	public ParticipantData hidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	/**
	 * Indicates if the participant should be hidden
	 * 
	 * @return hidden
	 **/
	@ApiModelProperty(value = "Indicates if the participant should be hidden")
	public Boolean isHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	public ParticipantData conversationStarred(Boolean conversationStarred) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ParticipantData participantData = (ParticipantData) o;
		return Objects.equals(this.$type, participantData.$type) &&
				Objects.equals(this.state, participantData.state) &&
				Objects.equals(this.personId, participantData.personId) &&
				Objects.equals(this.connectedViaExternalMessenger, participantData.connectedViaExternalMessenger) &&
				Objects.equals(this.hidden, participantData.hidden) &&
				Objects.equals(this.conversationStarred, participantData.conversationStarred);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, state, personId, connectedViaExternalMessenger, hidden, conversationStarred);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ParticipantData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    connectedViaExternalMessenger: ").append(toIndentedString(connectedViaExternalMessenger)).append("\n");
		sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
		sb.append("    conversationStarred: ").append(toIndentedString(conversationStarred)).append("\n");
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
