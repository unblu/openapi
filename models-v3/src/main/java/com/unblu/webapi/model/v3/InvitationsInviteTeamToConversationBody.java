
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;invitationsInviteTeamToConversation&#39; operation
 */
@ApiModel(description = "Request Body for the 'invitationsInviteTeamToConversation' operation")

@JsonPropertyOrder({
	InvitationsInviteTeamToConversationBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsInviteTeamToConversationBody.JSON_PROPERTY_TEAM_ID,
	InvitationsInviteTeamToConversationBody.JSON_PROPERTY_COMMENT,
	InvitationsInviteTeamToConversationBody.JSON_PROPERTY_JOIN_HIDDEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsInviteTeamToConversationBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public static final String JSON_PROPERTY_JOIN_HIDDEN = "joinHidden";
	@JsonProperty(JSON_PROPERTY_JOIN_HIDDEN)
	private Boolean joinHidden;

	public InvitationsInviteTeamToConversationBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation ID
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation ID")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public InvitationsInviteTeamToConversationBody teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * Team ID
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "Team ID")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public InvitationsInviteTeamToConversationBody comment(String comment) {
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

	public InvitationsInviteTeamToConversationBody joinHidden(Boolean joinHidden) {
		this.joinHidden = joinHidden;
		return this;
	}

	/**
	 * Flag deciding whether accepting the invitation resolves into a hidden participation. Optional (false by default).
	 * 
	 * @return joinHidden
	 **/
	@ApiModelProperty(value = "Flag deciding whether accepting the invitation resolves into a hidden participation. Optional (false by default).")
	public Boolean isJoinHidden() {
		return joinHidden;
	}

	public void setJoinHidden(Boolean joinHidden) {
		this.joinHidden = joinHidden;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationsInviteTeamToConversationBody invitationsInviteTeamToConversationBody = (InvitationsInviteTeamToConversationBody) o;
		return Objects.equals(this.conversationId, invitationsInviteTeamToConversationBody.conversationId) &&
				Objects.equals(this.teamId, invitationsInviteTeamToConversationBody.teamId) &&
				Objects.equals(this.comment, invitationsInviteTeamToConversationBody.comment) &&
				Objects.equals(this.joinHidden, invitationsInviteTeamToConversationBody.joinHidden);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, teamId, comment, joinHidden);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsInviteTeamToConversationBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
		sb.append("    joinHidden: ").append(toIndentedString(joinHidden)).append("\n");
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
