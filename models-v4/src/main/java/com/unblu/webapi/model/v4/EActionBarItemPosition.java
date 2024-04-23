
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The position of an item within an action bar
 */
public enum EActionBarItemPosition {

	/**
	 * ALWAYS_VISIBLE: Action is always displayed in the action bar
	 */
	ALWAYS_VISIBLE("ALWAYS_VISIBLE"),

	/**
	 * ALWAYS_IN_OVERFLOW: Action is always displayed in the overflow section of the action bar
	 */
	ALWAYS_IN_OVERFLOW("ALWAYS_IN_OVERFLOW"),

	/**
	 * SHOW_IF_POSSIBLE: Action is displayed in the action bar if there is enough space
	 */
	SHOW_IF_POSSIBLE("SHOW_IF_POSSIBLE");

	private String value;

	EActionBarItemPosition(String value) {
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
	public static EActionBarItemPosition fromValue(String value) {
		for (EActionBarItemPosition b : EActionBarItemPosition.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
