
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
 * Object to represent the product version
 */
@ApiModel(description = "Object to represent the product version")

@JsonPropertyOrder({
	ProductVersion.JSON_PROPERTY_$_TYPE,
	ProductVersion.JSON_PROPERTY_PRODUCT_VERSION,
	ProductVersion.JSON_PROPERTY_PRODUCT_GUID,
	ProductVersion.JSON_PROPERTY_BUILD_TIMESTAMP,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ProductVersion {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PRODUCTVERSION("ProductVersion");

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
			return TypeEnum.PRODUCTVERSION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PRODUCTVERSION;

	public static final String JSON_PROPERTY_PRODUCT_VERSION = "productVersion";
	@JsonProperty(JSON_PROPERTY_PRODUCT_VERSION)
	private String productVersion;

	public static final String JSON_PROPERTY_PRODUCT_GUID = "productGuid";
	@JsonProperty(JSON_PROPERTY_PRODUCT_GUID)
	private String productGuid;

	public static final String JSON_PROPERTY_BUILD_TIMESTAMP = "buildTimestamp";
	@JsonProperty(JSON_PROPERTY_BUILD_TIMESTAMP)
	private Long buildTimestamp;

	public ProductVersion $type(TypeEnum $type) {
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

	public ProductVersion productVersion(String productVersion) {
		this.productVersion = productVersion;
		return this;
	}

	/**
	 * The version of the product
	 * 
	 * @return productVersion
	 **/
	@ApiModelProperty(value = "The version of the product")
	public String getProductVersion() {
		return productVersion;
	}

	public void setProductVersion(String productVersion) {
		this.productVersion = productVersion;
	}

	public ProductVersion productGuid(String productGuid) {
		this.productGuid = productGuid;
		return this;
	}

	/**
	 * The unique identifier of the product build
	 * 
	 * @return productGuid
	 **/
	@ApiModelProperty(value = "The unique identifier of the product build")
	public String getProductGuid() {
		return productGuid;
	}

	public void setProductGuid(String productGuid) {
		this.productGuid = productGuid;
	}

	public ProductVersion buildTimestamp(Long buildTimestamp) {
		this.buildTimestamp = buildTimestamp;
		return this;
	}

	/**
	 * Unix timestamp (ms) of the product build
	 * 
	 * @return buildTimestamp
	 **/
	@ApiModelProperty(value = "Unix timestamp (ms) of the product build")
	public Long getBuildTimestamp() {
		return buildTimestamp;
	}

	public void setBuildTimestamp(Long buildTimestamp) {
		this.buildTimestamp = buildTimestamp;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ProductVersion productVersion = (ProductVersion) o;
		return Objects.equals(this.$type, productVersion.$type) &&
				Objects.equals(this.productVersion, productVersion.productVersion) &&
				Objects.equals(this.productGuid, productVersion.productGuid) &&
				Objects.equals(this.buildTimestamp, productVersion.buildTimestamp);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, productVersion, productGuid, buildTimestamp);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ProductVersion {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
		sb.append("    productGuid: ").append(toIndentedString(productGuid)).append("\n");
		sb.append("    buildTimestamp: ").append(toIndentedString(buildTimestamp)).append("\n");
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
