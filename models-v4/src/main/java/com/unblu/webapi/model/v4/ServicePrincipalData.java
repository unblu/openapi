
package com.unblu.webapi.model.v4;

import java.util.ArrayList;
import java.util.List;
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
 * Body to return a service principal via web API
 */
@ApiModel(description = "Body to return a service principal via web API")

@JsonPropertyOrder({
	ServicePrincipalData.JSON_PROPERTY_$_TYPE,
	ServicePrincipalData.JSON_PROPERTY_ID,
	ServicePrincipalData.JSON_PROPERTY_CREATION_TIMESTAMP,
	ServicePrincipalData.JSON_PROPERTY_MODIFICATION_TIMESTAMP,
	ServicePrincipalData.JSON_PROPERTY_NAME,
	ServicePrincipalData.JSON_PROPERTY_DESCRIPTION,
	ServicePrincipalData.JSON_PROPERTY_API_SECRETS,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ServicePrincipalData {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		SERVICEPRINCIPALDATA("ServicePrincipalData");

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
			return TypeEnum.SERVICEPRINCIPALDATA;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.SERVICEPRINCIPALDATA;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_CREATION_TIMESTAMP = "creationTimestamp";
	@JsonProperty(JSON_PROPERTY_CREATION_TIMESTAMP)
	private Long creationTimestamp;

	public static final String JSON_PROPERTY_MODIFICATION_TIMESTAMP = "modificationTimestamp";
	@JsonProperty(JSON_PROPERTY_MODIFICATION_TIMESTAMP)
	private Long modificationTimestamp;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_API_SECRETS = "apiSecrets";
	@JsonProperty(JSON_PROPERTY_API_SECRETS)
	private List<ApiSecretData> apiSecrets = null;

	public ServicePrincipalData $type(TypeEnum $type) {
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

	public ServicePrincipalData id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * ID of the Service Principal
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "ID of the Service Principal")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ServicePrincipalData creationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
		return this;
	}

	/**
	 * Timestamp when the service principal was created, defined when the service principal is first stored in Unblu. Any value you include when creating a service
	 * principal is ignored and can therefore be omitted then. If you set the timestamp, Unblu returns the same value but doesn&#39;t store it
	 * 
	 * @return creationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the service principal was created, defined when the service principal is first stored in Unblu. Any value you include when creating a service principal is ignored and can therefore be omitted then. If you set the timestamp, Unblu returns the same value but doesn't store it")
	public Long getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(Long creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public ServicePrincipalData modificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
		return this;
	}

	/**
	 * Timestamp when the service principal was last modified. This property is for information purposes only and can be omitted when sending data to Unblu. If
	 * included it is ignored. If you set the timestamp, Unblu returns the same value but doesn&#39;t store it.
	 * 
	 * @return modificationTimestamp
	 **/
	@ApiModelProperty(value = "Timestamp when the service principal was last modified. This property is for information purposes only and can be omitted when sending data to Unblu. If included it is ignored. If you set the timestamp, Unblu returns the same value but doesn't store it.")
	public Long getModificationTimestamp() {
		return modificationTimestamp;
	}

	public void setModificationTimestamp(Long modificationTimestamp) {
		this.modificationTimestamp = modificationTimestamp;
	}

	public ServicePrincipalData name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the service principal
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the service principal")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ServicePrincipalData description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of the service principal
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of the service principal")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ServicePrincipalData apiSecrets(List<ApiSecretData> apiSecrets) {
		this.apiSecrets = apiSecrets;
		return this;
	}

	public ServicePrincipalData addApiSecretsItem(ApiSecretData apiSecretsItem) {
		if (this.apiSecrets == null) {
			this.apiSecrets = new ArrayList<>();
		}
		this.apiSecrets.add(apiSecretsItem);
		return this;
	}

	/**
	 * Array of API secrets belonging to the service principal. If the service principal doesn&#39;t have any secrets the array is empty. Secrets that are expired
	 * will also be included in the array and won&#39;t be deleted right away if they expire.
	 * 
	 * @return apiSecrets
	 **/
	@ApiModelProperty(value = "Array of API secrets belonging to the service principal. If the service principal doesn't have any secrets the array is empty. Secrets that are expired will also be included in the array and won't be deleted right away if they expire.")
	public List<ApiSecretData> getApiSecrets() {
		return apiSecrets;
	}

	public void setApiSecrets(List<ApiSecretData> apiSecrets) {
		this.apiSecrets = apiSecrets;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ServicePrincipalData servicePrincipalData = (ServicePrincipalData) o;
		return Objects.equals(this.$type, servicePrincipalData.$type) &&
				Objects.equals(this.id, servicePrincipalData.id) &&
				Objects.equals(this.creationTimestamp, servicePrincipalData.creationTimestamp) &&
				Objects.equals(this.modificationTimestamp, servicePrincipalData.modificationTimestamp) &&
				Objects.equals(this.name, servicePrincipalData.name) &&
				Objects.equals(this.description, servicePrincipalData.description) &&
				Objects.equals(this.apiSecrets, servicePrincipalData.apiSecrets);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, creationTimestamp, modificationTimestamp, name, description, apiSecrets);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ServicePrincipalData {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
		sb.append("    modificationTimestamp: ").append(toIndentedString(modificationTimestamp)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    apiSecrets: ").append(toIndentedString(apiSecrets)).append("\n");
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
