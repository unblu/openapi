
package com.unblu.webapi.model.v3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Container for permissions of a user
 */
@ApiModel(description = "Container for permissions of a user")

@JsonPropertyOrder({
	Permissions.JSON_PROPERTY_$_TYPE,
	Permissions.JSON_PROPERTY_ALL_PERMISSIONS,
	Permissions.JSON_PROPERTY_PERMISSIONS,
	Permissions.JSON_PROPERTY_CAPACITIES,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class Permissions {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		PERMISSIONS("Permissions");

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
			return TypeEnum.PERMISSIONS;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.PERMISSIONS;

	public static final String JSON_PROPERTY_ALL_PERMISSIONS = "allPermissions";
	@JsonProperty(JSON_PROPERTY_ALL_PERMISSIONS)
	private Boolean allPermissions;

	public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
	@JsonProperty(JSON_PROPERTY_PERMISSIONS)
	private List<String> permissions = null;

	public static final String JSON_PROPERTY_CAPACITIES = "capacities";
	@JsonProperty(JSON_PROPERTY_CAPACITIES)
	private Map<String, Integer> capacities = null;

	public Permissions $type(TypeEnum $type) {
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

	public Permissions allPermissions(Boolean allPermissions) {
		this.allPermissions = allPermissions;
		return this;
	}

	/**
	 * Flag that indicates that all permissions are granted, ignoring the permissions entries
	 * 
	 * @return allPermissions
	 **/
	@ApiModelProperty(value = "Flag that indicates that all permissions are granted, ignoring the permissions entries")
	public Boolean isAllPermissions() {
		return allPermissions;
	}

	public void setAllPermissions(Boolean allPermissions) {
		this.allPermissions = allPermissions;
	}

	public Permissions permissions(List<String> permissions) {
		this.permissions = permissions;
		return this;
	}

	public Permissions addPermissionsItem(String permissionsItem) {
		if (this.permissions == null) {
			this.permissions = new ArrayList<>();
		}
		this.permissions.add(permissionsItem);
		return this;
	}

	/**
	 * all permissions of the user
	 * 
	 * @return permissions
	 **/
	@ApiModelProperty(value = "all permissions of the user")
	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public Permissions capacities(Map<String, Integer> capacities) {
		this.capacities = capacities;
		return this;
	}

	public Permissions putCapacitiesItem(String key, Integer capacitiesItem) {
		if (this.capacities == null) {
			this.capacities = new HashMap<>();
		}
		this.capacities.put(key, capacitiesItem);
		return this;
	}

	/**
	 * Get capacities
	 * 
	 * @return capacities
	 **/
	@ApiModelProperty(value = "")
	public Map<String, Integer> getCapacities() {
		return capacities;
	}

	public void setCapacities(Map<String, Integer> capacities) {
		this.capacities = capacities;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Permissions permissions = (Permissions) o;
		return Objects.equals(this.$type, permissions.$type) &&
				Objects.equals(this.allPermissions, permissions.allPermissions) &&
				Objects.equals(this.permissions, permissions.permissions) &&
				Objects.equals(this.capacities, permissions.capacities);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, allPermissions, permissions, capacities);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Permissions {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    allPermissions: ").append(toIndentedString(allPermissions)).append("\n");
		sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
		sb.append("    capacities: ").append(toIndentedString(capacities)).append("\n");
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
