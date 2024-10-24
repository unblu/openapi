
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
 * WhatsAppTemplateLocationParameter
 */

@JsonPropertyOrder({
	WhatsAppTemplateLocationParameter.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplateLocationParameter.JSON_PROPERTY_TYPE,
	WhatsAppTemplateLocationParameter.JSON_PROPERTY_LOCATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplateLocationParameter implements WhatsAppTemplateParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATELOCATIONPARAMETER("WhatsAppTemplateLocationParameter");

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
			return TypeEnum.WHATSAPPTEMPLATELOCATIONPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATELOCATIONPARAMETER;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETemplateComponentParameterType type = ETemplateComponentParameterType.LOCATION;

	public static final String JSON_PROPERTY_LOCATION = "location";
	@JsonProperty(JSON_PROPERTY_LOCATION)
	private LocationParameterValue location = null;

	public WhatsAppTemplateLocationParameter $type(TypeEnum $type) {
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

	public WhatsAppTemplateLocationParameter type(ETemplateComponentParameterType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public ETemplateComponentParameterType getType() {
		return type;
	}

	public void setType(ETemplateComponentParameterType type) {
		this.type = type;
	}

	public WhatsAppTemplateLocationParameter location(LocationParameterValue location) {
		this.location = location;
		return this;
	}

	/**
	 * Get location
	 * 
	 * @return location
	 **/
	@ApiModelProperty(value = "")
	public LocationParameterValue getLocation() {
		return location;
	}

	public void setLocation(LocationParameterValue location) {
		this.location = location;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplateLocationParameter whatsAppTemplateLocationParameter = (WhatsAppTemplateLocationParameter) o;
		return Objects.equals(this.$type, whatsAppTemplateLocationParameter.$type) &&
				Objects.equals(this.type, whatsAppTemplateLocationParameter.type) &&
				Objects.equals(this.location, whatsAppTemplateLocationParameter.location);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, location);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplateLocationParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
