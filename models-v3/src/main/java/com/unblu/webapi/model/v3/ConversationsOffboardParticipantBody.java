
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;conversationsOffboardParticipant&#39; operation
 */
@ApiModel(description = "Request Body for the 'conversationsOffboardParticipant' operation")

@JsonPropertyOrder({
	ConversationsOffboardParticipantBody.JSON_PROPERTY_PERSON_ID,
	ConversationsOffboardParticipantBody.JSON_PROPERTY_REASON,
	ConversationsOffboardParticipantBody.JSON_PROPERTY_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsOffboardParticipantBody {
	public static final String JSON_PROPERTY_PERSON_ID = "personId";
	@JsonProperty(JSON_PROPERTY_PERSON_ID)
	private String personId;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private EConversationLeftReason reason;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public ConversationsOffboardParticipantBody personId(String personId) {
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

	public ConversationsOffboardParticipantBody reason(EConversationLeftReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Get reason
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "")
	public EConversationLeftReason getReason() {
		return reason;
	}

	public void setReason(EConversationLeftReason reason) {
		this.reason = reason;
	}

	public ConversationsOffboardParticipantBody comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Get comment
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "")
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsOffboardParticipantBody conversationsOffboardParticipantBody = (ConversationsOffboardParticipantBody) o;
		return Objects.equals(this.personId, conversationsOffboardParticipantBody.personId) &&
				Objects.equals(this.reason, conversationsOffboardParticipantBody.reason) &&
				Objects.equals(this.comment, conversationsOffboardParticipantBody.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(personId, reason, comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsOffboardParticipantBody {\n");
		sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
