
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
 * LowerThanOrNullTimestampOperator
 */

@JsonPropertyOrder({
	LowerThanOrNullTimestampOperator.JSON_PROPERTY_$_TYPE,
	LowerThanOrNullTimestampOperator.JSON_PROPERTY_TYPE,
	LowerThanOrNullTimestampOperator.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LowerThanOrNullTimestampOperator implements TimestampOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LOWERTHANORNULLTIMESTAMPOPERATOR("LowerThanOrNullTimestampOperator");

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
			return TypeEnum.LOWERTHANORNULLTIMESTAMPOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LOWERTHANORNULLTIMESTAMPOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETimestampOperatorType type = ETimestampOperatorType.LOWER_THAN_OR_NULL;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private Long value;

	public LowerThanOrNullTimestampOperator $type(TypeEnum $type) {
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

	public LowerThanOrNullTimestampOperator type(ETimestampOperatorType type) {
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

	public LowerThanOrNullTimestampOperator value(Long value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LowerThanOrNullTimestampOperator lowerThanOrNullTimestampOperator = (LowerThanOrNullTimestampOperator) o;
		return Objects.equals(this.$type, lowerThanOrNullTimestampOperator.$type) &&
				Objects.equals(this.type, lowerThanOrNullTimestampOperator.type) &&
				Objects.equals(this.value, lowerThanOrNullTimestampOperator.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LowerThanOrNullTimestampOperator {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
