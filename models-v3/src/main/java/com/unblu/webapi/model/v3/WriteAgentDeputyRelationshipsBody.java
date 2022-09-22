
package com.unblu.webapi.model.v3;

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
 * Container to define a list of deputies for one agent.
 */
@ApiModel(description = "Container to define a list of deputies for one agent.")

@JsonPropertyOrder({
	WriteAgentDeputyRelationshipsBody.JSON_PROPERTY_$_TYPE,
	WriteAgentDeputyRelationshipsBody.JSON_PROPERTY_AGENT_USER_ID,
	WriteAgentDeputyRelationshipsBody.JSON_PROPERTY_LEVEL1,
	WriteAgentDeputyRelationshipsBody.JSON_PROPERTY_LEVEL2,
	WriteAgentDeputyRelationshipsBody.JSON_PROPERTY_LEVEL3,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WriteAgentDeputyRelationshipsBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WRITEAGENTDEPUTYRELATIONSHIPSBODY("WriteAgentDeputyRelationshipsBody");

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
			return TypeEnum.WRITEAGENTDEPUTYRELATIONSHIPSBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WRITEAGENTDEPUTYRELATIONSHIPSBODY;

	public static final String JSON_PROPERTY_AGENT_USER_ID = "agentUserId";
	@JsonProperty(JSON_PROPERTY_AGENT_USER_ID)
	private String agentUserId;

	public static final String JSON_PROPERTY_LEVEL1 = "level1";
	@JsonProperty(JSON_PROPERTY_LEVEL1)
	private List<DeputyDefinition> level1 = null;

	public static final String JSON_PROPERTY_LEVEL2 = "level2";
	@JsonProperty(JSON_PROPERTY_LEVEL2)
	private List<DeputyDefinition> level2 = null;

	public static final String JSON_PROPERTY_LEVEL3 = "level3";
	@JsonProperty(JSON_PROPERTY_LEVEL3)
	private List<DeputyDefinition> level3 = null;

	public WriteAgentDeputyRelationshipsBody $type(TypeEnum $type) {
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

	public WriteAgentDeputyRelationshipsBody agentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
		return this;
	}

	/**
	 * The agent user ID for which the deputies should be defined
	 * 
	 * @return agentUserId
	 **/
	@ApiModelProperty(value = "The agent user ID for which the deputies should be defined")
	public String getAgentUserId() {
		return agentUserId;
	}

	public void setAgentUserId(String agentUserId) {
		this.agentUserId = agentUserId;
	}

	public WriteAgentDeputyRelationshipsBody level1(List<DeputyDefinition> level1) {
		this.level1 = level1;
		return this;
	}

	public WriteAgentDeputyRelationshipsBody addLevel1Item(DeputyDefinition level1Item) {
		if (this.level1 == null) {
			this.level1 = new ArrayList<>();
		}
		this.level1.add(level1Item);
		return this;
	}

	/**
	 * All &#x60;EDeputyDelegationEscalationLevel.LEVEL_1&#x60; deputies
	 * 
	 * @return level1
	 **/
	@ApiModelProperty(value = "All `EDeputyDelegationEscalationLevel.LEVEL_1` deputies")
	public List<DeputyDefinition> getLevel1() {
		return level1;
	}

	public void setLevel1(List<DeputyDefinition> level1) {
		this.level1 = level1;
	}

	public WriteAgentDeputyRelationshipsBody level2(List<DeputyDefinition> level2) {
		this.level2 = level2;
		return this;
	}

	public WriteAgentDeputyRelationshipsBody addLevel2Item(DeputyDefinition level2Item) {
		if (this.level2 == null) {
			this.level2 = new ArrayList<>();
		}
		this.level2.add(level2Item);
		return this;
	}

	/**
	 * All &#x60;EDeputyDelegationEscalationLevel.LEVEL_2&#x60; deputies
	 * 
	 * @return level2
	 **/
	@ApiModelProperty(value = "All `EDeputyDelegationEscalationLevel.LEVEL_2` deputies")
	public List<DeputyDefinition> getLevel2() {
		return level2;
	}

	public void setLevel2(List<DeputyDefinition> level2) {
		this.level2 = level2;
	}

	public WriteAgentDeputyRelationshipsBody level3(List<DeputyDefinition> level3) {
		this.level3 = level3;
		return this;
	}

	public WriteAgentDeputyRelationshipsBody addLevel3Item(DeputyDefinition level3Item) {
		if (this.level3 == null) {
			this.level3 = new ArrayList<>();
		}
		this.level3.add(level3Item);
		return this;
	}

	/**
	 * All &#x60;EDeputyDelegationEscalationLevel.LEVEL_3&#x60; deputies
	 * 
	 * @return level3
	 **/
	@ApiModelProperty(value = "All `EDeputyDelegationEscalationLevel.LEVEL_3` deputies")
	public List<DeputyDefinition> getLevel3() {
		return level3;
	}

	public void setLevel3(List<DeputyDefinition> level3) {
		this.level3 = level3;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WriteAgentDeputyRelationshipsBody writeAgentDeputyRelationshipsBody = (WriteAgentDeputyRelationshipsBody) o;
		return Objects.equals(this.$type, writeAgentDeputyRelationshipsBody.$type) &&
				Objects.equals(this.agentUserId, writeAgentDeputyRelationshipsBody.agentUserId) &&
				Objects.equals(this.level1, writeAgentDeputyRelationshipsBody.level1) &&
				Objects.equals(this.level2, writeAgentDeputyRelationshipsBody.level2) &&
				Objects.equals(this.level3, writeAgentDeputyRelationshipsBody.level3);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, agentUserId, level1, level2, level3);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WriteAgentDeputyRelationshipsBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    agentUserId: ").append(toIndentedString(agentUserId)).append("\n");
		sb.append("    level1: ").append(toIndentedString(level1)).append("\n");
		sb.append("    level2: ").append(toIndentedString(level2)).append("\n");
		sb.append("    level3: ").append(toIndentedString(level3)).append("\n");
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
