
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ETextBoxAlign
 */
public enum ETextBoxAlign {

	/**
	 * START
	 */
	START("START"),

	/**
	 * MIDDLE
	 */
	MIDDLE("MIDDLE"),

	/**
	 * END
	 */
	END("END");

	private String value;

	ETextBoxAlign(String value) {
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
	public static ETextBoxAlign fromValue(String value) {
		for (ETextBoxAlign b : ETextBoxAlign.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
