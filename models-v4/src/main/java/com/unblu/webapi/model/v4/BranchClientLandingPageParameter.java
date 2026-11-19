
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
 * A parameter that is added to the landing page URL of a Branch client, in its query or its fragment
 */
@ApiModel(description = "A parameter that is added to the landing page URL of a Branch client, in its query or its fragment")

@JsonPropertyOrder({
	BranchClientLandingPageParameter.JSON_PROPERTY_$_TYPE,
	BranchClientLandingPageParameter.JSON_PROPERTY_NAME,
	BranchClientLandingPageParameter.JSON_PROPERTY_VALUE,
	BranchClientLandingPageParameter.JSON_PROPERTY_DESCRIPTION,
	BranchClientLandingPageParameter.JSON_PROPERTY_LOCATION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class BranchClientLandingPageParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		BRANCHCLIENTLANDINGPAGEPARAMETER("BranchClientLandingPageParameter");

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
			return TypeEnum.BRANCHCLIENTLANDINGPAGEPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.BRANCHCLIENTLANDINGPAGEPARAMETER;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_VALUE = "value";
	@JsonProperty(JSON_PROPERTY_VALUE)
	private String value;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public static final String JSON_PROPERTY_LOCATION = "location";
	@JsonProperty(JSON_PROPERTY_LOCATION)
	private EBranchClientLandingPageParameterLocation location;

	public BranchClientLandingPageParameter $type(TypeEnum $type) {
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

	public BranchClientLandingPageParameter name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the parameter. Must be unique among the parameters of the Branch client and must not be one of the parameter names Unblu adds to the URL itself.
	 * Maximum of 100 characters. Mandatory.
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the parameter. Must be unique among the parameters of the Branch client and must not be one of the parameter names Unblu adds to the URL itself. Maximum of 100 characters. Mandatory.")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BranchClientLandingPageParameter value(String value) {
		this.value = value;
		return this;
	}

	/**
	 * Value of the parameter. Maximum of 1000 characters. Optional.
	 * 
	 * @return value
	 **/
	@ApiModelProperty(value = "Value of the parameter. Maximum of 1000 characters. Optional.")
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BranchClientLandingPageParameter description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Description of what the parameter does on the landing page. Maximum of 500 characters. Optional.
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Description of what the parameter does on the landing page. Maximum of 500 characters. Optional.")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BranchClientLandingPageParameter location(EBranchClientLandingPageParameterLocation location) {
		this.location = location;
		return this;
	}

	/**
	 * Get location
	 * 
	 * @return location
	 **/
	@ApiModelProperty(value = "")
	public EBranchClientLandingPageParameterLocation getLocation() {
		return location;
	}

	public void setLocation(EBranchClientLandingPageParameterLocation location) {
		this.location = location;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BranchClientLandingPageParameter branchClientLandingPageParameter = (BranchClientLandingPageParameter) o;
		return Objects.equals(this.$type, branchClientLandingPageParameter.$type) &&
				Objects.equals(this.name, branchClientLandingPageParameter.name) &&
				Objects.equals(this.value, branchClientLandingPageParameter.value) &&
				Objects.equals(this.description, branchClientLandingPageParameter.description) &&
				Objects.equals(this.location, branchClientLandingPageParameter.location);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, name, value, description, location);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class BranchClientLandingPageParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    value: ").append(toIndentedString(value)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
		sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
