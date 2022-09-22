
package com.unblu.webapi.model.v3;

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
 * Representation of a query paramater for Web API calls
 */
@ApiModel(description = "Representation of a query paramater for Web API calls")

@JsonPropertyOrder({
	QueryParameter.JSON_PROPERTY_$_TYPE,
	QueryParameter.JSON_PROPERTY_DOCUMENTATION,
	QueryParameter.JSON_PROPERTY_NAME,
	QueryParameter.JSON_PROPERTY_TYPE,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class QueryParameter {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		QUERYPARAMETER("QueryParameter");

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
			return TypeEnum.QUERYPARAMETER;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.QUERYPARAMETER;

	public static final String JSON_PROPERTY_DOCUMENTATION = "documentation";
	@JsonProperty(JSON_PROPERTY_DOCUMENTATION)
	private String documentation;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private String type;

	public QueryParameter $type(TypeEnum $type) {
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

	public QueryParameter documentation(String documentation) {
		this.documentation = documentation;
		return this;
	}

	/**
	 * Documentation of the query parameter
	 * 
	 * @return documentation
	 **/
	@ApiModelProperty(value = "Documentation of the query parameter")
	public String getDocumentation() {
		return documentation;
	}

	public void setDocumentation(String documentation) {
		this.documentation = documentation;
	}

	public QueryParameter name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Name of the query parameter
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Name of the query parameter")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public QueryParameter type(String type) {
		this.type = type;
		return this;
	}

	/**
	 * Type of the query parameter
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "Type of the query parameter")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		QueryParameter queryParameter = (QueryParameter) o;
		return Objects.equals(this.$type, queryParameter.$type) &&
				Objects.equals(this.documentation, queryParameter.documentation) &&
				Objects.equals(this.name, queryParameter.name) &&
				Objects.equals(this.type, queryParameter.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, documentation, name, type);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class QueryParameter {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
