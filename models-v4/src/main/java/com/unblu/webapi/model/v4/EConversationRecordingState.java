
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EConversationRecordingState
 */
public enum EConversationRecordingState {

	/**
	 * IDLE: Conversation recording is ready to be initialized
	 */
	IDLE("IDLE"),

	/**
	 * INITIALIZING: Conversation recording is initializing
	 */
	INITIALIZING("INITIALIZING"),

	/**
	 * WAITING_READY: Conversation recording is waiting for the recording entry point to become available
	 */
	WAITING_READY("WAITING_READY"),

	/**
	 * READY: Conversation recording is ready to start recording
	 */
	READY("READY"),

	/**
	 * STARTED: Conversation recording has started to record
	 */
	STARTED("STARTED"),

	/**
	 * STOPPED: Conversation recording has stopped recording
	 */
	STOPPED("STOPPED"),

	/**
	 * FAILED: Conversation recording has failed
	 */
	FAILED("FAILED");

	private String value;

	EConversationRecordingState(String value) {
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
	public static EConversationRecordingState fromValue(String value) {
		for (EConversationRecordingState b : EConversationRecordingState.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
