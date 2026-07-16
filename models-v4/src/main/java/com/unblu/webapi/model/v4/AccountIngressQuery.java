
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

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountIngressQuery
 */

@JsonPropertyOrder({
	AccountIngressQuery.JSON_PROPERTY_$_TYPE,
	AccountIngressQuery.JSON_PROPERTY_SEARCH_FILTERS,
	AccountIngressQuery.JSON_PROPERTY_ORDER_BY,
	AccountIngressQuery.JSON_PROPERTY_OFFSET,
	AccountIngressQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountIngressQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTINGRESSQUERY("AccountIngressQuery");

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
			return TypeEnum.ACCOUNTINGRESSQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTINGRESSQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<AccountIngressSearchFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<AccountIngressOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public AccountIngressQuery $type(TypeEnum $type) {
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

	public AccountIngressQuery searchFilters(List<AccountIngressSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public AccountIngressQuery addSearchFiltersItem(AccountIngressSearchFilter searchFiltersItem) {
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
	public List<AccountIngressSearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<AccountIngressSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public AccountIngressQuery orderBy(List<AccountIngressOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public AccountIngressQuery addOrderByItem(AccountIngressOrderBy orderByItem) {
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
	public List<AccountIngressOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<AccountIngressOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public AccountIngressQuery offset(Integer offset) {
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

	public AccountIngressQuery limit(Integer limit) {
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
		AccountIngressQuery accountIngressQuery = (AccountIngressQuery) o;
		return Objects.equals(this.$type, accountIngressQuery.$type) &&
				Objects.equals(this.searchFilters, accountIngressQuery.searchFilters) &&
				Objects.equals(this.orderBy, accountIngressQuery.orderBy) &&
				Objects.equals(this.offset, accountIngressQuery.offset) &&
				Objects.equals(this.limit, accountIngressQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountIngressQuery {\n");
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
