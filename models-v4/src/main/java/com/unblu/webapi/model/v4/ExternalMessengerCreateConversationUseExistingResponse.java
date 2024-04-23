
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
 * Success response to an &#x60;ExternalMessengerCreateConversationRequest&#x60; request. &lt;p&gt; The response must contain the ID of the conversation on the
 * Collaboration Server. It still has to match the data from the creation request.
 */
@ApiModel(description = "Success response to an `ExternalMessengerCreateConversationRequest` request. <p> The response must contain the ID of the conversation on the Collaboration Server. It still has to match the data from the creation request.")

@JsonPropertyOrder({
	ExternalMessengerCreateConversationUseExistingResponse.JSON_PROPERTY_$_TYPE,
	ExternalMessengerCreateConversationUseExistingResponse.JSON_PROPERTY_TYPE,
	ExternalMessengerCreateConversationUseExistingResponse.JSON_PROPERTY_CONVERSATION_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ExternalMessengerCreateConversationUseExistingResponse implements ExternalMessengerCreateConversationResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EXTERNALMESSENGERCREATECONVERSATIONUSEEXISTINGRESPONSE("ExternalMessengerCreateConversationUseExistingResponse");

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
			return TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONUSEEXISTINGRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EXTERNALMESSENGERCREATECONVERSATIONUSEEXISTINGRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EExternalMessengerConversationCreationResponseType type = EExternalMessengerConversationCreationResponseType.USE_EXISTING;

	public static final String JSON_PROPERTY_CONVERSATION_ID = "conversationId";
	@JsonProperty(JSON_PROPERTY_CONVERSATION_ID)
	private String conversationId;

	public ExternalMessengerCreateConversationUseExistingResponse $type(TypeEnum $type) {
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

	public ExternalMessengerCreateConversationUseExistingResponse type(EExternalMessengerConversationCreationResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EExternalMessengerConversationCreationResponseType getType() {
		return type;
	}

	public void setType(EExternalMessengerConversationCreationResponseType type) {
		this.type = type;
	}

	public ExternalMessengerCreateConversationUseExistingResponse conversationId(String conversationId) {
		this.conversationId = conversationId;
		return this;
	}

	/**
	 * The ID of the conversation created when processing the &#x60;ExternalMessengerCreateConversationRequest&#x60; request
	 * 
	 * @return conversationId
	 **/
	@ApiModelProperty(value = "The ID of the conversation created when processing the `ExternalMessengerCreateConversationRequest` request")
	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ExternalMessengerCreateConversationUseExistingResponse externalMessengerCreateConversationUseExistingResponse = (ExternalMessengerCreateConversationUseExistingResponse) o;
		return Objects.equals(this.$type, externalMessengerCreateConversationUseExistingResponse.$type) &&
				Objects.equals(this.type, externalMessengerCreateConversationUseExistingResponse.type) &&
				Objects.equals(this.conversationId, externalMessengerCreateConversationUseExistingResponse.conversationId);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, conversationId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ExternalMessengerCreateConversationUseExistingResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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
