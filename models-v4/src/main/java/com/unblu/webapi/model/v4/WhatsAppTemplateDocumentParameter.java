
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
 * WhatsAppTemplateDocumentParameter
 */

@JsonPropertyOrder({
	WhatsAppTemplateDocumentParameter.JSON_PROPERTY_$_TYPE,
	WhatsAppTemplateDocumentParameter.JSON_PROPERTY_TYPE,
	WhatsAppTemplateDocumentParameter.JSON_PROPERTY_DOCUMENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class WhatsAppTemplateDocumentParameter implements WhatsAppTemplateParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		WHATSAPPTEMPLATEDOCUMENTPARAMETER("WhatsAppTemplateDocumentParameter");

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
			return TypeEnum.WHATSAPPTEMPLATEDOCUMENTPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.WHATSAPPTEMPLATEDOCUMENTPARAMETER;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private ETemplateComponentParameterType type = ETemplateComponentParameterType.DOCUMENT;

	public static final String JSON_PROPERTY_DOCUMENT = "document";
	@JsonProperty(JSON_PROPERTY_DOCUMENT)
	private DocumentMediaParameterValue document = null;

	public WhatsAppTemplateDocumentParameter $type(TypeEnum $type) {
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

	public WhatsAppTemplateDocumentParameter type(ETemplateComponentParameterType type) {
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

	public WhatsAppTemplateDocumentParameter document(DocumentMediaParameterValue document) {
		this.document = document;
		return this;
	}

	/**
	 * Get document
	 * 
	 * @return document
	 **/
	@ApiModelProperty(value = "")
	public DocumentMediaParameterValue getDocument() {
		return document;
	}

	public void setDocument(DocumentMediaParameterValue document) {
		this.document = document;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		WhatsAppTemplateDocumentParameter whatsAppTemplateDocumentParameter = (WhatsAppTemplateDocumentParameter) o;
		return Objects.equals(this.$type, whatsAppTemplateDocumentParameter.$type) &&
				Objects.equals(this.type, whatsAppTemplateDocumentParameter.type) &&
				Objects.equals(this.document, whatsAppTemplateDocumentParameter.document);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, document);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class WhatsAppTemplateDocumentParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    document: ").append(toIndentedString(document)).append("\n");
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
