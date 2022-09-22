
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
 * Container to search conversation history
 */
@ApiModel(description = "Container to search conversation history")

@JsonPropertyOrder({
	ConversationHistoryQuery.JSON_PROPERTY_$_TYPE,
	ConversationHistoryQuery.JSON_PROPERTY_SEARCH_FILTERS,
	ConversationHistoryQuery.JSON_PROPERTY_ORDER_BY,
	ConversationHistoryQuery.JSON_PROPERTY_OFFSET,
	ConversationHistoryQuery.JSON_PROPERTY_LIMIT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationHistoryQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONHISTORYQUERY("ConversationHistoryQuery");

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
			return TypeEnum.CONVERSATIONHISTORYQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONHISTORYQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<ConversationHistorySearchFilter> searchFilters = null;

	public static final String JSON_PROPERTY_ORDER_BY = "orderBy";
	@JsonProperty(JSON_PROPERTY_ORDER_BY)
	private List<ConversationHistoryOrderBy> orderBy = null;

	public static final String JSON_PROPERTY_OFFSET = "offset";
	@JsonProperty(JSON_PROPERTY_OFFSET)
	private Integer offset;

	public static final String JSON_PROPERTY_LIMIT = "limit";
	@JsonProperty(JSON_PROPERTY_LIMIT)
	private Integer limit;

	public ConversationHistoryQuery $type(TypeEnum $type) {
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

	public ConversationHistoryQuery searchFilters(List<ConversationHistorySearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public ConversationHistoryQuery addSearchFiltersItem(ConversationHistorySearchFilter searchFiltersItem) {
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
	public List<ConversationHistorySearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<ConversationHistorySearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
	}

	public ConversationHistoryQuery orderBy(List<ConversationHistoryOrderBy> orderBy) {
		this.orderBy = orderBy;
		return this;
	}

	public ConversationHistoryQuery addOrderByItem(ConversationHistoryOrderBy orderByItem) {
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
	public List<ConversationHistoryOrderBy> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<ConversationHistoryOrderBy> orderBy) {
		this.orderBy = orderBy;
	}

	public ConversationHistoryQuery offset(Integer offset) {
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

	public ConversationHistoryQuery limit(Integer limit) {
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
		ConversationHistoryQuery conversationHistoryQuery = (ConversationHistoryQuery) o;
		return Objects.equals(this.$type, conversationHistoryQuery.$type) &&
				Objects.equals(this.searchFilters, conversationHistoryQuery.searchFilters) &&
				Objects.equals(this.orderBy, conversationHistoryQuery.orderBy) &&
				Objects.equals(this.offset, conversationHistoryQuery.offset) &&
				Objects.equals(this.limit, conversationHistoryQuery.limit);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters, orderBy, offset, limit);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationHistoryQuery {\n");
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
