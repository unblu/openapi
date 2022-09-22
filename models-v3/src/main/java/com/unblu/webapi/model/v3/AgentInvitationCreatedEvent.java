
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
 * Agent invitation created event
 */
@ApiModel(description = "Agent invitation created event")

@JsonPropertyOrder({
	AgentInvitationCreatedEvent.JSON_PROPERTY_$_TYPE,
	AgentInvitationCreatedEvent.JSON_PROPERTY_TIMESTAMP,
	AgentInvitationCreatedEvent.JSON_PROPERTY_EVENT_TYPE,
	AgentInvitationCreatedEvent.JSON_PROPERTY_ACCOUNT_ID,
	AgentInvitationCreatedEvent.JSON_PROPERTY_INVITATION_ID,
	AgentInvitationCreatedEvent.JSON_PROPERTY_CONVERSATION_ID,
	AgentInvitationCreatedEvent.JSON_PROPERTY_CONVERSATION,
	AgentInvitationCreatedEvent.JSON_PROPERTY_TOKEN,
	AgentInvitationCreatedEvent.JSON_PROPERTY_DATE_CREATED,
	AgentInvitationCreatedEvent.JSON_PROPERTY_CREATOR_TYPE,
	AgentInvitationCreatedEvent.JSON_PROPERTY_CREATOR_PERSON,
	AgentInvitationCreatedEvent.JSON_PROPERTY_CONTEXT_PERSON_INFO,
	AgentInvitationCreatedEvent.JSON_PROPERTY_TARGET,
	AgentInvitationCreatedEvent.JSON_PROPERTY_COMMENT,
	AgentInvitationCreatedEvent.JSON_PROPERTY_LINKS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AgentInvitationCreatedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AGENTINVITATIONCREATEDEVENT("AgentInvitationCreatedEvent");

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
			return TypeEnum.AGENTINVITATIONCREATEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AGENTINVITATIONCREATEDEVENT;

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

	public static final String JSON_PROPERTY_CONTEXT_PERSON_INFO = "contextPersonInfo";
	@JsonProperty(JSON_PROPERTY_CONTEXT_PERSON_INFO)
	private ContextPersonInfo contextPersonInfo = null;

	public static final String JSON_PROPERTY_TARGET = "target";
	@JsonProperty(JSON_PROPERTY_TARGET)
	private AgentTargetData target = null;

	public static final String JSON_PROPERTY_COMMENT = "comment";
	@JsonProperty(JSON_PROPERTY_COMMENT)
	private String comment;

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<ConversationLink> links = null;

	public AgentInvitationCreatedEvent $type(TypeEnum $type) {
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

	public AgentInvitationCreatedEvent timestamp(Long timestamp) {
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

	public AgentInvitationCreatedEvent eventType(String eventType) {
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

	public AgentInvitationCreatedEvent accountId(String accountId) {
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

	public AgentInvitationCreatedEvent invitationId(String invitationId) {
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

	public AgentInvitationCreatedEvent conversationId(String conversationId) {
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

	public AgentInvitationCreatedEvent conversation(ConversationData conversation) {
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

	public AgentInvitationCreatedEvent token(String token) {
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

	public AgentInvitationCreatedEvent dateCreated(Long dateCreated) {
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

	public AgentInvitationCreatedEvent creatorType(EInvitationCreatorType creatorType) {
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

	public AgentInvitationCreatedEvent creatorPerson(PersonData creatorPerson) {
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

	public AgentInvitationCreatedEvent contextPersonInfo(ContextPersonInfo contextPersonInfo) {
		this.contextPersonInfo = contextPersonInfo;
		return this;
	}

	/**
	 * Get contextPersonInfo
	 * 
	 * @return contextPersonInfo
	 **/
	@ApiModelProperty(value = "")
	public ContextPersonInfo getContextPersonInfo() {
		return contextPersonInfo;
	}

	public void setContextPersonInfo(ContextPersonInfo contextPersonInfo) {
		this.contextPersonInfo = contextPersonInfo;
	}

	public AgentInvitationCreatedEvent target(AgentTargetData target) {
		this.target = target;
		return this;
	}

	/**
	 * Get target
	 * 
	 * @return target
	 **/
	@ApiModelProperty(value = "")
	public AgentTargetData getTarget() {
		return target;
	}

	public void setTarget(AgentTargetData target) {
		this.target = target;
	}

	public AgentInvitationCreatedEvent comment(String comment) {
		this.comment = comment;
		return this;
	}

	/**
	 * Text provided by the creator for the target
	 * 
	 * @return comment
	 **/
	@ApiModelProperty(value = "Text provided by the creator for the target")
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public AgentInvitationCreatedEvent links(List<ConversationLink> links) {
		this.links = links;
		return this;
	}

	public AgentInvitationCreatedEvent addLinksItem(ConversationLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * List of links to accept the agent invitation event with the token.&lt;br&gt; Only one link may be used.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "List of links to accept the agent invitation event with the token.<br> Only one link may be used.")
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
		AgentInvitationCreatedEvent agentInvitationCreatedEvent = (AgentInvitationCreatedEvent) o;
		return Objects.equals(this.$type, agentInvitationCreatedEvent.$type) &&
				Objects.equals(this.timestamp, agentInvitationCreatedEvent.timestamp) &&
				Objects.equals(this.eventType, agentInvitationCreatedEvent.eventType) &&
				Objects.equals(this.accountId, agentInvitationCreatedEvent.accountId) &&
				Objects.equals(this.invitationId, agentInvitationCreatedEvent.invitationId) &&
				Objects.equals(this.conversationId, agentInvitationCreatedEvent.conversationId) &&
				Objects.equals(this.conversation, agentInvitationCreatedEvent.conversation) &&
				Objects.equals(this.token, agentInvitationCreatedEvent.token) &&
				Objects.equals(this.dateCreated, agentInvitationCreatedEvent.dateCreated) &&
				Objects.equals(this.creatorType, agentInvitationCreatedEvent.creatorType) &&
				Objects.equals(this.creatorPerson, agentInvitationCreatedEvent.creatorPerson) &&
				Objects.equals(this.contextPersonInfo, agentInvitationCreatedEvent.contextPersonInfo) &&
				Objects.equals(this.target, agentInvitationCreatedEvent.target) &&
				Objects.equals(this.comment, agentInvitationCreatedEvent.comment) &&
				Objects.equals(this.links, agentInvitationCreatedEvent.links);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, invitationId, conversationId, conversation, token, dateCreated, creatorType, creatorPerson, contextPersonInfo, target, comment, links);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgentInvitationCreatedEvent {\n");
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
		sb.append("    contextPersonInfo: ").append(toIndentedString(contextPersonInfo)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
