
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;invitationsRequeueConversation&#39; operation
 */
@ApiModel(description = "Request Body for the 'invitationsRequeueConversation' operation")

@JsonPropertyOrder({
	InvitationsRequeueConversationBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsRequeueConversationBody.JSON_PROPERTY_AGENT_REMOVAL_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsRequeueConversationBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_AGENT_REMOVAL_TYPE = "agentRemovalType";
	@JsonProperty(JSON_PROPERTY_AGENT_REMOVAL_TYPE)
	private EAgentRemovalType agentRemovalType;

	public InvitationsRequeueConversationBody conversationId(String conversationId) {
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

	public InvitationsRequeueConversationBody agentRemovalType(EAgentRemovalType agentRemovalType) {
		this.agentRemovalType = agentRemovalType;
		return this;
	}

	/**
	 * Get agentRemovalType
	 * 
	 * @return agentRemovalType
	 **/
	@ApiModelProperty(value = "")
	public EAgentRemovalType getAgentRemovalType() {
		return agentRemovalType;
	}

	public void setAgentRemovalType(EAgentRemovalType agentRemovalType) {
		this.agentRemovalType = agentRemovalType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationsRequeueConversationBody invitationsRequeueConversationBody = (InvitationsRequeueConversationBody) o;
		return Objects.equals(this.conversationId, invitationsRequeueConversationBody.conversationId) &&
				Objects.equals(this.agentRemovalType, invitationsRequeueConversationBody.agentRemovalType);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, agentRemovalType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsRequeueConversationBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    agentRemovalType: ").append(toIndentedString(agentRemovalType)).append("\n");
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
