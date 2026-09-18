
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * A label condition on analytics KPI data: the entity named by &#x60;target&#x60; must carry all of, any of, or none of the labels in &#x60;labelNames&#x60;,
 * as determined by &#x60;operator&#x60;.
 */
@ApiModel(description = "A label condition on analytics KPI data: the entity named by `target` must carry all of, any of, or none of the labels in `labelNames`, as determined by `operator`.")

@JsonPropertyOrder({
	LabelsAnalyticsKpiFilter.JSON_PROPERTY_$_TYPE,
	LabelsAnalyticsKpiFilter.JSON_PROPERTY_TARGET,
	LabelsAnalyticsKpiFilter.JSON_PROPERTY_OPERATOR,
	LabelsAnalyticsKpiFilter.JSON_PROPERTY_LABEL_NAMES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LabelsAnalyticsKpiFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LABELSANALYTICSKPIFILTER("LabelsAnalyticsKpiFilter");

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
			return TypeEnum.LABELSANALYTICSKPIFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LABELSANALYTICSKPIFILTER;

	public static final String JSON_PROPERTY_TARGET = "target";
	@JsonProperty(JSON_PROPERTY_TARGET)
	private EAnalyticsLabelTarget target;

	public static final String JSON_PROPERTY_OPERATOR = "operator";
	@JsonProperty(JSON_PROPERTY_OPERATOR)
	private ELabelsOperatorType operator;

	public static final String JSON_PROPERTY_LABEL_NAMES = "labelNames";
	@JsonProperty(JSON_PROPERTY_LABEL_NAMES)
	private List<String> labelNames = null;

	public LabelsAnalyticsKpiFilter $type(TypeEnum $type) {
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

	public LabelsAnalyticsKpiFilter target(EAnalyticsLabelTarget target) {
		this.target = target;
		return this;
	}

	/**
	 * Get target
	 * 
	 * @return target
	 **/
	@ApiModelProperty(value = "")
	public EAnalyticsLabelTarget getTarget() {
		return target;
	}

	public void setTarget(EAnalyticsLabelTarget target) {
		this.target = target;
	}

	public LabelsAnalyticsKpiFilter operator(ELabelsOperatorType operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * Get operator
	 * 
	 * @return operator
	 **/
	@ApiModelProperty(value = "")
	public ELabelsOperatorType getOperator() {
		return operator;
	}

	public void setOperator(ELabelsOperatorType operator) {
		this.operator = operator;
	}

	public LabelsAnalyticsKpiFilter labelNames(List<String> labelNames) {
		this.labelNames = labelNames;
		return this;
	}

	public LabelsAnalyticsKpiFilter addLabelNamesItem(String labelNamesItem) {
		if (this.labelNames == null) {
			this.labelNames = new ArrayList<>();
		}
		this.labelNames.add(labelNamesItem);
		return this;
	}

	/**
	 * The label names to check. Mandatory and must not be empty.
	 * 
	 * @return labelNames
	 **/
	@ApiModelProperty(value = "The label names to check. Mandatory and must not be empty.")
	public List<String> getLabelNames() {
		return labelNames;
	}

	public void setLabelNames(List<String> labelNames) {
		this.labelNames = labelNames;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LabelsAnalyticsKpiFilter labelsAnalyticsKpiFilter = (LabelsAnalyticsKpiFilter) o;
		return Objects.equals(this.$type, labelsAnalyticsKpiFilter.$type) &&
				Objects.equals(this.target, labelsAnalyticsKpiFilter.target) &&
				Objects.equals(this.operator, labelsAnalyticsKpiFilter.operator) &&
				Objects.equals(this.labelNames, labelsAnalyticsKpiFilter.labelNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, target, operator, labelNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LabelsAnalyticsKpiFilter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    target: ").append(toIndentedString(target)).append("\n");
		sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
		sb.append("    labelNames: ").append(toIndentedString(labelNames)).append("\n");
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
