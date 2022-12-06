
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * AccountIngressStatus
 */

@JsonPropertyOrder({
	AccountIngressStatus.JSON_PROPERTY_$_TYPE,
	AccountIngressStatus.JSON_PROPERTY_ENABLED,
	AccountIngressStatus.JSON_PROPERTY_INGRESS_STATUS,
	AccountIngressStatus.JSON_PROPERTY_MIGRATION_STATUS,
	AccountIngressStatus.JSON_PROPERTY_PROBLEM_DETAILS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class AccountIngressStatus {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ACCOUNTINGRESSSTATUS("AccountIngressStatus");

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
			return TypeEnum.ACCOUNTINGRESSSTATUS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ACCOUNTINGRESSSTATUS;

	public static final String JSON_PROPERTY_ENABLED = "enabled";
	@JsonProperty(JSON_PROPERTY_ENABLED)
	private Boolean enabled;

	public static final String JSON_PROPERTY_INGRESS_STATUS = "ingressStatus";
	@JsonProperty(JSON_PROPERTY_INGRESS_STATUS)
	private EIngressStatus ingressStatus;

	public static final String JSON_PROPERTY_MIGRATION_STATUS = "migrationStatus";
	@JsonProperty(JSON_PROPERTY_MIGRATION_STATUS)
	private EIngressMigrationStatus migrationStatus;

	public static final String JSON_PROPERTY_PROBLEM_DETAILS = "problemDetails";
	@JsonProperty(JSON_PROPERTY_PROBLEM_DETAILS)
	private List<String> problemDetails = null;

	public AccountIngressStatus $type(TypeEnum $type) {
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

	public AccountIngressStatus enabled(Boolean enabled) {
		this.enabled = enabled;
		return this;
	}

	/**
	 * Whether or not ingress should be enabled for the account.&lt;br&gt; This property can be changed by &#x60;IAccountStorageService.enableAccountIngress&#x60;
	 * and &#x60;IAccountStorageService.disableAccountIngress&#x60;
	 * 
	 * @return enabled
	 **/
	@ApiModelProperty(value = "Whether or not ingress should be enabled for the account.<br> This property can be changed by `IAccountStorageService.enableAccountIngress` and `IAccountStorageService.disableAccountIngress`")
	public Boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public AccountIngressStatus ingressStatus(EIngressStatus ingressStatus) {
		this.ingressStatus = ingressStatus;
		return this;
	}

	/**
	 * Get ingressStatus
	 * 
	 * @return ingressStatus
	 **/
	@ApiModelProperty(value = "")
	public EIngressStatus getIngressStatus() {
		return ingressStatus;
	}

	public void setIngressStatus(EIngressStatus ingressStatus) {
		this.ingressStatus = ingressStatus;
	}

	public AccountIngressStatus migrationStatus(EIngressMigrationStatus migrationStatus) {
		this.migrationStatus = migrationStatus;
		return this;
	}

	/**
	 * Get migrationStatus
	 * 
	 * @return migrationStatus
	 **/
	@ApiModelProperty(value = "")
	public EIngressMigrationStatus getMigrationStatus() {
		return migrationStatus;
	}

	public void setMigrationStatus(EIngressMigrationStatus migrationStatus) {
		this.migrationStatus = migrationStatus;
	}

	public AccountIngressStatus problemDetails(List<String> problemDetails) {
		this.problemDetails = problemDetails;
		return this;
	}

	public AccountIngressStatus addProblemDetailsItem(String problemDetailsItem) {
		if (this.problemDetails == null) {
			this.problemDetails = new ArrayList<>();
		}
		this.problemDetails.add(problemDetailsItem);
		return this;
	}

	/**
	 * Ingress configuration and migration issues that arose during the last ingress activation or deactivation process.
	 * 
	 * @return problemDetails
	 **/
	@ApiModelProperty(value = "Ingress configuration and migration issues that arose during the last ingress activation or deactivation process.")
	public List<String> getProblemDetails() {
		return problemDetails;
	}

	public void setProblemDetails(List<String> problemDetails) {
		this.problemDetails = problemDetails;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		AccountIngressStatus accountIngressStatus = (AccountIngressStatus) o;
		return Objects.equals(this.$type, accountIngressStatus.$type) &&
				Objects.equals(this.enabled, accountIngressStatus.enabled) &&
				Objects.equals(this.ingressStatus, accountIngressStatus.ingressStatus) &&
				Objects.equals(this.migrationStatus, accountIngressStatus.migrationStatus) &&
				Objects.equals(this.problemDetails, accountIngressStatus.problemDetails);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, enabled, ingressStatus, migrationStatus, problemDetails);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class AccountIngressStatus {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
		sb.append("    ingressStatus: ").append(toIndentedString(ingressStatus)).append("\n");
		sb.append("    migrationStatus: ").append(toIndentedString(migrationStatus)).append("\n");
		sb.append("    problemDetails: ").append(toIndentedString(problemDetails)).append("\n");
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
