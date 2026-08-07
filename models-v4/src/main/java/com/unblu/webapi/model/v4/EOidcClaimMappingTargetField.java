
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Target fields for OIDC claim mappings. Each value represents a user attribute that can be populated from an OIDC claim.
 */
public enum EOidcClaimMappingTargetField {

	/**
	 * USERNAME: User&#39;s username.
	 */
	USERNAME("USERNAME"),

	/**
	 * MIGRATION_USERNAME: Claim whose value is matched against an existing Unblu user&#39;s username to migrate that user to this identity provider.
	 */
	MIGRATION_USERNAME("MIGRATION_USERNAME"),

	/**
	 * NICKNAME: User&#39;s nickname.
	 */
	NICKNAME("NICKNAME"),

	/**
	 * TEAM_ID: ID of the user&#39;s team. If absent, the account&#39;s default team is used.
	 */
	TEAM_ID("TEAM_ID"),

	/**
	 * ROLES: Comma-separated list of authorization role names.
	 */
	ROLES("ROLES"),

	/**
	 * ADDITIONAL_INFORMATION: Free-form additional information about the user.
	 */
	ADDITIONAL_INFORMATION("ADDITIONAL_INFORMATION"),

	/**
	 * AUTH_INFO: Free-form authentication information about the user.
	 */
	AUTH_INFO("AUTH_INFO"),

	/**
	 * FIRST_NAME: User&#39;s first name.
	 */
	FIRST_NAME("FIRST_NAME"),

	/**
	 * LAST_NAME: User&#39;s last name.
	 */
	LAST_NAME("LAST_NAME"),

	/**
	 * EMAIL: User&#39;s email address.
	 */
	EMAIL("EMAIL"),

	/**
	 * PHONE: User&#39;s phone number.
	 */
	PHONE("PHONE"),

	/**
	 * FUNCTION_TITLE: User&#39;s function title.
	 */
	FUNCTION_TITLE("FUNCTION_TITLE");

	private String value;

	EOidcClaimMappingTargetField(String value) {
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
	public static EOidcClaimMappingTargetField fromValue(String value) {
		for (EOidcClaimMappingTargetField b : EOidcClaimMappingTargetField.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
