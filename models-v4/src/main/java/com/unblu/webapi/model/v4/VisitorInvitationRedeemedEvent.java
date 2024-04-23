
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Visitor invitation revoked event
 */
@ApiModel(description = "Visitor invitation revoked event")

@JsonPropertyOrder({
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_$_TYPE,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_TIMESTAMP,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_EVENT_TYPE,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_ACCOUNT_ID,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_INVITATION_ID,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_CONVERSATION,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_TOKEN,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_CREATION_TIMESTAMP,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_CREATOR_TYPE,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_CREATOR_PERSON,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_EMAIL,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_NICKNAME,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	VisitorInvitationRedeemedEvent.JSON_PROPERTY_REDEEMING_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class VisitorInvitationRedeemedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		VISITORINVITATIONREDEEMEDEVENT("VisitorInvitationRedeemedEvent");

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
			return TypeEnum.VISITORINVITATIONREDEEMEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.VISITORINVITATIONREDEEMEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_INVITATION_ID = "invitationId";
	@JsonProperty(JSON_PROPERTY_INVITATION_ID)
	private String invitationId;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_CREATOR_TYPE = "creatorType";
	@JsonProperty(JSON_PROPERTY_CREATOR_TYPE)
	private EInvitationCreatorType creatorType;

	public static final String JSON_PROPERTY_CREATOR_PERSON = "creatorPerson";
	@JsonProperty(JSON_PROPERTY_CREATOR_PERSON)
	private PersonData creatorPerson = null;

	public static final String JSON_PROPERTY_EMAIL = "email";
	@JsonProperty(JSON_PROPERTY_EMAIL)
	private String email;

	public static final String JSON_PROPERTY_NICKNAME = "nickname";
	@JsonProperty(JSON_PROPERTY_NICKNAME)
	private String nickname;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_REDEEMING_PERSON = "redeemingPerson";
	@JsonProperty(JSON_PROPERTY_REDEEMING_PERSON)
	private PersonData redeemingPerson = null;

	public VisitorInvitationRedeemedEvent $type(TypeEnum $type) {
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

	public VisitorInvitationRedeemedEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The time (Unix time in ms) when the event was generated
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The time (Unix time in ms) when the event was generated")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public VisitorInvitationRedeemedEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public VisitorInvitationRedeemedEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public VisitorInvitationRedeemedEvent invitationId(String invitationId) {
		this.invitationId = invitationId;
		return this;
	}

	/**
	 * Id of the invitation
	 * 
	 * @return invitationId
	 **/
	@ApiModelProperty(value = "Id of the invitation")
	public String getInvitationId() {
		return invitationId;
	}

	public void setInvitationId(String invitationId) {
		this.invitationId = invitationId;
	}

	public VisitorInvitationRedeemedEvent conversation(ConversationData conversation) {
		this.conversation = conversation;
		return this;
	}

	/**
	 * Get conversation
	 * 
	 * @return conversation
	 **/
	@ApiModelProperty(value = "")
	public ConversationData getConversation() {
		return conversation;
	}

	public void setConversation(ConversationData conversation) {
		this.conversation = conversation;
	}

	public VisitorInvitationRedeemedEvent token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * Token (digits for pin or character sequence) requested to redeem or revoke the invitation
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "Token (digits for pin or character sequence) requested to redeem or revoke the invitation")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public VisitorInvitationRedeemedEvent creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the event was created
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the event was created")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public VisitorInvitationRedeemedEvent creatorType(EInvitationCreatorType creatorType) {
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

	public VisitorInvitationRedeemedEvent creatorPerson(PersonData creatorPerson) {
		this.creatorPerson = creatorPerson;
		return this;
	}

	/**
	 * Get creatorPerson
	 * 
	 * @return creatorPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getCreatorPerson() {
		return creatorPerson;
	}

	public void setCreatorPerson(PersonData creatorPerson) {
		this.creatorPerson = creatorPerson;
	}

	public VisitorInvitationRedeemedEvent email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * Visitor email
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "Visitor email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public VisitorInvitationRedeemedEvent nickname(String nickname) {
		this.nickname = nickname;
		return this;
	}

	/**
	 * Visitor nickname
	 * 
	 * @return nickname
	 **/
	@ApiModelProperty(value = "Visitor nickname")
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public VisitorInvitationRedeemedEvent expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) after witch the invitation is no longer valid
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) after witch the invitation is no longer valid")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public VisitorInvitationRedeemedEvent redeemingPerson(PersonData redeemingPerson) {
		this.redeemingPerson = redeemingPerson;
		return this;
	}

	/**
	 * Get redeemingPerson
	 * 
	 * @return redeemingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getRedeemingPerson() {
		return redeemingPerson;
	}

	public void setRedeemingPerson(PersonData redeemingPerson) {
		this.redeemingPerson = redeemingPerson;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VisitorInvitationRedeemedEvent visitorInvitationRedeemedEvent = (VisitorInvitationRedeemedEvent) o;
		return Objects.equals(this.$type, visitorInvitationRedeemedEvent.$type) &&
				Objects.equals(this.timestamp, visitorInvitationRedeemedEvent.timestamp) &&
				Objects.equals(this.eventType, visitorInvitationRedeemedEvent.eventType) &&
				Objects.equals(this.accountId, visitorInvitationRedeemedEvent.accountId) &&
				Objects.equals(this.invitationId, visitorInvitationRedeemedEvent.invitationId) &&
				Objects.equals(this.conversation, visitorInvitationRedeemedEvent.conversation) &&
				Objects.equals(this.token, visitorInvitationRedeemedEvent.token) &&
				Objects.equals(this.creationTimestamp, visitorInvitationRedeemedEvent.creationTimestamp) &&
				Objects.equals(this.creatorType, visitorInvitationRedeemedEvent.creatorType) &&
				Objects.equals(this.creatorPerson, visitorInvitationRedeemedEvent.creatorPerson) &&
				Objects.equals(this.email, visitorInvitationRedeemedEvent.email) &&
				Objects.equals(this.nickname, visitorInvitationRedeemedEvent.nickname) &&
				Objects.equals(this.expirationTimestamp, visitorInvitationRedeemedEvent.expirationTimestamp) &&
				Objects.equals(this.redeemingPerson, visitorInvitationRedeemedEvent.redeemingPerson);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, invitationId, conversation, token, creationTimestamp, creatorType, creatorPerson, email, nickname, expirationTimestamp, redeemingPerson);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VisitorInvitationRedeemedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
		sb.append("    creatorPerson: ").append(toIndentedString(creatorPerson)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    redeemingPerson: ").append(toIndentedString(redeemingPerson)).append("\n");
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
