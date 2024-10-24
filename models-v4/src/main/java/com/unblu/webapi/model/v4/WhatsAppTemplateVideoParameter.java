
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
 * WhatsAppTemplateVideoParameter
 */

@JsonPropertyOrder({
	WhatsAppTemplateVideoParameter.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplateVideoParameter.JSON_PROPERTY_TYPE,
	WhatsAppTemplateVideoParameter.JSON_PROPERTY_VIDEO,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplateVideoParameter implements WhatsAppTemplateParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATEVIDEOPARAMETER("WhatsAppTemplateVideoParameter");

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
			return TypeEnum.WHATSAPPTEMPLATEVIDEOPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATEVIDEOPARAMETER;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETemplateComponentParameterType type = ETemplateComponentParameterType.VIDEO;

	public static final String JSON_PROPERTY_VIDEO = "video";
	@JsonProperty(JSON_PROPERTY_VIDEO)
	private MediaParameterValue video = null;

	public WhatsAppTemplateVideoParameter $type(TypeEnum $type) {
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

	public WhatsAppTemplateVideoParameter type(ETemplateComponentParameterType type) {
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

	public WhatsAppTemplateVideoParameter video(MediaParameterValue video) {
		this.video = video;
		return this;
	}

	/**
	 * Get video
	 * 
	 * @return video
	 **/
	@ApiModelProperty(value = "")
	public MediaParameterValue getVideo() {
		return video;
	}

	public void setVideo(MediaParameterValue video) {
		this.video = video;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplateVideoParameter whatsAppTemplateVideoParameter = (WhatsAppTemplateVideoParameter) o;
		return Objects.equals(this.$type, whatsAppTemplateVideoParameter.$type) &&
				Objects.equals(this.type, whatsAppTemplateVideoParameter.type) &&
				Objects.equals(this.video, whatsAppTemplateVideoParameter.video);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, video);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplateVideoParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
