
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
 * Sent to an external message interceptor to decide whether a new message is allowed
 */
@ApiModel(description = "Sent to an external message interceptor to decide whether a new message is allowed")

@JsonPropertyOrder({
	InterceptorNewMessageRequest.JSON_PROPERTY_$_TYPE,
	InterceptorNewMessageRequest.JSON_PROPERTY_ACCOUNT_ID,
	InterceptorNewMessageRequest.JSON_PROPERTY_SERVICE_NAME,
	InterceptorNewMessageRequest.JSON_PROPERTY_CONVERSATION_MESSAGE,
	InterceptorNewMessageRequest.JSON_PROPERTY_CONVERSATION_LANGUAGE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class InterceptorNewMessageRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		INTERCEPTORNEWMESSAGEREQUEST("InterceptorNewMessageRequest");

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
			return TypeEnum.INTERCEPTORNEWMESSAGEREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.INTERCEPTORNEWMESSAGEREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_CONVERSATION_MESSAGE = "conversationMessage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_MESSAGE)
	private MessageData conversationMessage = null;

	public static final String JSON_PROPERTY_CONVERSATION_LANGUAGE = "conversationLanguage";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_LANGUAGE)
	private String conversationLanguage;

	public InterceptorNewMessageRequest $type(TypeEnum $type) {
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

	public InterceptorNewMessageRequest accountId(String accountId) {
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

	public InterceptorNewMessageRequest serviceName(String serviceName) {
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

	public InterceptorNewMessageRequest conversationMessage(MessageData conversationMessage) {
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

	public InterceptorNewMessageRequest conversationLanguage(String conversationLanguage) {
		this.conversationLanguage = conversationLanguage;
		return this;
	}

	/**
	 * The language of the conversation
	 * 
	 * @return conversationLanguage
	 **/
	@ApiModelProperty(value = "The language of the conversation")
	public String getConversationLanguage() {
		return conversationLanguage;
	}

	public void setConversationLanguage(String conversationLanguage) {
		this.conversationLanguage = conversationLanguage;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		InterceptorNewMessageRequest interceptorNewMessageRequest = (InterceptorNewMessageRequest) o;
		return Objects.equals(this.$type, interceptorNewMessageRequest.$type) &&
				Objects.equals(this.accountId, interceptorNewMessageRequest.accountId) &&
				Objects.equals(this.serviceName, interceptorNewMessageRequest.serviceName) &&
				Objects.equals(this.conversationMessage, interceptorNewMessageRequest.conversationMessage) &&
				Objects.equals(this.conversationLanguage, interceptorNewMessageRequest.conversationLanguage);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, conversationMessage, conversationLanguage);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class InterceptorNewMessageRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    conversationMessage: ").append(toIndentedString(conversationMessage)).append("\n");
		sb.append("    conversationLanguage: ").append(toIndentedString(conversationLanguage)).append("\n");
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
