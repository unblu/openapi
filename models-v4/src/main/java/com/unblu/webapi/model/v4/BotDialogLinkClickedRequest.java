
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
 * Request sent when a person clicks a link in a message of a dialog between a person and a bot. &lt;p&gt; The request covers links in the message text and the
 * link actions of card and list messages. The URL, the link source, and the message action are reported by the client that displays the message. Unblu
 * doesn&#39;t verify them. The message action is only set for the &#x60;ELinkSource.MESSAGE_ACTION&#x60; link source. &lt;p&gt; The request isn&#39;t sent in
 * the cases listed for &#x60;ConversationLinkClickedEvent&#x60;. If the link opens in the same browser tab and the page the Unblu UI is integrated in unloads,
 * the request may be lost. &lt;p&gt; The request is only delivered to the dialog bot that is currently handling this dialog, and only for links in messages of
 * the dialog&#39;s bot thread. These include messages sent before the dialog started, for example by a bot that handled the bot thread earlier.
 */
@ApiModel(description = "Request sent when a person clicks a link in a message of a dialog between a person and a bot. <p> The request covers links in the message text and the link actions of card and list messages. The URL, the link source, and the message action are reported by the client that displays the message. Unblu doesn't verify them. The message action is only set for the `ELinkSource.MESSAGE_ACTION` link source. <p> The request isn't sent in the cases listed for `ConversationLinkClickedEvent`. If the link opens in the same browser tab and the page the Unblu UI is integrated in unloads, the request may be lost. <p> The request is only delivered to the dialog bot that is currently handling this dialog, and only for links in messages of the dialog's bot thread. These include messages sent before the dialog started, for example by a bot that handled the bot thread earlier.")

@JsonPropertyOrder({
	BotDialogLinkClickedRequest.JSON_PROPERTY_$_TYPE,
	BotDialogLinkClickedRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogLinkClickedRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogLinkClickedRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogLinkClickedRequest.JSON_PROPERTY_CONVERSATION_ID,
	BotDialogLinkClickedRequest.JSON_PROPERTY_CONVERSATION_MESSAGE,
	BotDialogLinkClickedRequest.JSON_PROPERTY_EXECUTED_BY,
	BotDialogLinkClickedRequest.JSON_PROPERTY_URL,
	BotDialogLinkClickedRequest.JSON_PROPERTY_LINK_SOURCE,
	BotDialogLinkClickedRequest.JSON_PROPERTY_MESSAGE_ACTION,
	BotDialogLinkClickedRequest.JSON_PROPERTY_CLICK_ID,
	BotDialogLinkClickedRequest.JSON_PROPERTY_CLICK_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogLinkClickedRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGLINKCLICKEDREQUEST("BotDialogLinkClickedRequest");

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
			return TypeEnum.BOTDIALOGLINKCLICKEDREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGLINKCLICKEDREQUEST;

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

	public BotDialogLinkClickedRequest $type(TypeEnum $type) {
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

	public BotDialogLinkClickedRequest accountId(String accountId) {
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

	public BotDialogLinkClickedRequest serviceName(String serviceName) {
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

	public BotDialogLinkClickedRequest dialogToken(String dialogToken) {
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

	public BotDialogLinkClickedRequest conversationId(String conversationId) {
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

	public BotDialogLinkClickedRequest conversationMessage(MessageData conversationMessage) {
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

	public BotDialogLinkClickedRequest executedBy(PersonData executedBy) {
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

	public BotDialogLinkClickedRequest url(String url) {
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

	public BotDialogLinkClickedRequest linkSource(ELinkSource linkSource) {
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

	public BotDialogLinkClickedRequest messageAction(MessageAction messageAction) {
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

	public BotDialogLinkClickedRequest clickId(String clickId) {
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

	public BotDialogLinkClickedRequest clickTimestamp(Long clickTimestamp) {
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
		BotDialogLinkClickedRequest botDialogLinkClickedRequest = (BotDialogLinkClickedRequest) o;
		return Objects.equals(this.$type, botDialogLinkClickedRequest.$type) &&
				Objects.equals(this.accountId, botDialogLinkClickedRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogLinkClickedRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogLinkClickedRequest.dialogToken) &&
				Objects.equals(this.conversationId, botDialogLinkClickedRequest.conversationId) &&
				Objects.equals(this.conversationMessage, botDialogLinkClickedRequest.conversationMessage) &&
				Objects.equals(this.executedBy, botDialogLinkClickedRequest.executedBy) &&
				Objects.equals(this.url, botDialogLinkClickedRequest.url) &&
				Objects.equals(this.linkSource, botDialogLinkClickedRequest.linkSource) &&
				Objects.equals(this.messageAction, botDialogLinkClickedRequest.messageAction) &&
				Objects.equals(this.clickId, botDialogLinkClickedRequest.clickId) &&
				Objects.equals(this.clickTimestamp, botDialogLinkClickedRequest.clickTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, conversationId, conversationMessage, executedBy, url, linkSource, messageAction, clickId, clickTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogLinkClickedRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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
