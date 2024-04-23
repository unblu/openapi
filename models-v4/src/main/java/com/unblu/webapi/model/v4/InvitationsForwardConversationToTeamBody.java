
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;invitationsForwardConversationToTeam&#39; operation
 */
@ApiModel(description = "Request body for the 'invitationsForwardConversationToTeam' operation")

@JsonPropertyOrder({
	InvitationsForwardConversationToTeamBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsForwardConversationToTeamBody.JSON_PROPERTY_TEAM_ID,
	InvitationsForwardConversationToTeamBody.JSON_PROPERTY_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsForwardConversationToTeamBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public InvitationsForwardConversationToTeamBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation id.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation id.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public InvitationsForwardConversationToTeamBody teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * Team id.
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "Team id.")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public InvitationsForwardConversationToTeamBody comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Invitation comment. Optional.
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "Invitation comment. Optional.")
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
		InvitationsForwardConversationToTeamBody invitationsForwardConversationToTeamBody = (InvitationsForwardConversationToTeamBody) o;
		return Objects.equals(this.conversationId, invitationsForwardConversationToTeamBody.conversationId) &&
				Objects.equals(this.teamId, invitationsForwardConversationToTeamBody.teamId) &&
				Objects.equals(this.comment, invitationsForwardConversationToTeamBody.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, teamId, comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsForwardConversationToTeamBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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
