
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
 * Success response to an &#x60;CustomActionInvocationRequest&#x60; request. &lt;p&gt; This should be returned when the custom action was received and started
 * but no specific result is known yet. In such cases, the result of the custom action can be displayed to the user in a different way, for example with a
 * message sent to the conversation by a bot.
 */
@ApiModel(description = "Success response to an `CustomActionInvocationRequest` request. <p> This should be returned when the custom action was received and started but no specific result is known yet. In such cases, the result of the custom action can be displayed to the user in a different way, for example with a message sent to the conversation by a bot.")

@JsonPropertyOrder({
	CustomActionInvocationExecutionStartedResponse.JSON_PROPERTY_$_TYPE,
	CustomActionInvocationExecutionStartedResponse.JSON_PROPERTY_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class CustomActionInvocationExecutionStartedResponse implements CustomActionInvocationResponse {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		CUSTOMACTIONINVOCATIONEXECUTIONSTARTEDRESPONSE("CustomActionInvocationExecutionStartedResponse");

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
			return TypeEnum.CUSTOMACTIONINVOCATIONEXECUTIONSTARTEDRESPONSE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.CUSTOMACTIONINVOCATIONEXECUTIONSTARTEDRESPONSE;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ECustomActionInvocationResponseType type = ECustomActionInvocationResponseType.EXECUTION_STARTED;

	public CustomActionInvocationExecutionStartedResponse $type(TypeEnum $type) {
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

	public CustomActionInvocationExecutionStartedResponse type(ECustomActionInvocationResponseType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ECustomActionInvocationResponseType getType() {
		return type;
	}

	public void setType(ECustomActionInvocationResponseType type) {
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
		CustomActionInvocationExecutionStartedResponse customActionInvocationExecutionStartedResponse = (CustomActionInvocationExecutionStartedResponse) o;
		return Objects.equals(this.$type, customActionInvocationExecutionStartedResponse.$type) &&
				Objects.equals(this.type, customActionInvocationExecutionStartedResponse.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CustomActionInvocationExecutionStartedResponse {\n");
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