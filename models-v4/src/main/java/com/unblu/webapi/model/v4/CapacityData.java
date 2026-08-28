
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
 * An agent&#39;s capacity for conversations of one priority.
 */
@ApiModel(description = "An agent's capacity for conversations of one priority.")

@JsonPropertyOrder({
	CapacityData.JSON_PROPERTY_$_TYPE,
	CapacityData.JSON_PROPERTY_PRIORITY,
	CapacityData.JSON_PROPERTY_CAPACITY,
	CapacityData.JSON_PROPERTY_AVAILABLE_CAPACITY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CapacityData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CAPACITYDATA("CapacityData");

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
			return TypeEnum.CAPACITYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CAPACITYDATA;

	public static final String JSON_PROPERTY_PRIORITY = "priority";
	@JsonProperty(JSON_PROPERTY_PRIORITY)
	private EBusySessionLimitPriority priority;

	public static final String JSON_PROPERTY_CAPACITY = "capacity";
	@JsonProperty(JSON_PROPERTY_CAPACITY)
	private Integer capacity;

	public static final String JSON_PROPERTY_AVAILABLE_CAPACITY = "availableCapacity";
	@JsonProperty(JSON_PROPERTY_AVAILABLE_CAPACITY)
	private Integer availableCapacity;

	public CapacityData $type(TypeEnum $type) {
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

	public CapacityData priority(EBusySessionLimitPriority priority) {
		this.priority = priority;
		return this;
	}

	/**
	 * Get priority
	 * 
	 * @return priority
	 **/
	@ApiModelProperty(value = "")
	public EBusySessionLimitPriority getPriority() {
		return priority;
	}

	public void setPriority(EBusySessionLimitPriority priority) {
		this.priority = priority;
	}

	public CapacityData capacity(Integer capacity) {
		this.capacity = capacity;
		return this;
	}

	/**
	 * The configured busy-state session limit for this priority, that is the number of ongoing conversations of it at which the agent switches to BUSY; null when
	 * the priority is configured as unlimited.
	 * 
	 * @return capacity
	 **/
	@ApiModelProperty(value = "The configured busy-state session limit for this priority, that is the number of ongoing conversations of it at which the agent switches to BUSY; null when the priority is configured as unlimited.")
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public CapacityData availableCapacity(Integer availableCapacity) {
		this.availableCapacity = availableCapacity;
		return this;
	}

	/**
	 * The server-computed free slots for this priority (may be negative); null when the priority is configured as unlimited.
	 * 
	 * @return availableCapacity
	 **/
	@ApiModelProperty(value = "The server-computed free slots for this priority (may be negative); null when the priority is configured as unlimited.")
	public Integer getAvailableCapacity() {
		return availableCapacity;
	}

	public void setAvailableCapacity(Integer availableCapacity) {
		this.availableCapacity = availableCapacity;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CapacityData capacityData = (CapacityData) o;
		return Objects.equals(this.$type, capacityData.$type) &&
				Objects.equals(this.priority, capacityData.priority) &&
				Objects.equals(this.capacity, capacityData.capacity) &&
				Objects.equals(this.availableCapacity, capacityData.availableCapacity);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, priority, capacity, availableCapacity);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CapacityData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
		sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
		sb.append("    availableCapacity: ").append(toIndentedString(availableCapacity)).append("\n");
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
