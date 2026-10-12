
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
 * A URL of an avatar image in one standard size.
 */
@ApiModel(description = "A URL of an avatar image in one standard size.")

@JsonPropertyOrder({
	AvatarUrl.JSON_PROPERTY_$_TYPE,
	AvatarUrl.JSON_PROPERTY_SIZE,
	AvatarUrl.JSON_PROPERTY_ENTRY_PATH,
	AvatarUrl.JSON_PROPERTY_URL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AvatarUrl {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		AVATARURL("AvatarUrl");

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
			return TypeEnum.AVATARURL;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.AVATARURL;

	public static final String JSON_PROPERTY_SIZE = "size";
	@JsonProperty(JSON_PROPERTY_SIZE)
	private EImageSize size;

	public static final String JSON_PROPERTY_ENTRY_PATH = "entryPath";
	@JsonProperty(JSON_PROPERTY_ENTRY_PATH)
	private EAvatarUrlEntryPath entryPath;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public AvatarUrl $type(TypeEnum $type) {
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

	public AvatarUrl size(EImageSize size) {
		this.size = size;
		return this;
	}

	/**
	 * Get size
	 * 
	 * @return size
	 **/
	@ApiModelProperty(value = "")
	public EImageSize getSize() {
		return size;
	}

	public void setSize(EImageSize size) {
		this.size = size;
	}

	public AvatarUrl entryPath(EAvatarUrlEntryPath entryPath) {
		this.entryPath = entryPath;
		return this;
	}

	/**
	 * Get entryPath
	 * 
	 * @return entryPath
	 **/
	@ApiModelProperty(value = "")
	public EAvatarUrlEntryPath getEntryPath() {
		return entryPath;
	}

	public void setEntryPath(EAvatarUrlEntryPath entryPath) {
		this.entryPath = entryPath;
	}

	public AvatarUrl url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL of the avatar image in the given size, addressed to the given entry path.
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "The URL of the avatar image in the given size, addressed to the given entry path.")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AvatarUrl avatarUrl = (AvatarUrl) o;
		return Objects.equals(this.$type, avatarUrl.$type) &&
				Objects.equals(this.size, avatarUrl.size) &&
				Objects.equals(this.entryPath, avatarUrl.entryPath) &&
				Objects.equals(this.url, avatarUrl.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, size, entryPath, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AvatarUrl {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    size: ").append(toIndentedString(size)).append("\n");
		sb.append("    entryPath: ").append(toIndentedString(entryPath)).append("\n");
		sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
