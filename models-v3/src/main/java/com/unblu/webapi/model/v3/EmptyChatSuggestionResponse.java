
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
 * Model representing the response to a chat suggestion request when no suggestion could be generated
 */
@ApiModel(description = "Model representing the response to a chat suggestion request when no suggestion could be generated")

@JsonPropertyOrder({
	EmptyChatSuggestionResponse.JSON_PROPERTY_$_TYPE,
	EmptyChatSuggestionResponse.JSON_PROPERTY_TYPE,
	EmptyChatSuggestionResponse.JSON_PROPERTY_REASON,
	EmptyChatSuggestionResponse.JSON_PROPERTY_HINT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class EmptyChatSuggestionResponse implements ChatSuggestionResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		EMPTYCHATSUGGESTIONRESPONSE("EmptyChatSuggestionResponse");

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
			return TypeEnum.EMPTYCHATSUGGESTIONRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.EMPTYCHATSUGGESTIONRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EChatSuggestionResponseType type = EChatSuggestionResponseType.EMPTY;

	public static final String JSON_PROPERTY_REASON = "reason";
	@JsonProperty(JSON_PROPERTY_REASON)
	private EEmptyChatSuggestionReason reason;

	public static final String JSON_PROPERTY_HINT = "hint";
	@JsonProperty(JSON_PROPERTY_HINT)
	private String hint;

	public EmptyChatSuggestionResponse $type(TypeEnum $type) {
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

	public EmptyChatSuggestionResponse type(EChatSuggestionResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EChatSuggestionResponseType getType() {
		return type;
	}

	public void setType(EChatSuggestionResponseType type) {
		this.type = type;
	}

	public EmptyChatSuggestionResponse reason(EEmptyChatSuggestionReason reason) {
		this.reason = reason;
		return this;
	}

	/**
	 * Get reason
	 * 
	 * @return reason
	 **/
	@ApiModelProperty(value = "")
	public EEmptyChatSuggestionReason getReason() {
		return reason;
	}

	public void setReason(EEmptyChatSuggestionReason reason) {
		this.reason = reason;
	}

	public EmptyChatSuggestionResponse hint(String hint) {
		this.hint = hint;
		return this;
	}

	/**
	 * Get hint
	 * 
	 * @return hint
	 **/
	@ApiModelProperty(value = "")
	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmptyChatSuggestionResponse emptyChatSuggestionResponse = (EmptyChatSuggestionResponse) o;
		return Objects.equals(this.$type, emptyChatSuggestionResponse.$type) &&
				Objects.equals(this.type, emptyChatSuggestionResponse.type) &&
				Objects.equals(this.reason, emptyChatSuggestionResponse.reason) &&
				Objects.equals(this.hint, emptyChatSuggestionResponse.hint);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, reason, hint);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmptyChatSuggestionResponse {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
		sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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
