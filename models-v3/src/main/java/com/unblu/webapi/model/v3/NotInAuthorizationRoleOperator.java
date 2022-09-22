
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * NotInAuthorizationRoleOperator
 */

@JsonPropertyOrder({
	NotInAuthorizationRoleOperator.JSON_PROPERTY_$_TYPE,
	NotInAuthorizationRoleOperator.JSON_PROPERTY_TYPE,
	NotInAuthorizationRoleOperator.JSON_PROPERTY_VALUES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotInAuthorizationRoleOperator implements AuthorizationRoleOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTINAUTHORIZATIONROLEOPERATOR("NotInAuthorizationRoleOperator");

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
			return TypeEnum.NOTINAUTHORIZATIONROLEOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTINAUTHORIZATIONROLEOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAuthorizationRoleOperatorType type = EAuthorizationRoleOperatorType.NOT_IN;

	public static final String JSON_PROPERTY_VALUES = "values";
	@JsonProperty(JSON_PROPERTY_VALUES)
	private List<EAuthorizationRole> values = null;

	public NotInAuthorizationRoleOperator $type(TypeEnum $type) {
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

	public NotInAuthorizationRoleOperator type(EAuthorizationRoleOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EAuthorizationRoleOperatorType getType() {
		return type;
	}

	public void setType(EAuthorizationRoleOperatorType type) {
		this.type = type;
	}

	public NotInAuthorizationRoleOperator values(List<EAuthorizationRole> values) {
		this.values = values;
		return this;
	}

	public NotInAuthorizationRoleOperator addValuesItem(EAuthorizationRole valuesItem) {
		if (this.values == null) {
			this.values = new ArrayList<>();
		}
		this.values.add(valuesItem);
		return this;
	}

	/**
	 * Get values
	 * 
	 * @return values
	 **/
	@ApiModelProperty(value = "")
	public List<EAuthorizationRole> getValues() {
		return values;
	}

	public void setValues(List<EAuthorizationRole> values) {
		this.values = values;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NotInAuthorizationRoleOperator notInAuthorizationRoleOperator = (NotInAuthorizationRoleOperator) o;
		return Objects.equals(this.$type, notInAuthorizationRoleOperator.$type) &&
				Objects.equals(this.type, notInAuthorizationRoleOperator.type) &&
				Objects.equals(this.values, notInAuthorizationRoleOperator.values);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, values);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotInAuthorizationRoleOperator {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
