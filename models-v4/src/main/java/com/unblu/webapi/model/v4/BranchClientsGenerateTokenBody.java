
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;branchClientsGenerateToken&#39; operation
 */
@ApiModel(description = "Request body for the 'branchClientsGenerateToken' operation")

@JsonPropertyOrder({
	BranchClientsGenerateTokenBody.JSON_PROPERTY_EXPIRES_AT,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientsGenerateTokenBody {
	public static final String JSON_PROPERTY_EXPIRES_AT = "expiresAt";
	@JsonProperty(JSON_PROPERTY_EXPIRES_AT)
	private Long expiresAt;

	public BranchClientsGenerateTokenBody expiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
		return this;
	}

	/**
	 * Expiration date as a Unix timestamp. Set to 0 if the token shouldn&#39;t expire.
	 * 
	 * @return expiresAt
	 **/
	@ApiModelProperty(value = "Expiration date as a Unix timestamp. Set to 0 if the token shouldn't expire.")
	public Long getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(Long expiresAt) {
		this.expiresAt = expiresAt;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientsGenerateTokenBody branchClientsGenerateTokenBody = (BranchClientsGenerateTokenBody) o;
		return Objects.equals(this.expiresAt, branchClientsGenerateTokenBody.expiresAt);
	}

	@Override
	public int hashCode() {
		return Objects.hash(expiresAt);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientsGenerateTokenBody {\n");
		sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
