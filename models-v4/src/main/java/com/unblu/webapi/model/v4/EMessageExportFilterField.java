
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EMessageExportFilterField
 */
public enum EMessageExportFilterField {

	/**
	 * SEND_TIMESTAMP: Filter by the &#39;sendTimestamp&#39; attribute. Specify the timestamp in the UTC timezone with milliseconds.
	 */
	SEND_TIMESTAMP("SEND_TIMESTAMP"),

	/**
	 * SEND_OR_LAST_EDITED_TIMESTAMP: Filter by the &#39;sendTimestamp&#39; or the &#39;lastEditedTimestamp&#39; attribute: a message matches if either of the two
	 * matches the operator. Use it to export all messages of a time range, including messages sent before the range whose content was last edited within it.
	 * Specify the timestamp in the UTC timezone with milliseconds.
	 */
	SEND_OR_LAST_EDITED_TIMESTAMP("SEND_OR_LAST_EDITED_TIMESTAMP");

	private String value;

	EMessageExportFilterField(String value) {
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
	public static EMessageExportFilterField fromValue(String value) {
		for (EMessageExportFilterField b : EMessageExportFilterField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
