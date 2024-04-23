
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
 * Request sent when a dialog between a person and a bot starts. &lt;br&gt; After this event has been received, messages may be sent in this dialog using the
 * passed dialogToken &lt;p&gt; The request is only delivered to the dialog bots that accepted the dialog offer for the dialog.
 */
@ApiModel(description = "Request sent when a dialog between a person and a bot starts. <br> After this event has been received, messages may be sent in this dialog using the passed dialogToken <p> The request is only delivered to the dialog bots that accepted the dialog offer for the dialog.")

@JsonPropertyOrder({
	BotDialogOpenRequest.JSON_PROPERTY_$_TYPE,
	BotDialogOpenRequest.JSON_PROPERTY_ACCOUNT_ID,
	BotDialogOpenRequest.JSON_PROPERTY_SERVICE_NAME,
	BotDialogOpenRequest.JSON_PROPERTY_DIALOG_TOKEN,
	BotDialogOpenRequest.JSON_PROPERTY_DIALOG_TYPE,
	BotDialogOpenRequest.JSON_PROPERTY_COUNTERPART_PERSON,
	BotDialogOpenRequest.JSON_PROPERTY_CONVERSATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogOpenRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGOPENREQUEST("BotDialogOpenRequest");

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
			return TypeEnum.BOTDIALOGOPENREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGOPENREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_DIALOG_TOKEN = "dialogToken";
	@JsonProperty(JSON_PROPERTY_DIALOG_TOKEN)
	private String dialogToken;

	public static final String JSON_PROPERTY_DIALOG_TYPE = "dialogType";
	@JsonProperty(JSON_PROPERTY_DIALOG_TYPE)
	private EBotDialogType dialogType;

	public static final String JSON_PROPERTY_COUNTERPART_PERSON = "counterpartPerson";
	@JsonProperty(JSON_PROPERTY_COUNTERPART_PERSON)
	private PersonData counterpartPerson = null;

	public static final String JSON_PROPERTY_CONVERSATION = "conversation";
	@JsonProperty(JSON_PROPERTY_CONVERSATION)
	private ConversationData conversation = null;

	public BotDialogOpenRequest $type(TypeEnum $type) {
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

	public BotDialogOpenRequest accountId(String accountId) {
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

	public BotDialogOpenRequest serviceName(String serviceName) {
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

	public BotDialogOpenRequest dialogToken(String dialogToken) {
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

	public BotDialogOpenRequest dialogType(EBotDialogType dialogType) {
		this.dialogType = dialogType;
		return this;
	}

	/**
	 * Get dialogType
	 * 
	 * @return dialogType
	 **/
	@ApiModelProperty(value = "")
	public EBotDialogType getDialogType() {
		return dialogType;
	}

	public void setDialogType(EBotDialogType dialogType) {
		this.dialogType = dialogType;
	}

	public BotDialogOpenRequest counterpartPerson(PersonData counterpartPerson) {
		this.counterpartPerson = counterpartPerson;
		return this;
	}

	/**
	 * Get counterpartPerson
	 * 
	 * @return counterpartPerson
	 **/
	@ApiModelProperty(value = "")
	public PersonData getCounterpartPerson() {
		return counterpartPerson;
	}

	public void setCounterpartPerson(PersonData counterpartPerson) {
		this.counterpartPerson = counterpartPerson;
	}

	public BotDialogOpenRequest conversation(ConversationData conversation) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogOpenRequest botDialogOpenRequest = (BotDialogOpenRequest) o;
		return Objects.equals(this.$type, botDialogOpenRequest.$type) &&
				Objects.equals(this.accountId, botDialogOpenRequest.accountId) &&
				Objects.equals(this.serviceName, botDialogOpenRequest.serviceName) &&
				Objects.equals(this.dialogToken, botDialogOpenRequest.dialogToken) &&
				Objects.equals(this.dialogType, botDialogOpenRequest.dialogType) &&
				Objects.equals(this.counterpartPerson, botDialogOpenRequest.counterpartPerson) &&
				Objects.equals(this.conversation, botDialogOpenRequest.conversation);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, dialogToken, dialogType, counterpartPerson, conversation);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogOpenRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    dialogToken: ").append(toIndentedString(dialogToken)).append("\n");
		sb.append("    dialogType: ").append(toIndentedString(dialogType)).append("\n");
		sb.append("    counterpartPerson: ").append(toIndentedString(counterpartPerson)).append("\n");
		sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
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
