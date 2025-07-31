
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
 * Model of the current status of a search indexing operation
 */
@ApiModel(description = "Model of the current status of a search indexing operation")

@JsonPropertyOrder({
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_$_TYPE,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_ACCOUNT_ID,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_TYPE,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_STATUS,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_TOTAL_ESTIMATED_DOCUMENTS,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_INDEXED_DOCUMENTS,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_START_TIMESTAMP,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_END_TIMESTAMP,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_ERRORS_COUNT,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_INDEX_NAME,
	SearchIndexIndexingOperationStateData.JSON_PROPERTY_MAPPINGS_VERSION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SearchIndexIndexingOperationStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SEARCHINDEXINDEXINGOPERATIONSTATEDATA("SearchIndexIndexingOperationStateData");

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
			return TypeEnum.SEARCHINDEXINDEXINGOPERATIONSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SEARCHINDEXINDEXINGOPERATIONSTATEDATA;

	public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
	@JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
	private String accountId;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ESearchIndexType type;

	public static final String JSON_PROPERTY_STATUS = "status";
	@JsonProperty(JSON_PROPERTY_STATUS)
	private ESearchIndexReindexOperationStatus status;

	public static final String JSON_PROPERTY_TOTAL_ESTIMATED_DOCUMENTS = "totalEstimatedDocuments";
	@JsonProperty(JSON_PROPERTY_TOTAL_ESTIMATED_DOCUMENTS)
	private Long totalEstimatedDocuments;

	public static final String JSON_PROPERTY_INDEXED_DOCUMENTS = "indexedDocuments";
	@JsonProperty(JSON_PROPERTY_INDEXED_DOCUMENTS)
	private Long indexedDocuments;

	public static final String JSON_PROPERTY_START_TIMESTAMP = "startTimestamp";
	@JsonProperty(JSON_PROPERTY_START_TIMESTAMP)
	private Long startTimestamp;

	public static final String JSON_PROPERTY_END_TIMESTAMP = "endTimestamp";
	@JsonProperty(JSON_PROPERTY_END_TIMESTAMP)
	private Long endTimestamp;

	public static final String JSON_PROPERTY_ERRORS_COUNT = "errorsCount";
	@JsonProperty(JSON_PROPERTY_ERRORS_COUNT)
	private Long errorsCount;

	public static final String JSON_PROPERTY_INDEX_NAME = "indexName";
	@JsonProperty(JSON_PROPERTY_INDEX_NAME)
	private String indexName;

	public static final String JSON_PROPERTY_MAPPINGS_VERSION = "mappingsVersion";
	@JsonProperty(JSON_PROPERTY_MAPPINGS_VERSION)
	private String mappingsVersion;

	public SearchIndexIndexingOperationStateData $type(TypeEnum $type) {
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

	public SearchIndexIndexingOperationStateData accountId(String accountId) {
		this.accountId = accountId;
		return this;
	}

	/**
	 * The ID of the account
	 * 
	 * @return accountId
	 **/
	@ApiModelProperty(value = "The ID of the account")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public SearchIndexIndexingOperationStateData type(ESearchIndexType type) {
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

	public SearchIndexIndexingOperationStateData status(ESearchIndexReindexOperationStatus status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "")
	public ESearchIndexReindexOperationStatus getStatus() {
		return status;
	}

	public void setStatus(ESearchIndexReindexOperationStatus status) {
		this.status = status;
	}

	public SearchIndexIndexingOperationStateData totalEstimatedDocuments(Long totalEstimatedDocuments) {
		this.totalEstimatedDocuments = totalEstimatedDocuments;
		return this;
	}

	/**
	 * An estimate of the total number of documents to be indexed in this operation. The final number may vary if documents are deleted or created during the
	 * operation.
	 * 
	 * @return totalEstimatedDocuments
	 **/
	@ApiModelProperty(value = "An estimate of the total number of documents to be indexed in this operation. The final number may vary if documents are deleted or created during the operation.")
	public Long getTotalEstimatedDocuments() {
		return totalEstimatedDocuments;
	}

	public void setTotalEstimatedDocuments(Long totalEstimatedDocuments) {
		this.totalEstimatedDocuments = totalEstimatedDocuments;
	}

	public SearchIndexIndexingOperationStateData indexedDocuments(Long indexedDocuments) {
		this.indexedDocuments = indexedDocuments;
		return this;
	}

	/**
	 * The number of documents already indexed in the operation. When the operation has completed, this number may differ from totalEstimatedDocuments if documents
	 * were deleted or created during the operation.
	 * 
	 * @return indexedDocuments
	 **/
	@ApiModelProperty(value = "The number of documents already indexed in the operation. When the operation has completed, this number may differ from totalEstimatedDocuments if documents were deleted or created during the operation.")
	public Long getIndexedDocuments() {
		return indexedDocuments;
	}

	public void setIndexedDocuments(Long indexedDocuments) {
		this.indexedDocuments = indexedDocuments;
	}

	public SearchIndexIndexingOperationStateData startTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
		return this;
	}

	/**
	 * The start time of the indexing operation
	 * 
	 * @return startTimestamp
	 **/
	@ApiModelProperty(value = "The start time of the indexing operation")
	public Long getStartTimestamp() {
		return startTimestamp;
	}

	public void setStartTimestamp(Long startTimestamp) {
		this.startTimestamp = startTimestamp;
	}

	public SearchIndexIndexingOperationStateData endTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
		return this;
	}

	/**
	 * The end time of the indexing operation
	 * 
	 * @return endTimestamp
	 **/
	@ApiModelProperty(value = "The end time of the indexing operation")
	public Long getEndTimestamp() {
		return endTimestamp;
	}

	public void setEndTimestamp(Long endTimestamp) {
		this.endTimestamp = endTimestamp;
	}

	public SearchIndexIndexingOperationStateData errorsCount(Long errorsCount) {
		this.errorsCount = errorsCount;
		return this;
	}

	/**
	 * The number of documents that couldn&#39;t be indexed due to errors
	 * 
	 * @return errorsCount
	 **/
	@ApiModelProperty(value = "The number of documents that couldn't be indexed due to errors")
	public Long getErrorsCount() {
		return errorsCount;
	}

	public void setErrorsCount(Long errorsCount) {
		this.errorsCount = errorsCount;
	}

	public SearchIndexIndexingOperationStateData indexName(String indexName) {
		this.indexName = indexName;
		return this;
	}

	/**
	 * The name of the new index used for reindexing the documents.
	 * 
	 * @return indexName
	 **/
	@ApiModelProperty(value = "The name of the new index used for reindexing the documents.")
	public String getIndexName() {
		return indexName;
	}

	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}

	public SearchIndexIndexingOperationStateData mappingsVersion(String mappingsVersion) {
		this.mappingsVersion = mappingsVersion;
		return this;
	}

	/**
	 * The version of the mappings in the reindexing index. This matches the current version of the mappings in the product.
	 * 
	 * @return mappingsVersion
	 **/
	@ApiModelProperty(value = "The version of the mappings in the reindexing index. This matches the current version of the mappings in the product.")
	public String getMappingsVersion() {
		return mappingsVersion;
	}

	public void setMappingsVersion(String mappingsVersion) {
		this.mappingsVersion = mappingsVersion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SearchIndexIndexingOperationStateData searchIndexIndexingOperationStateData = (SearchIndexIndexingOperationStateData) o;
		return Objects.equals(this.$type, searchIndexIndexingOperationStateData.$type) &&
				Objects.equals(this.accountId, searchIndexIndexingOperationStateData.accountId) &&
				Objects.equals(this.type, searchIndexIndexingOperationStateData.type) &&
				Objects.equals(this.status, searchIndexIndexingOperationStateData.status) &&
				Objects.equals(this.totalEstimatedDocuments, searchIndexIndexingOperationStateData.totalEstimatedDocuments) &&
				Objects.equals(this.indexedDocuments, searchIndexIndexingOperationStateData.indexedDocuments) &&
				Objects.equals(this.startTimestamp, searchIndexIndexingOperationStateData.startTimestamp) &&
				Objects.equals(this.endTimestamp, searchIndexIndexingOperationStateData.endTimestamp) &&
				Objects.equals(this.errorsCount, searchIndexIndexingOperationStateData.errorsCount) &&
				Objects.equals(this.indexName, searchIndexIndexingOperationStateData.indexName) &&
				Objects.equals(this.mappingsVersion, searchIndexIndexingOperationStateData.mappingsVersion);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, accountId, type, status, totalEstimatedDocuments, indexedDocuments, startTimestamp, endTimestamp, errorsCount, indexName, mappingsVersion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SearchIndexIndexingOperationStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    totalEstimatedDocuments: ").append(toIndentedString(totalEstimatedDocuments)).append("\n");
		sb.append("    indexedDocuments: ").append(toIndentedString(indexedDocuments)).append("\n");
		sb.append("    startTimestamp: ").append(toIndentedString(startTimestamp)).append("\n");
		sb.append("    endTimestamp: ").append(toIndentedString(endTimestamp)).append("\n");
		sb.append("    errorsCount: ").append(toIndentedString(errorsCount)).append("\n");
		sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
		sb.append("    mappingsVersion: ").append(toIndentedString(mappingsVersion)).append("\n");
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
