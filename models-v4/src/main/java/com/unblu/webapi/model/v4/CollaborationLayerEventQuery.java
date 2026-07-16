
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
 * Container to search for a collaboration layer event
 */
@ApiModel(description = "Container to search for a collaboration layer event")

@JsonPropertyOrder({
	CollaborationLayerEventQuery.JSON_PROPERTY_$_TYPE,
	CollaborationLayerEventQuery.JSON_PROPERTY_SEARCH_FILTERS,
	CollaborationLayerEventQuery.JSON_PROPERTY_ORDER_BY,
	CollaborationLayerEventQuery.JSON_PROPERTY_OFFSET,
	CollaborationLayerEventQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CollaborationLayerEventQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		COLLABORATIONLAYEREVENTQUERY("CollaborationLayerEventQuery");

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
			return TypeEnum.COLLABORATIONLAYEREVENTQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.COLLABORATIONLAYEREVENTQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<CollaborationLayerEventSearchFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<CollaborationLayerEventOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public CollaborationLayerEventQuery $type(TypeEnum $type) {
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

	public CollaborationLayerEventQuery searchFilters(List<CollaborationLayerEventSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public CollaborationLayerEventQuery addSearchFiltersItem(CollaborationLayerEventSearchFilter searchFiltersItem) {
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
	public List<CollaborationLayerEventSearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<CollaborationLayerEventSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public CollaborationLayerEventQuery orderBy(List<CollaborationLayerEventOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public CollaborationLayerEventQuery addOrderByItem(CollaborationLayerEventOrderBy orderByItem) {
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
	public List<CollaborationLayerEventOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<CollaborationLayerEventOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public CollaborationLayerEventQuery offset(Integer offset) {
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

	public CollaborationLayerEventQuery limit(Integer limit) {
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
		CollaborationLayerEventQuery collaborationLayerEventQuery = (CollaborationLayerEventQuery) o;
		return Objects.equals(this.$type, collaborationLayerEventQuery.$type) &&
				Objects.equals(this.searchFilters, collaborationLayerEventQuery.searchFilters) &&
				Objects.equals(this.orderBy, collaborationLayerEventQuery.orderBy) &&
				Objects.equals(this.offset, collaborationLayerEventQuery.offset) &&
				Objects.equals(this.limit, collaborationLayerEventQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CollaborationLayerEventQuery {\n");
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
