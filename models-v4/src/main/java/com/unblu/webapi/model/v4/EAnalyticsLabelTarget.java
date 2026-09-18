
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The entity whose labels a &#x60;LabelsAnalyticsKpiFilter&#x60; applies to: the conversation itself or one of its persons. Each KPI supports only the targets
 * available on its analytics data; a filter using an unsupported target is rejected.
 */
public enum EAnalyticsLabelTarget {

	/**
	 * CONVERSATION: The conversation itself.
	 */
	CONVERSATION("CONVERSATION"),

	/**
	 * CONTEXT_PERSON: The conversation&#39;s context person.
	 */
	CONTEXT_PERSON("CONTEXT_PERSON"),

	/**
	 * ASSIGNED_AGENT: The conversation&#39;s assigned agent.
	 */
	ASSIGNED_AGENT("ASSIGNED_AGENT"),

	/**
	 * SENDER_PERSON: The person who sent the message. Only available for the messages KPI.
	 */
	SENDER_PERSON("SENDER_PERSON"),

	/**
	 * STARTING_PERSON: The person who started the call or collaboration layer. Only available for the calls and collaboration layers KPIs.
	 */
	STARTING_PERSON("STARTING_PERSON"),

	/**
	 * STOPPING_PERSON: The person who stopped the collaboration layer. Only available for the collaboration layers KPI.
	 */
	STOPPING_PERSON("STOPPING_PERSON"),

	/**
	 * LAYER_OWNER: The owner of the collaboration layer. Only available for the collaboration layers KPI.
	 */
	LAYER_OWNER("LAYER_OWNER"),

	/**
	 * INVITATION_ACCEPTING_AGENT: The agent who accepted the invitation. Only available for the average waiting time KPI.
	 */
	INVITATION_ACCEPTING_AGENT("INVITATION_ACCEPTING_AGENT");

	private String value;

	EAnalyticsLabelTarget(String value) {
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
	public static EAnalyticsLabelTarget fromValue(String value) {
		for (EAnalyticsLabelTarget b : EAnalyticsLabelTarget.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
