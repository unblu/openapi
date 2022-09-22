
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;conversationsChangeParticipantVisibility&#39; operation
 */
@ApiModel(description = "Request Body for the 'conversationsChangeParticipantVisibility' operation")

@JsonPropertyOrder({
	ConversationsChangeParticipantVisibilityBody.JSON_PROPERTY_PERSON_ID,
	ConversationsChangeParticipantVisibilityBody.JSON_PROPERTY_HIDDEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsChangeParticipantVisibilityBody {
	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_HIDDEN = "hidden";
	@JsonProperty(JSON_PROPERTY_HIDDEN)
	private Boolean hidden;

	public ConversationsChangeParticipantVisibilityBody personId(String personId) {
		this.personId = personId;
		return this;
	}

	/**
	 * Get personId
	 * 
	 * @return personId
	 **/
	@ApiModelProperty(value = "")
	public String getPersonId() {
		return personId;
	}

	public void setPersonId(String personId) {
		this.personId = personId;
	}

	public ConversationsChangeParticipantVisibilityBody hidden(Boolean hidden) {
		this.hidden = hidden;
		return this;
	}

	/**
	 * Get hidden
	 * 
	 * @return hidden
	 **/
	@ApiModelProperty(value = "")
	public Boolean isHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsChangeParticipantVisibilityBody conversationsChangeParticipantVisibilityBody = (ConversationsChangeParticipantVisibilityBody) o;
		return Objects.equals(this.personId, conversationsChangeParticipantVisibilityBody.personId) &&
				Objects.equals(this.hidden, conversationsChangeParticipantVisibilityBody.hidden);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId, hidden);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsChangeParticipantVisibilityBody {\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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
