
package com.unblu.webapi.model.v3;

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
 * Container to search canned response usages
 */
@ApiModel(description = "Container to search canned response usages")

@JsonPropertyOrder({
	CannedResponseUsageQuery.JSON_PROPERTY_$_TYPE,
	CannedResponseUsageQuery.JSON_PROPERTY_SEARCH_FILTERS,
	CannedResponseUsageQuery.JSON_PROPERTY_ORDER_BY,
	CannedResponseUsageQuery.JSON_PROPERTY_OFFSET,
	CannedResponseUsageQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CannedResponseUsageQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CANNEDRESPONSEUSAGEQUERY("CannedResponseUsageQuery");

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
			return TypeEnum.CANNEDRESPONSEUSAGEQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CANNEDRESPONSEUSAGEQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<CannedResponseUsageSearchFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<CannedResponseUsageOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public CannedResponseUsageQuery $type(TypeEnum $type) {
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

	public CannedResponseUsageQuery searchFilters(List<CannedResponseUsageSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public CannedResponseUsageQuery addSearchFiltersItem(CannedResponseUsageSearchFilter searchFiltersItem) {
		if (this.searchFilters == null) {
			this.searchFilters = new ArrayList<>();
		}
		this.searchFilters.add(searchFiltersItem);
		return this;
	}

	/**
	 * List of filters to narrow the search of entities
	 * 
	 * @return searchFilters
	 **/
	@ApiModelProperty(value = "List of filters to narrow the search of entities")
	public List<CannedResponseUsageSearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<CannedResponseUsageSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public CannedResponseUsageQuery orderBy(List<CannedResponseUsageOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public CannedResponseUsageQuery addOrderByItem(CannedResponseUsageOrderBy orderByItem) {
		if (this.orderBy == null) {
			this.orderBy = new ArrayList<>();
		}
		this.orderBy.add(orderByItem);
		return this;
	}

	/**
	 * List of criteria to order the search result list
	 * 
	 * @return orderBy
	 **/
	@ApiModelProperty(value = "List of criteria to order the search result list")
	public List<CannedResponseUsageOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<CannedResponseUsageOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public CannedResponseUsageQuery offset(Integer offset) {
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

	public CannedResponseUsageQuery limit(Integer limit) {
		this.limit = limit;
		return this;
	}

	/**
	 * Maximal amount of items returned
	 * 
	 * @return limit
	 **/
	@ApiModelProperty(value = "Maximal amount of items returned")
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
		CannedResponseUsageQuery cannedResponseUsageQuery = (CannedResponseUsageQuery) o;
		return Objects.equals(this.$type, cannedResponseUsageQuery.$type) &&
				Objects.equals(this.searchFilters, cannedResponseUsageQuery.searchFilters) &&
				Objects.equals(this.orderBy, cannedResponseUsageQuery.orderBy) &&
				Objects.equals(this.offset, cannedResponseUsageQuery.offset) &&
				Objects.equals(this.limit, cannedResponseUsageQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CannedResponseUsageQuery {\n");
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
