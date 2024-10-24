
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
 * DateTimeParameterValue
 */

@JsonPropertyOrder({
	DateTimeParameterValue.JSON_PROPERTY_$_TYPE,
	DateTimeParameterValue.JSON_PROPERTY_FALLBACK_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DateTimeParameterValue {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DATETIMEPARAMETERVALUE("DateTimeParameterValue");

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
			return TypeEnum.DATETIMEPARAMETERVALUE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DATETIMEPARAMETERVALUE;

	public static final String JSON_PROPERTY_FALLBACK_VALUE = "fallbackValue";
	@JsonProperty(JSON_PROPERTY_FALLBACK_VALUE)
	private String fallbackValue;

	public DateTimeParameterValue $type(TypeEnum $type) {
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

	public DateTimeParameterValue fallbackValue(String fallbackValue) {
		this.fallbackValue = fallbackValue;
		return this;
	}

	/**
	 * Required. &lt;p&gt; Default text. For Cloud API, we always use the fallback value, and we do not attempt to localize using other optional fields. &lt;p&gt;
	 * Alias: fallback_value
	 * 
	 * @return fallbackValue
	 **/
	@ApiModelProperty(value = "Required. <p> Default text. For Cloud API, we always use the fallback value, and we do not attempt to localize using other optional fields. <p> Alias: fallback_value")
	public String getFallbackValue() {
		return fallbackValue;
	}

	public void setFallbackValue(String fallbackValue) {
		this.fallbackValue = fallbackValue;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DateTimeParameterValue dateTimeParameterValue = (DateTimeParameterValue) o;
		return Objects.equals(this.$type, dateTimeParameterValue.$type) &&
				Objects.equals(this.fallbackValue, dateTimeParameterValue.fallbackValue);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, fallbackValue);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DateTimeParameterValue {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    fallbackValue: ").append(toIndentedString(fallbackValue)).append("\n");
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
