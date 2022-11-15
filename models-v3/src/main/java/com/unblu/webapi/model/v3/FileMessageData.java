
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
 * Message which contains a file and maybe a caption text. The text field should be a description of the image content.
 */
@ApiModel(description = "Message which contains a file and maybe a caption text. The text field should be a description of the image content.")

@JsonPropertyOrder({
	FileMessageData.JSON_PROPERTY_$_TYPE,
	FileMessageData.JSON_PROPERTY_ID,
	FileMessageData.JSON_PROPERTY_CONVERSATION_ID,
	FileMessageData.JSON_PROPERTY_EXTERNAL_MESSENGER_CHANNEL_ID,
	FileMessageData.JSON_PROPERTY_ACCOUNT_ID,
	FileMessageData.JSON_PROPERTY_SENDER_PERSON,
	FileMessageData.JSON_PROPERTY_SENDER_PERSON_PRESENCE_ID,
	FileMessageData.JSON_PROPERTY_SERVER_TIMESTAMP,
	FileMessageData.JSON_PROPERTY_SEND_TIMESTAMP,
	FileMessageData.JSON_PROPERTY_TYPE,
	FileMessageData.JSON_PROPERTY_RECIPIENT_PERSON_IDS,
	FileMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	FileMessageData.JSON_PROPERTY_ACTION_ID,
	FileMessageData.JSON_PROPERTY_SOURCE_ID,
	FileMessageData.JSON_PROPERTY_BOT_THREAD_ID,
	FileMessageData.JSON_PROPERTY_INTERNAL,
	FileMessageData.JSON_PROPERTY_FILE_NAME,
	FileMessageData.JSON_PROPERTY_CAPTION,
	FileMessageData.JSON_PROPERTY_CAPTION_TYPE,
	FileMessageData.JSON_PROPERTY_MIME_TYPE,
	FileMessageData.JSON_PROPERTY_SOURCE,
	FileMessageData.JSON_PROPERTY_FILE_STORE_ID,
	FileMessageData.JSON_PROPERTY_FILE_STATUS,
	FileMessageData.JSON_PROPERTY_TOTAL_SIZE,
	FileMessageData.JSON_PROPERTY_UPLOADED_SIZE,
	FileMessageData.JSON_PROPERTY_DOWNLOAD_LINK,
	FileMessageData.JSON_PROPERTY_QUICK_REPLIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FileMessageData implements MessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		FILEMESSAGEDATA("FileMessageData");

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
			return TypeEnum.FILEMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.FILEMESSAGEDATA;

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
	private EMessageType type = EMessageType.FILE;

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

	public static final String JSON_PROPERTY_FILE_NAME = "fileName";
	@JsonProperty(JSON_PROPERTY_FILE_NAME)
	private String fileName;

	public static final String JSON_PROPERTY_CAPTION = "caption";
	@JsonProperty(JSON_PROPERTY_CAPTION)
	private String caption;

	public static final String JSON_PROPERTY_CAPTION_TYPE = "captionType";
	@JsonProperty(JSON_PROPERTY_CAPTION_TYPE)
	private EConversationMessageTextType captionType;

	public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
	@JsonProperty(JSON_PROPERTY_MIME_TYPE)
	private String mimeType;

	public static final String JSON_PROPERTY_SOURCE = "source";
	@JsonProperty(JSON_PROPERTY_SOURCE)
	private String source;

	public static final String JSON_PROPERTY_FILE_STORE_ID = "fileStoreId";
	@JsonProperty(JSON_PROPERTY_FILE_STORE_ID)
	private String fileStoreId;

	public static final String JSON_PROPERTY_FILE_STATUS = "fileStatus";
	@JsonProperty(JSON_PROPERTY_FILE_STATUS)
	private EConversationFileStatus fileStatus;

	public static final String JSON_PROPERTY_TOTAL_SIZE = "totalSize";
	@JsonProperty(JSON_PROPERTY_TOTAL_SIZE)
	private Long totalSize;

	public static final String JSON_PROPERTY_UPLOADED_SIZE = "uploadedSize";
	@JsonProperty(JSON_PROPERTY_UPLOADED_SIZE)
	private Long uploadedSize;

	public static final String JSON_PROPERTY_DOWNLOAD_LINK = "downloadLink";
	@JsonProperty(JSON_PROPERTY_DOWNLOAD_LINK)
	private String downloadLink;

	public static final String JSON_PROPERTY_QUICK_REPLIES = "quickReplies";
	@JsonProperty(JSON_PROPERTY_QUICK_REPLIES)
	private List<QuickReply> quickReplies = null;

	public FileMessageData $type(TypeEnum $type) {
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

	public FileMessageData id(String id) {
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

	public FileMessageData conversationId(String conversationId) {
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

	public FileMessageData externalMessengerChannelId(String externalMessengerChannelId) {
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

	public FileMessageData accountId(String accountId) {
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

	public FileMessageData senderPerson(PersonData senderPerson) {
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

	public FileMessageData senderPersonPresenceId(String senderPersonPresenceId) {
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

	public FileMessageData serverTimestamp(Long serverTimestamp) {
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

	public FileMessageData sendTimestamp(Long sendTimestamp) {
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

	public FileMessageData type(EMessageType type) {
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

	public FileMessageData recipientPersonIds(List<String> recipientPersonIds) {
		this.recipientPersonIds = recipientPersonIds;
		return this;
	}

	public FileMessageData addRecipientPersonIdsItem(String recipientPersonIdsItem) {
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

	public FileMessageData fallbackText(String fallbackText) {
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

	public FileMessageData actionId(String actionId) {
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

	public FileMessageData sourceId(String sourceId) {
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

	public FileMessageData botThreadId(String botThreadId) {
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

	public FileMessageData internal(Boolean internal) {
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

	public FileMessageData fileName(String fileName) {
		this.fileName = fileName;
		return this;
	}

	/**
	 * The name of the file that is send
	 * 
	 * @return fileName
	 **/
	@ApiModelProperty(value = "The name of the file that is send")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public FileMessageData caption(String caption) {
		this.caption = caption;
		return this;
	}

	/**
	 * A caption for the file that is send. Can be omitted
	 * 
	 * @return caption
	 **/
	@ApiModelProperty(value = "A caption for the file that is send. Can be omitted")
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public FileMessageData captionType(EConversationMessageTextType captionType) {
		this.captionType = captionType;
		return this;
	}

	/**
	 * Get captionType
	 * 
	 * @return captionType
	 **/
	@ApiModelProperty(value = "")
	public EConversationMessageTextType getCaptionType() {
		return captionType;
	}

	public void setCaptionType(EConversationMessageTextType captionType) {
		this.captionType = captionType;
	}

	public FileMessageData mimeType(String mimeType) {
		this.mimeType = mimeType;
		return this;
	}

	/**
	 * The mime type of the file that is send
	 * 
	 * @return mimeType
	 **/
	@ApiModelProperty(value = "The mime type of the file that is send")
	public String getMimeType() {
		return mimeType;
	}

	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}

	public FileMessageData source(String source) {
		this.source = source;
		return this;
	}

	/**
	 * The source of the file
	 * 
	 * @return source
	 **/
	@ApiModelProperty(value = "The source of the file")
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public FileMessageData fileStoreId(String fileStoreId) {
		this.fileStoreId = fileStoreId;
		return this;
	}

	/**
	 * The file store id of the content inside the collaboration server
	 * 
	 * @return fileStoreId
	 **/
	@ApiModelProperty(value = "The file store id of the content inside the collaboration server")
	public String getFileStoreId() {
		return fileStoreId;
	}

	public void setFileStoreId(String fileStoreId) {
		this.fileStoreId = fileStoreId;
	}

	public FileMessageData fileStatus(EConversationFileStatus fileStatus) {
		this.fileStatus = fileStatus;
		return this;
	}

	/**
	 * Get fileStatus
	 * 
	 * @return fileStatus
	 **/
	@ApiModelProperty(value = "")
	public EConversationFileStatus getFileStatus() {
		return fileStatus;
	}

	public void setFileStatus(EConversationFileStatus fileStatus) {
		this.fileStatus = fileStatus;
	}

	public FileMessageData totalSize(Long totalSize) {
		this.totalSize = totalSize;
		return this;
	}

	/**
	 * The total size of the file. Does not need to be set, when the file is send to the collaboration server
	 * 
	 * @return totalSize
	 **/
	@ApiModelProperty(value = "The total size of the file. Does not need to be set, when the file is send to the collaboration server")
	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public FileMessageData uploadedSize(Long uploadedSize) {
		this.uploadedSize = uploadedSize;
		return this;
	}

	/**
	 * The amount of data that was already uploaded to the server. Does not need to be set, when the file is send to the collaboration server
	 * 
	 * @return uploadedSize
	 **/
	@ApiModelProperty(value = "The amount of data that was already uploaded to the server. Does not need to be set, when the file is send to the collaboration server")
	public Long getUploadedSize() {
		return uploadedSize;
	}

	public void setUploadedSize(Long uploadedSize) {
		this.uploadedSize = uploadedSize;
	}

	public FileMessageData downloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
		return this;
	}

	/**
	 * The url link to download the file. Note that the access must be done from an authenticated user with admin rights. This may either be done using basic
	 * authentication or a valid session cookie.
	 * 
	 * @return downloadLink
	 **/
	@ApiModelProperty(value = "The url link to download the file. Note that the access must be done from an authenticated user with admin rights. This may either be done using basic authentication or a valid session cookie.")
	public String getDownloadLink() {
		return downloadLink;
	}

	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}

	public FileMessageData quickReplies(List<QuickReply> quickReplies) {
		this.quickReplies = quickReplies;
		return this;
	}

	public FileMessageData addQuickRepliesItem(QuickReply quickRepliesItem) {
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
		FileMessageData fileMessageData = (FileMessageData) o;
		return Objects.equals(this.$type, fileMessageData.$type) &&
				Objects.equals(this.id, fileMessageData.id) &&
				Objects.equals(this.conversationId, fileMessageData.conversationId) &&
				Objects.equals(this.externalMessengerChannelId, fileMessageData.externalMessengerChannelId) &&
				Objects.equals(this.accountId, fileMessageData.accountId) &&
				Objects.equals(this.senderPerson, fileMessageData.senderPerson) &&
				Objects.equals(this.senderPersonPresenceId, fileMessageData.senderPersonPresenceId) &&
				Objects.equals(this.serverTimestamp, fileMessageData.serverTimestamp) &&
				Objects.equals(this.sendTimestamp, fileMessageData.sendTimestamp) &&
				Objects.equals(this.type, fileMessageData.type) &&
				Objects.equals(this.recipientPersonIds, fileMessageData.recipientPersonIds) &&
				Objects.equals(this.fallbackText, fileMessageData.fallbackText) &&
				Objects.equals(this.actionId, fileMessageData.actionId) &&
				Objects.equals(this.sourceId, fileMessageData.sourceId) &&
				Objects.equals(this.botThreadId, fileMessageData.botThreadId) &&
				Objects.equals(this.internal, fileMessageData.internal) &&
				Objects.equals(this.fileName, fileMessageData.fileName) &&
				Objects.equals(this.caption, fileMessageData.caption) &&
				Objects.equals(this.captionType, fileMessageData.captionType) &&
				Objects.equals(this.mimeType, fileMessageData.mimeType) &&
				Objects.equals(this.source, fileMessageData.source) &&
				Objects.equals(this.fileStoreId, fileMessageData.fileStoreId) &&
				Objects.equals(this.fileStatus, fileMessageData.fileStatus) &&
				Objects.equals(this.totalSize, fileMessageData.totalSize) &&
				Objects.equals(this.uploadedSize, fileMessageData.uploadedSize) &&
				Objects.equals(this.downloadLink, fileMessageData.downloadLink) &&
				Objects.equals(this.quickReplies, fileMessageData.quickReplies);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, conversationId, externalMessengerChannelId, accountId, senderPerson, senderPersonPresenceId, serverTimestamp, sendTimestamp, type, recipientPersonIds, fallbackText, actionId, sourceId, botThreadId, internal, fileName, caption, captionType, mimeType, source, fileStoreId, fileStatus, totalSize, uploadedSize, downloadLink, quickReplies);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileMessageData {\n");
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
		sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
		sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
		sb.append("    captionType: ").append(toIndentedString(captionType)).append("\n");
		sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
		sb.append("    source: ").append(toIndentedString(source)).append("\n");
		sb.append("    fileStoreId: ").append(toIndentedString(fileStoreId)).append("\n");
		sb.append("    fileStatus: ").append(toIndentedString(fileStatus)).append("\n");
		sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
		sb.append("    uploadedSize: ").append(toIndentedString(uploadedSize)).append("\n");
		sb.append("    downloadLink: ").append(toIndentedString(downloadLink)).append("\n");
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
