
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
 * Request body carrying the label names to add to, remove from, or set on a conversation.
 */
@ApiModel(description = "Request body carrying the label names to add to, remove from, or set on a conversation.")

@JsonPropertyOrder({
	ConversationLabelsBody.JSON_PROPERTY_$_TYPE,
	ConversationLabelsBody.JSON_PROPERTY_LABEL_NAMES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ConversationLabelsBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CONVERSATIONLABELSBODY("ConversationLabelsBody");

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
			return TypeEnum.CONVERSATIONLABELSBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CONVERSATIONLABELSBODY;

	public static final String JSON_PROPERTY_LABEL_NAMES = "labelNames";
	@JsonProperty(JSON_PROPERTY_LABEL_NAMES)
	private List<String> labelNames = null;

	public ConversationLabelsBody $type(TypeEnum $type) {
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

	public ConversationLabelsBody labelNames(List<String> labelNames) {
		this.labelNames = labelNames;
		return this;
	}

	public ConversationLabelsBody addLabelNamesItem(String labelNamesItem) {
		if (this.labelNames == null) {
			this.labelNames = new ArrayList<>();
		}
		this.labelNames.add(labelNamesItem);
		return this;
	}

	/**
	 * The names of the labels to apply to the conversation.
	 * 
	 * @return labelNames
	 **/
	@ApiModelProperty(value = "The names of the labels to apply to the conversation.")
	public List<String> getLabelNames() {
		return labelNames;
	}

	public void setLabelNames(List<String> labelNames) {
		this.labelNames = labelNames;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ConversationLabelsBody conversationLabelsBody = (ConversationLabelsBody) o;
		return Objects.equals(this.$type, conversationLabelsBody.$type) &&
				Objects.equals(this.labelNames, conversationLabelsBody.labelNames);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, labelNames);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ConversationLabelsBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    labelNames: ").append(toIndentedString(labelNames)).append("\n");
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
