
package com.unblu.webapi.model.v3;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

import io.swagger.annotations.ApiModelProperty;

/**
 * NamedAreaTranslation
 */

@JsonPropertyOrder({
	NamedAreaTranslation.JSON_PROPERTY_$_TYPE,
	NamedAreaTranslation.JSON_PROPERTY_ID,
	NamedAreaTranslation.JSON_PROPERTY_NAME,
	NamedAreaTranslation.JSON_PROPERTY_DESCRIPTION,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class NamedAreaTranslation {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		NAMEDAREATRANSLATION("NamedAreaTranslation");

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
			return TypeEnum.NAMEDAREATRANSLATION;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.NAMEDAREATRANSLATION;

	public static final String JSON_PROPERTY_ID = "id";
	@JsonProperty(JSON_PROPERTY_ID)
	private String id;

	public static final String JSON_PROPERTY_NAME = "name";
	@JsonProperty(JSON_PROPERTY_NAME)
	private String name;

	public static final String JSON_PROPERTY_DESCRIPTION = "description";
	@JsonProperty(JSON_PROPERTY_DESCRIPTION)
	private String description;

	public NamedAreaTranslation $type(TypeEnum $type) {
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

	public NamedAreaTranslation id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "Unique id of the entity. When creating an entity this property can be omitted as it will be generated by the server anyway.")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public NamedAreaTranslation name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Translated name of the corresponding name field of the main entity this translation belongs to
	 * 
	 * @return name
	 **/
	@ApiModelProperty(value = "Translated name of the corresponding name field of the main entity this translation belongs to")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NamedAreaTranslation description(String description) {
		this.description = description;
		return this;
	}

	/**
	 * Translated description of the corresponding description field of the main entity this translation belongs to
	 * 
	 * @return description
	 **/
	@ApiModelProperty(value = "Translated description of the corresponding description field of the main entity this translation belongs to")
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		NamedAreaTranslation namedAreaTranslation = (NamedAreaTranslation) o;
		return Objects.equals(this.$type, namedAreaTranslation.$type) &&
				Objects.equals(this.id, namedAreaTranslation.id) &&
				Objects.equals(this.name, namedAreaTranslation.name) &&
				Objects.equals(this.description, namedAreaTranslation.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, id, name, description);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class NamedAreaTranslation {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
