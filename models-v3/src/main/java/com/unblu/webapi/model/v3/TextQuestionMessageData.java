
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
 * question message which should be answered with a some kind of a free text. There are several predifined types of answer possibilities.
 */
@ApiModel(description = "question message which should be answered with a some kind of a free text. There are several predifined types of answer possibilities.")

@JsonPropertyOrder({
	TextQuestionMessageData.JSON_PROPERTY_$_TYPE,
	TextQuestionMessageData.JSON_PROPERTY_ID,
	TextQuestionMessageData.JSON_PROPERTY_CONVERSATION_ID,
	TextQuestionMessageData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	TextQuestionMessageData.JSON_PROPERTY_ACCOUNT_ID,
	TextQuestionMessageData.JSON_PROPERTY_SENDER_PERSON,
	TextQuestionMessageData.JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID,
	TextQuestionMessageData.JSON_PROPERTY_SERVER_TIMESTAMP,
	TextQuestionMessageData.JSON_PROPERTY_SEND_TIMESTAMP,
	TextQuestionMessageData.JSON_PROPERTY_TYPE,
	TextQuestionMessageData.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	TextQuestionMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	TextQuestionMessageData.JSON_PROPERTY_ACTION_ID,
	TextQuestionMessageData.JSON_PROPERTY_SOURCE_ID,
	TextQuestionMessageData.JSON_PROPERTY_BOT_THREAD_ID,
	TextQuestionMessageData.JSON_PROPERTY_TEXT,
	TextQuestionMessageData.JSON_PROPERTY_TEXT_TYPE,
	TextQuestionMessageData.JSON_PROPERTY_QUESTION_TYPE,
	TextQuestionMessageData.JSON_PROPERTY_HINT,
	TextQuestionMessageData.JSON_PROPERTY_MIN_CHARACTERS,
	TextQuestionMessageData.JSON_PROPERTY_MAX_CHARACTERS,
	TextQuestionMessageData.JSON_PROPERTY_ADDITIONAL_REGEX,
	TextQuestionMessageData.JSON_PROPERTY_DECLINABLE,
	TextQuestionMessageData.JSON_PROPERTY_DECLINE_LABEL,
	TextQuestionMessageData.JSON_PROPERTY_DECLINE_VALUE,
	TextQuestionMessageData.JSON_PROPERTY_ANSWER_STATUS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class TextQuestionMessageData implements MessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		TEXTQUESTIONMESSAGEDATA("TextQuestionMessageData");

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
			return TypeEnum.TEXTQUESTIONMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.TEXTQUESTIONMESSAGEDATA;

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
	private EMessageType type = EMessageType.TEXT_QUESTION;

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

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private String text;

	public static final String JSON_PROPERTY_TEXT_TYPE = "textType";
	@JsonProperty(JSON_PROPERTY_TEXT_TYPE)
	private EConversationMessageTextType textType;

	public static final String JSON_PROPERTY_QUESTION_TYPE = "questionType";
	@JsonProperty(JSON_PROPERTY_QUESTION_TYPE)
	private ETextQuestionType questionType;

	public static final String JSON_PROPERTY_HINT = "hint";
	@JsonProperty(JSON_PROPERTY_HINT)
	private String hint;

	public static final String JSON_PROPERTY_MIN_CHARACTERS = "minCharacters";
	@JsonProperty(JSON_PROPERTY_MIN_CHARACTERS)
	private Integer minCharacters;

	public static final String JSON_PROPERTY_MAX_CHARACTERS = "maxCharacters";
	@JsonProperty(JSON_PROPERTY_MAX_CHARACTERS)
	private Integer maxCharacters;

	public static final String JSON_PROPERTY_ADDITIONAL_REGEX = "additionalRegex";
	@JsonProperty(JSON_PROPERTY_ADDITIONAL_REGEX)
	private String additionalRegex;

	public static final String JSON_PROPERTY_DECLINABLE = "declinable";
	@JsonProperty(JSON_PROPERTY_DECLINABLE)
	private Boolean declinable;

	public static final String JSON_PROPERTY_DECLINE_LABEL = "declineLabel";
	@JsonProperty(JSON_PROPERTY_DECLINE_LABEL)
	private String declineLabel;

	public static final String JSON_PROPERTY_DECLINE_VALUE = "declineValue";
	@JsonProperty(JSON_PROPERTY_DECLINE_VALUE)
	private String declineValue;

	public static final String JSON_PROPERTY_ANSWER_STATUS = "answerStatus";
	@JsonProperty(JSON_PROPERTY_ANSWER_STATUS)
	private EAnswerStatus answerStatus;

	public TextQuestionMessageData $type(TypeEnum $type) {
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

	public TextQuestionMessageData id(String id) {
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

	public TextQuestionMessageData conversationId(String conversationId) {
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

	public TextQuestionMessageData externalMessengerChannelId(String externalMessengerChannelId) {
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

	public TextQuestionMessageData accountId(String accountId) {
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

	public TextQuestionMessageData senderPerson(PersonData senderPerson) {
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

	public TextQuestionMessageData senderPersonPresenceId(String senderPersonPresenceId) {
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

	public TextQuestionMessageData serverTimestamp(Long serverTimestamp) {
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

	public TextQuestionMessageData sendTimestamp(Long sendTimestamp) {
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

	public TextQuestionMessageData type(EMessageType type) {
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

	public TextQuestionMessageData recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public TextQuestionMessageData addRecipientPersonIdsItem(String recipientPersonIdsItem) {
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

	public TextQuestionMessageData fallbackText(String fallbackText) {
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

	public TextQuestionMessageData actionId(String actionId) {
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

	public TextQuestionMessageData sourceId(String sourceId) {
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

	public TextQuestionMessageData botThreadId(String botThreadId) {
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

	public TextQuestionMessageData text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Text of the message
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "Text of the message")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextQuestionMessageData textType(EConversationMessageTextType textType) {
		this.textType = textType;
		return this;
	}

	/**
	 * Get textType
	 * 
	 * @return textType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageTextType getTextType() {
		return textType;
	}

	public void setTextType(EConversationMessageTextType textType) {
		this.textType = textType;
	}

	public TextQuestionMessageData questionType(ETextQuestionType questionType) {
		this.questionType = questionType;
		return this;
	}

	/**
	 * Get questionType
	 * 
	 * @return questionType
	 **/
	@ApiModelProperty(value = "")
	public ETextQuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(ETextQuestionType questionType) {
		this.questionType = questionType;
	}

	public TextQuestionMessageData hint(String hint) {
		this.hint = hint;
		return this;
	}

	/**
	 * Hint which is displayed inside the reply field to give the user a hint, what the answer should contain. &lt;br&gt; Optional value
	 * 
	 * @return hint
	 **/
	@ApiModelProperty(value = "Hint which is displayed inside the reply field to give the user a hint, what the answer should contain. <br> Optional value")
	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public TextQuestionMessageData minCharacters(Integer minCharacters) {
		this.minCharacters = minCharacters;
		return this;
	}

	/**
	 * Minimum amount of characters the user has to answer with. &lt;br&gt; Optional value
	 * 
	 * @return minCharacters
	 **/
	@ApiModelProperty(value = "Minimum amount of characters the user has to answer with. <br> Optional value")
	public Integer getMinCharacters() {
		return minCharacters;
	}

	public void setMinCharacters(Integer minCharacters) {
		this.minCharacters = minCharacters;
	}

	public TextQuestionMessageData maxCharacters(Integer maxCharacters) {
		this.maxCharacters = maxCharacters;
		return this;
	}

	/**
	 * Maximum amount if characters the user can answer with.&lt;br&gt; Optional
	 * 
	 * @return maxCharacters
	 **/
	@ApiModelProperty(value = "Maximum amount if characters the user can answer with.<br> Optional")
	public Integer getMaxCharacters() {
		return maxCharacters;
	}

	public void setMaxCharacters(Integer maxCharacters) {
		this.maxCharacters = maxCharacters;
	}

	public TextQuestionMessageData additionalRegex(String additionalRegex) {
		this.additionalRegex = additionalRegex;
		return this;
	}

	/**
	 * The reply has to match this regex. &lt;br&gt; Optional value
	 * 
	 * @return additionalRegex
	 **/
	@ApiModelProperty(value = "The reply has to match this regex. <br> Optional value")
	public String getAdditionalRegex() {
		return additionalRegex;
	}

	public void setAdditionalRegex(String additionalRegex) {
		this.additionalRegex = additionalRegex;
	}

	public TextQuestionMessageData declinable(Boolean declinable) {
		this.declinable = declinable;
		return this;
	}

	/**
	 * Whether the question can be declined
	 * 
	 * @return declinable
	 **/
	@ApiModelProperty(value = "Whether the question can be declined")
	public Boolean isDeclinable() {
		return declinable;
	}

	public void setDeclinable(Boolean declinable) {
		this.declinable = declinable;
	}

	public TextQuestionMessageData declineLabel(String declineLabel) {
		this.declineLabel = declineLabel;
		return this;
	}

	/**
	 * Label for the decline button which will also be used as text for the reply
	 * 
	 * @return declineLabel
	 **/
	@ApiModelProperty(value = "Label for the decline button which will also be used as text for the reply")
	public String getDeclineLabel() {
		return declineLabel;
	}

	public void setDeclineLabel(String declineLabel) {
		this.declineLabel = declineLabel;
	}

	public TextQuestionMessageData declineValue(String declineValue) {
		this.declineValue = declineValue;
		return this;
	}

	/**
	 * Value which will be propagated as reply value if the question is declined
	 * 
	 * @return declineValue
	 **/
	@ApiModelProperty(value = "Value which will be propagated as reply value if the question is declined")
	public String getDeclineValue() {
		return declineValue;
	}

	public void setDeclineValue(String declineValue) {
		this.declineValue = declineValue;
	}

	public TextQuestionMessageData answerStatus(EAnswerStatus answerStatus) {
		this.answerStatus = answerStatus;
		return this;
	}

	/**
	 * Get answerStatus
	 * 
	 * @return answerStatus
	 **/
	@ApiModelProperty(value = "")
	public EAnswerStatus getAnswerStatus() {
		return answerStatus;
	}

	public void setAnswerStatus(EAnswerStatus answerStatus) {
		this.answerStatus = answerStatus;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		TextQuestionMessageData textQuestionMessageData = (TextQuestionMessageData) o;
		return Objects.equals(this.$type, textQuestionMessageData.$type) &&
				Objects.equals(this.id, textQuestionMessageData.id) &&
				Objects.equals(this.conversationId, textQuestionMessageData.conversationId) &&
				Objects.equals(this.externalMessengerChannelId, textQuestionMessageData.externalMessengerChannelId) &&
				Objects.equals(this.accountId, textQuestionMessageData.accountId) &&
				Objects.equals(this.senderPerson, textQuestionMessageData.senderPerson) &&
				Objects.equals(this.senderPersonPresenceId, textQuestionMessageData.senderPersonPresenceId) &&
				Objects.equals(this.serverTimestamp, textQuestionMessageData.serverTimestamp) &&
				Objects.equals(this.sendTimestamp, textQuestionMessageData.sendTimestamp) &&
				Objects.equals(this.type, textQuestionMessageData.type) &&
				Objects.equals(this.recipientPersonIds, textQuestionMessageData.recipientPersonIds) &&
				Objects.equals(this.fallbackText, textQuestionMessageData.fallbackText) &&
				Objects.equals(this.actionId, textQuestionMessageData.actionId) &&
				Objects.equals(this.sourceId, textQuestionMessageData.sourceId) &&
				Objects.equals(this.botThreadId, textQuestionMessageData.botThreadId) &&
				Objects.equals(this.text, textQuestionMessageData.text) &&
				Objects.equals(this.textType, textQuestionMessageData.textType) &&
				Objects.equals(this.questionType, textQuestionMessageData.questionType) &&
				Objects.equals(this.hint, textQuestionMessageData.hint) &&
				Objects.equals(this.minCharacters, textQuestionMessageData.minCharacters) &&
				Objects.equals(this.maxCharacters, textQuestionMessageData.maxCharacters) &&
				Objects.equals(this.additionalRegex, textQuestionMessageData.additionalRegex) &&
				Objects.equals(this.declinable, textQuestionMessageData.declinable) &&
				Objects.equals(this.declineLabel, textQuestionMessageData.declineLabel) &&
				Objects.equals(this.declineValue, textQuestionMessageData.declineValue) &&
				Objects.equals(this.answerStatus, textQuestionMessageData.answerStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationId, externalMessengerChannelId, accountId, senderPerson, senderPersonPresenceId, serverTimestamp, sendTimestamp, type, recipientPersonIds, fallbackText, actionId, sourceId, botThreadId, text, textType, questionType, hint, minCharacters, maxCharacters, additionalRegex, declinable, declineLabel, declineValue, answerStatus);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class TextQuestionMessageData {\n");
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
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
		sb.append("    textType: ").append(toIndentedString(textType)).append("\n");
		sb.append("    questionType: ").append(toIndentedString(questionType)).append("\n");
		sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
		sb.append("    minCharacters: ").append(toIndentedString(minCharacters)).append("\n");
		sb.append("    maxCharacters: ").append(toIndentedString(maxCharacters)).append("\n");
		sb.append("    additionalRegex: ").append(toIndentedString(additionalRegex)).append("\n");
		sb.append("    declinable: ").append(toIndentedString(declinable)).append("\n");
		sb.append("    declineLabel: ").append(toIndentedString(declineLabel)).append("\n");
		sb.append("    declineValue: ").append(toIndentedString(declineValue)).append("\n");
		sb.append("    answerStatus: ").append(toIndentedString(answerStatus)).append("\n");
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
