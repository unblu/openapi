
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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Template message
 */
@ApiModel(description = "Template message")

@JsonPropertyOrder({
	WhatsAppTemplatePostMessageData.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplatePostMessageData.JSON_PROPERTY_TYPE,
	WhatsAppTemplatePostMessageData.JSON_PROPERTY_FALLBACK_TEXT,
	WhatsAppTemplatePostMessageData.JSON_PROPERTY_TEMPLATE_ID,
	WhatsAppTemplatePostMessageData.JSON_PROPERTY_COMPONENTS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplatePostMessageData implements PostMessageData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATEPOSTMESSAGEDATA("WhatsAppTemplatePostMessageData");

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
			return TypeEnum.WHATSAPPTEMPLATEPOSTMESSAGEDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATEPOSTMESSAGEDATA;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EPostMessageType type = EPostMessageType.WHATS_APP_TEMPLATE;

	public static final String JSON_PROPERTY_FALLBACK_TEXT = "fallbackText";
	@JsonProperty(JSON_PROPERTY_FALLBACK_TEXT)
	private String fallbackText;

	public static final String JSON_PROPERTY_TEMPLATE_ID = "templateId";
	@JsonProperty(JSON_PROPERTY_TEMPLATE_ID)
	private String templateId;

	public static final String JSON_PROPERTY_COMPONENTS = "components";
	@JsonProperty(JSON_PROPERTY_COMPONENTS)
	private List<WhatsAppTemplateComponentParameters> components = null;

	public WhatsAppTemplatePostMessageData $type(TypeEnum $type) {
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

	public WhatsAppTemplatePostMessageData type(EPostMessageType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EPostMessageType getType() {
		return type;
	}

	public void setType(EPostMessageType type) {
		this.type = type;
	}

	public WhatsAppTemplatePostMessageData fallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
		return this;
	}

	/**
	 * Optional fallback text which is used when: &lt;ul&gt; &lt;li&gt;Unblu can&#39;t restore the complex content of a message&lt;/li&gt; &lt;li&gt;A push
	 * notification couldn&#39;t be decrypted&lt;/li&gt; &lt;li&gt;Last message in the conversation overview&lt;/li&gt; &lt;/ul&gt; The usage of this field is
	 * recommended especially for complex message types.&lt;br&gt; The value must not contain markdown.&lt;br&gt; If no fallback is given, a fallback text based on
	 * the content of the message is generated. This may however not always be a perfect textual representation of the message.&lt;br&gt;
	 * 
	 * @return fallbackText
	 **/
	@ApiModelProperty(value = "Optional fallback text which is used when: <ul> <li>Unblu can't restore the complex content of a message</li> <li>A push notification couldn't be decrypted</li> <li>Last message in the conversation overview</li> </ul> The usage of this field is recommended especially for complex message types.<br> The value must not contain markdown.<br> If no fallback is given, a fallback text based on the content of the message is generated. This may however not always be a perfect textual representation of the message.<br>")
	public String getFallbackText() {
		return fallbackText;
	}

	public void setFallbackText(String fallbackText) {
		this.fallbackText = fallbackText;
	}

	public WhatsAppTemplatePostMessageData templateId(String templateId) {
		this.templateId = templateId;
		return this;
	}

	/**
	 * ID of the message template
	 * 
	 * @return templateId
	 **/
	@ApiModelProperty(value = "ID of the message template")
	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public WhatsAppTemplatePostMessageData components(List<WhatsAppTemplateComponentParameters> components) {
		this.components = components;
		return this;
	}

	public WhatsAppTemplatePostMessageData addComponentsItem(WhatsAppTemplateComponentParameters componentsItem) {
		if (this.components == null) {
			this.components = new ArrayList<>();
		}
		this.components.add(componentsItem);
		return this;
	}

	/**
	 * The parameters for the template components
	 * 
	 * @return components
	 **/
	@ApiModelProperty(value = "The parameters for the template components")
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
		WhatsAppTemplatePostMessageData whatsAppTemplatePostMessageData = (WhatsAppTemplatePostMessageData) o;
		return Objects.equals(this.$type, whatsAppTemplatePostMessageData.$type) &&
				Objects.equals(this.type, whatsAppTemplatePostMessageData.type) &&
				Objects.equals(this.fallbackText, whatsAppTemplatePostMessageData.fallbackText) &&
				Objects.equals(this.templateId, whatsAppTemplatePostMessageData.templateId) &&
				Objects.equals(this.components, whatsAppTemplatePostMessageData.components);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, fallbackText, templateId, components);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplatePostMessageData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    fallbackText: ").append(toIndentedString(fallbackText)).append("\n");
		sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
