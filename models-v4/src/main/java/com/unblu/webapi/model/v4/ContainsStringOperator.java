
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
 * ContainsStringOperator
 */

@JsonPropertyOrder({
	ContainsStringOperator.JSON_PROPERTY_$_TYPE,
	ContainsStringOperator.JSON_PROPERTY_TYPE,
	ContainsStringOperator.JSON_PROPERTY_VALUE,
	ContainsStringOperator.JSON_PROPERTY_CASE_SENSITIVE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ContainsStringOperator implements StringOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONTAINSSTRINGOPERATOR("ContainsStringOperator");

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
			return TypeEnum.CONTAINSSTRINGOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONTAINSSTRINGOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EStringOperatorType type = EStringOperatorType.CONTAINS;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public static final String JSON_PROPERTY_CASE_SENSITIVE = "caseSensitive";
	@JsonProperty(JSON_PROPERTY_CASE_SENSITIVE)
	private Boolean caseSensitive;

	public ContainsStringOperator $type(TypeEnum $type) {
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

	public ContainsStringOperator type(EStringOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EStringOperatorType getType() {
		return type;
	}

	public void setType(EStringOperatorType type) {
		this.type = type;
	}

	public ContainsStringOperator value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * The value to check if it is contained within the searched field. Mandatory.
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "The value to check if it is contained within the searched field. Mandatory.")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ContainsStringOperator caseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
		return this;
	}

	/**
	 * Whether the search should be case sensitive. Optional, false if not provided.
	 * 
	 * @return caseSensitive
	 **/
	@ApiModelProperty(value = "Whether the search should be case sensitive. Optional, false if not provided.")
	public Boolean isCaseSensitive() {
		return caseSensitive;
	}

	public void setCaseSensitive(Boolean caseSensitive) {
		this.caseSensitive = caseSensitive;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ContainsStringOperator containsStringOperator = (ContainsStringOperator) o;
		return Objects.equals(this.$type, containsStringOperator.$type) &&
				Objects.equals(this.type, containsStringOperator.type) &&
				Objects.equals(this.value, containsStringOperator.value) &&
				Objects.equals(this.caseSensitive, containsStringOperator.caseSensitive);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, value, caseSensitive);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ContainsStringOperator {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
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
