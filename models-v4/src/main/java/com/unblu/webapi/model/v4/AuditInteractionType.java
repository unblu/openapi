
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets AuditInteractionType
 */
public enum AuditInteractionType {

	/**
	 * API: The change was triggered by a call to the public web API.
	 */
	API("API"),

	/**
	 * RPC: The change was triggered by an RPC call from a client (Agent Desk or visitor UI).
	 */
	RPC("RPC"),

	/**
	 * JOB: The change was triggered by a scheduled background job.
	 */
	JOB("JOB"),

	/**
	 * ACTION: The change was triggered by an explicit administrative action.
	 */
	ACTION("ACTION"),

	/**
	 * INTERNAL: The change was triggered by server-internal logic without an external caller.
	 */
	INTERNAL("INTERNAL"),

	/**
	 * SYNCJOB: The change was triggered by a synchronization job importing data from an external system.
	 */
	SYNCJOB("SYNCJOB"),

	/**
	 * GC: The change was triggered by the garbage collector cleaning up expired data.
	 */
	GC("GC");

	private String value;

	AuditInteractionType(String value) {
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
	public static AuditInteractionType fromValue(String value) {
		for (AuditInteractionType b : AuditInteractionType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
