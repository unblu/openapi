
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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Visitor invitation created event
 */
@ApiModel(description = "Visitor invitation created event")

@JsonPropertyOrder({
	VisitorInvitationRenewedEvent.JSON_PROPERTY_$_TYPE,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_TIMESTAMP,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_EVENT_TYPE,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_ACCOUNT_ID,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_INVITATION_ID,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_CONVERSATION_ID,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_CONVERSATION,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_TOKEN,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_DATE_CREATED,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_CREATOR_TYPE,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_CREATOR_PERSON,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_EMAIL,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_NICKNAME,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	VisitorInvitationRenewedEvent.JSON_PROPERTY_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class VisitorInvitationRenewedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		VISITORINVITATIONRENEWEDEVENT("VisitorInvitationRenewedEvent");

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
			return TypeEnum.VISITORINVITATIONRENEWEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.VISITORINVITATIONRENEWEDEVENT;

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

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
	@JsonProperty(JSON_PROPERTY_DATE_CREATED)
	private Long dateCreated;

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

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<ConversationLink> links = null;

	public VisitorInvitationRenewedEvent $type(TypeEnum $type) {
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

	public VisitorInvitationRenewedEvent timestamp(Long timestamp) {
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

	public VisitorInvitationRenewedEvent eventType(String eventType) {
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

	public VisitorInvitationRenewedEvent accountId(String accountId) {
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

	public VisitorInvitationRenewedEvent invitationId(String invitationId) {
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

	public VisitorInvitationRenewedEvent conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Id of the conversation. Duplicate: Use conversation.id instead.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Id of the conversation. Duplicate: Use conversation.id instead.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public VisitorInvitationRenewedEvent conversation(ConversationData conversation) {
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

	public VisitorInvitationRenewedEvent token(String token) {
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

	public VisitorInvitationRenewedEvent dateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the event was created
	 * 
	 * @return dateCreated
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the event was created")
	public Long getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Long dateCreated) {
		this.dateCreated = dateCreated;
	}

	public VisitorInvitationRenewedEvent creatorType(EInvitationCreatorType creatorType) {
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

	public VisitorInvitationRenewedEvent creatorPerson(PersonData creatorPerson) {
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

	public VisitorInvitationRenewedEvent email(String email) {
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

	public VisitorInvitationRenewedEvent nickname(String nickname) {
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

	public VisitorInvitationRenewedEvent expirationTimestamp(Long expirationTimestamp) {
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

	public VisitorInvitationRenewedEvent links(List<ConversationLink> links) {
		this.links = links;
		return this;
	}

	public VisitorInvitationRenewedEvent addLinksItem(ConversationLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * List of links to accept the visitor invitation event with the token.&lt;br&gt; Only one link may be used.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "List of links to accept the visitor invitation event with the token.<br> Only one link may be used.")
	public List<ConversationLink> getLinks() {
		return links;
	}

	public void setLinks(List<ConversationLink> links) {
		this.links = links;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		VisitorInvitationRenewedEvent visitorInvitationRenewedEvent = (VisitorInvitationRenewedEvent) o;
		return Objects.equals(this.$type, visitorInvitationRenewedEvent.$type) &&
				Objects.equals(this.timestamp, visitorInvitationRenewedEvent.timestamp) &&
				Objects.equals(this.eventType, visitorInvitationRenewedEvent.eventType) &&
				Objects.equals(this.accountId, visitorInvitationRenewedEvent.accountId) &&
				Objects.equals(this.invitationId, visitorInvitationRenewedEvent.invitationId) &&
				Objects.equals(this.conversationId, visitorInvitationRenewedEvent.conversationId) &&
				Objects.equals(this.conversation, visitorInvitationRenewedEvent.conversation) &&
				Objects.equals(this.token, visitorInvitationRenewedEvent.token) &&
				Objects.equals(this.dateCreated, visitorInvitationRenewedEvent.dateCreated) &&
				Objects.equals(this.creatorType, visitorInvitationRenewedEvent.creatorType) &&
				Objects.equals(this.creatorPerson, visitorInvitationRenewedEvent.creatorPerson) &&
				Objects.equals(this.email, visitorInvitationRenewedEvent.email) &&
				Objects.equals(this.nickname, visitorInvitationRenewedEvent.nickname) &&
				Objects.equals(this.expirationTimestamp, visitorInvitationRenewedEvent.expirationTimestamp) &&
				Objects.equals(this.links, visitorInvitationRenewedEvent.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, invitationId, conversationId, conversation, token, dateCreated, creatorType, creatorPerson, email, nickname, expirationTimestamp, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class VisitorInvitationRenewedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    invitationId: ").append(toIndentedString(invitationId)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
		sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
		sb.append("    creatorPerson: ").append(toIndentedString(creatorPerson)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
