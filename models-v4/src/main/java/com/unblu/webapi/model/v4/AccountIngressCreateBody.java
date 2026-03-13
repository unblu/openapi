
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
 * Body for creating an account ingress
 */
@ApiModel(description = "Body for creating an account ingress")

@JsonPropertyOrder({
	AccountIngressCreateBody.JSON_PROPERTY_$_TYPE,
	AccountIngressCreateBody.JSON_PROPERTY_ORIGIN,
	AccountIngressCreateBody.JSON_PROPERTY_ENTRY_PATH,
	AccountIngressCreateBody.JSON_PROPERTY_ALLOWED_IP_RANGES,
	AccountIngressCreateBody.JSON_PROPERTY_CONFIGURATION,
	AccountIngressCreateBody.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountIngressCreateBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTINGRESSCREATEBODY("AccountIngressCreateBody");

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
			return TypeEnum.ACCOUNTINGRESSCREATEBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTINGRESSCREATEBODY;

	public static final String JSON_PROPERTY_ORIGIN = "origin";
	@JsonProperty(JSON_PROPERTY_ORIGIN)
	private String origin;

	public static final String JSON_PROPERTY_ENTRY_PATH = "entryPath";
	@JsonProperty(JSON_PROPERTY_ENTRY_PATH)
	private EAccountIngressEntryPath entryPath;

	public static final String JSON_PROPERTY_ALLOWED_IP_RANGES = "allowedIpRanges";
	@JsonProperty(JSON_PROPERTY_ALLOWED_IP_RANGES)
	private List<String> allowedIpRanges = null;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public AccountIngressCreateBody $type(TypeEnum $type) {
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

	public AccountIngressCreateBody origin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Origin of the account ingress. Must be unique.
	 * 
	 * @return origin
	 **/
	@ApiModelProperty(value = "Origin of the account ingress. Must be unique.")
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public AccountIngressCreateBody entryPath(EAccountIngressEntryPath entryPath) {
		this.entryPath = entryPath;
		return this;
	}

	/**
	 * Get entryPath
	 * 
	 * @return entryPath
	 **/
	@ApiModelProperty(value = "")
	public EAccountIngressEntryPath getEntryPath() {
		return entryPath;
	}

	public void setEntryPath(EAccountIngressEntryPath entryPath) {
		this.entryPath = entryPath;
	}

	public AccountIngressCreateBody allowedIpRanges(List<String> allowedIpRanges) {
		this.allowedIpRanges = allowedIpRanges;
		return this;
	}

	public AccountIngressCreateBody addAllowedIpRangesItem(String allowedIpRangesItem) {
		if (this.allowedIpRanges == null) {
			this.allowedIpRanges = new ArrayList<>();
		}
		this.allowedIpRanges.add(allowedIpRangesItem);
		return this;
	}

	/**
	 * List of allowed IP ranges for the account ingress
	 * 
	 * @return allowedIpRanges
	 **/
	@ApiModelProperty(value = "List of allowed IP ranges for the account ingress")
	public List<String> getAllowedIpRanges() {
		return allowedIpRanges;
	}

	public void setAllowedIpRanges(List<String> allowedIpRanges) {
		this.allowedIpRanges = allowedIpRanges;
	}

	public AccountIngressCreateBody _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public AccountIngressCreateBody putConfigurationItem(String key, String _configurationItem) {
		if (this._configuration == null) {
			this._configuration = new HashMap<>();
		}
		this._configuration.put(key, _configurationItem);
		return this;
	}

	/**
	 * The entity&#39;s configuration properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;configuration&#39;. Not
	 * filled in webhook events.
	 * 
	 * @return _configuration
	 **/
	@ApiModelProperty(value = "The entity's configuration properties. Only contains values when the 'expand' query parameter is used with the value 'configuration'. Not filled in webhook events.")
	public Map<String, String> getConfiguration() {
		return _configuration;
	}

	public void setConfiguration(Map<String, String> _configuration) {
		this._configuration = _configuration;
	}

	public AccountIngressCreateBody metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public AccountIngressCreateBody putMetadataItem(String key, String metadataItem) {
		if (this.metadata == null) {
			this.metadata = new HashMap<>();
		}
		this.metadata.put(key, metadataItem);
		return this;
	}

	/**
	 * The entity&#39;s metadata properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;metadata&#39;. Not filled in
	 * webhook events.
	 * 
	 * @return metadata
	 **/
	@ApiModelProperty(value = "The entity's metadata properties. Only contains values when the 'expand' query parameter is used with the value 'metadata'. Not filled in webhook events.")
	public Map<String, String> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountIngressCreateBody accountIngressCreateBody = (AccountIngressCreateBody) o;
		return Objects.equals(this.$type, accountIngressCreateBody.$type) &&
				Objects.equals(this.origin, accountIngressCreateBody.origin) &&
				Objects.equals(this.entryPath, accountIngressCreateBody.entryPath) &&
				Objects.equals(this.allowedIpRanges, accountIngressCreateBody.allowedIpRanges) &&
				Objects.equals(this._configuration, accountIngressCreateBody._configuration) &&
				Objects.equals(this.metadata, accountIngressCreateBody.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, origin, entryPath, allowedIpRanges, _configuration, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountIngressCreateBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
		sb.append("    entryPath: ").append(toIndentedString(entryPath)).append("\n");
		sb.append("    allowedIpRanges: ").append(toIndentedString(allowedIpRanges)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
