
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationSummarizationState
 */
public enum EConversationSummarizationState {

	/**
	 * PENDING: Conversation summary creation requested but awaiting processing start. Next states can be PROCESSING or FAILED.
	 */
	PENDING("PENDING"),

	/**
	 * PROCESSING: Conversation summary generation currently in progress. Next states can be DRAFT, GENERATED or FAILED.
	 */
	PROCESSING("PROCESSING"),

	/**
	 * FAILED: Conversation summary generation ended with an error
	 */
	FAILED("FAILED"),

	/**
	 * DRAFT: Conversation summary completed but requires approval before finalization. Next states can be APPROVED or REJECTED.
	 */
	DRAFT("DRAFT"),

	/**
	 * APPROVED: Conversation summary completed and approved. It is a final state.
	 */
	APPROVED("APPROVED"),

	/**
	 * REJECTED: Conversation summary completed but rejected. It is a final state.
	 */
	REJECTED("REJECTED"),

	/**
	 * GENERATED: Conversation summary successfully created and ready (no approval needed). It is a final state.
	 */
	GENERATED("GENERATED"),

	/**
	 * DISMISSED: Conversation summary ended with an error. It is a final state.
	 */
	DISMISSED("DISMISSED");

	private String value;

	EConversationSummarizationState(String value) {
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
	public static EConversationSummarizationState fromValue(String value) {
		for (EConversationSummarizationState b : EConversationSummarizationState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
