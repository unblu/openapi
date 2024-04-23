
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
 * A link to download a file from a conversation. &lt;p&gt; If the user isn&#39;t logged in, they must do so manually. Login is also possible via a web API call
 * or the JS API. &lt;/ul&gt;
 */
@ApiModel(description = "A link to download a file from a conversation. <p> If the user isn't logged in, they must do so manually. Login is also possible via a web API call or the JS API. </ul>")

@JsonPropertyOrder({
	DownloadLink.JSON_PROPERTY_$_TYPE,
	DownloadLink.JSON_PROPERTY_TYPE,
	DownloadLink.JSON_PROPERTY_URL,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DownloadLink {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DOWNLOADLINK("DownloadLink");

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
			return TypeEnum.DOWNLOADLINK;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DOWNLOADLINK;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EDownloadLinkType type;

	public static final String JSON_PROPERTY_URL = "url";
	@JsonProperty(JSON_PROPERTY_URL)
	private String url;

	public DownloadLink $type(TypeEnum $type) {
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

	public DownloadLink type(EDownloadLinkType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EDownloadLinkType getType() {
		return type;
	}

	public void setType(EDownloadLinkType type) {
		this.type = type;
	}

	public DownloadLink url(String url) {
		this.url = url;
		return this;
	}

	/**
	 * The URL of the link
	 * 
	 * @return url
	 **/
	@ApiModelProperty(value = "The URL of the link")
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
		DownloadLink downloadLink = (DownloadLink) o;
		return Objects.equals(this.$type, downloadLink.$type) &&
				Objects.equals(this.type, downloadLink.type) &&
				Objects.equals(this.url, downloadLink.url);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, url);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DownloadLink {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
