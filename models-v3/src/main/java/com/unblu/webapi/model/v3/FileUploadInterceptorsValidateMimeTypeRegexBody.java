
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;fileUploadInterceptorsValidateMimeTypeRegex&#39; operation
 */
@ApiModel(description = "Request Body for the 'fileUploadInterceptorsValidateMimeTypeRegex' operation")

@JsonPropertyOrder({
	FileUploadInterceptorsValidateMimeTypeRegexBody.JSON_PROPERTY_REGEX,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FileUploadInterceptorsValidateMimeTypeRegexBody {
	public static final String JSON_PROPERTY_REGEX = "regex";
	@JsonProperty(JSON_PROPERTY_REGEX)
	private String regex;

	public FileUploadInterceptorsValidateMimeTypeRegexBody regex(String regex) {
		this.regex = regex;
		return this;
	}

	/**
	 * Get regex
	 * 
	 * @return regex
	 **/
	@ApiModelProperty(value = "")
	public String getRegex() {
		return regex;
	}

	public void setRegex(String regex) {
		this.regex = regex;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FileUploadInterceptorsValidateMimeTypeRegexBody fileUploadInterceptorsValidateMimeTypeRegexBody = (FileUploadInterceptorsValidateMimeTypeRegexBody) o;
		return Objects.equals(this.regex, fileUploadInterceptorsValidateMimeTypeRegexBody.regex);
	}

	@Override
	public int hashCode() {
		return Objects.hash(regex);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileUploadInterceptorsValidateMimeTypeRegexBody {\n");
		sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
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
