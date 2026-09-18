
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Type of the owner of an abbreviation entry
 */
public enum EAbbreviationEntryOwnerType {

	/**
	 * ACCOUNT: The account owns the abbreviation entry. The entry is available to every user of the account.
	 */
	ACCOUNT("ACCOUNT"),

	/**
	 * USER: A user owns the abbreviation entry. Only that user&#39;s typing expands it; supervisors and administrators can still read and manage it.
	 */
	USER("USER");

	private String value;

	EAbbreviationEntryOwnerType(String value) {
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
	public static EAbbreviationEntryOwnerType fromValue(String value) {
		for (EAbbreviationEntryOwnerType b : EAbbreviationEntryOwnerType.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
