
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
 * Response of a conversation access interceptor which rejected access to a conversation with a reason
 */
@ApiModel(description = "Response of a conversation access interceptor which rejected access to a conversation with a reason")

@JsonPropertyOrder({
	ConversationAccessInterceptorOutboundDenyResponse.JSON_PROPERTY_$_TYPE,
	ConversationAccessInterceptorOutboundDenyResponse.JSON_PROPERTY_TYPE,
	ConversationAccessInterceptorOutboundDenyResponse.JSON_PROPERTY_REASON,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationAccessInterceptorOutboundDenyResponse implements ConversationAccessInterceptorOutboundResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONACCESSINTERCEPTOROUTBOUNDDENYRESPONSE("ConversationAccessInterceptorOutboundDenyResponse");

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
			return TypeEnum.CONVERSATIONACCESSINTERCEPTOROUTBOUNDDENYRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONACCESSINTERCEPTOROUTBOUNDDENYRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EConversationAccessInterceptorOutboundResponseType type = EConversationAccessInterceptorOutboundResponseType.DENY;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private String reason;

	public ConversationAccessInterceptorOutboundDenyResponse $type(TypeEnum $type) {
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

	public ConversationAccessInterceptorOutboundDenyResponse type(EConversationAccessInterceptorOutboundResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EConversationAccessInterceptorOutboundResponseType getType() {
		return type;
	}

	public void setType(EConversationAccessInterceptorOutboundResponseType type) {
		this.type = type;
	}

	public ConversationAccessInterceptorOutboundDenyResponse reason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Mandatory field. Holds the message displayed to the rejected person trying to get access to a conversation
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "Mandatory field. Holds the message displayed to the rejected person trying to get access to a conversation")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationAccessInterceptorOutboundDenyResponse conversationAccessInterceptorOutboundDenyResponse = (ConversationAccessInterceptorOutboundDenyResponse) o;
		return Objects.equals(this.$type, conversationAccessInterceptorOutboundDenyResponse.$type) &&
				Objects.equals(this.type, conversationAccessInterceptorOutboundDenyResponse.type) &&
				Objects.equals(this.reason, conversationAccessInterceptorOutboundDenyResponse.reason);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, reason);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationAccessInterceptorOutboundDenyResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
