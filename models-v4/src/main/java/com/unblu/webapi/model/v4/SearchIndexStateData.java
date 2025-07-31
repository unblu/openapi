
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
 * Model for the state of a search index
 */
@ApiModel(description = "Model for the state of a search index")

@JsonPropertyOrder({
	SearchIndexStateData.JSON_PROPERTY_$_TYPE,
	SearchIndexStateData.JSON_PROPERTY_TYPE,
	SearchIndexStateData.JSON_PROPERTY_INDEXED_DOCUMENTS_COUNT,
	SearchIndexStateData.JSON_PROPERTY_LAST_UPDATED_TIMESTAMP,
	SearchIndexStateData.JSON_PROPERTY_MAPPINGS_STATE,
	SearchIndexStateData.JSON_PROPERTY_INDEXING_OPERATION_STATE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class SearchIndexStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SEARCHINDEXSTATEDATA("SearchIndexStateData");

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
			return TypeEnum.SEARCHINDEXSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SEARCHINDEXSTATEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ESearchIndexType type;

	public static final String JSON_PROPERTY_INDEXED_DOCUMENTS_COUNT = "indexedDocumentsCount";
	@JsonProperty(JSON_PROPERTY_INDEXED_DOCUMENTS_COUNT)
	private Long indexedDocumentsCount;

	public static final String JSON_PROPERTY_LAST_UPDATED_TIMESTAMP = "lastUpdatedTimestamp";
	@JsonProperty(JSON_PROPERTY_LAST_UPDATED_TIMESTAMP)
	private Long lastUpdatedTimestamp;

	public static final String JSON_PROPERTY_MAPPINGS_STATE = "mappingsState";
	@JsonProperty(JSON_PROPERTY_MAPPINGS_STATE)
	private SearchIndexMappingsStateData mappingsState = null;

	public static final String JSON_PROPERTY_INDEXING_OPERATION_STATE = "indexingOperationState";
	@JsonProperty(JSON_PROPERTY_INDEXING_OPERATION_STATE)
	private SearchIndexIndexingOperationStateData indexingOperationState = null;

	public SearchIndexStateData $type(TypeEnum $type) {
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

	public SearchIndexStateData type(ESearchIndexType type) {
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

	public SearchIndexStateData indexedDocumentsCount(Long indexedDocumentsCount) {
		this.indexedDocumentsCount = indexedDocumentsCount;
		return this;
	}

	/**
	 * The number of indexed documents
	 * 
	 * @return indexedDocumentsCount
	 **/
	@ApiModelProperty(value = "The number of indexed documents")
	public Long getIndexedDocumentsCount() {
		return indexedDocumentsCount;
	}

	public void setIndexedDocumentsCount(Long indexedDocumentsCount) {
		this.indexedDocumentsCount = indexedDocumentsCount;
	}

	public SearchIndexStateData lastUpdatedTimestamp(Long lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
		return this;
	}

	/**
	 * The last time a document was indexed in the index
	 * 
	 * @return lastUpdatedTimestamp
	 **/
	@ApiModelProperty(value = "The last time a document was indexed in the index")
	public Long getLastUpdatedTimestamp() {
		return lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public SearchIndexStateData mappingsState(SearchIndexMappingsStateData mappingsState) {
		this.mappingsState = mappingsState;
		return this;
	}

	/**
	 * Get mappingsState
	 * 
	 * @return mappingsState
	 **/
	@ApiModelProperty(value = "")
	public SearchIndexMappingsStateData getMappingsState() {
		return mappingsState;
	}

	public void setMappingsState(SearchIndexMappingsStateData mappingsState) {
		this.mappingsState = mappingsState;
	}

	public SearchIndexStateData indexingOperationState(SearchIndexIndexingOperationStateData indexingOperationState) {
		this.indexingOperationState = indexingOperationState;
		return this;
	}

	/**
	 * Get indexingOperationState
	 * 
	 * @return indexingOperationState
	 **/
	@ApiModelProperty(value = "")
	public SearchIndexIndexingOperationStateData getIndexingOperationState() {
		return indexingOperationState;
	}

	public void setIndexingOperationState(SearchIndexIndexingOperationStateData indexingOperationState) {
		this.indexingOperationState = indexingOperationState;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		SearchIndexStateData searchIndexStateData = (SearchIndexStateData) o;
		return Objects.equals(this.$type, searchIndexStateData.$type) &&
				Objects.equals(this.type, searchIndexStateData.type) &&
				Objects.equals(this.indexedDocumentsCount, searchIndexStateData.indexedDocumentsCount) &&
				Objects.equals(this.lastUpdatedTimestamp, searchIndexStateData.lastUpdatedTimestamp) &&
				Objects.equals(this.mappingsState, searchIndexStateData.mappingsState) &&
				Objects.equals(this.indexingOperationState, searchIndexStateData.indexingOperationState);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, indexedDocumentsCount, lastUpdatedTimestamp, mappingsState, indexingOperationState);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class SearchIndexStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    indexedDocumentsCount: ").append(toIndentedString(indexedDocumentsCount)).append("\n");
		sb.append("    lastUpdatedTimestamp: ").append(toIndentedString(lastUpdatedTimestamp)).append("\n");
		sb.append("    mappingsState: ").append(toIndentedString(mappingsState)).append("\n");
		sb.append("    indexingOperationState: ").append(toIndentedString(indexingOperationState)).append("\n");
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
