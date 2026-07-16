
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
 * Result of archiving a person via the Persons API, such as &#x60;/persons/archiveVirtual&#x60;.
 */
@ApiModel(description = "Result of archiving a person via the Persons API, such as `/persons/archiveVirtual`.")

@JsonPropertyOrder({
	ArchivePersonResult.JSON_PROPERTY_$_TYPE,
	ArchivePersonResult.JSON_PROPERTY_NEWLY_ARCHIVED,
})
@JsonAutoDetect(creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, isGetterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
public class ArchivePersonResult {
	/**
	 * Gets or Sets $type
	 */
	public enum TypeEnum {
		ARCHIVEPERSONRESULT("ArchivePersonResult");

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
			return TypeEnum.ARCHIVEPERSONRESULT;
		}
	}

	public static final String JSON_PROPERTY_$_TYPE = "$_type";
	@JsonProperty(JSON_PROPERTY_$_TYPE)
	private TypeEnum $type = TypeEnum.ARCHIVEPERSONRESULT;

	public static final String JSON_PROPERTY_NEWLY_ARCHIVED = "newlyArchived";
	@JsonProperty(JSON_PROPERTY_NEWLY_ARCHIVED)
	private Boolean newlyArchived;

	public ArchivePersonResult $type(TypeEnum $type) {
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

	public ArchivePersonResult newlyArchived(Boolean newlyArchived) {
		this.newlyArchived = newlyArchived;
		return this;
	}

	/**
	 * &#x60;true&#x60; if this call archived the person; &#x60;false&#x60; if the person was already archived (idempotent re-archive).
	 * 
	 * @return newlyArchived
	 **/
	@ApiModelProperty(value = "`true` if this call archived the person; `false` if the person was already archived (idempotent re-archive).")
	public Boolean isNewlyArchived() {
		return newlyArchived;
	}

	public void setNewlyArchived(Boolean newlyArchived) {
		this.newlyArchived = newlyArchived;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ArchivePersonResult archivePersonResult = (ArchivePersonResult) o;
		return Objects.equals(this.$type, archivePersonResult.$type) &&
				Objects.equals(this.newlyArchived, archivePersonResult.newlyArchived);
	}

	@Override
	public int hashCode() {
		return Objects.hash($type, newlyArchived);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ArchivePersonResult {\n");
		sb.append("    $type: ").append(toIndentedString($type)).append("\n");
		sb.append("    newlyArchived: ").append(toIndentedString(newlyArchived)).append("\n");
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
