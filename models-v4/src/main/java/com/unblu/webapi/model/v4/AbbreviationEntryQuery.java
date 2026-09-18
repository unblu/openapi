
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
 * Container to search abbreviation entries
 */
@ApiModel(description = "Container to search abbreviation entries")

@JsonPropertyOrder({
	AbbreviationEntryQuery.JSON_PROPERTY_$_TYPE,
	AbbreviationEntryQuery.JSON_PROPERTY_SEARCH_FILTERS,
	AbbreviationEntryQuery.JSON_PROPERTY_ORDER_BY,
	AbbreviationEntryQuery.JSON_PROPERTY_OFFSET,
	AbbreviationEntryQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AbbreviationEntryQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ABBREVIATIONENTRYQUERY("AbbreviationEntryQuery");

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
			return TypeEnum.ABBREVIATIONENTRYQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ABBREVIATIONENTRYQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<AbbreviationEntrySearchFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<AbbreviationEntryOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public AbbreviationEntryQuery $type(TypeEnum $type) {
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

	public AbbreviationEntryQuery searchFilters(List<AbbreviationEntrySearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public AbbreviationEntryQuery addSearchFiltersItem(AbbreviationEntrySearchFilter searchFiltersItem) {
		if (this.searchFilters == null) {
			this.searchFilters = new ArrayList<>();
		}
		this.searchFilters.add(searchFiltersItem);
		return this;
	}

	/**
	 * List of filters to narrow the search
	 * 
	 * @return searchFilters
	 **/
	@ApiModelProperty(value = "List of filters to narrow the search")
	public List<AbbreviationEntrySearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<AbbreviationEntrySearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public AbbreviationEntryQuery orderBy(List<AbbreviationEntryOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public AbbreviationEntryQuery addOrderByItem(AbbreviationEntryOrderBy orderByItem) {
		if (this.orderBy == null) {
			this.orderBy = new ArrayList<>();
		}
		this.orderBy.add(orderByItem);
		return this;
	}

	/**
	 * List of criteria to order the list of search results
	 * 
	 * @return orderBy
	 **/
	@ApiModelProperty(value = "List of criteria to order the list of search results")
	public List<AbbreviationEntryOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<AbbreviationEntryOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public AbbreviationEntryQuery offset(Integer offset) {
		this.offset = offset;
		return this;
	}

	/**
	 * Offset position in the result set to start pagination
	 * 
	 * @return offset
	 **/
	@ApiModelProperty(value = "Offset position in the result set to start pagination")
	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public AbbreviationEntryQuery limit(Integer limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * Maximum number of items returned
	 * 
	 * @return limit
	 **/
	@ApiModelProperty(value = "Maximum number of items returned")
	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AbbreviationEntryQuery abbreviationEntryQuery = (AbbreviationEntryQuery) o;
		return Objects.equals(this.$type, abbreviationEntryQuery.$type) &&
				Objects.equals(this.searchFilters, abbreviationEntryQuery.searchFilters) &&
				Objects.equals(this.orderBy, abbreviationEntryQuery.orderBy) &&
				Objects.equals(this.offset, abbreviationEntryQuery.offset) &&
				Objects.equals(this.limit, abbreviationEntryQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AbbreviationEntryQuery {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
		sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
		sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
		sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
