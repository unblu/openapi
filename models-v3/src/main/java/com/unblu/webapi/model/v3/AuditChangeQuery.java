
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

import io.swagger.annotations.ApiModelProperty;

/**
 * AuditChangeQuery
 */

@JsonPropertyOrder({
	AuditChangeQuery.JSON_PROPERTY_$_TYPE,
	AuditChangeQuery.JSON_PROPERTY_SEARCH_FILTERS,
	AuditChangeQuery.JSON_PROPERTY_ORDER_BY,
	AuditChangeQuery.JSON_PROPERTY_OFFSET,
	AuditChangeQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AuditChangeQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AUDITCHANGEQUERY("AuditChangeQuery");

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
			return TypeEnum.AUDITCHANGEQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AUDITCHANGEQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<AuditChangeSearchFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<AuditChangeOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public AuditChangeQuery $type(TypeEnum $type) {
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

	public AuditChangeQuery searchFilters(List<AuditChangeSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public AuditChangeQuery addSearchFiltersItem(AuditChangeSearchFilter searchFiltersItem) {
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
	public List<AuditChangeSearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<AuditChangeSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public AuditChangeQuery orderBy(List<AuditChangeOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public AuditChangeQuery addOrderByItem(AuditChangeOrderBy orderByItem) {
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
	public List<AuditChangeOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<AuditChangeOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public AuditChangeQuery offset(Integer offset) {
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

	public AuditChangeQuery limit(Integer limit) {
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
		AuditChangeQuery auditChangeQuery = (AuditChangeQuery) o;
		return Objects.equals(this.$type, auditChangeQuery.$type) &&
				Objects.equals(this.searchFilters, auditChangeQuery.searchFilters) &&
				Objects.equals(this.orderBy, auditChangeQuery.orderBy) &&
				Objects.equals(this.offset, auditChangeQuery.offset) &&
				Objects.equals(this.limit, auditChangeQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AuditChangeQuery {\n");
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
