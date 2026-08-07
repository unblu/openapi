
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * A container for an OIDC identity provider and its client secret. This is needed because the provider object never contains the client secret. This container
 * is used when creating or updating a provider with a specific secret.
 */
@ApiModel(description = "A container for an OIDC identity provider and its client secret. This is needed because the provider object never contains the client secret. This container is used when creating or updating a provider with a specific secret.")

@JsonPropertyOrder({
	OidcIdentityProviderSecretContainer.JSON_PROPERTY_$_TYPE,
	OidcIdentityProviderSecretContainer.JSON_PROPERTY_OIDC_IDENTITY_PROVIDER,
	OidcIdentityProviderSecretContainer.JSON_PROPERTY_SECRET,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcIdentityProviderSecretContainer {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OIDCIDENTITYPROVIDERSECRETCONTAINER("OidcIdentityProviderSecretContainer");

		private String value;

		TypeEnum(String value) {
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
		public static TypeEnum fromValue(String value) {
			for (TypeEnum b : TypeEnum.values()) {
				if (b.value.equals(value)) {
					return b;
				}
			}
			return TypeEnum.OIDCIDENTITYPROVIDERSECRETCONTAINER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OIDCIDENTITYPROVIDERSECRETCONTAINER;

	public static final String JSON_PROPERTY_OIDC_IDENTITY_PROVIDER = "oidcIdentityProvider";
	@JsonProperty(JSON_PROPERTY_OIDC_IDENTITY_PROVIDER)
	private OidcIdentityProviderData oidcIdentityProvider = null;

	public static final String JSON_PROPERTY_SECRET = "secret";
	@JsonProperty(JSON_PROPERTY_SECRET)
	private String secret;

	public OidcIdentityProviderSecretContainer $type(TypeEnum $type) {
		this.$type = $type;
		return this;
	}

	/**
	 * Get $type
	 * 
	 * @return $type
	 **/
	@ApiModelProperty(value = "")
	public TypeEnum get$Type() {
		return $type;
	}

	public void set$Type(TypeEnum $type) {
		this.$type = $type;
	}

	public OidcIdentityProviderSecretContainer oidcIdentityProvider(OidcIdentityProviderData oidcIdentityProvider) {
		this.oidcIdentityProvider = oidcIdentityProvider;
		return this;
	}

	/**
	 * Get oidcIdentityProvider
	 * 
	 * @return oidcIdentityProvider
	 **/
	@ApiModelProperty(value = "")
	public OidcIdentityProviderData getOidcIdentityProvider() {
		return oidcIdentityProvider;
	}

	public void setOidcIdentityProvider(OidcIdentityProviderData oidcIdentityProvider) {
		this.oidcIdentityProvider = oidcIdentityProvider;
	}

	public OidcIdentityProviderSecretContainer secret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * The client secret. &lt;p&gt; NOTE: This can only be used to set a secret. The server always returns null.
	 * 
	 * @return secret
	 **/
	@ApiModelProperty(value = "The client secret. <p> NOTE: This can only be used to set a secret. The server always returns null.")
	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OidcIdentityProviderSecretContainer oidcIdentityProviderSecretContainer = (OidcIdentityProviderSecretContainer) o;
		return Objects.equals(this.$type, oidcIdentityProviderSecretContainer.$type) &&
				Objects.equals(this.oidcIdentityProvider, oidcIdentityProviderSecretContainer.oidcIdentityProvider) &&
				Objects.equals(this.secret, oidcIdentityProviderSecretContainer.secret);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, oidcIdentityProvider, secret);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcIdentityProviderSecretContainer {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    oidcIdentityProvider: ").append(toIndentedString(oidcIdentityProvider)).append("\n");
		sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

}
