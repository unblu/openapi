
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
 * Response from a conversation access interceptor that granted an access, allowing the processing of the message to continue
 */
@ApiModel(description = "Response from a conversation access interceptor that granted an access, allowing the processing of the message to continue")

@JsonPropertyOrder({
	ConversationAccessInterceptorOutboundGrantResponse.JSON_PROPERTY_$_TYPE,
	ConversationAccessInterceptorOutboundGrantResponse.JSON_PROPERTY_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationAccessInterceptorOutboundGrantResponse implements ConversationAccessInterceptorOutboundResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONACCESSINTERCEPTOROUTBOUNDGRANTRESPONSE("ConversationAccessInterceptorOutboundGrantResponse");

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
			return TypeEnum.CONVERSATIONACCESSINTERCEPTOROUTBOUNDGRANTRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONACCESSINTERCEPTOROUTBOUNDGRANTRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EConversationAccessInterceptorOutboundResponseType type = EConversationAccessInterceptorOutboundResponseType.GRANT;

	public ConversationAccessInterceptorOutboundGrantResponse $type(TypeEnum $type) {
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

	public ConversationAccessInterceptorOutboundGrantResponse type(EConversationAccessInterceptorOutboundResponseType type) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationAccessInterceptorOutboundGrantResponse conversationAccessInterceptorOutboundGrantResponse = (ConversationAccessInterceptorOutboundGrantResponse) o;
		return Objects.equals(this.$type, conversationAccessInterceptorOutboundGrantResponse.$type) &&
				Objects.equals(this.type, conversationAccessInterceptorOutboundGrantResponse.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationAccessInterceptorOutboundGrantResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
