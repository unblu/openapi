
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
 * Event emitted when a new message is sent to an external messenger channel.
 */
@ApiModel(description = "Event emitted when a new message is sent to an external messenger channel.")

@JsonPropertyOrder({
	ExternalMessengerNewMessageRequest.JSON_PROPERTY_$_TYPE,
	ExternalMessengerNewMessageRequest.JSON_PROPERTY_ACCOUNT_ID,
	ExternalMessengerNewMessageRequest.JSON_PROPERTY_SERVICE_NAME,
	ExternalMessengerNewMessageRequest.JSON_PROPERTY_CONVERSATION_MESSAGE,
	ExternalMessengerNewMessageRequest.JSON_PROPERTY_RECEIVING_CONTACTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerNewMessageRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERNEWMESSAGEREQUEST("ExternalMessengerNewMessageRequest");

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
			return TypeEnum.EXTERNALMESSENGERNEWMESSAGEREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERNEWMESSAGEREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public static final String JSON_PROPERTY_RECEIVING_CONTACTS = "receivingContacts";
	@JsonProperty(JSON_PROPERTY_RECEIVING_CONTACTS)
	private List<ExternalMessengerContact> receivingContacts = null;

	public ExternalMessengerNewMessageRequest $type(TypeEnum $type) {
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

	public ExternalMessengerNewMessageRequest accountId(String accountId) {
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

	public ExternalMessengerNewMessageRequest serviceName(String serviceName) {
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

	public ExternalMessengerNewMessageRequest conversationMessage(MessageData conversationMessage) {
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

	public ExternalMessengerNewMessageRequest receivingContacts(List<ExternalMessengerContact> receivingContacts) {
		this.receivingContacts = receivingContacts;
		return this;
	}

	public ExternalMessengerNewMessageRequest addReceivingContactsItem(ExternalMessengerContact receivingContactsItem) {
		if (this.receivingContacts == null) {
			this.receivingContacts = new ArrayList<>();
		}
		this.receivingContacts.add(receivingContactsItem);
		return this;
	}

	/**
	 * The contacts that should receive the message
	 * 
	 * @return receivingContacts
	 **/
	@ApiModelProperty(value = "The contacts that should receive the message")
	public List<ExternalMessengerContact> getReceivingContacts() {
		return receivingContacts;
	}

	public void setReceivingContacts(List<ExternalMessengerContact> receivingContacts) {
		this.receivingContacts = receivingContacts;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerNewMessageRequest externalMessengerNewMessageRequest = (ExternalMessengerNewMessageRequest) o;
		return Objects.equals(this.$type, externalMessengerNewMessageRequest.$type) &&
				Objects.equals(this.accountId, externalMessengerNewMessageRequest.accountId) &&
				Objects.equals(this.serviceName, externalMessengerNewMessageRequest.serviceName) &&
				Objects.equals(this.conversationMessage, externalMessengerNewMessageRequest.conversationMessage) &&
				Objects.equals(this.receivingContacts, externalMessengerNewMessageRequest.receivingContacts);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, conversationMessage, receivingContacts);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerNewMessageRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    receivingContacts: ").append(toIndentedString(receivingContacts)).append("\n");
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
