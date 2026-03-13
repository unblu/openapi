
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
 * AccountIngressOrderBy
 */

@JsonPropertyOrder({
	AccountIngressOrderBy.JSON_PROPERTY_$_TYPE,
	AccountIngressOrderBy.JSON_PROPERTY_FIELD,
	AccountIngressOrderBy.JSON_PROPERTY_ORDER,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountIngressOrderBy {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTINGRESSORDERBY("AccountIngressOrderBy");

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
			return TypeEnum.ACCOUNTINGRESSORDERBY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTINGRESSORDERBY;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private EAccountIngressOrderByField field;

	public static final String JSON_PROPERTY_ORDER = "order";
	@JsonProperty(JSON_PROPERTY_ORDER)
	private Order order;

	public AccountIngressOrderBy $type(TypeEnum $type) {
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

	public AccountIngressOrderBy field(EAccountIngressOrderByField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public EAccountIngressOrderByField getField() {
		return field;
	}

	public void setField(EAccountIngressOrderByField field) {
		this.field = field;
	}

	public AccountIngressOrderBy order(Order order) {
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
		AccountIngressOrderBy accountIngressOrderBy = (AccountIngressOrderBy) o;
		return Objects.equals(this.$type, accountIngressOrderBy.$type) &&
				Objects.equals(this.field, accountIngressOrderBy.field) &&
				Objects.equals(this.order, accountIngressOrderBy.order);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, order);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountIngressOrderBy {\n");
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
