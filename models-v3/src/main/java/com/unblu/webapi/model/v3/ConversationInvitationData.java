
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * ConversationInvitationData
 */

@JsonPropertyOrder({
	ConversationInvitationData.JSON_PROPERTY_$_TYPE,
	ConversationInvitationData.JSON_PROPERTY_ACCOUNT_ID,
	ConversationInvitationData.JSON_PROPERTY_INVITATION_TYPE,
	ConversationInvitationData.JSON_PROPERTY_INVITATION_STATE,
	ConversationInvitationData.JSON_PROPERTY_ID,
	ConversationInvitationData.JSON_PROPERTY_CONVERSATION_ID,
	ConversationInvitationData.JSON_PROPERTY_TOKEN,
	ConversationInvitationData.JSON_PROPERTY_CREATED_TIMESTAMP,
	ConversationInvitationData.JSON_PROPERTY_CREATOR_TYPE,
	ConversationInvitationData.JSON_PROPERTY_CREATOR_PERSON_ID,
	ConversationInvitationData.JSON_PROPERTY_TARGET_ID,
	ConversationInvitationData.JSON_PROPERTY_TARGET_TYPE,
	ConversationInvitationData.JSON_PROPERTY_LINKS,
	ConversationInvitationData.JSON_PROPERTY_REDEEMING_PERSON_ID,
	ConversationInvitationData.JSON_PROPERTY_COMMENT,
	ConversationInvitationData.JSON_PROPERTY_EMAIL,
	ConversationInvitationData.JSON_PROPERTY_NICKNAME,
	ConversationInvitationData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationInvitationData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONINVITATIONDATA("ConversationInvitationData");

		private String value;

		TypeEnum(String value) {
			this.value = value;
		}

		@JsonValue
		public String getValue() {
			return value;
		}

		@Override
		public String toString() {
			return String.valueOf(value);
		}

		@JsonCreator
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.CONVERSATIONINVITATIONDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONINVITATIONDATA;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_INVITATION_TYPE = "invitationType";
	@JsonProperty(JSON_PROPERTY_INVITATION_TYPE)
	private EInvitationType invitationType;

	public static final String JSON_PROPERTY_INVITATION_STATE = "invitationState";
	@JsonProperty(JSON_PROPERTY_INVITATION_STATE)
	private EInvitationState invitationState;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_CREATED_TIMESTAMP = "createdTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATED_TIMESTAMP)
	private Long createdTimestamp;

	public static final String JSON_PROPERTY_CREATOR_TYPE = "creatorType";
	@JsonProperty(JSON_PROPERTY_CREATOR_TYPE)
	private EInvitationCreatorType creatorType;

	public static final String JSON_PROPERTY_CREATOR_PERSON_ID = "creatorPersonId";
	@JsonProperty(JSON_PROPERTY_CREATOR_PERSON_ID)
	private String creatorPersonId;

	public static final String JSON_PROPERTY_TARGET_ID = "targetId";
	@JsonProperty(JSON_PROPERTY_TARGET_ID)
	private String targetId;

	public static final String JSON_PROPERTY_TARGET_TYPE = "targetType";
	@JsonProperty(JSON_PROPERTY_TARGET_TYPE)
	private EInvitationTargetType targetType;

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<ConversationLink> links = null;

	public static final String JSON_PROPERTY_REDEEMING_PERSON_ID = "redeemingPersonId";
	@JsonProperty(JSON_PROPERTY_REDEEMING_PERSON_ID)
	private String redeemingPersonId;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public static final String JSON_PROPERTY_EMAIL = "email";
	@JsonProperty(JSON_PROPERTY_EMAIL)
	private String email;

	public static final String JSON_PROPERTY_NICKNAME = "nickname";
	@JsonProperty(JSON_PROPERTY_NICKNAME)
	private String nickname;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public ConversationInvitationData $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public ConversationInvitationData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the invitation originated from.
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the invitation originated from.")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationInvitationData invitationType(EInvitationType invitationType) {
		this.invitationType = invitationType;
		return this;
	}

	/**
	 * Get invitationType
	 * 
	 * @return invitationType
	 **/
	@ApiModelProperty(value = "")
	public EInvitationType getInvitationType() {
		return invitationType;
	}

	public void setInvitationType(EInvitationType invitationType) {
		this.invitationType = invitationType;
	}

	public ConversationInvitationData invitationState(EInvitationState invitationState) {
		this.invitationState = invitationState;
		return this;
	}

	/**
	 * Get invitationState
	 * 
	 * @return invitationState
	 **/
	@ApiModelProperty(value = "")
	public EInvitationState getInvitationState() {
		return invitationState;
	}

	public void setInvitationState(EInvitationState invitationState) {
		this.invitationState = invitationState;
	}

	public ConversationInvitationData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Id of the invitation
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Id of the invitation")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ConversationInvitationData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation that this invitation is for
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation that this invitation is for")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ConversationInvitationData token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Token (digits for pin or character sequence) required to redeem or revoke the invitation
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "Token (digits for pin or character sequence) required to redeem or revoke the invitation")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public ConversationInvitationData createdTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
		return this;
	}

	/**
	 * Unix timestamp of when the invitation was created
	 * 
	 * @return createdTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp of when the invitation was created")
	public Long getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Long createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public ConversationInvitationData creatorType(EInvitationCreatorType creatorType) {
		this.creatorType = creatorType;
		return this;
	}

	/**
	 * Get creatorType
	 * 
	 * @return creatorType
	 **/
	@ApiModelProperty(value = "")
	public EInvitationCreatorType getCreatorType() {
		return creatorType;
	}

	public void setCreatorType(EInvitationCreatorType creatorType) {
		this.creatorType = creatorType;
	}

	public ConversationInvitationData creatorPersonId(String creatorPersonId) {
		this.creatorPersonId = creatorPersonId;
		return this;
	}

	/**
	 * If the creator is an agent or visitor, then this contains the ID of the corresponding person.
	 * 
	 * @return creatorPersonId
	 **/
	@ApiModelProperty(value = "If the creator is an agent or visitor, then this contains the ID of the corresponding person.")
	public String getCreatorPersonId() {
		return creatorPersonId;
	}

	public void setCreatorPersonId(String creatorPersonId) {
		this.creatorPersonId = creatorPersonId;
	}

	public ConversationInvitationData targetId(String targetId) {
		this.targetId = targetId;
		return this;
	}

	/**
	 * ID of the recipient that is expected to redeem this invitation
	 * 
	 * @return targetId
	 **/
	@ApiModelProperty(value = "ID of the recipient that is expected to redeem this invitation")
	public String getTargetId() {
		return targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public ConversationInvitationData targetType(EInvitationTargetType targetType) {
		this.targetType = targetType;
		return this;
	}

	/**
	 * Get targetType
	 * 
	 * @return targetType
	 **/
	@ApiModelProperty(value = "")
	public EInvitationTargetType getTargetType() {
		return targetType;
	}

	public void setTargetType(EInvitationTargetType targetType) {
		this.targetType = targetType;
	}

	public ConversationInvitationData links(List<ConversationLink> links) {
		this.links = links;
		return this;
	}

	public ConversationInvitationData addLinksItem(ConversationLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * List of links that can be used to accept this invitation and open the corresponding conversation.&lt;br&gt; Only one link can be used.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "List of links that can be used to accept this invitation and open the corresponding conversation.<br> Only one link can be used.")
	public List<ConversationLink> getLinks() {
		return links;
	}

	public void setLinks(List<ConversationLink> links) {
		this.links = links;
	}

	public ConversationInvitationData redeemingPersonId(String redeemingPersonId) {
		this.redeemingPersonId = redeemingPersonId;
		return this;
	}

	/**
	 * ID of the person that redeemed this invitation. (Not present as long as the invitation is not redeemed)
	 * 
	 * @return redeemingPersonId
	 **/
	@ApiModelProperty(value = "ID of the person that redeemed this invitation. (Not present as long as the invitation is not redeemed)")
	public String getRedeemingPersonId() {
		return redeemingPersonId;
	}

	public void setRedeemingPersonId(String redeemingPersonId) {
		this.redeemingPersonId = redeemingPersonId;
	}

	public ConversationInvitationData comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Text provided by the creator of the invitation which will be displayed to the target of the invitation.
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "Text provided by the creator of the invitation which will be displayed to the target of the invitation.")
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public ConversationInvitationData email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Email address that will be used if an anonymous visitor redeems this invitation (only possible for Invitations of type VISITOR_INVITATION and
	 * PIN_CONVERSATION). The email address will be stored on the corresponding visitor&#39;s person.
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "Email address that will be used if an anonymous visitor redeems this invitation (only possible for Invitations of type VISITOR_INVITATION and PIN_CONVERSATION). The email address will be stored on the corresponding visitor's person.")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ConversationInvitationData nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * Nickname that will be used if an anonymous visitor redeems this invitation (only possible for Invitations of type VISITOR_INVITATION and PIN_CONVERSATION).
	 * The nickname will be stored on the corresponding visitor&#39;s person.
	 * 
	 * @return nickname
	 **/
	@ApiModelProperty(value = "Nickname that will be used if an anonymous visitor redeems this invitation (only possible for Invitations of type VISITOR_INVITATION and PIN_CONVERSATION). The nickname will be stored on the corresponding visitor's person.")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public ConversationInvitationData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp after witch the invitation is no longer valid
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp after witch the invitation is no longer valid")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationInvitationData conversationInvitationData = (ConversationInvitationData) o;
		return Objects.equals(this.$type, conversationInvitationData.$type) &&
				Objects.equals(this.accountId, conversationInvitationData.accountId) &&
				Objects.equals(this.invitationType, conversationInvitationData.invitationType) &&
				Objects.equals(this.invitationState, conversationInvitationData.invitationState) &&
				Objects.equals(this.id, conversationInvitationData.id) &&
				Objects.equals(this.conversationId, conversationInvitationData.conversationId) &&
				Objects.equals(this.token, conversationInvitationData.token) &&
				Objects.equals(this.createdTimestamp, conversationInvitationData.createdTimestamp) &&
				Objects.equals(this.creatorType, conversationInvitationData.creatorType) &&
				Objects.equals(this.creatorPersonId, conversationInvitationData.creatorPersonId) &&
				Objects.equals(this.targetId, conversationInvitationData.targetId) &&
				Objects.equals(this.targetType, conversationInvitationData.targetType) &&
				Objects.equals(this.links, conversationInvitationData.links) &&
				Objects.equals(this.redeemingPersonId, conversationInvitationData.redeemingPersonId) &&
				Objects.equals(this.comment, conversationInvitationData.comment) &&
				Objects.equals(this.email, conversationInvitationData.email) &&
				Objects.equals(this.nickname, conversationInvitationData.nickname) &&
				Objects.equals(this.expirationTimestamp, conversationInvitationData.expirationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, invitationType, invitationState, id, conversationId, token, createdTimestamp, creatorType, creatorPersonId, targetId, targetType, links, redeemingPersonId, comment, email, nickname, expirationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationInvitationData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    invitationType: ").append(toIndentedString(invitationType)).append("\n");
		sb.append("    invitationState: ").append(toIndentedString(invitationState)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
		sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
		sb.append("    creatorPersonId: ").append(toIndentedString(creatorPersonId)).append("\n");
		sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
		sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    redeemingPersonId: ").append(toIndentedString(redeemingPersonId)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
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
