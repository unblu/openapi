
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
 * Information about an agent&#39;s availability for inbound conversation requests
 */
@ApiModel(description = "Information about an agent's availability for inbound conversation requests")

@JsonPropertyOrder({
	AgentAvailabilityStateData.JSON_PROPERTY_$_TYPE,
	AgentAvailabilityStateData.JSON_PROPERTY_AVAILABILITY_STATE,
	AgentAvailabilityStateData.JSON_PROPERTY_IS_AVAILABLE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AgentAvailabilityStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AGENTAVAILABILITYSTATEDATA("AgentAvailabilityStateData");

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
			return TypeEnum.AGENTAVAILABILITYSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AGENTAVAILABILITYSTATEDATA;

	public static final String JSON_PROPERTY_AVAILABILITY_STATE = "availabilityState";
	@JsonProperty(JSON_PROPERTY_AVAILABILITY_STATE)
	private EAvailabilityState availabilityState;

	public static final String JSON_PROPERTY_IS_AVAILABLE = "isAvailable";
	@JsonProperty(JSON_PROPERTY_IS_AVAILABLE)
	private Boolean isAvailable;

	public AgentAvailabilityStateData $type(TypeEnum $type) {
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

	public AgentAvailabilityStateData availabilityState(EAvailabilityState availabilityState) {
		this.availabilityState = availabilityState;
		return this;
	}

	/**
	 * Get availabilityState
	 * 
	 * @return availabilityState
	 **/
	@ApiModelProperty(value = "")
	public EAvailabilityState getAvailabilityState() {
		return availabilityState;
	}

	public void setAvailabilityState(EAvailabilityState availabilityState) {
		this.availabilityState = availabilityState;
	}

	public AgentAvailabilityStateData isAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
		return this;
	}

	/**
	 * Whether the agent is available for inbound conversation requests
	 * 
	 * @return isAvailable
	 **/
	@ApiModelProperty(value = "Whether the agent is available for inbound conversation requests")
	public Boolean isIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AgentAvailabilityStateData agentAvailabilityStateData = (AgentAvailabilityStateData) o;
		return Objects.equals(this.$type, agentAvailabilityStateData.$type) &&
				Objects.equals(this.availabilityState, agentAvailabilityStateData.availabilityState) &&
				Objects.equals(this.isAvailable, agentAvailabilityStateData.isAvailable);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, availabilityState, isAvailable);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgentAvailabilityStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    availabilityState: ").append(toIndentedString(availabilityState)).append("\n");
		sb.append("    isAvailable: ").append(toIndentedString(isAvailable)).append("\n");
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
