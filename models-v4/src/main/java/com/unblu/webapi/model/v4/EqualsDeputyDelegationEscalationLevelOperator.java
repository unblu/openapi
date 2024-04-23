
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
 * EqualsDeputyDelegationEscalationLevelOperator
 */

@JsonPropertyOrder({
	EqualsDeputyDelegationEscalationLevelOperator.JSON_PROPERTY_$_TYPE,
	EqualsDeputyDelegationEscalationLevelOperator.JSON_PROPERTY_TYPE,
	EqualsDeputyDelegationEscalationLevelOperator.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class EqualsDeputyDelegationEscalationLevelOperator implements DeputyDelegationEscalationLevelOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EQUALSDEPUTYDELEGATIONESCALATIONLEVELOPERATOR("EqualsDeputyDelegationEscalationLevelOperator");

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
			return TypeEnum.EQUALSDEPUTYDELEGATIONESCALATIONLEVELOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EQUALSDEPUTYDELEGATIONESCALATIONLEVELOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EDeputyDelegationEscalationLevelOperatorType type = EDeputyDelegationEscalationLevelOperatorType.EQUALS;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private EDeputyDelegationEscalationLevel value;

	public EqualsDeputyDelegationEscalationLevelOperator $type(TypeEnum $type) {
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

	public EqualsDeputyDelegationEscalationLevelOperator type(EDeputyDelegationEscalationLevelOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EDeputyDelegationEscalationLevelOperatorType getType() {
		return type;
	}

	public void setType(EDeputyDelegationEscalationLevelOperatorType type) {
		this.type = type;
	}

	public EqualsDeputyDelegationEscalationLevelOperator value(EDeputyDelegationEscalationLevel value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public EDeputyDelegationEscalationLevel getValue() {
		return value;
	}

	public void setValue(EDeputyDelegationEscalationLevel value) {
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
		EqualsDeputyDelegationEscalationLevelOperator equalsDeputyDelegationEscalationLevelOperator = (EqualsDeputyDelegationEscalationLevelOperator) o;
		return Objects.equals(this.$type, equalsDeputyDelegationEscalationLevelOperator.$type) &&
				Objects.equals(this.type, equalsDeputyDelegationEscalationLevelOperator.type) &&
				Objects.equals(this.value, equalsDeputyDelegationEscalationLevelOperator.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EqualsDeputyDelegationEscalationLevelOperator {\n");
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
