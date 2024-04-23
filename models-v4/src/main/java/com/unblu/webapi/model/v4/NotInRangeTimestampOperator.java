
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
 * NotInRangeTimestampOperator
 */

@JsonPropertyOrder({
	NotInRangeTimestampOperator.JSON_PROPERTY_$_TYPE,
	NotInRangeTimestampOperator.JSON_PROPERTY_TYPE,
	NotInRangeTimestampOperator.JSON_PROPERTY_MINIMUM,
	NotInRangeTimestampOperator.JSON_PROPERTY_MAXIMUM,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotInRangeTimestampOperator implements TimestampOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTINRANGETIMESTAMPOPERATOR("NotInRangeTimestampOperator");

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
			return TypeEnum.NOTINRANGETIMESTAMPOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTINRANGETIMESTAMPOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETimestampOperatorType type = ETimestampOperatorType.NOT_IN_RANGE;

	public static final String JSON_PROPERTY_MINIMUM = "minimum";
	@JsonProperty(JSON_PROPERTY_MINIMUM)
	private Long minimum;

	public static final String JSON_PROPERTY_MAXIMUM = "maximum";
	@JsonProperty(JSON_PROPERTY_MAXIMUM)
	private Long maximum;

	public NotInRangeTimestampOperator $type(TypeEnum $type) {
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

	public NotInRangeTimestampOperator type(ETimestampOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ETimestampOperatorType getType() {
		return type;
	}

	public void setType(ETimestampOperatorType type) {
		this.type = type;
	}

	public NotInRangeTimestampOperator minimum(Long minimum) {
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

	public NotInRangeTimestampOperator maximum(Long maximum) {
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
		NotInRangeTimestampOperator notInRangeTimestampOperator = (NotInRangeTimestampOperator) o;
		return Objects.equals(this.$type, notInRangeTimestampOperator.$type) &&
				Objects.equals(this.type, notInRangeTimestampOperator.type) &&
				Objects.equals(this.minimum, notInRangeTimestampOperator.minimum) &&
				Objects.equals(this.maximum, notInRangeTimestampOperator.maximum);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, minimum, maximum);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotInRangeTimestampOperator {\n");
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
