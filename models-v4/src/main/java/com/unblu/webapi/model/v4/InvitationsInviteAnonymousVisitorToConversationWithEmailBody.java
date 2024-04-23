
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;invitationsInviteAnonymousVisitorToConversationWithEmail&#39; operation
 */
@ApiModel(description = "Request body for the 'invitationsInviteAnonymousVisitorToConversationWithEmail' operation")

@JsonPropertyOrder({
	InvitationsInviteAnonymousVisitorToConversationWithEmailBody.JSON_PROPERTY_CONVERSATION_ID,
	InvitationsInviteAnonymousVisitorToConversationWithEmailBody.JSON_PROPERTY_EMAIL,
	InvitationsInviteAnonymousVisitorToConversationWithEmailBody.JSON_PROPERTY_NICKNAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InvitationsInviteAnonymousVisitorToConversationWithEmailBody {
	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EMAIL = "email";
	@JsonProperty(JSON_PROPERTY_EMAIL)
	private String email;

	public static final String JSON_PROPERTY_NICKNAME = "nickname";
	@JsonProperty(JSON_PROPERTY_NICKNAME)
	private String nickname;

	public InvitationsInviteAnonymousVisitorToConversationWithEmailBody conversationId(String conversationId) {
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

	public InvitationsInviteAnonymousVisitorToConversationWithEmailBody email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Email address that will be applied to the visitor who accepts the invitation if they are anonymous and haven&#39;t provided an email address. Optional.
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "Email address that will be applied to the visitor who accepts the invitation if they are anonymous and haven't provided an email address. Optional.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InvitationsInviteAnonymousVisitorToConversationWithEmailBody nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * Nickname that will be applied to the visitor who accepts the invitation if they are anonymous and don&#39;t already have a nickname set. Optional.
	 * 
	 * @return nickname
	 **/
	@ApiModelProperty(value = "Nickname that will be applied to the visitor who accepts the invitation if they are anonymous and don't already have a nickname set. Optional.")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InvitationsInviteAnonymousVisitorToConversationWithEmailBody invitationsInviteAnonymousVisitorToConversationWithEmailBody = (InvitationsInviteAnonymousVisitorToConversationWithEmailBody) o;
		return Objects.equals(this.conversationId, invitationsInviteAnonymousVisitorToConversationWithEmailBody.conversationId) &&
				Objects.equals(this.email, invitationsInviteAnonymousVisitorToConversationWithEmailBody.email) &&
				Objects.equals(this.nickname, invitationsInviteAnonymousVisitorToConversationWithEmailBody.nickname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(conversationId, email, nickname);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InvitationsInviteAnonymousVisitorToConversationWithEmailBody {\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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
