
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
 * Model representing a simplified Aria Agentic Flow
 */
@ApiModel(description = "Model representing a simplified Aria Agentic Flow")

@JsonPropertyOrder({
	AriaAgenticFlowTransferableData.JSON_PROPERTY_$_TYPE,
	AriaAgenticFlowTransferableData.JSON_PROPERTY_ID,
	AriaAgenticFlowTransferableData.JSON_PROPERTY_NAME,
	AriaAgenticFlowTransferableData.JSON_PROPERTY_FLOW_DATA,
	AriaAgenticFlowTransferableData.JSON_PROPERTY_FLOW_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AriaAgenticFlowTransferableData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARIAAGENTICFLOWTRANSFERABLEDATA("AriaAgenticFlowTransferableData");

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
			return TypeEnum.ARIAAGENTICFLOWTRANSFERABLEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARIAAGENTICFLOWTRANSFERABLEDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_FLOW_DATA = "flowData";
	@JsonProperty(JSON_PROPERTY_FLOW_DATA)
	private String flowData;

	public static final String JSON_PROPERTY_FLOW_TYPE = "flowType";
	@JsonProperty(JSON_PROPERTY_FLOW_TYPE)
	private EAriaAgenticFlowType flowType;

	public AriaAgenticFlowTransferableData $type(TypeEnum $type) {
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

	public AriaAgenticFlowTransferableData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AriaAgenticFlowTransferableData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AriaAgenticFlowTransferableData flowData(String flowData) {
		this.flowData = flowData;
		return this;
	}

	/**
	 * Get flowData
	 * 
	 * @return flowData
	 **/
	@ApiModelProperty(value = "")
	public String getFlowData() {
		return flowData;
	}

	public void setFlowData(String flowData) {
		this.flowData = flowData;
	}

	public AriaAgenticFlowTransferableData flowType(EAriaAgenticFlowType flowType) {
		this.flowType = flowType;
		return this;
	}

	/**
	 * Get flowType
	 * 
	 * @return flowType
	 **/
	@ApiModelProperty(value = "")
	public EAriaAgenticFlowType getFlowType() {
		return flowType;
	}

	public void setFlowType(EAriaAgenticFlowType flowType) {
		this.flowType = flowType;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AriaAgenticFlowTransferableData ariaAgenticFlowTransferableData = (AriaAgenticFlowTransferableData) o;
		return Objects.equals(this.$type, ariaAgenticFlowTransferableData.$type) &&
				Objects.equals(this.id, ariaAgenticFlowTransferableData.id) &&
				Objects.equals(this.name, ariaAgenticFlowTransferableData.name) &&
				Objects.equals(this.flowData, ariaAgenticFlowTransferableData.flowData) &&
				Objects.equals(this.flowType, ariaAgenticFlowTransferableData.flowType);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, flowData, flowType);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AriaAgenticFlowTransferableData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    flowData: ").append(toIndentedString(flowData)).append("\n");
		sb.append("    flowType: ").append(toIndentedString(flowType)).append("\n");
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
