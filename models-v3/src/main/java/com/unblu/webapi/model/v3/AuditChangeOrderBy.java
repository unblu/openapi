
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
 * AuditChangeOrderBy
 */

@JsonPropertyOrder({
	AuditChangeOrderBy.JSON_PROPERTY_$_TYPE,
	AuditChangeOrderBy.JSON_PROPERTY_FIELD,
	AuditChangeOrderBy.JSON_PROPERTY_ORDER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuditChangeOrderBy {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AUDITCHANGEORDERBY("AuditChangeOrderBy");

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
			return TypeEnum.AUDITCHANGEORDERBY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AUDITCHANGEORDERBY;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private EAuditChangeOrderByField field;

	public static final String JSON_PROPERTY_ORDER = "order";
	@JsonProperty(JSON_PROPERTY_ORDER)
	private Order order;

	public AuditChangeOrderBy $type(TypeEnum $type) {
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

	public AuditChangeOrderBy field(EAuditChangeOrderByField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public EAuditChangeOrderByField getField() {
		return field;
	}

	public void setField(EAuditChangeOrderByField field) {
		this.field = field;
	}

	public AuditChangeOrderBy order(Order order) {
		this.order = order;
		return this;
	}

	/**
	 * Get order
	 * 
	 * @return order
	 **/
	@ApiModelProperty(value = "")
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuditChangeOrderBy auditChangeOrderBy = (AuditChangeOrderBy) o;
		return Objects.equals(this.$type, auditChangeOrderBy.$type) &&
				Objects.equals(this.field, auditChangeOrderBy.field) &&
				Objects.equals(this.order, auditChangeOrderBy.order);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuditChangeOrderBy {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
