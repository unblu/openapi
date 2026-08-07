
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The JSON Web Signature (JWS) algorithm used to verify the signatures of the tokens issued by an OIDC identity provider. The enum values match the JWS
 * algorithm names defined in RFC 7518.
 */
public enum EOidcSignatureAlgorithm {

	/**
	 * RS256: RSASSA-PKCS1-v1_5 using SHA-256.
	 */
	RS256("RS256"),

	/**
	 * RS384: RSASSA-PKCS1-v1_5 using SHA-384.
	 */
	RS384("RS384"),

	/**
	 * RS512: RSASSA-PKCS1-v1_5 using SHA-512.
	 */
	RS512("RS512"),

	/**
	 * ES256: ECDSA using the P-256 curve and SHA-256.
	 */
	ES256("ES256"),

	/**
	 * ES384: ECDSA using the P-384 curve and SHA-384.
	 */
	ES384("ES384"),

	/**
	 * ES512: ECDSA using the P-521 curve and SHA-512.
	 */
	ES512("ES512"),

	/**
	 * PS256: RSASSA-PSS using SHA-256 and MGF1 with SHA-256.
	 */
	PS256("PS256"),

	/**
	 * PS384: RSASSA-PSS using SHA-384 and MGF1 with SHA-384.
	 */
	PS384("PS384"),

	/**
	 * PS512: RSASSA-PSS using SHA-512 and MGF1 with SHA-512.
	 */
	PS512("PS512");

	private String value;

	EOidcSignatureAlgorithm(String value) {
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
	public static EOidcSignatureAlgorithm fromValue(String value) {
		for (EOidcSignatureAlgorithm b : EOidcSignatureAlgorithm.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
