
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
 * WhatsAppTemplateCardParameter
 */

@JsonPropertyOrder({
	WhatsAppTemplateCardParameter.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplateCardParameter.JSON_PROPERTY_CARD_INDEX,
	WhatsAppTemplateCardParameter.JSON_PROPERTY_COMPONENTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplateCardParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATECARDPARAMETER("WhatsAppTemplateCardParameter");

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
			return TypeEnum.WHATSAPPTEMPLATECARDPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATECARDPARAMETER;

	public static final String JSON_PROPERTY_CARD_INDEX = "cardIndex";
	@JsonProperty(JSON_PROPERTY_CARD_INDEX)
	private Integer cardIndex;

	public static final String JSON_PROPERTY_COMPONENTS = "components";
	@JsonProperty(JSON_PROPERTY_COMPONENTS)
	private List<WhatsAppTemplateComponentParameters> components = null;

	public WhatsAppTemplateCardParameter $type(TypeEnum $type) {
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

	public WhatsAppTemplateCardParameter cardIndex(Integer cardIndex) {
		this.cardIndex = cardIndex;
		return this;
	}

	/**
	 * The type of the parameter
	 * 
	 * @return cardIndex
	 **/
	@ApiModelProperty(value = "The type of the parameter")
	public Integer getCardIndex() {
		return cardIndex;
	}

	public void setCardIndex(Integer cardIndex) {
		this.cardIndex = cardIndex;
	}

	public WhatsAppTemplateCardParameter components(List<WhatsAppTemplateComponentParameters> components) {
		this.components = components;
		return this;
	}

	public WhatsAppTemplateCardParameter addComponentsItem(WhatsAppTemplateComponentParameters componentsItem) {
		if (this.components == null) {
			this.components = new ArrayList<>();
		}
		this.components.add(componentsItem);
		return this;
	}

	/**
	 * Get components
	 * 
	 * @return components
	 **/
	@ApiModelProperty(value = "")
	public List<WhatsAppTemplateComponentParameters> getComponents() {
		return components;
	}

	public void setComponents(List<WhatsAppTemplateComponentParameters> components) {
		this.components = components;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplateCardParameter whatsAppTemplateCardParameter = (WhatsAppTemplateCardParameter) o;
		return Objects.equals(this.$type, whatsAppTemplateCardParameter.$type) &&
				Objects.equals(this.cardIndex, whatsAppTemplateCardParameter.cardIndex) &&
				Objects.equals(this.components, whatsAppTemplateCardParameter.components);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, cardIndex, components);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplateCardParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    cardIndex: ").append(toIndentedString(cardIndex)).append("\n");
		sb.append("    components: ").append(toIndentedString(components)).append("\n");
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
