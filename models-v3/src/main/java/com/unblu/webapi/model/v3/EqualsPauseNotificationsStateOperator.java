
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
 * EqualsPauseNotificationsStateOperator
 */

@JsonPropertyOrder({
	EqualsPauseNotificationsStateOperator.JSON_PROPERTY_$_TYPE,
	EqualsPauseNotificationsStateOperator.JSON_PROPERTY_TYPE,
	EqualsPauseNotificationsStateOperator.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class EqualsPauseNotificationsStateOperator implements PauseNotificationsStateOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EQUALSPAUSENOTIFICATIONSSTATEOPERATOR("EqualsPauseNotificationsStateOperator");

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
			return TypeEnum.EQUALSPAUSENOTIFICATIONSSTATEOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EQUALSPAUSENOTIFICATIONSSTATEOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPauseNotificationsStateOperatorType type = EPauseNotificationsStateOperatorType.EQUALS;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private EPauseNotificationsState value;

	public EqualsPauseNotificationsStateOperator $type(TypeEnum $type) {
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

	public EqualsPauseNotificationsStateOperator type(EPauseNotificationsStateOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPauseNotificationsStateOperatorType getType() {
		return type;
	}

	public void setType(EPauseNotificationsStateOperatorType type) {
		this.type = type;
	}

	public EqualsPauseNotificationsStateOperator value(EPauseNotificationsState value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public EPauseNotificationsState getValue() {
		return value;
	}

	public void setValue(EPauseNotificationsState value) {
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
		EqualsPauseNotificationsStateOperator equalsPauseNotificationsStateOperator = (EqualsPauseNotificationsStateOperator) o;
		return Objects.equals(this.$type, equalsPauseNotificationsStateOperator.$type) &&
				Objects.equals(this.type, equalsPauseNotificationsStateOperator.type) &&
				Objects.equals(this.value, equalsPauseNotificationsStateOperator.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EqualsPauseNotificationsStateOperator {\n");
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
