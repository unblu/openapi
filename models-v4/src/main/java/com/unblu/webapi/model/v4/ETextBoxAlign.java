
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The alignment of the text inside a text box, applied to one axis at a time: a text box has a separate horizontal and vertical alignment
 */
public enum ETextBoxAlign {

	/**
	 * START: The text is aligned to the start of the axis: to the left horizontally, to the top vertically
	 */
	START("START"),

	/**
	 * MIDDLE: The text is centered on the axis
	 */
	MIDDLE("MIDDLE"),

	/**
	 * END: The text is aligned to the end of the axis: to the right horizontally, to the bottom vertically
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
