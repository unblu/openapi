
package com.unblu.webapi.model.v3;

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
 * Action used to approve a message for which approval was requested through a &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook.
 */
@ApiModel(description = "Action used to approve a message for which approval was requested through a <code>message_interceptor.new_message</code> webhook.")

@JsonPropertyOrder({
	ApproveMessageAction.JSON_PROPERTY_$_TYPE,
	ApproveMessageAction.JSON_PROPERTY_TOKEN,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ApproveMessageAction {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		APPROVEMESSAGEACTION("ApproveMessageAction");

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
			return TypeEnum.APPROVEMESSAGEACTION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.APPROVEMESSAGEACTION;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public ApproveMessageAction $type(TypeEnum $type) {
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

	public ApproveMessageAction token(String token) {
		this.token = token;
		return this;
	}

	/**
	 * The token used to identify the message this action applies to. The token is received when approval is requested through a
	 * &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook. Each message approval request contains a unique token.
	 * 
	 * @return token
	 **/
	@ApiModelProperty(value = "The token used to identify the message this action applies to. The token is received when approval is requested through a <code>message_interceptor.new_message</code> webhook. Each message approval request contains a unique token.")
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ApproveMessageAction approveMessageAction = (ApproveMessageAction) o;
		return Objects.equals(this.$type, approveMessageAction.$type) &&
				Objects.equals(this.token, approveMessageAction.token);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, token);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ApproveMessageAction {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
