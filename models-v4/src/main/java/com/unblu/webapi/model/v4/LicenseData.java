
package com.unblu.webapi.model.v4;

import java.util.HashMap;
import java.util.Map;
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
 * Entity representing the current installed license
 */
@ApiModel(description = "Entity representing the current installed license")

@JsonPropertyOrder({
	LicenseData.JSON_PROPERTY_$_TYPE,
	LicenseData.JSON_PROPERTY_STATE,
	LicenseData.JSON_PROPERTY_LICENSE_ID,
	LicenseData.JSON_PROPERTY_EXPIRATION_TIMESTAMP,
	LicenseData.JSON_PROPERTY_FEATURES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LicenseData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LICENSEDATA("LicenseData");

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
			return TypeEnum.LICENSEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LICENSEDATA;

	public static final String JSON_PROPERTY_STATE = "state";
	@JsonProperty(JSON_PROPERTY_STATE)
	private ELicenseState state;

	public static final String JSON_PROPERTY_LICENSE_ID = "licenseId";
	@JsonProperty(JSON_PROPERTY_LICENSE_ID)
	private String licenseId;

	public static final String JSON_PROPERTY_EXPIRATION_TIMESTAMP = "expirationTimestamp";
	@JsonProperty(JSON_PROPERTY_EXPIRATION_TIMESTAMP)
	private Long expirationTimestamp;

	public static final String JSON_PROPERTY_FEATURES = "features";
	@JsonProperty(JSON_PROPERTY_FEATURES)
	private Map<String, Object> features = null;

	public LicenseData $type(TypeEnum $type) {
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

	public LicenseData state(ELicenseState state) {
		this.state = state;
		return this;
	}

	/**
	 * Get state
	 * 
	 * @return state
	 **/
	@ApiModelProperty(value = "")
	public ELicenseState getState() {
		return state;
	}

	public void setState(ELicenseState state) {
		this.state = state;
	}

	public LicenseData licenseId(String licenseId) {
		this.licenseId = licenseId;
		return this;
	}

	/**
	 * ID of the current license. Is null when no license is installed. This is read only information that will changed when a new license is installed.
	 * 
	 * @return licenseId
	 **/
	@ApiModelProperty(value = "ID of the current license. Is null when no license is installed. This is read only information that will changed when a new license is installed.")
	public String getLicenseId() {
		return licenseId;
	}

	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}

	public LicenseData expirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the current license will expires. Is null when no license is installed. This is read only information that will changed when a new
	 * license is installed.
	 * 
	 * @return expirationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the current license will expires. Is null when no license is installed. This is read only information that will changed when a new license is installed.")
	public Long getExpirationTimestamp() {
		return expirationTimestamp;
	}

	public void setExpirationTimestamp(Long expirationTimestamp) {
		this.expirationTimestamp = expirationTimestamp;
	}

	public LicenseData features(Map<String, Object> features) {
		this.features = features;
		return this;
	}

	public LicenseData putFeaturesItem(String key, Object featuresItem) {
		if (this.features == null) {
			this.features = new HashMap<>();
		}
		this.features.put(key, featuresItem);
		return this;
	}

	/**
	 * features contained in the license.
	 * 
	 * @return features
	 **/
	@ApiModelProperty(value = "features contained in the license.")
	public Map<String, Object> getFeatures() {
		return features;
	}

	public void setFeatures(Map<String, Object> features) {
		this.features = features;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LicenseData licenseData = (LicenseData) o;
		return Objects.equals(this.$type, licenseData.$type) &&
				Objects.equals(this.state, licenseData.state) &&
				Objects.equals(this.licenseId, licenseData.licenseId) &&
				Objects.equals(this.expirationTimestamp, licenseData.expirationTimestamp) &&
				Objects.equals(this.features, licenseData.features);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, state, licenseId, expirationTimestamp, features);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LicenseData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    state: ").append(toIndentedString(state)).append("\n");
		sb.append("    licenseId: ").append(toIndentedString(licenseId)).append("\n");
		sb.append("    expirationTimestamp: ").append(toIndentedString(expirationTimestamp)).append("\n");
		sb.append("    features: ").append(toIndentedString(features)).append("\n");
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
