
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
 * Query object for searching analytics KPI data records via the data access web API. &lt;p&gt; Supports filtering by event timestamp range (via
 * &#x60;AnalyticsKpiDataQueryFilter&#x60;), ordering by event timestamp (via&#x60;AnalyticsKpiDataQueryOrderBy&#x60;), and pagination through offset and limit
 * inherited from &#x60;AbstractQuery&#x60;.&lt;br&gt;@see AnalyticsKpiDataQueryFilter&lt;br&gt;@see AnalyticsKpiDataQueryOrderBy&lt;br&gt;@see
 * IAnalyticsDataApiService
 */
@ApiModel(description = "Query object for searching analytics KPI data records via the data access web API. <p> Supports filtering by event timestamp range (via `AnalyticsKpiDataQueryFilter`), ordering by event timestamp (via`AnalyticsKpiDataQueryOrderBy`), and pagination through offset and limit inherited from `AbstractQuery`.<br>@see AnalyticsKpiDataQueryFilter<br>@see AnalyticsKpiDataQueryOrderBy<br>@see IAnalyticsDataApiService")

@JsonPropertyOrder({
	AnalyticsKpiDataQuery.JSON_PROPERTY_$_TYPE,
	AnalyticsKpiDataQuery.JSON_PROPERTY_SEARCH_FILTERS,
	AnalyticsKpiDataQuery.JSON_PROPERTY_ORDER_BY,
	AnalyticsKpiDataQuery.JSON_PROPERTY_OFFSET,
	AnalyticsKpiDataQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AnalyticsKpiDataQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ANALYTICSKPIDATAQUERY("AnalyticsKpiDataQuery");

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
			return TypeEnum.ANALYTICSKPIDATAQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ANALYTICSKPIDATAQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<AnalyticsKpiDataQueryFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<AnalyticsKpiDataQueryOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public AnalyticsKpiDataQuery $type(TypeEnum $type) {
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

	public AnalyticsKpiDataQuery searchFilters(List<AnalyticsKpiDataQueryFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public AnalyticsKpiDataQuery addSearchFiltersItem(AnalyticsKpiDataQueryFilter searchFiltersItem) {
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
	public List<AnalyticsKpiDataQueryFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<AnalyticsKpiDataQueryFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public AnalyticsKpiDataQuery orderBy(List<AnalyticsKpiDataQueryOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public AnalyticsKpiDataQuery addOrderByItem(AnalyticsKpiDataQueryOrderBy orderByItem) {
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
	public List<AnalyticsKpiDataQueryOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<AnalyticsKpiDataQueryOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public AnalyticsKpiDataQuery offset(Integer offset) {
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

	public AnalyticsKpiDataQuery limit(Integer limit) {
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
		AnalyticsKpiDataQuery analyticsKpiDataQuery = (AnalyticsKpiDataQuery) o;
		return Objects.equals(this.$type, analyticsKpiDataQuery.$type) &&
				Objects.equals(this.searchFilters, analyticsKpiDataQuery.searchFilters) &&
				Objects.equals(this.orderBy, analyticsKpiDataQuery.orderBy) &&
				Objects.equals(this.offset, analyticsKpiDataQuery.offset) &&
				Objects.equals(this.limit, analyticsKpiDataQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AnalyticsKpiDataQuery {\n");
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
