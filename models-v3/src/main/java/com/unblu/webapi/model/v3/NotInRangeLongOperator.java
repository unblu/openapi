
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * NotInRangeLongOperator
 */

@JsonPropertyOrder({
	NotInRangeLongOperator.JSON_PROPERTY_$_TYPE,
	NotInRangeLongOperator.JSON_PROPERTY_TYPE,
	NotInRangeLongOperator.JSON_PROPERTY_MINIMUM,
	NotInRangeLongOperator.JSON_PROPERTY_MAXIMUM,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotInRangeLongOperator implements LongOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTINRANGELONGOPERATOR("NotInRangeLongOperator");

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
			return TypeEnum.NOTINRANGELONGOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTINRANGELONGOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ELongOperatorType type = ELongOperatorType.NOT_IN_RANGE;

	public static final String JSON_PROPERTY_MINIMUM = "minimum";
	@JsonProperty(JSON_PROPERTY_MINIMUM)
	private Long minimum;

	public static final String JSON_PROPERTY_MAXIMUM = "maximum";
	@JsonProperty(JSON_PROPERTY_MAXIMUM)
	private Long maximum;

	public NotInRangeLongOperator $type(TypeEnum $type) {
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

	public NotInRangeLongOperator type(ELongOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ELongOperatorType getType() {
		return type;
	}

	public void setType(ELongOperatorType type) {
		this.type = type;
	}

	public NotInRangeLongOperator minimum(Long minimum) {
		this.minimum = minimum;
		return this;
	}

	/**
	 * Get minimum
	 * 
	 * @return minimum
	 **/
	@ApiModelProperty(value = "")
	public Long getMinimum() {
		return minimum;
	}

	public void setMinimum(Long minimum) {
		this.minimum = minimum;
	}

	public NotInRangeLongOperator maximum(Long maximum) {
		this.maximum = maximum;
		return this;
	}

	/**
	 * Get maximum
	 * 
	 * @return maximum
	 **/
	@ApiModelProperty(value = "")
	public Long getMaximum() {
		return maximum;
	}

	public void setMaximum(Long maximum) {
		this.maximum = maximum;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotInRangeLongOperator notInRangeLongOperator = (NotInRangeLongOperator) o;
		return Objects.equals(this.$type, notInRangeLongOperator.$type) &&
				Objects.equals(this.type, notInRangeLongOperator.type) &&
				Objects.equals(this.minimum, notInRangeLongOperator.minimum) &&
				Objects.equals(this.maximum, notInRangeLongOperator.maximum);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, minimum, maximum);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotInRangeLongOperator {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
		sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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
