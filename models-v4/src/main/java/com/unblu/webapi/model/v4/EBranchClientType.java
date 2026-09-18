
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets EBranchClientType
 */
public enum EBranchClientType {

	/**
	 * RECEPTION: A client operated by branch staff at a reception desk
	 */
	RECEPTION("RECEPTION"),

	/**
	 * SELF_SERVICE: A client operated by the visitor without branch staff present
	 */
	SELF_SERVICE("SELF_SERVICE"),

	/**
	 * MEETING_ROOM: A client installed in a meeting room
	 */
	MEETING_ROOM("MEETING_ROOM"),

	/**
	 * OTHER: A client that does not fall into any of the other categories
	 */
	OTHER("OTHER");

	private String value;

	EBranchClientType(String value) {
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
	public static EBranchClientType fromValue(String value) {
		for (EBranchClientType b : EBranchClientType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
