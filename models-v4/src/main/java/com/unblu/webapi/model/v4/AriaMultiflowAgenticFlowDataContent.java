
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

import io.swagger.annotations.ApiModelProperty;

/**
 * AriaMultiflowAgenticFlowDataContent
 */

@JsonPropertyOrder({
	AriaMultiflowAgenticFlowDataContent.JSON_PROPERTY_$_TYPE,
	AriaMultiflowAgenticFlowDataContent.JSON_PROPERTY_TYPE,
	AriaMultiflowAgenticFlowDataContent.JSON_PROPERTY_ID,
	AriaMultiflowAgenticFlowDataContent.JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS,
	AriaMultiflowAgenticFlowDataContent.JSON_PROPERTY_SCENARIOS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AriaMultiflowAgenticFlowDataContent implements AriaAgenticFlowDataContent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARIAMULTIFLOWAGENTICFLOWDATACONTENT("AriaMultiflowAgenticFlowDataContent");

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
			return TypeEnum.ARIAMULTIFLOWAGENTICFLOWDATACONTENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARIAMULTIFLOWAGENTICFLOWDATACONTENT;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EAriaAgenticFlowDataContentType type = EAriaAgenticFlowDataContentType.MULTIFLOW;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS = "publishedAgenticFlows";
	@JsonProperty(JSON_PROPERTY_PUBLISHED_AGENTIC_FLOWS)
	private List<AriaAgenticFlowTransferableData> publishedAgenticFlows = null;

	public static final String JSON_PROPERTY_SCENARIOS = "scenarios";
	@JsonProperty(JSON_PROPERTY_SCENARIOS)
	private List<AriaAgenticFlowScenarioTransferableData> scenarios = null;

	public AriaMultiflowAgenticFlowDataContent $type(TypeEnum $type) {
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

	public AriaMultiflowAgenticFlowDataContent type(EAriaAgenticFlowDataContentType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EAriaAgenticFlowDataContentType getType() {
		return type;
	}

	public void setType(EAriaAgenticFlowDataContentType type) {
		this.type = type;
	}

	public AriaMultiflowAgenticFlowDataContent id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The id of the main agentic flow of the entity
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The id of the main agentic flow of the entity")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AriaMultiflowAgenticFlowDataContent publishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows) {
		this.publishedAgenticFlows = publishedAgenticFlows;
		return this;
	}

	public AriaMultiflowAgenticFlowDataContent addPublishedAgenticFlowsItem(AriaAgenticFlowTransferableData publishedAgenticFlowsItem) {
		if (this.publishedAgenticFlows == null) {
			this.publishedAgenticFlows = new ArrayList<>();
		}
		this.publishedAgenticFlows.add(publishedAgenticFlowsItem);
		return this;
	}

	/**
	 * Published version of the agentic flows required for the entity, base-64 encoded
	 * 
	 * @return publishedAgenticFlows
	 **/
	@ApiModelProperty(value = "Published version of the agentic flows required for the entity, base-64 encoded")
	public List<AriaAgenticFlowTransferableData> getPublishedAgenticFlows() {
		return publishedAgenticFlows;
	}

	public void setPublishedAgenticFlows(List<AriaAgenticFlowTransferableData> publishedAgenticFlows) {
		this.publishedAgenticFlows = publishedAgenticFlows;
	}

	public AriaMultiflowAgenticFlowDataContent scenarios(List<AriaAgenticFlowScenarioTransferableData> scenarios) {
		this.scenarios = scenarios;
		return this;
	}

	public AriaMultiflowAgenticFlowDataContent addScenariosItem(AriaAgenticFlowScenarioTransferableData scenariosItem) {
		if (this.scenarios == null) {
			this.scenarios = new ArrayList<>();
		}
		this.scenarios.add(scenariosItem);
		return this;
	}

	/**
	 * Get scenarios
	 * 
	 * @return scenarios
	 **/
	@ApiModelProperty(value = "")
	public List<AriaAgenticFlowScenarioTransferableData> getScenarios() {
		return scenarios;
	}

	public void setScenarios(List<AriaAgenticFlowScenarioTransferableData> scenarios) {
		this.scenarios = scenarios;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AriaMultiflowAgenticFlowDataContent ariaMultiflowAgenticFlowDataContent = (AriaMultiflowAgenticFlowDataContent) o;
		return Objects.equals(this.$type, ariaMultiflowAgenticFlowDataContent.$type) &&
				Objects.equals(this.type, ariaMultiflowAgenticFlowDataContent.type) &&
				Objects.equals(this.id, ariaMultiflowAgenticFlowDataContent.id) &&
				Objects.equals(this.publishedAgenticFlows, ariaMultiflowAgenticFlowDataContent.publishedAgenticFlows) &&
				Objects.equals(this.scenarios, ariaMultiflowAgenticFlowDataContent.scenarios);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, id, publishedAgenticFlows, scenarios);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AriaMultiflowAgenticFlowDataContent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    publishedAgenticFlows: ").append(toIndentedString(publishedAgenticFlows)).append("\n");
		sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
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
