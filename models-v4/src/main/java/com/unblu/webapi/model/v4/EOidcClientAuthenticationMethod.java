
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines how Unblu authenticates to the token endpoint of an OIDC identity provider. Each value gives the OIDC name of its method in parentheses.
 */
public enum EOidcClientAuthenticationMethod {

	/**
	 * NONE: Public client: the token request carries the client ID only (&#x60;none&#x60;).
	 */
	NONE("NONE"),

	/**
	 * CLIENT_SECRET: Authenticates with the client secret, sent in the HTTP basic authorization header of the token request (&#x60;client_secret_basic&#x60;).
	 */
	CLIENT_SECRET("CLIENT_SECRET"),

	/**
	 * PRIVATE_KEY_JWT: Authenticates with a JWT signed with the private key of the active key pair of the identity provider (&#x60;private_key_jwt&#x60;). The
	 * identity provider verifies the JWT with the certificate of that key pair, which must be registered there.
	 */
	PRIVATE_KEY_JWT("PRIVATE_KEY_JWT");

	private String value;

	EOidcClientAuthenticationMethod(String value) {
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
	public static EOidcClientAuthenticationMethod fromValue(String value) {
		for (EOidcClientAuthenticationMethod b : EOidcClientAuthenticationMethod.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
