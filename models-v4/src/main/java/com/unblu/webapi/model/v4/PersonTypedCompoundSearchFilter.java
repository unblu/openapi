
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
 * PersonTypedCompoundSearchFilter
 */

@JsonPropertyOrder({
	PersonTypedCompoundSearchFilter.JSON_PROPERTY_$_TYPE,
	PersonTypedCompoundSearchFilter.JSON_PROPERTY_FIELD,
	PersonTypedCompoundSearchFilter.JSON_PROPERTY_OPERATOR,
	PersonTypedCompoundSearchFilter.JSON_PROPERTY_SEARCH_FILTERS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class PersonTypedCompoundSearchFilter implements PersonTypedSearchFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERSONTYPEDCOMPOUNDSEARCHFILTER("PersonTypedCompoundSearchFilter");

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
			return TypeEnum.PERSONTYPEDCOMPOUNDSEARCHFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERSONTYPEDCOMPOUNDSEARCHFILTER;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private EPersonTypedSearchFilterField field = EPersonTypedSearchFilterField.COMPOUND;

	public static final String JSON_PROPERTY_OPERATOR = "operator";
	@JsonProperty(JSON_PROPERTY_OPERATOR)
	private CompoundOperator operator = null;

	public static final String JSON_PROPERTY_SEARCH_FILTERS = "searchFilters";
	@JsonProperty(JSON_PROPERTY_SEARCH_FILTERS)
	private List<PersonTypedSearchFilter> searchFilters = null;

	public PersonTypedCompoundSearchFilter $type(TypeEnum $type) {
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

	public PersonTypedCompoundSearchFilter field(EPersonTypedSearchFilterField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public EPersonTypedSearchFilterField getField() {
		return field;
	}

	public void setField(EPersonTypedSearchFilterField field) {
		this.field = field;
	}

	public PersonTypedCompoundSearchFilter operator(CompoundOperator operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * Get operator
	 * 
	 * @return operator
	 **/
	@ApiModelProperty(value = "")
	public CompoundOperator getOperator() {
		return operator;
	}

	public void setOperator(CompoundOperator operator) {
		this.operator = operator;
	}

	public PersonTypedCompoundSearchFilter searchFilters(List<PersonTypedSearchFilter> searchFilters) {
		this.searchFilters = searchFilters;
		return this;
	}

	public PersonTypedCompoundSearchFilter addSearchFiltersItem(PersonTypedSearchFilter searchFiltersItem) {
		if (this.searchFilters == null) {
			this.searchFilters = new ArrayList<>();
		}
		this.searchFilters.add(searchFiltersItem);
		return this;
	}

	/**
	 * List of filters to be linked with either AND or OR
	 * 
	 * @return searchFilters
	 **/
	@ApiModelProperty(value = "List of filters to be linked with either AND or OR")
	public List<PersonTypedSearchFilter> getSearchFilters() {
		return searchFilters;
	}

	public void setSearchFilters(List<PersonTypedSearchFilter> searchFilters) {
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
		PersonTypedCompoundSearchFilter personTypedCompoundSearchFilter = (PersonTypedCompoundSearchFilter) o;
		return Objects.equals(this.$type, personTypedCompoundSearchFilter.$type) &&
				Objects.equals(this.field, personTypedCompoundSearchFilter.field) &&
				Objects.equals(this.operator, personTypedCompoundSearchFilter.operator) &&
				Objects.equals(this.searchFilters, personTypedCompoundSearchFilter.searchFilters);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, operator, searchFilters);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonTypedCompoundSearchFilter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
