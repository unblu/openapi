
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
 * Paginated result containing &#x60;ConversationsEndedAnalyticsKpiData&#x60; entries, returned by&#x60;searchConversationsEnded&#x60;.
 */
@ApiModel(description = "Paginated result containing `ConversationsEndedAnalyticsKpiData` entries, returned by`searchConversationsEnded`.")

@JsonPropertyOrder({
	ConversationsEndedAnalyticsKpiDataResult.JSON_PROPERTY_$_TYPE,
	ConversationsEndedAnalyticsKpiDataResult.JSON_PROPERTY_HAS_MORE_ITEMS,
	ConversationsEndedAnalyticsKpiDataResult.JSON_PROPERTY_NEXT_OFFSET,
	ConversationsEndedAnalyticsKpiDataResult.JSON_PROPERTY_ITEMS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationsEndedAnalyticsKpiDataResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONSENDEDANALYTICSKPIDATARESULT("ConversationsEndedAnalyticsKpiDataResult");

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
			return TypeEnum.CONVERSATIONSENDEDANALYTICSKPIDATARESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONSENDEDANALYTICSKPIDATARESULT;

	public static final String JSON_PROPERTY_HAS_MORE_ITEMS = "hasMoreItems";
	@JsonProperty(JSON_PROPERTY_HAS_MORE_ITEMS)
	private Boolean hasMoreItems;

	public static final String JSON_PROPERTY_NEXT_OFFSET = "nextOffset";
	@JsonProperty(JSON_PROPERTY_NEXT_OFFSET)
	private Integer nextOffset;

	public static final String JSON_PROPERTY_ITEMS = "items";
	@JsonProperty(JSON_PROPERTY_ITEMS)
	private List<ConversationsEndedAnalyticsKpiData> items = null;

	public ConversationsEndedAnalyticsKpiDataResult $type(TypeEnum $type) {
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

	public ConversationsEndedAnalyticsKpiDataResult hasMoreItems(Boolean hasMoreItems) {
		this.hasMoreItems = hasMoreItems;
		return this;
	}

	/**
	 * Flag to indicate if there are more items on the server
	 * 
	 * @return hasMoreItems
	 **/
	@ApiModelProperty(value = "Flag to indicate if there are more items on the server")
	public Boolean isHasMoreItems() {
		return hasMoreItems;
	}

	public void setHasMoreItems(Boolean hasMoreItems) {
		this.hasMoreItems = hasMoreItems;
	}

	public ConversationsEndedAnalyticsKpiDataResult nextOffset(Integer nextOffset) {
		this.nextOffset = nextOffset;
		return this;
	}

	/**
	 * If there are more items present on the server, this value can be used as the offset in the next query
	 * 
	 * @return nextOffset
	 **/
	@ApiModelProperty(value = "If there are more items present on the server, this value can be used as the offset in the next query")
	public Integer getNextOffset() {
		return nextOffset;
	}

	public void setNextOffset(Integer nextOffset) {
		this.nextOffset = nextOffset;
	}

	public ConversationsEndedAnalyticsKpiDataResult items(List<ConversationsEndedAnalyticsKpiData> items) {
		this.items = items;
		return this;
	}

	public ConversationsEndedAnalyticsKpiDataResult addItemsItem(ConversationsEndedAnalyticsKpiData itemsItem) {
		if (this.items == null) {
			this.items = new ArrayList<>();
		}
		this.items.add(itemsItem);
		return this;
	}

	/**
	 * The returned list of entities
	 * 
	 * @return items
	 **/
	@ApiModelProperty(value = "The returned list of entities")
	public List<ConversationsEndedAnalyticsKpiData> getItems() {
		return items;
	}

	public void setItems(List<ConversationsEndedAnalyticsKpiData> items) {
		this.items = items;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationsEndedAnalyticsKpiDataResult conversationsEndedAnalyticsKpiDataResult = (ConversationsEndedAnalyticsKpiDataResult) o;
		return Objects.equals(this.$type, conversationsEndedAnalyticsKpiDataResult.$type) &&
				Objects.equals(this.hasMoreItems, conversationsEndedAnalyticsKpiDataResult.hasMoreItems) &&
				Objects.equals(this.nextOffset, conversationsEndedAnalyticsKpiDataResult.nextOffset) &&
				Objects.equals(this.items, conversationsEndedAnalyticsKpiDataResult.items);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, hasMoreItems, nextOffset, items);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationsEndedAnalyticsKpiDataResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    hasMoreItems: ").append(toIndentedString(hasMoreItems)).append("\n");
		sb.append("    nextOffset: ").append(toIndentedString(nextOffset)).append("\n");
		sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
