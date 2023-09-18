
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
 * Model used to request a chat suggestion in a conversation
 */
@ApiModel(description = "Model used to request a chat suggestion in a conversation")

@JsonPropertyOrder({
	ChatSuggestionRequest.JSON_PROPERTY_$_TYPE,
	ChatSuggestionRequest.JSON_PROPERTY_ACCOUNT_ID,
	ChatSuggestionRequest.JSON_PROPERTY_SERVICE_NAME,
	ChatSuggestionRequest.JSON_PROPERTY_SUGGESTION_ID,
	ChatSuggestionRequest.JSON_PROPERTY_REQUESTING_PERSON,
	ChatSuggestionRequest.JSON_PROPERTY_CONVERSATION,
	ChatSuggestionRequest.JSON_PROPERTY_RELATED_MESSAGES,
	ChatSuggestionRequest.JSON_PROPERTY_CAPABILITIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ChatSuggestionRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CHATSUGGESTIONREQUEST("ChatSuggestionRequest");

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
			return TypeEnum.CHATSUGGESTIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CHATSUGGESTIONREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_SUGGESTION_ID = "suggestionId";
	@JsonProperty(JSON_PROPERTY_SUGGESTION_ID)
	private String suggestionId;

	public static final String JSON_PROPERTY_REQUESTING_PERSON = "requestingPerson";
	@JsonProperty(JSON_PROPERTY_REQUESTING_PERSON)
	private PersonData requestingPerson = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_RELATED_MESSAGES = "relatedMessages";
	@JsonProperty(JSON_PROPERTY_RELATED_MESSAGES)
	private List<MessageData> relatedMessages = null;

	public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
	@JsonProperty(JSON_PROPERTY_CAPABILITIES)
	private ChatSuggestionRequestCapabilities capabilities = null;

	public ChatSuggestionRequest $type(TypeEnum $type) {
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

	public ChatSuggestionRequest accountId(String accountId) {
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

	public ChatSuggestionRequest serviceName(String serviceName) {
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

	public ChatSuggestionRequest suggestionId(String suggestionId) {
		this.suggestionId = suggestionId;
		return this;
	}

	/**
	 * Unique ID of the request
	 * 
	 * @return suggestionId
	 **/
	@ApiModelProperty(value = "Unique ID of the request")
	public String getSuggestionId() {
		return suggestionId;
	}

	public void setSuggestionId(String suggestionId) {
		this.suggestionId = suggestionId;
	}

	public ChatSuggestionRequest requestingPerson(PersonData requestingPerson) {
		this.requestingPerson = requestingPerson;
		return this;
	}

	/**
	 * Get requestingPerson
	 * 
	 * @return requestingPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getRequestingPerson() {
		return requestingPerson;
	}

	public void setRequestingPerson(PersonData requestingPerson) {
		this.requestingPerson = requestingPerson;
	}

	public ChatSuggestionRequest conversation(ConversationData conversation) {
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

	public ChatSuggestionRequest relatedMessages(List<MessageData> relatedMessages) {
		this.relatedMessages = relatedMessages;
		return this;
	}

	public ChatSuggestionRequest addRelatedMessagesItem(MessageData relatedMessagesItem) {
		if (this.relatedMessages == null) {
			this.relatedMessages = new ArrayList<>();
		}
		this.relatedMessages.add(relatedMessagesItem);
		return this;
	}

	/**
	 * The messages for which the person is requesting a suggestion
	 * 
	 * @return relatedMessages
	 **/
	@ApiModelProperty(value = "The messages for which the person is requesting a suggestion")
	public List<MessageData> getRelatedMessages() {
		return relatedMessages;
	}

	public void setRelatedMessages(List<MessageData> relatedMessages) {
		this.relatedMessages = relatedMessages;
	}

	public ChatSuggestionRequest capabilities(ChatSuggestionRequestCapabilities capabilities) {
		this.capabilities = capabilities;
		return this;
	}

	/**
	 * Get capabilities
	 * 
	 * @return capabilities
	 **/
	@ApiModelProperty(value = "")
	public ChatSuggestionRequestCapabilities getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(ChatSuggestionRequestCapabilities capabilities) {
		this.capabilities = capabilities;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ChatSuggestionRequest chatSuggestionRequest = (ChatSuggestionRequest) o;
		return Objects.equals(this.$type, chatSuggestionRequest.$type) &&
				Objects.equals(this.accountId, chatSuggestionRequest.accountId) &&
				Objects.equals(this.serviceName, chatSuggestionRequest.serviceName) &&
				Objects.equals(this.suggestionId, chatSuggestionRequest.suggestionId) &&
				Objects.equals(this.requestingPerson, chatSuggestionRequest.requestingPerson) &&
				Objects.equals(this.conversation, chatSuggestionRequest.conversation) &&
				Objects.equals(this.relatedMessages, chatSuggestionRequest.relatedMessages) &&
				Objects.equals(this.capabilities, chatSuggestionRequest.capabilities);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, suggestionId, requestingPerson, conversation, relatedMessages, capabilities);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ChatSuggestionRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    suggestionId: ").append(toIndentedString(suggestionId)).append("\n");
		sb.append("    requestingPerson: ").append(toIndentedString(requestingPerson)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    relatedMessages: ").append(toIndentedString(relatedMessages)).append("\n");
		sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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
