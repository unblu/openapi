
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
 * Definition of a deputy
 */
@ApiModel(description = "Definition of a deputy")

@JsonPropertyOrder({
	DeputyDefinition.JSON_PROPERTY_$_TYPE,
	DeputyDefinition.JSON_PROPERTY_TYPE,
	DeputyDefinition.JSON_PROPERTY_ID,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class DeputyDefinition {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		DEPUTYDEFINITION("DeputyDefinition");

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
			return TypeEnum.DEPUTYDEFINITION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.DEPUTYDEFINITION;

	public static final String JSON_PROPERTY_TYPE = "type";
	@JsonProperty(JSON_PROPERTY_TYPE)
	private EDeputyType type;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public DeputyDefinition $type(TypeEnum $type) {
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

	public DeputyDefinition type(EDeputyType type) {
		this.type = type;
		return this;
	}

	/**
	 * Get type
	 * 
	 * @return type
	 **/
	@ApiModelProperty(value = "")
	public EDeputyType getType() {
		return type;
	}

	public void setType(EDeputyType type) {
		this.type = type;
	}

	public DeputyDefinition id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * The id of the deputy. This is either a user ID, if it is an agent or a team ID if the deputy is a team.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "The id of the deputy. This is either a user ID, if it is an agent or a team ID if the deputy is a team.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		DeputyDefinition deputyDefinition = (DeputyDefinition) o;
		return Objects.equals(this.$type, deputyDefinition.$type) &&
				Objects.equals(this.type, deputyDefinition.type) &&
				Objects.equals(this.id, deputyDefinition.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, type, id);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class DeputyDefinition {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    type: ").append(toIndentedString(type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
