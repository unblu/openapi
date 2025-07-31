
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
 * Model to track the state of the mappings of an index. There is at most one entity per indexing mapping type and account.
 */
@ApiModel(description = "Model to track the state of the mappings of an index. There is at most one entity per indexing mapping type and account.")

@JsonPropertyOrder({
	SearchIndexMappingsStateData.JSON_PROPERTY_$_TYPE,
	SearchIndexMappingsStateData.JSON_PROPERTY_TYPE,
	SearchIndexMappingsStateData.JSON_PROPERTY_STATUS,
	SearchIndexMappingsStateData.JSON_PROPERTY_CHECK_PRODUCT_VERSION,
	SearchIndexMappingsStateData.JSON_PROPERTY_INDEX_NAME,
	SearchIndexMappingsStateData.JSON_PROPERTY_PRODUCT_MAPPINGS_VERSION,
	SearchIndexMappingsStateData.JSON_PROPERTY_SEARCH_ENGINE_MAPPINGS_VERSION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SearchIndexMappingsStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SEARCHINDEXMAPPINGSSTATEDATA("SearchIndexMappingsStateData");

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
			return TypeEnum.SEARCHINDEXMAPPINGSSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SEARCHINDEXMAPPINGSSTATEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ESearchIndexType type;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private EIndexMappingStatus status;

	public static final String JSON_PROPERTY_CHECK_PRODUCT_VERSION = "checkProductVersion";
	@JsonProperty(JSON_PROPERTY_CHECK_PRODUCT_VERSION)
	private String checkProductVersion;

	public static final String JSON_PROPERTY_INDEX_NAME = "indexName";
	@JsonProperty(JSON_PROPERTY_INDEX_NAME)
	private String indexName;

	public static final String JSON_PROPERTY_PRODUCT_MAPPINGS_VERSION = "productMappingsVersion";
	@JsonProperty(JSON_PROPERTY_PRODUCT_MAPPINGS_VERSION)
	private String productMappingsVersion;

	public static final String JSON_PROPERTY_SEARCH_ENGINE_MAPPINGS_VERSION = "searchEngineMappingsVersion";
	@JsonProperty(JSON_PROPERTY_SEARCH_ENGINE_MAPPINGS_VERSION)
	private String searchEngineMappingsVersion;

	public SearchIndexMappingsStateData $type(TypeEnum $type) {
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

	public SearchIndexMappingsStateData type(ESearchIndexType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ESearchIndexType getType() {
		return type;
	}

	public void setType(ESearchIndexType type) {
		this.type = type;
	}

	public SearchIndexMappingsStateData status(EIndexMappingStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public EIndexMappingStatus getStatus() {
		return status;
	}

	public void setStatus(EIndexMappingStatus status) {
		this.status = status;
	}

	public SearchIndexMappingsStateData checkProductVersion(String checkProductVersion) {
		this.checkProductVersion = checkProductVersion;
		return this;
	}

	/**
	 * The product version that last checked the status of the mappings. This is useful information to avoid unnecessary checks.
	 * 
	 * @return checkProductVersion
	 **/
	@ApiModelProperty(value = "The product version that last checked the status of the mappings. This is useful information to avoid unnecessary checks.")
	public String getCheckProductVersion() {
		return checkProductVersion;
	}

	public void setCheckProductVersion(String checkProductVersion) {
		this.checkProductVersion = checkProductVersion;
	}

	public SearchIndexMappingsStateData indexName(String indexName) {
		this.indexName = indexName;
		return this;
	}

	/**
	 * The name of the index
	 * 
	 * @return indexName
	 **/
	@ApiModelProperty(value = "The name of the index")
	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public SearchIndexMappingsStateData productMappingsVersion(String productMappingsVersion) {
		this.productMappingsVersion = productMappingsVersion;
		return this;
	}

	/**
	 * The version of the mappings in the current product
	 * 
	 * @return productMappingsVersion
	 **/
	@ApiModelProperty(value = "The version of the mappings in the current product")
	public String getProductMappingsVersion() {
		return productMappingsVersion;
	}

	public void setProductMappingsVersion(String productMappingsVersion) {
		this.productMappingsVersion = productMappingsVersion;
	}

	public SearchIndexMappingsStateData searchEngineMappingsVersion(String searchEngineMappingsVersion) {
		this.searchEngineMappingsVersion = searchEngineMappingsVersion;
		return this;
	}

	/**
	 * The version of the mappings in the search engine
	 * 
	 * @return searchEngineMappingsVersion
	 **/
	@ApiModelProperty(value = "The version of the mappings in the search engine")
	public String getSearchEngineMappingsVersion() {
		return searchEngineMappingsVersion;
	}

	public void setSearchEngineMappingsVersion(String searchEngineMappingsVersion) {
		this.searchEngineMappingsVersion = searchEngineMappingsVersion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SearchIndexMappingsStateData searchIndexMappingsStateData = (SearchIndexMappingsStateData) o;
		return Objects.equals(this.$type, searchIndexMappingsStateData.$type) &&
				Objects.equals(this.type, searchIndexMappingsStateData.type) &&
				Objects.equals(this.status, searchIndexMappingsStateData.status) &&
				Objects.equals(this.checkProductVersion, searchIndexMappingsStateData.checkProductVersion) &&
				Objects.equals(this.indexName, searchIndexMappingsStateData.indexName) &&
				Objects.equals(this.productMappingsVersion, searchIndexMappingsStateData.productMappingsVersion) &&
				Objects.equals(this.searchEngineMappingsVersion, searchIndexMappingsStateData.searchEngineMappingsVersion);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, status, checkProductVersion, indexName, productMappingsVersion, searchEngineMappingsVersion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SearchIndexMappingsStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    checkProductVersion: ").append(toIndentedString(checkProductVersion)).append("\n");
		sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
		sb.append("    productMappingsVersion: ").append(toIndentedString(productMappingsVersion)).append("\n");
		sb.append("    searchEngineMappingsVersion: ").append(toIndentedString(searchEngineMappingsVersion)).append("\n");
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
