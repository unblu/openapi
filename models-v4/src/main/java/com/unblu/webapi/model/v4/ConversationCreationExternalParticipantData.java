
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
 * Participant of a new conversation who is connected through an external messenger
 */
@ApiModel(description = "Participant of a new conversation who is connected through an external messenger")

@JsonPropertyOrder({
	ConversationCreationExternalParticipantData.JSON_PROPERTY_$_TYPE,
	ConversationCreationExternalParticipantData.JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID,
	ConversationCreationExternalParticipantData.JSON_PROPERTY_PARTICIPATION_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationCreationExternalParticipantData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONCREATIONEXTERNALPARTICIPANTDATA("ConversationCreationExternalParticipantData");

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
			return TypeEnum.CONVERSATIONCREATIONEXTERNALPARTICIPANTDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONCREATIONEXTERNALPARTICIPANTDATA;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID = "externalMessengerContactId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID)
	private String externalMessengerContactId;

	public static final String JSON_PROPERTY_PARTICIPATION_TYPE = "participationType";
	@JsonProperty(JSON_PROPERTY_PARTICIPATION_TYPE)
	private EConversationRealVisitorParticipationType participationType;

	public ConversationCreationExternalParticipantData $type(TypeEnum $type) {
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

	public ConversationCreationExternalParticipantData externalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
		return this;
	}

	/**
	 * The ID of the &#x60;ExternalMessengerContact&#x60; for the person in question
	 * 
	 * @return externalMessengerContactId
	 **/
	@ApiModelProperty(value = "The ID of the `ExternalMessengerContact` for the person in question")
	public String getExternalMessengerContactId() {
		return externalMessengerContactId;
	}

	public void setExternalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
	}

	public ConversationCreationExternalParticipantData participationType(EConversationRealVisitorParticipationType participationType) {
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
		ConversationCreationExternalParticipantData conversationCreationExternalParticipantData = (ConversationCreationExternalParticipantData) o;
		return Objects.equals(this.$type, conversationCreationExternalParticipantData.$type) &&
				Objects.equals(this.externalMessengerContactId, conversationCreationExternalParticipantData.externalMessengerContactId) &&
				Objects.equals(this.participationType, conversationCreationExternalParticipantData.participationType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, externalMessengerContactId, participationType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationCreationExternalParticipantData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    externalMessengerContactId: ").append(toIndentedString(externalMessengerContactId)).append("\n");
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
