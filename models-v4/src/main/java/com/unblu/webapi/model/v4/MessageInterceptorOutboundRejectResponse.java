
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
 * Response of an external message interceptor which rejected a nessage with a reason and severity
 */
@ApiModel(description = "Response of an external message interceptor which rejected a nessage with a reason and severity")

@JsonPropertyOrder({
	MessageInterceptorOutboundRejectResponse.JSON_PROPERTY_$_TYPE,
	MessageInterceptorOutboundRejectResponse.JSON_PROPERTY_TYPE,
	MessageInterceptorOutboundRejectResponse.JSON_PROPERTY_REASON,
	MessageInterceptorOutboundRejectResponse.JSON_PROPERTY_SEVERITY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MessageInterceptorOutboundRejectResponse implements MessageInterceptorOutboundResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MESSAGEINTERCEPTOROUTBOUNDREJECTRESPONSE("MessageInterceptorOutboundRejectResponse");

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
			return TypeEnum.MESSAGEINTERCEPTOROUTBOUNDREJECTRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MESSAGEINTERCEPTOROUTBOUNDREJECTRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EMessageInterceptorOutboundResponseType type = EMessageInterceptorOutboundResponseType.REJECT;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private String reason;

	public static final String JSON_PROPERTY_SEVERITY = "severity";
	@JsonProperty(JSON_PROPERTY_SEVERITY)
	private ESentRejectionSeverity severity;

	public MessageInterceptorOutboundRejectResponse $type(TypeEnum $type) {
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

	public MessageInterceptorOutboundRejectResponse type(EMessageInterceptorOutboundResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EMessageInterceptorOutboundResponseType getType() {
		return type;
	}

	public void setType(EMessageInterceptorOutboundResponseType type) {
		this.type = type;
	}

	public MessageInterceptorOutboundRejectResponse reason(String reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Mandatory field. Holds the message displayed to the sender of the rejected message
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "Mandatory field. Holds the message displayed to the sender of the rejected message")
	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public MessageInterceptorOutboundRejectResponse severity(ESentRejectionSeverity severity) {
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
		MessageInterceptorOutboundRejectResponse messageInterceptorOutboundRejectResponse = (MessageInterceptorOutboundRejectResponse) o;
		return Objects.equals(this.$type, messageInterceptorOutboundRejectResponse.$type) &&
				Objects.equals(this.type, messageInterceptorOutboundRejectResponse.type) &&
				Objects.equals(this.reason, messageInterceptorOutboundRejectResponse.reason) &&
				Objects.equals(this.severity, messageInterceptorOutboundRejectResponse.severity);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, reason, severity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MessageInterceptorOutboundRejectResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
