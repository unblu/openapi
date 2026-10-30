
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.JsonNode;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request sent when a submitting action on an Adaptive Card message is executed inside a dialog between a person and a bot. &lt;p&gt; The request is only
 * delivered to the dialog bot that sent the card: a dialog can involve several bots, and an action belongs to the bot that authored the card it sits on. Only
 * &#x60;EAdaptiveCardActionType.SUBMIT&#x60; and &#x60;EAdaptiveCardActionType.EXECUTE&#x60; are delivered, as they are the only actions that carry input the
 * bot has to act on. &#x60;Action.OpenUrl&#x60; is reported through the &#x60;adaptive_card_action.invoked&#x60; webhook event only.
 */
@ApiModel(description = "Request sent when a submitting action on an Adaptive Card message is executed inside a dialog between a person and a bot. <p> The request is only delivered to the dialog bot that sent the card: a dialog can involve several bots, and an action belongs to the bot that authored the card it sits on. Only `EAdaptiveCardActionType.SUBMIT` and `EAdaptiveCardActionType.EXECUTE` are delivered, as they are the only actions that carry input the bot has to act on. `Action.OpenUrl` is reported through the `adaptive_card_action.invoked` webhook event only.")

@JsonPropertyOrder({
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_$_TYPE,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_CONVERSATION_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_BOT_THREAD_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_EXECUTED_BY_PERSON_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_MESSAGE_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_TYPE,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_TITLE,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_VERB,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_DATA,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_INVOCATION_ID,
	BotDialogAdaptiveCardActionRequest.JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogAdaptiveCardActionRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGADAPTIVECARDACTIONREQUEST("BotDialogAdaptiveCardActionRequest");

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
			return TypeEnum.BOTDIALOGADAPTIVECARDACTIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGADAPTIVECARDACTIONREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_BOT_THREAD_ID = "botThreadId";
	@JsonProperty(JSON_PROPERTY_BOT_THREAD_ID)
	private String botThreadId;

	public static final String JSON_PROPERTY_EXECUTED_BY_PERSON_ID = "executedByPersonId";
	@JsonProperty(JSON_PROPERTY_EXECUTED_BY_PERSON_ID)
	private String executedByPersonId;

	public static final String JSON_PROPERTY_MESSAGE_ID = "messageId";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ID)
	private String messageId;

	public static final String JSON_PROPERTY_ACTION_TYPE = "actionType";
	@JsonProperty(JSON_PROPERTY_ACTION_TYPE)
	private EAdaptiveCardActionType actionType;

	public static final String JSON_PROPERTY_ACTION_ID = "actionId";
	@JsonProperty(JSON_PROPERTY_ACTION_ID)
	private String actionId;

	public static final String JSON_PROPERTY_ACTION_TITLE = "actionTitle";
	@JsonProperty(JSON_PROPERTY_ACTION_TITLE)
	private String actionTitle;

	public static final String JSON_PROPERTY_ACTION_VERB = "actionVerb";
	@JsonProperty(JSON_PROPERTY_ACTION_VERB)
	private String actionVerb;

	public static final String JSON_PROPERTY_ACTION_DATA = "actionData";
	@JsonProperty(JSON_PROPERTY_ACTION_DATA)
	private JsonNode actionData = null;

	public static final String JSON_PROPERTY_ACTION_INVOCATION_ID = "actionInvocationId";
	@JsonProperty(JSON_PROPERTY_ACTION_INVOCATION_ID)
	private String actionInvocationId;

	public static final String JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP = "actionInvocationTimestamp";
	@JsonProperty(JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP)
	private Long actionInvocationTimestamp;

	public BotDialogAdaptiveCardActionRequest $type(TypeEnum $type) {
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

	public BotDialogAdaptiveCardActionRequest accountId(String accountId) {
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

	public BotDialogAdaptiveCardActionRequest serviceName(String serviceName) {
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

	public BotDialogAdaptiveCardActionRequest dialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
		return this;
	}

	/**
	 * Token for this dialog. It is present in every dialog webhook and must be passed to all bot web API service calls to identify the dialog.
	 * 
	 * @return dialogToken
	 **/
	@ApiModelProperty(value = "Token for this dialog. It is present in every dialog webhook and must be passed to all bot web API service calls to identify the dialog.")
	public String getDialogToken() {
		return dialogToken;
	}

	public void setDialogToken(String dialogToken) {
		this.dialogToken = dialogToken;
	}

	public BotDialogAdaptiveCardActionRequest conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation this dialog belongs to.
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation this dialog belongs to.")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public BotDialogAdaptiveCardActionRequest botThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
		return this;
	}

	/**
	 * The ID of the bot thread the action was executed in. Reported so the invocation can be correlated with the &#x60;bot_thread.*&#x60; webhook events, which
	 * identify a boarding process by the same ID.
	 * 
	 * @return botThreadId
	 **/
	@ApiModelProperty(value = "The ID of the bot thread the action was executed in. Reported so the invocation can be correlated with the `bot_thread.*` webhook events, which identify a boarding process by the same ID.")
	public String getBotThreadId() {
		return botThreadId;
	}

	public void setBotThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
	}

	public BotDialogAdaptiveCardActionRequest executedByPersonId(String executedByPersonId) {
		this.executedByPersonId = executedByPersonId;
		return this;
	}

	/**
	 * The ID of the person who executed the action.
	 * 
	 * @return executedByPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person who executed the action.")
	public String getExecutedByPersonId() {
		return executedByPersonId;
	}

	public void setExecutedByPersonId(String executedByPersonId) {
		this.executedByPersonId = executedByPersonId;
	}

	public BotDialogAdaptiveCardActionRequest messageId(String messageId) {
		this.messageId = messageId;
		return this;
	}

	/**
	 * The ID of the Adaptive Card message the action was executed on.
	 * 
	 * @return messageId
	 **/
	@ApiModelProperty(value = "The ID of the Adaptive Card message the action was executed on.")
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public BotDialogAdaptiveCardActionRequest actionType(EAdaptiveCardActionType actionType) {
		this.actionType = actionType;
		return this;
	}

	/**
	 * Get actionType
	 * 
	 * @return actionType
	 **/
	@ApiModelProperty(value = "")
	public EAdaptiveCardActionType getActionType() {
		return actionType;
	}

	public void setActionType(EAdaptiveCardActionType actionType) {
		this.actionType = actionType;
	}

	public BotDialogAdaptiveCardActionRequest actionId(String actionId) {
		this.actionId = actionId;
		return this;
	}

	/**
	 * The ID the card author assigned to the executed action, taken from the action&#39;s &#x60;id&#x60; property. May be &#x60;null&#x60;, as &#x60;id&#x60; is
	 * optional in the Adaptive Card schema. &lt;p&gt; Reported by the client and not verified against the card, so treat it as untrusted user input.
	 * 
	 * @return actionId
	 **/
	@ApiModelProperty(value = "The ID the card author assigned to the executed action, taken from the action's `id` property. May be `null`, as `id` is optional in the Adaptive Card schema. <p> Reported by the client and not verified against the card, so treat it as untrusted user input.")
	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public BotDialogAdaptiveCardActionRequest actionTitle(String actionTitle) {
		this.actionTitle = actionTitle;
		return this;
	}

	/**
	 * The label displayed on the executed action, taken from the action&#39;s &#x60;title&#x60; property. &lt;p&gt; Reported by the client and not verified against
	 * the card, so treat it as untrusted user input.
	 * 
	 * @return actionTitle
	 **/
	@ApiModelProperty(value = "The label displayed on the executed action, taken from the action's `title` property. <p> Reported by the client and not verified against the card, so treat it as untrusted user input.")
	public String getActionTitle() {
		return actionTitle;
	}

	public void setActionTitle(String actionTitle) {
		this.actionTitle = actionTitle;
	}

	public BotDialogAdaptiveCardActionRequest actionVerb(String actionVerb) {
		this.actionVerb = actionVerb;
		return this;
	}

	/**
	 * The verb identifying the operation to perform, taken from the action&#39;s &#x60;verb&#x60; property. Only &#x60;EAdaptiveCardActionType.EXECUTE&#x60;
	 * carries one. &lt;p&gt; The server verifies that the card was sent by this bot and is visible to &#x60;executedByPersonId&#x60;, but not that the card
	 * actually offers this verb. Authorize the operation before performing it rather than trusting the verb alone.
	 * 
	 * @return actionVerb
	 **/
	@ApiModelProperty(value = "The verb identifying the operation to perform, taken from the action's `verb` property. Only `EAdaptiveCardActionType.EXECUTE` carries one. <p> The server verifies that the card was sent by this bot and is visible to `executedByPersonId`, but not that the card actually offers this verb. Authorize the operation before performing it rather than trusting the verb alone.")
	public String getActionVerb() {
		return actionVerb;
	}

	public void setActionVerb(String actionVerb) {
		this.actionVerb = actionVerb;
	}

	public BotDialogAdaptiveCardActionRequest actionData(JsonNode actionData) {
		this.actionData = actionData;
		return this;
	}

	/**
	 * The action&#39;s &#x60;data&#x60; property, merged with the values of the card&#39;s &#x60;Input.*&#x60; elements. Every input value is a string, regardless
	 * of the input element that produced it: an &#x60;Input.Number&#x60; of 42 arrives as &#x60;\&quot;42\&quot;&#x60; and an &#x60;Input.Toggle&#x60; as
	 * &#x60;\&quot;true\&quot;&#x60;.
	 * 
	 * @return actionData
	 **/
	@ApiModelProperty(value = "The action's `data` property, merged with the values of the card's `Input.*` elements. Every input value is a string, regardless of the input element that produced it: an `Input.Number` of 42 arrives as `\"42\"` and an `Input.Toggle` as `\"true\"`.")
	public JsonNode getActionData() {
		return actionData;
	}

	public void setActionData(JsonNode actionData) {
		this.actionData = actionData;
	}

	public BotDialogAdaptiveCardActionRequest actionInvocationId(String actionInvocationId) {
		this.actionInvocationId = actionInvocationId;
		return this;
	}

	/**
	 * The unique invocation ID of the action. The same invocation is reported under this ID by the &#x60;adaptive_card_action.invoked&#x60; webhook event.
	 * 
	 * @return actionInvocationId
	 **/
	@ApiModelProperty(value = "The unique invocation ID of the action. The same invocation is reported under this ID by the `adaptive_card_action.invoked` webhook event.")
	public String getActionInvocationId() {
		return actionInvocationId;
	}

	public void setActionInvocationId(String actionInvocationId) {
		this.actionInvocationId = actionInvocationId;
	}

	public BotDialogAdaptiveCardActionRequest actionInvocationTimestamp(Long actionInvocationTimestamp) {
		this.actionInvocationTimestamp = actionInvocationTimestamp;
		return this;
	}

	/**
	 * The timestamp of the action invocation (Unix timestamp in ms).
	 * 
	 * @return actionInvocationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp of the action invocation (Unix timestamp in ms).")
	public Long getActionInvocationTimestamp() {
		return actionInvocationTimestamp;
	}

	public void setActionInvocationTimestamp(Long actionInvocationTimestamp) {
		this.actionInvocationTimestamp = actionInvocationTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogAdaptiveCardActionRequest botDialogAdaptiveCardActionRequest = (BotDialogAdaptiveCardActionRequest) o;
		return Objects.equals(this.$type, botDialogAdaptiveCardActionRequest.$type) &&
				Objects.equals(this.accountId, botDialogAdaptiveCardActionRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogAdaptiveCardActionRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogAdaptiveCardActionRequest.dialogToken) &&
				Objects.equals(this.conversationId, botDialogAdaptiveCardActionRequest.conversationId) &&
				Objects.equals(this.botThreadId, botDialogAdaptiveCardActionRequest.botThreadId) &&
				Objects.equals(this.executedByPersonId, botDialogAdaptiveCardActionRequest.executedByPersonId) &&
				Objects.equals(this.messageId, botDialogAdaptiveCardActionRequest.messageId) &&
				Objects.equals(this.actionType, botDialogAdaptiveCardActionRequest.actionType) &&
				Objects.equals(this.actionId, botDialogAdaptiveCardActionRequest.actionId) &&
				Objects.equals(this.actionTitle, botDialogAdaptiveCardActionRequest.actionTitle) &&
				Objects.equals(this.actionVerb, botDialogAdaptiveCardActionRequest.actionVerb) &&
				Objects.equals(this.actionData, botDialogAdaptiveCardActionRequest.actionData) &&
				Objects.equals(this.actionInvocationId, botDialogAdaptiveCardActionRequest.actionInvocationId) &&
				Objects.equals(this.actionInvocationTimestamp, botDialogAdaptiveCardActionRequest.actionInvocationTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, conversationId, botThreadId, executedByPersonId, messageId, actionType, actionId, actionTitle, actionVerb, actionData, actionInvocationId, actionInvocationTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogAdaptiveCardActionRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    botThreadId: ").append(toIndentedString(botThreadId)).append("\n");
		sb.append("    executedByPersonId: ").append(toIndentedString(executedByPersonId)).append("\n");
		sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
		sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
		sb.append("    actionTitle: ").append(toIndentedString(actionTitle)).append("\n");
		sb.append("    actionVerb: ").append(toIndentedString(actionVerb)).append("\n");
		sb.append("    actionData: ").append(toIndentedString(actionData)).append("\n");
		sb.append("    actionInvocationId: ").append(toIndentedString(actionInvocationId)).append("\n");
		sb.append("    actionInvocationTimestamp: ").append(toIndentedString(actionInvocationTimestamp)).append("\n");
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
