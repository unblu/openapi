
package com.unblu.webapi.model.v4;

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
 * A lightweight view of a label as exposed on an entity such as a conversation: the label&#39;s name (the reference used by the label-assignment endpoints) and
 * its color for display. The full label definition is available via the labels endpoints.
 */
@ApiModel(description = "A lightweight view of a label as exposed on an entity such as a conversation: the label's name (the reference used by the label-assignment endpoints) and its color for display. The full label definition is available via the labels endpoints.")

@JsonPropertyOrder({
	LabelData.JSON_PROPERTY_$_TYPE,
	LabelData.JSON_PROPERTY_NAME,
	LabelData.JSON_PROPERTY_COLOR,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LabelData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		LABELDATA("LabelData");

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
			return TypeEnum.LABELDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.LABELDATA;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_COLOR = "color";
	@JsonProperty(JSON_PROPERTY_COLOR)
	private String color;

	public LabelData $type(TypeEnum $type) {
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

	public LabelData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * The name of the label.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "The name of the label.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LabelData color(String color) {
		this.color = color;
		return this;
	}

	/**
	 * The color of the label, in a format compatible with CSS.
	 * 
	 * @return color
	 **/
	@ApiModelProperty(value = "The color of the label, in a format compatible with CSS.")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LabelData labelData = (LabelData) o;
		return Objects.equals(this.$type, labelData.$type) &&
				Objects.equals(this.name, labelData.name) &&
				Objects.equals(this.color, labelData.color);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, name, color);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LabelData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    color: ").append(toIndentedString(color)).append("\n");
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
