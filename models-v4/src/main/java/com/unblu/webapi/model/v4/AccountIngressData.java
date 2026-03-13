
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
 * Represents an account ingress with its configuration
 */
@ApiModel(description = "Represents an account ingress with its configuration")

@JsonPropertyOrder({
	AccountIngressData.JSON_PROPERTY_$_TYPE,
	AccountIngressData.JSON_PROPERTY_ID,
	AccountIngressData.JSON_PROPERTY_ACCOUNT_ID,
	AccountIngressData.JSON_PROPERTY_ORIGIN,
	AccountIngressData.JSON_PROPERTY_ENTRY_PATH,
	AccountIngressData.JSON_PROPERTY_ALLOWED_IP_RANGES,
	AccountIngressData.JSON_PROPERTY_PRIMARY_INGRESS,
	AccountIngressData.JSON_PROPERTY_CREATION_TIMESTAMP,
	AccountIngressData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	AccountIngressData.JSON_PROPERTY_CONFIGURATION,
	AccountIngressData.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountIngressData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTINGRESSDATA("AccountIngressData");

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
			return TypeEnum.ACCOUNTINGRESSDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTINGRESSDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_ORIGIN = "origin";
	@JsonProperty(JSON_PROPERTY_ORIGIN)
	private String origin;

	public static final String JSON_PROPERTY_ENTRY_PATH = "entryPath";
	@JsonProperty(JSON_PROPERTY_ENTRY_PATH)
	private EAccountIngressEntryPath entryPath;

	public static final String JSON_PROPERTY_ALLOWED_IP_RANGES = "allowedIpRanges";
	@JsonProperty(JSON_PROPERTY_ALLOWED_IP_RANGES)
	private List<String> allowedIpRanges = null;

	public static final String JSON_PROPERTY_PRIMARY_INGRESS = "primaryIngress";
	@JsonProperty(JSON_PROPERTY_PRIMARY_INGRESS)
	private Boolean primaryIngress;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public AccountIngressData $type(TypeEnum $type) {
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

	public AccountIngressData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the account ingress
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the account ingress")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public AccountIngressData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * ID of the account the ingress belongs to
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "ID of the account the ingress belongs to")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AccountIngressData origin(String origin) {
		this.origin = origin;
		return this;
	}

	/**
	 * Origin of the account ingress
	 * 
	 * @return origin
	 **/
	@ApiModelProperty(value = "Origin of the account ingress")
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public AccountIngressData entryPath(EAccountIngressEntryPath entryPath) {
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

	public AccountIngressData allowedIpRanges(List<String> allowedIpRanges) {
		this.allowedIpRanges = allowedIpRanges;
		return this;
	}

	public AccountIngressData addAllowedIpRangesItem(String allowedIpRangesItem) {
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

	public AccountIngressData primaryIngress(Boolean primaryIngress) {
		this.primaryIngress = primaryIngress;
		return this;
	}

	/**
	 * Whether this is the primary ingress for the given entry path. Only applicable to the &#x60;EAccountIngressEntryPath.PUBLIC&#x60; entry path.
	 * 
	 * @return primaryIngress
	 **/
	@ApiModelProperty(value = "Whether this is the primary ingress for the given entry path. Only applicable to the `EAccountIngressEntryPath.PUBLIC` entry path.")
	public Boolean isPrimaryIngress() {
		return primaryIngress;
	}

	public void setPrimaryIngress(Boolean primaryIngress) {
		this.primaryIngress = primaryIngress;
	}

	public AccountIngressData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the entity was created. It is defined when the entity is stored the first time in the system.
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the entity was created. It is defined when the entity is stored the first time in the system.")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public AccountIngressData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) when the entity was last modified
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) when the entity was last modified")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public AccountIngressData _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public AccountIngressData putConfigurationItem(String key, String _configurationItem) {
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

	public AccountIngressData metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public AccountIngressData putMetadataItem(String key, String metadataItem) {
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
		AccountIngressData accountIngressData = (AccountIngressData) o;
		return Objects.equals(this.$type, accountIngressData.$type) &&
				Objects.equals(this.id, accountIngressData.id) &&
				Objects.equals(this.accountId, accountIngressData.accountId) &&
				Objects.equals(this.origin, accountIngressData.origin) &&
				Objects.equals(this.entryPath, accountIngressData.entryPath) &&
				Objects.equals(this.allowedIpRanges, accountIngressData.allowedIpRanges) &&
				Objects.equals(this.primaryIngress, accountIngressData.primaryIngress) &&
				Objects.equals(this.creationTimestamp, accountIngressData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, accountIngressData.modificationTimestamp) &&
				Objects.equals(this._configuration, accountIngressData._configuration) &&
				Objects.equals(this.metadata, accountIngressData.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, accountId, origin, entryPath, allowedIpRanges, primaryIngress, creationTimestamp, modificationTimestamp, _configuration, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountIngressData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
		sb.append("    entryPath: ").append(toIndentedString(entryPath)).append("\n");
		sb.append("    allowedIpRanges: ").append(toIndentedString(allowedIpRanges)).append("\n");
		sb.append("    primaryIngress: ").append(toIndentedString(primaryIngress)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
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
