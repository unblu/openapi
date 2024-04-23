
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
 * Outbound request sent when a conversation for an external messenger should be created. The conversation is created on the Unblu Collaboration Server for a
 * specific &#x60;ExternalMessengerContact&#x60; and, if necessary, in the external messenger. &lt;p&gt; The request contains information about to create a
 * whole conversation.&lt;br&gt; The receiving endpoint can then decided if some existing conversation should be used or a new conversation with that data
 * should be created.
 */
@ApiModel(description = "Outbound request sent when a conversation for an external messenger should be created. The conversation is created on the Unblu Collaboration Server for a specific `ExternalMessengerContact` and, if necessary, in the external messenger. <p> The request contains information about to create a whole conversation.<br> The receiving endpoint can then decided if some existing conversation should be used or a new conversation with that data should be created.")

@JsonPropertyOrder({
	ExternalMessengerCreateConversationRequest.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateConversationRequest.JSON_PROPERTY_ACCOUNT_ID,
	ExternalMessengerCreateConversationRequest.JSON_PROPERTY_SERVICE_NAME,
	ExternalMessengerCreateConversationRequest.JSON_PROPERTY_CREATION_DATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateConversationRequest {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONVERSATIONREQUEST("ExternalMessengerCreateConversationRequest");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONREQUEST;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONREQUEST;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_SERVICE_NAME = "serviceName";
	@JsonProperty(JSON_PROPERTY_SERVICE_NAME)
	private String serviceName;

	public static final String JSON_PROPERTY_CREATION_DATA = "creationData";
	@JsonProperty(JSON_PROPERTY_CREATION_DATA)
	private ConversationCreationData creationData = null;

	public ExternalMessengerCreateConversationRequest $type(TypeEnum $type) {
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

	public ExternalMessengerCreateConversationRequest accountId(String accountId) {
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

	public ExternalMessengerCreateConversationRequest serviceName(String serviceName) {
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

	public ExternalMessengerCreateConversationRequest creationData(ConversationCreationData creationData) {
		this.creationData = creationData;
		return this;
	}

	/**
	 * Get creationData
	 * 
	 * @return creationData
	 **/
	@ApiModelProperty(value = "")
	public ConversationCreationData getCreationData() {
		return creationData;
	}

	public void setCreationData(ConversationCreationData creationData) {
		this.creationData = creationData;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateConversationRequest externalMessengerCreateConversationRequest = (ExternalMessengerCreateConversationRequest) o;
		return Objects.equals(this.$type, externalMessengerCreateConversationRequest.$type) &&
				Objects.equals(this.accountId, externalMessengerCreateConversationRequest.accountId) &&
				Objects.equals(this.serviceName, externalMessengerCreateConversationRequest.serviceName) &&
				Objects.equals(this.creationData, externalMessengerCreateConversationRequest.creationData);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, serviceName, creationData);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateConversationRequest {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
		sb.append("    creationData: ").append(toIndentedString(creationData)).append("\n");
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
