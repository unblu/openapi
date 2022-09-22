
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;authenticatorSetDefaultLocale&#39; operation
 */
@ApiModel(description = "Request Body for the 'authenticatorSetDefaultLocale' operation")

@JsonPropertyOrder({
	AuthenticatorSetDefaultLocaleBody.JSON_PROPERTY_LOCALE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuthenticatorSetDefaultLocaleBody {
	public static final String JSON_PROPERTY_LOCALE = "locale";
	@JsonProperty(JSON_PROPERTY_LOCALE)
	private String locale;

	public AuthenticatorSetDefaultLocaleBody locale(String locale) {
		this.locale = locale;
		return this;
	}

	/**
	 * The new locale in the language-tag format (as defined in the IETF BCP 47) which should be used (e.g. en - english, de - german, fr - french, it - italian)
	 * 
	 * @return locale
	 **/
	@ApiModelProperty(value = "The new locale in the language-tag format (as defined in the IETF BCP 47) which should be used (e.g. en - english, de - german, fr - french, it - italian)")
	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AuthenticatorSetDefaultLocaleBody authenticatorSetDefaultLocaleBody = (AuthenticatorSetDefaultLocaleBody) o;
		return Objects.equals(this.locale, authenticatorSetDefaultLocaleBody.locale);
	}

	@Override
	public int hashCode() {
		return Objects.hash(locale);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuthenticatorSetDefaultLocaleBody {\n");
		sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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
