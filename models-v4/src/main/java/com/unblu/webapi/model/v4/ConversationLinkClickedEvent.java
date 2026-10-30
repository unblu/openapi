
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
 * Represents an event that is triggered when a person clicks a link in a conversation message. &lt;p&gt; The event covers links in the message text and the
 * link actions of card and list messages. The URL, the link source, and the message action are reported by the client that displays the message. Unblu
 * doesn&#39;t verify them. &lt;p&gt; The event isn&#39;t triggered in the following cases: &lt;ul&gt; &lt;li&gt;The message is displayed in an external
 * messenger channel.&lt;/li&gt; &lt;li&gt;The link is opened from the browser&#39;s context menu, for example in a new tab.&lt;/li&gt; &lt;li&gt;A mobile SDK
 * renders the message natively.&lt;/li&gt; &lt;li&gt;The message is awaiting approval, was rejected, or was deleted for the person who clicked.&lt;/li&gt;
 * &lt;li&gt;The URL, the message action label, or the message action value is longer than 8192 characters.&lt;/li&gt; &lt;li&gt;The person who clicked is in
 * the conversation as a ghost.&lt;/li&gt; &lt;/ul&gt; If the link opens in the same browser tab and the page the Unblu UI is integrated in unloads, the event
 * may be lost. &lt;p&gt; Supported filter keys: &lt;ul&gt; &lt;li&gt;&#x60;ETypedEventFilterKey.CONVERSATION_ID&#x60;: conversation ID&lt;/li&gt; &lt;/ul&gt;
 */
@ApiModel(description = "Represents an event that is triggered when a person clicks a link in a conversation message. <p> The event covers links in the message text and the link actions of card and list messages. The URL, the link source, and the message action are reported by the client that displays the message. Unblu doesn't verify them. <p> The event isn't triggered in the following cases: <ul> <li>The message is displayed in an external messenger channel.</li> <li>The link is opened from the browser's context menu, for example in a new tab.</li> <li>A mobile SDK renders the message natively.</li> <li>The message is awaiting approval, was rejected, or was deleted for the person who clicked.</li> <li>The URL, the message action label, or the message action value is longer than 8192 characters.</li> <li>The person who clicked is in the conversation as a ghost.</li> </ul> If the link opens in the same browser tab and the page the Unblu UI is integrated in unloads, the event may be lost. <p> Supported filter keys: <ul> <li>`ETypedEventFilterKey.CONVERSATION_ID`: conversation ID</li> </ul>")

