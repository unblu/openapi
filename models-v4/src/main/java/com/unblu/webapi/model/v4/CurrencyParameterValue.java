
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
 * CurrencyParameterValue
 */

@JsonPropertyOrder({
	CurrencyParameterValue.JSON_PROPERTY_$_TYPE,
	CurrencyParameterValue.JSON_PROPERTY_FALLBACK_VALUE,
	CurrencyParameterValue.JSON_PROPERTY_CODE,
	CurrencyParameterValue.JSON_PROPERTY_AMOUNT1000,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CurrencyParameterValue {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CURRENCYPARAMETERVALUE("CurrencyParameterValue");

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
			return TypeEnum.CURRENCYPARAMETERVALUE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CURRENCYPARAMETERVALUE;

	public static final String JSON_PROPERTY_FALLBACK_VALUE = "fallbackValue";
	@JsonProperty(JSON_PROPERTY_FALLBACK_VALUE)
	private String fallbackValue;

	public static final String JSON_PROPERTY_CODE = "code";
	@JsonProperty(JSON_PROPERTY_CODE)
	private ECurrencyCode code;

	public static final String JSON_PROPERTY_AMOUNT1000 = "amount1000";
	@JsonProperty(JSON_PROPERTY_AMOUNT1000)
	private Double amount1000;

	public CurrencyParameterValue $type(TypeEnum $type) {
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

	public CurrencyParameterValue fallbackValue(String fallbackValue) {
		this.fallbackValue = fallbackValue;
		return this;
	}

	/**
	 * Required. &lt;p&gt; Default text if localization fails. &lt;p&gt; Alias: fallback_value
	 * 
	 * @return fallbackValue
	 **/
	@ApiModelProperty(value = "Required. <p> Default text if localization fails. <p> Alias: fallback_value")
	public String getFallbackValue() {
		return fallbackValue;
	}

	public void setFallbackValue(String fallbackValue) {
		this.fallbackValue = fallbackValue;
	}

	public CurrencyParameterValue code(ECurrencyCode code) {
		this.code = code;
		return this;
	}

	/**
	 * Get code
	 * 
	 * @return code
	 **/
	@ApiModelProperty(value = "")
	public ECurrencyCode getCode() {
		return code;
	}

	public void setCode(ECurrencyCode code) {
		this.code = code;
	}

	public CurrencyParameterValue amount1000(Double amount1000) {
		this.amount1000 = amount1000;
		return this;
	}

	/**
	 * Required. &lt;p&gt; Amount multiplied by 1000. &lt;p&gt; Alias: amount_1000
	 * 
	 * @return amount1000
	 **/
	@ApiModelProperty(value = "Required. <p> Amount multiplied by 1000. <p> Alias: amount_1000")
	public Double getAmount1000() {
		return amount1000;
	}

	public void setAmount1000(Double amount1000) {
		this.amount1000 = amount1000;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CurrencyParameterValue currencyParameterValue = (CurrencyParameterValue) o;
		return Objects.equals(this.$type, currencyParameterValue.$type) &&
				Objects.equals(this.fallbackValue, currencyParameterValue.fallbackValue) &&
				Objects.equals(this.code, currencyParameterValue.code) &&
				Objects.equals(this.amount1000, currencyParameterValue.amount1000);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, fallbackValue, code, amount1000);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CurrencyParameterValue {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    fallbackValue: ").append(toIndentedString(fallbackValue)).append("\n");
		sb.append("    code: ").append(toIndentedString(code)).append("\n");
		sb.append("    amount1000: ").append(toIndentedString(amount1000)).append("\n");
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
