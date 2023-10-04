
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request Body for the &#39;fileUploadInterceptorsPingWebhook&#39; operation
 */
@ApiModel(description = "Request Body for the 'fileUploadInterceptorsPingWebhook' operation")

@JsonPropertyOrder({
	FileUploadInterceptorsPingWebhookBody.JSON_PROPERTY_INTERCEPTOR_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class FileUploadInterceptorsPingWebhookBody {
	public static final String JSON_PROPERTY_INTERCEPTOR_ID = "interceptorId";
	@JsonProperty(JSON_PROPERTY_INTERCEPTOR_ID)
	private String interceptorId;

	public FileUploadInterceptorsPingWebhookBody interceptorId(String interceptorId) {
		this.interceptorId = interceptorId;
		return this;
	}

	/**
	 * The ID of the file upload interceptor
	 * 
	 * @return interceptorId
	 **/
	@ApiModelProperty(value = "The ID of the file upload interceptor")
	public String getInterceptorId() {
		return interceptorId;
	}

	public void setInterceptorId(String interceptorId) {
		this.interceptorId = interceptorId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		FileUploadInterceptorsPingWebhookBody fileUploadInterceptorsPingWebhookBody = (FileUploadInterceptorsPingWebhookBody) o;
		return Objects.equals(this.interceptorId, fileUploadInterceptorsPingWebhookBody.interceptorId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(interceptorId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class FileUploadInterceptorsPingWebhookBody {\n");
		sb.append("    interceptorId: ").append(toIndentedString(interceptorId)).append("\n");
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
