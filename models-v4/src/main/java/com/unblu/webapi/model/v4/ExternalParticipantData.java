
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
 * Participant of a conversation who is connected via an external messenger
 */
@ApiModel(description = "Participant of a conversation who is connected via an external messenger")

@JsonPropertyOrder({
	ExternalParticipantData.JSON_PROPERTY_$_TYPE,
	ExternalParticipantData.JSON_PROPERTY_STATE,
	ExternalParticipantData.JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID,
	ExternalParticipantData.JSON_PROPERTY_PERSON_ID,
	ExternalParticipantData.JSON_PROPERTY_SOURCE_ID,
	ExternalParticipantData.JSON_PROPERTY_PARTICIPATION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalParticipantData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALPARTICIPANTDATA("ExternalParticipantData");

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
			return TypeEnum.EXTERNALPARTICIPANTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALPARTICIPANTDATA;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private EConversationParticipationState state;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID = "externalMessengerContactId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID)
	private String externalMessengerContactId;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_PARTICIPATION_TYPE = "participationType";
	@JsonProperty(JSON_PROPERTY_PARTICIPATION_TYPE)
	private EConversationRealVisitorParticipationType participationType;

	public ExternalParticipantData $type(TypeEnum $type) {
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

	public ExternalParticipantData state(EConversationParticipationState state) {
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

	public ExternalParticipantData externalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
		return this;
	}

	/**
	 * ID of the &#x60;ExternalMessengerContact&#x60; for the person in question
	 * 
	 * @return externalMessengerContactId
	 **/
	@ApiModelProperty(value = "ID of the `ExternalMessengerContact` for the person in question")
	public String getExternalMessengerContactId() {
		return externalMessengerContactId;
	}

	public void setExternalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
	}

	public ExternalParticipantData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * ID of the &#x60;Person&#x60;
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "ID of the `Person`")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ExternalParticipantData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * The source ID of the &#x60;ExternalMessengerContact&#x60;
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "The source ID of the `ExternalMessengerContact`")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public ExternalParticipantData participationType(EConversationRealVisitorParticipationType participationType) {
		this.participationType = participationType;
		return this;
	}

	/**
	 * Get participationType
	 * 
	 * @return participationType
	 **/
	@ApiModelProperty(value = "")
	public EConversationRealVisitorParticipationType getParticipationType() {
		return participationType;
	}

	public void setParticipationType(EConversationRealVisitorParticipationType participationType) {
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
		ExternalParticipantData externalParticipantData = (ExternalParticipantData) o;
		return Objects.equals(this.$type, externalParticipantData.$type) &&
				Objects.equals(this.state, externalParticipantData.state) &&
				Objects.equals(this.externalMessengerContactId, externalParticipantData.externalMessengerContactId) &&
				Objects.equals(this.personId, externalParticipantData.personId) &&
				Objects.equals(this.sourceId, externalParticipantData.sourceId) &&
				Objects.equals(this.participationType, externalParticipantData.participationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, state, externalMessengerContactId, personId, sourceId, participationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalParticipantData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    externalMessengerContactId: ").append(toIndentedString(externalMessengerContactId)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
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
