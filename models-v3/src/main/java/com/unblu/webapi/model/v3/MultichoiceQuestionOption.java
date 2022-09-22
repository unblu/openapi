
package com.unblu.webapi.model.v3;

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
 * Possible option of a multi choice question message.
 */
@ApiModel(description = "Possible option of a multi choice question message.")

@JsonPropertyOrder({
	MultichoiceQuestionOption.JSON_PROPERTY_$_TYPE,
	MultichoiceQuestionOption.JSON_PROPERTY_LABEL,
	MultichoiceQuestionOption.JSON_PROPERTY_VALUE,
	MultichoiceQuestionOption.JSON_PROPERTY_PRIMARY,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class MultichoiceQuestionOption {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		MULTICHOICEQUESTIONOPTION("MultichoiceQuestionOption");

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
			return TypeEnum.MULTICHOICEQUESTIONOPTION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.MULTICHOICEQUESTIONOPTION;

	public static final String JSON_PROPERTY_LABEL = "label";
	@JsonProperty(JSON_PROPERTY_LABEL)
	private String label;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public static final String JSON_PROPERTY_PRIMARY = "primary";
	@JsonProperty(JSON_PROPERTY_PRIMARY)
	private Boolean primary;

	public MultichoiceQuestionOption $type(TypeEnum $type) {
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

	public MultichoiceQuestionOption label(String label) {
		this.label = label;
		return this;
	}

	/**
	 * Visual representation of the option
	 * 
	 * @return label
	 **/
	@ApiModelProperty(value = "Visual representation of the option")
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public MultichoiceQuestionOption value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Value of the option, which is used in a &#x60;ReplyMessageData&#x60;
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "Value of the option, which is used in a `ReplyMessageData`")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public MultichoiceQuestionOption primary(Boolean primary) {
		this.primary = primary;
		return this;
	}

	/**
	 * Defines if the option is a primary or only a secondary choice.
	 * 
	 * @return primary
	 **/
	@ApiModelProperty(value = "Defines if the option is a primary or only a secondary choice.")
	public Boolean isPrimary() {
		return primary;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		MultichoiceQuestionOption multichoiceQuestionOption = (MultichoiceQuestionOption) o;
		return Objects.equals(this.$type, multichoiceQuestionOption.$type) &&
				Objects.equals(this.label, multichoiceQuestionOption.label) &&
				Objects.equals(this.value, multichoiceQuestionOption.value) &&
				Objects.equals(this.primary, multichoiceQuestionOption.primary);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, label, value, primary);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class MultichoiceQuestionOption {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    label: ").append(toIndentedString(label)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
