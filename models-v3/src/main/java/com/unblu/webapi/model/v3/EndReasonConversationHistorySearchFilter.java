
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * EndReasonConversationHistorySearchFilter
 */

@JsonPropertyOrder({
	EndReasonConversationHistorySearchFilter.JSON_PROPERTY_$_TYPE,
	EndReasonConversationHistorySearchFilter.JSON_PROPERTY_FIELD,
	EndReasonConversationHistorySearchFilter.JSON_PROPERTY_OPERATOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class EndReasonConversationHistorySearchFilter implements ConversationHistorySearchFilter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ENDREASONCONVERSATIONHISTORYSEARCHFILTER("EndReasonConversationHistorySearchFilter");

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
			return TypeEnum.ENDREASONCONVERSATIONHISTORYSEARCHFILTER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ENDREASONCONVERSATIONHISTORYSEARCHFILTER;

	public static final String JSON_PROPERTY_FIELD = "field";
	@JsonProperty(JSON_PROPERTY_FIELD)
	private EConversationHistorySearchFilterField field = EConversationHistorySearchFilterField.END_REASON;

	public static final String JSON_PROPERTY_OPERATOR = "operator";
	@JsonProperty(JSON_PROPERTY_OPERATOR)
	private ConversationEndReasonOperator operator = null;

	public EndReasonConversationHistorySearchFilter $type(TypeEnum $type) {
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

	public EndReasonConversationHistorySearchFilter field(EConversationHistorySearchFilterField field) {
		this.field = field;
		return this;
	}

	/**
	 * Get field
	 * 
	 * @return field
	 **/
	@ApiModelProperty(value = "")
	public EConversationHistorySearchFilterField getField() {
		return field;
	}

	public void setField(EConversationHistorySearchFilterField field) {
		this.field = field;
	}

	public EndReasonConversationHistorySearchFilter operator(ConversationEndReasonOperator operator) {
		this.operator = operator;
		return this;
	}

	/**
	 * Get operator
	 * 
	 * @return operator
	 **/
	@ApiModelProperty(value = "")
	public ConversationEndReasonOperator getOperator() {
		return operator;
	}

	public void setOperator(ConversationEndReasonOperator operator) {
		this.operator = operator;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EndReasonConversationHistorySearchFilter endReasonConversationHistorySearchFilter = (EndReasonConversationHistorySearchFilter) o;
		return Objects.equals(this.$type, endReasonConversationHistorySearchFilter.$type) &&
				Objects.equals(this.field, endReasonConversationHistorySearchFilter.field) &&
				Objects.equals(this.operator, endReasonConversationHistorySearchFilter.operator);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, field, operator);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EndReasonConversationHistorySearchFilter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    field: ").append(toIndentedString(field)).append("\n");
		sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
