
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
 * WhatsAppTemplateCurrencyParameter
 */

@JsonPropertyOrder({
	WhatsAppTemplateCurrencyParameter.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplateCurrencyParameter.JSON_PROPERTY_TYPE,
	WhatsAppTemplateCurrencyParameter.JSON_PROPERTY_CURRENCY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplateCurrencyParameter implements WhatsAppTemplateParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATECURRENCYPARAMETER("WhatsAppTemplateCurrencyParameter");

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
			return TypeEnum.WHATSAPPTEMPLATECURRENCYPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATECURRENCYPARAMETER;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETemplateComponentParameterType type = ETemplateComponentParameterType.CURRENCY;

	public static final String JSON_PROPERTY_CURRENCY = "currency";
	@JsonProperty(JSON_PROPERTY_CURRENCY)
	private CurrencyParameterValue currency = null;

	public WhatsAppTemplateCurrencyParameter $type(TypeEnum $type) {
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

	public WhatsAppTemplateCurrencyParameter type(ETemplateComponentParameterType type) {
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

	public WhatsAppTemplateCurrencyParameter currency(CurrencyParameterValue currency) {
		this.currency = currency;
		return this;
	}

	/**
	 * Get currency
	 * 
	 * @return currency
	 **/
	@ApiModelProperty(value = "")
	public CurrencyParameterValue getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyParameterValue currency) {
		this.currency = currency;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplateCurrencyParameter whatsAppTemplateCurrencyParameter = (WhatsAppTemplateCurrencyParameter) o;
		return Objects.equals(this.$type, whatsAppTemplateCurrencyParameter.$type) &&
				Objects.equals(this.type, whatsAppTemplateCurrencyParameter.type) &&
				Objects.equals(this.currency, whatsAppTemplateCurrencyParameter.currency);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, currency);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplateCurrencyParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
