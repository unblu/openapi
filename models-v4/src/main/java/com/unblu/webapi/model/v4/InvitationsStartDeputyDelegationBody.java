
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;invitationsStartDeputyDelegation&#39; operation
 */
@ApiModel(description = "Request body for the 'invitationsStartDeputyDelegation' operation")

@JsonPropertyOrder({
	InvitationsStartDeputyDelegationBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsStartDeputyDelegationBody.JSON_PROPERTY_JOIN_DEPUTY_HIDDEN,
	InvitationsStartDeputyDelegationBody.JSON_PROPERTY_DELEGATION_LEVEL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsStartDeputyDelegationBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_JOIN_DEPUTY_HIDDEN = "joinDeputyHidden";
	@JsonProperty(JSON_PROPERTY_JOIN_DEPUTY_HIDDEN)
	private Boolean joinDeputyHidden;

	public static final String JSON_PROPERTY_DELEGATION_LEVEL = "delegationLevel";
	@JsonProperty(JSON_PROPERTY_DELEGATION_LEVEL)
	private EDeputyDelegationEscalationLevel delegationLevel;

	public InvitationsStartDeputyDelegationBody conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation to delegate to a deputy
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation to delegate to a deputy")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public InvitationsStartDeputyDelegationBody joinDeputyHidden(Boolean joinDeputyHidden) {
		this.joinDeputyHidden = joinDeputyHidden;
		return this;
	}

	/**
	 * If true, the deputy who accepts the delegation invitation joins the conversation as a hidden participant, otherwise the visitor can see them
	 * 
	 * @return joinDeputyHidden
	 **/
	@ApiModelProperty(value = "If true, the deputy who accepts the delegation invitation joins the conversation as a hidden participant, otherwise the visitor can see them")
	public Boolean isJoinDeputyHidden() {
		return joinDeputyHidden;
	}

	public void setJoinDeputyHidden(Boolean joinDeputyHidden) {
		this.joinDeputyHidden = joinDeputyHidden;
	}

	public InvitationsStartDeputyDelegationBody delegationLevel(EDeputyDelegationEscalationLevel delegationLevel) {
		this.delegationLevel = delegationLevel;
		return this;
	}

	/**
	 * Get delegationLevel
	 * 
	 * @return delegationLevel
	 **/
	@ApiModelProperty(value = "")
	public EDeputyDelegationEscalationLevel getDelegationLevel() {
		return delegationLevel;
	}

	public void setDelegationLevel(EDeputyDelegationEscalationLevel delegationLevel) {
		this.delegationLevel = delegationLevel;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationsStartDeputyDelegationBody invitationsStartDeputyDelegationBody = (InvitationsStartDeputyDelegationBody) o;
		return Objects.equals(this.conversationId, invitationsStartDeputyDelegationBody.conversationId) &&
				Objects.equals(this.joinDeputyHidden, invitationsStartDeputyDelegationBody.joinDeputyHidden) &&
				Objects.equals(this.delegationLevel, invitationsStartDeputyDelegationBody.delegationLevel);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, joinDeputyHidden, delegationLevel);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsStartDeputyDelegationBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    joinDeputyHidden: ").append(toIndentedString(joinDeputyHidden)).append("\n");
		sb.append("    delegationLevel: ").append(toIndentedString(delegationLevel)).append("\n");
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
