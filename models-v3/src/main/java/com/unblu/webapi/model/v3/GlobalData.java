
package com.unblu.webapi.model.v3;

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
 * Entity representing the Global Unblu Server state
 */
@ApiModel(description = "Entity representing the Global Unblu Server state")

@JsonPropertyOrder({
	GlobalData.JSON_PROPERTY_$_TYPE,
	GlobalData.JSON_PROPERTY_SERVER_IDENTIFIER,
	GlobalData.JSON_PROPERTY_CURRENT_LICENSE,
	GlobalData.JSON_PROPERTY_CONFIGURATION,
	GlobalData.JSON_PROPERTY_TEXT,
	GlobalData.JSON_PROPERTY_METADATA,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class GlobalData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		GLOBALDATA("GlobalData");

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
			return TypeEnum.GLOBALDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.GLOBALDATA;

	public static final String JSON_PROPERTY_SERVER_IDENTIFIER = "serverIdentifier";
	@JsonProperty(JSON_PROPERTY_SERVER_IDENTIFIER)
	private String serverIdentifier;

	public static final String JSON_PROPERTY_CURRENT_LICENSE = "currentLicense";
	@JsonProperty(JSON_PROPERTY_CURRENT_LICENSE)
	private LicenseData currentLicense = null;

	public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
	@JsonProperty(JSON_PROPERTY_CONFIGURATION)
	private Map<String, String> _configuration = null;

	public static final String JSON_PROPERTY_TEXT = "text";
	@JsonProperty(JSON_PROPERTY_TEXT)
	private Map<String, Map<String, String>> text = null;

	public static final String JSON_PROPERTY_METADATA = "metadata";
	@JsonProperty(JSON_PROPERTY_METADATA)
	private Map<String, String> metadata = null;

	public GlobalData $type(TypeEnum $type) {
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

	public GlobalData serverIdentifier(String serverIdentifier) {
		this.serverIdentifier = serverIdentifier;
		return this;
	}

	/**
	 * A unique id identifying an Unblu installation. This is read only information it will be set by the server anyway.
	 * 
	 * @return serverIdentifier
	 **/
	@ApiModelProperty(value = "A unique id identifying an Unblu installation. This is read only information it will be set by the server anyway.")
	public String getServerIdentifier() {
		return serverIdentifier;
	}

	public void setServerIdentifier(String serverIdentifier) {
		this.serverIdentifier = serverIdentifier;
	}

	public GlobalData currentLicense(LicenseData currentLicense) {
		this.currentLicense = currentLicense;
		return this;
	}

	/**
	 * Get currentLicense
	 * 
	 * @return currentLicense
	 **/
	@ApiModelProperty(value = "")
	public LicenseData getCurrentLicense() {
		return currentLicense;
	}

	public void setCurrentLicense(LicenseData currentLicense) {
		this.currentLicense = currentLicense;
	}

	public GlobalData _configuration(Map<String, String> _configuration) {
		this._configuration = _configuration;
		return this;
	}

	public GlobalData putConfigurationItem(String key, String _configurationItem) {
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

	public GlobalData text(Map<String, Map<String, String>> text) {
		this.text = text;
		return this;
	}

	public GlobalData putTextItem(String key, Map<String, String> textItem) {
		if (this.text == null) {
			this.text = new HashMap<>();
		}
		this.text.put(key, textItem);
		return this;
	}

	/**
	 * The entity&#39;s text properties. Only contains values when the &#39;expand&#39; query parameter is used with the value &#39;text&#39;. Not filled in webhook
	 * events.
	 * 
	 * @return text
	 **/
	@ApiModelProperty(value = "The entity's text properties. Only contains values when the 'expand' query parameter is used with the value 'text'. Not filled in webhook events.")
	public Map<String, Map<String, String>> getText() {
		return text;
	}

	public void setText(Map<String, Map<String, String>> text) {
		this.text = text;
	}

	public GlobalData metadata(Map<String, String> metadata) {
		this.metadata = metadata;
		return this;
	}

	public GlobalData putMetadataItem(String key, String metadataItem) {
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
		GlobalData globalData = (GlobalData) o;
		return Objects.equals(this.$type, globalData.$type) &&
				Objects.equals(this.serverIdentifier, globalData.serverIdentifier) &&
				Objects.equals(this.currentLicense, globalData.currentLicense) &&
				Objects.equals(this._configuration, globalData._configuration) &&
				Objects.equals(this.text, globalData.text) &&
				Objects.equals(this.metadata, globalData.metadata);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, serverIdentifier, currentLicense, _configuration, text, metadata);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class GlobalData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    serverIdentifier: ").append(toIndentedString(serverIdentifier)).append("\n");
		sb.append("    currentLicense: ").append(toIndentedString(currentLicense)).append("\n");
		sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
