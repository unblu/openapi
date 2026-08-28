
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
 * A snapshot of the account&#39;s agent availability: every emission carries the complete current set of online agents subscribed to the queue, including the
 * conversations they are actively handling.
 */
@ApiModel(description = "A snapshot of the account's agent availability: every emission carries the complete current set of online agents subscribed to the queue, including the conversations they are actively handling.")

@JsonPropertyOrder({
	AvailabilitySnapshotEvent.JSON_PROPERTY_$_TYPE,
	AvailabilitySnapshotEvent.JSON_PROPERTY_TIMESTAMP,
	AvailabilitySnapshotEvent.JSON_PROPERTY_EVENT_TYPE,
	AvailabilitySnapshotEvent.JSON_PROPERTY_ACCOUNT_ID,
	AvailabilitySnapshotEvent.JSON_PROPERTY_AGENTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AvailabilitySnapshotEvent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AVAILABILITYSNAPSHOTEVENT("AvailabilitySnapshotEvent");

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
			return TypeEnum.AVAILABILITYSNAPSHOTEVENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AVAILABILITYSNAPSHOTEVENT;

	public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
	@JsonProperty(JSON_PROPERTY_TIMESTAMP)
	private Long timestamp;

	public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
	@JsonProperty(JSON_PROPERTY_EVENT_TYPE)
	private String eventType;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_AGENTS = "agents";
	@JsonProperty(JSON_PROPERTY_AGENTS)
	private List<AgentAvailabilityData> agents = null;

	public AvailabilitySnapshotEvent $type(TypeEnum $type) {
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

	public AvailabilitySnapshotEvent timestamp(Long timestamp) {
		this.timestamp = timestamp;
		return this;
	}

	/**
	 * The server time (Unix timestamp in ms) when the event occurred.
	 * 
	 * @return timestamp
	 **/
	@ApiModelProperty(value = "The server time (Unix timestamp in ms) when the event occurred.")
	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public AvailabilitySnapshotEvent eventType(String eventType) {
		this.eventType = eventType;
		return this;
	}

	/**
	 * The name of the event
	 * 
	 * @return eventType
	 **/
	@ApiModelProperty(value = "The name of the event")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public AvailabilitySnapshotEvent accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The account ID the event originated from
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The account ID the event originated from")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AvailabilitySnapshotEvent agents(List<AgentAvailabilityData> agents) {
		this.agents = agents;
		return this;
	}

	public AvailabilitySnapshotEvent addAgentsItem(AgentAvailabilityData agentsItem) {
		if (this.agents == null) {
			this.agents = new ArrayList<>();
		}
		this.agents.add(agentsItem);
		return this;
	}

	/**
	 * All agents subscribed to the inbound request queue. An agent is subscribed when they are online and their inbound queue is enabled, meaning they are a target
	 * for requests that name no specific agent. &lt;p&gt; Whether the agent can currently take such a request does not matter: a busy or otherwise unavailable
	 * agent is still listed, with&#x60;isAvailableForInboundRequests&#x60; saying which of them can be dispatched to right now. Agents who are configured to only
	 * ever receive invitations and forwardings are not listed at all.
	 * 
	 * @return agents
	 **/
	@ApiModelProperty(value = "All agents subscribed to the inbound request queue. An agent is subscribed when they are online and their inbound queue is enabled, meaning they are a target for requests that name no specific agent. <p> Whether the agent can currently take such a request does not matter: a busy or otherwise unavailable agent is still listed, with`isAvailableForInboundRequests` saying which of them can be dispatched to right now. Agents who are configured to only ever receive invitations and forwardings are not listed at all.")
	public List<AgentAvailabilityData> getAgents() {
		return agents;
	}

	public void setAgents(List<AgentAvailabilityData> agents) {
		this.agents = agents;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AvailabilitySnapshotEvent availabilitySnapshotEvent = (AvailabilitySnapshotEvent) o;
		return Objects.equals(this.$type, availabilitySnapshotEvent.$type) &&
				Objects.equals(this.timestamp, availabilitySnapshotEvent.timestamp) &&
				Objects.equals(this.eventType, availabilitySnapshotEvent.eventType) &&
				Objects.equals(this.accountId, availabilitySnapshotEvent.accountId) &&
				Objects.equals(this.agents, availabilitySnapshotEvent.agents);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, timestamp, eventType, accountId, agents);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvailabilitySnapshotEvent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    agents: ").append(toIndentedString(agents)).append("\n");
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
