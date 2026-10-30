
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The authorization role is mainly used for access definition of a service
 */
public enum EAuthorizationRole {

	/**
	 * SUPER_ADMIN: Super admin role. Only for unblu or system admins
	 */
	SUPER_ADMIN("SUPER_ADMIN"),

	/**
	 * ACCOUNT_SUPER_ADMIN: Account super admin role.
	 */
	ACCOUNT_SUPER_ADMIN("ACCOUNT_SUPER_ADMIN"),

	/**
	 * ADMIN: Admin role. For Admins of the system
	 */
	ADMIN("ADMIN"),

	/**
	 * TECHNICAL_ADMIN: Technical admin role. A customer account admin without access to conversations or customer data. Sits below &#x60;ADMIN&#x60;: it
	 * administers the account&#39;s settings but must not reach anything carrying a conversation ID.
	 */
	TECHNICAL_ADMIN("TECHNICAL_ADMIN"),

	/**
	 * SUPERVISOR: Supervisor role. For users which manage teams
	 */
	SUPERVISOR("SUPERVISOR"),

	/**
	 * REGISTERED_USER: User role. For normal users (agents)
	 */
	REGISTERED_USER("REGISTERED_USER"),

	/**
	 * WEBUSER: Webuser role. For internal representation of users from the outside
	 */
	WEBUSER("WEBUSER"),

	/**
	 * PARTIALLY_AUTHENTICATED: Partially authenticated. For users who have logged in but haven&#39;t completed 2FA.
	 */
	PARTIALLY_AUTHENTICATED("PARTIALLY_AUTHENTICATED"),

	/**
	 * ANONYMOUS_USER: Anonymous role. For internal representation of unknown users
	 */
	ANONYMOUS_USER("ANONYMOUS_USER");

	private String value;

	EAuthorizationRole(String value) {
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
	public static EAuthorizationRole fromValue(String value) {
		for (EAuthorizationRole b : EAuthorizationRole.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
