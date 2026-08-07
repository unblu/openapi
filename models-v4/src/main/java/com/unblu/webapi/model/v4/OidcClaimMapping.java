
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
 * Maps an OIDC claim to a target user attribute for an &#x60;OidcIdentityProvider&#x60;.
 */
@ApiModel(description = "Maps an OIDC claim to a target user attribute for an `OidcIdentityProvider`.")

@JsonPropertyOrder({
	OidcClaimMapping.JSON_PROPERTY_$_TYPE,
	OidcClaimMapping.JSON_PROPERTY_ID,
	OidcClaimMapping.JSON_PROPERTY_OIDC_IDENTITY_PROVIDER_ID,
	OidcClaimMapping.JSON_PROPERTY_TARGET_FIELD,
	OidcClaimMapping.JSON_PROPERTY_CLAIM_NAME,
	OidcClaimMapping.JSON_PROPERTY_REGEX,
	OidcClaimMapping.JSON_PROPERTY_REGEX_GROUP_SELECTOR,
	OidcClaimMapping.JSON_PROPERTY_REGEX_CASE_INSENSITIVE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class OidcClaimMapping {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		OIDCCLAIMMAPPING("OidcClaimMapping");

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
			return TypeEnum.OIDCCLAIMMAPPING;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.OIDCCLAIMMAPPING;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_OIDC_IDENTITY_PROVIDER_ID = "oidcIdentityProviderId";
	@JsonProperty(JSON_PROPERTY_OIDC_IDENTITY_PROVIDER_ID)
	private String oidcIdentityProviderId;

	public static final String JSON_PROPERTY_TARGET_FIELD = "targetField";
	@JsonProperty(JSON_PROPERTY_TARGET_FIELD)
	private EOidcClaimMappingTargetField targetField;

	public static final String JSON_PROPERTY_CLAIM_NAME = "claimName";
	@JsonProperty(JSON_PROPERTY_CLAIM_NAME)
	private String claimName;

	public static final String JSON_PROPERTY_REGEX = "regex";
	@JsonProperty(JSON_PROPERTY_REGEX)
	private String regex;

	public static final String JSON_PROPERTY_REGEX_GROUP_SELECTOR = "regexGroupSelector";
	@JsonProperty(JSON_PROPERTY_REGEX_GROUP_SELECTOR)
	private Integer regexGroupSelector;

	public static final String JSON_PROPERTY_REGEX_CASE_INSENSITIVE = "regexCaseInsensitive";
	@JsonProperty(JSON_PROPERTY_REGEX_CASE_INSENSITIVE)
	private Boolean regexCaseInsensitive;

	public OidcClaimMapping $type(TypeEnum $type) {
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

	public OidcClaimMapping id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public OidcClaimMapping oidcIdentityProviderId(String oidcIdentityProviderId) {
		this.oidcIdentityProviderId = oidcIdentityProviderId;
		return this;
	}

	/**
	 * The ID of the OIDC identity provider this mapping belongs to
	 * 
	 * @return oidcIdentityProviderId
	 **/
	@ApiModelProperty(value = "The ID of the OIDC identity provider this mapping belongs to")
	public String getOidcIdentityProviderId() {
		return oidcIdentityProviderId;
	}

	public void setOidcIdentityProviderId(String oidcIdentityProviderId) {
		this.oidcIdentityProviderId = oidcIdentityProviderId;
	}

	public OidcClaimMapping targetField(EOidcClaimMappingTargetField targetField) {
		this.targetField = targetField;
		return this;
	}

	/**
	 * Get targetField
	 * 
	 * @return targetField
	 **/
	@ApiModelProperty(value = "")
	public EOidcClaimMappingTargetField getTargetField() {
		return targetField;
	}

	public void setTargetField(EOidcClaimMappingTargetField targetField) {
		this.targetField = targetField;
	}

	public OidcClaimMapping claimName(String claimName) {
		this.claimName = claimName;
		return this;
	}

	/**
	 * The name of the OIDC claim to read the value from
	 * 
	 * @return claimName
	 **/
	@ApiModelProperty(value = "The name of the OIDC claim to read the value from")
	public String getClaimName() {
		return claimName;
	}

	public void setClaimName(String claimName) {
		this.claimName = claimName;
	}

	public OidcClaimMapping regex(String regex) {
		this.regex = regex;
		return this;
	}

	/**
	 * Optional regex applied to the raw claim value to extract the final mapped value
	 * 
	 * @return regex
	 **/
	@ApiModelProperty(value = "Optional regex applied to the raw claim value to extract the final mapped value")
	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	public OidcClaimMapping regexGroupSelector(Integer regexGroupSelector) {
		this.regexGroupSelector = regexGroupSelector;
		return this;
	}

	/**
	 * Capture group index of &#x60;regex&#x60; to return as the mapped value (0 &#x3D; full match)
	 * 
	 * @return regexGroupSelector
	 **/
	@ApiModelProperty(value = "Capture group index of `regex` to return as the mapped value (0 = full match)")
	public Integer getRegexGroupSelector() {
		return regexGroupSelector;
	}

	public void setRegexGroupSelector(Integer regexGroupSelector) {
		this.regexGroupSelector = regexGroupSelector;
	}

	public OidcClaimMapping regexCaseInsensitive(Boolean regexCaseInsensitive) {
		this.regexCaseInsensitive = regexCaseInsensitive;
		return this;
	}

	/**
	 * If true, the regex is matched case-insensitively
	 * 
	 * @return regexCaseInsensitive
	 **/
	@ApiModelProperty(value = "If true, the regex is matched case-insensitively")
	public Boolean isRegexCaseInsensitive() {
		return regexCaseInsensitive;
	}

	public void setRegexCaseInsensitive(Boolean regexCaseInsensitive) {
		this.regexCaseInsensitive = regexCaseInsensitive;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		OidcClaimMapping oidcClaimMapping = (OidcClaimMapping) o;
		return Objects.equals(this.$type, oidcClaimMapping.$type) &&
				Objects.equals(this.id, oidcClaimMapping.id) &&
				Objects.equals(this.oidcIdentityProviderId, oidcClaimMapping.oidcIdentityProviderId) &&
				Objects.equals(this.targetField, oidcClaimMapping.targetField) &&
				Objects.equals(this.claimName, oidcClaimMapping.claimName) &&
				Objects.equals(this.regex, oidcClaimMapping.regex) &&
				Objects.equals(this.regexGroupSelector, oidcClaimMapping.regexGroupSelector) &&
				Objects.equals(this.regexCaseInsensitive, oidcClaimMapping.regexCaseInsensitive);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, oidcIdentityProviderId, targetField, claimName, regex, regexGroupSelector, regexCaseInsensitive);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class OidcClaimMapping {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    oidcIdentityProviderId: ").append(toIndentedString(oidcIdentityProviderId)).append("\n");
		sb.append("    targetField: ").append(toIndentedString(targetField)).append("\n");
		sb.append("    claimName: ").append(toIndentedString(claimName)).append("\n");
		sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
		sb.append("    regexGroupSelector: ").append(toIndentedString(regexGroupSelector)).append("\n");
		sb.append("    regexCaseInsensitive: ").append(toIndentedString(regexCaseInsensitive)).append("\n");
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
