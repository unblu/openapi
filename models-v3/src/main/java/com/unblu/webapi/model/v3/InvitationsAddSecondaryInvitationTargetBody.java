
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;invitationsAddSecondaryInvitationTarget&#39; operation
 */
@ApiModel(description = "Request Body for the 'invitationsAddSecondaryInvitationTarget' operation")

@JsonPropertyOrder({
	InvitationsAddSecondaryInvitationTargetBody.JSON_PROPERTY_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsAddSecondaryInvitationTargetBody {
	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public InvitationsAddSecondaryInvitationTargetBody personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The person who should be informed as well about the invitation.
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The person who should be informed as well about the invitation.")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationsAddSecondaryInvitationTargetBody invitationsAddSecondaryInvitationTargetBody = (InvitationsAddSecondaryInvitationTargetBody) o;
		return Objects.equals(this.personId, invitationsAddSecondaryInvitationTargetBody.personId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsAddSecondaryInvitationTargetBody {\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
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
