
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
 * A key pair of an OIDC identity provider as handed out by the server: the certificate and its metadata, never the private key. Key pairs are generated,
 * activated, and deleted through the key operations of the identity provider; every property is read-only.
 */
@ApiModel(description = "A key pair of an OIDC identity provider as handed out by the server: the certificate and its metadata, never the private key. Key pairs are generated, activated, and deleted through the key operations of the identity provider; every property is read-only.")

@JsonPropertyOrder({
	OidcIdentityProviderKeyData.JSON_PROPERTY_$_TYPE,
	OidcIdentityProviderKeyData.JSON_PROPERTY_ID,
	OidcIdentityProviderKeyData.JSON_PROPERTY_OIDC_IDENTITY_PROVIDER_ID,
	OidcIdentityProviderKeyData.JSON_PROPERTY_CREATION_TIMESTAMP,
	OidcIdentityProviderKeyData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	OidcIdentityProviderKeyData.JSON_PROPERTY_CERTIFICATE_EXPIRY_WARNING_DAYS,
	OidcIdentityProviderKeyData.JSON_PROPERTY_ALGORITHM,
	OidcIdentityProviderKeyData.JSON_PROPERTY_THUMBPRINT,
	OidcIdentityProviderKeyData.JSON_PROPERTY_ACTIVE,
	OidcIdentityProviderKeyData.JSON_PROPERTY_CERTIFICATE_EXPIRING_SOON,
	OidcIdentityProviderKeyData.JSON_PROPERTY_CERTIFICATE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcIdentityProviderKeyData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OIDCIDENTITYPROVIDERKEYDATA("OidcIdentityProviderKeyData");

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
			return TypeEnum.OIDCIDENTITYPROVIDERKEYDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OIDCIDENTITYPROVIDERKEYDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_OIDC_IDENTITY_PROVIDER_ID = "oidcIdentityProviderId";
	@JsonProperty(JSON_PROPERTY_OIDC_IDENTITY_PROVIDER_ID)
	private String oidcIdentityProviderId;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_CERTIFICATE_EXPIRY_WARNING_DAYS = "certificateExpiryWarningDays";
	@JsonProperty(JSON_PROPERTY_CERTIFICATE_EXPIRY_WARNING_DAYS)
	private Integer certificateExpiryWarningDays;

	public static final String JSON_PROPERTY_ALGORITHM = "algorithm";
	@JsonProperty(JSON_PROPERTY_ALGORITHM)
	private EOidcSignatureAlgorithm algorithm;

	public static final String JSON_PROPERTY_THUMBPRINT = "thumbprint";
	@JsonProperty(JSON_PROPERTY_THUMBPRINT)
	private String thumbprint;

	public static final String JSON_PROPERTY_ACTIVE = "active";
	@JsonProperty(JSON_PROPERTY_ACTIVE)
	private Boolean active;

	public static final String JSON_PROPERTY_CERTIFICATE_EXPIRING_SOON = "certificateExpiringSoon";
	@JsonProperty(JSON_PROPERTY_CERTIFICATE_EXPIRING_SOON)
	private Boolean certificateExpiringSoon;

	public static final String JSON_PROPERTY_CERTIFICATE = "certificate";
	@JsonProperty(JSON_PROPERTY_CERTIFICATE)
	private String certificate;

	public OidcIdentityProviderKeyData $type(TypeEnum $type) {
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

	public OidcIdentityProviderKeyData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The ID of the key pair. This is a read-only property.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The ID of the key pair. This is a read-only property.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OidcIdentityProviderKeyData oidcIdentityProviderId(String oidcIdentityProviderId) {
		this.oidcIdentityProviderId = oidcIdentityProviderId;
		return this;
	}

	/**
	 * The ID of the OIDC identity provider the key pair belongs to. This is a read-only property.
	 * 
	 * @return oidcIdentityProviderId
	 **/
	@ApiModelProperty(value = "The ID of the OIDC identity provider the key pair belongs to. This is a read-only property.")
	public String getOidcIdentityProviderId() {
		return oidcIdentityProviderId;
	}

	public void setOidcIdentityProviderId(String oidcIdentityProviderId) {
		this.oidcIdentityProviderId = oidcIdentityProviderId;
	}

	public OidcIdentityProviderKeyData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * The time the key pair was generated. This is a read-only property.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "The time the key pair was generated. This is a read-only property.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public OidcIdentityProviderKeyData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * The time the certificate expires. The identity provider rejects token requests signed with an expired certificate, so a new key pair has to be generated and
	 * activated before then. This is a read-only property.
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "The time the certificate expires. The identity provider rejects token requests signed with an expired certificate, so a new key pair has to be generated and activated before then. This is a read-only property.")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public OidcIdentityProviderKeyData certificateExpiryWarningDays(Integer certificateExpiryWarningDays) {
		this.certificateExpiryWarningDays = certificateExpiryWarningDays;
		return this;
	}

	/**
	 * Number of days before the certificate expires from which the key pair counts as expiring soon. Changed with &#x60;updateKeySettings&#x60;. This is a
	 * read-only property.
	 * 
	 * @return certificateExpiryWarningDays
	 **/
	@ApiModelProperty(value = "Number of days before the certificate expires from which the key pair counts as expiring soon. Changed with `updateKeySettings`. This is a read-only property.")
	public Integer getCertificateExpiryWarningDays() {
		return certificateExpiryWarningDays;
	}

	public void setCertificateExpiryWarningDays(Integer certificateExpiryWarningDays) {
		this.certificateExpiryWarningDays = certificateExpiryWarningDays;
	}

	public OidcIdentityProviderKeyData algorithm(EOidcSignatureAlgorithm algorithm) {
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

	public OidcIdentityProviderKeyData thumbprint(String thumbprint) {
		this.thumbprint = thumbprint;
		return this;
	}

	/**
	 * The SHA-1 thumbprint of the DER-encoded certificate as uppercase hex, the form in which Microsoft Entra ID lists a registered certificate. This is a
	 * read-only property.
	 * 
	 * @return thumbprint
	 **/
	@ApiModelProperty(value = "The SHA-1 thumbprint of the DER-encoded certificate as uppercase hex, the form in which Microsoft Entra ID lists a registered certificate. This is a read-only property.")
	public String getThumbprint() {
		return thumbprint;
	}

	public void setThumbprint(String thumbprint) {
		this.thumbprint = thumbprint;
	}

	public OidcIdentityProviderKeyData active(Boolean active) {
		this.active = active;
		return this;
	}

	/**
	 * Whether this is the key pair Unblu signs its token requests with. This is a read-only property.
	 * 
	 * @return active
	 **/
	@ApiModelProperty(value = "Whether this is the key pair Unblu signs its token requests with. This is a read-only property.")
	public Boolean isActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public OidcIdentityProviderKeyData certificateExpiringSoon(Boolean certificateExpiringSoon) {
		this.certificateExpiringSoon = certificateExpiringSoon;
		return this;
	}

	/**
	 * Whether the certificate expires within the key pair&#39;s warning period, or has already expired. This is a read-only property.
	 * 
	 * @return certificateExpiringSoon
	 **/
	@ApiModelProperty(value = "Whether the certificate expires within the key pair's warning period, or has already expired. This is a read-only property.")
	public Boolean isCertificateExpiringSoon() {
		return certificateExpiringSoon;
	}

	public void setCertificateExpiringSoon(Boolean certificateExpiringSoon) {
		this.certificateExpiringSoon = certificateExpiringSoon;
	}

	public OidcIdentityProviderKeyData certificate(String certificate) {
		this.certificate = certificate;
		return this;
	}

	/**
	 * The self-signed X.509 certificate of the key pair in PEM format, to be registered at the identity provider. This is a read-only property.
	 * 
	 * @return certificate
	 **/
	@ApiModelProperty(value = "The self-signed X.509 certificate of the key pair in PEM format, to be registered at the identity provider. This is a read-only property.")
	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OidcIdentityProviderKeyData oidcIdentityProviderKeyData = (OidcIdentityProviderKeyData) o;
		return Objects.equals(this.$type, oidcIdentityProviderKeyData.$type) &&
				Objects.equals(this.id, oidcIdentityProviderKeyData.id) &&
				Objects.equals(this.oidcIdentityProviderId, oidcIdentityProviderKeyData.oidcIdentityProviderId) &&
				Objects.equals(this.creationTimestamp, oidcIdentityProviderKeyData.creationTimestamp) &&
				Objects.equals(this.expirationTimestamp, oidcIdentityProviderKeyData.expirationTimestamp) &&
				Objects.equals(this.certificateExpiryWarningDays, oidcIdentityProviderKeyData.certificateExpiryWarningDays) &&
				Objects.equals(this.algorithm, oidcIdentityProviderKeyData.algorithm) &&
				Objects.equals(this.thumbprint, oidcIdentityProviderKeyData.thumbprint) &&
				Objects.equals(this.active, oidcIdentityProviderKeyData.active) &&
				Objects.equals(this.certificateExpiringSoon, oidcIdentityProviderKeyData.certificateExpiringSoon) &&
				Objects.equals(this.certificate, oidcIdentityProviderKeyData.certificate);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, oidcIdentityProviderId, creationTimestamp, expirationTimestamp, certificateExpiryWarningDays, algorithm, thumbprint, active, certificateExpiringSoon, certificate);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcIdentityProviderKeyData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    oidcIdentityProviderId: ").append(toIndentedString(oidcIdentityProviderId)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    certificateExpiryWarningDays: ").append(toIndentedString(certificateExpiryWarningDays)).append("\n");
		sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
		sb.append("    thumbprint: ").append(toIndentedString(thumbprint)).append("\n");
		sb.append("    active: ").append(toIndentedString(active)).append("\n");
		sb.append("    certificateExpiringSoon: ").append(toIndentedString(certificateExpiringSoon)).append("\n");
		sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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
