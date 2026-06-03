
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of an Aria Agentic Flow
 */
public enum EAriaAgenticFlowType {

	/**
	 * NONE: A generic agentic flow
	 */
	NONE("NONE"),

	/**
	 * DIALOG_BOT_ORCHESTRATOR: The orchestrator agentic flow representing the starting point of a Multi-flow Dialog bot, that routes to other agentic flows
	 */
	DIALOG_BOT_ORCHESTRATOR("DIALOG_BOT_ORCHESTRATOR"),

	/**
	 * DIALOG_BOT_GREETING: The greeting agentic flow shown when a conversation with a Dialog bot starts
	 */
	DIALOG_BOT_GREETING("DIALOG_BOT_GREETING"),

	/**
	 * DIALOG_BOT_FALLBACK: The fallback agentic flow when no intent is found during a conversation with a Dialog bot
	 */
	DIALOG_BOT_FALLBACK("DIALOG_BOT_FALLBACK"),

	/**
	 * DIALOG_BOT_EXECUTABLE: A custom agentic flow for specific scenarios in a dialog bot
	 */
	DIALOG_BOT_EXECUTABLE("DIALOG_BOT_EXECUTABLE"),

	/**
	 * DIALOG_BOT_SINGLE_FLOW: An agentic flow used for a single flow dialog bot
	 */
	DIALOG_BOT_SINGLE_FLOW("DIALOG_BOT_SINGLE_FLOW"),

	/**
	 * SUGGESTION_SOURCE_MAIN: An agentic flow used for a suggestion source
	 */
	SUGGESTION_SOURCE_MAIN("SUGGESTION_SOURCE_MAIN"),

	/**
	 * SUGGESTION_SOURCE_EXECUTABLE: A custom agentic flow for specific scenarios in a suggestion source
	 */
	SUGGESTION_SOURCE_EXECUTABLE("SUGGESTION_SOURCE_EXECUTABLE");

	private String value;

	EAriaAgenticFlowType(String value) {
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
	public static EAriaAgenticFlowType fromValue(String value) {
		for (EAriaAgenticFlowType b : EAriaAgenticFlowType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
