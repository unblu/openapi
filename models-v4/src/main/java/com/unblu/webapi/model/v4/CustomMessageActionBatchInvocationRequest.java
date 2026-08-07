
package com.unblu.webapi.model.v4;

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
 * A request triggered when a custom message action is invoked on multiple messages at once.
 */
@ApiModel(description = "A request triggered when a custom message action is invoked on multiple messages at once.")

@JsonPropertyOrder({
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_$_TYPE,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_ACCOUNT_ID,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_SERVICE_NAME,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_ACTION_TYPE,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_ACTION_KEY,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_ACTION_INVOCATION_ID,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_EXECUTED_BY,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_CONVERSATION,
	CustomMessageActionBatchInvocationRequest.JSON_PROPERTY_MESSAGES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomMessageActionBatchInvocationRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMMESSAGEACTIONBATCHINVOCATIONREQUEST("CustomMessageActionBatchInvocationRequest");

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
			return TypeEnum.CUSTOMMESSAGEACTIONBATCHINVOCATIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMMESSAGEACTIONBATCHINVOCATIONREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
	@JsonProperty(JSON_PROPERTY_ACTION_TYPE)
	private ECustomActionType actionType;

	public static final String JSON_PROPERTY_ACTION_KEY = "actionKey";
	@JsonProperty(JSON_PROPERTY_ACTION_KEY)
	private String actionKey;

	public static final String JSON_PROPERTY_ACTION_INVOCATION_ID = "actionInvocationId";
	@JsonProperty(JSON_PROPERTY_ACTION_INVOCATION_ID)
	private String actionInvocationId;

	public static final String JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP = "actionInvocationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP)
	private Long actionInvocationTimestamp;

	public static final String JSON_PROPERTY_EXECUTED_BY = "executedBy";
	@JsonProperty(JSON_PROPERTY_EXECUTED_BY)
	private PersonData executedBy = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_MESSAGES = "messages";
	@JsonProperty(JSON_PROPERTY_MESSAGES)
	private List<MessageData> messages = null;

	public CustomMessageActionBatchInvocationRequest $type(TypeEnum $type) {
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

	public CustomMessageActionBatchInvocationRequest accountId(String accountId) {
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

	public CustomMessageActionBatchInvocationRequest serviceName(String serviceName) {
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

	public CustomMessageActionBatchInvocationRequest actionType(ECustomActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	/**
	 * Get actionType
	 * 
	 * @return actionType
	 **/
	@ApiModelProperty(value = "")
	public ECustomActionType getActionType() {
		return actionType;
	}

	public void setActionType(ECustomActionType actionType) {
		this.actionType = actionType;
	}

	public CustomMessageActionBatchInvocationRequest actionKey(String actionKey) {
		this.actionKey = actionKey;
		return this;
	}

	/**
	 * The unique key of the invoked &#x60;CustomActionData&#x60;
	 * 
	 * @return actionKey
	 **/
	@ApiModelProperty(value = "The unique key of the invoked `CustomActionData`")
	public String getActionKey() {
		return actionKey;
	}

	public void setActionKey(String actionKey) {
		this.actionKey = actionKey;
	}

	public CustomMessageActionBatchInvocationRequest actionInvocationId(String actionInvocationId) {
		this.actionInvocationId = actionInvocationId;
		return this;
	}

	/**
	 * The unique invocation ID of the action
	 * 
	 * @return actionInvocationId
	 **/
	@ApiModelProperty(value = "The unique invocation ID of the action")
	public String getActionInvocationId() {
		return actionInvocationId;
	}

	public void setActionInvocationId(String actionInvocationId) {
		this.actionInvocationId = actionInvocationId;
	}

	public CustomMessageActionBatchInvocationRequest actionInvocationTimestamp(Long actionInvocationTimestamp) {
		this.actionInvocationTimestamp = actionInvocationTimestamp;
		return this;
	}

	/**
	 * The timestamp of the action invocation
	 * 
	 * @return actionInvocationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp of the action invocation")
	public Long getActionInvocationTimestamp() {
		return actionInvocationTimestamp;
	}

	public void setActionInvocationTimestamp(Long actionInvocationTimestamp) {
		this.actionInvocationTimestamp = actionInvocationTimestamp;
	}

	public CustomMessageActionBatchInvocationRequest executedBy(PersonData executedBy) {
		this.executedBy = executedBy;
		return this;
	}

	/**
	 * Get executedBy
	 * 
	 * @return executedBy
	 **/
	@ApiModelProperty(value = "")
	public PersonData getExecutedBy() {
		return executedBy;
	}

	public void setExecutedBy(PersonData executedBy) {
		this.executedBy = executedBy;
	}

	public CustomMessageActionBatchInvocationRequest conversation(ConversationData conversation) {
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

	public CustomMessageActionBatchInvocationRequest messages(List<MessageData> messages) {
		this.messages = messages;
		return this;
	}

	public CustomMessageActionBatchInvocationRequest addMessagesItem(MessageData messagesItem) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(messagesItem);
		return this;
	}

	/**
	 * The conversation messages the custom action was invoked on
	 * 
	 * @return messages
	 **/
	@ApiModelProperty(value = "The conversation messages the custom action was invoked on")
	public List<MessageData> getMessages() {
		return messages;
	}

	public void setMessages(List<MessageData> messages) {
		this.messages = messages;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomMessageActionBatchInvocationRequest customMessageActionBatchInvocationRequest = (CustomMessageActionBatchInvocationRequest) o;
		return Objects.equals(this.$type, customMessageActionBatchInvocationRequest.$type) &&
				Objects.equals(this.accountId, customMessageActionBatchInvocationRequest.accountId) &&
				Objects.equals(this.serviceName, customMessageActionBatchInvocationRequest.serviceName) &&
				Objects.equals(this.actionType, customMessageActionBatchInvocationRequest.actionType) &&
				Objects.equals(this.actionKey, customMessageActionBatchInvocationRequest.actionKey) &&
				Objects.equals(this.actionInvocationId, customMessageActionBatchInvocationRequest.actionInvocationId) &&
				Objects.equals(this.actionInvocationTimestamp, customMessageActionBatchInvocationRequest.actionInvocationTimestamp) &&
				Objects.equals(this.executedBy, customMessageActionBatchInvocationRequest.executedBy) &&
				Objects.equals(this.conversation, customMessageActionBatchInvocationRequest.conversation) &&
				Objects.equals(this.messages, customMessageActionBatchInvocationRequest.messages);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, actionType, actionKey, actionInvocationId, actionInvocationTimestamp, executedBy, conversation, messages);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomMessageActionBatchInvocationRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
		sb.append("    actionKey: ").append(toIndentedString(actionKey)).append("\n");
		sb.append("    actionInvocationId: ").append(toIndentedString(actionInvocationId)).append("\n");
		sb.append("    actionInvocationTimestamp: ").append(toIndentedString(actionInvocationTimestamp)).append("\n");
		sb.append("    executedBy: ").append(toIndentedString(executedBy)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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
