
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
 * Request sent when a message is deleted in a dialog between a person and a bot. &lt;p&gt; Participants can delete a message for all participants or only for
 * themselves. In the latter case, the request is sent each time a participant deletes the message for themselves. &lt;p&gt; The request is only delivered to
 * the dialog bot that is currently handling this dialog.
 */
@ApiModel(description = "Request sent when a message is deleted in a dialog between a person and a bot. <p> Participants can delete a message for all participants or only for themselves. In the latter case, the request is sent each time a participant deletes the message for themselves. <p> The request is only delivered to the dialog bot that is currently handling this dialog.")

@JsonPropertyOrder({
	BotDialogMessageDeletedRequest.JSON_PROPERTY_$_TYPE,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_CONVERSATION_MESSAGE,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_CONVERSATION_ID,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_MARKED_AS_DELETED_FOR_EVERYBODY,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_DELETING_PERSON_ID,
	BotDialogMessageDeletedRequest.JSON_PROPERTY_DELETED_ONLY_FOR_PERSON_IDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogMessageDeletedRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGMESSAGEDELETEDREQUEST("BotDialogMessageDeletedRequest");

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
			return TypeEnum.BOTDIALOGMESSAGEDELETEDREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGMESSAGEDELETEDREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public static final String JSON_PROPERTY_MARKED_AS_DELETED_FOR_EVERYBODY = "markedAsDeletedForEverybody";
	@JsonProperty(JSON_PROPERTY_MARKED_AS_DELETED_FOR_EVERYBODY)
	private Boolean markedAsDeletedForEverybody;

	public static final String JSON_PROPERTY_DELETING_PERSON_ID = "deletingPersonId";
	@JsonProperty(JSON_PROPERTY_DELETING_PERSON_ID)
	private String deletingPersonId;

	public static final String JSON_PROPERTY_DELETED_ONLY_FOR_PERSON_IDS = "deletedOnlyForPersonIds";
	@JsonProperty(JSON_PROPERTY_DELETED_ONLY_FOR_PERSON_IDS)
	private List<String> deletedOnlyForPersonIds = null;

	public BotDialogMessageDeletedRequest $type(TypeEnum $type) {
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

	public BotDialogMessageDeletedRequest accountId(String accountId) {
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

	public BotDialogMessageDeletedRequest serviceName(String serviceName) {
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

	public BotDialogMessageDeletedRequest dialogToken(String dialogToken) {
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

	public BotDialogMessageDeletedRequest conversationMessage(MessageData conversationMessage) {
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

	public BotDialogMessageDeletedRequest conversationId(String conversationId) {
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

	public BotDialogMessageDeletedRequest markedAsDeletedForEverybody(Boolean markedAsDeletedForEverybody) {
		this.markedAsDeletedForEverybody = markedAsDeletedForEverybody;
		return this;
	}

	/**
	 * Whether the message is marked as deleted for all participants.
	 * 
	 * @return markedAsDeletedForEverybody
	 **/
	@ApiModelProperty(value = "Whether the message is marked as deleted for all participants.")
	public Boolean isMarkedAsDeletedForEverybody() {
		return markedAsDeletedForEverybody;
	}

	public void setMarkedAsDeletedForEverybody(Boolean markedAsDeletedForEverybody) {
		this.markedAsDeletedForEverybody = markedAsDeletedForEverybody;
	}

	public BotDialogMessageDeletedRequest deletingPersonId(String deletingPersonId) {
		this.deletingPersonId = deletingPersonId;
		return this;
	}

	/**
	 * The ID of the person who marked the message as deleted for all participants. Null if the message wasn&#39;t deleted for all participants.
	 * 
	 * @return deletingPersonId
	 **/
	@ApiModelProperty(value = "The ID of the person who marked the message as deleted for all participants. Null if the message wasn't deleted for all participants.")
	public String getDeletingPersonId() {
		return deletingPersonId;
	}

	public void setDeletingPersonId(String deletingPersonId) {
		this.deletingPersonId = deletingPersonId;
	}

	public BotDialogMessageDeletedRequest deletedOnlyForPersonIds(List<String> deletedOnlyForPersonIds) {
		this.deletedOnlyForPersonIds = deletedOnlyForPersonIds;
		return this;
	}

	public BotDialogMessageDeletedRequest addDeletedOnlyForPersonIdsItem(String deletedOnlyForPersonIdsItem) {
		if (this.deletedOnlyForPersonIds == null) {
			this.deletedOnlyForPersonIds = new ArrayList<>();
		}
		this.deletedOnlyForPersonIds.add(deletedOnlyForPersonIdsItem);
		return this;
	}

	/**
	 * The IDs of the participants who have marked this message as deleted for themselves.
	 * 
	 * @return deletedOnlyForPersonIds
	 **/
	@ApiModelProperty(value = "The IDs of the participants who have marked this message as deleted for themselves.")
	public List<String> getDeletedOnlyForPersonIds() {
		return deletedOnlyForPersonIds;
	}

	public void setDeletedOnlyForPersonIds(List<String> deletedOnlyForPersonIds) {
		this.deletedOnlyForPersonIds = deletedOnlyForPersonIds;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogMessageDeletedRequest botDialogMessageDeletedRequest = (BotDialogMessageDeletedRequest) o;
		return Objects.equals(this.$type, botDialogMessageDeletedRequest.$type) &&
				Objects.equals(this.accountId, botDialogMessageDeletedRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogMessageDeletedRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogMessageDeletedRequest.dialogToken) &&
				Objects.equals(this.conversationMessage, botDialogMessageDeletedRequest.conversationMessage) &&
				Objects.equals(this.conversationId, botDialogMessageDeletedRequest.conversationId) &&
				Objects.equals(this.markedAsDeletedForEverybody, botDialogMessageDeletedRequest.markedAsDeletedForEverybody) &&
				Objects.equals(this.deletingPersonId, botDialogMessageDeletedRequest.deletingPersonId) &&
				Objects.equals(this.deletedOnlyForPersonIds, botDialogMessageDeletedRequest.deletedOnlyForPersonIds);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, conversationMessage, conversationId, markedAsDeletedForEverybody, deletingPersonId, deletedOnlyForPersonIds);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogMessageDeletedRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
		sb.append("    markedAsDeletedForEverybody: ").append(toIndentedString(markedAsDeletedForEverybody)).append("\n");
		sb.append("    deletingPersonId: ").append(toIndentedString(deletingPersonId)).append("\n");
		sb.append("    deletedOnlyForPersonIds: ").append(toIndentedString(deletedOnlyForPersonIds)).append("\n");
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
