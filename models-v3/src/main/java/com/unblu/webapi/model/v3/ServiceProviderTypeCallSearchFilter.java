
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
 * ServiceProviderTypeCallSearchFilter
 */

@JsonPropertyOrder({
	ServiceProviderTypeCallSearchFilter.JSON_PROPERTY_$_TYPE,
	ServiceProviderTypeCallSearchFilter.JSON_PROPERTY_FIELD,
	ServiceProviderTypeCallSearchFilter.JSON_PROPERTY_OPERATOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServiceProviderTypeCallSearchFilter implements CallSearchFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICEPROVIDERTYPECALLSEARCHFILTER("ServiceProviderTypeCallSearchFilter");

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
			return TypeEnum.SERVICEPROVIDERTYPECALLSEARCHFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICEPROVIDERTYPECALLSEARCHFILTER;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private ECallSearchFilterField field = ECallSearchFilterField.SERVICE_PROVIDER_TYPE;

	public static final String JSON_PROPERTY_OPERATOR = "operator";
	@JsonProperty(JSON_PROPERTY_OPERATOR)
	private CallServiceProviderOperator operator = null;

	public ServiceProviderTypeCallSearchFilter $type(TypeEnum $type) {
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

	public ServiceProviderTypeCallSearchFilter field(ECallSearchFilterField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public ECallSearchFilterField getField() {
		return field;
	}

	public void setField(ECallSearchFilterField field) {
		this.field = field;
	}

	public ServiceProviderTypeCallSearchFilter operator(CallServiceProviderOperator operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * Get operator
	 * 
	 * @return operator
	 **/
	@ApiModelProperty(value = "")
	public CallServiceProviderOperator getOperator() {
		return operator;
	}

	public void setOperator(CallServiceProviderOperator operator) {
		this.operator = operator;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServiceProviderTypeCallSearchFilter serviceProviderTypeCallSearchFilter = (ServiceProviderTypeCallSearchFilter) o;
		return Objects.equals(this.$type, serviceProviderTypeCallSearchFilter.$type) &&
				Objects.equals(this.field, serviceProviderTypeCallSearchFilter.field) &&
				Objects.equals(this.operator, serviceProviderTypeCallSearchFilter.operator);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, operator);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceProviderTypeCallSearchFilter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
