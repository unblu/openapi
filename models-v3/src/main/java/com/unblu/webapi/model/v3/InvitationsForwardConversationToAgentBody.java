
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;invitationsForwardConversationToAgent&#39; operation
 */
@ApiModel(description = "Request Body for the 'invitationsForwardConversationToAgent' operation")

@JsonPropertyOrder({
	InvitationsForwardConversationToAgentBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsForwardConversationToAgentBody.JSON_PROPERTY_AGENT_PERSON_ID,
	InvitationsForwardConversationToAgentBody.JSON_PROPERTY_COMMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsForwardConversationToAgentBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_AGENT_PERSON_ID = "agentPersonId";
	@JsonProperty(JSON_PROPERTY_AGENT_PERSON_ID)
	private String agentPersonId;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public InvitationsForwardConversationToAgentBody conversationId(String conversationId) {
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

	public InvitationsForwardConversationToAgentBody agentPersonId(String agentPersonId) {
		this.agentPersonId = agentPersonId;
		return this;
	}

	/**
	 * Person ID of the agent.
	 * 
	 * @return agentPersonId
	 **/
	@ApiModelProperty(value = "Person ID of the agent.")
	public String getAgentPersonId() {
		return agentPersonId;
	}

	public void setAgentPersonId(String agentPersonId) {
		this.agentPersonId = agentPersonId;
	}

	public InvitationsForwardConversationToAgentBody comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Invitation comment that will be displayed to the invited agent. Optional.
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "Invitation comment that will be displayed to the invited agent. Optional.")
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
		InvitationsForwardConversationToAgentBody invitationsForwardConversationToAgentBody = (InvitationsForwardConversationToAgentBody) o;
		return Objects.equals(this.conversationId, invitationsForwardConversationToAgentBody.conversationId) &&
				Objects.equals(this.agentPersonId, invitationsForwardConversationToAgentBody.agentPersonId) &&
				Objects.equals(this.comment, invitationsForwardConversationToAgentBody.comment);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, agentPersonId, comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsForwardConversationToAgentBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    agentPersonId: ").append(toIndentedString(agentPersonId)).append("\n");
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
