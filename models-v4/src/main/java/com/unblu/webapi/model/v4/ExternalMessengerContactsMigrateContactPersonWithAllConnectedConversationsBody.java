
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;externalMessengerContactsMigrateContactPersonWithAllConnectedConversations&#39; operation
 */
@ApiModel(description = "Request body for the 'externalMessengerContactsMigrateContactPersonWithAllConnectedConversations' operation")

@JsonPropertyOrder({
	ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody.JSON_PROPERTY_NEW_PERSON_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody {
	public static final String JSON_PROPERTY_NEW_PERSON_ID = "newPersonId";
	@JsonProperty(JSON_PROPERTY_NEW_PERSON_ID)
	private String newPersonId;

	public ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody newPersonId(String newPersonId) {
		this.newPersonId = newPersonId;
		return this;
	}

	/**
	 * The new person ID to set on the external messenger contact
	 * 
	 * @return newPersonId
	 **/
	@ApiModelProperty(value = "The new person ID to set on the external messenger contact")
	public String getNewPersonId() {
		return newPersonId;
	}

	public void setNewPersonId(String newPersonId) {
		this.newPersonId = newPersonId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody = (ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody) o;
		return Objects.equals(this.newPersonId, externalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody.newPersonId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(newPersonId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerContactsMigrateContactPersonWithAllConnectedConversationsBody {\n");
		sb.append("    newPersonId: ").append(toIndentedString(newPersonId)).append("\n");
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
