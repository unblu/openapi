
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of modification of an entity
 */
public enum EntityModificationAction {

	/**
	 * CREATE: Entity was created
	 */
	CREATE("CREATE"),

	/**
	 * UPDATE: Entity was updated
	 */
	UPDATE("UPDATE"),

	/**
	 * DELETE: Entity was deleted
	 */
	DELETE("DELETE");

	private String value;

	EntityModificationAction(String value) {
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
	public static EntityModificationAction fromValue(String value) {
		for (EntityModificationAction b : EntityModificationAction.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
