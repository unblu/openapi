
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines whether an existing Unblu user found by matching the migration username claim against their Unblu username is migrated (linked) to this OIDC
 * provider, when no user already matches the OIDC subject. The migration username claim must be mapped for every value except &#x60;NO_MIGRATION&#x60;. For the
 * &#x60;ACCEPT_*&#x60; values, a matched user that doesn&#39;t satisfy the constraint causes the login to be rejected; this strategy doesn&#39;t govern what
 * happens when no user is matched at all; that&#39;s decided by &#x60;EOidcUserNotFoundStrategy&#x60;. &lt;p&gt; When a user is migrated, their local
 * authentication is removed: the password, two-factor authentication (2FA) secret, and recovery codes are cleared. From then on the user authenticates through
 * the OIDC provider and can no longer log in with local credentials.
 */
public enum EOidcUserMigrationStrategy {

	/**
	 * NO_MIGRATION: Don&#39;t match existing users by the migration username claim, so no user is migrated to this provider (the migration username claim must not
	 * be mapped). When no user matches the OIDC subject, the outcome is decided by &#x60;EOidcUserNotFoundStrategy&#x60;.
	 */
	NO_MIGRATION("NO_MIGRATION"),

	/**
	 * ACCEPT_VIRTUAL: Migrate a user matched by the migration username claim only if it&#39;s a virtual user; a matched non-virtual user causes the login to be
	 * rejected.
	 */
	ACCEPT_VIRTUAL("ACCEPT_VIRTUAL"),

	/**
	 * ACCEPT_EXTERNALLY_MANAGED: Migrate a user matched by the migration username claim only if it&#39;s an externally-managed user; a matched user that isn&#39;t
	 * externally managed causes the login to be rejected.
	 */
	ACCEPT_EXTERNALLY_MANAGED("ACCEPT_EXTERNALLY_MANAGED"),

	/**
	 * ACCEPT_ALL: Migrate any user matched by the migration username claim, including locally managed ones.
	 */
	ACCEPT_ALL("ACCEPT_ALL");

	private String value;

	EOidcUserMigrationStrategy(String value) {
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
	public static EOidcUserMigrationStrategy fromValue(String value) {
		for (EOidcUserMigrationStrategy b : EOidcUserMigrationStrategy.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
