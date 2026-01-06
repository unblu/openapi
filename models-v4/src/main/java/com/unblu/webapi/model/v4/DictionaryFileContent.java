
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
 * DictionaryFileContent
 */

@JsonPropertyOrder({
	DictionaryFileContent.JSON_PROPERTY_$_TYPE,
	DictionaryFileContent.JSON_PROPERTY_ID,
	DictionaryFileContent.JSON_PROPERTY_CONTENT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DictionaryFileContent {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DICTIONARYFILECONTENT("DictionaryFileContent");

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
			return TypeEnum.DICTIONARYFILECONTENT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DICTIONARYFILECONTENT;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CONTENT = "content";
	@JsonProperty(JSON_PROPERTY_CONTENT)
	private String content;

	public DictionaryFileContent $type(TypeEnum $type) {
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

	public DictionaryFileContent id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The id of the file in the Blob Store
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The id of the file in the Blob Store")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DictionaryFileContent content(String content) {
		this.content = content;
		return this;
	}

	/**
	 * File content as a data URL, prefixed with the &lt;code&gt;data:[&amp;lt;mediatype&amp;gt;][;base64],&amp;lt;data&amp;gt;&lt;/code&gt; scheme according to
	 * RFC2397
	 * 
	 * @return content
	 **/
	@ApiModelProperty(value = "File content as a data URL, prefixed with the <code>data:[&lt;mediatype&gt;][;base64],&lt;data&gt;</code> scheme according to RFC2397")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DictionaryFileContent dictionaryFileContent = (DictionaryFileContent) o;
		return Objects.equals(this.$type, dictionaryFileContent.$type) &&
				Objects.equals(this.id, dictionaryFileContent.id) &&
				Objects.equals(this.content, dictionaryFileContent.content);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, content);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DictionaryFileContent {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
