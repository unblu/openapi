
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
 * Settings of a key pair of an OIDC identity provider. The validity applies when the key pair is generated; the warning period is kept on the key pair and can
 * be changed later.
 */
@ApiModel(description = "Settings of a key pair of an OIDC identity provider. The validity applies when the key pair is generated; the warning period is kept on the key pair and can be changed later.")

@JsonPropertyOrder({
	OidcIdentityProviderKeySettings.JSON_PROPERTY_$_TYPE,
	OidcIdentityProviderKeySettings.JSON_PROPERTY_ALGORITHM,
	OidcIdentityProviderKeySettings.JSON_PROPERTY_CERTIFICATE_VALIDITY_DAYS,
	OidcIdentityProviderKeySettings.JSON_PROPERTY_CERTIFICATE_EXPIRY_WARNING_DAYS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcIdentityProviderKeySettings {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OIDCIDENTITYPROVIDERKEYSETTINGS("OidcIdentityProviderKeySettings");

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
			return TypeEnum.OIDCIDENTITYPROVIDERKEYSETTINGS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OIDCIDENTITYPROVIDERKEYSETTINGS;

	public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
	@JsonProperty(JSON_PROPERTY_ALGORITHM)
	private EOidcSignatureAlgorithm algorithm;

	public static final String JSON_PROPERTY_CERTIFICATE_VALIDITY_DAYS = "certificateValidityDays";
	@JsonProperty(JSON_PROPERTY_CERTIFICATE_VALIDITY_DAYS)
	private Integer certificateValidityDays;

	public static final String JSON_PROPERTY_CERTIFICATE_EXPIRY_WARNING_DAYS = "certificateExpiryWarningDays";
	@JsonProperty(JSON_PROPERTY_CERTIFICATE_EXPIRY_WARNING_DAYS)
	private Integer certificateExpiryWarningDays;

	public OidcIdentityProviderKeySettings $type(TypeEnum $type) {
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

	public OidcIdentityProviderKeySettings algorithm(EOidcSignatureAlgorithm algorithm) {
		this.algorithm = algorithm;
		return this;
	}

	/**
	 * Get algorithm
	 * 
	 * @return algorithm
	 **/
	@ApiModelProperty(value = "")
	public EOidcSignatureAlgorithm getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(EOidcSignatureAlgorithm algorithm) {
		this.algorithm = algorithm;
	}

	public OidcIdentityProviderKeySettings certificateValidityDays(Integer certificateValidityDays) {
		this.certificateValidityDays = certificateValidityDays;
		return this;
	}

	/**
	 * Number of days the certificate of the key pair is valid for, counted from its generation. The identity provider rejects token requests signed with an expired
	 * certificate, so a new key pair has to be generated and activated before then. Between 1 and 3650. If omitted, it defaults to 730. Only read when a key pair
	 * is generated; when the settings of an existing key pair are updated, it must be omitted.
	 * 
	 * @return certificateValidityDays
	 **/
	@ApiModelProperty(value = "Number of days the certificate of the key pair is valid for, counted from its generation. The identity provider rejects token requests signed with an expired certificate, so a new key pair has to be generated and activated before then. Between 1 and 3650. If omitted, it defaults to 730. Only read when a key pair is generated; when the settings of an existing key pair are updated, it must be omitted.")
	public Integer getCertificateValidityDays() {
		return certificateValidityDays;
	}

	public void setCertificateValidityDays(Integer certificateValidityDays) {
		this.certificateValidityDays = certificateValidityDays;
	}

	public OidcIdentityProviderKeySettings certificateExpiryWarningDays(Integer certificateExpiryWarningDays) {
		this.certificateExpiryWarningDays = certificateExpiryWarningDays;
		return this;
	}

	/**
	 * Number of days before the certificate expires from which the key pair is flagged as expiring soon. Between 0 and 3650. If omitted, it defaults to 30 when a
	 * key pair is generated and stays unchanged when the settings of an existing key pair are updated.
	 * 
	 * @return certificateExpiryWarningDays
	 **/
	@ApiModelProperty(value = "Number of days before the certificate expires from which the key pair is flagged as expiring soon. Between 0 and 3650. If omitted, it defaults to 30 when a key pair is generated and stays unchanged when the settings of an existing key pair are updated.")
	public Integer getCertificateExpiryWarningDays() {
		return certificateExpiryWarningDays;
	}

	public void setCertificateExpiryWarningDays(Integer certificateExpiryWarningDays) {
		this.certificateExpiryWarningDays = certificateExpiryWarningDays;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OidcIdentityProviderKeySettings oidcIdentityProviderKeySettings = (OidcIdentityProviderKeySettings) o;
		return Objects.equals(this.$type, oidcIdentityProviderKeySettings.$type) &&
				Objects.equals(this.algorithm, oidcIdentityProviderKeySettings.algorithm) &&
				Objects.equals(this.certificateValidityDays, oidcIdentityProviderKeySettings.certificateValidityDays) &&
				Objects.equals(this.certificateExpiryWarningDays, oidcIdentityProviderKeySettings.certificateExpiryWarningDays);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, algorithm, certificateValidityDays, certificateExpiryWarningDays);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcIdentityProviderKeySettings {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
		sb.append("    certificateValidityDays: ").append(toIndentedString(certificateValidityDays)).append("\n");
		sb.append("    certificateExpiryWarningDays: ").append(toIndentedString(certificateExpiryWarningDays)).append("\n");
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
