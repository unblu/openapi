
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
 * Parameter object for thinking indicator configuration. Encapsulates the optional display parameters for a bot&#39;s thinking state.
 */
@ApiModel(description = "Parameter object for thinking indicator configuration. Encapsulates the optional display parameters for a bot's thinking state.")

@JsonPropertyOrder({
	ThinkingIndicatorParams.JSON_PROPERTY_$_TYPE,
	ThinkingIndicatorParams.JSON_PROPERTY_THINKING_TEXT,
	ThinkingIndicatorParams.JSON_PROPERTY_THINKING_ANIMATION,
	ThinkingIndicatorParams.JSON_PROPERTY_THINKING_INPUT_MODE,
	ThinkingIndicatorParams.JSON_PROPERTY_INTERNAL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ThinkingIndicatorParams {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		THINKINGINDICATORPARAMS("ThinkingIndicatorParams");

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
			return TypeEnum.THINKINGINDICATORPARAMS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.THINKINGINDICATORPARAMS;

	public static final String JSON_PROPERTY_THINKING_TEXT = "thinkingText";
	@JsonProperty(JSON_PROPERTY_THINKING_TEXT)
	private String thinkingText;

	public static final String JSON_PROPERTY_THINKING_ANIMATION = "thinkingAnimation";
	@JsonProperty(JSON_PROPERTY_THINKING_ANIMATION)
	private String thinkingAnimation;

	public static final String JSON_PROPERTY_THINKING_INPUT_MODE = "thinkingInputMode";
	@JsonProperty(JSON_PROPERTY_THINKING_INPUT_MODE)
	private EThinkingInputMode thinkingInputMode;

	public static final String JSON_PROPERTY_INTERNAL = "internal";
	@JsonProperty(JSON_PROPERTY_INTERNAL)
	private Boolean internal;

	public ThinkingIndicatorParams $type(TypeEnum $type) {
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

	public ThinkingIndicatorParams thinkingText(String thinkingText) {
		this.thinkingText = thinkingText;
		return this;
	}

	/**
	 * The text to display alongside the thinking indicator (e.g. \&quot;Analyzing...\&quot;). Required when starting, used as appended chunk when updating.
	 * 
	 * @return thinkingText
	 **/
	@ApiModelProperty(value = "The text to display alongside the thinking indicator (e.g. \"Analyzing...\"). Required when starting, used as appended chunk when updating.")
	public String getThinkingText() {
		return thinkingText;
	}

	public void setThinkingText(String thinkingText) {
		this.thinkingText = thinkingText;
	}

	public ThinkingIndicatorParams thinkingAnimation(String thinkingAnimation) {
		this.thinkingAnimation = thinkingAnimation;
		return this;
	}

	/**
	 * Animation as a base64-encoded &#x60;image/_*&#x60; data URL (e.g. SVG, GIF, PNG). Optional.
	 * 
	 * @return thinkingAnimation
	 **/
	@ApiModelProperty(value = "Animation as a base64-encoded `image/_*` data URL (e.g. SVG, GIF, PNG). Optional.")
	public String getThinkingAnimation() {
		return thinkingAnimation;
	}

	public void setThinkingAnimation(String thinkingAnimation) {
		this.thinkingAnimation = thinkingAnimation;
	}

	public ThinkingIndicatorParams thinkingInputMode(EThinkingInputMode thinkingInputMode) {
		this.thinkingInputMode = thinkingInputMode;
		return this;
	}

	/**
	 * Get thinkingInputMode
	 * 
	 * @return thinkingInputMode
	 **/
	@ApiModelProperty(value = "")
	public EThinkingInputMode getThinkingInputMode() {
		return thinkingInputMode;
	}

	public void setThinkingInputMode(EThinkingInputMode thinkingInputMode) {
		this.thinkingInputMode = thinkingInputMode;
	}

	public ThinkingIndicatorParams internal(Boolean internal) {
		this.internal = internal;
		return this;
	}

	/**
	 * When true, the indicator is an internal (agent-only) activity and is hidden from visitors. Mirrors &#x60;BotPostMessage.internal&#x60;. Applies for the whole
	 * thinking session — callers set it on &#x60;startThinking&#x60; only. Optional; &#x60;null&#x60; is treated as &#x60;false&#x60; by consumers.
	 * 
	 * @return internal
	 **/
	@ApiModelProperty(value = "When true, the indicator is an internal (agent-only) activity and is hidden from visitors. Mirrors `BotPostMessage.internal`. Applies for the whole thinking session — callers set it on `startThinking` only. Optional; `null` is treated as `false` by consumers.")
	public Boolean isInternal() {
		return internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ThinkingIndicatorParams thinkingIndicatorParams = (ThinkingIndicatorParams) o;
		return Objects.equals(this.$type, thinkingIndicatorParams.$type) &&
				Objects.equals(this.thinkingText, thinkingIndicatorParams.thinkingText) &&
				Objects.equals(this.thinkingAnimation, thinkingIndicatorParams.thinkingAnimation) &&
				Objects.equals(this.thinkingInputMode, thinkingIndicatorParams.thinkingInputMode) &&
				Objects.equals(this.internal, thinkingIndicatorParams.internal);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, thinkingText, thinkingAnimation, thinkingInputMode, internal);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ThinkingIndicatorParams {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    thinkingText: ").append(toIndentedString(thinkingText)).append("\n");
		sb.append("    thinkingAnimation: ").append(toIndentedString(thinkingAnimation)).append("\n");
		sb.append("    thinkingInputMode: ").append(toIndentedString(thinkingInputMode)).append("\n");
		sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
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
