
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
 * DocumentMediaParameterValue
 */

@JsonPropertyOrder({
	DocumentMediaParameterValue.JSON_PROPERTY_$_TYPE,
	DocumentMediaParameterValue.JSON_PROPERTY_ID,
	DocumentMediaParameterValue.JSON_PROPERTY_LINK,
	DocumentMediaParameterValue.JSON_PROPERTY_CAPTION,
	DocumentMediaParameterValue.JSON_PROPERTY_FILENAME,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DocumentMediaParameterValue {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DOCUMENTMEDIAPARAMETERVALUE("DocumentMediaParameterValue");

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
			return TypeEnum.DOCUMENTMEDIAPARAMETERVALUE;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DOCUMENTMEDIAPARAMETERVALUE;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_LINK = "link";
	@JsonProperty(JSON_PROPERTY_LINK)
	private String link;

	public static final String JSON_PROPERTY_CAPTION = "caption";
	@JsonProperty(JSON_PROPERTY_CAPTION)
	private String caption;

	public static final String JSON_PROPERTY_FILENAME = "filename";
	@JsonProperty(JSON_PROPERTY_FILENAME)
	private String filename;

	public DocumentMediaParameterValue $type(TypeEnum $type) {
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

	public DocumentMediaParameterValue id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The media object ID. Do not use this field when message type is set to text. Required when type is audio, document, image, sticker, or video and you are not
	 * using a link.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The media object ID. Do not use this field when message type is set to text. Required when type is audio, document, image, sticker, or video and you are not using a link.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DocumentMediaParameterValue link(String link) {
		this.link = link;
		return this;
	}

	/**
	 * Get link
	 * 
	 * @return link
	 **/
	@ApiModelProperty(value = "")
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public DocumentMediaParameterValue caption(String caption) {
		this.caption = caption;
		return this;
	}

	/**
	 * Get caption
	 * 
	 * @return caption
	 **/
	@ApiModelProperty(value = "")
	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public DocumentMediaParameterValue filename(String filename) {
		this.filename = filename;
		return this;
	}

	/**
	 * Get filename
	 * 
	 * @return filename
	 **/
	@ApiModelProperty(value = "")
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DocumentMediaParameterValue documentMediaParameterValue = (DocumentMediaParameterValue) o;
		return Objects.equals(this.$type, documentMediaParameterValue.$type) &&
				Objects.equals(this.id, documentMediaParameterValue.id) &&
				Objects.equals(this.link, documentMediaParameterValue.link) &&
				Objects.equals(this.caption, documentMediaParameterValue.caption) &&
				Objects.equals(this.filename, documentMediaParameterValue.filename);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, link, caption, filename);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DocumentMediaParameterValue {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    link: ").append(toIndentedString(link)).append("\n");
		sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
		sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
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
