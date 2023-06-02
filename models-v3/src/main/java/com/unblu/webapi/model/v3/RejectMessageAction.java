
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
 * Action used to reject a message for which approval was requested through a &lt;code&gt;message_interceptor.new_message&lt;/code&gt; webhook.
 */
@ApiModel(description = "Action used to reject a message for which approval was requested through a <code>message_interceptor.new_message</code> webhook.")

@JsonPropertyOrder({
	RejectMessageAction.JSON_PROPERTY_$_TYPE,
	RejectMessageAction.JSON_PROPERTY_TOKEN,
	RejectMessageAction.JSON_PROPERTY_REASON,
	RejectMessageAction.JSON_PROPERTY_SEVERITY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class RejectMessageAction {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		REJECTMESSAGEACTION("RejectMessageAction");

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
			return TypeEnum.REJECTMESSAGEACTION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.REJECTMESSAGEACTION;

	public static final String JSON_PROPERTY_TOKEN = "token";
	@JsonProperty(JSON_PROPERTY_TOKEN)
	private String token;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private String reason;

	public static final String JSON_PROPERTY_SEVERITY = "severity";
	@JsonProperty(JSON_PROPERTY_SEVERITY)
	private ESentRejectionSeverity severity;

	public RejectMessageAction $type(TypeEnum $type) {
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

	public RejectMessageAction token(String token) {
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

	public RejectMessageAction reason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * The reason explaining why the message was rejected. This reason is displayed as-is to end users.
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "The reason explaining why the message was rejected. This reason is displayed as-is to end users.")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public RejectMessageAction severity(ESentRejectionSeverity severity) {
		this.severity = severity;
		return this;
	}

	/**
	 * Get severity
	 * 
	 * @return severity
	 **/
	@ApiModelProperty(value = "")
	public ESentRejectionSeverity getSeverity() {
		return severity;
	}

	public void setSeverity(ESentRejectionSeverity severity) {
		this.severity = severity;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		RejectMessageAction rejectMessageAction = (RejectMessageAction) o;
		return Objects.equals(this.$type, rejectMessageAction.$type) &&
				Objects.equals(this.token, rejectMessageAction.token) &&
				Objects.equals(this.reason, rejectMessageAction.reason) &&
				Objects.equals(this.severity, rejectMessageAction.severity);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, token, reason, severity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class RejectMessageAction {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    token: ").append(toIndentedString(token)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
