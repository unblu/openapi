
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
 * Assignment request created event
 */
@ApiModel(description = "Assignment request created event")

@JsonPropertyOrder({
	AssignmentRequestCreatedEvent.JSON_PROPERTY_$_TYPE,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_TIMESTAMP,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_EVENT_TYPE,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_ACCOUNT_ID,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_INVITATION_ID,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_CONVERSATION_ID,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_CONVERSATION,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_TOKEN,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_DATE_CREATED,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_CREATOR_TYPE,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_CREATOR_PERSON,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_CONTEXT_PERSON_INFO,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_TARGET,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_LINKS,
	AssignmentRequestCreatedEvent.JSON_PROPERTY_INITIAL_ENGAGEMENT_URL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AssignmentRequestCreatedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ASSIGNMENTREQUESTCREATEDEVENT("AssignmentRequestCreatedEvent");

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
			return TypeEnum.ASSIGNMENTREQUESTCREATEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ASSIGNMENTREQUESTCREATEDEVENT;

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
	private ConversationRecipientData target = null;

	public static final String JSON_PROPERTY_LINKS = "links";
	@JsonProperty(JSON_PROPERTY_LINKS)
	private List<ConversationLink> links = null;

	public static final String JSON_PROPERTY_INITIAL_ENGAGEMENT_URL = "initialEngagementUrl";
	@JsonProperty(JSON_PROPERTY_INITIAL_ENGAGEMENT_URL)
	private String initialEngagementUrl;

	public AssignmentRequestCreatedEvent $type(TypeEnum $type) {
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

	public AssignmentRequestCreatedEvent timestamp(Long timestamp) {
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

	public AssignmentRequestCreatedEvent eventType(String eventType) {
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

	public AssignmentRequestCreatedEvent accountId(String accountId) {
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

	public AssignmentRequestCreatedEvent invitationId(String invitationId) {
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

	public AssignmentRequestCreatedEvent conversationId(String conversationId) {
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

	public AssignmentRequestCreatedEvent conversation(ConversationData conversation) {
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

	public AssignmentRequestCreatedEvent token(String token) {
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

	public AssignmentRequestCreatedEvent dateCreated(Long dateCreated) {
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

	public AssignmentRequestCreatedEvent creatorType(EInvitationCreatorType creatorType) {
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

	public AssignmentRequestCreatedEvent creatorPerson(PersonData creatorPerson) {
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

	public AssignmentRequestCreatedEvent contextPersonInfo(ContextPersonInfo contextPersonInfo) {
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

	public AssignmentRequestCreatedEvent target(ConversationRecipientData target) {
		this.target = target;
		return this;
	}

	/**
	 * Get target
	 * 
	 * @return target
	 **/
	@ApiModelProperty(value = "")
	public ConversationRecipientData getTarget() {
		return target;
	}

	public void setTarget(ConversationRecipientData target) {
		this.target = target;
	}

	public AssignmentRequestCreatedEvent links(List<ConversationLink> links) {
		this.links = links;
		return this;
	}

	public AssignmentRequestCreatedEvent addLinksItem(ConversationLink linksItem) {
		if (this.links == null) {
			this.links = new ArrayList<>();
		}
		this.links.add(linksItem);
		return this;
	}

	/**
	 * List of links to accept the assignment request event with the token.&lt;br&gt; Only one link may be used.
	 * 
	 * @return links
	 **/
	@ApiModelProperty(value = "List of links to accept the assignment request event with the token.<br> Only one link may be used.")
	public List<ConversationLink> getLinks() {
		return links;
	}

	public void setLinks(List<ConversationLink> links) {
		this.links = links;
	}

	public AssignmentRequestCreatedEvent initialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
		return this;
	}

	/**
	 * The URL where the visitor originating the conversation was. Only available for conversations originated by a visitor where Unblu was integrated in the
	 * customers website. e.g. conversations initiated from the mobile SDK won&#39;t have an initial engagement URL. Duplicate: Use
	 * conversation.initialEngagementUrl instead.
	 * 
	 * @return initialEngagementUrl
	 **/
	@ApiModelProperty(value = "The URL where the visitor originating the conversation was. Only available for conversations originated by a visitor where Unblu was integrated in the customers website. e.g. conversations initiated from the mobile SDK won't have an initial engagement URL. Duplicate: Use conversation.initialEngagementUrl instead.")
	public String getInitialEngagementUrl() {
		return initialEngagementUrl;
	}

	public void setInitialEngagementUrl(String initialEngagementUrl) {
		this.initialEngagementUrl = initialEngagementUrl;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AssignmentRequestCreatedEvent assignmentRequestCreatedEvent = (AssignmentRequestCreatedEvent) o;
		return Objects.equals(this.$type, assignmentRequestCreatedEvent.$type) &&
				Objects.equals(this.timestamp, assignmentRequestCreatedEvent.timestamp) &&
				Objects.equals(this.eventType, assignmentRequestCreatedEvent.eventType) &&
				Objects.equals(this.accountId, assignmentRequestCreatedEvent.accountId) &&
				Objects.equals(this.invitationId, assignmentRequestCreatedEvent.invitationId) &&
				Objects.equals(this.conversationId, assignmentRequestCreatedEvent.conversationId) &&
				Objects.equals(this.conversation, assignmentRequestCreatedEvent.conversation) &&
				Objects.equals(this.token, assignmentRequestCreatedEvent.token) &&
				Objects.equals(this.dateCreated, assignmentRequestCreatedEvent.dateCreated) &&
				Objects.equals(this.creatorType, assignmentRequestCreatedEvent.creatorType) &&
				Objects.equals(this.creatorPerson, assignmentRequestCreatedEvent.creatorPerson) &&
				Objects.equals(this.contextPersonInfo, assignmentRequestCreatedEvent.contextPersonInfo) &&
				Objects.equals(this.target, assignmentRequestCreatedEvent.target) &&
				Objects.equals(this.links, assignmentRequestCreatedEvent.links) &&
				Objects.equals(this.initialEngagementUrl, assignmentRequestCreatedEvent.initialEngagementUrl);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, invitationId, conversationId, conversation, token, dateCreated, creatorType, creatorPerson, contextPersonInfo, target, links, initialEngagementUrl);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AssignmentRequestCreatedEvent {\n");
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
		sb.append("    links: ").append(toIndentedString(links)).append("\n");
		sb.append("    initialEngagementUrl: ").append(toIndentedString(initialEngagementUrl)).append("\n");
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
