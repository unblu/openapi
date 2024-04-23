
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
 * An event triggered every time a custom person action is invoked
 */
@ApiModel(description = "An event triggered every time a custom person action is invoked")

@JsonPropertyOrder({
	CustomPersonActionInvocationRequest.JSON_PROPERTY_$_TYPE,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_ACCOUNT_ID,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_SERVICE_NAME,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_ACTION_TYPE,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_ACTION_KEY,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_ACTION_INVOCATION_ID,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_EXECUTED_BY,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_CONVERSATION,
	CustomPersonActionInvocationRequest.JSON_PROPERTY_PERSON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomPersonActionInvocationRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMPERSONACTIONINVOCATIONREQUEST("CustomPersonActionInvocationRequest");

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
			return TypeEnum.CUSTOMPERSONACTIONINVOCATIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMPERSONACTIONINVOCATIONREQUEST;

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

	public static final String JSON_PROPERTY_PERSON = "person";
	@JsonProperty(JSON_PROPERTY_PERSON)
	private PersonData person = null;

	public CustomPersonActionInvocationRequest $type(TypeEnum $type) {
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

	public CustomPersonActionInvocationRequest accountId(String accountId) {
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

	public CustomPersonActionInvocationRequest serviceName(String serviceName) {
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

	public CustomPersonActionInvocationRequest actionType(ECustomActionType actionType) {
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

	public CustomPersonActionInvocationRequest actionKey(String actionKey) {
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

	public CustomPersonActionInvocationRequest actionInvocationId(String actionInvocationId) {
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

	public CustomPersonActionInvocationRequest actionInvocationTimestamp(Long actionInvocationTimestamp) {
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

	public CustomPersonActionInvocationRequest executedBy(PersonData executedBy) {
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

	public CustomPersonActionInvocationRequest conversation(ConversationData conversation) {
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

	public CustomPersonActionInvocationRequest person(PersonData person) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CustomPersonActionInvocationRequest customPersonActionInvocationRequest = (CustomPersonActionInvocationRequest) o;
		return Objects.equals(this.$type, customPersonActionInvocationRequest.$type) &&
				Objects.equals(this.accountId, customPersonActionInvocationRequest.accountId) &&
				Objects.equals(this.serviceName, customPersonActionInvocationRequest.serviceName) &&
				Objects.equals(this.actionType, customPersonActionInvocationRequest.actionType) &&
				Objects.equals(this.actionKey, customPersonActionInvocationRequest.actionKey) &&
				Objects.equals(this.actionInvocationId, customPersonActionInvocationRequest.actionInvocationId) &&
				Objects.equals(this.actionInvocationTimestamp, customPersonActionInvocationRequest.actionInvocationTimestamp) &&
				Objects.equals(this.executedBy, customPersonActionInvocationRequest.executedBy) &&
				Objects.equals(this.conversation, customPersonActionInvocationRequest.conversation) &&
				Objects.equals(this.person, customPersonActionInvocationRequest.person);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, actionType, actionKey, actionInvocationId, actionInvocationTimestamp, executedBy, conversation, person);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomPersonActionInvocationRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
		sb.append("    actionKey: ").append(toIndentedString(actionKey)).append("\n");
		sb.append("    actionInvocationId: ").append(toIndentedString(actionInvocationId)).append("\n");
		sb.append("    actionInvocationTimestamp: ").append(toIndentedString(actionInvocationTimestamp)).append("\n");
		sb.append("    executedBy: ").append(toIndentedString(executedBy)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    person: ").append(toIndentedString(person)).append("\n");
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
