
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * BotBoardingOfferResponse
 */

@JsonPropertyOrder({
	BotBoardingOfferResponse.JSON_PROPERTY_$_TYPE,
	BotBoardingOfferResponse.JSON_PROPERTY_OFFER_ACCEPTED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotBoardingOfferResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTBOARDINGOFFERRESPONSE("BotBoardingOfferResponse");

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
			return TypeEnum.BOTBOARDINGOFFERRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTBOARDINGOFFERRESPONSE;

	public static final String JSON_PROPERTY_OFFER_ACCEPTED = "offerAccepted";
	@JsonProperty(JSON_PROPERTY_OFFER_ACCEPTED)
	private Boolean offerAccepted;

	public BotBoardingOfferResponse $type(TypeEnum $type) {
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

	public BotBoardingOfferResponse offerAccepted(Boolean offerAccepted) {
		this.offerAccepted = offerAccepted;
		return this;
	}

	/**
	 * Get offerAccepted
	 * 
	 * @return offerAccepted
	 **/
	@ApiModelProperty(value = "")
	public Boolean isOfferAccepted() {
		return offerAccepted;
	}

	public void setOfferAccepted(Boolean offerAccepted) {
		this.offerAccepted = offerAccepted;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotBoardingOfferResponse botBoardingOfferResponse = (BotBoardingOfferResponse) o;
		return Objects.equals(this.$type, botBoardingOfferResponse.$type) &&
				Objects.equals(this.offerAccepted, botBoardingOfferResponse.offerAccepted);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, offerAccepted);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotBoardingOfferResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    offerAccepted: ").append(toIndentedString(offerAccepted)).append("\n");
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
