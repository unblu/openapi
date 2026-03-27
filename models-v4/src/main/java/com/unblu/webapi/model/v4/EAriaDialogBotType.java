
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of an Aria Dialog Bot
 */
public enum EAriaDialogBotType {

	/**
	 * SINGLE_FLOW: A single flow dialog bot with a simple structure containing only a start node and a text message node. This type is suitable for bot where an
	 * LLM is responsible to create final message or for simple bots that don&#39;t require intent routing.
	 */
	SINGLE_FLOW("SINGLE_FLOW"),

	/**
	 * MULTI_FLOW: A multi-flow dialog bot with an orchestrator that routes to greeting, fallback, and executable flows. This type supports intent-based routing and
	 * complex conversation flows.
	 */
	MULTI_FLOW("MULTI_FLOW");

	private String value;

	EAriaDialogBotType(String value) {
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
	public static EAriaDialogBotType fromValue(String value) {
		for (EAriaDialogBotType b : EAriaDialogBotType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
