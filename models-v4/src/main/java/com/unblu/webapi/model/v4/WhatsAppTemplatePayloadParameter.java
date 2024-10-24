
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * WhatsAppTemplatePayloadParameter
 */

@JsonPropertyOrder({
	WhatsAppTemplatePayloadParameter.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplatePayloadParameter.JSON_PROPERTY_TYPE,
	WhatsAppTemplatePayloadParameter.JSON_PROPERTY_PAYLOAD,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplatePayloadParameter implements WhatsAppTemplateParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATEPAYLOADPARAMETER("WhatsAppTemplatePayloadParameter");

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
			return TypeEnum.WHATSAPPTEMPLATEPAYLOADPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATEPAYLOADPARAMETER;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETemplateComponentParameterType type = ETemplateComponentParameterType.PAYLOAD;

	public static final String JSON_PROPERTY_PAYLOAD = "payload";
	@JsonProperty(JSON_PROPERTY_PAYLOAD)
	private String payload;

	public WhatsAppTemplatePayloadParameter $type(TypeEnum $type) {
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

	public WhatsAppTemplatePayloadParameter type(ETemplateComponentParameterType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ETemplateComponentParameterType getType() {
		return type;
	}

	public void setType(ETemplateComponentParameterType type) {
		this.type = type;
	}

	public WhatsAppTemplatePayloadParameter payload(String payload) {
		this.payload = payload;
		return this;
	}

	/**
	 * Payload value of the parameter
	 * 
	 * @return payload
	 **/
	@ApiModelProperty(value = "Payload value of the parameter")
	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplatePayloadParameter whatsAppTemplatePayloadParameter = (WhatsAppTemplatePayloadParameter) o;
		return Objects.equals(this.$type, whatsAppTemplatePayloadParameter.$type) &&
				Objects.equals(this.type, whatsAppTemplatePayloadParameter.type) &&
				Objects.equals(this.payload, whatsAppTemplatePayloadParameter.payload);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, payload);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplatePayloadParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
