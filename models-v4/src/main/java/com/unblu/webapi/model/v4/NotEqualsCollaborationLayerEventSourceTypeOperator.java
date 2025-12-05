
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
 * NotEqualsCollaborationLayerEventSourceTypeOperator
 */

@JsonPropertyOrder({
	NotEqualsCollaborationLayerEventSourceTypeOperator.JSON_PROPERTY_$_TYPE,
	NotEqualsCollaborationLayerEventSourceTypeOperator.JSON_PROPERTY_TYPE,
	NotEqualsCollaborationLayerEventSourceTypeOperator.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NotEqualsCollaborationLayerEventSourceTypeOperator implements CollaborationLayerEventSourceTypeOperator {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NOTEQUALSCOLLABORATIONLAYEREVENTSOURCETYPEOPERATOR("NotEqualsCollaborationLayerEventSourceTypeOperator");

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
			return TypeEnum.NOTEQUALSCOLLABORATIONLAYEREVENTSOURCETYPEOPERATOR;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NOTEQUALSCOLLABORATIONLAYEREVENTSOURCETYPEOPERATOR;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ECollaborationLayerEventSourceTypeOperatorType type = ECollaborationLayerEventSourceTypeOperatorType.NOT_EQUALS;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private ECollaborationLayerEventSourceType value;

	public NotEqualsCollaborationLayerEventSourceTypeOperator $type(TypeEnum $type) {
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

	public NotEqualsCollaborationLayerEventSourceTypeOperator type(ECollaborationLayerEventSourceTypeOperatorType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public ECollaborationLayerEventSourceTypeOperatorType getType() {
		return type;
	}

	public void setType(ECollaborationLayerEventSourceTypeOperatorType type) {
		this.type = type;
	}

	public NotEqualsCollaborationLayerEventSourceTypeOperator value(ECollaborationLayerEventSourceType value) {
		this.value = value;
		return this;
	}

	/**
	 * Get value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "")
	public ECollaborationLayerEventSourceType getValue() {
		return value;
	}

	public void setValue(ECollaborationLayerEventSourceType value) {
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
		NotEqualsCollaborationLayerEventSourceTypeOperator notEqualsCollaborationLayerEventSourceTypeOperator = (NotEqualsCollaborationLayerEventSourceTypeOperator) o;
		return Objects.equals(this.$type, notEqualsCollaborationLayerEventSourceTypeOperator.$type) &&
				Objects.equals(this.type, notEqualsCollaborationLayerEventSourceTypeOperator.type) &&
				Objects.equals(this.value, notEqualsCollaborationLayerEventSourceTypeOperator.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NotEqualsCollaborationLayerEventSourceTypeOperator {\n");
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
