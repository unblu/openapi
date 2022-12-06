
package com.unblu.webapi.model.v3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Status of the ingress activation. This status represents the status of the users in the account regarding the scope of the username uniqueness. In order for
 * an account ingress to be fully active, the following conditions must be met: ingress_enabled&#x3D;true, ingress_activation_status&#x3D;ACTIVE and ingress
 * configuration is valid.
 */
public enum EIngressMigrationStatus {

	/**
	 * MIGRATING: The system is migrating the user uniqueness scope to its desired state (according to the ingress_enabled flag). If ingress_enabled is true, the
	 * username_scope column of all existing users is updated to the accountId. If ingress_enabled is false, then the username_scope column of all existing users is
	 * updated to GLOBAL.
	 */
	MIGRATING("MIGRATING"),

	/**
	 * DONE_INGRESS_ACTIVE: All users are migrated and the account is active with ingress (if configuration is valid)
	 */
	DONE_INGRESS_ACTIVE("DONE_INGRESS_ACTIVE"),

	/**
	 * DONE_INGRESS_INACTIVE: All users are migrated and the account is active without ingress
	 */
	DONE_INGRESS_INACTIVE("DONE_INGRESS_INACTIVE"),

	/**
	 * ERROR: The migration has failed (for example because the account contains usernames that also exist in a different account that isn&#39;t using ingress). The
	 * migration can be retried using the &#39;try again&#39; action. If doing so isn&#39;t too expensive, the UI shows a list of the users causing conflicts.
	 */
	ERROR("ERROR");

	private String value;

	EIngressMigrationStatus(String value) {
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
	public static EIngressMigrationStatus fromValue(String value) {
		for (EIngressMigrationStatus b : EIngressMigrationStatus.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
