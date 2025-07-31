
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * Model of the current status of multiple search index indexing operations involving multiple accounts
 */
@ApiModel(description = "Model of the current status of multiple search index indexing operations involving multiple accounts")

@JsonPropertyOrder({
	MultiSearchIndexIndexingOperationStateData.JSON_PROPERTY_$_TYPE,
	MultiSearchIndexIndexingOperationStateData.JSON_PROPERTY_RESULTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MultiSearchIndexIndexingOperationStateData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MULTISEARCHINDEXINDEXINGOPERATIONSTATEDATA("MultiSearchIndexIndexingOperationStateData");

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
			return TypeEnum.MULTISEARCHINDEXINDEXINGOPERATIONSTATEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MULTISEARCHINDEXINDEXINGOPERATIONSTATEDATA;

	public static final String JSON_PROPERTY_RESULTS = "results";
	@JsonProperty(JSON_PROPERTY_RESULTS)
	private List<SearchIndexIndexingOperationStateData> results = null;

	public MultiSearchIndexIndexingOperationStateData $type(TypeEnum $type) {
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

	public MultiSearchIndexIndexingOperationStateData results(List<SearchIndexIndexingOperationStateData> results) {
		this.results = results;
		return this;
	}

	public MultiSearchIndexIndexingOperationStateData addResultsItem(SearchIndexIndexingOperationStateData resultsItem) {
		if (this.results == null) {
			this.results = new ArrayList<>();
		}
		this.results.add(resultsItem);
		return this;
	}

	/**
	 * The individual information about the operations
	 * 
	 * @return results
	 **/
	@ApiModelProperty(value = "The individual information about the operations")
	public List<SearchIndexIndexingOperationStateData> getResults() {
		return results;
	}

	public void setResults(List<SearchIndexIndexingOperationStateData> results) {
		this.results = results;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MultiSearchIndexIndexingOperationStateData multiSearchIndexIndexingOperationStateData = (MultiSearchIndexIndexingOperationStateData) o;
		return Objects.equals(this.$type, multiSearchIndexIndexingOperationStateData.$type) &&
				Objects.equals(this.results, multiSearchIndexIndexingOperationStateData.results);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, results);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MultiSearchIndexIndexingOperationStateData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
