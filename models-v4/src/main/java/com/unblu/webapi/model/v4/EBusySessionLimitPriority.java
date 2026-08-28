
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Enumeration that makes it easier to deal with the different busyStateSessionLimitXXX configuration properties. &lt;p&gt; The order in which the elements is
 * defined is important! They are orderer from higher to lower priority &lt;p&gt; The constants carry no state, so that the enum can be used as a field of a
 * transferable model.
 */
public enum EBusySessionLimitPriority {

	/**
	 * PRIORITY_1
	 */
	PRIORITY_1("PRIORITY_1"),

	/**
	 * PRIORITY_2
	 */
	PRIORITY_2("PRIORITY_2"),

	/**
	 * PRIORITY_3
	 */
	PRIORITY_3("PRIORITY_3"),

	/**
	 * PRIORITY_4
	 */
	PRIORITY_4("PRIORITY_4");

	private String value;

	EBusySessionLimitPriority(String value) {
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
	public static EBusySessionLimitPriority fromValue(String value) {
		for (EBusySessionLimitPriority b : EBusySessionLimitPriority.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
