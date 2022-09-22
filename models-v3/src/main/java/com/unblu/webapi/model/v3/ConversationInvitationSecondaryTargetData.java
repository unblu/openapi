
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
 * Secondary target of a conversation invitation. This is a deputy agent which can accept a chat request, if the primary agent is not able to handle it.
 */
@ApiModel(description = "Secondary target of a conversation invitation. This is a deputy agent which can accept a chat request, if the primary agent is not able to handle it.")

@JsonPropertyOrder({
	ConversationInvitationSecondaryTargetData.JSON_PROPERTY_$_TYPE,
	ConversationInvitationSecondaryTargetData.JSON_PROPERTY_PERSON_ID,
	ConversationInvitationSecondaryTargetData.JSON_PROPERTY_RESPONSE_STATE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationInvitationSecondaryTargetData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONINVITATIONSECONDARYTARGETDATA("ConversationInvitationSecondaryTargetData");

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
			return TypeEnum.CONVERSATIONINVITATIONSECONDARYTARGETDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONINVITATIONSECONDARYTARGETDATA;

	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_RESPONSE_STATE = "responseState";
	@JsonProperty(JSON_PROPERTY_RESPONSE_STATE)
	private EInvitationResponseState responseState;

	public ConversationInvitationSecondaryTargetData $type(TypeEnum $type) {
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

	public ConversationInvitationSecondaryTargetData personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The id of the person to who this secondary invitation target belongs to
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The id of the person to who this secondary invitation target belongs to")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ConversationInvitationSecondaryTargetData responseState(EInvitationResponseState responseState) {
		this.responseState = responseState;
		return this;
	}

	/**
	 * Get responseState
	 * 
	 * @return responseState
	 **/
	@ApiModelProperty(value = "")
	public EInvitationResponseState getResponseState() {
		return responseState;
	}

	public void setResponseState(EInvitationResponseState responseState) {
		this.responseState = responseState;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationInvitationSecondaryTargetData conversationInvitationSecondaryTargetData = (ConversationInvitationSecondaryTargetData) o;
		return Objects.equals(this.$type, conversationInvitationSecondaryTargetData.$type) &&
				Objects.equals(this.personId, conversationInvitationSecondaryTargetData.personId) &&
				Objects.equals(this.responseState, conversationInvitationSecondaryTargetData.responseState);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, personId, responseState);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationInvitationSecondaryTargetData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    responseState: ").append(toIndentedString(responseState)).append("\n");
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
