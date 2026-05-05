
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Filter for analytics KPI data queries. &lt;p&gt; Filters KPI records by event timestamp using an &#x60;InRangeTimestampOperator&#x60; to define a time range
 * (in milliseconds since epoch). The filter field is fixed to &#x60;EAnalyticsKpiDataQueryFilterField.EVENT_TIMESTAMP&#x60;.&lt;br&gt;@see
 * AnalyticsKpiDataQuery&lt;br&gt;@see InRangeTimestampOperator
 */
@ApiModel(description = "Filter for analytics KPI data queries. <p> Filters KPI records by event timestamp using an `InRangeTimestampOperator` to define a time range (in milliseconds since epoch). The filter field is fixed to `EAnalyticsKpiDataQueryFilterField.EVENT_TIMESTAMP`.<br>@see AnalyticsKpiDataQuery<br>@see InRangeTimestampOperator")

@JsonPropertyOrder({
	AnalyticsKpiDataQueryFilter.JSON_PROPERTY_$_TYPE,
	AnalyticsKpiDataQueryFilter.JSON_PROPERTY_FIELD,
	AnalyticsKpiDataQueryFilter.JSON_PROPERTY_OPERATOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AnalyticsKpiDataQueryFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ANALYTICSKPIDATAQUERYFILTER("AnalyticsKpiDataQueryFilter");

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
			return TypeEnum.ANALYTICSKPIDATAQUERYFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ANALYTICSKPIDATAQUERYFILTER;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private EAnalyticsKpiDataQueryFilterField field;

	public static final String JSON_PROPERTY_OPERATOR = "operator";
	@JsonProperty(JSON_PROPERTY_OPERATOR)
	private InRangeTimestampOperator operator = null;

	public AnalyticsKpiDataQueryFilter $type(TypeEnum $type) {
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

	public AnalyticsKpiDataQueryFilter field(EAnalyticsKpiDataQueryFilterField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsKpiDataQueryFilterField getField() {
		return field;
	}

	public void setField(EAnalyticsKpiDataQueryFilterField field) {
		this.field = field;
	}

	public AnalyticsKpiDataQueryFilter operator(InRangeTimestampOperator operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * Get operator
	 * 
	 * @return operator
	 **/
	@ApiModelProperty(value = "")
	public InRangeTimestampOperator getOperator() {
		return operator;
	}

	public void setOperator(InRangeTimestampOperator operator) {
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
		AnalyticsKpiDataQueryFilter analyticsKpiDataQueryFilter = (AnalyticsKpiDataQueryFilter) o;
		return Objects.equals(this.$type, analyticsKpiDataQueryFilter.$type) &&
				Objects.equals(this.field, analyticsKpiDataQueryFilter.field) &&
				Objects.equals(this.operator, analyticsKpiDataQueryFilter.operator);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, operator);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AnalyticsKpiDataQueryFilter {\n");
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
