
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
 * An online agent subscribed to the queue, as reported in a live-tracking snapshot.
 */
@ApiModel(description = "An online agent subscribed to the queue, as reported in a live-tracking snapshot.")

@JsonPropertyOrder({
	AgentAvailabilityData.JSON_PROPERTY_$_TYPE,
	AgentAvailabilityData.JSON_PROPERTY_AGENT_PERSON_ID,
	AgentAvailabilityData.JSON_PROPERTY_AVAILABLE_FOR_INBOUND_REQUESTS,
	AgentAvailabilityData.JSON_PROPERTY_CAPACITIES,
	AgentAvailabilityData.JSON_PROPERTY_TEAM_ID,
	AgentAvailabilityData.JSON_PROPERTY_FILTERED_NAMED_AREA_IDS,
	AgentAvailabilityData.JSON_PROPERTY_FILTERED_LOCALES,
	AgentAvailabilityData.JSON_PROPERTY_CONVERSATIONS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AgentAvailabilityData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AGENTAVAILABILITYDATA("AgentAvailabilityData");

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
			return TypeEnum.AGENTAVAILABILITYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AGENTAVAILABILITYDATA;

	public static final String JSON_PROPERTY_AGENT_PERSON_ID = "agentPersonId";
	@JsonProperty(JSON_PROPERTY_AGENT_PERSON_ID)
	private String agentPersonId;

	public static final String JSON_PROPERTY_AVAILABLE_FOR_INBOUND_REQUESTS = "availableForInboundRequests";
	@JsonProperty(JSON_PROPERTY_AVAILABLE_FOR_INBOUND_REQUESTS)
	private Boolean availableForInboundRequests;

	public static final String JSON_PROPERTY_CAPACITIES = "capacities";
	@JsonProperty(JSON_PROPERTY_CAPACITIES)
	private List<CapacityData> capacities = null;

	public static final String JSON_PROPERTY_TEAM_ID = "teamId";
	@JsonProperty(JSON_PROPERTY_TEAM_ID)
	private String teamId;

	public static final String JSON_PROPERTY_FILTERED_NAMED_AREA_IDS = "filteredNamedAreaIds";
	@JsonProperty(JSON_PROPERTY_FILTERED_NAMED_AREA_IDS)
	private List<String> filteredNamedAreaIds = null;

	public static final String JSON_PROPERTY_FILTERED_LOCALES = "filteredLocales";
	@JsonProperty(JSON_PROPERTY_FILTERED_LOCALES)
	private List<String> filteredLocales = null;

	public static final String JSON_PROPERTY_CONVERSATIONS = "conversations";
	@JsonProperty(JSON_PROPERTY_CONVERSATIONS)
	private List<AgentAvailabilityConversationData> conversations = null;

	public AgentAvailabilityData $type(TypeEnum $type) {
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

	public AgentAvailabilityData agentPersonId(String agentPersonId) {
		this.agentPersonId = agentPersonId;
		return this;
	}

	/**
	 * The person ID of the agent.
	 * 
	 * @return agentPersonId
	 **/
	@ApiModelProperty(value = "The person ID of the agent.")
	public String getAgentPersonId() {
		return agentPersonId;
	}

	public void setAgentPersonId(String agentPersonId) {
		this.agentPersonId = agentPersonId;
	}

	public AgentAvailabilityData availableForInboundRequests(Boolean availableForInboundRequests) {
		this.availableForInboundRequests = availableForInboundRequests;
		return this;
	}

	/**
	 * Whether the agent is currently available to be routed new inbound requests.
	 * 
	 * @return availableForInboundRequests
	 **/
	@ApiModelProperty(value = "Whether the agent is currently available to be routed new inbound requests.")
	public Boolean isAvailableForInboundRequests() {
		return availableForInboundRequests;
	}

	public void setAvailableForInboundRequests(Boolean availableForInboundRequests) {
		this.availableForInboundRequests = availableForInboundRequests;
	}

	public AgentAvailabilityData capacities(List<CapacityData> capacities) {
		this.capacities = capacities;
		return this;
	}

	public AgentAvailabilityData addCapacitiesItem(CapacityData capacitiesItem) {
		if (this.capacities == null) {
			this.capacities = new ArrayList<>();
		}
		this.capacities.add(capacitiesItem);
		return this;
	}

	/**
	 * Per-priority capacity breakdown: the configured session limit and the free slots of each enabled priority, from the highest to the lowest. Populated while
	 * the agent is available or busy, empty while they are away. &lt;p&gt; A conversation&#39;s priority follows from its queue sorting order
	 * through&#x60;com.unblu.agentavailability.queueSortingOrderToPriorityMapping&#x60;, whose entries are the minimum sorting order of each priority. That mapping
	 * is empty by default, in which case every conversation counts as priority 1 and a single capacity is reported. A priority&#39;s limit is the
	 * account&#39;s&#x60;com.unblu.agentavailability.busyStateSessionLimitPriority1&#x60; to &#x60;...Priority4&#x60;: the number of ongoing conversations of that
	 * priority at which the agent switches to BUSY. A limit of 0 disables that priority, and it is left out here. &lt;p&gt; Once a priority is full, Unblu no
	 * longer dispatches conversations of that priority or of any lower one to the agent until a slot frees up, but a conversation of a higher priority still
	 * reaches them. That is what lets an agent who is already handling their maximum of asynchronous conversations take on a live conversation, since the
	 * asynchronous ones can wait a little longer.
	 * 
	 * @return capacities
	 **/
	@ApiModelProperty(value = "Per-priority capacity breakdown: the configured session limit and the free slots of each enabled priority, from the highest to the lowest. Populated while the agent is available or busy, empty while they are away. <p> A conversation's priority follows from its queue sorting order through`com.unblu.agentavailability.queueSortingOrderToPriorityMapping`, whose entries are the minimum sorting order of each priority. That mapping is empty by default, in which case every conversation counts as priority 1 and a single capacity is reported. A priority's limit is the account's`com.unblu.agentavailability.busyStateSessionLimitPriority1` to `...Priority4`: the number of ongoing conversations of that priority at which the agent switches to BUSY. A limit of 0 disables that priority, and it is left out here. <p> Once a priority is full, Unblu no longer dispatches conversations of that priority or of any lower one to the agent until a slot frees up, but a conversation of a higher priority still reaches them. That is what lets an agent who is already handling their maximum of asynchronous conversations take on a live conversation, since the asynchronous ones can wait a little longer.")
	public List<CapacityData> getCapacities() {
		return capacities;
	}

	public void setCapacities(List<CapacityData> capacities) {
		this.capacities = capacities;
	}

	public AgentAvailabilityData teamId(String teamId) {
		this.teamId = teamId;
		return this;
	}

	/**
	 * The agent&#39;s team.
	 * 
	 * @return teamId
	 **/
	@ApiModelProperty(value = "The agent's team.")
	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public AgentAvailabilityData filteredNamedAreaIds(List<String> filteredNamedAreaIds) {
		this.filteredNamedAreaIds = filteredNamedAreaIds;
		return this;
	}

	public AgentAvailabilityData addFilteredNamedAreaIdsItem(String filteredNamedAreaIdsItem) {
		if (this.filteredNamedAreaIds == null) {
			this.filteredNamedAreaIds = new ArrayList<>();
		}
		this.filteredNamedAreaIds.add(filteredNamedAreaIdsItem);
		return this;
	}

	/**
	 * The named areas the agent serves. Empty means the agent serves all named areas (wildcard), not none.
	 * 
	 * @return filteredNamedAreaIds
	 **/
	@ApiModelProperty(value = "The named areas the agent serves. Empty means the agent serves all named areas (wildcard), not none.")
	public List<String> getFilteredNamedAreaIds() {
		return filteredNamedAreaIds;
	}

	public void setFilteredNamedAreaIds(List<String> filteredNamedAreaIds) {
		this.filteredNamedAreaIds = filteredNamedAreaIds;
	}

	public AgentAvailabilityData filteredLocales(List<String> filteredLocales) {
		this.filteredLocales = filteredLocales;
		return this;
	}

	public AgentAvailabilityData addFilteredLocalesItem(String filteredLocalesItem) {
		if (this.filteredLocales == null) {
			this.filteredLocales = new ArrayList<>();
		}
		this.filteredLocales.add(filteredLocalesItem);
		return this;
	}

	/**
	 * The languages the agent serves. Empty means the agent serves all languages (wildcard), not none.
	 * 
	 * @return filteredLocales
	 **/
	@ApiModelProperty(value = "The languages the agent serves. Empty means the agent serves all languages (wildcard), not none.")
	public List<String> getFilteredLocales() {
		return filteredLocales;
	}

	public void setFilteredLocales(List<String> filteredLocales) {
		this.filteredLocales = filteredLocales;
	}

	public AgentAvailabilityData conversations(List<AgentAvailabilityConversationData> conversations) {
		this.conversations = conversations;
		return this;
	}

	public AgentAvailabilityData addConversationsItem(AgentAvailabilityConversationData conversationsItem) {
		if (this.conversations == null) {
			this.conversations = new ArrayList<>();
		}
		this.conversations.add(conversationsItem);
		return this;
	}

	/**
	 * The conversations this agent is currently handling. A conversation is listed when the agent is its assignee and has it open themselves; another
	 * participant&#39;s presence does not put it here, so a conversation the assignee has closed in their desk is not reported. &lt;p&gt; An ended conversation is
	 * left out even while the agent still has it open, since it no longer counts towards their load. An offboarding one is still listed, because the agent may be
	 * doing follow-up work on it. A queued conversation never appears, having no assignee yet.
	 * 
	 * @return conversations
	 **/
	@ApiModelProperty(value = "The conversations this agent is currently handling. A conversation is listed when the agent is its assignee and has it open themselves; another participant's presence does not put it here, so a conversation the assignee has closed in their desk is not reported. <p> An ended conversation is left out even while the agent still has it open, since it no longer counts towards their load. An offboarding one is still listed, because the agent may be doing follow-up work on it. A queued conversation never appears, having no assignee yet.")
	public List<AgentAvailabilityConversationData> getConversations() {
		return conversations;
	}

	public void setConversations(List<AgentAvailabilityConversationData> conversations) {
		this.conversations = conversations;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AgentAvailabilityData agentAvailabilityData = (AgentAvailabilityData) o;
		return Objects.equals(this.$type, agentAvailabilityData.$type) &&
				Objects.equals(this.agentPersonId, agentAvailabilityData.agentPersonId) &&
				Objects.equals(this.availableForInboundRequests, agentAvailabilityData.availableForInboundRequests) &&
				Objects.equals(this.capacities, agentAvailabilityData.capacities) &&
				Objects.equals(this.teamId, agentAvailabilityData.teamId) &&
				Objects.equals(this.filteredNamedAreaIds, agentAvailabilityData.filteredNamedAreaIds) &&
				Objects.equals(this.filteredLocales, agentAvailabilityData.filteredLocales) &&
				Objects.equals(this.conversations, agentAvailabilityData.conversations);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, agentPersonId, availableForInboundRequests, capacities, teamId, filteredNamedAreaIds, filteredLocales, conversations);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AgentAvailabilityData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    agentPersonId: ").append(toIndentedString(agentPersonId)).append("\n");
		sb.append("    availableForInboundRequests: ").append(toIndentedString(availableForInboundRequests)).append("\n");
		sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
		sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
		sb.append("    filteredNamedAreaIds: ").append(toIndentedString(filteredNamedAreaIds)).append("\n");
		sb.append("    filteredLocales: ").append(toIndentedString(filteredLocales)).append("\n");
		sb.append("    conversations: ").append(toIndentedString(conversations)).append("\n");
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
