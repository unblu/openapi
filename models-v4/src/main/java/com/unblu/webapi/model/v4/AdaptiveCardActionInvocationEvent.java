
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
 * An event triggered every time an action on an Adaptive Card message is executed. &lt;p&gt;&#x60;Action.ToggleVisibility&#x60; is handled by the card renderer
 * in the browser and never produces this event. &lt;p&gt; Supported filter keys: &lt;ul&gt; &lt;li&gt;&#x60;ETypedEventFilterKey.CONVERSATION_ID&#x60;:
 * conversation ID&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "An event triggered every time an action on an Adaptive Card message is executed. <p>`Action.ToggleVisibility` is handled by the card renderer in the browser and never produces this event. <p> Supported filter keys: <ul> <li>`ETypedEventFilterKey.CONVERSATION_ID`: conversation ID</li> </ul>")

@JsonPropertyOrder({
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_$_TYPE,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_TIMESTAMP,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_EVENT_TYPE,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACCOUNT_ID,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_TYPE,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_ID,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_TITLE,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_VERB,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_URL,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_DATA,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_INVOCATION_ID,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_ACTION_INVOCATION_TIMESTAMP,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_EXECUTED_BY,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_CONVERSATION,
	AdaptiveCardActionInvocationEvent.JSON_PROPERTY_MESSAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AdaptiveCardActionInvocationEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ADAPTIVECARDACTIONINVOCATIONEVENT("AdaptiveCardActionInvocationEvent");

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
			return TypeEnum.ADAPTIVECARDACTIONINVOCATIONEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ADAPTIVECARDACTIONINVOCATIONEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

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

	public static final String JSON_PROPERTY_ACTION_URL = "actionUrl";
	@JsonProperty(JSON_PROPERTY_ACTION_URL)
	private String actionUrl;

	public static final String JSON_PROPERTY_ACTION_DATA = "actionData";
	@JsonProperty(JSON_PROPERTY_ACTION_DATA)
	private JsonNode actionData = null;

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

	public static final String JSON_PROPERTY_MESSAGE = "message";
	@JsonProperty(JSON_PROPERTY_MESSAGE)
	private MessageData message = null;

	public AdaptiveCardActionInvocationEvent $type(TypeEnum $type) {
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

	public AdaptiveCardActionInvocationEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The server time (Unix timestamp in ms) when the event occurred.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The server time (Unix timestamp in ms) when the event occurred.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public AdaptiveCardActionInvocationEvent eventType(String eventType) {
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

	public AdaptiveCardActionInvocationEvent accountId(String accountId) {
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

	public AdaptiveCardActionInvocationEvent actionType(EAdaptiveCardActionType actionType) {
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

	public AdaptiveCardActionInvocationEvent actionId(String actionId) {
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

	public AdaptiveCardActionInvocationEvent actionTitle(String actionTitle) {
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

	public AdaptiveCardActionInvocationEvent actionVerb(String actionVerb) {
		this.actionVerb = actionVerb;
		return this;
	}

	/**
	 * The verb identifying the operation to perform, taken from the action&#39;s &#x60;verb&#x60; property. Only &#x60;EAdaptiveCardActionType.EXECUTE&#x60;
	 * carries one.
	 * 
	 * @return actionVerb
	 **/
	@ApiModelProperty(value = "The verb identifying the operation to perform, taken from the action's `verb` property. Only `EAdaptiveCardActionType.EXECUTE` carries one.")
	public String getActionVerb() {
		return actionVerb;
	}

	public void setActionVerb(String actionVerb) {
		this.actionVerb = actionVerb;
	}

	public AdaptiveCardActionInvocationEvent actionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
		return this;
	}

	/**
	 * The link the action opens, taken from the action&#39;s &#x60;url&#x60; property. Only &#x60;EAdaptiveCardActionType.OPEN_URL&#x60; carries one.
	 * 
	 * @return actionUrl
	 **/
	@ApiModelProperty(value = "The link the action opens, taken from the action's `url` property. Only `EAdaptiveCardActionType.OPEN_URL` carries one.")
	public String getActionUrl() {
		return actionUrl;
	}

	public void setActionUrl(String actionUrl) {
		this.actionUrl = actionUrl;
	}

	public AdaptiveCardActionInvocationEvent actionData(JsonNode actionData) {
		this.actionData = actionData;
		return this;
	}

	/**
	 * The action&#39;s &#x60;data&#x60; property, merged with the values of the card&#39;s &#x60;Input.*&#x60; elements. &lt;p&gt; Every input value is a string,
	 * regardless of the input element that produced it: an &#x60;Input.Number&#x60; of 42 arrives as &#x60;\&quot;42\&quot;&#x60; and an &#x60;Input.Toggle&#x60;
	 * as &#x60;\&quot;true\&quot;&#x60;. Keys come from the card author, so treat the whole object as untrusted user input.
	 * 
	 * @return actionData
	 **/
	@ApiModelProperty(value = "The action's `data` property, merged with the values of the card's `Input.*` elements. <p> Every input value is a string, regardless of the input element that produced it: an `Input.Number` of 42 arrives as `\"42\"` and an `Input.Toggle` as `\"true\"`. Keys come from the card author, so treat the whole object as untrusted user input.")
	public JsonNode getActionData() {
		return actionData;
	}

	public void setActionData(JsonNode actionData) {
		this.actionData = actionData;
	}

	public AdaptiveCardActionInvocationEvent actionInvocationId(String actionInvocationId) {
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

	public AdaptiveCardActionInvocationEvent actionInvocationTimestamp(Long actionInvocationTimestamp) {
		this.actionInvocationTimestamp = actionInvocationTimestamp;
		return this;
	}

	/**
	 * The timestamp of the action invocation (Unix timestamp in ms)
	 * 
	 * @return actionInvocationTimestamp
	 **/
	@ApiModelProperty(value = "The timestamp of the action invocation (Unix timestamp in ms)")
	public Long getActionInvocationTimestamp() {
		return actionInvocationTimestamp;
	}

	public void setActionInvocationTimestamp(Long actionInvocationTimestamp) {
		this.actionInvocationTimestamp = actionInvocationTimestamp;
	}

	public AdaptiveCardActionInvocationEvent executedBy(PersonData executedBy) {
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

	public AdaptiveCardActionInvocationEvent conversation(ConversationData conversation) {
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

	public AdaptiveCardActionInvocationEvent message(MessageData message) {
		this.message = message;
		return this;
	}

	/**
	 * Get message
	 * 
	 * @return message
	 **/
	@ApiModelProperty(value = "")
	public MessageData getMessage() {
		return message;
	}

	public void setMessage(MessageData message) {
		this.message = message;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AdaptiveCardActionInvocationEvent adaptiveCardActionInvocationEvent = (AdaptiveCardActionInvocationEvent) o;
		return Objects.equals(this.$type, adaptiveCardActionInvocationEvent.$type) &&
				Objects.equals(this.timestamp, adaptiveCardActionInvocationEvent.timestamp) &&
				Objects.equals(this.eventType, adaptiveCardActionInvocationEvent.eventType) &&
				Objects.equals(this.accountId, adaptiveCardActionInvocationEvent.accountId) &&
				Objects.equals(this.actionType, adaptiveCardActionInvocationEvent.actionType) &&
				Objects.equals(this.actionId, adaptiveCardActionInvocationEvent.actionId) &&
				Objects.equals(this.actionTitle, adaptiveCardActionInvocationEvent.actionTitle) &&
				Objects.equals(this.actionVerb, adaptiveCardActionInvocationEvent.actionVerb) &&
				Objects.equals(this.actionUrl, adaptiveCardActionInvocationEvent.actionUrl) &&
				Objects.equals(this.actionData, adaptiveCardActionInvocationEvent.actionData) &&
				Objects.equals(this.actionInvocationId, adaptiveCardActionInvocationEvent.actionInvocationId) &&
				Objects.equals(this.actionInvocationTimestamp, adaptiveCardActionInvocationEvent.actionInvocationTimestamp) &&
				Objects.equals(this.executedBy, adaptiveCardActionInvocationEvent.executedBy) &&
				Objects.equals(this.conversation, adaptiveCardActionInvocationEvent.conversation) &&
				Objects.equals(this.message, adaptiveCardActionInvocationEvent.message);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, actionType, actionId, actionTitle, actionVerb, actionUrl, actionData, actionInvocationId, actionInvocationTimestamp, executedBy, conversation, message);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AdaptiveCardActionInvocationEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
		sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
		sb.append("    actionTitle: ").append(toIndentedString(actionTitle)).append("\n");
		sb.append("    actionVerb: ").append(toIndentedString(actionVerb)).append("\n");
		sb.append("    actionUrl: ").append(toIndentedString(actionUrl)).append("\n");
		sb.append("    actionData: ").append(toIndentedString(actionData)).append("\n");
		sb.append("    actionInvocationId: ").append(toIndentedString(actionInvocationId)).append("\n");
		sb.append("    actionInvocationTimestamp: ").append(toIndentedString(actionInvocationTimestamp)).append("\n");
		sb.append("    executedBy: ").append(toIndentedString(executedBy)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
