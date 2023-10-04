
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
 * Card message which may contain an image, title, body and actions. &lt;p&gt; All of these parts are optional as long as it contains at least one of them.
 */
@ApiModel(description = "Card message which may contain an image, title, body and actions. <p> All of these parts are optional as long as it contains at least one of them.")

@JsonPropertyOrder({
	CardMessageData.JSON_PROPERTY_$_TYPE,
	CardMessageData.JSON_PROPERTY_ID,
	CardMessageData.JSON_PROPERTY_CONVERSATION_ID,
	CardMessageData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	CardMessageData.JSON_PROPERTY_ACCOUNT_ID,
	CardMessageData.JSON_PROPERTY_SENDER_PERSON,
	CardMessageData.JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID,
	CardMessageData.JSON_PROPERTY_SERVER_TIMESTAMP,
	CardMessageData.JSON_PROPERTY_SEND_TIMESTAMP,
	CardMessageData.JSON_PROPERTY_TYPE,
	CardMessageData.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	CardMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	CardMessageData.JSON_PROPERTY_ACTION_ID,
	CardMessageData.JSON_PROPERTY_SOURCE_ID,
	CardMessageData.JSON_PROPERTY_BOT_THREAD_ID,
	CardMessageData.JSON_PROPERTY_INTERNAL,
	CardMessageData.JSON_PROPERTY_REPLY_TO_MESSAGE_ID,
	CardMessageData.JSON_PROPERTY_IMAGE_URL,
	CardMessageData.JSON_PROPERTY_IMAGE_ALT_TEXT,
	CardMessageData.JSON_PROPERTY_TITLE,
	CardMessageData.JSON_PROPERTY_BODY,
	CardMessageData.JSON_PROPERTY_BODY_TEXT_TYPE,
	CardMessageData.JSON_PROPERTY_ACTIONS,
	CardMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CardMessageData implements MessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CARDMESSAGEDATA("CardMessageData");

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
			return TypeEnum.CARDMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CARDMESSAGEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID = "externalMessengerChannelId";
	@JsonProperty(JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID)
	private String externalMessengerChannelId;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SENDER_PERSON = "senderPerson";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON)
	private PersonData senderPerson = null;

	public static final String JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID = "senderPersonPresenceId";
	@JsonProperty(JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID)
	private String senderPersonPresenceId;

	public static final String JSON_PROPERTY_SERVER_TIMESTAMP = "serverTimestamp";
	@JsonProperty(JSON_PROPERTY_SERVER_TIMESTAMP)
	private Long serverTimestamp;

	public static final String JSON_PROPERTY_SEND_TIMESTAMP = "sendTimestamp";
	@JsonProperty(JSON_PROPERTY_SEND_TIMESTAMP)
	private Long sendTimestamp;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EMessageType type = EMessageType.CARD;

	public static final String JSON_PROPERTY_RECIPIENT_PERSON_IDS = "recipientPersonIds";
	@JsonProperty(JSON_PROPERTY_RECIPIENT_PERSON_IDS)
	private List<String> recipientPersonIds = null;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_ACTION_ID = "actionId";
	@JsonProperty(JSON_PROPERTY_ACTION_ID)
	private String actionId;

	public static final String JSON_PROPERTY_SOURCE_ID = "sourceId";
	@JsonProperty(JSON_PROPERTY_SOURCE_ID)
	private String sourceId;

	public static final String JSON_PROPERTY_BOT_THREAD_ID = "botThreadId";
	@JsonProperty(JSON_PROPERTY_BOT_THREAD_ID)
	private String botThreadId;

	public static final String JSON_PROPERTY_INTERNAL = "internal";
	@JsonProperty(JSON_PROPERTY_INTERNAL)
	private Boolean internal;

	public static final String JSON_PROPERTY_REPLY_TO_MESSAGE_ID = "replyToMessageId";
	@JsonProperty(JSON_PROPERTY_REPLY_TO_MESSAGE_ID)
	private String replyToMessageId;

	public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
	@JsonProperty(JSON_PROPERTY_IMAGE_URL)
	private String imageUrl;

	public static final String JSON_PROPERTY_IMAGE_ALT_TEXT = "imageAltText";
	@JsonProperty(JSON_PROPERTY_IMAGE_ALT_TEXT)
	private String imageAltText;

	public static final String JSON_PROPERTY_TITLE = "title";
	@JsonProperty(JSON_PROPERTY_TITLE)
	private String title;

	public static final String JSON_PROPERTY_BODY = "body";
	@JsonProperty(JSON_PROPERTY_BODY)
	private String body;

	public static final String JSON_PROPERTY_BODY_TEXT_TYPE = "bodyTextType";
	@JsonProperty(JSON_PROPERTY_BODY_TEXT_TYPE)
	private EConversationMessageTextType bodyTextType;

	public static final String JSON_PROPERTY_ACTIONS = "actions";
	@JsonProperty(JSON_PROPERTY_ACTIONS)
	private List<MessageAction> actions = null;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public CardMessageData $type(TypeEnum $type) {
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

	public CardMessageData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID of the message&lt;br&gt;
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The ID of the message<br>")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public CardMessageData conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * Conversation ID this message belongs to
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "Conversation ID this message belongs to")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public CardMessageData externalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
		return this;
	}

	/**
	 * ID of the external messenger channel connected to the conversation. Null if the conversation is not connected to an external messenger.
	 * 
	 * @return externalMessengerChannelId
	 **/
	@ApiModelProperty(value = "ID of the external messenger channel connected to the conversation. Null if the conversation is not connected to an external messenger.")
	public String getExternalMessengerChannelId() {
		return externalMessengerChannelId;
	}

	public void setExternalMessengerChannelId(String externalMessengerChannelId) {
		this.externalMessengerChannelId = externalMessengerChannelId;
	}

	public CardMessageData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account this message and conversation belong to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account this message and conversation belong to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public CardMessageData senderPerson(PersonData senderPerson) {
		this.senderPerson = senderPerson;
		return this;
	}

	/**
	 * Get senderPerson
	 * 
	 * @return senderPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getSenderPerson() {
		return senderPerson;
	}

	public void setSenderPerson(PersonData senderPerson) {
		this.senderPerson = senderPerson;
	}

	public CardMessageData senderPersonPresenceId(String senderPersonPresenceId) {
		this.senderPersonPresenceId = senderPersonPresenceId;
		return this;
	}

	/**
	 * ID of the person presence who sent the message. &lt;p&gt; May be null if the message was sent by the system.
	 * 
	 * @return senderPersonPresenceId
	 **/
	@ApiModelProperty(value = "ID of the person presence who sent the message. <p> May be null if the message was sent by the system.")
	public String getSenderPersonPresenceId() {
		return senderPersonPresenceId;
	}

	public void setSenderPersonPresenceId(String senderPersonPresenceId) {
		this.senderPersonPresenceId = senderPersonPresenceId;
	}

	public CardMessageData serverTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the message was received by the server&lt;br&gt; Empty when sending a new message to the collaboration server
	 * 
	 * @return serverTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the message was received by the server<br> Empty when sending a new message to the collaboration server")
	public Long getServerTimestamp() {
		return serverTimestamp;
	}

	public void setServerTimestamp(Long serverTimestamp) {
		this.serverTimestamp = serverTimestamp;
	}

	public CardMessageData sendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
		return this;
	}

	/**
	 * UTC timestamp when the message was sent by the client.&lt;br&gt; Empty when sending a new message to the collaboration server
	 * 
	 * @return sendTimestamp
	 **/
	@ApiModelProperty(value = "UTC timestamp when the message was sent by the client.<br> Empty when sending a new message to the collaboration server")
	public Long getSendTimestamp() {
		return sendTimestamp;
	}

	public void setSendTimestamp(Long sendTimestamp) {
		this.sendTimestamp = sendTimestamp;
	}

	public CardMessageData type(EMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EMessageType getType() {
		return type;
	}

	public void setType(EMessageType type) {
		this.type = type;
	}

	public CardMessageData recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public CardMessageData addRecipientPersonIdsItem(String recipientPersonIdsItem) {
		if (this.recipientPersonIds == null) {
			this.recipientPersonIds = new ArrayList<>();
		}
		this.recipientPersonIds.add(recipientPersonIdsItem);
		return this;
	}

	/**
	 * Person IDs of the recipients of the message. If null, all active participations are recipients.
	 * 
	 * @return recipientPersonIds
	 **/
	@ApiModelProperty(value = "Person IDs of the recipients of the message. If null, all active participations are recipients.")
	public List<String> getRecipientPersonIds() {
		return recipientPersonIds;
	}

	public void setRecipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
	}

	public CardMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Text representation of the message which is used in following cases: &lt;ul&gt; &lt;li&gt;Unblu cannot restore the complex content of the message
	 * anymore&lt;/li&gt; &lt;li&gt;Push notifications&lt;/li&gt; &lt;li&gt;For the last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The text
	 * doesn&#39;t contain markdown.&lt;br&gt; The fallback text can be provided by the sender (bot, external messenger) or is generated when missing. It may,
	 * however, not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Text representation of the message which is used in following cases: <ul> <li>Unblu cannot restore the complex content of the message anymore</li> <li>Push notifications</li> <li>For the last message in the conversation overview</li> </ul> The text doesn't contain markdown.<br> The fallback text can be provided by the sender (bot, external messenger) or is generated when missing. It may, however, not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public CardMessageData actionId(String actionId) {
		this.actionId = actionId;
		return this;
	}

	/**
	 * An ID of the action triggering the message to be able to identify a message created by an action
	 * 
	 * @return actionId
	 **/
	@ApiModelProperty(value = "An ID of the action triggering the message to be able to identify a message created by an action")
	public String getActionId() {
		return actionId;
	}

	public void setActionId(String actionId) {
		this.actionId = actionId;
	}

	public CardMessageData sourceId(String sourceId) {
		this.sourceId = sourceId;
		return this;
	}

	/**
	 * A custom ID which identifies where this message initially came from
	 * 
	 * @return sourceId
	 **/
	@ApiModelProperty(value = "A custom ID which identifies where this message initially came from")
	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public CardMessageData botThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
		return this;
	}

	/**
	 * An ID which identifies the bot thread this message belongs. Null if the message is not part of a bot thread.
	 * 
	 * @return botThreadId
	 **/
	@ApiModelProperty(value = "An ID which identifies the bot thread this message belongs. Null if the message is not part of a bot thread.")
	public String getBotThreadId() {
		return botThreadId;
	}

	public void setBotThreadId(String botThreadId) {
		this.botThreadId = botThreadId;
	}

	public CardMessageData internal(Boolean internal) {
		this.internal = internal;
		return this;
	}

	/**
	 * Flag indicating whether the message is internal and only visible to agents. If &#39;false&#39;, the message is public and visible for everyone.
	 * 
	 * @return internal
	 **/
	@ApiModelProperty(value = "Flag indicating whether the message is internal and only visible to agents. If 'false', the message is public and visible for everyone.")
	public Boolean isInternal() {
		return internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

	public CardMessageData replyToMessageId(String replyToMessageId) {
		this.replyToMessageId = replyToMessageId;
		return this;
	}

	/**
	 * Optional ID that identifies the message that this message is replying to
	 * 
	 * @return replyToMessageId
	 **/
	@ApiModelProperty(value = "Optional ID that identifies the message that this message is replying to")
	public String getReplyToMessageId() {
		return replyToMessageId;
	}

	public void setReplyToMessageId(String replyToMessageId) {
		this.replyToMessageId = replyToMessageId;
	}

	public CardMessageData imageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		return this;
	}

	/**
	 * URL of the image displayed at the top of the card.
	 * 
	 * @return imageUrl
	 **/
	@ApiModelProperty(value = "URL of the image displayed at the top of the card.")
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public CardMessageData imageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
		return this;
	}

	/**
	 * Alt text for the image.
	 * 
	 * @return imageAltText
	 **/
	@ApiModelProperty(value = "Alt text for the image.")
	public String getImageAltText() {
		return imageAltText;
	}

	public void setImageAltText(String imageAltText) {
		this.imageAltText = imageAltText;
	}

	public CardMessageData title(String title) {
		this.title = title;
		return this;
	}

	/**
	 * Title displayed bold below the image.
	 * 
	 * @return title
	 **/
	@ApiModelProperty(value = "Title displayed bold below the image.")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CardMessageData body(String body) {
		this.body = body;
		return this;
	}

	/**
	 * Body text which may optionally contain markdown.
	 * 
	 * @return body
	 **/
	@ApiModelProperty(value = "Body text which may optionally contain markdown.")
	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public CardMessageData bodyTextType(EConversationMessageTextType bodyTextType) {
		this.bodyTextType = bodyTextType;
		return this;
	}

	/**
	 * Get bodyTextType
	 * 
	 * @return bodyTextType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageTextType getBodyTextType() {
		return bodyTextType;
	}

	public void setBodyTextType(EConversationMessageTextType bodyTextType) {
		this.bodyTextType = bodyTextType;
	}

	public CardMessageData actions(List<MessageAction> actions) {
		this.actions = actions;
		return this;
	}

	public CardMessageData addActionsItem(MessageAction actionsItem) {
		if (this.actions == null) {
			this.actions = new ArrayList<>();
		}
		this.actions.add(actionsItem);
		return this;
	}

	/**
	 * Actions which will be displayed at the bottom of the card.
	 * 
	 * @return actions
	 **/
	@ApiModelProperty(value = "Actions which will be displayed at the bottom of the card.")
	public List<MessageAction> getActions() {
		return actions;
	}

	public void setActions(List<MessageAction> actions) {
		this.actions = actions;
	}

	public CardMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public CardMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
		if (this.quickReplies == null) {
			this.quickReplies = new ArrayList<>();
		}
		this.quickReplies.add(quickRepliesItem);
		return this;
	}

	/**
	 * Optional quick replies which will be displayed above the chat input as a possible response options
	 * 
	 * @return quickReplies
	 **/
	@ApiModelProperty(value = "Optional quick replies which will be displayed above the chat input as a possible response options")
	public List<QuickReply> getQuickReplies() {
		return quickReplies;
	}

	public void setQuickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CardMessageData cardMessageData = (CardMessageData) o;
		return Objects.equals(this.$type, cardMessageData.$type) &&
				Objects.equals(this.id, cardMessageData.id) &&
				Objects.equals(this.conversationId, cardMessageData.conversationId) &&
				Objects.equals(this.externalMessengerChannelId, cardMessageData.externalMessengerChannelId) &&
				Objects.equals(this.accountId, cardMessageData.accountId) &&
				Objects.equals(this.senderPerson, cardMessageData.senderPerson) &&
				Objects.equals(this.senderPersonPresenceId, cardMessageData.senderPersonPresenceId) &&
				Objects.equals(this.serverTimestamp, cardMessageData.serverTimestamp) &&
				Objects.equals(this.sendTimestamp, cardMessageData.sendTimestamp) &&
				Objects.equals(this.type, cardMessageData.type) &&
				Objects.equals(this.recipientPersonIds, cardMessageData.recipientPersonIds) &&
				Objects.equals(this.fallbackText, cardMessageData.fallbackText) &&
				Objects.equals(this.actionId, cardMessageData.actionId) &&
				Objects.equals(this.sourceId, cardMessageData.sourceId) &&
				Objects.equals(this.botThreadId, cardMessageData.botThreadId) &&
				Objects.equals(this.internal, cardMessageData.internal) &&
				Objects.equals(this.replyToMessageId, cardMessageData.replyToMessageId) &&
				Objects.equals(this.imageUrl, cardMessageData.imageUrl) &&
				Objects.equals(this.imageAltText, cardMessageData.imageAltText) &&
				Objects.equals(this.title, cardMessageData.title) &&
				Objects.equals(this.body, cardMessageData.body) &&
				Objects.equals(this.bodyTextType, cardMessageData.bodyTextType) &&
				Objects.equals(this.actions, cardMessageData.actions) &&
				Objects.equals(this.quickReplies, cardMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationId, externalMessengerChannelId, accountId, senderPerson, senderPersonPresenceId, serverTimestamp, sendTimestamp, type, recipientPersonIds, fallbackText, actionId, sourceId, botThreadId, internal, replyToMessageId, imageUrl, imageAltText, title, body, bodyTextType, actions, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CardMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    externalMessengerChannelId: ").append(toIndentedString(externalMessengerChannelId)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    senderPerson: ").append(toIndentedString(senderPerson)).append("\n");
		sb.append("    senderPersonPresenceId: ").append(toIndentedString(senderPersonPresenceId)).append("\n");
		sb.append("    serverTimestamp: ").append(toIndentedString(serverTimestamp)).append("\n");
		sb.append("    sendTimestamp: ").append(toIndentedString(sendTimestamp)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    recipientPersonIds: ").append(toIndentedString(recipientPersonIds)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
		sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
		sb.append("    botThreadId: ").append(toIndentedString(botThreadId)).append("\n");
		sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
		sb.append("    replyToMessageId: ").append(toIndentedString(replyToMessageId)).append("\n");
		sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
		sb.append("    imageAltText: ").append(toIndentedString(imageAltText)).append("\n");
		sb.append("    title: ").append(toIndentedString(title)).append("\n");
		sb.append("    body: ").append(toIndentedString(body)).append("\n");
		sb.append("    bodyTextType: ").append(toIndentedString(bodyTextType)).append("\n");
		sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
		sb.append("    quickReplies: ").append(toIndentedString(quickReplies)).append("\n");
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
