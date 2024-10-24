
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
 * WhatsAppTemplateComponentParameters
 */

@JsonPropertyOrder({
	WhatsAppTemplateComponentParameters.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplateComponentParameters.JSON_PROPERTY_TYPE,
	WhatsAppTemplateComponentParameters.JSON_PROPERTY_SUB_TYPE,
	WhatsAppTemplateComponentParameters.JSON_PROPERTY_INDEX,
	WhatsAppTemplateComponentParameters.JSON_PROPERTY_PARAMETERS,
	WhatsAppTemplateComponentParameters.JSON_PROPERTY_CARDS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplateComponentParameters {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATECOMPONENTPARAMETERS("WhatsAppTemplateComponentParameters");

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
			return TypeEnum.WHATSAPPTEMPLATECOMPONENTPARAMETERS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATECOMPONENTPARAMETERS;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETemplateComponentParemetersType type;

	public static final String JSON_PROPERTY_SUB_TYPE = "subType";
	@JsonProperty(JSON_PROPERTY_SUB_TYPE)
	private ETemplateComponentParemetersSubType subType;

	public static final String JSON_PROPERTY_INDEX = "index";
	@JsonProperty(JSON_PROPERTY_INDEX)
	private Integer index;

	public static final String JSON_PROPERTY_PARAMETERS = "parameters";
	@JsonProperty(JSON_PROPERTY_PARAMETERS)
	private List<WhatsAppTemplateParameter> parameters = null;

	public static final String JSON_PROPERTY_CARDS = "cards";
	@JsonProperty(JSON_PROPERTY_CARDS)
	private List<WhatsAppTemplateCardParameter> cards = null;

	public WhatsAppTemplateComponentParameters $type(TypeEnum $type) {
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

	public WhatsAppTemplateComponentParameters type(ETemplateComponentParemetersType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ETemplateComponentParemetersType getType() {
		return type;
	}

	public void setType(ETemplateComponentParemetersType type) {
		this.type = type;
	}

	public WhatsAppTemplateComponentParameters subType(ETemplateComponentParemetersSubType subType) {
		this.subType = subType;
		return this;
	}

	/**
	 * Get subType
	 * 
	 * @return subType
	 **/
	@ApiModelProperty(value = "")
	public ETemplateComponentParemetersSubType getSubType() {
		return subType;
	}

	public void setSubType(ETemplateComponentParemetersSubType subType) {
		this.subType = subType;
	}

	public WhatsAppTemplateComponentParameters index(Integer index) {
		this.index = index;
		return this;
	}

	/**
	 * Only used for &#x60;ETemplateComponentParemetersType.BUTTON&#x60;
	 * 
	 * @return index
	 **/
	@ApiModelProperty(value = "Only used for `ETemplateComponentParemetersType.BUTTON`")
	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public WhatsAppTemplateComponentParameters parameters(List<WhatsAppTemplateParameter> parameters) {
		this.parameters = parameters;
		return this;
	}

	public WhatsAppTemplateComponentParameters addParametersItem(WhatsAppTemplateParameter parametersItem) {
		if (this.parameters == null) {
			this.parameters = new ArrayList<>();
		}
		this.parameters.add(parametersItem);
		return this;
	}

	/**
	 * The parameters used in that component. Not used for &#x60;ETemplateComponentParemetersType.CAROUSEL&#x60;
	 * 
	 * @return parameters
	 **/
	@ApiModelProperty(value = "The parameters used in that component. Not used for `ETemplateComponentParemetersType.CAROUSEL`")
	public List<WhatsAppTemplateParameter> getParameters() {
		return parameters;
	}

	public void setParameters(List<WhatsAppTemplateParameter> parameters) {
		this.parameters = parameters;
	}

	public WhatsAppTemplateComponentParameters cards(List<WhatsAppTemplateCardParameter> cards) {
		this.cards = cards;
		return this;
	}

	public WhatsAppTemplateComponentParameters addCardsItem(WhatsAppTemplateCardParameter cardsItem) {
		if (this.cards == null) {
			this.cards = new ArrayList<>();
		}
		this.cards.add(cardsItem);
		return this;
	}

	/**
	 * The card component parameters used in that carousel component. Only used for &#x60;ETemplateComponentParemetersType.CAROUSEL&#x60;
	 * 
	 * @return cards
	 **/
	@ApiModelProperty(value = "The card component parameters used in that carousel component. Only used for `ETemplateComponentParemetersType.CAROUSEL`")
	public List<WhatsAppTemplateCardParameter> getCards() {
		return cards;
	}

	public void setCards(List<WhatsAppTemplateCardParameter> cards) {
		this.cards = cards;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplateComponentParameters whatsAppTemplateComponentParameters = (WhatsAppTemplateComponentParameters) o;
		return Objects.equals(this.$type, whatsAppTemplateComponentParameters.$type) &&
				Objects.equals(this.type, whatsAppTemplateComponentParameters.type) &&
				Objects.equals(this.subType, whatsAppTemplateComponentParameters.subType) &&
				Objects.equals(this.index, whatsAppTemplateComponentParameters.index) &&
				Objects.equals(this.parameters, whatsAppTemplateComponentParameters.parameters) &&
				Objects.equals(this.cards, whatsAppTemplateComponentParameters.cards);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, subType, index, parameters, cards);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplateComponentParameters {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
		sb.append("    index: ").append(toIndentedString(index)).append("\n");
		sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
		sb.append("    cards: ").append(toIndentedString(cards)).append("\n");
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
