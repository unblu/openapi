
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;invitationsCancelSecondaryInvitationTarget&#39; operation
 */
@ApiModel(description = "Request body for the 'invitationsCancelSecondaryInvitationTarget' operation")

@JsonPropertyOrder({
	InvitationsCancelSecondaryInvitationTargetBody.JSON_PROPERTY_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsCancelSecondaryInvitationTargetBody {
	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public InvitationsCancelSecondaryInvitationTargetBody personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * The person ID of the secondary invitation target for whom to cancel the invitation
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "The person ID of the secondary invitation target for whom to cancel the invitation")
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
		InvitationsCancelSecondaryInvitationTargetBody invitationsCancelSecondaryInvitationTargetBody = (InvitationsCancelSecondaryInvitationTargetBody) o;
		return Objects.equals(this.personId, invitationsCancelSecondaryInvitationTargetBody.personId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsCancelSecondaryInvitationTargetBody {\n");
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
