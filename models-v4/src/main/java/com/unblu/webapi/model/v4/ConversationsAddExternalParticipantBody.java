
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;conversationsAddExternalParticipant&#39; operation
 */
@ApiModel(description = "Request body for the 'conversationsAddExternalParticipant' operation")

@JsonPropertyOrder({
	ConversationsAddExternalParticipantBody.JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsAddExternalParticipantBody {
	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID = "externalMessengerContactId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CONTACT_ID)
	private String externalMessengerContactId;

	public ConversationsAddExternalParticipantBody externalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
		return this;
	}

	/**
	 * The ID of the &#x60;ExternalMessengerContact&#x60; to add
	 * 
	 * @return externalMessengerContactId
	 **/
	@ApiModelProperty(value = "The ID of the  `ExternalMessengerContact`  to add")
	public String getExternalMessengerContactId() {
		return externalMessengerContactId;
	}

	public void setExternalMessengerContactId(String externalMessengerContactId) {
		this.externalMessengerContactId = externalMessengerContactId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsAddExternalParticipantBody conversationsAddExternalParticipantBody = (ConversationsAddExternalParticipantBody) o;
		return Objects.equals(this.externalMessengerContactId, conversationsAddExternalParticipantBody.externalMessengerContactId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(externalMessengerContactId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsAddExternalParticipantBody {\n");
		sb.append("    externalMessengerContactId: ").append(toIndentedString(externalMessengerContactId)).append("\n");
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
