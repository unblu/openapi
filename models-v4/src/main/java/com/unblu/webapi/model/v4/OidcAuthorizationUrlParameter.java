
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
 * A single additional query parameter appended to the OIDC authorization request URL of an &#x60;OidcIdentityProvider&#x60;. Key and value are the raw,
 * non-URL-encoded strings; Unblu URL-encodes them when building the authorization request. &lt;p&gt; Some keys are reserved (see &#x60;RESERVED_KEYS&#x60;):
 * they are the standard OIDC authorization parameters that Unblu sets itself when building the authorization request, so they must not be configured as
 * additional parameters, otherwise they would be sent twice. &lt;p&gt; Example: a parameter with key &#x60;prompt&#x60; and value &#x60;login&#x60; produces an
 * authorization URL such as
 * &#x60;https://idp.example.com/authorize?response_type&#x3D;code&amp;client_id&#x3D;...&amp;scope&#x3D;openid&amp;state&#x3D;...&amp;prompt&#x3D;login&#x60;,
 * where &#x60;prompt&#x3D;login&#x60; is the appended parameter.
 */
@ApiModel(description = "A single additional query parameter appended to the OIDC authorization request URL of an `OidcIdentityProvider`. Key and value are the raw, non-URL-encoded strings; Unblu URL-encodes them when building the authorization request. <p> Some keys are reserved (see `RESERVED_KEYS`): they are the standard OIDC authorization parameters that Unblu sets itself when building the authorization request, so they must not be configured as additional parameters, otherwise they would be sent twice. <p> Example: a parameter with key `prompt` and value `login` produces an authorization URL such as `https://idp.example.com/authorize?response_type=code&client_id=...&scope=openid&state=...&prompt=login`, where `prompt=login` is the appended parameter.")

@JsonPropertyOrder({
	OidcAuthorizationUrlParameter.JSON_PROPERTY_$_TYPE,
	OidcAuthorizationUrlParameter.JSON_PROPERTY_KEY,
	OidcAuthorizationUrlParameter.JSON_PROPERTY_VALUE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcAuthorizationUrlParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OIDCAUTHORIZATIONURLPARAMETER("OidcAuthorizationUrlParameter");

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
			return TypeEnum.OIDCAUTHORIZATIONURLPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OIDCAUTHORIZATIONURLPARAMETER;

	public static final String JSON_PROPERTY_KEY = "key";
	@JsonProperty(JSON_PROPERTY_KEY)
	private String key;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public OidcAuthorizationUrlParameter $type(TypeEnum $type) {
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

	public OidcAuthorizationUrlParameter key(String key) {
		this.key = key;
		return this;
	}

	/**
	 * The raw (non-URL-encoded) parameter name
	 * 
	 * @return key
	 **/
	@ApiModelProperty(value = "The raw (non-URL-encoded) parameter name")
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public OidcAuthorizationUrlParameter value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * The raw (non-URL-encoded) parameter value
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "The raw (non-URL-encoded) parameter value")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OidcAuthorizationUrlParameter oidcAuthorizationUrlParameter = (OidcAuthorizationUrlParameter) o;
		return Objects.equals(this.$type, oidcAuthorizationUrlParameter.$type) &&
				Objects.equals(this.key, oidcAuthorizationUrlParameter.key) &&
				Objects.equals(this.value, oidcAuthorizationUrlParameter.value);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, key, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcAuthorizationUrlParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    key: ").append(toIndentedString(key)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
