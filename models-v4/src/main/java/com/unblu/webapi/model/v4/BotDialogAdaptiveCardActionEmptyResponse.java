
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
 * Acknowledgment response to a &#x60;BotDialogAdaptiveCardActionRequest&#x60; request. &lt;p&gt; Return this response when the bot has received the action and
 * has nothing to return.
 */
@ApiModel(description = "Acknowledgment response to a `BotDialogAdaptiveCardActionRequest` request. <p> Return this response when the bot has received the action and has nothing to return.")

@JsonPropertyOrder({
	BotDialogAdaptiveCardActionEmptyResponse.JSON_PROPERTY_$_TYPE,
	BotDialogAdaptiveCardActionEmptyResponse.JSON_PROPERTY_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BotDialogAdaptiveCardActionEmptyResponse implements BotDialogAdaptiveCardActionResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BOTDIALOGADAPTIVECARDACTIONEMPTYRESPONSE("BotDialogAdaptiveCardActionEmptyResponse");

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
			return TypeEnum.BOTDIALOGADAPTIVECARDACTIONEMPTYRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BOTDIALOGADAPTIVECARDACTIONEMPTYRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EBotDialogAdaptiveCardActionResponseType type = EBotDialogAdaptiveCardActionResponseType.EMPTY;

	public BotDialogAdaptiveCardActionEmptyResponse $type(TypeEnum $type) {
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

	public BotDialogAdaptiveCardActionEmptyResponse type(EBotDialogAdaptiveCardActionResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(required = true, value = "")
	public EBotDialogAdaptiveCardActionResponseType getType() {
		return type;
	}

	public void setType(EBotDialogAdaptiveCardActionResponseType type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BotDialogAdaptiveCardActionEmptyResponse botDialogAdaptiveCardActionEmptyResponse = (BotDialogAdaptiveCardActionEmptyResponse) o;
		return Objects.equals(this.$type, botDialogAdaptiveCardActionEmptyResponse.$type) &&
				Objects.equals(this.type, botDialogAdaptiveCardActionEmptyResponse.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BotDialogAdaptiveCardActionEmptyResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
