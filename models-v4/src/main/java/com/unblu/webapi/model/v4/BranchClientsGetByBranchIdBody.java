
package com.unblu.webapi.model.v4;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Request body for the &#39;branchClientsGetByBranchId&#39; operation
 */
@ApiModel(description = "Request body for the 'branchClientsGetByBranchId' operation")

@JsonPropertyOrder({
	BranchClientsGetByBranchIdBody.JSON_PROPERTY_BRANCH_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientsGetByBranchIdBody {
	public static final String JSON_PROPERTY_BRANCH_ID = "branchId";
	@JsonProperty(JSON_PROPERTY_BRANCH_ID)
	private String branchId;

	public BranchClientsGetByBranchIdBody branchId(String branchId) {
		this.branchId = branchId;
		return this;
	}

	/**
	 * The branch ID the branch clients are assigned to
	 * 
	 * @return branchId
	 **/
	@ApiModelProperty(value = "The branch ID the branch clients are assigned to")
	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientsGetByBranchIdBody branchClientsGetByBranchIdBody = (BranchClientsGetByBranchIdBody) o;
		return Objects.equals(this.branchId, branchClientsGetByBranchIdBody.branchId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(branchId);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientsGetByBranchIdBody {\n");
		sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
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
