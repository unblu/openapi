
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
 * Sent to a conversation access interceptor to decide whether access to a conversation is allowed
 */
@ApiModel(description = "Sent to a conversation access interceptor to decide whether access to a conversation is allowed")

@JsonPropertyOrder({
	ConversationAccessInterceptorRequest.JSON_PROPERTY_$_TYPE,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_ACCOUNT_ID,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_SERVICE_NAME,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_CONVERSATION,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_PERSON,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_PERSON_PRESENCE,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_CONVERSATION_ACCESS_TYPE,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_CONVERSATION_REAL_PARTICIPATION_TYPE,
	ConversationAccessInterceptorRequest.JSON_PROPERTY_INTEGRATION_ENVIRONMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationAccessInterceptorRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONACCESSINTERCEPTORREQUEST("ConversationAccessInterceptorRequest");

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
			return TypeEnum.CONVERSATIONACCESSINTERCEPTORREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONACCESSINTERCEPTORREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public static final String JSON_PROPERTY_PERSON_PRESENCE = "personPresence";
	@JsonProperty(JSON_PROPERTY_PERSON_PRESENCE)
	private PersonPresenceData personPresence = null;

	public static final String JSON_PROPERTY_CONVERSATION_ACCESS_TYPE = "conversationAccessType";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ACCESS_TYPE)
	private EConversationAccessType conversationAccessType;

	public static final String JSON_PROPERTY_CONVERSATION_REAL_PARTICIPATION_TYPE = "conversationRealParticipationType";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_REAL_PARTICIPATION_TYPE)
	private EConversationRealParticipationType conversationRealParticipationType;

	public static final String JSON_PROPERTY_INTEGRATION_ENVIRONMENT = "integrationEnvironment";
	@JsonProperty(JSON_PROPERTY_INTEGRATION_ENVIRONMENT)
	private EIntegrationEnvironment integrationEnvironment;

	public ConversationAccessInterceptorRequest $type(TypeEnum $type) {
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

	public ConversationAccessInterceptorRequest accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * Get accountId
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public ConversationAccessInterceptorRequest serviceName(String serviceName) {
		this.serviceName = serviceName;
		return this;
	}

	/**
	 * Get serviceName
	 * 
	 * @return serviceName
	 **/
	@ApiModelProperty(value = "")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public ConversationAccessInterceptorRequest conversation(ConversationData conversation) {
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

	public ConversationAccessInterceptorRequest person(PersonData person) {
		this.person = person;
		return this;
	}

	/**
	 * Get person
	 * 
	 * @return person
	 **/
	@ApiModelProperty(value = "")
	public PersonData getPerson() {
		return person;
	}

	public void setPerson(PersonData person) {
		this.person = person;
	}

	public ConversationAccessInterceptorRequest personPresence(PersonPresenceData personPresence) {
		this.personPresence = personPresence;
		return this;
	}

	/**
	 * Get personPresence
	 * 
	 * @return personPresence
	 **/
	@ApiModelProperty(value = "")
	public PersonPresenceData getPersonPresence() {
		return personPresence;
	}

	public void setPersonPresence(PersonPresenceData personPresence) {
		this.personPresence = personPresence;
	}

	public ConversationAccessInterceptorRequest conversationAccessType(EConversationAccessType conversationAccessType) {
		this.conversationAccessType = conversationAccessType;
		return this;
	}

	/**
	 * Get conversationAccessType
	 * 
	 * @return conversationAccessType
	 **/
	@ApiModelProperty(value = "")
	public EConversationAccessType getConversationAccessType() {
		return conversationAccessType;
	}

	public void setConversationAccessType(EConversationAccessType conversationAccessType) {
		this.conversationAccessType = conversationAccessType;
	}

	public ConversationAccessInterceptorRequest conversationRealParticipationType(EConversationRealParticipationType conversationRealParticipationType) {
		this.conversationRealParticipationType = conversationRealParticipationType;
		return this;
	}

	/**
	 * Get conversationRealParticipationType
	 * 
	 * @return conversationRealParticipationType
	 **/
	@ApiModelProperty(value = "")
	public EConversationRealParticipationType getConversationRealParticipationType() {
		return conversationRealParticipationType;
	}

	public void setConversationRealParticipationType(EConversationRealParticipationType conversationRealParticipationType) {
		this.conversationRealParticipationType = conversationRealParticipationType;
	}

	public ConversationAccessInterceptorRequest integrationEnvironment(EIntegrationEnvironment integrationEnvironment) {
		this.integrationEnvironment = integrationEnvironment;
		return this;
	}

	/**
	 * Get integrationEnvironment
	 * 
	 * @return integrationEnvironment
	 **/
	@ApiModelProperty(value = "")
	public EIntegrationEnvironment getIntegrationEnvironment() {
		return integrationEnvironment;
	}

	public void setIntegrationEnvironment(EIntegrationEnvironment integrationEnvironment) {
		this.integrationEnvironment = integrationEnvironment;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationAccessInterceptorRequest conversationAccessInterceptorRequest = (ConversationAccessInterceptorRequest) o;
		return Objects.equals(this.$type, conversationAccessInterceptorRequest.$type) &&
				Objects.equals(this.accountId, conversationAccessInterceptorRequest.accountId) &&
				Objects.equals(this.serviceName, conversationAccessInterceptorRequest.serviceName) &&
				Objects.equals(this.conversation, conversationAccessInterceptorRequest.conversation) &&
				Objects.equals(this.person, conversationAccessInterceptorRequest.person) &&
				Objects.equals(this.personPresence, conversationAccessInterceptorRequest.personPresence) &&
				Objects.equals(this.conversationAccessType, conversationAccessInterceptorRequest.conversationAccessType) &&
				Objects.equals(this.conversationRealParticipationType, conversationAccessInterceptorRequest.conversationRealParticipationType) &&
				Objects.equals(this.integrationEnvironment, conversationAccessInterceptorRequest.integrationEnvironment);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, conversation, person, personPresence, conversationAccessType, conversationRealParticipationType, integrationEnvironment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationAccessInterceptorRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
		sb.append("    personPresence: ").append(toIndentedString(personPresence)).append("\n");
		sb.append("    conversationAccessType: ").append(toIndentedString(conversationAccessType)).append("\n");
		sb.append("    conversationRealParticipationType: ").append(toIndentedString(conversationRealParticipationType)).append("\n");
		sb.append("    integrationEnvironment: ").append(toIndentedString(integrationEnvironment)).append("\n");
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
