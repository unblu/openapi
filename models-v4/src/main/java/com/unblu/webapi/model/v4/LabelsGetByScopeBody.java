
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;labelsGetByScope&#39; operation
 */
@ApiModel(description = "Request body for the 'labelsGetByScope' operation")

@JsonPropertyOrder({
	LabelsGetByScopeBody.JSON_PROPERTY_SCOPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class LabelsGetByScopeBody {
	public static final String JSON_PROPERTY_SCOPE = "scope";
	@JsonProperty(JSON_PROPERTY_SCOPE)
	private String scope;

	public LabelsGetByScopeBody scope(String scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * The scope to search for labels in
	 * 
	 * @return scope
	 **/
	@ApiModelProperty(value = "The scope to search for labels in")
	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LabelsGetByScopeBody labelsGetByScopeBody = (LabelsGetByScopeBody) o;
		return Objects.equals(this.scope, labelsGetByScopeBody.scope);
	}

	@Override
	public int hashCode() {
		return Objects.hash(scope);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LabelsGetByScopeBody {\n");
		sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
