
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
 * Container to count canned response usages
 */
@ApiModel(description = "Container to count canned response usages")

@JsonPropertyOrder({
	CannedResponseUsageCountQuery.JSON_PROPERTY_$_TYPE,
	CannedResponseUsageCountQuery.JSON_PROPERTY_SEARCH_FILTERS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CannedResponseUsageCountQuery {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CANNEDRESPONSEUSAGECOUNTQUERY("CannedResponseUsageCountQuery");

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
			return TypeEnum.CANNEDRESPONSEUSAGECOUNTQUERY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CANNEDRESPONSEUSAGECOUNTQUERY;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<CannedResponseUsageSearchFilter> searchFilters = null;

	public CannedResponseUsageCountQuery $type(TypeEnum $type) {
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

	public CannedResponseUsageCountQuery searchFilters(List<CannedResponseUsageSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public CannedResponseUsageCountQuery addSearchFiltersItem(CannedResponseUsageSearchFilter searchFiltersItem) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CannedResponseUsageCountQuery cannedResponseUsageCountQuery = (CannedResponseUsageCountQuery) o;
		return Objects.equals(this.$type, cannedResponseUsageCountQuery.$type) &&
				Objects.equals(this.searchFilters, cannedResponseUsageCountQuery.searchFilters);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, searchFilters);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CannedResponseUsageCountQuery {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    searchFilters: ").append(toIndentedString(searchFilters)).append("\n");
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
