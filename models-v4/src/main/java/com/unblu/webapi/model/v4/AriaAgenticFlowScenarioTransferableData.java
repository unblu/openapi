
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
 * Model representing a simplified Aria Agentic Flow Scenario
 */
@ApiModel(description = "Model representing a simplified Aria Agentic Flow Scenario")

@JsonPropertyOrder({
	AriaAgenticFlowScenarioTransferableData.JSON_PROPERTY_$_TYPE,
	AriaAgenticFlowScenarioTransferableData.JSON_PROPERTY_AGENTIC_FLOW_ID,
	AriaAgenticFlowScenarioTransferableData.JSON_PROPERTY_SCENARIO,
	AriaAgenticFlowScenarioTransferableData.JSON_PROPERTY_INDEX,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AriaAgenticFlowScenarioTransferableData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARIAAGENTICFLOWSCENARIOTRANSFERABLEDATA("AriaAgenticFlowScenarioTransferableData");

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
			return TypeEnum.ARIAAGENTICFLOWSCENARIOTRANSFERABLEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARIAAGENTICFLOWSCENARIOTRANSFERABLEDATA;

	public static final String JSON_PROPERTY_AGENTIC_FLOW_ID = "agenticFlowId";
	@JsonProperty(JSON_PROPERTY_AGENTIC_FLOW_ID)
	private String agenticFlowId;

	public static final String JSON_PROPERTY_SCENARIO = "scenario";
	@JsonProperty(JSON_PROPERTY_SCENARIO)
	private String scenario;

	public static final String JSON_PROPERTY_INDEX = "index";
	@JsonProperty(JSON_PROPERTY_INDEX)
	private Integer index;

	public AriaAgenticFlowScenarioTransferableData $type(TypeEnum $type) {
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

	public AriaAgenticFlowScenarioTransferableData agenticFlowId(String agenticFlowId) {
		this.agenticFlowId = agenticFlowId;
		return this;
	}

	/**
	 * Get agenticFlowId
	 * 
	 * @return agenticFlowId
	 **/
	@ApiModelProperty(value = "")
	public String getAgenticFlowId() {
		return agenticFlowId;
	}

	public void setAgenticFlowId(String agenticFlowId) {
		this.agenticFlowId = agenticFlowId;
	}

	public AriaAgenticFlowScenarioTransferableData scenario(String scenario) {
		this.scenario = scenario;
		return this;
	}

	/**
	 * Get scenario
	 * 
	 * @return scenario
	 **/
	@ApiModelProperty(value = "")
	public String getScenario() {
		return scenario;
	}

	public void setScenario(String scenario) {
		this.scenario = scenario;
	}

	public AriaAgenticFlowScenarioTransferableData index(Integer index) {
		this.index = index;
		return this;
	}

	/**
	 * Get index
	 * 
	 * @return index
	 **/
	@ApiModelProperty(value = "")
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AriaAgenticFlowScenarioTransferableData ariaAgenticFlowScenarioTransferableData = (AriaAgenticFlowScenarioTransferableData) o;
		return Objects.equals(this.$type, ariaAgenticFlowScenarioTransferableData.$type) &&
				Objects.equals(this.agenticFlowId, ariaAgenticFlowScenarioTransferableData.agenticFlowId) &&
				Objects.equals(this.scenario, ariaAgenticFlowScenarioTransferableData.scenario) &&
				Objects.equals(this.index, ariaAgenticFlowScenarioTransferableData.index);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, agenticFlowId, scenario, index);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AriaAgenticFlowScenarioTransferableData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    agenticFlowId: ").append(toIndentedString(agenticFlowId)).append("\n");
		sb.append("    scenario: ").append(toIndentedString(scenario)).append("\n");
		sb.append("    index: ").append(toIndentedString(index)).append("\n");
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