@JsonPropertyOrder({
	ConversationLinkClickedEvent.JSON_PROPERTY_$_TYPE,
	ConversationLinkClickedEvent.JSON_PROPERTY_TIMESTAMP,
	ConversationLinkClickedEvent.JSON_PROPERTY_EVENT_TYPE,
	ConversationLinkClickedEvent.JSON_PROPERTY_ACCOUNT_ID,
	ConversationLinkClickedEvent.JSON_PROPERTY_CONVERSATION,
	ConversationLinkClickedEvent.JSON_PROPERTY_CONVERSATION_MESSAGE,
	ConversationLinkClickedEvent.JSON_PROPERTY_EXECUTED_BY,
	ConversationLinkClickedEvent.JSON_PROPERTY_URL,
	ConversationLinkClickedEvent.JSON_PROPERTY_LINK_SOURCE,
	ConversationLinkClickedEvent.JSON_PROPERTY_MESSAGE_ACTION,
	ConversationLinkClickedEvent.JSON_PROPERTY_CLICK_ID,
	ConversationLinkClickedEvent.JSON_PROPERTY_CLICK_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationLinkClickedEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONLINKCLICKEDEVENT("ConversationLinkClickedEvent");

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
			return TypeEnum.CONVERSATIONLINKCLICKEDEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONLINKCLICKEDEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public static final String JSON_PROPERTY_EXECUTED_BY = "executedBy";
	@JsonProperty(JSON_PROPERTY_EXECUTED_BY)
	private PersonData executedBy = null;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public static final String JSON_PROPERTY_LINK_SOURCE = "linkSource";
	@JsonProperty(JSON_PROPERTY_LINK_SOURCE)
	private ELinkSource linkSource;

	public static final String JSON_PROPERTY_MESSAGE_ACTION = "messageAction";
	@JsonProperty(JSON_PROPERTY_MESSAGE_ACTION)
	private MessageAction messageAction = null;

	public static final String JSON_PROPERTY_CLICK_ID = "clickId";
	@JsonProperty(JSON_PROPERTY_CLICK_ID)
	private String clickId;

	public static final String JSON_PROPERTY_CLICK_TIMESTAMP = "clickTimestamp";
	@JsonProperty(JSON_PROPERTY_CLICK_TIMESTAMP)
	private Long clickTimestamp;

	public ConversationLinkClickedEvent $type(TypeEnum $type) {
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

	public ConversationLinkClickedEvent timestamp(Long timestamp) {
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

	public ConversationLinkClickedEvent eventType(String eventType) {
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

	public ConversationLinkClickedEvent accountId(String accountId) {
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

	public ConversationLinkClickedEvent conversation(ConversationData conversation) {
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

	public ConversationLinkClickedEvent conversationMessage(MessageData conversationMessage) {
		this.conversationMessage = conversationMessage;
		return this;
	}

	/**
	 * Get conversationMessage
	 * 
	 * @return conversationMessage
	 **/
	@ApiModelProperty(value = "")
	public MessageData getConversationMessage() {
		return conversationMessage;
	}

	public void setConversationMessage(MessageData conversationMessage) {
		this.conversationMessage = conversationMessage;
	}

	public ConversationLinkClickedEvent executedBy(PersonData executedBy) {
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

	public ConversationLinkClickedEvent url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL of the link. It&#39;s reported by the client and not verified by Unblu.
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "The URL of the link. It's reported by the client and not verified by Unblu.")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ConversationLinkClickedEvent linkSource(ELinkSource linkSource) {
		this.linkSource = linkSource;
		return this;
	}

	/**
	 * Get linkSource
	 * 
	 * @return linkSource
	 **/
	@ApiModelProperty(value = "")
	public ELinkSource getLinkSource() {
		return linkSource;
	}

	public void setLinkSource(ELinkSource linkSource) {
		this.linkSource = linkSource;
	}

	public ConversationLinkClickedEvent messageAction(MessageAction messageAction) {
		this.messageAction = messageAction;
		return this;
	}

	/**
	 * Get messageAction
	 * 
	 * @return messageAction
	 **/
	@ApiModelProperty(value = "")
	public MessageAction getMessageAction() {
		return messageAction;
	}

	public void setMessageAction(MessageAction messageAction) {
		this.messageAction = messageAction;
	}

	public ConversationLinkClickedEvent clickId(String clickId) {
		this.clickId = clickId;
		return this;
	}

	/**
	 * The unique ID of the link click
	 * 
	 * @return clickId
	 **/
	@ApiModelProperty(value = "The unique ID of the link click")
	public String getClickId() {
		return clickId;
	}

	public void setClickId(String clickId) {
		this.clickId = clickId;
	}

	public ConversationLinkClickedEvent clickTimestamp(Long clickTimestamp) {
		this.clickTimestamp = clickTimestamp;
		return this;
	}

	/**
	 * The server time (Unix timestamp in ms) when Unblu received the link click
	 * 
	 * @return clickTimestamp
	 **/
	@ApiModelProperty(value = "The server time (Unix timestamp in ms) when Unblu received the link click")
	public Long getClickTimestamp() {
		return clickTimestamp;
	}

	public void setClickTimestamp(Long clickTimestamp) {
		this.clickTimestamp = clickTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationLinkClickedEvent conversationLinkClickedEvent = (ConversationLinkClickedEvent) o;
		return Objects.equals(this.$type, conversationLinkClickedEvent.$type) &&
				Objects.equals(this.timestamp, conversationLinkClickedEvent.timestamp) &&
				Objects.equals(this.eventType, conversationLinkClickedEvent.eventType) &&
				Objects.equals(this.accountId, conversationLinkClickedEvent.accountId) &&
				Objects.equals(this.conversation, conversationLinkClickedEvent.conversation) &&
				Objects.equals(this.conversationMessage, conversationLinkClickedEvent.conversationMessage) &&
				Objects.equals(this.executedBy, conversationLinkClickedEvent.executedBy) &&
				Objects.equals(this.url, conversationLinkClickedEvent.url) &&
				Objects.equals(this.linkSource, conversationLinkClickedEvent.linkSource) &&
				Objects.equals(this.messageAction, conversationLinkClickedEvent.messageAction) &&
				Objects.equals(this.clickId, conversationLinkClickedEvent.clickId) &&
				Objects.equals(this.clickTimestamp, conversationLinkClickedEvent.clickTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, conversation, conversationMessage, executedBy, url, linkSource, messageAction, clickId, clickTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationLinkClickedEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    executedBy: ").append(toIndentedString(executedBy)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
		sb.append("    linkSource: ").append(toIndentedString(linkSource)).append("\n");
		sb.append("    messageAction: ").append(toIndentedString(messageAction)).append("\n");
		sb.append("    clickId: ").append(toIndentedString(clickId)).append("\n");
		sb.append("    clickTimestamp: ").append(toIndentedString(clickTimestamp)).append("\n");
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
