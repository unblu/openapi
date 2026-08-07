
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;oidcIdentityProvidersSetSecret&#39; operation
 */
@ApiModel(description = "Request body for the 'oidcIdentityProvidersSetSecret' operation")

@JsonPropertyOrder({
	OidcIdentityProvidersSetSecretBody.JSON_PROPERTY_SECRET,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcIdentityProvidersSetSecretBody {
	public static final String JSON_PROPERTY_SECRET = "secret";
	@JsonProperty(JSON_PROPERTY_SECRET)
	private String secret;

	public OidcIdentityProvidersSetSecretBody secret(String secret) {
		this.secret = secret;
		return this;
	}

	/**
	 * The new client secret.
	 * 
	 * @return secret
	 **/
	@ApiModelProperty(value = "The new client secret.")
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
		OidcIdentityProvidersSetSecretBody oidcIdentityProvidersSetSecretBody = (OidcIdentityProvidersSetSecretBody) o;
		return Objects.equals(this.secret, oidcIdentityProvidersSetSecretBody.secret);
	}

	@Override
	public int hashCode() {
		return Objects.hash(secret);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcIdentityProvidersSetSecretBody {\n");
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
