
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBotDialogFilter
 */
public enum EBotDialogFilter {

	/**
	 * VISITORS: Only handle dialogs that with visitors as the counterpart.
	 */
	VISITORS("VISITORS"),

	/**
	 * AGENTS: Only handle dialogs with agents as the counterpart
	 */
	AGENTS("AGENTS"),

	/**
	 * BOTH: Handle dialogs with both agents and visitors as the counterpart
	 */
	BOTH("BOTH"),

	/**
	 * NONE: Don&#39;t handle any dialogs.
	 */
	NONE("NONE");

	private String value;

	EBotDialogFilter(String value) {
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
	public static EBotDialogFilter fromValue(String value) {
		for (EBotDialogFilter b : EBotDialogFilter.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
