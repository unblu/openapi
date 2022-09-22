
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
 * If body consist of multiple complex types, it must be an array, which is represented by this implementation of &#x60;IBody&#x60;
 */
@ApiModel(description = "If body consist of multiple complex types, it must be an array, which is represented by this implementation of `IBody`")

@JsonPropertyOrder({
	ArrayBody.JSON_PROPERTY_$_TYPE,
	ArrayBody.JSON_PROPERTY_ELEMENTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ArrayBody implements IBody {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARRAYBODY("ArrayBody");

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
			return TypeEnum.ARRAYBODY;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARRAYBODY;

	public static final String JSON_PROPERTY_ELEMENTS = "elements";
	@JsonProperty(JSON_PROPERTY_ELEMENTS)
	private List<BodyElement> elements = null;

	public ArrayBody $type(TypeEnum $type) {
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

	public ArrayBody elements(List<BodyElement> elements) {
		this.elements = elements;
		return this;
	}

	public ArrayBody addElementsItem(BodyElement elementsItem) {
		if (this.elements == null) {
			this.elements = new ArrayList<>();
		}
		this.elements.add(elementsItem);
		return this;
	}

	/**
	 * Get elements
	 * 
	 * @return elements
	 **/
	@ApiModelProperty(value = "")
	public List<BodyElement> getElements() {
		return elements;
	}

	public void setElements(List<BodyElement> elements) {
		this.elements = elements;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ArrayBody arrayBody = (ArrayBody) o;
		return Objects.equals(this.$type, arrayBody.$type) &&
				Objects.equals(this.elements, arrayBody.elements);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, elements);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ArrayBody {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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
